package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Pair;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.SQLite.SQLitePreparedStatement$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.StoriesController;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public class FileRefController extends BaseController {
    private static volatile FileRefController[] Instance = new FileRefController[4];
    private ArrayList<Waiter> favStickersWaiter;
    private long lastCleanupTime;
    private HashMap<String, ArrayList<Requester>> locationRequester;
    private HashMap<TLObject, Object[]> multiMediaCache;
    private HashMap<String, ArrayList<Requester>> parentRequester;
    private ArrayList<Waiter> recentStickersWaiter;
    private HashMap<String, CachedResult> responseCache;
    private ArrayList<Waiter> savedGifsWaiters;
    private ArrayList<Waiter> wallpaperWaiters;

    public static class CachedResult {
        private long firstQueryTime;
        private TLObject response;

        private CachedResult() {
        }
    }

    public static class Requester {
        private Object[] args;
        private boolean completed;
        private TLRPC.InputFileLocation location;
        private String locationKey;

        private Requester() {
        }
    }

    public static class Waiter {
        private String locationKey;
        private String parentKey;

        public Waiter(String str, String str2) {
            this.locationKey = str;
            this.parentKey = str2;
        }
    }

    public FileRefController(int i) {
        super(i);
        this.locationRequester = new HashMap<>();
        this.parentRequester = new HashMap<>();
        this.responseCache = new HashMap<>();
        this.multiMediaCache = new HashMap<>();
        this.lastCleanupTime = SystemClock.elapsedRealtime();
        this.wallpaperWaiters = new ArrayList<>();
        this.savedGifsWaiters = new ArrayList<>();
        this.recentStickersWaiter = new ArrayList<>();
        this.favStickersWaiter = new ArrayList<>();
    }

    private void broadcastWaitersData(ArrayList<Waiter> arrayList, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Waiter waiter = arrayList.get(i);
            onRequestComplete(waiter.locationKey, waiter.parentKey, tLObject, tL_error, i == size + (-1), false);
            i++;
        }
        arrayList.clear();
    }

    private void cleanupCache() {
        if (Math.abs(SystemClock.elapsedRealtime() - this.lastCleanupTime) < 600000) {
            return;
        }
        this.lastCleanupTime = SystemClock.elapsedRealtime();
        ArrayList arrayList = null;
        for (Map.Entry<String, CachedResult> entry : this.responseCache.entrySet()) {
            if (Math.abs(System.currentTimeMillis() - entry.getValue().firstQueryTime) >= 60000) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(entry.getKey());
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.responseCache.remove(arrayList.get(i));
            }
        }
    }

    private CachedResult getCachedResponse(String str) {
        CachedResult cachedResult = this.responseCache.get(str);
        if (cachedResult == null || Math.abs(System.currentTimeMillis() - cachedResult.firstQueryTime) < 60000) {
            return cachedResult;
        }
        this.responseCache.remove(str);
        return null;
    }

    public static int getFileRefErrorIndex(String str) {
        if (str != null && str.startsWith("FILE_REFERENCE_") && str.endsWith("_EXPIRED")) {
            try {
                return Integer.parseInt(str.substring(15, str.length() - 8));
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    private byte[] getFileReference(TLRPC.Document document, ArrayList<TLRPC.Document> arrayList, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        if (document != null && inputFileLocation != null) {
            int i = 0;
            if (!(inputFileLocation instanceof TLRPC.TL_inputDocumentFileLocation)) {
                int size = document.thumbs.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.PhotoSize photoSize = document.thumbs.get(i2);
                    byte[] fileReference = getFileReference(photoSize, inputFileLocation, zArr);
                    if (zArr != null && zArr[0]) {
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                        inputFileLocationArr[0] = tL_inputDocumentFileLocation;
                        tL_inputDocumentFileLocation.id = document.id;
                        tL_inputDocumentFileLocation.volume_id = inputFileLocation.volume_id;
                        tL_inputDocumentFileLocation.local_id = inputFileLocation.local_id;
                        tL_inputDocumentFileLocation.access_hash = document.access_hash;
                        byte[] bArr = document.file_reference;
                        tL_inputDocumentFileLocation.file_reference = bArr;
                        tL_inputDocumentFileLocation.thumb_size = photoSize.type;
                        return bArr;
                    }
                    if (fileReference != null) {
                        return fileReference;
                    }
                }
            } else if (document.id == inputFileLocation.id) {
                return document.file_reference;
            }
            if (arrayList != null) {
                while (i < arrayList.size()) {
                    TLRPC.InputFileLocation inputFileLocation2 = inputFileLocation;
                    boolean[] zArr2 = zArr;
                    TLRPC.InputFileLocation[] inputFileLocationArr2 = inputFileLocationArr;
                    byte[] fileReference2 = getFileReference(arrayList.get(i), null, inputFileLocation2, zArr2, inputFileLocationArr2);
                    if (fileReference2 != null) {
                        return fileReference2;
                    }
                    i++;
                    inputFileLocation = inputFileLocation2;
                    zArr = zArr2;
                    inputFileLocationArr = inputFileLocationArr2;
                }
            }
        }
        return null;
    }

    private byte[] getFileReferenceForMediaImpl(TLRPC.MessageMedia messageMedia, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.InputFileLocation inputFileLocation2;
        boolean[] zArr2;
        TLRPC.InputFileLocation[] inputFileLocationArr2;
        TLRPC.Photo photo;
        byte[] fileReference = null;
        if (messageMedia == null) {
            return null;
        }
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            inputFileLocation2 = inputFileLocation;
            zArr2 = zArr;
            inputFileLocationArr2 = inputFileLocationArr;
            fileReference = getFileReference(document, messageMedia.alt_documents, inputFileLocation2, zArr2, inputFileLocationArr2);
        } else {
            inputFileLocation2 = inputFileLocation;
            zArr2 = zArr;
            inputFileLocationArr2 = inputFileLocationArr;
            TLRPC.TL_game tL_game = messageMedia.game;
            if (tL_game != null) {
                fileReference = getFileReference(tL_game.document, null, inputFileLocation2, zArr2, inputFileLocationArr2);
                if (fileReference == null) {
                    fileReference = getFileReference(messageMedia.game.photo, inputFileLocation2, zArr2, inputFileLocationArr2);
                }
            } else {
                TLRPC.Photo photo2 = messageMedia.photo;
                if (photo2 != null) {
                    fileReference = getFileReference(photo2, inputFileLocation2, zArr2, inputFileLocationArr2);
                } else {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (webPage != null) {
                        fileReference = getFileReference(webPage, inputFileLocation2, zArr2, inputFileLocationArr2);
                    }
                }
            }
        }
        return (fileReference != null || (photo = messageMedia.video_cover) == null) ? fileReference : getFileReference(photo, inputFileLocation2, zArr2, inputFileLocationArr2);
    }

    private byte[] getFileReferenceForPoll(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        ArrayList<TLRPC.PollAnswer> arrayList;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia;
        if (tL_messageMediaPoll == null) {
            return null;
        }
        byte[] fileReferenceForMediaImpl = getFileReferenceForMediaImpl(tL_messageMediaPoll.attached_media, inputFileLocation, zArr, inputFileLocationArr);
        if (fileReferenceForMediaImpl == null && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia = pollResults.solution_media) != null) {
            fileReferenceForMediaImpl = getFileReferenceForMediaImpl(messageMedia, inputFileLocation, zArr, inputFileLocationArr);
        }
        if (fileReferenceForMediaImpl == null && (arrayList = tL_messageMediaPoll.poll.answers) != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.PollAnswer pollAnswer = arrayList.get(i);
                i++;
                fileReferenceForMediaImpl = getFileReferenceForMediaImpl(pollAnswer.media, inputFileLocation, zArr, inputFileLocationArr);
                if (fileReferenceForMediaImpl != null) {
                    break;
                }
            }
        }
        return fileReferenceForMediaImpl;
    }

    private byte[] getFileReferenceForRichMessage(TL_iv.RichMessage richMessage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        byte[] fileReference = null;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            TLRPC.Photo photo = arrayList.get(i2);
            i2++;
            fileReference = getFileReference(photo, inputFileLocation, zArr, inputFileLocationArr);
            if (fileReference != null) {
                return fileReference;
            }
        }
        ArrayList<TLRPC.Document> arrayList2 = richMessage.documents;
        int size2 = arrayList2.size();
        while (i < size2) {
            TLRPC.Document document = arrayList2.get(i);
            i++;
            TLRPC.InputFileLocation inputFileLocation2 = inputFileLocation;
            boolean[] zArr2 = zArr;
            TLRPC.InputFileLocation[] inputFileLocationArr2 = inputFileLocationArr;
            fileReference = getFileReference(document, null, inputFileLocation2, zArr2, inputFileLocationArr2);
            if (fileReference != null) {
                return fileReference;
            }
            inputFileLocation = inputFileLocation2;
            zArr = zArr2;
            inputFileLocationArr = inputFileLocationArr2;
        }
        return fileReference;
    }

    private Pair<byte[], TLRPC.InputFileLocation> getFileReferenceFromResponse(TLRPC.InputFileLocation inputFileLocation, String str, String str2, TLObject tLObject, Object... objArr) throws FileNotFoundException {
        TLRPC.InputFileLocation[] inputFileLocationArr;
        boolean[] zArr;
        TLObject tLObject2;
        byte[] fileReference;
        FileRefController fileRefController;
        TLRPC.InputFileLocation inputFileLocation2;
        TLRPC.InputFileLocation[] inputFileLocationArr2;
        boolean[] zArr2;
        TLRPC.InputFileLocation inputFileLocation3;
        TLRPC.InputFileLocation inputFileLocation4;
        FileRefController fileRefController2;
        TL_stories.TL_stories_stories tL_stories_stories;
        TL_stories.StoryItem storyItem;
        Object obj;
        Object obj2;
        TL_stories.StoryItem storyItem2;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.photos_Photos photos_photos;
        int size;
        int i;
        TLRPC.TL_messages_favedStickers tL_messages_favedStickers;
        int size2;
        int i2;
        boolean[] zArr3;
        byte[] fileReference2;
        TLRPC.TL_messages_recentStickers tL_messages_recentStickers;
        int size3;
        int i3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int size4;
        int i4;
        TLRPC.TL_messages_savedGifs tL_messages_savedGifs;
        int size5;
        int i5;
        TLRPC.TL_messages_chats tL_messages_chats;
        int size6;
        int i6;
        Vector vector;
        int size7;
        int i7;
        Object obj3;
        FileRefController fileRefController3;
        byte[] fileReference3;
        TL_account.TL_wallPapers tL_wallPapers;
        int size8;
        int i8;
        TLRPC.TL_help_appUpdate tL_help_appUpdate;
        boolean[] zArr4;
        TLRPC.Document document2;
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList;
        int size9;
        int i9;
        int i10;
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        TLRPC.InputFileLocation inputFileLocation5;
        ArrayList<TLRPC.TL_availableReaction> arrayList2;
        int size10;
        int i11;
        int i12;
        TLRPC.TL_availableReaction tL_availableReaction;
        boolean[] zArr5;
        ArrayList<TLRPC.Document> arrayList3;
        int size11;
        int i13;
        int i14;
        TLRPC.messages_Messages messages_messages;
        int size12;
        int i15;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia3;
        TL_iv.RichMessage richMessage;
        TLRPC.MessageAction messageAction;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i16;
        TLRPC.MessageExtendedMedia messageExtendedMedia;
        TLRPC.InputFileLocation inputFileLocation6;
        TLRPC.MessageMedia messageMedia4;
        TLRPC.Document document3;
        boolean[] zArr6;
        TLRPC.Photo photo3;
        TLRPC.InputFileLocation inputFileLocation7 = null;
        if ((inputFileLocation instanceof TLRPC.TL_inputFileLocation) || (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
            inputFileLocationArr = new TLRPC.InputFileLocation[1];
            zArr = new boolean[1];
        } else {
            inputFileLocationArr = null;
            zArr = null;
        }
        if (str2 != null) {
            tLObject2 = tLObject;
            Pair<byte[], TLRPC.InputFileLocation> fileReferenceFromResponse = getFileReferenceFromResponse(inputFileLocation, str, null, tLObject2, objArr);
            if (fileReferenceFromResponse != null) {
                fileReference = (byte[]) fileReferenceFromResponse.first;
                Object obj4 = fileReferenceFromResponse.second;
                if (obj4 != null && inputFileLocationArr != null) {
                    inputFileLocationArr[0] = (TLRPC.InputFileLocation) obj4;
                }
            }
            if (tLObject2 instanceof StoriesController.BotPreview) {
                messageMedia4 = ((StoriesController.BotPreview) tLObject2).media;
                document3 = messageMedia4.document;
                if (document3 != null) {
                    fileReference3 = getFileReference(document3, messageMedia4.alt_documents, inputFileLocation, zArr, inputFileLocationArr);
                    fileReference = fileReference3;
                } else {
                    fileRefController = this;
                    inputFileLocationArr2 = inputFileLocationArr;
                    zArr6 = zArr;
                    photo3 = messageMedia4.photo;
                    if (photo3 != null) {
                        fileReference = fileRefController.getFileReference(photo3, inputFileLocation, zArr6, inputFileLocationArr2);
                    }
                    zArr2 = zArr2;
                    inputFileLocationArr = inputFileLocationArr2;
                }
            } else {
                fileRefController = this;
                inputFileLocation2 = inputFileLocation;
                inputFileLocationArr2 = inputFileLocationArr;
                zArr2 = zArr;
                if (tLObject2 instanceof TLRPC.messages_Messages) {
                    messages_messages = (TLRPC.messages_Messages) tLObject2;
                    if (!messages_messages.messages.isEmpty()) {
                        size12 = messages_messages.messages.size();
                        for (i15 = 0; i15 < size12; i15++) {
                            message = messages_messages.messages.get(i15);
                            messageMedia3 = message.media;
                            if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                                for (i16 = 0; i16 < tL_messageMediaPaidMedia.extended_media.size(); i16++) {
                                    messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i16);
                                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                        fileReference = fileRefController.getFileReferenceForMediaImpl(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, inputFileLocation2, zArr2, inputFileLocationArr2);
                                    }
                                    if (fileReference != null) {
                                        break;
                                    }
                                }
                            } else {
                                richMessage = message.rich_message;
                                if (richMessage != null) {
                                    fileReference = fileRefController.getFileReferenceForRichMessage(richMessage, inputFileLocation2, zArr2, inputFileLocationArr2);
                                } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                    fileReference = fileRefController.getFileReferenceForPoll((TLRPC.TL_messageMediaPoll) messageMedia3, inputFileLocation2, zArr2, inputFileLocationArr2);
                                } else if (messageMedia3 != null) {
                                    fileReference = fileRefController.getFileReferenceForMediaImpl(messageMedia3, inputFileLocation2, zArr2, inputFileLocationArr2);
                                } else {
                                    messageAction = message.action;
                                    if ((messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto)) {
                                        fileReference = fileRefController.getFileReference(messageAction.photo, inputFileLocation2, zArr2, inputFileLocationArr2);
                                    }
                                }
                            }
                        }
                        if (fileReference == null) {
                            fileRefController.getMessagesStorage().replaceMessageIfExists(messages_messages.messages.get(0), messages_messages.users, messages_messages.chats, true);
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d("file ref not found in messages, replacing message");
                            }
                        }
                    } else if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("empty messages, file ref not found");
                    }
                } else {
                    if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                        arrayList3 = ((TLRPC.TL_help_premiumPromo) tLObject2).videos;
                        size11 = arrayList3.size();
                        i13 = 0;
                        while (true) {
                            if (i13 < size11) {
                                i14 = i13 + 1;
                                TLRPC.Document document4 = arrayList3.get(i13);
                                boolean[] zArr7 = zArr2;
                                fileReference2 = fileRefController.getFileReference(document4, null, inputFileLocation2, zArr7, inputFileLocationArr2);
                                zArr2 = zArr7;
                                if (fileReference2 != null) {
                                    fileReference = fileReference2;
                                } else {
                                    inputFileLocation2 = inputFileLocation;
                                    fileReference = fileReference2;
                                    i13 = i14;
                                    fileRefController = this;
                                }
                            }
                        }
                    } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                        TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                        getMediaDataController().processLoadedReactions(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), false);
                        arrayList2 = tL_messages_availableReactions.reactions;
                        size10 = arrayList2.size();
                        i11 = 0;
                        while (true) {
                            if (i11 < size10) {
                                i12 = i11 + 1;
                                tL_availableReaction = arrayList2.get(i11);
                                zArr5 = zArr2;
                                fileReference2 = getFileReference(tL_availableReaction.static_icon, null, inputFileLocation, zArr5, inputFileLocationArr2);
                                if (fileReference2 == null && (fileReference2 = getFileReference(tL_availableReaction.appear_animation, null, inputFileLocation, zArr5, inputFileLocationArr2)) == null && (fileReference2 = getFileReference(tL_availableReaction.select_animation, null, inputFileLocation, zArr5, inputFileLocationArr2)) == null && (fileReference2 = getFileReference(tL_availableReaction.activate_animation, null, inputFileLocation, zArr5, inputFileLocationArr2)) == null && (fileReference2 = getFileReference(tL_availableReaction.effect_animation, null, inputFileLocation, zArr5, inputFileLocationArr2)) == null && (fileReference2 = getFileReference(tL_availableReaction.around_animation, null, inputFileLocation, zArr5, inputFileLocationArr2)) == null) {
                                    fileReference2 = getFileReference(tL_availableReaction.center_icon, null, inputFileLocation, zArr5, inputFileLocationArr2);
                                    zArr2 = zArr5;
                                    if (fileReference2 != null) {
                                        fileReference = fileReference2;
                                        i11 = i12;
                                    }
                                }
                                fileReference = fileReference2;
                            }
                        }
                    } else if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                        getMessagesController().putUsers(tL_users_userFull.users, false);
                        getMessagesController().putChats(tL_users_userFull.chats, false);
                        userFull = tL_users_userFull.full_user;
                        botInfo = userFull.bot_info;
                        if (botInfo != null) {
                            getMessagesStorage().updateUserInfo(userFull, true);
                            if (fileReference == null) {
                                inputFileLocation5 = inputFileLocation;
                                fileRefController = this;
                                fileReference = getFileReference(botInfo.description_document, null, inputFileLocation5, zArr2, inputFileLocationArr2);
                            } else {
                                fileRefController = this;
                                inputFileLocation5 = inputFileLocation;
                            }
                            if (fileReference == null) {
                                zArr2 = zArr2;
                                fileReference = fileRefController.getFileReference(botInfo.description_photo, inputFileLocation5, zArr2, inputFileLocationArr2);
                            }
                        }
                    } else if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                        arrayList = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot.icons;
                        size9 = arrayList.size();
                        i9 = 0;
                        while (true) {
                            if (i9 < size9) {
                                i10 = i9 + 1;
                                TLRPC.Document document5 = arrayList.get(i9).icon;
                                boolean[] zArr8 = zArr2;
                                fileReference2 = getFileReference(document5, null, inputFileLocation, zArr8, inputFileLocationArr2);
                                zArr2 = zArr8;
                                if (fileReference2 != null) {
                                    fileReference = fileReference2;
                                } else {
                                    fileReference = fileReference2;
                                    i9 = i10;
                                }
                            }
                        }
                    } else if (tLObject2 instanceof TLRPC.TL_help_appUpdate) {
                        tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject2;
                        try {
                            SharedConfig.pendingAppUpdate = tL_help_appUpdate;
                            SharedConfig.saveConfig();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        try {
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                        try {
                            document2 = tL_help_appUpdate.document;
                            if (document2 != null) {
                                fileReference = document2.file_reference;
                                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                                TLRPC.Document document6 = tL_help_appUpdate.document;
                                tL_inputDocumentFileLocation.id = document6.id;
                                tL_inputDocumentFileLocation.access_hash = document6.access_hash;
                                tL_inputDocumentFileLocation.file_reference = document6.file_reference;
                                tL_inputDocumentFileLocation.thumb_size = "";
                                inputFileLocationArr2 = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation};
                            }
                        } catch (Exception e3) {
                            FileLog.e(e3);
                            fileReference = null;
                        }
                        if (fileReference == null) {
                            zArr4 = zArr2;
                            fileReference = getFileReference(tL_help_appUpdate.document, null, inputFileLocation, zArr4, inputFileLocationArr2);
                        } else {
                            zArr4 = zArr2;
                        }
                        if (fileReference == null) {
                            fileRefController3 = this;
                            fileReference3 = fileRefController3.getFileReference(tL_help_appUpdate.sticker, null, inputFileLocation, zArr4, inputFileLocationArr2);
                            inputFileLocationArr = inputFileLocationArr2;
                            fileReference = fileReference3;
                        }
                    } else {
                        fileRefController = this;
                        inputFileLocation3 = inputFileLocation;
                        if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                            fileRefController.getMessagesController().putChats(tL_messages_webPage.chats, false);
                            fileRefController.getMessagesController().putUsers(tL_messages_webPage.users, false);
                            fileReference = fileRefController.getFileReference(tL_messages_webPage.webpage, inputFileLocation3, zArr2, inputFileLocationArr2);
                        } else if (tLObject2 instanceof TLRPC.WebPage) {
                            fileReference = fileRefController.getFileReference((TLRPC.WebPage) tLObject2, inputFileLocation3, zArr2, inputFileLocationArr2);
                        } else if (tLObject2 instanceof TL_account.TL_wallPapers) {
                            tL_wallPapers = (TL_account.TL_wallPapers) tLObject2;
                            size8 = tL_wallPapers.wallpapers.size();
                            i8 = 0;
                            while (true) {
                                if (i8 < size8) {
                                    boolean[] zArr9 = zArr2;
                                    fileReference2 = fileRefController.getFileReference(tL_wallPapers.wallpapers.get(i8).document, null, inputFileLocation3, zArr9, inputFileLocationArr2);
                                    zArr2 = zArr9;
                                    if (fileReference2 != null) {
                                        fileReference = fileReference2;
                                    } else {
                                        i8++;
                                        inputFileLocation3 = inputFileLocation;
                                        fileReference = fileReference2;
                                        fileRefController = this;
                                    }
                                }
                            }
                        } else if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                            fileReference = getFileReference(((TLRPC.TL_wallPaper) tLObject2).document, null, inputFileLocation, zArr2, inputFileLocationArr2);
                        } else if (tLObject2 instanceof TLRPC.TL_theme) {
                            fileRefController3 = this;
                            fileReference3 = fileRefController3.getFileReference(((TLRPC.TL_theme) tLObject2).document, null, inputFileLocation, zArr2, inputFileLocationArr2);
                            inputFileLocationArr = inputFileLocationArr2;
                            fileReference = fileReference3;
                        } else {
                            fileRefController = this;
                            inputFileLocation4 = inputFileLocation;
                            if (tLObject2 instanceof Vector) {
                                vector = (Vector) tLObject2;
                                if (!vector.objects.isEmpty()) {
                                    size7 = vector.objects.size();
                                    for (i7 = 0; i7 < size7; i7++) {
                                        obj3 = vector.objects.get(i7);
                                        if (obj3 instanceof TLRPC.User) {
                                            fileReference = fileRefController.getFileReference((TLRPC.User) obj3, inputFileLocation4, zArr2, inputFileLocationArr2);
                                        } else if (obj3 instanceof TLRPC.Chat) {
                                            fileReference = fileRefController.getFileReference((TLRPC.Chat) obj3, inputFileLocation4, zArr2, inputFileLocationArr2);
                                        }
                                        if (fileReference != null) {
                                            break;
                                        }
                                    }
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                if (!tL_messages_chats.chats.isEmpty()) {
                                    size6 = tL_messages_chats.chats.size();
                                    for (i6 = 0; i6 < size6; i6++) {
                                        fileReference = fileRefController.getFileReference(tL_messages_chats.chats.get(i6), inputFileLocation4, zArr2, inputFileLocationArr2);
                                        if (fileReference != null) {
                                            break;
                                        }
                                    }
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_savedGifs) {
                                tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject2;
                                size5 = tL_messages_savedGifs.gifs.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size5) {
                                        boolean[] zArr10 = zArr2;
                                        fileReference2 = fileRefController.getFileReference(tL_messages_savedGifs.gifs.get(i5), null, inputFileLocation4, zArr10, inputFileLocationArr2);
                                        zArr2 = zArr10;
                                        if (fileReference2 != null) {
                                            fileReference = fileReference2;
                                        } else {
                                            i5++;
                                            inputFileLocation4 = inputFileLocation;
                                            fileReference = fileReference2;
                                            fileRefController = this;
                                        }
                                    }
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                if (fileReference == null) {
                                    size4 = tL_messages_stickerSet.documents.size();
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < size4) {
                                            boolean[] zArr11 = zArr2;
                                            fileReference2 = getFileReference(tL_messages_stickerSet.documents.get(i4), null, inputFileLocation, zArr11, inputFileLocationArr2);
                                            zArr2 = zArr11;
                                            if (fileReference2 != null) {
                                                fileReference = fileReference2;
                                            } else {
                                                i4++;
                                                fileReference = fileReference2;
                                            }
                                        }
                                    }
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_recentStickers) {
                                tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject2;
                                size3 = tL_messages_recentStickers.stickers.size();
                                i3 = 0;
                                while (true) {
                                    if (i3 < size3) {
                                        boolean[] zArr12 = zArr2;
                                        fileReference2 = getFileReference(tL_messages_recentStickers.stickers.get(i3), null, inputFileLocation, zArr12, inputFileLocationArr2);
                                        zArr2 = zArr12;
                                        if (fileReference2 != null) {
                                            fileReference = fileReference2;
                                        } else {
                                            i3++;
                                            fileReference = fileReference2;
                                        }
                                    }
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_favedStickers) {
                                tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject2;
                                size2 = tL_messages_favedStickers.stickers.size();
                                i2 = 0;
                                while (true) {
                                    if (i2 >= size2) {
                                        zArr3 = zArr2;
                                        fileReference2 = getFileReference(tL_messages_favedStickers.stickers.get(i2), null, inputFileLocation, zArr3, inputFileLocationArr2);
                                        if (fileReference2 != null) {
                                            fileReference = fileReference2;
                                        } else {
                                            i2++;
                                            fileReference = fileReference2;
                                            zArr2 = zArr3;
                                        }
                                    }
                                }
                            } else {
                                fileRefController2 = this;
                                if (tLObject2 instanceof TLRPC.photos_Photos) {
                                    photos_photos = (TLRPC.photos_Photos) tLObject2;
                                    size = photos_photos.photos.size();
                                    for (i = 0; i < size; i++) {
                                        fileReference = fileRefController2.getFileReference(photos_photos.photos.get(i), inputFileLocation, zArr2, inputFileLocationArr2);
                                        if (fileReference != null) {
                                            break;
                                        }
                                    }
                                } else if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                                    tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                                    if (!tL_stories_stories.stories.isEmpty() || (messageMedia = (storyItem = tL_stories_stories.stories.get(0)).media) == null) {
                                        storyItem = null;
                                    } else {
                                        if (fileReference == null && (photo2 = messageMedia.photo) != null) {
                                            fileReference = fileRefController2.getFileReference(photo2, inputFileLocation, zArr2, inputFileLocationArr2);
                                        }
                                        if (fileReference == null && (photo = storyItem.media.video_cover) != null) {
                                            fileReference = fileRefController2.getFileReference(photo, inputFileLocation, zArr2, inputFileLocationArr2);
                                        }
                                        if (fileReference == null && (document = (messageMedia2 = storyItem.media).document) != null) {
                                            byte[] fileReference4 = fileRefController2.getFileReference(document, messageMedia2.alt_documents, inputFileLocation, zArr2, inputFileLocationArr2);
                                            fileRefController2 = fileRefController2;
                                            fileReference = fileReference4;
                                        }
                                    }
                                    obj = objArr[1];
                                    if (obj instanceof FileLoadOperation) {
                                        obj2 = ((FileLoadOperation) obj).parentObject;
                                        if (obj2 instanceof TL_stories.StoryItem) {
                                            storyItem2 = (TL_stories.StoryItem) obj2;
                                            if (storyItem == null) {
                                                TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                                                tL_updateStory.peer = fileRefController2.getMessagesController().getPeer(storyItem2.dialogId);
                                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                                tL_updateStory.story = tL_storyItemDeleted;
                                                tL_storyItemDeleted.id = storyItem2.id;
                                                ArrayList<TLRPC.Update> arrayList4 = new ArrayList<>();
                                                arrayList4.add(tL_updateStory);
                                                fileRefController2.getMessagesController().processUpdateArray(arrayList4, null, null, false, 0);
                                            } else {
                                                user = fileRefController2.getMessagesController().getUser(Long.valueOf(storyItem2.dialogId));
                                                if (user != null && user.contact) {
                                                    MessagesController.getInstance(fileRefController2.currentAccount).getStoriesController().storiesStorage.updateStoryItem(storyItem2.dialogId, storyItem);
                                                }
                                            }
                                            if (storyItem != null && fileReference == null) {
                                                TL_stories.TL_updateStory tL_updateStory2 = new TL_stories.TL_updateStory();
                                                tL_updateStory2.peer = MessagesController.getInstance(fileRefController2.currentAccount).getPeer(storyItem2.dialogId);
                                                tL_updateStory2.story = storyItem;
                                                ArrayList<TLRPC.Update> arrayList5 = new ArrayList<>();
                                                arrayList5.add(tL_updateStory2);
                                                MessagesController.getInstance(fileRefController2.currentAccount).processUpdateArray(arrayList5, null, null, false, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    inputFileLocationArr = inputFileLocationArr2;
                }
                zArr2 = zArr2;
                inputFileLocationArr = inputFileLocationArr2;
            }
            if (fileReference == null) {
                return null;
            }
            if (inputFileLocationArr != null && (inputFileLocation6 = inputFileLocationArr[0]) != null) {
                inputFileLocation7 = inputFileLocation6;
            }
            return new Pair<>(fileReference, inputFileLocation7);
        }
        tLObject2 = tLObject;
        fileReference = null;
        if (tLObject2 instanceof StoriesController.BotPreview) {
            messageMedia4 = ((StoriesController.BotPreview) tLObject2).media;
            document3 = messageMedia4.document;
            if (document3 != null) {
                fileReference3 = getFileReference(document3, messageMedia4.alt_documents, inputFileLocation, zArr, inputFileLocationArr);
                fileReference = fileReference3;
            } else {
                fileRefController = this;
                inputFileLocationArr2 = inputFileLocationArr;
                zArr6 = zArr;
                photo3 = messageMedia4.photo;
                if (photo3 != null) {
                    fileReference = fileRefController.getFileReference(photo3, inputFileLocation, zArr6, inputFileLocationArr2);
                }
                zArr2 = zArr2;
                inputFileLocationArr = inputFileLocationArr2;
            }
        } else {
            fileRefController = this;
            inputFileLocation2 = inputFileLocation;
            inputFileLocationArr2 = inputFileLocationArr;
            zArr2 = zArr;
            if (tLObject2 instanceof TLRPC.messages_Messages) {
                messages_messages = (TLRPC.messages_Messages) tLObject2;
                if (!messages_messages.messages.isEmpty()) {
                    size12 = messages_messages.messages.size();
                    while (i15 < size12) {
                        message = messages_messages.messages.get(i15);
                        messageMedia3 = message.media;
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                            tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                            while (i16 < tL_messageMediaPaidMedia.extended_media.size()) {
                                messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i16);
                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                    fileReference = fileRefController.getFileReferenceForMediaImpl(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, inputFileLocation2, zArr2, inputFileLocationArr2);
                                }
                                if (fileReference != null) {
                                    break;
                                    break;
                                }
                            }
                        } else {
                            richMessage = message.rich_message;
                            if (richMessage != null) {
                                fileReference = fileRefController.getFileReferenceForRichMessage(richMessage, inputFileLocation2, zArr2, inputFileLocationArr2);
                            } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                fileReference = fileRefController.getFileReferenceForPoll((TLRPC.TL_messageMediaPoll) messageMedia3, inputFileLocation2, zArr2, inputFileLocationArr2);
                            } else if (messageMedia3 != null) {
                                fileReference = fileRefController.getFileReferenceForMediaImpl(messageMedia3, inputFileLocation2, zArr2, inputFileLocationArr2);
                            } else {
                                messageAction = message.action;
                                if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                    fileReference = fileRefController.getFileReference(messageAction.photo, inputFileLocation2, zArr2, inputFileLocationArr2);
                                } else {
                                    fileReference = fileRefController.getFileReference(messageAction.photo, inputFileLocation2, zArr2, inputFileLocationArr2);
                                }
                            }
                        }
                    }
                    if (fileReference == null) {
                        fileRefController.getMessagesStorage().replaceMessageIfExists(messages_messages.messages.get(0), messages_messages.users, messages_messages.chats, true);
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("file ref not found in messages, replacing message");
                        }
                    }
                } else if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("empty messages, file ref not found");
                }
            } else {
                if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                    arrayList3 = ((TLRPC.TL_help_premiumPromo) tLObject2).videos;
                    size11 = arrayList3.size();
                    i13 = 0;
                    while (true) {
                        if (i13 < size11) {
                            i14 = i13 + 1;
                            TLRPC.Document document7 = arrayList3.get(i13);
                            boolean[] zArr13 = zArr2;
                            fileReference2 = fileRefController.getFileReference(document7, null, inputFileLocation2, zArr13, inputFileLocationArr2);
                            zArr2 = zArr13;
                            if (fileReference2 != null) {
                                fileReference = fileReference2;
                            } else {
                                inputFileLocation2 = inputFileLocation;
                                fileReference = fileReference2;
                                i13 = i14;
                                fileRefController = this;
                            }
                        }
                    }
                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions2 = (TLRPC.TL_messages_availableReactions) tLObject2;
                    getMediaDataController().processLoadedReactions(tL_messages_availableReactions2.reactions, tL_messages_availableReactions2.hash, (int) (System.currentTimeMillis() / 1000), false);
                    arrayList2 = tL_messages_availableReactions2.reactions;
                    size10 = arrayList2.size();
                    i11 = 0;
                    while (true) {
                        if (i11 < size10) {
                            i12 = i11 + 1;
                            tL_availableReaction = arrayList2.get(i11);
                            zArr5 = zArr2;
                            fileReference2 = getFileReference(tL_availableReaction.static_icon, null, inputFileLocation, zArr5, inputFileLocationArr2);
                            if (fileReference2 == null) {
                                fileReference2 = getFileReference(tL_availableReaction.center_icon, null, inputFileLocation, zArr5, inputFileLocationArr2);
                                zArr2 = zArr5;
                                if (fileReference2 != null) {
                                    fileReference = fileReference2;
                                    i11 = i12;
                                }
                            }
                            fileReference = fileReference2;
                        }
                    }
                } else if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull2 = (TLRPC.TL_users_userFull) tLObject2;
                    getMessagesController().putUsers(tL_users_userFull2.users, false);
                    getMessagesController().putChats(tL_users_userFull2.chats, false);
                    userFull = tL_users_userFull2.full_user;
                    botInfo = userFull.bot_info;
                    if (botInfo != null) {
                        getMessagesStorage().updateUserInfo(userFull, true);
                        if (fileReference == null) {
                            inputFileLocation5 = inputFileLocation;
                            fileRefController = this;
                            fileReference = getFileReference(botInfo.description_document, null, inputFileLocation5, zArr2, inputFileLocationArr2);
                        } else {
                            fileRefController = this;
                            inputFileLocation5 = inputFileLocation;
                        }
                        if (fileReference == null) {
                            zArr2 = zArr2;
                            fileReference = fileRefController.getFileReference(botInfo.description_photo, inputFileLocation5, zArr2, inputFileLocationArr2);
                        }
                    }
                } else if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                    arrayList = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot.icons;
                    size9 = arrayList.size();
                    i9 = 0;
                    while (true) {
                        if (i9 < size9) {
                            i10 = i9 + 1;
                            TLRPC.Document document8 = arrayList.get(i9).icon;
                            boolean[] zArr14 = zArr2;
                            fileReference2 = getFileReference(document8, null, inputFileLocation, zArr14, inputFileLocationArr2);
                            zArr2 = zArr14;
                            if (fileReference2 != null) {
                                fileReference = fileReference2;
                            } else {
                                fileReference = fileReference2;
                                i9 = i10;
                            }
                        }
                    }
                } else if (tLObject2 instanceof TLRPC.TL_help_appUpdate) {
                    tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject2;
                    SharedConfig.pendingAppUpdate = tL_help_appUpdate;
                    SharedConfig.saveConfig();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                    document2 = tL_help_appUpdate.document;
                    if (document2 != null) {
                        fileReference = document2.file_reference;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation2 = new TLRPC.TL_inputDocumentFileLocation();
                        TLRPC.Document document9 = tL_help_appUpdate.document;
                        tL_inputDocumentFileLocation2.id = document9.id;
                        tL_inputDocumentFileLocation2.access_hash = document9.access_hash;
                        tL_inputDocumentFileLocation2.file_reference = document9.file_reference;
                        tL_inputDocumentFileLocation2.thumb_size = "";
                        inputFileLocationArr2 = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation2};
                    }
                    if (fileReference == null) {
                        zArr4 = zArr2;
                        fileReference = getFileReference(tL_help_appUpdate.document, null, inputFileLocation, zArr4, inputFileLocationArr2);
                    } else {
                        zArr4 = zArr2;
                    }
                    if (fileReference == null) {
                        fileRefController3 = this;
                        fileReference3 = fileRefController3.getFileReference(tL_help_appUpdate.sticker, null, inputFileLocation, zArr4, inputFileLocationArr2);
                        inputFileLocationArr = inputFileLocationArr2;
                        fileReference = fileReference3;
                    }
                } else {
                    fileRefController = this;
                    inputFileLocation3 = inputFileLocation;
                    if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                        TLRPC.TL_messages_webPage tL_messages_webPage2 = (TLRPC.TL_messages_webPage) tLObject2;
                        fileRefController.getMessagesController().putChats(tL_messages_webPage2.chats, false);
                        fileRefController.getMessagesController().putUsers(tL_messages_webPage2.users, false);
                        fileReference = fileRefController.getFileReference(tL_messages_webPage2.webpage, inputFileLocation3, zArr2, inputFileLocationArr2);
                    } else if (tLObject2 instanceof TLRPC.WebPage) {
                        fileReference = fileRefController.getFileReference((TLRPC.WebPage) tLObject2, inputFileLocation3, zArr2, inputFileLocationArr2);
                    } else if (tLObject2 instanceof TL_account.TL_wallPapers) {
                        tL_wallPapers = (TL_account.TL_wallPapers) tLObject2;
                        size8 = tL_wallPapers.wallpapers.size();
                        i8 = 0;
                        while (true) {
                            if (i8 < size8) {
                                boolean[] zArr15 = zArr2;
                                fileReference2 = fileRefController.getFileReference(tL_wallPapers.wallpapers.get(i8).document, null, inputFileLocation3, zArr15, inputFileLocationArr2);
                                zArr2 = zArr15;
                                if (fileReference2 != null) {
                                    fileReference = fileReference2;
                                } else {
                                    i8++;
                                    inputFileLocation3 = inputFileLocation;
                                    fileReference = fileReference2;
                                    fileRefController = this;
                                }
                            }
                        }
                    } else if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                        fileReference = getFileReference(((TLRPC.TL_wallPaper) tLObject2).document, null, inputFileLocation, zArr2, inputFileLocationArr2);
                    } else if (tLObject2 instanceof TLRPC.TL_theme) {
                        fileRefController3 = this;
                        fileReference3 = fileRefController3.getFileReference(((TLRPC.TL_theme) tLObject2).document, null, inputFileLocation, zArr2, inputFileLocationArr2);
                        inputFileLocationArr = inputFileLocationArr2;
                        fileReference = fileReference3;
                    } else {
                        fileRefController = this;
                        inputFileLocation4 = inputFileLocation;
                        if (tLObject2 instanceof Vector) {
                            vector = (Vector) tLObject2;
                            if (!vector.objects.isEmpty()) {
                                size7 = vector.objects.size();
                                while (i7 < size7) {
                                    obj3 = vector.objects.get(i7);
                                    if (obj3 instanceof TLRPC.User) {
                                        fileReference = fileRefController.getFileReference((TLRPC.User) obj3, inputFileLocation4, zArr2, inputFileLocationArr2);
                                    } else if (obj3 instanceof TLRPC.Chat) {
                                        fileReference = fileRefController.getFileReference((TLRPC.Chat) obj3, inputFileLocation4, zArr2, inputFileLocationArr2);
                                    }
                                    if (fileReference != null) {
                                        break;
                                        break;
                                    }
                                }
                            }
                        } else if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                            tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                            if (!tL_messages_chats.chats.isEmpty()) {
                                size6 = tL_messages_chats.chats.size();
                                while (i6 < size6) {
                                    fileReference = fileRefController.getFileReference(tL_messages_chats.chats.get(i6), inputFileLocation4, zArr2, inputFileLocationArr2);
                                    if (fileReference != null) {
                                        break;
                                        break;
                                    }
                                }
                            }
                        } else if (tLObject2 instanceof TLRPC.TL_messages_savedGifs) {
                            tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject2;
                            size5 = tL_messages_savedGifs.gifs.size();
                            i5 = 0;
                            while (true) {
                                if (i5 < size5) {
                                    boolean[] zArr16 = zArr2;
                                    fileReference2 = fileRefController.getFileReference(tL_messages_savedGifs.gifs.get(i5), null, inputFileLocation4, zArr16, inputFileLocationArr2);
                                    zArr2 = zArr16;
                                    if (fileReference2 != null) {
                                        fileReference = fileReference2;
                                    } else {
                                        i5++;
                                        inputFileLocation4 = inputFileLocation;
                                        fileReference = fileReference2;
                                        fileRefController = this;
                                    }
                                }
                            }
                        } else if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                            if (fileReference == null) {
                                size4 = tL_messages_stickerSet.documents.size();
                                i4 = 0;
                                while (true) {
                                    if (i4 < size4) {
                                        boolean[] zArr17 = zArr2;
                                        fileReference2 = getFileReference(tL_messages_stickerSet.documents.get(i4), null, inputFileLocation, zArr17, inputFileLocationArr2);
                                        zArr2 = zArr17;
                                        if (fileReference2 != null) {
                                            fileReference = fileReference2;
                                        } else {
                                            i4++;
                                            fileReference = fileReference2;
                                        }
                                    }
                                }
                            }
                        } else if (tLObject2 instanceof TLRPC.TL_messages_recentStickers) {
                            tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject2;
                            size3 = tL_messages_recentStickers.stickers.size();
                            i3 = 0;
                            while (true) {
                                if (i3 < size3) {
                                    boolean[] zArr18 = zArr2;
                                    fileReference2 = getFileReference(tL_messages_recentStickers.stickers.get(i3), null, inputFileLocation, zArr18, inputFileLocationArr2);
                                    zArr2 = zArr18;
                                    if (fileReference2 != null) {
                                        fileReference = fileReference2;
                                    } else {
                                        i3++;
                                        fileReference = fileReference2;
                                    }
                                }
                            }
                        } else if (tLObject2 instanceof TLRPC.TL_messages_favedStickers) {
                            tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject2;
                            size2 = tL_messages_favedStickers.stickers.size();
                            i2 = 0;
                            while (true) {
                                if (i2 >= size2) {
                                    zArr3 = zArr2;
                                    fileReference2 = getFileReference(tL_messages_favedStickers.stickers.get(i2), null, inputFileLocation, zArr3, inputFileLocationArr2);
                                    if (fileReference2 != null) {
                                        fileReference = fileReference2;
                                    } else {
                                        i2++;
                                        fileReference = fileReference2;
                                        zArr2 = zArr3;
                                    }
                                }
                            }
                        } else {
                            fileRefController2 = this;
                            if (tLObject2 instanceof TLRPC.photos_Photos) {
                                photos_photos = (TLRPC.photos_Photos) tLObject2;
                                size = photos_photos.photos.size();
                                while (i < size) {
                                    fileReference = fileRefController2.getFileReference(photos_photos.photos.get(i), inputFileLocation, zArr2, inputFileLocationArr2);
                                    if (fileReference != null) {
                                        break;
                                        break;
                                    }
                                }
                            } else if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                                tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                                if (tL_stories_stories.stories.isEmpty()) {
                                    storyItem = null;
                                } else {
                                    storyItem = null;
                                }
                                obj = objArr[1];
                                if (obj instanceof FileLoadOperation) {
                                    obj2 = ((FileLoadOperation) obj).parentObject;
                                    if (obj2 instanceof TL_stories.StoryItem) {
                                        storyItem2 = (TL_stories.StoryItem) obj2;
                                        if (storyItem == null) {
                                            TL_stories.TL_updateStory tL_updateStory3 = new TL_stories.TL_updateStory();
                                            tL_updateStory3.peer = fileRefController2.getMessagesController().getPeer(storyItem2.dialogId);
                                            TL_stories.TL_storyItemDeleted tL_storyItemDeleted2 = new TL_stories.TL_storyItemDeleted();
                                            tL_updateStory3.story = tL_storyItemDeleted2;
                                            tL_storyItemDeleted2.id = storyItem2.id;
                                            ArrayList<TLRPC.Update> arrayList6 = new ArrayList<>();
                                            arrayList6.add(tL_updateStory3);
                                            fileRefController2.getMessagesController().processUpdateArray(arrayList6, null, null, false, 0);
                                        } else {
                                            user = fileRefController2.getMessagesController().getUser(Long.valueOf(storyItem2.dialogId));
                                            if (user != null) {
                                                MessagesController.getInstance(fileRefController2.currentAccount).getStoriesController().storiesStorage.updateStoryItem(storyItem2.dialogId, storyItem);
                                            }
                                        }
                                        if (storyItem != null) {
                                            TL_stories.TL_updateStory tL_updateStory4 = new TL_stories.TL_updateStory();
                                            tL_updateStory4.peer = MessagesController.getInstance(fileRefController2.currentAccount).getPeer(storyItem2.dialogId);
                                            tL_updateStory4.story = storyItem;
                                            ArrayList<TLRPC.Update> arrayList7 = new ArrayList<>();
                                            arrayList7.add(tL_updateStory4);
                                            MessagesController.getInstance(fileRefController2.currentAccount).processUpdateArray(arrayList7, null, null, false, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                inputFileLocationArr = inputFileLocationArr2;
            }
            zArr2 = zArr2;
            inputFileLocationArr = inputFileLocationArr2;
        }
        if (fileReference == null) {
            return null;
        }
        if (inputFileLocationArr != null) {
            inputFileLocation7 = inputFileLocation6;
        }
        return new Pair<>(fileReference, inputFileLocation7);
    }

    public static FileRefController getInstance(int i) {
        FileRefController fileRefController;
        FileRefController fileRefController2 = Instance[i];
        if (fileRefController2 != null) {
            return fileRefController2;
        }
        synchronized (FileRefController.class) {
            try {
                fileRefController = Instance[i];
                if (fileRefController == null) {
                    FileRefController[] fileRefControllerArr = Instance;
                    FileRefController fileRefController3 = new FileRefController(i);
                    fileRefControllerArr[i] = fileRefController3;
                    fileRefController = fileRefController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileRefController;
    }

    public static String getKeyForParentObject(Object obj) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (obj instanceof StoriesController.BotPreview) {
            StoriesController.BotPreview botPreview = (StoriesController.BotPreview) obj;
            if (botPreview.list == null) {
                FileLog.d("failed request reference can't find list in botpreview");
                return null;
            }
            TLRPC.MessageMedia messageMedia = botPreview.media;
            if (messageMedia.document != null) {
                return "botstory_doc_" + botPreview.media.document.id;
            }
            if (messageMedia.photo != null) {
                return "botstory_photo_" + botPreview.media.photo.id;
            }
            return "botstory_" + botPreview.id;
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            if (storyItem.dialogId == 0) {
                FileLog.d("failed request reference can't find dialogId");
                return null;
            }
            return "story_" + storyItem.dialogId + "_" + storyItem.id;
        }
        if (obj instanceof TLRPC.TL_help_premiumPromo) {
            return "premium_promo";
        }
        if (obj instanceof TLRPC.TL_availableReaction) {
            return "available_reaction_" + ((TLRPC.TL_availableReaction) obj).reaction;
        }
        if (obj instanceof TL_bots.BotInfo) {
            return "bot_info_" + ((TL_bots.BotInfo) obj).user_id;
        }
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            return Log.m(((TLRPC.TL_attachMenuBot) obj).bot_id, "attach_menu_bot_");
        }
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            long channelId = messageObject.getChannelId();
            if (messageObject.type == 29 && (message = messageObject.messageOwner) != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                channelId = DialogObject.getPeerDialogId(peer);
            }
            return "message" + messageObject.getRealId() + "_" + channelId + "_" + messageObject.scheduled + "_" + messageObject.getQuickReplyId();
        }
        if (obj instanceof TLRPC.Message) {
            TLRPC.Message message2 = (TLRPC.Message) obj;
            TLRPC.Peer peer2 = message2.peer_id;
            return "message" + message2.id + "_" + (peer2 != null ? peer2.channel_id : 0L) + "_" + message2.from_scheduled;
        }
        if (obj instanceof TLRPC.WebPage) {
            return "webpage" + ((TLRPC.WebPage) obj).id;
        }
        if (obj instanceof TLRPC.User) {
            return "user" + ((TLRPC.User) obj).id;
        }
        if (obj instanceof TLRPC.Chat) {
            return "chat" + ((TLRPC.Chat) obj).id;
        }
        if (obj instanceof String) {
            return zzii.m("str", (String) obj);
        }
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            return "set" + ((TLRPC.TL_messages_stickerSet) obj).set.id;
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            return "set" + ((TLRPC.StickerSetCovered) obj).set.id;
        }
        if (obj instanceof TLRPC.InputStickerSet) {
            return "set" + ((TLRPC.InputStickerSet) obj).id;
        }
        if (obj instanceof TLRPC.TL_wallPaper) {
            return "wallpaper" + ((TLRPC.TL_wallPaper) obj).id;
        }
        if (obj instanceof TLRPC.TL_theme) {
            return "theme" + ((TLRPC.TL_theme) obj).id;
        }
        if (obj == null) {
            return null;
        }
        return "" + obj;
    }

    private String getObjectString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            StringBuilder sb = new StringBuilder("story(dialogId=");
            sb.append(storyItem.dialogId);
            sb.append(" id=");
            return Fragment$$ExternalSyntheticOutline0.m(storyItem.id, ")", sb);
        }
        if (!(obj instanceof MessageObject)) {
            if (obj == null) {
                return null;
            }
            return obj.getClass().getSimpleName();
        }
        MessageObject messageObject = (MessageObject) obj;
        return "message(dialogId=" + messageObject.getDialogId() + "messageId" + messageObject.getId() + ")";
    }

    private boolean getPeerReferenceReplacement(TLRPC.User user, TLRPC.Chat chat, boolean z, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation[] inputFileLocationArr, boolean[] zArr) {
        TLRPC.InputPeer tL_inputPeerChat;
        TLRPC.InputPeer tL_inputPeerUser;
        if (zArr == null || !zArr[0]) {
            return false;
        }
        TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
        long j = inputFileLocation.volume_id;
        tL_inputPeerPhotoFileLocation.id = j;
        tL_inputPeerPhotoFileLocation.volume_id = j;
        tL_inputPeerPhotoFileLocation.local_id = inputFileLocation.local_id;
        tL_inputPeerPhotoFileLocation.big = z;
        if (user == null) {
            if (!ChatObject.isChannel(chat)) {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_inputPeerChat.chat_id = chat.id;
            } else if (chat.access_hash != 0 || chat.fromMessageDialogId == 0 || chat.fromMessageId == 0) {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChat.channel_id = chat.id;
                tL_inputPeerChat.access_hash = chat.access_hash;
            } else {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChat.channel_id = chat.id;
                tL_inputPeerChat.peer = getMessagesController().getInputPeer(chat.fromMessageDialogId);
                tL_inputPeerChat.msg_id = chat.fromMessageId;
            }
            tL_inputPeerPhotoFileLocation.photo_id = chat.photo.photo_id;
            tL_inputPeerUser = tL_inputPeerChat;
        } else if (user.access_hash != 0 || user.fromMessageId == 0 || user.fromMessageDialogId == 0) {
            tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputPeerUser.user_id = user.id;
            tL_inputPeerUser.access_hash = user.access_hash;
            tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
        } else {
            tL_inputPeerUser = new TLRPC.TL_inputPeerUserFromMessage();
            tL_inputPeerUser.user_id = user.id;
            tL_inputPeerUser.peer = getMessagesController().getInputPeer(user.fromMessageDialogId);
            tL_inputPeerUser.msg_id = user.fromMessageId;
            tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
        }
        tL_inputPeerPhotoFileLocation.peer = tL_inputPeerUser;
        inputFileLocationArr[0] = tL_inputPeerPhotoFileLocation;
        return true;
    }

    public static boolean isFileRefError(String str) {
        if ("FILEREF_EXPIRED".equals(str) || "FILE_REFERENCE_EXPIRED".equals(str) || "FILE_REFERENCE_EMPTY".equals(str)) {
            return true;
        }
        return str != null && str.startsWith("FILE_REFERENCE_");
    }

    public static boolean isFileRefErrorCover(String str) {
        return str != null && isFileRefError(str) && str.endsWith("COVER_EXPIRED");
    }

    private boolean isSameReference(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static void lambda$onRequestComplete$46(TLRPC.TL_theme tL_theme) throws Throwable {
        TLRPC.Document document;
        int size = Theme.themes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_theme tL_theme2 = ((Theme.ThemeInfo) Theme.themes.get(i)).info;
            if (tL_theme2 != null && tL_theme2.id == tL_theme.id) {
                TLRPC.Document document2 = tL_theme2.document;
                if (document2 == null || (document = tL_theme.document) == null) {
                    return;
                }
                document2.file_reference = document.file_reference;
                Theme.saveOtherThemes(true, false);
                return;
            }
        }
    }

    public void lambda$onRequestComplete$47(TLRPC.User user) {
        getMessagesController().putUser(user, false);
    }

    public void lambda$onRequestComplete$48(TLRPC.Chat chat) {
        getMessagesController().putChat(chat, false);
    }

    public void lambda$onRequestComplete$49(TLRPC.Chat chat) {
        getMessagesController().putChat(chat, false);
    }

    public void lambda$onRequestComplete$50(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        getMediaDataController().replaceStickerSet(tL_messages_stickerSet);
    }

    public void lambda$onUpdateObjectReference$30(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_messages_sendMultiMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    public void lambda$onUpdateObjectReference$31(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_messages_sendMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    public void lambda$onUpdateObjectReference$32(TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_sendMessage, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    public void lambda$onUpdateObjectReference$33(Requester requester) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    public void lambda$onUpdateObjectReference$34(Requester requester) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    public void lambda$onUpdateObjectReference$35(Requester requester) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    public void lambda$onUpdateObjectReference$36(Requester requester) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    public static void lambda$onUpdateObjectReference$37(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$onUpdateObjectReference$38(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$onUpdateObjectReference$39(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$onUpdateObjectReference$40(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$requestReferenceFromServer$0(String str, String str2, StoriesController.BotPreview botPreview) throws FileNotFoundException {
        onRequestComplete(str, str2, botPreview, null, true, false);
    }

    public void lambda$requestReferenceFromServer$1(String str, String str2, StoriesController.BotPreview botPreview) {
        Utilities.stageQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda10(8, this, str, str2, botPreview));
    }

    public void lambda$requestReferenceFromServer$10(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$11(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$12(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$13(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$14(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$15(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$16(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$17(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$18(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        broadcastWaitersData(this.wallpaperWaiters, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$19(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        broadcastWaitersData(this.savedGifsWaiters, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$2(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$20(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        broadcastWaitersData(this.recentStickersWaiter, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$21(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        broadcastWaitersData(this.favStickersWaiter, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$22(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$23(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$24(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$25(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, false, false);
    }

    public void lambda$requestReferenceFromServer$26(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, false, false);
    }

    public void lambda$requestReferenceFromServer$27(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$28(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$29(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$3(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            getMediaDataController().processLoadedPremiumPromo((TLRPC.TL_help_premiumPromo) tLObject, iCurrentTimeMillis, false);
        }
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$4(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$5(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$6(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$7(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$8(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$9(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$sendErrorToObject$41(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_messages_sendMultiMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    public void lambda$sendErrorToObject$42(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_messages_sendMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    public void lambda$sendErrorToObject$43(TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequestMulti$64(tL_sendMessage, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    public void lambda$sendErrorToObject$44(Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) objArr[0], (MessageObject) objArr[1], (String) objArr[2], (SendMessagesHelper.DelayedMessage) objArr[3], ((Boolean) objArr[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) objArr[5], null, null, ((Boolean) objArr[6]).booleanValue());
    }

    public void lambda$sendErrorToObject$45(Object[] objArr) {
        getSendMessagesHelper().lambda$performSendMessageRequest$82((TLObject) objArr[0], (MessageObject) objArr[1], (String) objArr[2], (SendMessagesHelper.DelayedMessage) objArr[3], ((Boolean) objArr[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) objArr[5], null, null, ((Boolean) objArr[6]).booleanValue());
    }

    private boolean onRequestComplete(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error, boolean z, boolean z2) throws FileNotFoundException {
        String str3;
        String str4;
        TLObject tLObject2;
        boolean z3;
        ArrayList<Requester> arrayList;
        int size;
        boolean[] zArr;
        TLRPC.InputFileLocation[] inputFileLocationArr;
        byte[] fileReference;
        int i;
        Requester requester;
        boolean[] zArr2;
        Requester requester2;
        boolean[] zArr3;
        byte[] bArr;
        TL_stories.TL_stories_stories tL_stories_stories;
        TL_stories.StoryItem storyItem;
        byte[] fileReference2;
        Object obj;
        TL_stories.StoryItem storyItem2;
        TLRPC.User user;
        TL_stories.StoryItem storyItem3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.Document document2;
        TLRPC.photos_Photos photos_photos;
        int size2;
        int i2;
        TLRPC.TL_messages_favedStickers tL_messages_favedStickers;
        int size3;
        int i3;
        int i4;
        TLRPC.TL_messages_recentStickers tL_messages_recentStickers;
        int size4;
        int i5;
        int i6;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int size5;
        int i7;
        int i8;
        TLRPC.TL_messages_savedGifs tL_messages_savedGifs;
        int size6;
        int i9;
        int i10;
        TLRPC.TL_messages_chats tL_messages_chats;
        int size7;
        int i11;
        final TLRPC.Chat chat;
        byte[] fileReference3;
        Vector vector;
        int size8;
        int i12;
        Object obj2;
        Vector vector2;
        int i13;
        int i14;
        final TLRPC.Chat chat2;
        TLRPC.TL_theme tL_theme;
        byte[] fileReference4;
        TLRPC.TL_wallPaper tL_wallPaper;
        TL_account.TL_wallPapers tL_wallPapers;
        int size9;
        int i15;
        TLRPC.TL_help_appUpdate tL_help_appUpdate;
        TLRPC.Document document3;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList2;
        int size10;
        byte[] fileReference5;
        int i16;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList3;
        int i17;
        int i18;
        int i19;
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i20;
        boolean[] zArr4;
        ArrayList<TLRPC.TL_availableReaction> arrayList4;
        int size11;
        int i21;
        int i22;
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList<TLRPC.TL_availableReaction> arrayList5;
        int i23;
        byte[] fileReference6;
        ArrayList<TLRPC.Document> arrayList6;
        int size12;
        int i24;
        int i25;
        TLRPC.messages_Messages messages_messages;
        int size13;
        int i26;
        int i27;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia3;
        int i28;
        int i29;
        TL_iv.RichMessage richMessage;
        TLRPC.MessageAction messageAction;
        byte[] fileReference7;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i30;
        TLRPC.MessageExtendedMedia messageExtendedMedia;
        int i31;
        TLRPC.InputFileLocation inputFileLocation;
        TLRPC.MessageMedia messageMedia4;
        TLRPC.Document document4;
        TLRPC.Photo photo3;
        ArrayList<Requester> arrayList7;
        TLObject tLObject3;
        final FileRefController fileRefController = this;
        TLObject tLObject4 = tLObject;
        int i32 = 1;
        boolean z4 = tLObject4 instanceof TLRPC.TL_help_premiumPromo;
        if (z4) {
            str4 = "premium_promo";
        } else if (tLObject4 instanceof TL_account.TL_wallPapers) {
            str4 = "wallpaper";
        } else if (tLObject4 instanceof TLRPC.TL_messages_savedGifs) {
            str4 = "gif";
        } else {
            if (!(tLObject4 instanceof TLRPC.TL_messages_recentStickers)) {
                if (tLObject4 instanceof TLRPC.TL_messages_favedStickers) {
                    str4 = "fav";
                } else {
                    str3 = str2;
                }
                if (str2 != null || (arrayList7 = fileRefController.parentRequester.get(str2)) == null) {
                    tLObject2 = tLObject4;
                    z3 = false;
                } else {
                    int size14 = arrayList7.size();
                    int i33 = 0;
                    z3 = false;
                    while (i33 < size14) {
                        Requester requester3 = arrayList7.get(i33);
                        if (requester3.completed) {
                            tLObject3 = tLObject4;
                        } else {
                            tLObject3 = tLObject4;
                            if (fileRefController.onRequestComplete(requester3.locationKey, null, tLObject4, tL_error, z && !z3, z2)) {
                                z3 = true;
                            }
                        }
                        i33++;
                        tLObject4 = tLObject3;
                    }
                    tLObject2 = tLObject4;
                    if (z3) {
                        fileRefController.putReponseToCache(str3, tLObject2);
                    }
                    fileRefController.parentRequester.remove(str2);
                }
                arrayList = fileRefController.locationRequester.get(str);
                if (arrayList == null) {
                    return z3;
                }
                size = arrayList.size();
                zArr = null;
                inputFileLocationArr = null;
                fileReference = null;
                i = 0;
                while (i < size) {
                    requester = arrayList.get(i);
                    if (requester.completed) {
                        i20 = i32;
                    } else {
                        if (tL_error != null && BuildVars.LOGS_ENABLED && requester.args.length > i32 && (requester.args[i32] instanceof FileLoadOperation)) {
                            FileLog.e("debug_loading: " + ((FileLoadOperation) requester.args[i32]).getCacheFileFinal().getName() + " can't update file reference: " + tL_error.code + " " + tL_error.text);
                        }
                        if ((requester.location instanceof TLRPC.TL_inputFileLocation) || (requester.location instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
                            inputFileLocationArr = new TLRPC.InputFileLocation[i32];
                            zArr = new boolean[i32];
                        }
                        inputFileLocationArr = inputFileLocationArr;
                        zArr2 = zArr;
                        requester.completed = i32;
                        if (tLObject2 instanceof StoriesController.BotPreview) {
                            messageMedia4 = ((StoriesController.BotPreview) tLObject2).media;
                            requester2 = requester;
                            zArr3 = zArr2;
                            document4 = messageMedia4.document;
                            if (document4 != null) {
                                fileReference = fileRefController.getFileReference(document4, messageMedia4.alt_documents, requester2.location, zArr3, inputFileLocationArr);
                            } else {
                                photo3 = messageMedia4.photo;
                                if (photo3 != null) {
                                    fileReference = fileRefController.getFileReference(photo3, requester2.location, zArr3, inputFileLocationArr);
                                }
                                bArr = fileReference;
                                zArr3 = zArr3;
                                zArr3 = zArr3;
                                zArr3 = zArr3;
                                zArr3 = zArr3;
                                fileReference = bArr;
                            }
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            inputFileLocationArr = inputFileLocationArr;
                            z4 = z4;
                        } else {
                            requester2 = requester;
                            zArr3 = zArr2;
                            if (tLObject2 instanceof TLRPC.messages_Messages) {
                                messages_messages = (TLRPC.messages_Messages) tLObject2;
                                if (messages_messages.messages.isEmpty()) {
                                    if (BuildVars.DEBUG_VERSION) {
                                        FileLog.d("empty messages, file ref not found");
                                    }
                                    fileRefController = this;
                                    bArr = fileReference;
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    fileReference = bArr;
                                } else {
                                    size13 = messages_messages.messages.size();
                                    i26 = 0;
                                    while (true) {
                                        if (i26 < size13) {
                                            i27 = 0;
                                            break;
                                        }
                                        message = messages_messages.messages.get(i26);
                                        messageMedia3 = message.media;
                                        i28 = size13;
                                        if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                            tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                                            i29 = i26;
                                            i30 = 0;
                                            while (i30 < tL_messageMediaPaidMedia.extended_media.size()) {
                                                messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i30);
                                                i31 = i30;
                                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                                    fileReference = fileRefController.getFileReferenceForMediaImpl(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, requester2.location, zArr3, inputFileLocationArr);
                                                }
                                                if (fileReference != null) {
                                                    break;
                                                }
                                                i30 = i31 + 1;
                                            }
                                        } else {
                                            i29 = i26;
                                            richMessage = message.rich_message;
                                            if (richMessage != null) {
                                                fileReference7 = fileRefController.getFileReferenceForRichMessage(richMessage, requester2.location, zArr3, inputFileLocationArr);
                                            } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                                fileReference7 = fileRefController.getFileReferenceForPoll((TLRPC.TL_messageMediaPoll) messageMedia3, requester2.location, zArr3, inputFileLocationArr);
                                            } else if (messageMedia3 != null) {
                                                fileReference7 = fileRefController.getFileReferenceForMediaImpl(messageMedia3, requester2.location, zArr3, inputFileLocationArr);
                                            } else {
                                                messageAction = message.action;
                                                if (!(messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto)) {
                                                    fileReference7 = fileRefController.getFileReference(messageAction.photo, requester2.location, zArr3, inputFileLocationArr);
                                                }
                                            }
                                            fileReference = fileReference7;
                                        }
                                        if (fileReference != null) {
                                            if (z) {
                                                i27 = 0;
                                                break;
                                            }
                                            i27 = 0;
                                            fileRefController.getMessagesStorage().replaceMessageIfExists(message, messages_messages.users, messages_messages.chats, false);
                                            break;
                                        }
                                        i26 = i29 + 1;
                                        fileRefController = this;
                                        size13 = i28;
                                    }
                                    if (fileReference == null) {
                                        getMessagesStorage().replaceMessageIfExists(messages_messages.messages.get(i27), messages_messages.users, messages_messages.chats, true);
                                        if (BuildVars.DEBUG_VERSION) {
                                            FileLog.d("file ref not found in messages, replacing message");
                                        }
                                    }
                                }
                            } else if (z4) {
                                arrayList6 = ((TLRPC.TL_help_premiumPromo) tLObject2).videos;
                                size12 = arrayList6.size();
                                i24 = 0;
                                while (i24 < size12) {
                                    i25 = i24 + 1;
                                    fileReference = getFileReference(arrayList6.get(i24), null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference != null) {
                                        break;
                                    }
                                    i24 = i25;
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                zArr4 = zArr3;
                                getMediaDataController().processLoadedReactions(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), false);
                                arrayList4 = tL_messages_availableReactions.reactions;
                                size11 = arrayList4.size();
                                fileReference = fileReference;
                                i21 = 0;
                                while (true) {
                                    if (i21 < size11) {
                                        i22 = i21 + 1;
                                        tL_availableReaction = arrayList4.get(i21);
                                        arrayList5 = arrayList4;
                                        zArr3 = zArr4;
                                        i23 = size11;
                                        fileReference6 = getFileReference(tL_availableReaction.static_icon, null, requester2.location, zArr3, inputFileLocationArr);
                                        if (fileReference6 == null && (fileReference6 = getFileReference(tL_availableReaction.appear_animation, null, requester2.location, zArr3, inputFileLocationArr)) == null && (fileReference6 = getFileReference(tL_availableReaction.select_animation, null, requester2.location, zArr3, inputFileLocationArr)) == null && (fileReference6 = getFileReference(tL_availableReaction.activate_animation, null, requester2.location, zArr3, inputFileLocationArr)) == null && (fileReference6 = getFileReference(tL_availableReaction.effect_animation, null, requester2.location, zArr3, inputFileLocationArr)) == null && (fileReference6 = getFileReference(tL_availableReaction.around_animation, null, requester2.location, zArr3, inputFileLocationArr)) == null) {
                                            fileReference = getFileReference(tL_availableReaction.center_icon, null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference != null) {
                                                size11 = i23;
                                                i21 = i22;
                                                arrayList4 = arrayList5;
                                                zArr4 = zArr3;
                                            }
                                        } else {
                                            fileReference = fileReference6;
                                        }
                                    } else {
                                        fileRefController = this;
                                        inputFileLocationArr = inputFileLocationArr;
                                        zArr3 = zArr4;
                                    }
                                    z4 = z4;
                                }
                            } else {
                                bArr = fileReference;
                                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                                    getMessagesController().putUsers(tL_users_userFull.users, false);
                                    getMessagesController().putChats(tL_users_userFull.chats, false);
                                    userFull = tL_users_userFull.full_user;
                                    botInfo = userFull.bot_info;
                                    if (botInfo != null) {
                                        getMessagesStorage().updateUserInfo(userFull, true);
                                        fileRefController = this;
                                        fileReference = fileRefController.getFileReference(botInfo.description_document, null, requester2.location, zArr3, inputFileLocationArr);
                                        if (fileReference != null) {
                                            zArr = zArr3;
                                            inputFileLocationArr = inputFileLocationArr;
                                            i20 = 1;
                                        } else {
                                            fileReference = fileRefController.getFileReference(botInfo.description_photo, requester2.location, zArr3, inputFileLocationArr);
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            inputFileLocationArr = inputFileLocationArr;
                                            z4 = z4;
                                        }
                                    } else {
                                        fileRefController = this;
                                        zArr3 = zArr3;
                                        zArr3 = zArr3;
                                        zArr3 = zArr3;
                                        zArr3 = zArr3;
                                        fileReference = bArr;
                                    }
                                } else if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                                    tL_attachMenuBot = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot;
                                    arrayList2 = tL_attachMenuBot.icons;
                                    size10 = arrayList2.size();
                                    fileReference5 = bArr;
                                    i16 = 0;
                                    while (i16 < size10) {
                                        i18 = i16 + 1;
                                        i19 = size10;
                                        fileReference5 = getFileReference(arrayList2.get(i16).icon, null, requester2.location, zArr3, inputFileLocationArr);
                                        if (fileReference5 != null) {
                                            break;
                                        }
                                        i16 = i18;
                                        size10 = i19;
                                    }
                                    if (z) {
                                        TLRPC.TL_attachMenuBots attachMenuBots = getMediaDataController().getAttachMenuBots();
                                        arrayList3 = new ArrayList<>(attachMenuBots.bots);
                                        i17 = 0;
                                        while (true) {
                                            if (i17 < arrayList3.size()) {
                                                bArr = fileReference5;
                                                zArr3 = zArr3;
                                                break;
                                            }
                                            bArr = fileReference5;
                                            zArr3 = zArr3;
                                            if (arrayList3.get(i17).bot_id == tL_attachMenuBot.bot_id) {
                                                arrayList3.set(i17, tL_attachMenuBot);
                                                break;
                                            }
                                            i17++;
                                            fileReference5 = bArr;
                                            zArr3 = zArr3;
                                        }
                                        attachMenuBots.bots = arrayList3;
                                        getMediaDataController().processLoadedMenuBots(attachMenuBots, attachMenuBots.hash, (int) (System.currentTimeMillis() / 1000), false);
                                    } else {
                                        bArr = fileReference5;
                                        zArr3 = zArr3;
                                    }
                                    fileRefController = this;
                                    fileReference = bArr;
                                } else if (tLObject2 instanceof TLRPC.TL_help_appUpdate) {
                                    tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject2;
                                    try {
                                        SharedConfig.pendingAppUpdate = tL_help_appUpdate;
                                        SharedConfig.saveConfig();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    try {
                                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                                    } catch (Exception e2) {
                                        FileLog.e(e2);
                                    }
                                    try {
                                        document3 = tL_help_appUpdate.document;
                                        if (document3 != null) {
                                            fileReference = document3.file_reference;
                                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                                            TLRPC.Document document5 = tL_help_appUpdate.document;
                                            tL_inputDocumentFileLocation.id = document5.id;
                                            tL_inputDocumentFileLocation.access_hash = document5.access_hash;
                                            tL_inputDocumentFileLocation.file_reference = document5.file_reference;
                                            tL_inputDocumentFileLocation.thumb_size = "";
                                            inputFileLocationArr = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation};
                                        } else {
                                            fileReference = bArr;
                                        }
                                    } catch (Exception e3) {
                                        FileLog.e(e3);
                                        fileReference = null;
                                    }
                                    if (fileReference == null) {
                                        fileReference = getFileReference(tL_help_appUpdate.document, null, requester2.location, zArr3, inputFileLocationArr);
                                    }
                                    if (fileReference == null) {
                                        zArr3 = zArr3;
                                        zArr3 = zArr3;
                                        fileRefController = this;
                                        fileReference = fileRefController.getFileReference(tL_help_appUpdate.sticker, null, requester2.location, zArr3, inputFileLocationArr);
                                    }
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    inputFileLocationArr = inputFileLocationArr;
                                    z4 = z4;
                                } else {
                                    fileRefController = this;
                                    if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                                        zArr3 = zArr3;
                                        TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                                        fileRefController.getMessagesController().putChats(tL_messages_webPage.chats, false);
                                        fileRefController.getMessagesController().putUsers(tL_messages_webPage.users, false);
                                        fileReference = fileRefController.getFileReference(tL_messages_webPage.webpage, requester2.location, zArr3, inputFileLocationArr);
                                    } else if (tLObject2 instanceof TLRPC.WebPage) {
                                        zArr3 = zArr3;
                                        fileReference = fileRefController.getFileReference((TLRPC.WebPage) tLObject2, requester2.location, zArr3, inputFileLocationArr);
                                    } else if (tLObject2 instanceof TL_account.TL_wallPapers) {
                                        tL_wallPapers = (TL_account.TL_wallPapers) tLObject2;
                                        size9 = tL_wallPapers.wallpapers.size();
                                        fileReference = bArr;
                                        i15 = 0;
                                        while (true) {
                                            if (i15 >= size9) {
                                                zArr3 = zArr3;
                                                break;
                                            }
                                            fileReference = fileRefController.getFileReference(tL_wallPapers.wallpapers.get(i15).document, null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference != null) {
                                                zArr3 = zArr3;
                                                break;
                                            }
                                            zArr3 = zArr3;
                                            i15++;
                                            fileRefController = this;
                                        }
                                        if (fileReference != null && z) {
                                            getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                                        }
                                    } else {
                                        if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                            tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                            fileReference4 = getFileReference(tL_wallPaper.document, null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference4 != null && z) {
                                                ArrayList<TLRPC.WallPaper> arrayList8 = new ArrayList<>();
                                                arrayList8.add(tL_wallPaper);
                                                getMessagesStorage().putWallpapers(arrayList8, 0);
                                            }
                                            zArr3 = zArr3;
                                            fileRefController = this;
                                        } else if (tLObject2 instanceof TLRPC.TL_theme) {
                                            tL_theme = (TLRPC.TL_theme) tLObject2;
                                            fileRefController = this;
                                            fileReference4 = fileRefController.getFileReference(tL_theme.document, null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference4 != null && z) {
                                                AndroidUtilities.runOnUIThread(new ANRDetector$$ExternalSyntheticLambda0(tL_theme, 22));
                                            }
                                        } else {
                                            fileRefController = this;
                                            if (tLObject2 instanceof Vector) {
                                                vector = (Vector) tLObject2;
                                                if (!vector.objects.isEmpty()) {
                                                    size8 = vector.objects.size();
                                                    fileReference = bArr;
                                                    i12 = 0;
                                                    while (true) {
                                                        if (i12 < size8) {
                                                            zArr3 = zArr3;
                                                            break;
                                                        }
                                                        obj2 = vector.objects.get(i12);
                                                        if (obj2 instanceof TLRPC.User) {
                                                            TLRPC.User user2 = (TLRPC.User) obj2;
                                                            fileReference = fileRefController.getFileReference(user2, requester2.location, zArr3, inputFileLocationArr);
                                                            if (z || fileReference == null) {
                                                                zArr3 = zArr3;
                                                                vector2 = vector;
                                                                i13 = size8;
                                                                i14 = i12;
                                                            } else {
                                                                ArrayList arrayList9 = new ArrayList();
                                                                arrayList9.add(user2);
                                                                vector2 = vector;
                                                                i13 = size8;
                                                                i14 = i12;
                                                                fileRefController.getMessagesStorage().putUsersAndChats(arrayList9, null, true, true);
                                                                AndroidUtilities.runOnUIThread(new FileLog$$ExternalSyntheticLambda3(9, fileRefController, user2));
                                                            }
                                                        } else {
                                                            vector2 = vector;
                                                            i13 = size8;
                                                            i14 = i12;
                                                            if (obj2 instanceof TLRPC.Chat) {
                                                                chat2 = (TLRPC.Chat) obj2;
                                                                fileReference = fileRefController.getFileReference(chat2, requester2.location, zArr3, inputFileLocationArr);
                                                                if (z && fileReference != null) {
                                                                    ArrayList arrayList10 = new ArrayList();
                                                                    arrayList10.add(chat2);
                                                                    fileRefController.getMessagesStorage().putUsersAndChats(null, arrayList10, true, true);
                                                                    final int i34 = 0;
                                                                    AndroidUtilities.runOnUIThread(new Runnable(fileRefController) {
                                                                        public final FileRefController f$0;

                                                                        {
                                                                            this.f$0 = fileRefController;
                                                                        }

                                                                        @Override
                                                                        public final void run() {
                                                                            switch (i34) {
                                                                                case 0:
                                                                                    this.f$0.lambda$onRequestComplete$48(chat2);
                                                                                    break;
                                                                                default:
                                                                                    this.f$0.lambda$onRequestComplete$49(chat2);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                        }
                                                        if (fileReference != null) {
                                                            break;
                                                        }
                                                        i12 = i14 + 1;
                                                        vector = vector2;
                                                        size8 = i13;
                                                    }
                                                }
                                                zArr3 = zArr3;
                                                zArr3 = zArr3;
                                                zArr3 = zArr3;
                                                zArr3 = zArr3;
                                                fileReference = bArr;
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                                tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                                if (!tL_messages_chats.chats.isEmpty()) {
                                                    size7 = tL_messages_chats.chats.size();
                                                    fileReference = bArr;
                                                    i11 = 0;
                                                    while (true) {
                                                        if (i11 >= size7) {
                                                            zArr3 = zArr3;
                                                            break;
                                                        }
                                                        chat = tL_messages_chats.chats.get(i11);
                                                        fileReference3 = fileRefController.getFileReference(chat, requester2.location, zArr3, inputFileLocationArr);
                                                        if (fileReference3 != null) {
                                                            if (z) {
                                                                zArr3 = zArr3;
                                                                ArrayList arrayList11 = new ArrayList();
                                                                arrayList11.add(chat);
                                                                final int i35 = 1;
                                                                fileRefController.getMessagesStorage().putUsersAndChats(null, arrayList11, true, true);
                                                                AndroidUtilities.runOnUIThread(new Runnable(fileRefController) {
                                                                    public final FileRefController f$0;

                                                                    {
                                                                        this.f$0 = fileRefController;
                                                                    }

                                                                    @Override
                                                                    public final void run() {
                                                                        switch (i35) {
                                                                            case 0:
                                                                                this.f$0.lambda$onRequestComplete$48(chat);
                                                                                break;
                                                                            default:
                                                                                this.f$0.lambda$onRequestComplete$49(chat);
                                                                                break;
                                                                        }
                                                                    }
                                                                });
                                                            } else {
                                                                zArr3 = zArr3;
                                                            }
                                                            fileReference = fileReference3;
                                                            break;
                                                        }
                                                        zArr3 = zArr3;
                                                        i11++;
                                                        fileReference = fileReference3;
                                                    }
                                                }
                                                zArr3 = zArr3;
                                                zArr3 = zArr3;
                                                zArr3 = zArr3;
                                                zArr3 = zArr3;
                                                fileReference = bArr;
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_savedGifs) {
                                                tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject2;
                                                size6 = tL_messages_savedGifs.gifs.size();
                                                fileReference = bArr;
                                                i9 = 0;
                                                while (i9 < size6) {
                                                    i10 = size6;
                                                    fileReference = fileRefController.getFileReference(tL_messages_savedGifs.gifs.get(i9), null, requester2.location, zArr3, inputFileLocationArr);
                                                    if (fileReference != null) {
                                                        break;
                                                    }
                                                    zArr3 = zArr3;
                                                    i9++;
                                                    fileRefController = this;
                                                    size6 = i10;
                                                }
                                                if (z) {
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    getMediaDataController().processLoadedRecentDocuments(0, tL_messages_savedGifs.gifs, true, 0, true);
                                                }
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                if (bArr == null) {
                                                    size5 = tL_messages_stickerSet.documents.size();
                                                    fileReference = bArr;
                                                    i7 = 0;
                                                    while (true) {
                                                        if (i7 < size5) {
                                                            zArr3 = zArr3;
                                                            fileRefController = this;
                                                            break;
                                                        }
                                                        i8 = size5;
                                                        fileRefController = this;
                                                        fileReference = fileRefController.getFileReference(tL_messages_stickerSet.documents.get(i7), null, requester2.location, zArr3, inputFileLocationArr);
                                                        if (fileReference != null) {
                                                            break;
                                                        }
                                                        zArr3 = zArr3;
                                                        i7++;
                                                        size5 = i8;
                                                    }
                                                } else {
                                                    fileRefController = this;
                                                    fileReference = bArr;
                                                }
                                                if (z) {
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    AndroidUtilities.runOnUIThread(new FileLog$$ExternalSyntheticLambda3(10, fileRefController, tL_messages_stickerSet));
                                                }
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_recentStickers) {
                                                tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject2;
                                                size4 = tL_messages_recentStickers.stickers.size();
                                                fileReference = bArr;
                                                i5 = 0;
                                                while (i5 < size4) {
                                                    i6 = size4;
                                                    fileReference = getFileReference(tL_messages_recentStickers.stickers.get(i5), null, requester2.location, zArr3, inputFileLocationArr);
                                                    if (fileReference != null) {
                                                        break;
                                                    }
                                                    zArr3 = zArr3;
                                                    i5++;
                                                    size4 = i6;
                                                }
                                                if (z) {
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    getMediaDataController().processLoadedRecentDocuments(0, tL_messages_recentStickers.stickers, false, 0, true);
                                                }
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_favedStickers) {
                                                tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject2;
                                                size3 = tL_messages_favedStickers.stickers.size();
                                                fileReference = bArr;
                                                i3 = 0;
                                                while (true) {
                                                    if (i3 < size3) {
                                                        zArr3 = zArr3;
                                                        fileRefController = this;
                                                        break;
                                                    }
                                                    i4 = size3;
                                                    fileRefController = this;
                                                    fileReference = fileRefController.getFileReference(tL_messages_favedStickers.stickers.get(i3), null, requester2.location, zArr3, inputFileLocationArr);
                                                    if (fileReference != null) {
                                                        break;
                                                    }
                                                    zArr3 = zArr3;
                                                    i3++;
                                                    size3 = i4;
                                                }
                                                if (z) {
                                                    zArr3 = zArr3;
                                                    fileRefController.getMediaDataController().processLoadedRecentDocuments(2, tL_messages_favedStickers.stickers, false, 0, true);
                                                }
                                            } else {
                                                fileRefController = this;
                                                if (tLObject2 instanceof TLRPC.photos_Photos) {
                                                    photos_photos = (TLRPC.photos_Photos) tLObject2;
                                                    size2 = photos_photos.photos.size();
                                                    fileReference = bArr;
                                                    i2 = 0;
                                                    while (true) {
                                                        if (i2 >= size2) {
                                                            zArr3 = zArr3;
                                                            break;
                                                        }
                                                        fileReference = fileRefController.getFileReference(photos_photos.photos.get(i2), requester2.location, zArr3, inputFileLocationArr);
                                                        if (fileReference != null) {
                                                            zArr3 = zArr3;
                                                            break;
                                                        }
                                                        zArr3 = zArr3;
                                                        i2++;
                                                    }
                                                } else if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                                                    tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                                                    if (tL_stories_stories.stories.isEmpty()) {
                                                        zArr3 = zArr3;
                                                        storyItem = null;
                                                        fileReference2 = bArr;
                                                    } else {
                                                        storyItem3 = tL_stories_stories.stories.get(0);
                                                        if (bArr == null || (document2 = storyItem3.music) == null) {
                                                            zArr3 = zArr3;
                                                            zArr3 = zArr3;
                                                            fileReference2 = bArr;
                                                        } else {
                                                            zArr3 = zArr3;
                                                            fileReference2 = fileRefController.getFileReference(document2, null, requester2.location, zArr3, inputFileLocationArr);
                                                        }
                                                        messageMedia = storyItem3.media;
                                                        if (messageMedia != null) {
                                                            if (fileReference2 == null && (photo2 = messageMedia.photo) != null) {
                                                                fileReference2 = fileRefController.getFileReference(photo2, requester2.location, zArr3, inputFileLocationArr);
                                                            }
                                                            if (fileReference2 == null && (photo = storyItem3.media.video_cover) != null) {
                                                                fileReference2 = fileRefController.getFileReference(photo, requester2.location, zArr3, inputFileLocationArr);
                                                            }
                                                            if (fileReference2 == null && (document = (messageMedia2 = storyItem3.media).document) != null) {
                                                                fileReference2 = fileRefController.getFileReference(document, messageMedia2.alt_documents, requester2.location, zArr3, inputFileLocationArr);
                                                            }
                                                            storyItem = storyItem3;
                                                        } else {
                                                            storyItem = null;
                                                        }
                                                    }
                                                    if (requester2.args[1] instanceof FileLoadOperation) {
                                                        obj = ((FileLoadOperation) requester2.args[1]).parentObject;
                                                        if (obj instanceof TL_stories.StoryItem) {
                                                            storyItem2 = (TL_stories.StoryItem) obj;
                                                            if (storyItem == null) {
                                                                TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                                                                z4 = z4;
                                                                tL_updateStory.peer = fileRefController.getMessagesController().getPeer(storyItem2.dialogId);
                                                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                                                tL_updateStory.story = tL_storyItemDeleted;
                                                                tL_storyItemDeleted.id = storyItem2.id;
                                                                ArrayList<TLRPC.Update> arrayList12 = new ArrayList<>();
                                                                arrayList12.add(tL_updateStory);
                                                                fileRefController.getMessagesController().processUpdateArray(arrayList12, null, null, false, 0);
                                                            } else {
                                                                z4 = z4;
                                                                user = fileRefController.getMessagesController().getUser(Long.valueOf(storyItem2.dialogId));
                                                                if (user != null && user.contact) {
                                                                    MessagesController.getInstance(fileRefController.currentAccount).getStoriesController().storiesStorage.updateStoryItem(storyItem2.dialogId, storyItem);
                                                                }
                                                            }
                                                            if (storyItem == null && fileReference2 == null) {
                                                                TL_stories.TL_updateStory tL_updateStory2 = new TL_stories.TL_updateStory();
                                                                tL_updateStory2.peer = MessagesController.getInstance(fileRefController.currentAccount).getPeer(storyItem2.dialogId);
                                                                tL_updateStory2.story = storyItem;
                                                                ArrayList<TLRPC.Update> arrayList13 = new ArrayList<>();
                                                                arrayList13.add(tL_updateStory2);
                                                                MessagesController.getInstance(fileRefController.currentAccount).processUpdateArray(arrayList13, null, null, false, 0);
                                                            }
                                                        } else {
                                                            z4 = z4;
                                                        }
                                                    } else {
                                                        z4 = z4;
                                                    }
                                                    inputFileLocationArr = inputFileLocationArr;
                                                    fileReference = fileReference2;
                                                } else {
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    fileReference = bArr;
                                                }
                                            }
                                        }
                                        zArr3 = zArr3;
                                        fileReference = fileReference4;
                                    }
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    inputFileLocationArr = inputFileLocationArr;
                                    z4 = z4;
                                }
                            }
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            fileRefController = this;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            inputFileLocationArr = inputFileLocationArr;
                            z4 = z4;
                        }
                        if (fileReference != null) {
                            if (inputFileLocationArr != null) {
                                inputFileLocation = inputFileLocationArr[0];
                            } else {
                                inputFileLocation = null;
                            }
                            if (fileRefController.onUpdateObjectReference(requester2, fileReference, inputFileLocation, z2)) {
                                zArr = zArr3;
                                i20 = 1;
                                z3 = true;
                            } else {
                                i20 = 1;
                            }
                            i += i20;
                            tL_error = tL_error;
                            z4 = z4;
                            i32 = i20;
                        } else {
                            i20 = 1;
                            fileRefController.sendErrorToObject(requester2.args, 1);
                        }
                        zArr = zArr3;
                        i += i20;
                        tL_error = tL_error;
                        z4 = z4;
                        i32 = i20;
                    }
                    i += i20;
                    tL_error = tL_error;
                    z4 = z4;
                    i32 = i20;
                }
                fileRefController.locationRequester.remove(str);
                if (z3) {
                    fileRefController.putReponseToCache(str, tLObject2);
                }
                return z3;
            }
            str4 = "recent";
        }
        str3 = str4;
        if (str2 != null) {
            tLObject2 = tLObject4;
            z3 = false;
        } else {
            tLObject2 = tLObject4;
            z3 = false;
        }
        arrayList = fileRefController.locationRequester.get(str);
        if (arrayList == null) {
            return z3;
        }
        size = arrayList.size();
        zArr = null;
        inputFileLocationArr = null;
        fileReference = null;
        i = 0;
        while (i < size) {
            requester = arrayList.get(i);
            if (requester.completed) {
                i20 = i32;
            } else {
                if (tL_error != null) {
                    FileLog.e("debug_loading: " + ((FileLoadOperation) requester.args[i32]).getCacheFileFinal().getName() + " can't update file reference: " + tL_error.code + " " + tL_error.text);
                }
                if (requester.location instanceof TLRPC.TL_inputFileLocation) {
                    inputFileLocationArr = new TLRPC.InputFileLocation[i32];
                    zArr = new boolean[i32];
                } else {
                    inputFileLocationArr = new TLRPC.InputFileLocation[i32];
                    zArr = new boolean[i32];
                }
                inputFileLocationArr = inputFileLocationArr;
                zArr2 = zArr;
                requester.completed = i32;
                if (tLObject2 instanceof StoriesController.BotPreview) {
                    messageMedia4 = ((StoriesController.BotPreview) tLObject2).media;
                    requester2 = requester;
                    zArr3 = zArr2;
                    document4 = messageMedia4.document;
                    if (document4 != null) {
                        fileReference = fileRefController.getFileReference(document4, messageMedia4.alt_documents, requester2.location, zArr3, inputFileLocationArr);
                    } else {
                        photo3 = messageMedia4.photo;
                        if (photo3 != null) {
                            fileReference = fileRefController.getFileReference(photo3, requester2.location, zArr3, inputFileLocationArr);
                        }
                        bArr = fileReference;
                        zArr3 = zArr3;
                        zArr3 = zArr3;
                        zArr3 = zArr3;
                        zArr3 = zArr3;
                        fileReference = bArr;
                    }
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    inputFileLocationArr = inputFileLocationArr;
                    z4 = z4;
                } else {
                    requester2 = requester;
                    zArr3 = zArr2;
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        messages_messages = (TLRPC.messages_Messages) tLObject2;
                        if (messages_messages.messages.isEmpty()) {
                            size13 = messages_messages.messages.size();
                            i26 = 0;
                            while (true) {
                                if (i26 < size13) {
                                    i27 = 0;
                                    break;
                                }
                                message = messages_messages.messages.get(i26);
                                messageMedia3 = message.media;
                                i28 = size13;
                                if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                    tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                                    i29 = i26;
                                    i30 = 0;
                                    while (i30 < tL_messageMediaPaidMedia.extended_media.size()) {
                                        messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i30);
                                        i31 = i30;
                                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                            fileReference = fileRefController.getFileReferenceForMediaImpl(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, requester2.location, zArr3, inputFileLocationArr);
                                        }
                                        if (fileReference != null) {
                                            break;
                                            break;
                                        }
                                        i30 = i31 + 1;
                                    }
                                } else {
                                    i29 = i26;
                                    richMessage = message.rich_message;
                                    if (richMessage != null) {
                                        fileReference7 = fileRefController.getFileReferenceForRichMessage(richMessage, requester2.location, zArr3, inputFileLocationArr);
                                    } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                        fileReference7 = fileRefController.getFileReferenceForPoll((TLRPC.TL_messageMediaPoll) messageMedia3, requester2.location, zArr3, inputFileLocationArr);
                                    } else if (messageMedia3 != null) {
                                        fileReference7 = fileRefController.getFileReferenceForMediaImpl(messageMedia3, requester2.location, zArr3, inputFileLocationArr);
                                    } else {
                                        messageAction = message.action;
                                        if (!(messageAction instanceof TLRPC.TL_messageActionChatEditPhoto)) {
                                        }
                                        fileReference7 = fileRefController.getFileReference(messageAction.photo, requester2.location, zArr3, inputFileLocationArr);
                                    }
                                    fileReference = fileReference7;
                                }
                                if (fileReference != null) {
                                    if (z) {
                                        i27 = 0;
                                        break;
                                    }
                                    i27 = 0;
                                    fileRefController.getMessagesStorage().replaceMessageIfExists(message, messages_messages.users, messages_messages.chats, false);
                                    break;
                                }
                                i26 = i29 + 1;
                                fileRefController = this;
                                size13 = i28;
                            }
                            if (fileReference == null) {
                                getMessagesStorage().replaceMessageIfExists(messages_messages.messages.get(i27), messages_messages.users, messages_messages.chats, true);
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("file ref not found in messages, replacing message");
                                }
                            }
                        } else {
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d("empty messages, file ref not found");
                            }
                            fileRefController = this;
                            bArr = fileReference;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            fileReference = bArr;
                        }
                    } else if (z4) {
                        arrayList6 = ((TLRPC.TL_help_premiumPromo) tLObject2).videos;
                        size12 = arrayList6.size();
                        i24 = 0;
                        while (i24 < size12) {
                            i25 = i24 + 1;
                            fileReference = getFileReference(arrayList6.get(i24), null, requester2.location, zArr3, inputFileLocationArr);
                            if (fileReference != null) {
                                break;
                                break;
                            }
                            i24 = i25;
                        }
                    } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                        TLRPC.TL_messages_availableReactions tL_messages_availableReactions2 = (TLRPC.TL_messages_availableReactions) tLObject2;
                        zArr4 = zArr3;
                        getMediaDataController().processLoadedReactions(tL_messages_availableReactions2.reactions, tL_messages_availableReactions2.hash, (int) (System.currentTimeMillis() / 1000), false);
                        arrayList4 = tL_messages_availableReactions2.reactions;
                        size11 = arrayList4.size();
                        fileReference = fileReference;
                        i21 = 0;
                        while (true) {
                            if (i21 < size11) {
                                i22 = i21 + 1;
                                tL_availableReaction = arrayList4.get(i21);
                                arrayList5 = arrayList4;
                                zArr3 = zArr4;
                                i23 = size11;
                                fileReference6 = getFileReference(tL_availableReaction.static_icon, null, requester2.location, zArr3, inputFileLocationArr);
                                if (fileReference6 == null) {
                                    fileReference = getFileReference(tL_availableReaction.center_icon, null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference != null) {
                                        size11 = i23;
                                        i21 = i22;
                                        arrayList4 = arrayList5;
                                        zArr4 = zArr3;
                                    }
                                }
                                fileReference = fileReference6;
                            } else {
                                fileRefController = this;
                                inputFileLocationArr = inputFileLocationArr;
                                zArr3 = zArr4;
                            }
                            z4 = z4;
                        }
                    } else {
                        bArr = fileReference;
                        if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                            TLRPC.TL_users_userFull tL_users_userFull2 = (TLRPC.TL_users_userFull) tLObject2;
                            getMessagesController().putUsers(tL_users_userFull2.users, false);
                            getMessagesController().putChats(tL_users_userFull2.chats, false);
                            userFull = tL_users_userFull2.full_user;
                            botInfo = userFull.bot_info;
                            if (botInfo != null) {
                                getMessagesStorage().updateUserInfo(userFull, true);
                                fileRefController = this;
                                fileReference = fileRefController.getFileReference(botInfo.description_document, null, requester2.location, zArr3, inputFileLocationArr);
                                if (fileReference != null) {
                                    zArr = zArr3;
                                    inputFileLocationArr = inputFileLocationArr;
                                    i20 = 1;
                                } else {
                                    fileReference = fileRefController.getFileReference(botInfo.description_photo, requester2.location, zArr3, inputFileLocationArr);
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    zArr3 = zArr3;
                                    inputFileLocationArr = inputFileLocationArr;
                                    z4 = z4;
                                }
                            } else {
                                fileRefController = this;
                                zArr3 = zArr3;
                                zArr3 = zArr3;
                                zArr3 = zArr3;
                                zArr3 = zArr3;
                                fileReference = bArr;
                            }
                        } else if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                            tL_attachMenuBot = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot;
                            arrayList2 = tL_attachMenuBot.icons;
                            size10 = arrayList2.size();
                            fileReference5 = bArr;
                            i16 = 0;
                            while (i16 < size10) {
                                i18 = i16 + 1;
                                i19 = size10;
                                fileReference5 = getFileReference(arrayList2.get(i16).icon, null, requester2.location, zArr3, inputFileLocationArr);
                                if (fileReference5 != null) {
                                    break;
                                    break;
                                }
                                i16 = i18;
                                size10 = i19;
                            }
                            if (z) {
                                TLRPC.TL_attachMenuBots attachMenuBots2 = getMediaDataController().getAttachMenuBots();
                                arrayList3 = new ArrayList<>(attachMenuBots2.bots);
                                i17 = 0;
                                while (true) {
                                    if (i17 < arrayList3.size()) {
                                        bArr = fileReference5;
                                        zArr3 = zArr3;
                                        break;
                                    }
                                    bArr = fileReference5;
                                    zArr3 = zArr3;
                                    if (arrayList3.get(i17).bot_id == tL_attachMenuBot.bot_id) {
                                        arrayList3.set(i17, tL_attachMenuBot);
                                        break;
                                    }
                                    i17++;
                                    fileReference5 = bArr;
                                    zArr3 = zArr3;
                                }
                                attachMenuBots2.bots = arrayList3;
                                getMediaDataController().processLoadedMenuBots(attachMenuBots2, attachMenuBots2.hash, (int) (System.currentTimeMillis() / 1000), false);
                            } else {
                                bArr = fileReference5;
                                zArr3 = zArr3;
                            }
                            fileRefController = this;
                            fileReference = bArr;
                        } else if (tLObject2 instanceof TLRPC.TL_help_appUpdate) {
                            tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject2;
                            SharedConfig.pendingAppUpdate = tL_help_appUpdate;
                            SharedConfig.saveConfig();
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                            document3 = tL_help_appUpdate.document;
                            if (document3 != null) {
                                fileReference = document3.file_reference;
                                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation2 = new TLRPC.TL_inputDocumentFileLocation();
                                TLRPC.Document document6 = tL_help_appUpdate.document;
                                tL_inputDocumentFileLocation2.id = document6.id;
                                tL_inputDocumentFileLocation2.access_hash = document6.access_hash;
                                tL_inputDocumentFileLocation2.file_reference = document6.file_reference;
                                tL_inputDocumentFileLocation2.thumb_size = "";
                                inputFileLocationArr = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation2};
                            } else {
                                fileReference = bArr;
                            }
                            if (fileReference == null) {
                                fileReference = getFileReference(tL_help_appUpdate.document, null, requester2.location, zArr3, inputFileLocationArr);
                            }
                            if (fileReference == null) {
                                zArr3 = zArr3;
                                zArr3 = zArr3;
                                fileRefController = this;
                                fileReference = fileRefController.getFileReference(tL_help_appUpdate.sticker, null, requester2.location, zArr3, inputFileLocationArr);
                            }
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            inputFileLocationArr = inputFileLocationArr;
                            z4 = z4;
                        } else {
                            fileRefController = this;
                            if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                                zArr3 = zArr3;
                                TLRPC.TL_messages_webPage tL_messages_webPage2 = (TLRPC.TL_messages_webPage) tLObject2;
                                fileRefController.getMessagesController().putChats(tL_messages_webPage2.chats, false);
                                fileRefController.getMessagesController().putUsers(tL_messages_webPage2.users, false);
                                fileReference = fileRefController.getFileReference(tL_messages_webPage2.webpage, requester2.location, zArr3, inputFileLocationArr);
                            } else if (tLObject2 instanceof TLRPC.WebPage) {
                                zArr3 = zArr3;
                                fileReference = fileRefController.getFileReference((TLRPC.WebPage) tLObject2, requester2.location, zArr3, inputFileLocationArr);
                            } else if (tLObject2 instanceof TL_account.TL_wallPapers) {
                                tL_wallPapers = (TL_account.TL_wallPapers) tLObject2;
                                size9 = tL_wallPapers.wallpapers.size();
                                fileReference = bArr;
                                i15 = 0;
                                while (true) {
                                    if (i15 >= size9) {
                                        zArr3 = zArr3;
                                        break;
                                    }
                                    fileReference = fileRefController.getFileReference(tL_wallPapers.wallpapers.get(i15).document, null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference != null) {
                                        zArr3 = zArr3;
                                        break;
                                    }
                                    zArr3 = zArr3;
                                    i15++;
                                    fileRefController = this;
                                }
                                if (fileReference != null) {
                                    getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                                }
                            } else {
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    fileReference4 = getFileReference(tL_wallPaper.document, null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference4 != null) {
                                        ArrayList<TLRPC.WallPaper> arrayList14 = new ArrayList<>();
                                        arrayList14.add(tL_wallPaper);
                                        getMessagesStorage().putWallpapers(arrayList14, 0);
                                    }
                                    zArr3 = zArr3;
                                    fileRefController = this;
                                } else if (tLObject2 instanceof TLRPC.TL_theme) {
                                    tL_theme = (TLRPC.TL_theme) tLObject2;
                                    fileRefController = this;
                                    fileReference4 = fileRefController.getFileReference(tL_theme.document, null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference4 != null) {
                                        AndroidUtilities.runOnUIThread(new ANRDetector$$ExternalSyntheticLambda0(tL_theme, 22));
                                    }
                                } else {
                                    fileRefController = this;
                                    if (tLObject2 instanceof Vector) {
                                        vector = (Vector) tLObject2;
                                        if (!vector.objects.isEmpty()) {
                                            size8 = vector.objects.size();
                                            fileReference = bArr;
                                            i12 = 0;
                                            while (true) {
                                                if (i12 < size8) {
                                                    zArr3 = zArr3;
                                                    break;
                                                }
                                                obj2 = vector.objects.get(i12);
                                                if (obj2 instanceof TLRPC.User) {
                                                    TLRPC.User user3 = (TLRPC.User) obj2;
                                                    fileReference = fileRefController.getFileReference(user3, requester2.location, zArr3, inputFileLocationArr);
                                                    if (z) {
                                                        zArr3 = zArr3;
                                                        vector2 = vector;
                                                        i13 = size8;
                                                        i14 = i12;
                                                    } else {
                                                        zArr3 = zArr3;
                                                        vector2 = vector;
                                                        i13 = size8;
                                                        i14 = i12;
                                                    }
                                                } else {
                                                    vector2 = vector;
                                                    i13 = size8;
                                                    i14 = i12;
                                                    if (obj2 instanceof TLRPC.Chat) {
                                                        chat2 = (TLRPC.Chat) obj2;
                                                        fileReference = fileRefController.getFileReference(chat2, requester2.location, zArr3, inputFileLocationArr);
                                                        if (z) {
                                                            ArrayList arrayList15 = new ArrayList();
                                                            arrayList15.add(chat2);
                                                            fileRefController.getMessagesStorage().putUsersAndChats(null, arrayList15, true, true);
                                                            final int i36 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable(fileRefController) {
                                                                public final FileRefController f$0;

                                                                {
                                                                    this.f$0 = fileRefController;
                                                                }

                                                                @Override
                                                                public final void run() {
                                                                    switch (i36) {
                                                                        case 0:
                                                                            this.f$0.lambda$onRequestComplete$48(chat2);
                                                                            break;
                                                                        default:
                                                                            this.f$0.lambda$onRequestComplete$49(chat2);
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    }
                                                }
                                                if (fileReference != null) {
                                                    break;
                                                    break;
                                                }
                                                i12 = i14 + 1;
                                                vector = vector2;
                                                size8 = i13;
                                            }
                                        }
                                        zArr3 = zArr3;
                                        zArr3 = zArr3;
                                        zArr3 = zArr3;
                                        zArr3 = zArr3;
                                        fileReference = bArr;
                                    } else if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                        tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                        if (!tL_messages_chats.chats.isEmpty()) {
                                            size7 = tL_messages_chats.chats.size();
                                            fileReference = bArr;
                                            i11 = 0;
                                            while (true) {
                                                if (i11 >= size7) {
                                                    zArr3 = zArr3;
                                                    break;
                                                }
                                                chat = tL_messages_chats.chats.get(i11);
                                                fileReference3 = fileRefController.getFileReference(chat, requester2.location, zArr3, inputFileLocationArr);
                                                if (fileReference3 != null) {
                                                    if (z) {
                                                        zArr3 = zArr3;
                                                        ArrayList arrayList16 = new ArrayList();
                                                        arrayList16.add(chat);
                                                        final int i37 = 1;
                                                        fileRefController.getMessagesStorage().putUsersAndChats(null, arrayList16, true, true);
                                                        AndroidUtilities.runOnUIThread(new Runnable(fileRefController) {
                                                            public final FileRefController f$0;

                                                            {
                                                                this.f$0 = fileRefController;
                                                            }

                                                            @Override
                                                            public final void run() {
                                                                switch (i37) {
                                                                    case 0:
                                                                        this.f$0.lambda$onRequestComplete$48(chat);
                                                                        break;
                                                                    default:
                                                                        this.f$0.lambda$onRequestComplete$49(chat);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    } else {
                                                        zArr3 = zArr3;
                                                    }
                                                    fileReference = fileReference3;
                                                    break;
                                                }
                                                zArr3 = zArr3;
                                                i11++;
                                                fileReference = fileReference3;
                                            }
                                        }
                                        zArr3 = zArr3;
                                        zArr3 = zArr3;
                                        zArr3 = zArr3;
                                        zArr3 = zArr3;
                                        fileReference = bArr;
                                    } else if (tLObject2 instanceof TLRPC.TL_messages_savedGifs) {
                                        tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject2;
                                        size6 = tL_messages_savedGifs.gifs.size();
                                        fileReference = bArr;
                                        i9 = 0;
                                        while (i9 < size6) {
                                            i10 = size6;
                                            fileReference = fileRefController.getFileReference(tL_messages_savedGifs.gifs.get(i9), null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference != null) {
                                                break;
                                                break;
                                            }
                                            zArr3 = zArr3;
                                            i9++;
                                            fileRefController = this;
                                            size6 = i10;
                                        }
                                        if (z) {
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            getMediaDataController().processLoadedRecentDocuments(0, tL_messages_savedGifs.gifs, true, 0, true);
                                        }
                                    } else if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                        tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                        if (bArr == null) {
                                            size5 = tL_messages_stickerSet.documents.size();
                                            fileReference = bArr;
                                            i7 = 0;
                                            while (true) {
                                                if (i7 < size5) {
                                                    zArr3 = zArr3;
                                                    fileRefController = this;
                                                    break;
                                                }
                                                i8 = size5;
                                                fileRefController = this;
                                                fileReference = fileRefController.getFileReference(tL_messages_stickerSet.documents.get(i7), null, requester2.location, zArr3, inputFileLocationArr);
                                                if (fileReference != null) {
                                                    break;
                                                    break;
                                                }
                                                zArr3 = zArr3;
                                                i7++;
                                                size5 = i8;
                                            }
                                        } else {
                                            fileRefController = this;
                                            fileReference = bArr;
                                        }
                                        if (z) {
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            AndroidUtilities.runOnUIThread(new FileLog$$ExternalSyntheticLambda3(10, fileRefController, tL_messages_stickerSet));
                                        }
                                    } else if (tLObject2 instanceof TLRPC.TL_messages_recentStickers) {
                                        tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject2;
                                        size4 = tL_messages_recentStickers.stickers.size();
                                        fileReference = bArr;
                                        i5 = 0;
                                        while (i5 < size4) {
                                            i6 = size4;
                                            fileReference = getFileReference(tL_messages_recentStickers.stickers.get(i5), null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference != null) {
                                                break;
                                                break;
                                            }
                                            zArr3 = zArr3;
                                            i5++;
                                            size4 = i6;
                                        }
                                        if (z) {
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            getMediaDataController().processLoadedRecentDocuments(0, tL_messages_recentStickers.stickers, false, 0, true);
                                        }
                                    } else if (tLObject2 instanceof TLRPC.TL_messages_favedStickers) {
                                        tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject2;
                                        size3 = tL_messages_favedStickers.stickers.size();
                                        fileReference = bArr;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < size3) {
                                                zArr3 = zArr3;
                                                fileRefController = this;
                                                break;
                                            }
                                            i4 = size3;
                                            fileRefController = this;
                                            fileReference = fileRefController.getFileReference(tL_messages_favedStickers.stickers.get(i3), null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference != null) {
                                                break;
                                                break;
                                            }
                                            zArr3 = zArr3;
                                            i3++;
                                            size3 = i4;
                                        }
                                        if (z) {
                                            zArr3 = zArr3;
                                            fileRefController.getMediaDataController().processLoadedRecentDocuments(2, tL_messages_favedStickers.stickers, false, 0, true);
                                        }
                                    } else {
                                        fileRefController = this;
                                        if (tLObject2 instanceof TLRPC.photos_Photos) {
                                            photos_photos = (TLRPC.photos_Photos) tLObject2;
                                            size2 = photos_photos.photos.size();
                                            fileReference = bArr;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 >= size2) {
                                                    zArr3 = zArr3;
                                                    break;
                                                }
                                                fileReference = fileRefController.getFileReference(photos_photos.photos.get(i2), requester2.location, zArr3, inputFileLocationArr);
                                                if (fileReference != null) {
                                                    zArr3 = zArr3;
                                                    break;
                                                }
                                                zArr3 = zArr3;
                                                i2++;
                                            }
                                        } else if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                                            tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                                            if (tL_stories_stories.stories.isEmpty()) {
                                                storyItem3 = tL_stories_stories.stories.get(0);
                                                if (bArr == null) {
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    fileReference2 = bArr;
                                                } else {
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    fileReference2 = bArr;
                                                }
                                                messageMedia = storyItem3.media;
                                                if (messageMedia != null) {
                                                    if (fileReference2 == null) {
                                                        fileReference2 = fileRefController.getFileReference(photo2, requester2.location, zArr3, inputFileLocationArr);
                                                    }
                                                    if (fileReference2 == null) {
                                                        fileReference2 = fileRefController.getFileReference(photo, requester2.location, zArr3, inputFileLocationArr);
                                                    }
                                                    if (fileReference2 == null) {
                                                        fileReference2 = fileRefController.getFileReference(document, messageMedia2.alt_documents, requester2.location, zArr3, inputFileLocationArr);
                                                    }
                                                    storyItem = storyItem3;
                                                } else {
                                                    storyItem = null;
                                                }
                                            } else {
                                                zArr3 = zArr3;
                                                storyItem = null;
                                                fileReference2 = bArr;
                                            }
                                            if (requester2.args[1] instanceof FileLoadOperation) {
                                                obj = ((FileLoadOperation) requester2.args[1]).parentObject;
                                                if (obj instanceof TL_stories.StoryItem) {
                                                    storyItem2 = (TL_stories.StoryItem) obj;
                                                    if (storyItem == null) {
                                                        TL_stories.TL_updateStory tL_updateStory3 = new TL_stories.TL_updateStory();
                                                        z4 = z4;
                                                        tL_updateStory3.peer = fileRefController.getMessagesController().getPeer(storyItem2.dialogId);
                                                        TL_stories.TL_storyItemDeleted tL_storyItemDeleted2 = new TL_stories.TL_storyItemDeleted();
                                                        tL_updateStory3.story = tL_storyItemDeleted2;
                                                        tL_storyItemDeleted2.id = storyItem2.id;
                                                        ArrayList<TLRPC.Update> arrayList17 = new ArrayList<>();
                                                        arrayList17.add(tL_updateStory3);
                                                        fileRefController.getMessagesController().processUpdateArray(arrayList17, null, null, false, 0);
                                                    } else {
                                                        z4 = z4;
                                                        user = fileRefController.getMessagesController().getUser(Long.valueOf(storyItem2.dialogId));
                                                        if (user != null) {
                                                            MessagesController.getInstance(fileRefController.currentAccount).getStoriesController().storiesStorage.updateStoryItem(storyItem2.dialogId, storyItem);
                                                        }
                                                    }
                                                    if (storyItem == null) {
                                                    }
                                                } else {
                                                    z4 = z4;
                                                }
                                            } else {
                                                z4 = z4;
                                            }
                                            inputFileLocationArr = inputFileLocationArr;
                                            fileReference = fileReference2;
                                        } else {
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            fileReference = bArr;
                                        }
                                    }
                                }
                                zArr3 = zArr3;
                                fileReference = fileReference4;
                            }
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            inputFileLocationArr = inputFileLocationArr;
                            z4 = z4;
                        }
                    }
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    fileRefController = this;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    inputFileLocationArr = inputFileLocationArr;
                    z4 = z4;
                }
                if (fileReference != null) {
                    if (inputFileLocationArr != null) {
                        inputFileLocation = inputFileLocationArr[0];
                    } else {
                        inputFileLocation = null;
                    }
                    if (fileRefController.onUpdateObjectReference(requester2, fileReference, inputFileLocation, z2)) {
                        zArr = zArr3;
                        i20 = 1;
                        z3 = true;
                    } else {
                        i20 = 1;
                    }
                    i += i20;
                    tL_error = tL_error;
                    z4 = z4;
                    i32 = i20;
                } else {
                    i20 = 1;
                    fileRefController.sendErrorToObject(requester2.args, 1);
                }
                zArr = zArr3;
                i += i20;
                tL_error = tL_error;
                z4 = z4;
                i32 = i20;
            }
            i += i20;
            tL_error = tL_error;
            z4 = z4;
            i32 = i20;
        }
        fileRefController.locationRequester.remove(str);
        if (z3) {
            fileRefController.putReponseToCache(str, tLObject2);
        }
        return z3;
    }

    private boolean onUpdateObjectReference(final Requester requester, byte[] bArr, TLRPC.InputFileLocation inputFileLocation, boolean z) {
        String strBytesToHex;
        Object obj;
        int iIndexOf;
        ArrayList arrayList;
        int i;
        boolean z2;
        Object obj2;
        int iIndexOf2;
        ArrayList arrayList2;
        int i2;
        boolean z3;
        int iIndexOf3;
        ArrayList arrayList3;
        int i3;
        boolean z4;
        if (BuildVars.DEBUG_VERSION) {
            StringBuilder sb = new StringBuilder("fileref updated for ");
            sb.append(requester.args[0]);
            sb.append(" ");
            SQLitePreparedStatement$$ExternalSyntheticOutline0.m(requester.locationKey, sb);
        }
        if (requester.args[0] instanceof TL_stories.TL_storyItem) {
            ((TL_stories.TL_storyItem) requester.args[0]).media.document.file_reference = bArr;
            return true;
        }
        String strBytesToHex2 = null;
        if (requester.args[0] instanceof TLRPC.TL_inputSingleMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) requester.args[1];
            Object[] objArr = this.multiMediaCache.get(tL_messages_sendMultiMedia);
            if (objArr != null) {
                TLRPC.TL_inputSingleMedia tL_inputSingleMedia = (TLRPC.TL_inputSingleMedia) requester.args[0];
                TLRPC.InputMedia inputMedia = tL_inputSingleMedia.media;
                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                    if (!z || !isSameReference(tL_inputMediaDocument.id.file_reference, bArr)) {
                        tL_inputMediaDocument.id.file_reference = bArr;
                        iIndexOf3 = tL_messages_sendMultiMedia.multi_media.indexOf(tL_inputSingleMedia);
                        if (iIndexOf3 >= 0) {
                            arrayList3 = (ArrayList) objArr[3];
                            arrayList3.set(iIndexOf3, null);
                            z4 = true;
                            for (i3 = 0; i3 < arrayList3.size(); i3++) {
                                if (arrayList3.get(i3) != null) {
                                    z4 = false;
                                }
                            }
                            if (z4) {
                                this.multiMediaCache.remove(tL_messages_sendMultiMedia);
                                AndroidUtilities.runOnUIThread(new FileRefController$$ExternalSyntheticLambda5(this, tL_messages_sendMultiMedia, objArr, 1));
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                    if (!z || !isSameReference(tL_inputMediaPhoto.id.file_reference, bArr)) {
                        tL_inputMediaPhoto.id.file_reference = bArr;
                    }
                    return false;
                }
                iIndexOf3 = tL_messages_sendMultiMedia.multi_media.indexOf(tL_inputSingleMedia);
                if (iIndexOf3 >= 0) {
                    arrayList3 = (ArrayList) objArr[3];
                    arrayList3.set(iIndexOf3, null);
                    z4 = true;
                    while (i3 < arrayList3.size()) {
                        if (arrayList3.get(i3) != null) {
                            z4 = false;
                        }
                    }
                    if (z4) {
                        this.multiMediaCache.remove(tL_messages_sendMultiMedia);
                        AndroidUtilities.runOnUIThread(new FileRefController$$ExternalSyntheticLambda5(this, tL_messages_sendMultiMedia, objArr, 1));
                        return true;
                    }
                }
            }
            return true;
        }
        if (requester.args.length >= 2 && (requester.args[1] instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) requester.args[1]).media instanceof TLRPC.TL_inputMediaPaidMedia) && ((requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) || (requester.args[0] instanceof TLRPC.TL_inputMediaDocument))) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) requester.args[1];
            Object[] objArr2 = this.multiMediaCache.get(tL_messages_sendMedia);
            if (objArr2 != null) {
                if (requester.args[0] instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) requester.args[0];
                    if (!z || !isSameReference(tL_inputMediaDocument2.id.file_reference, bArr)) {
                        tL_inputMediaDocument2.id.file_reference = bArr;
                        obj2 = tL_inputMediaDocument2;
                        iIndexOf2 = ((TLRPC.TL_inputMediaPaidMedia) tL_messages_sendMedia.media).extended_media.indexOf(obj2);
                        if (iIndexOf2 >= 0) {
                            arrayList2 = (ArrayList) objArr2[3];
                            arrayList2.set(iIndexOf2, null);
                            z3 = true;
                            for (i2 = 0; i2 < arrayList2.size(); i2++) {
                                if (arrayList2.get(i2) != null) {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                this.multiMediaCache.remove(tL_messages_sendMedia);
                                AndroidUtilities.runOnUIThread(new FileRefController$$ExternalSyntheticLambda6(this, tL_messages_sendMedia, objArr2, 1));
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) requester.args[0];
                    if (!z || !isSameReference(tL_inputMediaPhoto2.id.file_reference, bArr)) {
                        tL_inputMediaPhoto2.id.file_reference = bArr;
                        obj2 = tL_inputMediaPhoto2;
                    }
                    return false;
                }
                obj2 = null;
                iIndexOf2 = ((TLRPC.TL_inputMediaPaidMedia) tL_messages_sendMedia.media).extended_media.indexOf(obj2);
                if (iIndexOf2 >= 0) {
                    arrayList2 = (ArrayList) objArr2[3];
                    arrayList2.set(iIndexOf2, null);
                    z3 = true;
                    while (i2 < arrayList2.size()) {
                        if (arrayList2.get(i2) != null) {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        this.multiMediaCache.remove(tL_messages_sendMedia);
                        AndroidUtilities.runOnUIThread(new FileRefController$$ExternalSyntheticLambda6(this, tL_messages_sendMedia, objArr2, 1));
                        return true;
                    }
                }
            }
            return true;
        }
        if (requester.args.length >= 2 && (requester.args[1] instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) requester.args[1]).media instanceof TLRPC.TL_inputMediaPaidMedia) && ((requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) || (requester.args[0] instanceof TLRPC.TL_inputMediaDocument))) {
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) requester.args[1];
            Object[] objArr3 = this.multiMediaCache.get(tL_sendMessage);
            if (objArr3 != null) {
                if (requester.args[0] instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) requester.args[0];
                    if (!z || !isSameReference(tL_inputMediaDocument3.id.file_reference, bArr)) {
                        tL_inputMediaDocument3.id.file_reference = bArr;
                        obj = tL_inputMediaDocument3;
                        iIndexOf = ((TLRPC.TL_inputMediaPaidMedia) tL_sendMessage.media).extended_media.indexOf(obj);
                        if (iIndexOf >= 0) {
                            arrayList = (ArrayList) objArr3[3];
                            arrayList.set(iIndexOf, null);
                            z2 = true;
                            for (i = 0; i < arrayList.size(); i++) {
                                if (arrayList.get(i) != null) {
                                    z2 = false;
                                }
                            }
                            if (z2) {
                                this.multiMediaCache.remove(tL_sendMessage);
                                AndroidUtilities.runOnUIThread(new FileRefController$$ExternalSyntheticLambda7(this, tL_sendMessage, objArr3, 1));
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) requester.args[0];
                    if (!z || !isSameReference(tL_inputMediaPhoto3.id.file_reference, bArr)) {
                        tL_inputMediaPhoto3.id.file_reference = bArr;
                        obj = tL_inputMediaPhoto3;
                    }
                    return false;
                }
                obj = null;
                iIndexOf = ((TLRPC.TL_inputMediaPaidMedia) tL_sendMessage.media).extended_media.indexOf(obj);
                if (iIndexOf >= 0) {
                    arrayList = (ArrayList) objArr3[3];
                    arrayList.set(iIndexOf, null);
                    z2 = true;
                    while (i < arrayList.size()) {
                        if (arrayList.get(i) != null) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        this.multiMediaCache.remove(tL_sendMessage);
                        AndroidUtilities.runOnUIThread(new FileRefController$$ExternalSyntheticLambda7(this, tL_sendMessage, objArr3, 1));
                        return true;
                    }
                }
            }
            return true;
        }
        if (requester.args[0] instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) requester.args[0]).media;
            if (!(inputMedia2 instanceof TLRPC.TL_inputMediaDocument)) {
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                    if (!z || !isSameReference(tL_inputMediaPhoto4.id.file_reference, bArr)) {
                        tL_inputMediaPhoto4.id.file_reference = bArr;
                    }
                }
                final int i4 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f$0.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f$0.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f$0.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia2;
            if (!z || !isSameReference(tL_inputMediaDocument4.id.file_reference, bArr)) {
                tL_inputMediaDocument4.id.file_reference = bArr;
                final int i5 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                this.f$0.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f$0.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f$0.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f$0.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
        } else if (requester.args[0] instanceof TL_ephemeral.TL_sendMessage) {
            TLRPC.InputMedia inputMedia3 = ((TL_ephemeral.TL_sendMessage) requester.args[0]).media;
            if (!(inputMedia3 instanceof TLRPC.TL_inputMediaDocument)) {
                if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                    if (!z || !isSameReference(tL_inputMediaPhoto5.id.file_reference, bArr)) {
                        tL_inputMediaPhoto5.id.file_reference = bArr;
                    }
                }
                final int i6 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i6) {
                            case 0:
                                this.f$0.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f$0.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f$0.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f$0.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia3;
            if (!z || !isSameReference(tL_inputMediaDocument5.id.file_reference, bArr)) {
                tL_inputMediaDocument5.id.file_reference = bArr;
                final int i7 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i7) {
                            case 0:
                                this.f$0.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f$0.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f$0.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f$0.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
        } else if (requester.args[0] instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_editMessage) requester.args[0]).media;
            if (!(inputMedia4 instanceof TLRPC.TL_inputMediaDocument)) {
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto6 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                    if (!z || !isSameReference(tL_inputMediaPhoto6.id.file_reference, bArr)) {
                        tL_inputMediaPhoto6.id.file_reference = bArr;
                    }
                }
                final int i8 = 2;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i8) {
                            case 0:
                                this.f$0.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f$0.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f$0.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f$0.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia4;
            if (!z || !isSameReference(tL_inputMediaDocument6.id.file_reference, bArr)) {
                tL_inputMediaDocument6.id.file_reference = bArr;
                final int i9 = 2;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i9) {
                            case 0:
                                this.f$0.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f$0.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f$0.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f$0.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
        } else {
            if ((requester.args[0] instanceof TLRPC.InputPhoto) || (requester.args[0] instanceof TLRPC.InputDocument)) {
                if (requester.args[0] instanceof TLRPC.InputPhoto) {
                    TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) requester.args[0];
                    if (!z || !isSameReference(inputPhoto.file_reference, bArr)) {
                        inputPhoto.file_reference = bArr;
                        if (requester.args.length > 1 && (requester.args[1] instanceof Runnable)) {
                            AndroidUtilities.runOnUIThread((Runnable) requester.args[1]);
                        }
                    }
                } else {
                    TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) requester.args[0];
                    if (!z || !isSameReference(inputDocument.file_reference, bArr)) {
                        inputDocument.file_reference = bArr;
                        if (requester.args.length > 1) {
                            AndroidUtilities.runOnUIThread((Runnable) requester.args[1]);
                        }
                    }
                }
                return true;
            }
            if (requester.args[0] instanceof TLRPC.TL_messages_addPollAnswer) {
                TLRPC.InputMedia inputMedia5 = ((TLRPC.TL_messages_addPollAnswer) requester.args[0]).answer.input_media;
                if (!(inputMedia5 instanceof TLRPC.TL_inputMediaDocument)) {
                    if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto7 = (TLRPC.TL_inputMediaPhoto) inputMedia5;
                        if (!z || !isSameReference(tL_inputMediaPhoto7.id.file_reference, bArr)) {
                            tL_inputMediaPhoto7.id.file_reference = bArr;
                        }
                    }
                    final int i10 = 3;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final FileRefController f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.f$0.lambda$onUpdateObjectReference$33(requester);
                                    break;
                                case 1:
                                    this.f$0.lambda$onUpdateObjectReference$34(requester);
                                    break;
                                case 2:
                                    this.f$0.lambda$onUpdateObjectReference$35(requester);
                                    break;
                                default:
                                    this.f$0.lambda$onUpdateObjectReference$36(requester);
                                    break;
                            }
                        }
                    });
                    return true;
                }
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                if (!z || !isSameReference(tL_inputMediaDocument7.id.file_reference, bArr)) {
                    tL_inputMediaDocument7.id.file_reference = bArr;
                    final int i11 = 3;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final FileRefController f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.f$0.lambda$onUpdateObjectReference$33(requester);
                                    break;
                                case 1:
                                    this.f$0.lambda$onUpdateObjectReference$34(requester);
                                    break;
                                case 2:
                                    this.f$0.lambda$onUpdateObjectReference$35(requester);
                                    break;
                                default:
                                    this.f$0.lambda$onUpdateObjectReference$36(requester);
                                    break;
                            }
                        }
                    });
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_messages_saveGif) {
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) requester.args[0];
                if (!z || !isSameReference(tL_messages_saveGif.id.file_reference, bArr)) {
                    tL_messages_saveGif.id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_messages_saveGif, new FileRefController$$ExternalSyntheticLambda11(5));
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_messages_saveRecentSticker) {
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) requester.args[0];
                if (!z || !isSameReference(tL_messages_saveRecentSticker.id.file_reference, bArr)) {
                    tL_messages_saveRecentSticker.id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new FileRefController$$ExternalSyntheticLambda11(6));
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_stickers_addStickerToSet) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) requester.args[0];
                if (!z || !isSameReference(tL_stickers_addStickerToSet.sticker.document.file_reference, bArr)) {
                    tL_stickers_addStickerToSet.sticker.document.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_stickers_addStickerToSet, new FileRefController$$ExternalSyntheticLambda11(7));
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_messages_faveSticker) {
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) requester.args[0];
                if (!z || !isSameReference(tL_messages_faveSticker.id.file_reference, bArr)) {
                    tL_messages_faveSticker.id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new FileRefController$$ExternalSyntheticLambda11(0));
                    return true;
                }
            } else {
                if (!(requester.args[0] instanceof TLRPC.TL_messages_getAttachedStickers)) {
                    if (requester.args[1] instanceof FileLoadOperation) {
                        FileLoadOperation fileLoadOperation = (FileLoadOperation) requester.args[1];
                        if (inputFileLocation != null) {
                            if (!z || !isSameReference(fileLoadOperation.location.file_reference, inputFileLocation.file_reference)) {
                                strBytesToHex = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                                fileLoadOperation.location = inputFileLocation;
                                if (BuildVars.LOGS_ENABLED) {
                                    strBytesToHex2 = Utilities.bytesToHex(inputFileLocation.file_reference);
                                }
                                fileLoadOperation.requestingReference = false;
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("debug_loading: " + fileLoadOperation.getCacheFileFinal().getName() + " " + strBytesToHex + " " + strBytesToHex2 + " reference updated resume download");
                                }
                                fileLoadOperation.startDownloadRequest(-1);
                                return true;
                            }
                        } else if (!z || !isSameReference(requester.location.file_reference, bArr)) {
                            String strBytesToHex3 = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                            TLRPC.InputFileLocation inputFileLocation2 = fileLoadOperation.location;
                            requester.location.file_reference = bArr;
                            inputFileLocation2.file_reference = bArr;
                            strBytesToHex2 = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                            strBytesToHex = strBytesToHex3;
                            fileLoadOperation.requestingReference = false;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("debug_loading: " + fileLoadOperation.getCacheFileFinal().getName() + " " + strBytesToHex + " " + strBytesToHex2 + " reference updated resume download");
                            }
                            fileLoadOperation.startDownloadRequest(-1);
                            return true;
                        }
                    }
                    return true;
                }
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) requester.args[0];
                TLRPC.InputStickeredMedia inputStickeredMedia = tL_messages_getAttachedStickers.media;
                if (!(inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument)) {
                    if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                        TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                        if (!z || !isSameReference(tL_inputStickeredMediaPhoto.id.file_reference, bArr)) {
                            tL_inputStickeredMediaPhoto.id.file_reference = bArr;
                        }
                    }
                    getConnectionsManager().sendRequest(tL_messages_getAttachedStickers, (RequestDelegate) requester.args[1]);
                    return true;
                }
                TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                if (!z || !isSameReference(tL_inputStickeredMediaDocument.id.file_reference, bArr)) {
                    tL_inputStickeredMediaDocument.id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_messages_getAttachedStickers, (RequestDelegate) requester.args[1]);
                    return true;
                }
            }
        }
        return false;
    }

    private void putReponseToCache(String str, TLObject tLObject) {
        if (this.responseCache.get(str) == null) {
            CachedResult cachedResult = new CachedResult();
            cachedResult.response = tLObject;
            cachedResult.firstQueryTime = System.currentTimeMillis();
            this.responseCache.put(str, cachedResult);
        }
    }

    private void requestReferenceFromServer(Object obj, final String str, final String str2, Object[] objArr) {
        if (obj instanceof StoriesController.BotPreview) {
            StoriesController.BotPreview botPreview = (StoriesController.BotPreview) obj;
            StoriesController.BotPreviewsList botPreviewsList = botPreview.list;
            if (botPreviewsList == null) {
                sendErrorToObject(objArr, 0);
                return;
            }
            EglRenderer$$ExternalSyntheticLambda6 eglRenderer$$ExternalSyntheticLambda6 = new EglRenderer$$ExternalSyntheticLambda6(botPreviewsList, botPreview, new FileRefController$$ExternalSyntheticLambda21(this, str, str2, 0), 1);
            if (botPreviewsList.reqId != 0) {
                ConnectionsManager.getInstance(botPreviewsList.currentAccount).cancelRequest(botPreviewsList.reqId, true);
                botPreviewsList.reqId = 0;
            }
            botPreviewsList.loading = false;
            botPreviewsList.loaded = false;
            botPreviewsList.loadInternal(eglRenderer$$ExternalSyntheticLambda6);
            return;
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = getMessagesController().getInputPeer(storyItem.dialogId);
            tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
            final int i = 7;
            getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_help_premiumPromo) {
            final int i2 = 16;
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_availableReaction) {
            TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
            tL_messages_getAvailableReactions.hash = 0;
            final int i3 = 17;
            getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TL_bots.BotInfo) {
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.id = getMessagesController().getInputUser(((TL_bots.BotInfo) obj).user_id);
            final int i4 = 18;
            getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
            tL_messages_getAttachMenuBot.bot = getMessagesController().getInputUser(((TLRPC.TL_attachMenuBot) obj).bot_id);
            final int i5 = 19;
            getConnectionsManager().sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i5) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            long channelId = messageObject.getChannelId();
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(messageObject.getDialogId());
            if (messageObject.scheduled) {
                TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                tL_messages_getScheduledMessages.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
                tL_messages_getScheduledMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                final int i6 = 20;
                getConnectionsManager().sendRequest(tL_messages_getScheduledMessages, new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i6) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            if (messageObject.isQuickReply()) {
                TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                tL_messages_getQuickReplyMessages.shortcut_id = messageObject.getQuickReplyId();
                tL_messages_getQuickReplyMessages.flags |= 1;
                tL_messages_getQuickReplyMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                final int i7 = 21;
                getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i7) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.rich_message != null && inputPeer != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.id = messageObject.getRealId();
                final int i8 = 22;
                getConnectionsManager().sendRequest(getrichmessage, new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i8) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            if (channelId == 0) {
                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                tL_messages_getMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                final int i9 = 0;
                getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i9) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = getMessagesController().getInputChannel(channelId);
            tL_channels_getMessages.id.add(Integer.valueOf(messageObject.getRealId()));
            final int i10 = 23;
            getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i10) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
            tL_inputWallPaper.id = tL_wallPaper.id;
            tL_inputWallPaper.access_hash = tL_wallPaper.access_hash;
            getwallpaper.wallpaper = tL_inputWallPaper;
            final int i11 = 1;
            getConnectionsManager().sendRequest(getwallpaper, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i11) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_theme) {
            TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj;
            TL_account.getTheme gettheme = new TL_account.getTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            gettheme.theme = tL_inputTheme;
            gettheme.format = "android";
            final int i12 = 2;
            getConnectionsManager().sendRequest(gettheme, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i12) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.WebPage) {
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = ((TLRPC.WebPage) obj).url;
            tL_messages_getWebPage.hash = 0;
            final int i13 = 3;
            getConnectionsManager().sendRequest(tL_messages_getWebPage, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i13) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(getMessagesController().getInputUser((TLRPC.User) obj));
            final int i14 = 4;
            getConnectionsManager().sendRequest(tL_users_getUsers, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i14) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat instanceof TLRPC.TL_chat) {
                TLRPC.TL_messages_getChats tL_messages_getChats = new TLRPC.TL_messages_getChats();
                tL_messages_getChats.id.add(Long.valueOf(chat.id));
                final int i15 = 5;
                getConnectionsManager().sendRequest(tL_messages_getChats, new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i15) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            if ((chat instanceof TLRPC.TL_channel) || (chat instanceof TLRPC.TL_community)) {
                TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                tL_channels_getChannels.id.add(MessagesController.getInputChannel(chat));
                final int i16 = 6;
                getConnectionsManager().sendRequest(tL_channels_getChannels, new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i16) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
                TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) obj).set;
                tL_inputStickerSetID.id = stickerSet.id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                final int i17 = 13;
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i17) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            if (!(obj instanceof TLRPC.StickerSetCovered)) {
                if (!(obj instanceof TLRPC.InputStickerSet)) {
                    sendErrorToObject(objArr, 0);
                    return;
                }
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet2 = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet2.stickerset = (TLRPC.InputStickerSet) obj;
                final int i18 = 15;
                getConnectionsManager().sendRequest(tL_messages_getStickerSet2, new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i18) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet3 = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet3.stickerset = tL_inputStickerSetID2;
            TLRPC.StickerSet stickerSet2 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet2.id;
            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
            final int i19 = 14;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet3, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i19) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        String str3 = (String) obj;
        if ("wallpaper".equals(str3)) {
            if (this.wallpaperWaiters.isEmpty()) {
                final int i20 = 0;
                getConnectionsManager().sendRequest(new TL_account.getWallPapers(), new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i20) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                break;
                        }
                    }
                });
            }
            this.wallpaperWaiters.add(new Waiter(str, str2));
            return;
        }
        if (str3.startsWith("gif")) {
            if (this.savedGifsWaiters.isEmpty()) {
                final int i21 = 1;
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSavedGifs(), new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i21) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                break;
                        }
                    }
                });
            }
            this.savedGifsWaiters.add(new Waiter(str, str2));
            return;
        }
        if ("recent".equals(str3)) {
            if (this.recentStickersWaiter.isEmpty()) {
                final int i22 = 2;
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getRecentStickers(), new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i22) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                break;
                        }
                    }
                });
            }
            this.recentStickersWaiter.add(new Waiter(str, str2));
            return;
        }
        if ("fav".equals(str3)) {
            if (this.favStickersWaiter.isEmpty()) {
                final int i23 = 3;
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getFavedStickers(), new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i23) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                break;
                        }
                    }
                });
            }
            this.favStickersWaiter.add(new Waiter(str, str2));
            return;
        }
        if ("update".equals(str3)) {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            final int i24 = 8;
            getConnectionsManager().sendRequest(tL_help_getAppUpdate, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i24) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (str3.startsWith("avatar_")) {
            long jLongValue = Utilities.parseLong(str3).longValue();
            if (jLongValue > 0) {
                TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
                tL_photos_getUserPhotos.limit = 80;
                tL_photos_getUserPhotos.offset = 0;
                tL_photos_getUserPhotos.max_id = 0L;
                tL_photos_getUserPhotos.user_id = getMessagesController().getInputUser(jLongValue);
                final int i25 = 9;
                getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i25) {
                            case 0:
                                this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterChatPhotos();
            tL_messages_search.limit = 80;
            tL_messages_search.offset_id = 0;
            tL_messages_search.q = "";
            tL_messages_search.peer = getMessagesController().getInputPeer(jLongValue);
            final int i26 = 10;
            getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i26) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (!str3.startsWith("sent_")) {
            sendErrorToObject(objArr, 0);
            return;
        }
        String[] strArrSplit = str3.split("_");
        if (strArrSplit.length < 3) {
            sendErrorToObject(objArr, 0);
            return;
        }
        long jLongValue2 = Utilities.parseLong(strArrSplit[1]).longValue();
        if (jLongValue2 == 0) {
            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages2.id.add(Utilities.parseInt((CharSequence) strArrSplit[2]));
            final int i27 = 12;
            getConnectionsManager().sendRequest(tL_messages_getMessages2, new RequestDelegate(this) {
                public final FileRefController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i27) {
                        case 0:
                            this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages2 = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages2.channel = getMessagesController().getInputChannel(jLongValue2);
        tL_channels_getMessages2.id.add(Utilities.parseInt((CharSequence) strArrSplit[2]));
        final int i28 = 11;
        getConnectionsManager().sendRequest(tL_channels_getMessages2, new RequestDelegate(this) {
            public final FileRefController f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                switch (i28) {
                    case 0:
                        this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                        break;
                    case 1:
                        this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                        break;
                    case 2:
                        this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                        break;
                    case 3:
                        this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                        break;
                    case 4:
                        this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                        break;
                    case 5:
                        this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                        break;
                    case 6:
                        this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                        break;
                    case 7:
                        this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                        break;
                    case 8:
                        this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                        break;
                    case 9:
                        this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                        break;
                    case 10:
                        this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                        break;
                    case 11:
                        this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                        break;
                    case 12:
                        this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                        break;
                    case 13:
                        this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                        break;
                    case 14:
                        this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                        break;
                    case 15:
                        this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                        break;
                    case 16:
                        this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                        break;
                    case 17:
                        this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                        break;
                    case 18:
                        this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                        break;
                    case 19:
                        this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                        break;
                    case 20:
                        this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                        break;
                    case 21:
                        this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                        break;
                    case 22:
                        this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                        break;
                    default:
                        this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                        break;
                }
            }
        });
    }

    private void sendErrorToObject(final Object[] objArr, int i) {
        boolean z;
        boolean z2;
        Object obj;
        TLRPC.InputMedia inputMedia;
        Object obj2 = objArr[0];
        if (obj2 instanceof TLRPC.TL_inputSingleMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) objArr[1];
            Object[] objArr2 = this.multiMediaCache.get(tL_messages_sendMultiMedia);
            if (objArr2 != null) {
                this.multiMediaCache.remove(tL_messages_sendMultiMedia);
                AndroidUtilities.runOnUIThread(new FileRefController$$ExternalSyntheticLambda5(this, tL_messages_sendMultiMedia, objArr2, 0));
                return;
            }
            return;
        }
        boolean z3 = obj2 instanceof TLRPC.TL_inputMediaDocument;
        if (z3 || (obj2 instanceof TLRPC.TL_inputMediaPhoto)) {
            Object obj3 = objArr[1];
            if (obj3 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj3;
                Object[] objArr3 = this.multiMediaCache.get(tL_messages_sendMedia);
                if (objArr3 != null) {
                    this.multiMediaCache.remove(tL_messages_sendMedia);
                    AndroidUtilities.runOnUIThread(new FileRefController$$ExternalSyntheticLambda6(this, tL_messages_sendMedia, objArr3, 0));
                    return;
                }
                return;
            }
        }
        if (z3 || (obj2 instanceof TLRPC.TL_inputMediaPhoto)) {
            Object obj4 = objArr[1];
            if (obj4 instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) obj4;
                Object[] objArr4 = this.multiMediaCache.get(tL_sendMessage);
                if (objArr4 != null) {
                    this.multiMediaCache.remove(tL_sendMessage);
                    AndroidUtilities.runOnUIThread(new FileRefController$$ExternalSyntheticLambda7(this, tL_sendMessage, objArr4, 0));
                    return;
                }
                return;
            }
        }
        if (obj2 instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) obj2).media;
            if ((inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) || (inputMedia2 instanceof TLRPC.TL_inputMediaPoll)) {
                z = obj2 instanceof TLRPC.TL_messages_editMessage;
                if (!z && !((z2 = obj2 instanceof TLRPC.TL_messages_addPollAnswer))) {
                    if (obj2 instanceof TL_ephemeral.TL_sendMessage) {
                        inputMedia = ((TL_ephemeral.TL_sendMessage) obj2).media;
                        if ((inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) || (inputMedia instanceof TLRPC.TL_inputMediaPoll)) {
                            if (!z && !z2) {
                                if (!(obj2 instanceof TLRPC.TL_messages_saveGif) || (obj2 instanceof TLRPC.TL_messages_saveRecentSticker) || (obj2 instanceof TLRPC.TL_stickers_addStickerToSet) || (obj2 instanceof TLRPC.TL_messages_faveSticker)) {
                                    return;
                                }
                                if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                                    getConnectionsManager().sendRequest((TLRPC.TL_messages_getAttachedStickers) obj2, (RequestDelegate) objArr[1]);
                                    return;
                                }
                                obj = objArr[1];
                                if (obj instanceof FileLoadOperation) {
                                    FileLoadOperation fileLoadOperation = (FileLoadOperation) obj;
                                    fileLoadOperation.requestingReference = false;
                                    FileLog.e("debug_loading: " + fileLoadOperation.getCacheFileFinal().getName() + " reference can't update: fail operation ");
                                    fileLoadOperation.onFail(false, 0);
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (!z) {
                        if (!(obj2 instanceof TLRPC.TL_messages_saveGif)) {
                            return;
                        }
                        if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                            getConnectionsManager().sendRequest((TLRPC.TL_messages_getAttachedStickers) obj2, (RequestDelegate) objArr[1]);
                            return;
                        }
                        obj = objArr[1];
                        if (obj instanceof FileLoadOperation) {
                            FileLoadOperation fileLoadOperation2 = (FileLoadOperation) obj;
                            fileLoadOperation2.requestingReference = false;
                            FileLog.e("debug_loading: " + fileLoadOperation2.getCacheFileFinal().getName() + " reference can't update: fail operation ");
                            fileLoadOperation2.onFail(false, 0);
                            return;
                        }
                        return;
                    }
                    final int i2 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final FileRefController f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    this.f$0.lambda$sendErrorToObject$45(objArr);
                                    break;
                                default:
                                    this.f$0.lambda$sendErrorToObject$44(objArr);
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        } else {
            z = obj2 instanceof TLRPC.TL_messages_editMessage;
            if (!z) {
                if (obj2 instanceof TL_ephemeral.TL_sendMessage) {
                    inputMedia = ((TL_ephemeral.TL_sendMessage) obj2).media;
                    if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                        if (!z) {
                            if (!(obj2 instanceof TLRPC.TL_messages_saveGif)) {
                                return;
                            }
                            if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                                getConnectionsManager().sendRequest((TLRPC.TL_messages_getAttachedStickers) obj2, (RequestDelegate) objArr[1]);
                                return;
                            }
                            obj = objArr[1];
                            if (obj instanceof FileLoadOperation) {
                                FileLoadOperation fileLoadOperation3 = (FileLoadOperation) obj;
                                fileLoadOperation3.requestingReference = false;
                                FileLog.e("debug_loading: " + fileLoadOperation3.getCacheFileFinal().getName() + " reference can't update: fail operation ");
                                fileLoadOperation3.onFail(false, 0);
                                return;
                            }
                            return;
                        }
                    } else if (!z) {
                        if (!(obj2 instanceof TLRPC.TL_messages_saveGif)) {
                            return;
                        }
                        if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                            getConnectionsManager().sendRequest((TLRPC.TL_messages_getAttachedStickers) obj2, (RequestDelegate) objArr[1]);
                            return;
                        }
                        obj = objArr[1];
                        if (obj instanceof FileLoadOperation) {
                            FileLoadOperation fileLoadOperation4 = (FileLoadOperation) obj;
                            fileLoadOperation4.requestingReference = false;
                            FileLog.e("debug_loading: " + fileLoadOperation4.getCacheFileFinal().getName() + " reference can't update: fail operation ");
                            fileLoadOperation4.onFail(false, 0);
                            return;
                        }
                        return;
                    }
                } else if (!z) {
                    if (!(obj2 instanceof TLRPC.TL_messages_saveGif)) {
                        return;
                    }
                    if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                        getConnectionsManager().sendRequest((TLRPC.TL_messages_getAttachedStickers) obj2, (RequestDelegate) objArr[1]);
                        return;
                    }
                    obj = objArr[1];
                    if (obj instanceof FileLoadOperation) {
                        FileLoadOperation fileLoadOperation5 = (FileLoadOperation) obj;
                        fileLoadOperation5.requestingReference = false;
                        FileLog.e("debug_loading: " + fileLoadOperation5.getCacheFileFinal().getName() + " reference can't update: fail operation ");
                        fileLoadOperation5.onFail(false, 0);
                        return;
                    }
                    return;
                }
                final int i3 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final FileRefController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$sendErrorToObject$45(objArr);
                                break;
                            default:
                                this.f$0.lambda$sendErrorToObject$44(objArr);
                                break;
                        }
                    }
                });
                return;
            }
        }
        final int i4 = 1;
        AndroidUtilities.runOnUIThread(new Runnable(this) {
            public final FileRefController f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$sendErrorToObject$45(objArr);
                        break;
                    default:
                        this.f$0.lambda$sendErrorToObject$44(objArr);
                        break;
                }
            }
        });
    }

    private boolean updateFileReferenceFromCache(byte[] bArr, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation inputFileLocation2, String str, Object... objArr) {
        String strBytesToHex;
        Object obj = objArr[0];
        if (obj instanceof TL_stories.TL_storyItem) {
            ((TL_stories.TL_storyItem) obj).media.document.file_reference = bArr;
            return true;
        }
        if (obj instanceof TLRPC.TL_inputSingleMedia) {
            return false;
        }
        if (objArr.length >= 2) {
            Object obj2 = objArr[1];
            if ((obj2 instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && ((obj instanceof TLRPC.TL_inputMediaPhoto) || (obj instanceof TLRPC.TL_inputMediaDocument))) {
                return false;
            }
        }
        if (objArr.length >= 2) {
            Object obj3 = objArr[1];
            if ((obj3 instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) obj3).media instanceof TLRPC.TL_inputMediaPoll) && ((obj instanceof TLRPC.TL_inputMediaPhoto) || (obj instanceof TLRPC.TL_inputMediaDocument))) {
                return false;
            }
        }
        if (objArr.length >= 2) {
            Object obj4 = objArr[1];
            if ((obj4 instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) obj4).media instanceof TLRPC.TL_inputMediaPaidMedia) && ((obj instanceof TLRPC.TL_inputMediaPhoto) || (obj instanceof TLRPC.TL_inputMediaDocument))) {
                return false;
            }
        }
        if (objArr.length >= 2) {
            Object obj5 = objArr[1];
            if ((obj5 instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) obj5).media instanceof TLRPC.TL_inputMediaPoll) && ((obj instanceof TLRPC.TL_inputMediaPhoto) || (obj instanceof TLRPC.TL_inputMediaDocument))) {
                return false;
            }
        }
        if (obj instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) obj).media;
            if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                if (isSameReference(tL_inputMediaDocument.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument.id.file_reference = bArr;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                if (isSameReference(tL_inputMediaPhoto.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto.id.file_reference = bArr;
            }
        } else if (obj instanceof TL_ephemeral.TL_sendMessage) {
            TLRPC.InputMedia inputMedia2 = ((TL_ephemeral.TL_sendMessage) obj).media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                if (isSameReference(tL_inputMediaDocument2.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument2.id.file_reference = bArr;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                if (isSameReference(tL_inputMediaPhoto2.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto2.id.file_reference = bArr;
            }
        } else if (obj instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.InputMedia inputMedia3 = ((TLRPC.TL_messages_editMessage) obj).media;
            if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                if (isSameReference(tL_inputMediaDocument3.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument3.id.file_reference = bArr;
            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                if (isSameReference(tL_inputMediaPhoto3.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto3.id.file_reference = bArr;
            }
        } else if (obj instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_addPollAnswer) obj).answer.input_media;
            if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                if (isSameReference(tL_inputMediaDocument4.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument4.id.file_reference = bArr;
            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                if (isSameReference(tL_inputMediaPhoto4.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto4.id.file_reference = bArr;
            }
        } else if (obj instanceof TLRPC.TL_messages_saveGif) {
            TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
            if (isSameReference(tL_messages_saveGif.id.file_reference, bArr)) {
                return false;
            }
            tL_messages_saveGif.id.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_messages_saveRecentSticker) {
            TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
            if (isSameReference(tL_messages_saveRecentSticker.id.file_reference, bArr)) {
                return false;
            }
            tL_messages_saveRecentSticker.id.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_stickers_addStickerToSet) {
            TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
            if (isSameReference(tL_stickers_addStickerToSet.sticker.document.file_reference, bArr)) {
                return false;
            }
            tL_stickers_addStickerToSet.sticker.document.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_messages_faveSticker) {
            TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
            if (isSameReference(tL_messages_faveSticker.id.file_reference, bArr)) {
                return false;
            }
            tL_messages_faveSticker.id.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_messages_getAttachedStickers) {
            TLRPC.InputStickeredMedia inputStickeredMedia = ((TLRPC.TL_messages_getAttachedStickers) obj).media;
            if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument) {
                TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                if (isSameReference(tL_inputStickeredMediaDocument.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputStickeredMediaDocument.id.file_reference = bArr;
            } else if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                if (isSameReference(tL_inputStickeredMediaPhoto.id.file_reference, bArr)) {
                    return false;
                }
                tL_inputStickeredMediaPhoto.id.file_reference = bArr;
            }
        } else {
            Object obj6 = objArr[1];
            if (obj6 instanceof FileLoadOperation) {
                FileLoadOperation fileLoadOperation = (FileLoadOperation) obj6;
                String strBytesToHex2 = null;
                if (inputFileLocation != null) {
                    if (isSameReference(fileLoadOperation.location.file_reference, inputFileLocation.file_reference)) {
                        return false;
                    }
                    strBytesToHex = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                    fileLoadOperation.location = inputFileLocation;
                    if (BuildVars.LOGS_ENABLED) {
                        strBytesToHex2 = Utilities.bytesToHex(inputFileLocation.file_reference);
                    }
                } else {
                    if (isSameReference(inputFileLocation2.file_reference, bArr)) {
                        return false;
                    }
                    String strBytesToHex3 = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                    TLRPC.InputFileLocation inputFileLocation3 = fileLoadOperation.location;
                    inputFileLocation2.file_reference = bArr;
                    inputFileLocation3.file_reference = bArr;
                    strBytesToHex2 = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(bArr) : null;
                    strBytesToHex = strBytesToHex3;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_loading: from fileref cache updated fileref from " + strBytesToHex + " to " + strBytesToHex2);
                }
            }
        }
        return true;
    }

    public boolean applyCachedFileReference(Object obj, Object... objArr) throws FileNotFoundException {
        String str;
        Object[] objArr2;
        Pair<byte[], TLRPC.InputFileLocation> fileReferenceFromResponse;
        Pair<TLRPC.InputFileLocation, String> locationAndKey = getLocationAndKey(obj, objArr);
        if (locationAndKey == null) {
            return false;
        }
        TLRPC.InputFileLocation inputFileLocation = (TLRPC.InputFileLocation) locationAndKey.first;
        String str2 = (String) locationAndKey.second;
        String keyForParentObject = getKeyForParentObject(obj);
        if (keyForParentObject == null) {
            return false;
        }
        if (obj instanceof String) {
            String str3 = (String) obj;
            str = "wallpaper";
            if (!"wallpaper".equals(str3)) {
                str = "gif";
                if (!str3.startsWith("gif")) {
                    str = "recent";
                    if (!"recent".equals(str3)) {
                        str = "fav";
                        if (!"fav".equals(str3)) {
                            str = "update";
                            if (!"update".equals(str3)) {
                                str = str2;
                            }
                        }
                    }
                }
            }
        } else {
            str = str2;
        }
        CachedResult cachedResponse = getCachedResponse(str);
        if (cachedResponse != null) {
            objArr2 = objArr;
            Pair<byte[], TLRPC.InputFileLocation> fileReferenceFromResponse2 = getFileReferenceFromResponse(inputFileLocation, str2, keyForParentObject, cachedResponse.response, objArr2);
            if (fileReferenceFromResponse2 != null) {
                return updateFileReferenceFromCache((byte[]) fileReferenceFromResponse2.first, (TLRPC.InputFileLocation) fileReferenceFromResponse2.second, inputFileLocation, str2, objArr2);
            }
        } else {
            objArr2 = objArr;
        }
        CachedResult cachedResponse2 = getCachedResponse(keyForParentObject);
        if (cachedResponse2 == null || (fileReferenceFromResponse = getFileReferenceFromResponse(inputFileLocation, keyForParentObject, null, cachedResponse2.response, objArr2)) == null) {
            return false;
        }
        return updateFileReferenceFromCache((byte[]) fileReferenceFromResponse.first, (TLRPC.InputFileLocation) fileReferenceFromResponse.second, inputFileLocation, keyForParentObject, objArr2);
    }

    public Pair<TLRPC.InputFileLocation, String> getLocationAndKey(Object obj, Object... objArr) {
        Object obj2 = objArr[0];
        if (obj2 instanceof TLRPC.TL_messages_sendMultiMedia) {
            return null;
        }
        boolean z = obj2 instanceof TLRPC.TL_messages_sendMedia;
        if (z && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            return null;
        }
        if (z && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        boolean z2 = obj2 instanceof TL_ephemeral.TL_sendMessage;
        if (z2 && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            return null;
        }
        if (z2 && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        if (obj2 instanceof StoriesController.BotPreview) {
            StoriesController.BotPreview botPreview = (StoriesController.BotPreview) obj2;
            TLRPC.MessageMedia messageMedia = botPreview.media;
            if (messageMedia.document != null) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation.id = botPreview.media.document.id;
                return new Pair<>(tL_inputDocumentFileLocation, "botstory_doc_" + botPreview.media.document.id);
            }
            if (messageMedia.photo == null) {
                return new Pair<>(new TLRPC.TL_inputDocumentFileLocation(), "botstory_" + botPreview.id);
            }
            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
            tL_inputPhotoFileLocation.id = botPreview.media.photo.id;
            return new Pair<>(tL_inputPhotoFileLocation, "botstory_photo_" + botPreview.media.photo.id);
        }
        if (obj2 instanceof TL_stories.TL_storyItem) {
            TL_stories.TL_storyItem tL_storyItem = (TL_stories.TL_storyItem) obj2;
            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation2 = new TLRPC.TL_inputDocumentFileLocation();
            tL_inputDocumentFileLocation2.id = tL_storyItem.media.document.id;
            return new Pair<>(tL_inputDocumentFileLocation2, "story_" + tL_storyItem.id);
        }
        if (obj2 instanceof TLRPC.TL_inputSingleMedia) {
            TLRPC.InputMedia inputMedia = ((TLRPC.TL_inputSingleMedia) obj2).media;
            if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation3 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation3.id = tL_inputMediaDocument.id.id;
                return new Pair<>(tL_inputDocumentFileLocation3, "file_" + tL_inputMediaDocument.id.id);
            }
            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation2 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation2.id = tL_inputMediaPhoto.id.id;
                return new Pair<>(tL_inputPhotoFileLocation2, "photo_" + tL_inputMediaPhoto.id.id);
            }
        } else {
            if (obj2 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation4 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation4.id = tL_inputMediaDocument2.id.id;
                return new Pair<>(tL_inputDocumentFileLocation4, "file_" + tL_inputMediaDocument2.id.id);
            }
            if (obj2 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) obj2;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation3 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation3.id = tL_inputMediaPhoto2.id.id;
                return new Pair<>(tL_inputPhotoFileLocation3, "photo_" + tL_inputMediaPhoto2.id.id);
            }
            if (z) {
                TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) obj2).media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation5 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation5.id = tL_inputMediaDocument3.id.id;
                    return new Pair<>(tL_inputDocumentFileLocation5, "file_" + tL_inputMediaDocument3.id.id);
                }
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation4 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation4.id = tL_inputMediaPhoto3.id.id;
                    return new Pair<>(tL_inputPhotoFileLocation4, "photo_" + tL_inputMediaPhoto3.id.id);
                }
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia3 = tL_inputMediaPaidMedia.extended_media.get(0);
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation6 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation6.id = tL_inputMediaDocument4.id.id;
                            return new Pair<>(tL_inputDocumentFileLocation6, "file_" + tL_inputMediaDocument4.id.id);
                        }
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation5 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation5.id = tL_inputMediaPhoto4.id.id;
                            return new Pair<>(tL_inputPhotoFileLocation5, "photo_" + tL_inputMediaPhoto4.id.id);
                        }
                    }
                }
            } else if (z2) {
                TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) obj2).media;
                if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation7 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation7.id = tL_inputMediaDocument5.id.id;
                    return new Pair<>(tL_inputDocumentFileLocation7, "file_" + tL_inputMediaDocument5.id.id);
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation6 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation6.id = tL_inputMediaPhoto5.id.id;
                    return new Pair<>(tL_inputPhotoFileLocation6, "photo_" + tL_inputMediaPhoto5.id.id);
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia2.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia5 = tL_inputMediaPaidMedia2.extended_media.get(0);
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation8 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation8.id = tL_inputMediaDocument6.id.id;
                            return new Pair<>(tL_inputDocumentFileLocation8, "file_" + tL_inputMediaDocument6.id.id);
                        }
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto6 = (TLRPC.TL_inputMediaPhoto) inputMedia5;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation7 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation7.id = tL_inputMediaPhoto6.id.id;
                            return new Pair<>(tL_inputPhotoFileLocation7, "photo_" + tL_inputMediaPhoto6.id.id);
                        }
                    }
                }
            } else if (obj2 instanceof TLRPC.TL_messages_editMessage) {
                TLRPC.InputMedia inputMedia6 = ((TLRPC.TL_messages_editMessage) obj2).media;
                if (inputMedia6 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) inputMedia6;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation9 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation9.id = tL_inputMediaDocument7.id.id;
                    return new Pair<>(tL_inputDocumentFileLocation9, "file_" + tL_inputMediaDocument7.id.id);
                }
                if (inputMedia6 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto7 = (TLRPC.TL_inputMediaPhoto) inputMedia6;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation8 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation8.id = tL_inputMediaPhoto7.id.id;
                    return new Pair<>(tL_inputPhotoFileLocation8, "photo_" + tL_inputMediaPhoto7.id.id);
                }
            } else {
                if (obj2 instanceof TLRPC.InputPhoto) {
                    TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) obj2;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation9 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation9.id = inputPhoto.id;
                    return new Pair<>(tL_inputPhotoFileLocation9, "photo_" + inputPhoto.id);
                }
                if (obj2 instanceof TLRPC.InputDocument) {
                    TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) obj2;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation10 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation10.id = inputDocument.id;
                    return new Pair<>(tL_inputDocumentFileLocation10, "file_" + inputDocument.id);
                }
                if (obj2 instanceof TLRPC.TL_messages_addPollAnswer) {
                    TLRPC.InputMedia inputMedia7 = ((TLRPC.TL_messages_addPollAnswer) obj2).answer.input_media;
                    if (inputMedia7 instanceof TLRPC.TL_inputMediaDocument) {
                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument8 = (TLRPC.TL_inputMediaDocument) inputMedia7;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation11 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation11.id = tL_inputMediaDocument8.id.id;
                        return new Pair<>(tL_inputDocumentFileLocation11, "file_" + tL_inputMediaDocument8.id.id);
                    }
                    if (inputMedia7 instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto8 = (TLRPC.TL_inputMediaPhoto) inputMedia7;
                        TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation10 = new TLRPC.TL_inputPhotoFileLocation();
                        tL_inputPhotoFileLocation10.id = tL_inputMediaPhoto8.id.id;
                        return new Pair<>(tL_inputPhotoFileLocation10, "photo_" + tL_inputMediaPhoto8.id.id);
                    }
                } else {
                    if (obj2 instanceof TLRPC.TL_messages_saveGif) {
                        TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation12 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation12.id = tL_messages_saveGif.id.id;
                        return new Pair<>(tL_inputDocumentFileLocation12, "file_" + tL_messages_saveGif.id.id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_saveRecentSticker) {
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation13 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation13.id = tL_messages_saveRecentSticker.id.id;
                        return new Pair<>(tL_inputDocumentFileLocation13, "file_" + tL_messages_saveRecentSticker.id.id);
                    }
                    if (obj2 instanceof TLRPC.TL_stickers_addStickerToSet) {
                        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation14 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation14.id = tL_stickers_addStickerToSet.sticker.document.id;
                        return new Pair<>(tL_inputDocumentFileLocation14, "file_" + tL_stickers_addStickerToSet.sticker.document.id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_faveSticker) {
                        TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation15 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation15.id = tL_messages_faveSticker.id.id;
                        return new Pair<>(tL_inputDocumentFileLocation15, "file_" + tL_messages_faveSticker.id.id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                        TLRPC.InputStickeredMedia inputStickeredMedia = ((TLRPC.TL_messages_getAttachedStickers) obj2).media;
                        if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument) {
                            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation16 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation16.id = tL_inputStickeredMediaDocument.id.id;
                            return new Pair<>(tL_inputDocumentFileLocation16, "file_" + tL_inputStickeredMediaDocument.id.id);
                        }
                        if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation11 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation11.id = tL_inputStickeredMediaPhoto.id.id;
                            return new Pair<>(tL_inputPhotoFileLocation11, "photo_" + tL_inputStickeredMediaPhoto.id.id);
                        }
                    } else {
                        if (obj2 instanceof TLRPC.TL_inputFileLocation) {
                            TLRPC.TL_inputFileLocation tL_inputFileLocation = (TLRPC.TL_inputFileLocation) obj2;
                            return new Pair<>(tL_inputFileLocation, "loc_" + tL_inputFileLocation.local_id + "_" + tL_inputFileLocation.volume_id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputDocumentFileLocation) {
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation17 = (TLRPC.TL_inputDocumentFileLocation) obj2;
                            return new Pair<>(tL_inputDocumentFileLocation17, "file_" + tL_inputDocumentFileLocation17.id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputPhotoFileLocation) {
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation12 = (TLRPC.TL_inputPhotoFileLocation) obj2;
                            return new Pair<>(tL_inputPhotoFileLocation12, "photo_" + tL_inputPhotoFileLocation12.id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = (TLRPC.TL_inputPeerPhotoFileLocation) obj2;
                            return new Pair<>(tL_inputPeerPhotoFileLocation, "avatar_" + tL_inputPeerPhotoFileLocation.id);
                        }
                    }
                }
            }
        }
        return null;
    }

    public void requestReference(Object obj, Object... objArr) {
        Pair<TLRPC.InputFileLocation, String> locationAndKey;
        TLRPC.InputFileLocation inputFileLocation;
        String str;
        String keyForParentObject;
        ArrayList<Requester> arrayList;
        ArrayList<Requester> arrayList2;
        String str2;
        CachedResult cachedResponse;
        CachedResult cachedResponse2;
        String str3;
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        Object obj2;
        TLRPC.InputMedia inputMedia;
        int i = 0;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start loading request reference parent " + getObjectString(obj) + " args = " + objArr[0]);
        }
        Object obj3 = objArr[0];
        if (obj3 instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) obj3;
            ArrayList arrayList3 = (ArrayList) obj;
            this.multiMediaCache.put(tL_messages_sendMultiMedia, objArr);
            int size = tL_messages_sendMultiMedia.multi_media.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj4 = (TLRPC.TL_inputSingleMedia) tL_messages_sendMultiMedia.multi_media.get(i2);
                Object obj5 = arrayList3.get(i2);
                if (obj5 != null) {
                    requestReference(obj5, obj4, tL_messages_sendMultiMedia);
                }
            }
        } else if (obj3 instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj3;
            TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
            if ((inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
                TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                ArrayList arrayList4 = (ArrayList) obj;
                this.multiMediaCache.put(tL_messages_sendMedia, objArr);
                int size2 = tL_inputMediaPaidMedia.extended_media.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj6 = (TLRPC.InputMedia) tL_inputMediaPaidMedia.extended_media.get(i3);
                    Object obj7 = arrayList4.get(i3);
                    if (obj7 != null) {
                        requestReference(obj7, obj6, tL_messages_sendMedia);
                    }
                }
            } else if (obj3 instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) obj3;
                inputMedia = tL_sendMessage.media;
                if ((inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) || !(obj instanceof ArrayList)) {
                    locationAndKey = getLocationAndKey(obj, objArr);
                    if (locationAndKey == null) {
                        sendErrorToObject(objArr, 0);
                        return;
                    }
                    inputFileLocation = (TLRPC.InputFileLocation) locationAndKey.first;
                    str = (String) locationAndKey.second;
                    if (obj instanceof MessageObject) {
                        messageObject = (MessageObject) obj;
                        if (messageObject.getRealId() < 0 && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (obj2 = messageMedia.webpage) != null) {
                            obj = obj2;
                        }
                    }
                    keyForParentObject = getKeyForParentObject(obj);
                    if (keyForParentObject == null) {
                        sendErrorToObject(objArr, 0);
                        return;
                    }
                    Requester requester = new Requester();
                    requester.args = objArr;
                    requester.location = inputFileLocation;
                    requester.locationKey = str;
                    arrayList = this.locationRequester.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        this.locationRequester.put(str, arrayList);
                        i = 1;
                    }
                    arrayList.add(requester);
                    arrayList2 = this.parentRequester.get(keyForParentObject);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                        this.parentRequester.put(keyForParentObject, arrayList2);
                        i++;
                    }
                    arrayList2.add(requester);
                    if (i == 2) {
                        if (obj instanceof String) {
                            str3 = (String) obj;
                            str2 = "wallpaper";
                            if (!"wallpaper".equals(str3)) {
                                str2 = "gif";
                                if (!str3.startsWith("gif")) {
                                    str2 = "recent";
                                    if (!"recent".equals(str3)) {
                                        str2 = "fav";
                                        if (!"fav".equals(str3)) {
                                            str2 = "update";
                                            if (!"update".equals(str3)) {
                                                str2 = str;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            str2 = str;
                        }
                        cleanupCache();
                        cachedResponse = getCachedResponse(str2);
                        if (cachedResponse == null) {
                            cachedResponse2 = getCachedResponse(keyForParentObject);
                            if (cachedResponse2 != null) {
                                if (onRequestComplete(str, keyForParentObject, cachedResponse2.response, null, false, true)) {
                                    return;
                                } else {
                                    this.responseCache.remove(keyForParentObject);
                                }
                            }
                        } else if (onRequestComplete(str, keyForParentObject, cachedResponse.response, null, false, true)) {
                            return;
                        } else {
                            this.responseCache.remove(str);
                        }
                        requestReferenceFromServer(obj, str, keyForParentObject, objArr);
                    }
                } else {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia;
                    ArrayList arrayList5 = (ArrayList) obj;
                    this.multiMediaCache.put(tL_sendMessage, objArr);
                    int size3 = tL_inputMediaPaidMedia2.extended_media.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        Object obj8 = (TLRPC.InputMedia) tL_inputMediaPaidMedia2.extended_media.get(i4);
                        Object obj9 = arrayList5.get(i4);
                        if (obj9 != null) {
                            requestReference(obj9, obj8, tL_sendMessage);
                        }
                    }
                }
            } else {
                locationAndKey = getLocationAndKey(obj, objArr);
                if (locationAndKey == null) {
                    sendErrorToObject(objArr, 0);
                    return;
                }
                inputFileLocation = (TLRPC.InputFileLocation) locationAndKey.first;
                str = (String) locationAndKey.second;
                if (obj instanceof MessageObject) {
                    messageObject = (MessageObject) obj;
                    if (messageObject.getRealId() < 0) {
                        obj = obj2;
                    }
                }
                keyForParentObject = getKeyForParentObject(obj);
                if (keyForParentObject == null) {
                    sendErrorToObject(objArr, 0);
                    return;
                }
                Requester requester2 = new Requester();
                requester2.args = objArr;
                requester2.location = inputFileLocation;
                requester2.locationKey = str;
                arrayList = this.locationRequester.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.locationRequester.put(str, arrayList);
                    i = 1;
                }
                arrayList.add(requester2);
                arrayList2 = this.parentRequester.get(keyForParentObject);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    this.parentRequester.put(keyForParentObject, arrayList2);
                    i++;
                }
                arrayList2.add(requester2);
                if (i == 2) {
                    if (obj instanceof String) {
                        str3 = (String) obj;
                        str2 = "wallpaper";
                        if (!"wallpaper".equals(str3)) {
                            str2 = "gif";
                            if (!str3.startsWith("gif")) {
                                str2 = "recent";
                                if (!"recent".equals(str3)) {
                                    str2 = "fav";
                                    if (!"fav".equals(str3)) {
                                        str2 = "update";
                                        if (!"update".equals(str3)) {
                                            str2 = str;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        str2 = str;
                    }
                    cleanupCache();
                    cachedResponse = getCachedResponse(str2);
                    if (cachedResponse == null) {
                        cachedResponse2 = getCachedResponse(keyForParentObject);
                        if (cachedResponse2 != null) {
                            if (onRequestComplete(str, keyForParentObject, cachedResponse2.response, null, false, true)) {
                                return;
                            } else {
                                this.responseCache.remove(keyForParentObject);
                            }
                        }
                    } else if (onRequestComplete(str, keyForParentObject, cachedResponse.response, null, false, true)) {
                        return;
                    } else {
                        this.responseCache.remove(str);
                    }
                    requestReferenceFromServer(obj, str, keyForParentObject, objArr);
                }
            }
        } else if (obj3 instanceof TL_ephemeral.TL_sendMessage) {
            TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) obj3;
            inputMedia = tL_sendMessage2.media;
            if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                locationAndKey = getLocationAndKey(obj, objArr);
                if (locationAndKey == null) {
                    sendErrorToObject(objArr, 0);
                    return;
                }
                inputFileLocation = (TLRPC.InputFileLocation) locationAndKey.first;
                str = (String) locationAndKey.second;
                if (obj instanceof MessageObject) {
                    messageObject = (MessageObject) obj;
                    if (messageObject.getRealId() < 0) {
                        obj = obj2;
                    }
                }
                keyForParentObject = getKeyForParentObject(obj);
                if (keyForParentObject == null) {
                    sendErrorToObject(objArr, 0);
                    return;
                }
                Requester requester3 = new Requester();
                requester3.args = objArr;
                requester3.location = inputFileLocation;
                requester3.locationKey = str;
                arrayList = this.locationRequester.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.locationRequester.put(str, arrayList);
                    i = 1;
                }
                arrayList.add(requester3);
                arrayList2 = this.parentRequester.get(keyForParentObject);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    this.parentRequester.put(keyForParentObject, arrayList2);
                    i++;
                }
                arrayList2.add(requester3);
                if (i == 2) {
                    if (obj instanceof String) {
                        str3 = (String) obj;
                        str2 = "wallpaper";
                        if (!"wallpaper".equals(str3)) {
                            str2 = "gif";
                            if (!str3.startsWith("gif")) {
                                str2 = "recent";
                                if (!"recent".equals(str3)) {
                                    str2 = "fav";
                                    if (!"fav".equals(str3)) {
                                        str2 = "update";
                                        if (!"update".equals(str3)) {
                                            str2 = str;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        str2 = str;
                    }
                    cleanupCache();
                    cachedResponse = getCachedResponse(str2);
                    if (cachedResponse == null) {
                        cachedResponse2 = getCachedResponse(keyForParentObject);
                        if (cachedResponse2 != null) {
                            if (onRequestComplete(str, keyForParentObject, cachedResponse2.response, null, false, true)) {
                                return;
                            } else {
                                this.responseCache.remove(keyForParentObject);
                            }
                        }
                    } else if (onRequestComplete(str, keyForParentObject, cachedResponse.response, null, false, true)) {
                        return;
                    } else {
                        this.responseCache.remove(str);
                    }
                    requestReferenceFromServer(obj, str, keyForParentObject, objArr);
                }
            } else {
                locationAndKey = getLocationAndKey(obj, objArr);
                if (locationAndKey == null) {
                    sendErrorToObject(objArr, 0);
                    return;
                }
                inputFileLocation = (TLRPC.InputFileLocation) locationAndKey.first;
                str = (String) locationAndKey.second;
                if (obj instanceof MessageObject) {
                    messageObject = (MessageObject) obj;
                    if (messageObject.getRealId() < 0) {
                        obj = obj2;
                    }
                }
                keyForParentObject = getKeyForParentObject(obj);
                if (keyForParentObject == null) {
                    sendErrorToObject(objArr, 0);
                    return;
                }
                Requester requester4 = new Requester();
                requester4.args = objArr;
                requester4.location = inputFileLocation;
                requester4.locationKey = str;
                arrayList = this.locationRequester.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.locationRequester.put(str, arrayList);
                    i = 1;
                }
                arrayList.add(requester4);
                arrayList2 = this.parentRequester.get(keyForParentObject);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    this.parentRequester.put(keyForParentObject, arrayList2);
                    i++;
                }
                arrayList2.add(requester4);
                if (i == 2) {
                    if (obj instanceof String) {
                        str3 = (String) obj;
                        str2 = "wallpaper";
                        if (!"wallpaper".equals(str3)) {
                            str2 = "gif";
                            if (!str3.startsWith("gif")) {
                                str2 = "recent";
                                if (!"recent".equals(str3)) {
                                    str2 = "fav";
                                    if (!"fav".equals(str3)) {
                                        str2 = "update";
                                        if (!"update".equals(str3)) {
                                            str2 = str;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        str2 = str;
                    }
                    cleanupCache();
                    cachedResponse = getCachedResponse(str2);
                    if (cachedResponse == null) {
                        cachedResponse2 = getCachedResponse(keyForParentObject);
                        if (cachedResponse2 != null) {
                            if (onRequestComplete(str, keyForParentObject, cachedResponse2.response, null, false, true)) {
                                return;
                            } else {
                                this.responseCache.remove(keyForParentObject);
                            }
                        }
                    } else if (onRequestComplete(str, keyForParentObject, cachedResponse.response, null, false, true)) {
                        return;
                    } else {
                        this.responseCache.remove(str);
                    }
                    requestReferenceFromServer(obj, str, keyForParentObject, objArr);
                }
            }
        } else {
            locationAndKey = getLocationAndKey(obj, objArr);
            if (locationAndKey == null) {
                sendErrorToObject(objArr, 0);
                return;
            }
            inputFileLocation = (TLRPC.InputFileLocation) locationAndKey.first;
            str = (String) locationAndKey.second;
            if (obj instanceof MessageObject) {
                messageObject = (MessageObject) obj;
                if (messageObject.getRealId() < 0) {
                    obj = obj2;
                }
            }
            keyForParentObject = getKeyForParentObject(obj);
            if (keyForParentObject == null) {
                sendErrorToObject(objArr, 0);
                return;
            }
            Requester requester5 = new Requester();
            requester5.args = objArr;
            requester5.location = inputFileLocation;
            requester5.locationKey = str;
            arrayList = this.locationRequester.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.locationRequester.put(str, arrayList);
                i = 1;
            }
            arrayList.add(requester5);
            arrayList2 = this.parentRequester.get(keyForParentObject);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                this.parentRequester.put(keyForParentObject, arrayList2);
                i++;
            }
            arrayList2.add(requester5);
            if (i == 2) {
                if (obj instanceof String) {
                    str3 = (String) obj;
                    str2 = "wallpaper";
                    if (!"wallpaper".equals(str3)) {
                        str2 = "gif";
                        if (!str3.startsWith("gif")) {
                            str2 = "recent";
                            if (!"recent".equals(str3)) {
                                str2 = "fav";
                                if (!"fav".equals(str3)) {
                                    str2 = "update";
                                    if (!"update".equals(str3)) {
                                        str2 = str;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    str2 = str;
                }
                cleanupCache();
                cachedResponse = getCachedResponse(str2);
                if (cachedResponse == null) {
                    cachedResponse2 = getCachedResponse(keyForParentObject);
                    if (cachedResponse2 != null) {
                        if (onRequestComplete(str, keyForParentObject, cachedResponse2.response, null, false, true)) {
                            return;
                        } else {
                            this.responseCache.remove(keyForParentObject);
                        }
                    }
                } else if (onRequestComplete(str, keyForParentObject, cachedResponse.response, null, false, true)) {
                    return;
                } else {
                    this.responseCache.remove(str);
                }
                requestReferenceFromServer(obj, str, keyForParentObject, objArr);
            }
        }
    }

    private byte[] getFileReference(TLRPC.User user, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        if (user == null || (userProfilePhoto = user.photo) == null || !(inputFileLocation instanceof TLRPC.TL_inputFileLocation)) {
            return null;
        }
        byte[] fileReference = getFileReference(userProfilePhoto.photo_small, inputFileLocation, zArr);
        if (getPeerReferenceReplacement(user, null, false, inputFileLocation, inputFileLocationArr, zArr)) {
            return new byte[0];
        }
        if (fileReference == null) {
            return getPeerReferenceReplacement(user, null, true, inputFileLocation, inputFileLocationArr, zArr) ? new byte[0] : getFileReference(user.photo.photo_big, inputFileLocation, zArr);
        }
        return fileReference;
    }

    private byte[] getFileReference(TLRPC.Chat chat, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.ChatPhoto chatPhoto;
        if (chat == null || (chatPhoto = chat.photo) == null || !((inputFileLocation instanceof TLRPC.TL_inputFileLocation) || (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation))) {
            return null;
        }
        if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
            zArr[0] = true;
            if (getPeerReferenceReplacement(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
                return new byte[0];
            }
            return null;
        }
        byte[] fileReference = getFileReference(chatPhoto.photo_small, inputFileLocation, zArr);
        if (getPeerReferenceReplacement(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
            return new byte[0];
        }
        if (fileReference == null) {
            return getPeerReferenceReplacement(null, chat, true, inputFileLocation, inputFileLocationArr, zArr) ? new byte[0] : getFileReference(chat.photo.photo_big, inputFileLocation, zArr);
        }
        return fileReference;
    }

    private byte[] getFileReference(TLRPC.Photo photo, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        if (photo == null) {
            return null;
        }
        if (inputFileLocation instanceof TLRPC.TL_inputPhotoFileLocation) {
            if (photo.id == inputFileLocation.id) {
                return photo.file_reference;
            }
            return null;
        }
        if (inputFileLocation instanceof TLRPC.TL_inputFileLocation) {
            int size = photo.sizes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.PhotoSize photoSize = photo.sizes.get(i);
                byte[] fileReference = getFileReference(photoSize, inputFileLocation, zArr);
                if (zArr != null && zArr[0]) {
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                    inputFileLocationArr[0] = tL_inputPhotoFileLocation;
                    tL_inputPhotoFileLocation.id = photo.id;
                    tL_inputPhotoFileLocation.volume_id = inputFileLocation.volume_id;
                    tL_inputPhotoFileLocation.local_id = inputFileLocation.local_id;
                    tL_inputPhotoFileLocation.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhotoFileLocation.file_reference = bArr;
                    tL_inputPhotoFileLocation.thumb_size = photoSize.type;
                    return bArr;
                }
                if (fileReference != null) {
                    return fileReference;
                }
            }
        }
        return null;
    }

    private byte[] getFileReference(TLRPC.PhotoSize photoSize, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr) {
        if (photoSize == null || !(inputFileLocation instanceof TLRPC.TL_inputFileLocation)) {
            return null;
        }
        return getFileReference(photoSize.location, inputFileLocation, zArr);
    }

    private byte[] getFileReference(TLRPC.FileLocation fileLocation, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr) {
        if (fileLocation == null || !(inputFileLocation instanceof TLRPC.TL_inputFileLocation) || fileLocation.local_id != inputFileLocation.local_id || fileLocation.volume_id != inputFileLocation.volume_id) {
            return null;
        }
        byte[] bArr = fileLocation.file_reference;
        if (bArr == null && zArr != null) {
            zArr[0] = true;
        }
        return bArr;
    }

    private byte[] getFileReference(TLRPC.WebPage webPage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        FileRefController fileRefController = this;
        byte[] fileReference = fileRefController.getFileReference(webPage.document, null, inputFileLocation, zArr, inputFileLocationArr);
        if (fileReference != null) {
            return fileReference;
        }
        byte[] fileReference2 = getFileReference(webPage.photo, inputFileLocation, zArr, inputFileLocationArr);
        if (fileReference2 != null) {
            return fileReference2;
        }
        if (!webPage.attributes.isEmpty()) {
            int size = webPage.attributes.size();
            int i = 0;
            while (i < size) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    int size2 = tL_webPageAttributeTheme.documents.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        byte[] fileReference3 = fileRefController.getFileReference(tL_webPageAttributeTheme.documents.get(i2), null, inputFileLocation, zArr, inputFileLocationArr);
                        if (fileReference3 != null) {
                            return fileReference3;
                        }
                        i2++;
                        fileRefController = this;
                    }
                }
                i++;
                fileRefController = this;
            }
        }
        TL_iv.Page page = webPage.cached_page;
        if (page == null) {
            return null;
        }
        int size3 = page.documents.size();
        for (int i3 = 0; i3 < size3; i3++) {
            byte[] fileReference4 = getFileReference(webPage.cached_page.documents.get(i3), null, inputFileLocation, zArr, inputFileLocationArr);
            if (fileReference4 != null) {
                return fileReference4;
            }
        }
        int size4 = webPage.cached_page.photos.size();
        for (int i4 = 0; i4 < size4; i4++) {
            byte[] fileReference5 = getFileReference(webPage.cached_page.photos.get(i4), inputFileLocation, zArr, inputFileLocationArr);
            if (fileReference5 != null) {
                return fileReference5;
            }
        }
        return null;
    }
}
