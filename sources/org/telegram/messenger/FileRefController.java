package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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

    public FileRefController(int i10) {
        super(i10);
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
        int i10 = 0;
        while (i10 < size) {
            Waiter waiter = arrayList.get(i10);
            onRequestComplete(waiter.locationKey, waiter.parentKey, tLObject, tL_error, i10 == size + (-1), false);
            i10++;
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
            for (int i10 = 0; i10 < size; i10++) {
                this.responseCache.remove(arrayList.get(i10));
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
            int i10 = 0;
            if (!(inputFileLocation instanceof TLRPC.TL_inputDocumentFileLocation)) {
                int size = document.thumbs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.PhotoSize photoSize = document.thumbs.get(i11);
                    byte[] fileReference = getFileReference(photoSize, inputFileLocation, zArr);
                    if (zArr != null && zArr[0]) {
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                        inputFileLocationArr[0] = tL_inputDocumentFileLocation;
                        tL_inputDocumentFileLocation.f22395id = document.f22386id;
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
            } else if (document.f22386id == inputFileLocation.f22395id) {
                return document.file_reference;
            }
            if (arrayList != null) {
                while (i10 < arrayList.size()) {
                    TLRPC.InputFileLocation inputFileLocation2 = inputFileLocation;
                    boolean[] zArr2 = zArr;
                    TLRPC.InputFileLocation[] inputFileLocationArr2 = inputFileLocationArr;
                    byte[] fileReference2 = getFileReference(arrayList.get(i10), null, inputFileLocation2, zArr2, inputFileLocationArr2);
                    if (fileReference2 != null) {
                        return fileReference2;
                    }
                    i10++;
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
            int i10 = 0;
            while (i10 < size) {
                TLRPC.PollAnswer pollAnswer = arrayList.get(i10);
                i10++;
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
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            TLRPC.Photo photo = arrayList.get(i11);
            i11++;
            fileReference = getFileReference(photo, inputFileLocation, zArr, inputFileLocationArr);
            if (fileReference != null) {
                return fileReference;
            }
        }
        ArrayList<TLRPC.Document> arrayList2 = richMessage.documents;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            TLRPC.Document document = arrayList2.get(i10);
            i10++;
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
        int i10;
        TLRPC.TL_messages_favedStickers tL_messages_favedStickers;
        int size2;
        int i11;
        boolean[] zArr3;
        byte[] fileReference2;
        TLRPC.TL_messages_recentStickers tL_messages_recentStickers;
        int size3;
        int i12;
        byte[] fileReference3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int size4;
        int i13;
        TLRPC.TL_messages_savedGifs tL_messages_savedGifs;
        int size5;
        int i14;
        TLRPC.TL_messages_chats tL_messages_chats;
        int size6;
        int i15;
        Vector vector;
        int size7;
        int i16;
        Object obj3;
        TLRPC.InputFileLocation[] inputFileLocationArr3;
        TL_account.TL_wallPapers tL_wallPapers;
        int size8;
        int i17;
        TLRPC.TL_help_appUpdate tL_help_appUpdate;
        boolean[] zArr4;
        FileRefController fileRefController3;
        byte[] fileReference4;
        TLRPC.Document document2;
        TLRPC.InputFileLocation[] inputFileLocationArr4;
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList;
        int size9;
        int i18;
        int i19;
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        TLRPC.InputFileLocation inputFileLocation5;
        ArrayList<TLRPC.TL_availableReaction> arrayList2;
        int size10;
        int i20;
        int i21;
        TLRPC.TL_availableReaction tL_availableReaction;
        boolean[] zArr5;
        ArrayList<TLRPC.Document> arrayList3;
        int size11;
        int i22;
        int i23;
        TLRPC.messages_Messages messages_messages;
        int size12;
        int i24;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia3;
        TL_iv.RichMessage richMessage;
        TLRPC.MessageAction messageAction;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i25;
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
            if (tLObject2 instanceof jh.a6) {
                messageMedia4 = ((jh.a6) tLObject2).media;
                document3 = messageMedia4.document;
                if (document3 != null) {
                    fileRefController3 = this;
                    inputFileLocationArr2 = inputFileLocationArr;
                    fileReference4 = fileRefController3.getFileReference(document3, messageMedia4.alt_documents, inputFileLocation, zArr, inputFileLocationArr2);
                    fileRefController = fileRefController3;
                    fileReference = fileReference4;
                } else {
                    fileRefController = this;
                    inputFileLocationArr2 = inputFileLocationArr;
                    zArr6 = zArr;
                    photo3 = messageMedia4.photo;
                    if (photo3 != null) {
                        fileReference = fileRefController.getFileReference(photo3, inputFileLocation, zArr6, inputFileLocationArr2);
                    }
                }
                zArr2 = zArr2;
                inputFileLocationArr3 = inputFileLocationArr2;
            } else {
                fileRefController = this;
                inputFileLocation2 = inputFileLocation;
                inputFileLocationArr2 = inputFileLocationArr;
                zArr2 = zArr;
                if (tLObject2 instanceof TLRPC.messages_Messages) {
                    messages_messages = (TLRPC.messages_Messages) tLObject2;
                    if (!messages_messages.messages.isEmpty()) {
                        size12 = messages_messages.messages.size();
                        for (i24 = 0; i24 < size12; i24++) {
                            message = messages_messages.messages.get(i24);
                            messageMedia3 = message.media;
                            if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                                for (i25 = 0; i25 < tL_messageMediaPaidMedia.extended_media.size(); i25++) {
                                    messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i25);
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
                } else if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                    arrayList3 = ((TLRPC.TL_help_premiumPromo) tLObject2).videos;
                    size11 = arrayList3.size();
                    i22 = 0;
                    while (i22 < size11) {
                        i23 = i22 + 1;
                        TLRPC.Document document4 = arrayList3.get(i22);
                        boolean[] zArr7 = zArr2;
                        fileReference3 = fileRefController.getFileReference(document4, null, inputFileLocation2, zArr7, inputFileLocationArr2);
                        zArr2 = zArr7;
                        if (fileReference3 != null) {
                            fileReference = fileReference3;
                            break;
                        }
                        inputFileLocation2 = inputFileLocation;
                        fileReference = fileReference3;
                        i22 = i23;
                        fileRefController = this;
                    }
                    inputFileLocationArr3 = inputFileLocationArr2;
                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                    getMediaDataController().processLoadedReactions(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), false);
                    arrayList2 = tL_messages_availableReactions.reactions;
                    size10 = arrayList2.size();
                    i20 = 0;
                    while (i20 < size10) {
                        i21 = i20 + 1;
                        tL_availableReaction = arrayList2.get(i20);
                        zArr5 = zArr2;
                        fileReference3 = getFileReference(tL_availableReaction.static_icon, null, inputFileLocation, zArr5, inputFileLocationArr2);
                        if (fileReference3 == null && (fileReference3 = getFileReference(tL_availableReaction.appear_animation, null, inputFileLocation, zArr5, inputFileLocationArr2)) == null && (fileReference3 = getFileReference(tL_availableReaction.select_animation, null, inputFileLocation, zArr5, inputFileLocationArr2)) == null && (fileReference3 = getFileReference(tL_availableReaction.activate_animation, null, inputFileLocation, zArr5, inputFileLocationArr2)) == null && (fileReference3 = getFileReference(tL_availableReaction.effect_animation, null, inputFileLocation, zArr5, inputFileLocationArr2)) == null && (fileReference3 = getFileReference(tL_availableReaction.around_animation, null, inputFileLocation, zArr5, inputFileLocationArr2)) == null) {
                            fileReference3 = getFileReference(tL_availableReaction.center_icon, null, inputFileLocation, zArr5, inputFileLocationArr2);
                            zArr2 = zArr5;
                            if (fileReference3 != null) {
                                fileReference = fileReference3;
                                i20 = i21;
                            }
                        }
                        fileReference = fileReference3;
                        break;
                    }
                    inputFileLocationArr3 = inputFileLocationArr2;
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
                    } else {
                        fileRefController = this;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                    arrayList = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot.icons;
                    size9 = arrayList.size();
                    i18 = 0;
                    while (i18 < size9) {
                        i19 = i18 + 1;
                        TLRPC.Document document5 = arrayList.get(i18).icon;
                        boolean[] zArr8 = zArr2;
                        fileReference3 = getFileReference(document5, null, inputFileLocation, zArr8, inputFileLocationArr2);
                        zArr2 = zArr8;
                        if (fileReference3 != null) {
                            fileReference = fileReference3;
                            break;
                        }
                        fileReference = fileReference3;
                        i18 = i19;
                    }
                    inputFileLocationArr3 = inputFileLocationArr2;
                } else if (tLObject2 instanceof TLRPC.TL_help_appUpdate) {
                    tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject2;
                    try {
                        SharedConfig.pendingAppUpdate = tL_help_appUpdate;
                        SharedConfig.saveConfig();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    try {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    try {
                        document2 = tL_help_appUpdate.document;
                        if (document2 != null) {
                            fileReference = document2.file_reference;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                            TLRPC.Document document6 = tL_help_appUpdate.document;
                            tL_inputDocumentFileLocation.f22395id = document6.f22386id;
                            tL_inputDocumentFileLocation.access_hash = document6.access_hash;
                            tL_inputDocumentFileLocation.file_reference = document6.file_reference;
                            tL_inputDocumentFileLocation.thumb_size = "";
                            inputFileLocationArr4 = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation};
                        } else {
                            inputFileLocationArr4 = inputFileLocationArr2;
                        }
                        inputFileLocationArr2 = inputFileLocationArr4;
                    } catch (Exception e11) {
                        FileLog.e(e11);
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
                        fileReference4 = fileRefController3.getFileReference(tL_help_appUpdate.sticker, null, inputFileLocation, zArr4, inputFileLocationArr2);
                        fileRefController = fileRefController3;
                        fileReference = fileReference4;
                    } else {
                        fileRefController = this;
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
                        i17 = 0;
                        while (i17 < size8) {
                            boolean[] zArr9 = zArr2;
                            fileReference3 = fileRefController.getFileReference(tL_wallPapers.wallpapers.get(i17).document, null, inputFileLocation3, zArr9, inputFileLocationArr2);
                            zArr2 = zArr9;
                            if (fileReference3 != null) {
                                fileReference = fileReference3;
                                break;
                            }
                            i17++;
                            inputFileLocation3 = inputFileLocation;
                            fileReference = fileReference3;
                            fileRefController = this;
                        }
                        inputFileLocationArr3 = inputFileLocationArr2;
                    } else {
                        if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                            fileReference = getFileReference(((TLRPC.TL_wallPaper) tLObject2).document, null, inputFileLocation, zArr2, inputFileLocationArr2);
                        } else if (tLObject2 instanceof TLRPC.TL_theme) {
                            inputFileLocationArr3 = inputFileLocationArr2;
                            fileReference = getFileReference(((TLRPC.TL_theme) tLObject2).document, null, inputFileLocation, zArr2, inputFileLocationArr2);
                        } else {
                            fileRefController = this;
                            inputFileLocation4 = inputFileLocation;
                            if (tLObject2 instanceof Vector) {
                                vector = (Vector) tLObject2;
                                if (!vector.objects.isEmpty()) {
                                    size7 = vector.objects.size();
                                    for (i16 = 0; i16 < size7; i16++) {
                                        obj3 = vector.objects.get(i16);
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
                                    for (i15 = 0; i15 < size6; i15++) {
                                        fileReference = fileRefController.getFileReference(tL_messages_chats.chats.get(i15), inputFileLocation4, zArr2, inputFileLocationArr2);
                                        if (fileReference != null) {
                                            break;
                                        }
                                    }
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_savedGifs) {
                                tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject2;
                                size5 = tL_messages_savedGifs.gifs.size();
                                i14 = 0;
                                while (i14 < size5) {
                                    boolean[] zArr10 = zArr2;
                                    fileReference3 = fileRefController.getFileReference(tL_messages_savedGifs.gifs.get(i14), null, inputFileLocation4, zArr10, inputFileLocationArr2);
                                    zArr2 = zArr10;
                                    if (fileReference3 != null) {
                                        fileReference = fileReference3;
                                        break;
                                    }
                                    i14++;
                                    inputFileLocation4 = inputFileLocation;
                                    fileReference = fileReference3;
                                    fileRefController = this;
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                if (fileReference == null) {
                                    size4 = tL_messages_stickerSet.documents.size();
                                    i13 = 0;
                                    while (i13 < size4) {
                                        boolean[] zArr11 = zArr2;
                                        fileReference3 = getFileReference(tL_messages_stickerSet.documents.get(i13), null, inputFileLocation, zArr11, inputFileLocationArr2);
                                        zArr2 = zArr11;
                                        if (fileReference3 != null) {
                                            fileReference = fileReference3;
                                            break;
                                        }
                                        i13++;
                                        fileReference = fileReference3;
                                    }
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_recentStickers) {
                                tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject2;
                                size3 = tL_messages_recentStickers.stickers.size();
                                i12 = 0;
                                while (i12 < size3) {
                                    boolean[] zArr12 = zArr2;
                                    fileReference3 = getFileReference(tL_messages_recentStickers.stickers.get(i12), null, inputFileLocation, zArr12, inputFileLocationArr2);
                                    zArr2 = zArr12;
                                    if (fileReference3 != null) {
                                        fileReference = fileReference3;
                                        break;
                                    }
                                    i12++;
                                    fileReference = fileReference3;
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_favedStickers) {
                                tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject2;
                                size2 = tL_messages_favedStickers.stickers.size();
                                i11 = 0;
                                while (true) {
                                    if (i11 >= size2) {
                                        zArr3 = zArr2;
                                        fileReference2 = getFileReference(tL_messages_favedStickers.stickers.get(i11), null, inputFileLocation, zArr3, inputFileLocationArr2);
                                        if (fileReference2 != null) {
                                            fileReference = fileReference2;
                                            break;
                                        }
                                        i11++;
                                        fileReference = fileReference2;
                                        zArr2 = zArr3;
                                    }
                                }
                            } else {
                                fileRefController2 = this;
                                if (tLObject2 instanceof TLRPC.photos_Photos) {
                                    photos_photos = (TLRPC.photos_Photos) tLObject2;
                                    size = photos_photos.photos.size();
                                    for (i10 = 0; i10 < size; i10++) {
                                        fileReference = fileRefController2.getFileReference(photos_photos.photos.get(i10), inputFileLocation, zArr2, inputFileLocationArr2);
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
                                            byte[] fileReference5 = fileRefController2.getFileReference(document, messageMedia2.alt_documents, inputFileLocation, zArr2, inputFileLocationArr2);
                                            fileRefController2 = fileRefController2;
                                            fileReference = fileReference5;
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
                                                tL_storyItemDeleted.f22617id = storyItem2.f22617id;
                                                ArrayList<TLRPC.Update> arrayList4 = new ArrayList<>();
                                                arrayList4.add(tL_updateStory);
                                                fileRefController2.getMessagesController().processUpdateArray(arrayList4, null, null, false, 0);
                                            } else {
                                                user = fileRefController2.getMessagesController().getUser(Long.valueOf(storyItem2.dialogId));
                                                if (user != null && user.contact) {
                                                    MessagesController.getInstance(fileRefController2.currentAccount).getStoriesController().f13963k.k(storyItem2.dialogId, storyItem);
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
                        inputFileLocationArr3 = inputFileLocationArr2;
                    }
                }
                zArr2 = zArr2;
                inputFileLocationArr3 = inputFileLocationArr2;
            }
            if (fileReference == null) {
                return null;
            }
            if (inputFileLocationArr3 != null && (inputFileLocation6 = inputFileLocationArr3[0]) != null) {
                inputFileLocation7 = inputFileLocation6;
            }
            return new Pair<>(fileReference, inputFileLocation7);
        }
        tLObject2 = tLObject;
        fileReference = null;
        if (tLObject2 instanceof jh.a6) {
            messageMedia4 = ((jh.a6) tLObject2).media;
            document3 = messageMedia4.document;
            if (document3 != null) {
                fileRefController3 = this;
                inputFileLocationArr2 = inputFileLocationArr;
                fileReference4 = fileRefController3.getFileReference(document3, messageMedia4.alt_documents, inputFileLocation, zArr, inputFileLocationArr2);
                fileRefController = fileRefController3;
                fileReference = fileReference4;
            } else {
                fileRefController = this;
                inputFileLocationArr2 = inputFileLocationArr;
                zArr6 = zArr;
                photo3 = messageMedia4.photo;
                if (photo3 != null) {
                    fileReference = fileRefController.getFileReference(photo3, inputFileLocation, zArr6, inputFileLocationArr2);
                }
            }
            zArr2 = zArr2;
            inputFileLocationArr3 = inputFileLocationArr2;
        } else {
            fileRefController = this;
            inputFileLocation2 = inputFileLocation;
            inputFileLocationArr2 = inputFileLocationArr;
            zArr2 = zArr;
            if (tLObject2 instanceof TLRPC.messages_Messages) {
                messages_messages = (TLRPC.messages_Messages) tLObject2;
                if (!messages_messages.messages.isEmpty()) {
                    size12 = messages_messages.messages.size();
                    while (i24 < size12) {
                        message = messages_messages.messages.get(i24);
                        messageMedia3 = message.media;
                        if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                            tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                            while (i25 < tL_messageMediaPaidMedia.extended_media.size()) {
                                messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i25);
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
            } else if (tLObject2 instanceof TLRPC.TL_help_premiumPromo) {
                arrayList3 = ((TLRPC.TL_help_premiumPromo) tLObject2).videos;
                size11 = arrayList3.size();
                i22 = 0;
                while (i22 < size11) {
                    i23 = i22 + 1;
                    TLRPC.Document document7 = arrayList3.get(i22);
                    boolean[] zArr13 = zArr2;
                    fileReference3 = fileRefController.getFileReference(document7, null, inputFileLocation2, zArr13, inputFileLocationArr2);
                    zArr2 = zArr13;
                    if (fileReference3 != null) {
                        fileReference = fileReference3;
                        break;
                    }
                    inputFileLocation2 = inputFileLocation;
                    fileReference = fileReference3;
                    i22 = i23;
                    fileRefController = this;
                }
                inputFileLocationArr3 = inputFileLocationArr2;
            } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                TLRPC.TL_messages_availableReactions tL_messages_availableReactions2 = (TLRPC.TL_messages_availableReactions) tLObject2;
                getMediaDataController().processLoadedReactions(tL_messages_availableReactions2.reactions, tL_messages_availableReactions2.hash, (int) (System.currentTimeMillis() / 1000), false);
                arrayList2 = tL_messages_availableReactions2.reactions;
                size10 = arrayList2.size();
                i20 = 0;
                while (i20 < size10) {
                    i21 = i20 + 1;
                    tL_availableReaction = arrayList2.get(i20);
                    zArr5 = zArr2;
                    fileReference3 = getFileReference(tL_availableReaction.static_icon, null, inputFileLocation, zArr5, inputFileLocationArr2);
                    if (fileReference3 == null) {
                        fileReference3 = getFileReference(tL_availableReaction.center_icon, null, inputFileLocation, zArr5, inputFileLocationArr2);
                        zArr2 = zArr5;
                        if (fileReference3 != null) {
                            fileReference = fileReference3;
                            i20 = i21;
                        }
                    }
                    fileReference = fileReference3;
                    break;
                }
                inputFileLocationArr3 = inputFileLocationArr2;
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
                } else {
                    fileRefController = this;
                }
            } else if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                arrayList = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot.icons;
                size9 = arrayList.size();
                i18 = 0;
                while (i18 < size9) {
                    i19 = i18 + 1;
                    TLRPC.Document document8 = arrayList.get(i18).icon;
                    boolean[] zArr14 = zArr2;
                    fileReference3 = getFileReference(document8, null, inputFileLocation, zArr14, inputFileLocationArr2);
                    zArr2 = zArr14;
                    if (fileReference3 != null) {
                        fileReference = fileReference3;
                        break;
                    }
                    fileReference = fileReference3;
                    i18 = i19;
                }
                inputFileLocationArr3 = inputFileLocationArr2;
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
                    tL_inputDocumentFileLocation2.f22395id = document9.f22386id;
                    tL_inputDocumentFileLocation2.access_hash = document9.access_hash;
                    tL_inputDocumentFileLocation2.file_reference = document9.file_reference;
                    tL_inputDocumentFileLocation2.thumb_size = "";
                    inputFileLocationArr4 = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation2};
                } else {
                    inputFileLocationArr4 = inputFileLocationArr2;
                }
                inputFileLocationArr2 = inputFileLocationArr4;
                if (fileReference == null) {
                    zArr4 = zArr2;
                    fileReference = getFileReference(tL_help_appUpdate.document, null, inputFileLocation, zArr4, inputFileLocationArr2);
                } else {
                    zArr4 = zArr2;
                }
                if (fileReference == null) {
                    fileRefController3 = this;
                    fileReference4 = fileRefController3.getFileReference(tL_help_appUpdate.sticker, null, inputFileLocation, zArr4, inputFileLocationArr2);
                    fileRefController = fileRefController3;
                    fileReference = fileReference4;
                } else {
                    fileRefController = this;
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
                    i17 = 0;
                    while (i17 < size8) {
                        boolean[] zArr15 = zArr2;
                        fileReference3 = fileRefController.getFileReference(tL_wallPapers.wallpapers.get(i17).document, null, inputFileLocation3, zArr15, inputFileLocationArr2);
                        zArr2 = zArr15;
                        if (fileReference3 != null) {
                            fileReference = fileReference3;
                            break;
                        }
                        i17++;
                        inputFileLocation3 = inputFileLocation;
                        fileReference = fileReference3;
                        fileRefController = this;
                    }
                    inputFileLocationArr3 = inputFileLocationArr2;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                        fileReference = getFileReference(((TLRPC.TL_wallPaper) tLObject2).document, null, inputFileLocation, zArr2, inputFileLocationArr2);
                    } else if (tLObject2 instanceof TLRPC.TL_theme) {
                        inputFileLocationArr3 = inputFileLocationArr2;
                        fileReference = getFileReference(((TLRPC.TL_theme) tLObject2).document, null, inputFileLocation, zArr2, inputFileLocationArr2);
                    } else {
                        fileRefController = this;
                        inputFileLocation4 = inputFileLocation;
                        if (tLObject2 instanceof Vector) {
                            vector = (Vector) tLObject2;
                            if (!vector.objects.isEmpty()) {
                                size7 = vector.objects.size();
                                while (i16 < size7) {
                                    obj3 = vector.objects.get(i16);
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
                                while (i15 < size6) {
                                    fileReference = fileRefController.getFileReference(tL_messages_chats.chats.get(i15), inputFileLocation4, zArr2, inputFileLocationArr2);
                                    if (fileReference != null) {
                                        break;
                                        break;
                                    }
                                }
                            }
                        } else if (tLObject2 instanceof TLRPC.TL_messages_savedGifs) {
                            tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject2;
                            size5 = tL_messages_savedGifs.gifs.size();
                            i14 = 0;
                            while (i14 < size5) {
                                boolean[] zArr16 = zArr2;
                                fileReference3 = fileRefController.getFileReference(tL_messages_savedGifs.gifs.get(i14), null, inputFileLocation4, zArr16, inputFileLocationArr2);
                                zArr2 = zArr16;
                                if (fileReference3 != null) {
                                    fileReference = fileReference3;
                                    break;
                                }
                                i14++;
                                inputFileLocation4 = inputFileLocation;
                                fileReference = fileReference3;
                                fileRefController = this;
                            }
                        } else if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                            if (fileReference == null) {
                                size4 = tL_messages_stickerSet.documents.size();
                                i13 = 0;
                                while (i13 < size4) {
                                    boolean[] zArr17 = zArr2;
                                    fileReference3 = getFileReference(tL_messages_stickerSet.documents.get(i13), null, inputFileLocation, zArr17, inputFileLocationArr2);
                                    zArr2 = zArr17;
                                    if (fileReference3 != null) {
                                        fileReference = fileReference3;
                                        break;
                                    }
                                    i13++;
                                    fileReference = fileReference3;
                                }
                            }
                        } else if (tLObject2 instanceof TLRPC.TL_messages_recentStickers) {
                            tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject2;
                            size3 = tL_messages_recentStickers.stickers.size();
                            i12 = 0;
                            while (i12 < size3) {
                                boolean[] zArr18 = zArr2;
                                fileReference3 = getFileReference(tL_messages_recentStickers.stickers.get(i12), null, inputFileLocation, zArr18, inputFileLocationArr2);
                                zArr2 = zArr18;
                                if (fileReference3 != null) {
                                    fileReference = fileReference3;
                                    break;
                                }
                                i12++;
                                fileReference = fileReference3;
                            }
                        } else if (tLObject2 instanceof TLRPC.TL_messages_favedStickers) {
                            tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject2;
                            size2 = tL_messages_favedStickers.stickers.size();
                            i11 = 0;
                            while (true) {
                                if (i11 >= size2) {
                                    zArr3 = zArr2;
                                    fileReference2 = getFileReference(tL_messages_favedStickers.stickers.get(i11), null, inputFileLocation, zArr3, inputFileLocationArr2);
                                    if (fileReference2 != null) {
                                        fileReference = fileReference2;
                                        break;
                                    }
                                    i11++;
                                    fileReference = fileReference2;
                                    zArr2 = zArr3;
                                }
                            }
                        } else {
                            fileRefController2 = this;
                            if (tLObject2 instanceof TLRPC.photos_Photos) {
                                photos_photos = (TLRPC.photos_Photos) tLObject2;
                                size = photos_photos.photos.size();
                                while (i10 < size) {
                                    fileReference = fileRefController2.getFileReference(photos_photos.photos.get(i10), inputFileLocation, zArr2, inputFileLocationArr2);
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
                                            tL_storyItemDeleted2.f22617id = storyItem2.f22617id;
                                            ArrayList<TLRPC.Update> arrayList6 = new ArrayList<>();
                                            arrayList6.add(tL_updateStory3);
                                            fileRefController2.getMessagesController().processUpdateArray(arrayList6, null, null, false, 0);
                                        } else {
                                            user = fileRefController2.getMessagesController().getUser(Long.valueOf(storyItem2.dialogId));
                                            if (user != null) {
                                                MessagesController.getInstance(fileRefController2.currentAccount).getStoriesController().f13963k.k(storyItem2.dialogId, storyItem);
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
                    inputFileLocationArr3 = inputFileLocationArr2;
                }
            }
            zArr2 = zArr2;
            inputFileLocationArr3 = inputFileLocationArr2;
        }
        if (fileReference == null) {
            return null;
        }
        if (inputFileLocationArr3 != null) {
            inputFileLocation7 = inputFileLocation6;
        }
        return new Pair<>(fileReference, inputFileLocation7);
    }

    public static FileRefController getInstance(int i10) {
        FileRefController fileRefController;
        FileRefController fileRefController2 = Instance[i10];
        if (fileRefController2 != null) {
            return fileRefController2;
        }
        synchronized (FileRefController.class) {
            try {
                fileRefController = Instance[i10];
                if (fileRefController == null) {
                    FileRefController[] fileRefControllerArr = Instance;
                    FileRefController fileRefController3 = new FileRefController(i10);
                    fileRefControllerArr[i10] = fileRefController3;
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
        if (obj instanceof jh.a6) {
            jh.a6 a6Var = (jh.a6) obj;
            if (a6Var.f13045a == null) {
                FileLog.d("failed request reference can't find list in botpreview");
                return null;
            }
            TLRPC.MessageMedia messageMedia = a6Var.media;
            if (messageMedia.document != null) {
                return "botstory_doc_" + a6Var.media.document.f22386id;
            }
            if (messageMedia.photo != null) {
                return "botstory_photo_" + a6Var.media.photo.f22404id;
            }
            return "botstory_" + a6Var.f22617id;
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            if (storyItem.dialogId == 0) {
                FileLog.d("failed request reference can't find dialogId");
                return null;
            }
            return "story_" + storyItem.dialogId + "_" + storyItem.f22617id;
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
            return a9.p.l(((TLRPC.TL_attachMenuBot) obj).bot_id, "attach_menu_bot_");
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
            return "message" + message2.f22401id + "_" + (peer2 != null ? peer2.channel_id : 0L) + "_" + message2.from_scheduled;
        }
        if (obj instanceof TLRPC.WebPage) {
            return "webpage" + ((TLRPC.WebPage) obj).f22533id;
        }
        if (obj instanceof TLRPC.User) {
            return "user" + ((TLRPC.User) obj).f22527id;
        }
        if (obj instanceof TLRPC.Chat) {
            return "chat" + ((TLRPC.Chat) obj).f22380id;
        }
        if (obj instanceof String) {
            return "str".concat((String) obj);
        }
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            return "set" + ((TLRPC.TL_messages_stickerSet) obj).set.f22407id;
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            return "set" + ((TLRPC.StickerSetCovered) obj).set.f22407id;
        }
        if (obj instanceof TLRPC.InputStickerSet) {
            return "set" + ((TLRPC.InputStickerSet) obj).f22400id;
        }
        if (obj instanceof TLRPC.TL_wallPaper) {
            return "wallpaper" + ((TLRPC.TL_wallPaper) obj).f22532id;
        }
        if (obj instanceof TLRPC.TL_theme) {
            return "theme" + ((TLRPC.TL_theme) obj).f22517id;
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
            StringBuilder sb2 = new StringBuilder("story(dialogId=");
            sb2.append(storyItem.dialogId);
            sb2.append(" id=");
            return a9.p.k(storyItem.f22617id, ")", sb2);
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

    private boolean getPeerReferenceReplacement(TLRPC.User user, TLRPC.Chat chat, boolean z10, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation[] inputFileLocationArr, boolean[] zArr) {
        TLRPC.InputPeer tL_inputPeerChat;
        TLRPC.InputPeer tL_inputPeerUser;
        if (zArr == null || !zArr[0]) {
            return false;
        }
        TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
        long j10 = inputFileLocation.volume_id;
        tL_inputPeerPhotoFileLocation.f22395id = j10;
        tL_inputPeerPhotoFileLocation.volume_id = j10;
        tL_inputPeerPhotoFileLocation.local_id = inputFileLocation.local_id;
        tL_inputPeerPhotoFileLocation.big = z10;
        if (user == null) {
            if (!ChatObject.isChannel(chat)) {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_inputPeerChat.chat_id = chat.f22380id;
            } else if (chat.access_hash != 0 || chat.fromMessageDialogId == 0 || chat.fromMessageId == 0) {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChat.channel_id = chat.f22380id;
                tL_inputPeerChat.access_hash = chat.access_hash;
            } else {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChat.channel_id = chat.f22380id;
                tL_inputPeerChat.peer = getMessagesController().getInputPeer(chat.fromMessageDialogId);
                tL_inputPeerChat.msg_id = chat.fromMessageId;
            }
            tL_inputPeerPhotoFileLocation.photo_id = chat.photo.photo_id;
            tL_inputPeerUser = tL_inputPeerChat;
        } else if (user.access_hash != 0 || user.fromMessageId == 0 || user.fromMessageDialogId == 0) {
            tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputPeerUser.user_id = user.f22527id;
            tL_inputPeerUser.access_hash = user.access_hash;
            tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
        } else {
            tL_inputPeerUser = new TLRPC.TL_inputPeerUserFromMessage();
            tL_inputPeerUser.user_id = user.f22527id;
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
        ArrayList arrayList = org.telegram.ui.ActionBar.g6.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_theme tL_theme2 = ((org.telegram.ui.ActionBar.f6) arrayList.get(i10)).B;
            if (tL_theme2 != null && tL_theme2.f22517id == tL_theme.f22517id) {
                TLRPC.Document document2 = tL_theme2.document;
                if (document2 == null || (document = tL_theme.document) == null) {
                    return;
                }
                document2.file_reference = document.file_reference;
                org.telegram.ui.ActionBar.g6.s1(true, false);
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

    public void lambda$requestReferenceFromServer$0(String str, String str2, jh.a6 a6Var) throws FileNotFoundException {
        onRequestComplete(str, str2, a6Var, null, true, false);
    }

    public void lambda$requestReferenceFromServer$1(String str, String str2, jh.a6 a6Var) {
        Utilities.stageQueue.postRunnable(new lk(this, str, str2, a6Var, 7));
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

    private boolean onRequestComplete(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10, boolean z11) throws FileNotFoundException {
        String str3;
        String str4;
        int i10;
        TLObject tLObject2;
        boolean z12;
        ArrayList<Requester> arrayList;
        int size;
        boolean[] zArr;
        TLRPC.InputFileLocation[] inputFileLocationArr;
        byte[] fileReference;
        int i11;
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
        int i12;
        TLRPC.TL_messages_favedStickers tL_messages_favedStickers;
        int size3;
        int i13;
        int i14;
        TLRPC.TL_messages_recentStickers tL_messages_recentStickers;
        int size4;
        int i15;
        int i16;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int size5;
        int i17;
        int i18;
        TLRPC.TL_messages_savedGifs tL_messages_savedGifs;
        int size6;
        int i19;
        int i20;
        TLRPC.TL_messages_chats tL_messages_chats;
        int size7;
        int i21;
        final TLRPC.Chat chat;
        byte[] fileReference3;
        Object obj2;
        Vector vector;
        int size8;
        int i22;
        Object obj3;
        Vector vector2;
        int i23;
        int i24;
        final TLRPC.Chat chat2;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_wallPaper tL_wallPaper;
        TL_account.TL_wallPapers tL_wallPapers;
        int size9;
        int i25;
        TLRPC.TL_help_appUpdate tL_help_appUpdate;
        TLRPC.Document document3;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList2;
        int size10;
        byte[] fileReference4;
        int i26;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList3;
        int i27;
        int i28;
        int i29;
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        int i30;
        boolean[] zArr4;
        ArrayList<TLRPC.TL_availableReaction> arrayList4;
        int size11;
        int i31;
        int i32;
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList<TLRPC.TL_availableReaction> arrayList5;
        int i33;
        byte[] fileReference5;
        ArrayList<TLRPC.Document> arrayList6;
        int size12;
        int i34;
        int i35;
        TLRPC.messages_Messages messages_messages;
        int size13;
        int i36;
        int i37;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia3;
        int i38;
        int i39;
        TL_iv.RichMessage richMessage;
        TLRPC.MessageAction messageAction;
        byte[] fileReference6;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i40;
        TLRPC.MessageExtendedMedia messageExtendedMedia;
        int i41;
        TLRPC.InputFileLocation inputFileLocation;
        TLRPC.MessageMedia messageMedia4;
        TLRPC.Document document4;
        TLRPC.Photo photo3;
        ArrayList<Requester> arrayList7;
        TLObject tLObject3;
        final FileRefController fileRefController = this;
        TLObject tLObject4 = tLObject;
        boolean z13 = tLObject4 instanceof TLRPC.TL_help_premiumPromo;
        if (z13) {
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
                i10 = 1;
                if (str2 != null || (arrayList7 = fileRefController.parentRequester.get(str2)) == null) {
                    tLObject2 = tLObject4;
                    z12 = false;
                } else {
                    int size14 = arrayList7.size();
                    int i42 = 0;
                    z12 = false;
                    while (i42 < size14) {
                        Requester requester3 = arrayList7.get(i42);
                        if (requester3.completed) {
                            tLObject3 = tLObject4;
                        } else {
                            tLObject3 = tLObject4;
                            if (fileRefController.onRequestComplete(requester3.locationKey, null, tLObject4, tL_error, z10 && !z12, z11)) {
                                z12 = true;
                            }
                        }
                        i42++;
                        tLObject4 = tLObject3;
                    }
                    tLObject2 = tLObject4;
                    if (z12) {
                        fileRefController.putReponseToCache(str3, tLObject2);
                    }
                    fileRefController.parentRequester.remove(str2);
                }
                arrayList = fileRefController.locationRequester.get(str);
                if (arrayList == null) {
                    return z12;
                }
                size = arrayList.size();
                zArr = null;
                inputFileLocationArr = null;
                fileReference = null;
                i11 = 0;
                while (i11 < size) {
                    requester = arrayList.get(i11);
                    if (requester.completed) {
                        i30 = i10;
                    } else {
                        if (tL_error != null && BuildVars.LOGS_ENABLED && requester.args.length > i10 && (requester.args[i10] instanceof FileLoadOperation)) {
                            FileLog.e("debug_loading: " + ((FileLoadOperation) requester.args[i10]).getCacheFileFinal().getName() + " can't update file reference: " + tL_error.code + " " + tL_error.text);
                        }
                        if ((requester.location instanceof TLRPC.TL_inputFileLocation) || (requester.location instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
                            inputFileLocationArr = new TLRPC.InputFileLocation[i10];
                            zArr = new boolean[i10];
                        }
                        inputFileLocationArr = inputFileLocationArr;
                        zArr2 = zArr;
                        requester.completed = i10;
                        if (tLObject2 instanceof jh.a6) {
                            messageMedia4 = ((jh.a6) tLObject2).media;
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
                            }
                        } else {
                            requester2 = requester;
                            zArr3 = zArr2;
                            if (tLObject2 instanceof TLRPC.messages_Messages) {
                                messages_messages = (TLRPC.messages_Messages) tLObject2;
                                if (!messages_messages.messages.isEmpty()) {
                                    size13 = messages_messages.messages.size();
                                    i36 = 0;
                                    while (true) {
                                        if (i36 < size13) {
                                            message = messages_messages.messages.get(i36);
                                            messageMedia3 = message.media;
                                            i38 = size13;
                                            if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                                                i39 = i36;
                                                i40 = 0;
                                                while (i40 < tL_messageMediaPaidMedia.extended_media.size()) {
                                                    messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i40);
                                                    i41 = i40;
                                                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                                        fileReference = fileRefController.getFileReferenceForMediaImpl(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, requester2.location, zArr3, inputFileLocationArr);
                                                    }
                                                    if (fileReference != null) {
                                                        break;
                                                    }
                                                    i40 = i41 + 1;
                                                }
                                            } else {
                                                i39 = i36;
                                                richMessage = message.rich_message;
                                                if (richMessage != null) {
                                                    fileReference6 = fileRefController.getFileReferenceForRichMessage(richMessage, requester2.location, zArr3, inputFileLocationArr);
                                                } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                                    fileReference6 = fileRefController.getFileReferenceForPoll((TLRPC.TL_messageMediaPoll) messageMedia3, requester2.location, zArr3, inputFileLocationArr);
                                                } else if (messageMedia3 != null) {
                                                    fileReference6 = fileRefController.getFileReferenceForMediaImpl(messageMedia3, requester2.location, zArr3, inputFileLocationArr);
                                                } else {
                                                    messageAction = message.action;
                                                    if (!(messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto)) {
                                                        fileReference6 = fileRefController.getFileReference(messageAction.photo, requester2.location, zArr3, inputFileLocationArr);
                                                    }
                                                }
                                                fileReference = fileReference6;
                                            }
                                            if (fileReference != null) {
                                                i36 = i39 + 1;
                                                fileRefController = this;
                                                size13 = i38;
                                            } else if (z10) {
                                                i37 = 0;
                                                fileRefController.getMessagesStorage().replaceMessageIfExists(message, messages_messages.users, messages_messages.chats, false);
                                                break;
                                            }
                                        }
                                        i37 = 0;
                                        break;
                                    }
                                    if (fileReference == null) {
                                        getMessagesStorage().replaceMessageIfExists(messages_messages.messages.get(i37), messages_messages.users, messages_messages.chats, true);
                                        if (BuildVars.DEBUG_VERSION) {
                                            FileLog.d("file ref not found in messages, replacing message");
                                        }
                                    }
                                } else if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("empty messages, file ref not found");
                                }
                            } else if (z13) {
                                arrayList6 = ((TLRPC.TL_help_premiumPromo) tLObject2).videos;
                                size12 = arrayList6.size();
                                i34 = 0;
                                while (i34 < size12) {
                                    i35 = i34 + 1;
                                    fileReference = getFileReference(arrayList6.get(i34), null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference != null) {
                                        break;
                                    }
                                    i34 = i35;
                                }
                            } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                zArr4 = zArr3;
                                getMediaDataController().processLoadedReactions(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), false);
                                arrayList4 = tL_messages_availableReactions.reactions;
                                size11 = arrayList4.size();
                                fileReference = fileReference;
                                i31 = 0;
                                while (true) {
                                    if (i31 < size11) {
                                        zArr3 = zArr4;
                                        break;
                                    }
                                    i32 = i31 + 1;
                                    tL_availableReaction = arrayList4.get(i31);
                                    arrayList5 = arrayList4;
                                    zArr3 = zArr4;
                                    i33 = size11;
                                    fileReference5 = getFileReference(tL_availableReaction.static_icon, null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference5 != null || (fileReference5 = getFileReference(tL_availableReaction.appear_animation, null, requester2.location, zArr3, inputFileLocationArr)) != null || (fileReference5 = getFileReference(tL_availableReaction.select_animation, null, requester2.location, zArr3, inputFileLocationArr)) != null || (fileReference5 = getFileReference(tL_availableReaction.activate_animation, null, requester2.location, zArr3, inputFileLocationArr)) != null || (fileReference5 = getFileReference(tL_availableReaction.effect_animation, null, requester2.location, zArr3, inputFileLocationArr)) != null || (fileReference5 = getFileReference(tL_availableReaction.around_animation, null, requester2.location, zArr3, inputFileLocationArr)) != null) {
                                        fileReference = fileReference5;
                                        break;
                                    }
                                    fileReference = getFileReference(tL_availableReaction.center_icon, null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference != null) {
                                        break;
                                    }
                                    size11 = i33;
                                    i31 = i32;
                                    arrayList4 = arrayList5;
                                    zArr4 = zArr3;
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
                                            i30 = 1;
                                        } else {
                                            fileReference = fileRefController.getFileReference(botInfo.description_photo, requester2.location, zArr3, inputFileLocationArr);
                                        }
                                    } else {
                                        fileRefController = this;
                                        zArr3 = zArr3;
                                        fileReference = bArr;
                                    }
                                } else {
                                    if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                                        tL_attachMenuBot = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot;
                                        arrayList2 = tL_attachMenuBot.icons;
                                        size10 = arrayList2.size();
                                        fileReference4 = bArr;
                                        i26 = 0;
                                        while (i26 < size10) {
                                            i28 = i26 + 1;
                                            i29 = size10;
                                            fileReference4 = getFileReference(arrayList2.get(i26).icon, null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference4 != null) {
                                                break;
                                            }
                                            i26 = i28;
                                            size10 = i29;
                                        }
                                        if (z10) {
                                            TLRPC.TL_attachMenuBots attachMenuBots = getMediaDataController().getAttachMenuBots();
                                            arrayList3 = new ArrayList<>(attachMenuBots.bots);
                                            i27 = 0;
                                            while (true) {
                                                if (i27 < arrayList3.size()) {
                                                    bArr = fileReference4;
                                                    zArr3 = zArr3;
                                                    break;
                                                }
                                                bArr = fileReference4;
                                                zArr3 = zArr3;
                                                if (arrayList3.get(i27).bot_id == tL_attachMenuBot.bot_id) {
                                                    arrayList3.set(i27, tL_attachMenuBot);
                                                    break;
                                                }
                                                i27++;
                                                fileReference4 = bArr;
                                                zArr3 = zArr3;
                                            }
                                            attachMenuBots.bots = arrayList3;
                                            getMediaDataController().processLoadedMenuBots(attachMenuBots, attachMenuBots.hash, (int) (System.currentTimeMillis() / 1000), false);
                                        } else {
                                            bArr = fileReference4;
                                            zArr3 = zArr3;
                                        }
                                        fileRefController = this;
                                    } else if (tLObject2 instanceof TLRPC.TL_help_appUpdate) {
                                        tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject2;
                                        try {
                                            SharedConfig.pendingAppUpdate = tL_help_appUpdate;
                                            SharedConfig.saveConfig();
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                        }
                                        try {
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        try {
                                            document3 = tL_help_appUpdate.document;
                                            if (document3 != null) {
                                                fileReference = document3.file_reference;
                                                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                                                TLRPC.Document document5 = tL_help_appUpdate.document;
                                                tL_inputDocumentFileLocation.f22395id = document5.f22386id;
                                                tL_inputDocumentFileLocation.access_hash = document5.access_hash;
                                                tL_inputDocumentFileLocation.file_reference = document5.file_reference;
                                                tL_inputDocumentFileLocation.thumb_size = "";
                                                inputFileLocationArr = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation};
                                            } else {
                                                fileReference = bArr;
                                            }
                                        } catch (Exception e11) {
                                            FileLog.e(e11);
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
                                            i25 = 0;
                                            while (i25 < size9) {
                                                fileReference = fileRefController.getFileReference(tL_wallPapers.wallpapers.get(i25).document, null, requester2.location, zArr3, inputFileLocationArr);
                                                if (fileReference != null) {
                                                    break;
                                                }
                                                zArr3 = zArr3;
                                                i25++;
                                                fileRefController = this;
                                            }
                                            if (fileReference != null && z10) {
                                                getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                                            }
                                        } else if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                            tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                            fileReference = getFileReference(tL_wallPaper.document, null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference != null && z10) {
                                                ArrayList<TLRPC.WallPaper> arrayList8 = new ArrayList<>();
                                                arrayList8.add(tL_wallPaper);
                                                getMessagesStorage().putWallpapers(arrayList8, 0);
                                            }
                                        } else if (tLObject2 instanceof TLRPC.TL_theme) {
                                            tL_theme = (TLRPC.TL_theme) tLObject2;
                                            fileRefController = this;
                                            fileReference = fileRefController.getFileReference(tL_theme.document, null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference != null && z10) {
                                                AndroidUtilities.runOnUIThread(new d1(tL_theme, 22));
                                            }
                                        } else {
                                            fileRefController = this;
                                            if (tLObject2 instanceof Vector) {
                                                vector = (Vector) tLObject2;
                                                if (!vector.objects.isEmpty()) {
                                                    size8 = vector.objects.size();
                                                    fileReference = bArr;
                                                    i22 = 0;
                                                    while (true) {
                                                        if (i22 < size8) {
                                                            zArr3 = zArr3;
                                                            break;
                                                        }
                                                        obj3 = vector.objects.get(i22);
                                                        if (obj3 instanceof TLRPC.User) {
                                                            TLRPC.User user2 = (TLRPC.User) obj3;
                                                            fileReference = fileRefController.getFileReference(user2, requester2.location, zArr3, inputFileLocationArr);
                                                            if (z10 || fileReference == null) {
                                                                zArr3 = zArr3;
                                                                vector2 = vector;
                                                                i23 = size8;
                                                                i24 = i22;
                                                            } else {
                                                                ArrayList arrayList9 = new ArrayList();
                                                                arrayList9.add(user2);
                                                                vector2 = vector;
                                                                i23 = size8;
                                                                i24 = i22;
                                                                fileRefController.getMessagesStorage().putUsersAndChats(arrayList9, null, true, true);
                                                                AndroidUtilities.runOnUIThread(new d2(9, fileRefController, user2));
                                                            }
                                                        } else {
                                                            vector2 = vector;
                                                            i23 = size8;
                                                            i24 = i22;
                                                            if (obj3 instanceof TLRPC.Chat) {
                                                                chat2 = (TLRPC.Chat) obj3;
                                                                byte[] fileReference7 = fileRefController.getFileReference(chat2, requester2.location, zArr3, inputFileLocationArr);
                                                                if (z10 && fileReference7 != null) {
                                                                    ArrayList arrayList10 = new ArrayList();
                                                                    arrayList10.add(chat2);
                                                                    fileRefController.getMessagesStorage().putUsersAndChats(null, arrayList10, true, true);
                                                                    final int i43 = 0;
                                                                    AndroidUtilities.runOnUIThread(new Runnable(fileRefController) {

                                                                        public final FileRefController f21315b;

                                                                        {
                                                                            this.f21315b = fileRefController;
                                                                        }

                                                                        @Override
                                                                        public final void run() {
                                                                            switch (i43) {
                                                                                case 0:
                                                                                    this.f21315b.lambda$onRequestComplete$48(chat2);
                                                                                    break;
                                                                                default:
                                                                                    this.f21315b.lambda$onRequestComplete$49(chat2);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                                zArr3 = zArr3;
                                                                fileReference = fileReference7;
                                                            }
                                                        }
                                                        if (fileReference != null) {
                                                            break;
                                                        }
                                                        i22 = i24 + 1;
                                                        vector = vector2;
                                                        size8 = i23;
                                                    }
                                                } else {
                                                    zArr3 = zArr3;
                                                    fileReference = bArr;
                                                }
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                                tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                                if (tL_messages_chats.chats.isEmpty()) {
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    fileReference = bArr;
                                                } else {
                                                    size7 = tL_messages_chats.chats.size();
                                                    fileReference = bArr;
                                                    i21 = 0;
                                                    while (true) {
                                                        if (i21 >= size7) {
                                                            zArr3 = zArr3;
                                                            break;
                                                        }
                                                        chat = tL_messages_chats.chats.get(i21);
                                                        fileReference3 = fileRefController.getFileReference(chat, requester2.location, zArr3, inputFileLocationArr);
                                                        if (fileReference3 != null) {
                                                            if (z10) {
                                                                zArr3 = zArr3;
                                                                ArrayList arrayList11 = new ArrayList();
                                                                arrayList11.add(chat);
                                                                final int i44 = 1;
                                                                obj2 = null;
                                                                fileRefController.getMessagesStorage().putUsersAndChats(null, arrayList11, true, true);
                                                                AndroidUtilities.runOnUIThread(new Runnable(fileRefController) {

                                                                    public final FileRefController f21315b;

                                                                    {
                                                                        this.f21315b = fileRefController;
                                                                    }

                                                                    @Override
                                                                    public final void run() {
                                                                        switch (i44) {
                                                                            case 0:
                                                                                this.f21315b.lambda$onRequestComplete$48(chat);
                                                                                break;
                                                                            default:
                                                                                this.f21315b.lambda$onRequestComplete$49(chat);
                                                                                break;
                                                                        }
                                                                    }
                                                                });
                                                            } else {
                                                                zArr3 = zArr3;
                                                                obj2 = null;
                                                            }
                                                            fileReference = fileReference3;
                                                            break;
                                                        }
                                                        zArr3 = zArr3;
                                                        i21++;
                                                        fileReference = fileReference3;
                                                    }
                                                }
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_savedGifs) {
                                                tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject2;
                                                size6 = tL_messages_savedGifs.gifs.size();
                                                fileReference = bArr;
                                                i19 = 0;
                                                while (i19 < size6) {
                                                    i20 = size6;
                                                    fileReference = fileRefController.getFileReference(tL_messages_savedGifs.gifs.get(i19), null, requester2.location, zArr3, inputFileLocationArr);
                                                    if (fileReference != null) {
                                                        break;
                                                    }
                                                    zArr3 = zArr3;
                                                    i19++;
                                                    fileRefController = this;
                                                    size6 = i20;
                                                }
                                                if (z10) {
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    getMediaDataController().processLoadedRecentDocuments(0, tL_messages_savedGifs.gifs, true, 0, true);
                                                }
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                if (bArr == null) {
                                                    size5 = tL_messages_stickerSet.documents.size();
                                                    fileReference = bArr;
                                                    i17 = 0;
                                                    while (true) {
                                                        if (i17 < size5) {
                                                            zArr3 = zArr3;
                                                            fileRefController = this;
                                                            break;
                                                        }
                                                        i18 = size5;
                                                        fileRefController = this;
                                                        fileReference = fileRefController.getFileReference(tL_messages_stickerSet.documents.get(i17), null, requester2.location, zArr3, inputFileLocationArr);
                                                        if (fileReference != null) {
                                                            break;
                                                        }
                                                        zArr3 = zArr3;
                                                        i17++;
                                                        size5 = i18;
                                                    }
                                                } else {
                                                    fileRefController = this;
                                                    fileReference = bArr;
                                                }
                                                if (z10) {
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    AndroidUtilities.runOnUIThread(new d2(10, fileRefController, tL_messages_stickerSet));
                                                }
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_recentStickers) {
                                                tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject2;
                                                size4 = tL_messages_recentStickers.stickers.size();
                                                fileReference = bArr;
                                                i15 = 0;
                                                while (i15 < size4) {
                                                    i16 = size4;
                                                    fileReference = getFileReference(tL_messages_recentStickers.stickers.get(i15), null, requester2.location, zArr3, inputFileLocationArr);
                                                    if (fileReference != null) {
                                                        break;
                                                    }
                                                    zArr3 = zArr3;
                                                    i15++;
                                                    size4 = i16;
                                                }
                                                if (z10) {
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                    getMediaDataController().processLoadedRecentDocuments(0, tL_messages_recentStickers.stickers, false, 0, true);
                                                }
                                            } else if (tLObject2 instanceof TLRPC.TL_messages_favedStickers) {
                                                tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject2;
                                                size3 = tL_messages_favedStickers.stickers.size();
                                                fileReference = bArr;
                                                i13 = 0;
                                                while (true) {
                                                    if (i13 < size3) {
                                                        zArr3 = zArr3;
                                                        fileRefController = this;
                                                        break;
                                                    }
                                                    i14 = size3;
                                                    fileRefController = this;
                                                    fileReference = fileRefController.getFileReference(tL_messages_favedStickers.stickers.get(i13), null, requester2.location, zArr3, inputFileLocationArr);
                                                    if (fileReference != null) {
                                                        break;
                                                    }
                                                    zArr3 = zArr3;
                                                    i13++;
                                                    size3 = i14;
                                                }
                                                if (z10) {
                                                    zArr3 = zArr3;
                                                    fileRefController.getMediaDataController().processLoadedRecentDocuments(2, tL_messages_favedStickers.stickers, false, 0, true);
                                                }
                                            } else {
                                                fileRefController = this;
                                                if (tLObject2 instanceof TLRPC.photos_Photos) {
                                                    photos_photos = (TLRPC.photos_Photos) tLObject2;
                                                    size2 = photos_photos.photos.size();
                                                    fileReference = bArr;
                                                    i12 = 0;
                                                    while (true) {
                                                        if (i12 >= size2) {
                                                            zArr3 = zArr3;
                                                            break;
                                                        }
                                                        fileReference = fileRefController.getFileReference(photos_photos.photos.get(i12), requester2.location, zArr3, inputFileLocationArr);
                                                        if (fileReference != null) {
                                                            zArr3 = zArr3;
                                                            break;
                                                        }
                                                        zArr3 = zArr3;
                                                        i12++;
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
                                                                requester2 = requester2;
                                                                tL_updateStory.peer = fileRefController.getMessagesController().getPeer(storyItem2.dialogId);
                                                                TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                                                                tL_updateStory.story = tL_storyItemDeleted;
                                                                tL_storyItemDeleted.f22617id = storyItem2.f22617id;
                                                                ArrayList<TLRPC.Update> arrayList12 = new ArrayList<>();
                                                                arrayList12.add(tL_updateStory);
                                                                fileRefController.getMessagesController().processUpdateArray(arrayList12, null, null, false, 0);
                                                            } else {
                                                                requester2 = requester2;
                                                                user = fileRefController.getMessagesController().getUser(Long.valueOf(storyItem2.dialogId));
                                                                if (user != null && user.contact) {
                                                                    MessagesController.getInstance(fileRefController.currentAccount).getStoriesController().f13963k.k(storyItem2.dialogId, storyItem);
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
                                                            requester2 = requester2;
                                                        }
                                                    } else {
                                                        requester2 = requester2;
                                                    }
                                                    inputFileLocationArr = inputFileLocationArr;
                                                    fileReference = fileReference2;
                                                } else {
                                                    zArr3 = zArr3;
                                                    zArr3 = zArr3;
                                                }
                                            }
                                        }
                                    }
                                    fileReference = bArr;
                                }
                                if (fileReference != null) {
                                    if (inputFileLocationArr != null) {
                                        inputFileLocation = inputFileLocationArr[0];
                                    } else {
                                        inputFileLocation = null;
                                    }
                                    if (fileRefController.onUpdateObjectReference(requester2, fileReference, inputFileLocation, z11)) {
                                        zArr = zArr3;
                                        i30 = 1;
                                        z12 = true;
                                    } else {
                                        i30 = 1;
                                    }
                                    i11++;
                                    tL_error = tL_error;
                                    i10 = i30;
                                } else {
                                    i30 = 1;
                                    fileRefController.sendErrorToObject(requester2.args, 1);
                                }
                                zArr = zArr3;
                                i11++;
                                tL_error = tL_error;
                                i10 = i30;
                            }
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            zArr3 = zArr3;
                            fileRefController = this;
                        }
                        zArr3 = zArr3;
                        zArr3 = zArr3;
                        zArr3 = zArr3;
                        zArr3 = zArr3;
                        zArr3 = zArr3;
                        inputFileLocationArr = inputFileLocationArr;
                        requester2 = requester2;
                        if (fileReference != null) {
                            if (inputFileLocationArr != null) {
                                inputFileLocation = inputFileLocationArr[0];
                            } else {
                                inputFileLocation = null;
                            }
                            if (fileRefController.onUpdateObjectReference(requester2, fileReference, inputFileLocation, z11)) {
                                zArr = zArr3;
                                i30 = 1;
                                z12 = true;
                            } else {
                                i30 = 1;
                            }
                            i11++;
                            tL_error = tL_error;
                            i10 = i30;
                        } else {
                            i30 = 1;
                            fileRefController.sendErrorToObject(requester2.args, 1);
                        }
                        zArr = zArr3;
                        i11++;
                        tL_error = tL_error;
                        i10 = i30;
                    }
                    i11++;
                    tL_error = tL_error;
                    i10 = i30;
                }
                fileRefController.locationRequester.remove(str);
                if (z12) {
                    fileRefController.putReponseToCache(str, tLObject2);
                }
                return z12;
            }
            str4 = "recent";
        }
        str3 = str4;
        i10 = 1;
        if (str2 != null) {
            tLObject2 = tLObject4;
            z12 = false;
        } else {
            tLObject2 = tLObject4;
            z12 = false;
        }
        arrayList = fileRefController.locationRequester.get(str);
        if (arrayList == null) {
            return z12;
        }
        size = arrayList.size();
        zArr = null;
        inputFileLocationArr = null;
        fileReference = null;
        i11 = 0;
        while (i11 < size) {
            requester = arrayList.get(i11);
            if (requester.completed) {
                i30 = i10;
            } else {
                if (tL_error != null) {
                    FileLog.e("debug_loading: " + ((FileLoadOperation) requester.args[i10]).getCacheFileFinal().getName() + " can't update file reference: " + tL_error.code + " " + tL_error.text);
                }
                if (requester.location instanceof TLRPC.TL_inputFileLocation) {
                    inputFileLocationArr = new TLRPC.InputFileLocation[i10];
                    zArr = new boolean[i10];
                } else {
                    inputFileLocationArr = new TLRPC.InputFileLocation[i10];
                    zArr = new boolean[i10];
                }
                inputFileLocationArr = inputFileLocationArr;
                zArr2 = zArr;
                requester.completed = i10;
                if (tLObject2 instanceof jh.a6) {
                    messageMedia4 = ((jh.a6) tLObject2).media;
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
                    }
                } else {
                    requester2 = requester;
                    zArr3 = zArr2;
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        messages_messages = (TLRPC.messages_Messages) tLObject2;
                        if (!messages_messages.messages.isEmpty()) {
                            size13 = messages_messages.messages.size();
                            i36 = 0;
                            while (true) {
                                if (i36 < size13) {
                                    message = messages_messages.messages.get(i36);
                                    messageMedia3 = message.media;
                                    i38 = size13;
                                    if (messageMedia3 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                        tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia3;
                                        i39 = i36;
                                        i40 = 0;
                                        while (i40 < tL_messageMediaPaidMedia.extended_media.size()) {
                                            messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i40);
                                            i41 = i40;
                                            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                                fileReference = fileRefController.getFileReferenceForMediaImpl(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, requester2.location, zArr3, inputFileLocationArr);
                                            }
                                            if (fileReference != null) {
                                                break;
                                                break;
                                            }
                                            i40 = i41 + 1;
                                        }
                                    } else {
                                        i39 = i36;
                                        richMessage = message.rich_message;
                                        if (richMessage != null) {
                                            fileReference6 = fileRefController.getFileReferenceForRichMessage(richMessage, requester2.location, zArr3, inputFileLocationArr);
                                        } else if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                            fileReference6 = fileRefController.getFileReferenceForPoll((TLRPC.TL_messageMediaPoll) messageMedia3, requester2.location, zArr3, inputFileLocationArr);
                                        } else if (messageMedia3 != null) {
                                            fileReference6 = fileRefController.getFileReferenceForMediaImpl(messageMedia3, requester2.location, zArr3, inputFileLocationArr);
                                        } else {
                                            messageAction = message.action;
                                            if (!(messageAction instanceof TLRPC.TL_messageActionChatEditPhoto)) {
                                            }
                                            fileReference6 = fileRefController.getFileReference(messageAction.photo, requester2.location, zArr3, inputFileLocationArr);
                                        }
                                        fileReference = fileReference6;
                                    }
                                    if (fileReference != null) {
                                        i36 = i39 + 1;
                                        fileRefController = this;
                                        size13 = i38;
                                    } else if (z10) {
                                        i37 = 0;
                                        fileRefController.getMessagesStorage().replaceMessageIfExists(message, messages_messages.users, messages_messages.chats, false);
                                        break;
                                    }
                                }
                                i37 = 0;
                                break;
                            }
                            if (fileReference == null) {
                                getMessagesStorage().replaceMessageIfExists(messages_messages.messages.get(i37), messages_messages.users, messages_messages.chats, true);
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("file ref not found in messages, replacing message");
                                }
                            }
                        } else if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("empty messages, file ref not found");
                        }
                    } else if (z13) {
                        arrayList6 = ((TLRPC.TL_help_premiumPromo) tLObject2).videos;
                        size12 = arrayList6.size();
                        i34 = 0;
                        while (i34 < size12) {
                            i35 = i34 + 1;
                            fileReference = getFileReference(arrayList6.get(i34), null, requester2.location, zArr3, inputFileLocationArr);
                            if (fileReference != null) {
                                break;
                                break;
                            }
                            i34 = i35;
                        }
                    } else {
                        if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                            TLRPC.TL_messages_availableReactions tL_messages_availableReactions2 = (TLRPC.TL_messages_availableReactions) tLObject2;
                            zArr4 = zArr3;
                            getMediaDataController().processLoadedReactions(tL_messages_availableReactions2.reactions, tL_messages_availableReactions2.hash, (int) (System.currentTimeMillis() / 1000), false);
                            arrayList4 = tL_messages_availableReactions2.reactions;
                            size11 = arrayList4.size();
                            fileReference = fileReference;
                            i31 = 0;
                            while (true) {
                                if (i31 < size11) {
                                    zArr3 = zArr4;
                                    break;
                                }
                                i32 = i31 + 1;
                                tL_availableReaction = arrayList4.get(i31);
                                arrayList5 = arrayList4;
                                zArr3 = zArr4;
                                i33 = size11;
                                fileReference5 = getFileReference(tL_availableReaction.static_icon, null, requester2.location, zArr3, inputFileLocationArr);
                                if (fileReference5 != null) {
                                    fileReference = getFileReference(tL_availableReaction.center_icon, null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference != null) {
                                        break;
                                        break;
                                    }
                                    size11 = i33;
                                    i31 = i32;
                                    arrayList4 = arrayList5;
                                    zArr4 = zArr3;
                                }
                                fileReference = fileReference5;
                                break;
                            }
                        }
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
                                    i30 = 1;
                                } else {
                                    fileReference = fileRefController.getFileReference(botInfo.description_photo, requester2.location, zArr3, inputFileLocationArr);
                                }
                            } else {
                                fileRefController = this;
                                zArr3 = zArr3;
                                fileReference = bArr;
                            }
                        } else {
                            if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                                tL_attachMenuBot = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot;
                                arrayList2 = tL_attachMenuBot.icons;
                                size10 = arrayList2.size();
                                fileReference4 = bArr;
                                i26 = 0;
                                while (i26 < size10) {
                                    i28 = i26 + 1;
                                    i29 = size10;
                                    fileReference4 = getFileReference(arrayList2.get(i26).icon, null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference4 != null) {
                                        break;
                                        break;
                                    }
                                    i26 = i28;
                                    size10 = i29;
                                }
                                if (z10) {
                                    TLRPC.TL_attachMenuBots attachMenuBots2 = getMediaDataController().getAttachMenuBots();
                                    arrayList3 = new ArrayList<>(attachMenuBots2.bots);
                                    i27 = 0;
                                    while (true) {
                                        if (i27 < arrayList3.size()) {
                                            bArr = fileReference4;
                                            zArr3 = zArr3;
                                            break;
                                        }
                                        bArr = fileReference4;
                                        zArr3 = zArr3;
                                        if (arrayList3.get(i27).bot_id == tL_attachMenuBot.bot_id) {
                                            arrayList3.set(i27, tL_attachMenuBot);
                                            break;
                                        }
                                        i27++;
                                        fileReference4 = bArr;
                                        zArr3 = zArr3;
                                    }
                                    attachMenuBots2.bots = arrayList3;
                                    getMediaDataController().processLoadedMenuBots(attachMenuBots2, attachMenuBots2.hash, (int) (System.currentTimeMillis() / 1000), false);
                                } else {
                                    bArr = fileReference4;
                                    zArr3 = zArr3;
                                }
                                fileRefController = this;
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
                                    tL_inputDocumentFileLocation2.f22395id = document6.f22386id;
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
                                    i25 = 0;
                                    while (i25 < size9) {
                                        fileReference = fileRefController.getFileReference(tL_wallPapers.wallpapers.get(i25).document, null, requester2.location, zArr3, inputFileLocationArr);
                                        if (fileReference != null) {
                                            break;
                                            break;
                                        }
                                        zArr3 = zArr3;
                                        i25++;
                                        fileRefController = this;
                                    }
                                    if (fileReference != null) {
                                        getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                                    }
                                } else if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    fileReference = getFileReference(tL_wallPaper.document, null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference != null) {
                                        ArrayList<TLRPC.WallPaper> arrayList14 = new ArrayList<>();
                                        arrayList14.add(tL_wallPaper);
                                        getMessagesStorage().putWallpapers(arrayList14, 0);
                                    }
                                } else if (tLObject2 instanceof TLRPC.TL_theme) {
                                    tL_theme = (TLRPC.TL_theme) tLObject2;
                                    fileRefController = this;
                                    fileReference = fileRefController.getFileReference(tL_theme.document, null, requester2.location, zArr3, inputFileLocationArr);
                                    if (fileReference != null) {
                                        AndroidUtilities.runOnUIThread(new d1(tL_theme, 22));
                                    }
                                } else {
                                    fileRefController = this;
                                    if (tLObject2 instanceof Vector) {
                                        vector = (Vector) tLObject2;
                                        if (!vector.objects.isEmpty()) {
                                            size8 = vector.objects.size();
                                            fileReference = bArr;
                                            i22 = 0;
                                            while (true) {
                                                if (i22 < size8) {
                                                    zArr3 = zArr3;
                                                    break;
                                                }
                                                obj3 = vector.objects.get(i22);
                                                if (obj3 instanceof TLRPC.User) {
                                                    TLRPC.User user3 = (TLRPC.User) obj3;
                                                    fileReference = fileRefController.getFileReference(user3, requester2.location, zArr3, inputFileLocationArr);
                                                    if (z10) {
                                                        zArr3 = zArr3;
                                                        vector2 = vector;
                                                        i23 = size8;
                                                        i24 = i22;
                                                    } else {
                                                        zArr3 = zArr3;
                                                        vector2 = vector;
                                                        i23 = size8;
                                                        i24 = i22;
                                                    }
                                                } else {
                                                    vector2 = vector;
                                                    i23 = size8;
                                                    i24 = i22;
                                                    if (obj3 instanceof TLRPC.Chat) {
                                                        chat2 = (TLRPC.Chat) obj3;
                                                        byte[] fileReference8 = fileRefController.getFileReference(chat2, requester2.location, zArr3, inputFileLocationArr);
                                                        if (z10) {
                                                            ArrayList arrayList15 = new ArrayList();
                                                            arrayList15.add(chat2);
                                                            fileRefController.getMessagesStorage().putUsersAndChats(null, arrayList15, true, true);
                                                            final int i45 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable(fileRefController) {

                                                                public final FileRefController f21315b;

                                                                {
                                                                    this.f21315b = fileRefController;
                                                                }

                                                                @Override
                                                                public final void run() {
                                                                    switch (i45) {
                                                                        case 0:
                                                                            this.f21315b.lambda$onRequestComplete$48(chat2);
                                                                            break;
                                                                        default:
                                                                            this.f21315b.lambda$onRequestComplete$49(chat2);
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                        }
                                                        zArr3 = zArr3;
                                                        fileReference = fileReference8;
                                                    }
                                                }
                                                if (fileReference != null) {
                                                    break;
                                                    break;
                                                }
                                                i22 = i24 + 1;
                                                vector = vector2;
                                                size8 = i23;
                                            }
                                        } else {
                                            zArr3 = zArr3;
                                            fileReference = bArr;
                                        }
                                    } else if (tLObject2 instanceof TLRPC.TL_messages_chats) {
                                        tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                        if (tL_messages_chats.chats.isEmpty()) {
                                            size7 = tL_messages_chats.chats.size();
                                            fileReference = bArr;
                                            i21 = 0;
                                            while (true) {
                                                if (i21 >= size7) {
                                                    zArr3 = zArr3;
                                                    break;
                                                    break;
                                                }
                                                chat = tL_messages_chats.chats.get(i21);
                                                fileReference3 = fileRefController.getFileReference(chat, requester2.location, zArr3, inputFileLocationArr);
                                                if (fileReference3 != null) {
                                                    if (z10) {
                                                        zArr3 = zArr3;
                                                        ArrayList arrayList16 = new ArrayList();
                                                        arrayList16.add(chat);
                                                        final int i46 = 1;
                                                        obj2 = null;
                                                        fileRefController.getMessagesStorage().putUsersAndChats(null, arrayList16, true, true);
                                                        AndroidUtilities.runOnUIThread(new Runnable(fileRefController) {

                                                            public final FileRefController f21315b;

                                                            {
                                                                this.f21315b = fileRefController;
                                                            }

                                                            @Override
                                                            public final void run() {
                                                                switch (i46) {
                                                                    case 0:
                                                                        this.f21315b.lambda$onRequestComplete$48(chat);
                                                                        break;
                                                                    default:
                                                                        this.f21315b.lambda$onRequestComplete$49(chat);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    } else {
                                                        zArr3 = zArr3;
                                                        obj2 = null;
                                                    }
                                                    fileReference = fileReference3;
                                                    break;
                                                }
                                                zArr3 = zArr3;
                                                i21++;
                                                fileReference = fileReference3;
                                            }
                                        } else {
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            fileReference = bArr;
                                        }
                                    } else if (tLObject2 instanceof TLRPC.TL_messages_savedGifs) {
                                        tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject2;
                                        size6 = tL_messages_savedGifs.gifs.size();
                                        fileReference = bArr;
                                        i19 = 0;
                                        while (i19 < size6) {
                                            i20 = size6;
                                            fileReference = fileRefController.getFileReference(tL_messages_savedGifs.gifs.get(i19), null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference != null) {
                                                break;
                                                break;
                                            }
                                            zArr3 = zArr3;
                                            i19++;
                                            fileRefController = this;
                                            size6 = i20;
                                        }
                                        if (z10) {
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            getMediaDataController().processLoadedRecentDocuments(0, tL_messages_savedGifs.gifs, true, 0, true);
                                        }
                                    } else if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                        tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                        if (bArr == null) {
                                            size5 = tL_messages_stickerSet.documents.size();
                                            fileReference = bArr;
                                            i17 = 0;
                                            while (true) {
                                                if (i17 < size5) {
                                                    zArr3 = zArr3;
                                                    fileRefController = this;
                                                    break;
                                                }
                                                i18 = size5;
                                                fileRefController = this;
                                                fileReference = fileRefController.getFileReference(tL_messages_stickerSet.documents.get(i17), null, requester2.location, zArr3, inputFileLocationArr);
                                                if (fileReference != null) {
                                                    break;
                                                    break;
                                                }
                                                zArr3 = zArr3;
                                                i17++;
                                                size5 = i18;
                                            }
                                        } else {
                                            fileRefController = this;
                                            fileReference = bArr;
                                        }
                                        if (z10) {
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            AndroidUtilities.runOnUIThread(new d2(10, fileRefController, tL_messages_stickerSet));
                                        }
                                    } else if (tLObject2 instanceof TLRPC.TL_messages_recentStickers) {
                                        tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject2;
                                        size4 = tL_messages_recentStickers.stickers.size();
                                        fileReference = bArr;
                                        i15 = 0;
                                        while (i15 < size4) {
                                            i16 = size4;
                                            fileReference = getFileReference(tL_messages_recentStickers.stickers.get(i15), null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference != null) {
                                                break;
                                                break;
                                            }
                                            zArr3 = zArr3;
                                            i15++;
                                            size4 = i16;
                                        }
                                        if (z10) {
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                            getMediaDataController().processLoadedRecentDocuments(0, tL_messages_recentStickers.stickers, false, 0, true);
                                        }
                                    } else if (tLObject2 instanceof TLRPC.TL_messages_favedStickers) {
                                        tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject2;
                                        size3 = tL_messages_favedStickers.stickers.size();
                                        fileReference = bArr;
                                        i13 = 0;
                                        while (true) {
                                            if (i13 < size3) {
                                                zArr3 = zArr3;
                                                fileRefController = this;
                                                break;
                                            }
                                            i14 = size3;
                                            fileRefController = this;
                                            fileReference = fileRefController.getFileReference(tL_messages_favedStickers.stickers.get(i13), null, requester2.location, zArr3, inputFileLocationArr);
                                            if (fileReference != null) {
                                                break;
                                                break;
                                            }
                                            zArr3 = zArr3;
                                            i13++;
                                            size3 = i14;
                                        }
                                        if (z10) {
                                            zArr3 = zArr3;
                                            fileRefController.getMediaDataController().processLoadedRecentDocuments(2, tL_messages_favedStickers.stickers, false, 0, true);
                                        }
                                    } else {
                                        fileRefController = this;
                                        if (tLObject2 instanceof TLRPC.photos_Photos) {
                                            photos_photos = (TLRPC.photos_Photos) tLObject2;
                                            size2 = photos_photos.photos.size();
                                            fileReference = bArr;
                                            i12 = 0;
                                            while (true) {
                                                if (i12 >= size2) {
                                                    zArr3 = zArr3;
                                                    break;
                                                }
                                                fileReference = fileRefController.getFileReference(photos_photos.photos.get(i12), requester2.location, zArr3, inputFileLocationArr);
                                                if (fileReference != null) {
                                                    zArr3 = zArr3;
                                                    break;
                                                }
                                                zArr3 = zArr3;
                                                i12++;
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
                                                        requester2 = requester2;
                                                        tL_updateStory3.peer = fileRefController.getMessagesController().getPeer(storyItem2.dialogId);
                                                        TL_stories.TL_storyItemDeleted tL_storyItemDeleted2 = new TL_stories.TL_storyItemDeleted();
                                                        tL_updateStory3.story = tL_storyItemDeleted2;
                                                        tL_storyItemDeleted2.f22617id = storyItem2.f22617id;
                                                        ArrayList<TLRPC.Update> arrayList17 = new ArrayList<>();
                                                        arrayList17.add(tL_updateStory3);
                                                        fileRefController.getMessagesController().processUpdateArray(arrayList17, null, null, false, 0);
                                                    } else {
                                                        requester2 = requester2;
                                                        user = fileRefController.getMessagesController().getUser(Long.valueOf(storyItem2.dialogId));
                                                        if (user != null) {
                                                            MessagesController.getInstance(fileRefController.currentAccount).getStoriesController().f13963k.k(storyItem2.dialogId, storyItem);
                                                        }
                                                    }
                                                    if (storyItem == null) {
                                                    }
                                                } else {
                                                    requester2 = requester2;
                                                }
                                            } else {
                                                requester2 = requester2;
                                            }
                                            inputFileLocationArr = inputFileLocationArr;
                                            fileReference = fileReference2;
                                        } else {
                                            zArr3 = zArr3;
                                            zArr3 = zArr3;
                                        }
                                    }
                                }
                            }
                            fileReference = bArr;
                        }
                        if (fileReference != null) {
                            if (inputFileLocationArr != null) {
                                inputFileLocation = inputFileLocationArr[0];
                            } else {
                                inputFileLocation = null;
                            }
                            if (fileRefController.onUpdateObjectReference(requester2, fileReference, inputFileLocation, z11)) {
                                zArr = zArr3;
                                i30 = 1;
                                z12 = true;
                            } else {
                                i30 = 1;
                            }
                            i11++;
                            tL_error = tL_error;
                            i10 = i30;
                        } else {
                            i30 = 1;
                            fileRefController.sendErrorToObject(requester2.args, 1);
                        }
                        zArr = zArr3;
                        i11++;
                        tL_error = tL_error;
                        i10 = i30;
                    }
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    zArr3 = zArr3;
                    fileRefController = this;
                }
                zArr3 = zArr3;
                zArr3 = zArr3;
                zArr3 = zArr3;
                zArr3 = zArr3;
                zArr3 = zArr3;
                inputFileLocationArr = inputFileLocationArr;
                requester2 = requester2;
                if (fileReference != null) {
                    if (inputFileLocationArr != null) {
                        inputFileLocation = inputFileLocationArr[0];
                    } else {
                        inputFileLocation = null;
                    }
                    if (fileRefController.onUpdateObjectReference(requester2, fileReference, inputFileLocation, z11)) {
                        zArr = zArr3;
                        i30 = 1;
                        z12 = true;
                    } else {
                        i30 = 1;
                    }
                    i11++;
                    tL_error = tL_error;
                    i10 = i30;
                } else {
                    i30 = 1;
                    fileRefController.sendErrorToObject(requester2.args, 1);
                }
                zArr = zArr3;
                i11++;
                tL_error = tL_error;
                i10 = i30;
            }
            i11++;
            tL_error = tL_error;
            i10 = i30;
        }
        fileRefController.locationRequester.remove(str);
        if (z12) {
            fileRefController.putReponseToCache(str, tLObject2);
        }
        return z12;
    }

    private boolean onUpdateObjectReference(final Requester requester, byte[] bArr, TLRPC.InputFileLocation inputFileLocation, boolean z10) {
        String strBytesToHex;
        Object obj;
        int iIndexOf;
        ArrayList arrayList;
        int i10;
        boolean z11;
        Object obj2;
        int iIndexOf2;
        ArrayList arrayList2;
        int i11;
        boolean z12;
        int iIndexOf3;
        ArrayList arrayList3;
        int i12;
        boolean z13;
        if (BuildVars.DEBUG_VERSION) {
            StringBuilder sb2 = new StringBuilder("fileref updated for ");
            sb2.append(requester.args[0]);
            sb2.append(" ");
            org.telegram.ui.Cells.pa.v(requester.locationKey, sb2);
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
                    if (!z10 || !isSameReference(tL_inputMediaDocument.f22441id.file_reference, bArr)) {
                        tL_inputMediaDocument.f22441id.file_reference = bArr;
                        iIndexOf3 = tL_messages_sendMultiMedia.multi_media.indexOf(tL_inputSingleMedia);
                        if (iIndexOf3 >= 0) {
                            arrayList3 = (ArrayList) objArr[3];
                            arrayList3.set(iIndexOf3, null);
                            z13 = true;
                            for (i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (arrayList3.get(i12) != null) {
                                    z13 = false;
                                }
                            }
                            if (z13) {
                                this.multiMediaCache.remove(tL_messages_sendMultiMedia);
                                AndroidUtilities.runOnUIThread(new k3(this, tL_messages_sendMultiMedia, objArr, 0));
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                    if (!z10 || !isSameReference(tL_inputMediaPhoto.f22443id.file_reference, bArr)) {
                        tL_inputMediaPhoto.f22443id.file_reference = bArr;
                    }
                    return false;
                }
                iIndexOf3 = tL_messages_sendMultiMedia.multi_media.indexOf(tL_inputSingleMedia);
                if (iIndexOf3 >= 0) {
                    arrayList3 = (ArrayList) objArr[3];
                    arrayList3.set(iIndexOf3, null);
                    z13 = true;
                    while (i12 < arrayList3.size()) {
                        if (arrayList3.get(i12) != null) {
                            z13 = false;
                        }
                    }
                    if (z13) {
                        this.multiMediaCache.remove(tL_messages_sendMultiMedia);
                        AndroidUtilities.runOnUIThread(new k3(this, tL_messages_sendMultiMedia, objArr, 0));
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
                    if (!z10 || !isSameReference(tL_inputMediaDocument2.f22441id.file_reference, bArr)) {
                        tL_inputMediaDocument2.f22441id.file_reference = bArr;
                        obj2 = tL_inputMediaDocument2;
                        iIndexOf2 = ((TLRPC.TL_inputMediaPaidMedia) tL_messages_sendMedia.media).extended_media.indexOf(obj2);
                        if (iIndexOf2 >= 0) {
                            arrayList2 = (ArrayList) objArr2[3];
                            arrayList2.set(iIndexOf2, null);
                            z12 = true;
                            for (i11 = 0; i11 < arrayList2.size(); i11++) {
                                if (arrayList2.get(i11) != null) {
                                    z12 = false;
                                }
                            }
                            if (z12) {
                                this.multiMediaCache.remove(tL_messages_sendMedia);
                                AndroidUtilities.runOnUIThread(new l3(this, tL_messages_sendMedia, objArr2, 0));
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) requester.args[0];
                    if (!z10 || !isSameReference(tL_inputMediaPhoto2.f22443id.file_reference, bArr)) {
                        tL_inputMediaPhoto2.f22443id.file_reference = bArr;
                        obj2 = tL_inputMediaPhoto2;
                    }
                    return false;
                }
                obj2 = null;
                iIndexOf2 = ((TLRPC.TL_inputMediaPaidMedia) tL_messages_sendMedia.media).extended_media.indexOf(obj2);
                if (iIndexOf2 >= 0) {
                    arrayList2 = (ArrayList) objArr2[3];
                    arrayList2.set(iIndexOf2, null);
                    z12 = true;
                    while (i11 < arrayList2.size()) {
                        if (arrayList2.get(i11) != null) {
                            z12 = false;
                        }
                    }
                    if (z12) {
                        this.multiMediaCache.remove(tL_messages_sendMedia);
                        AndroidUtilities.runOnUIThread(new l3(this, tL_messages_sendMedia, objArr2, 0));
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
                    if (!z10 || !isSameReference(tL_inputMediaDocument3.f22441id.file_reference, bArr)) {
                        tL_inputMediaDocument3.f22441id.file_reference = bArr;
                        obj = tL_inputMediaDocument3;
                        iIndexOf = ((TLRPC.TL_inputMediaPaidMedia) tL_sendMessage.media).extended_media.indexOf(obj);
                        if (iIndexOf >= 0) {
                            arrayList = (ArrayList) objArr3[3];
                            arrayList.set(iIndexOf, null);
                            z11 = true;
                            for (i10 = 0; i10 < arrayList.size(); i10++) {
                                if (arrayList.get(i10) != null) {
                                    z11 = false;
                                }
                            }
                            if (z11) {
                                this.multiMediaCache.remove(tL_sendMessage);
                                AndroidUtilities.runOnUIThread(new m3(this, tL_sendMessage, objArr3, 0));
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) requester.args[0];
                    if (!z10 || !isSameReference(tL_inputMediaPhoto3.f22443id.file_reference, bArr)) {
                        tL_inputMediaPhoto3.f22443id.file_reference = bArr;
                        obj = tL_inputMediaPhoto3;
                    }
                    return false;
                }
                obj = null;
                iIndexOf = ((TLRPC.TL_inputMediaPaidMedia) tL_sendMessage.media).extended_media.indexOf(obj);
                if (iIndexOf >= 0) {
                    arrayList = (ArrayList) objArr3[3];
                    arrayList.set(iIndexOf, null);
                    z11 = true;
                    while (i10 < arrayList.size()) {
                        if (arrayList.get(i10) != null) {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        this.multiMediaCache.remove(tL_sendMessage);
                        AndroidUtilities.runOnUIThread(new m3(this, tL_sendMessage, objArr3, 0));
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
                    if (!z10 || !isSameReference(tL_inputMediaPhoto4.f22443id.file_reference, bArr)) {
                        tL_inputMediaPhoto4.f22443id.file_reference = bArr;
                    }
                }
                final int i13 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final FileRefController f21029b;

                    {
                        this.f21029b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i13) {
                            case 0:
                                this.f21029b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f21029b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f21029b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f21029b.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia2;
            if (!z10 || !isSameReference(tL_inputMediaDocument4.f22441id.file_reference, bArr)) {
                tL_inputMediaDocument4.f22441id.file_reference = bArr;
                final int i14 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final FileRefController f21029b;

                    {
                        this.f21029b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i14) {
                            case 0:
                                this.f21029b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f21029b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f21029b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f21029b.lambda$onUpdateObjectReference$36(requester);
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
                    if (!z10 || !isSameReference(tL_inputMediaPhoto5.f22443id.file_reference, bArr)) {
                        tL_inputMediaPhoto5.f22443id.file_reference = bArr;
                    }
                }
                final int i15 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final FileRefController f21029b;

                    {
                        this.f21029b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i15) {
                            case 0:
                                this.f21029b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f21029b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f21029b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f21029b.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia3;
            if (!z10 || !isSameReference(tL_inputMediaDocument5.f22441id.file_reference, bArr)) {
                tL_inputMediaDocument5.f22441id.file_reference = bArr;
                final int i16 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final FileRefController f21029b;

                    {
                        this.f21029b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i16) {
                            case 0:
                                this.f21029b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f21029b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f21029b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f21029b.lambda$onUpdateObjectReference$36(requester);
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
                    if (!z10 || !isSameReference(tL_inputMediaPhoto6.f22443id.file_reference, bArr)) {
                        tL_inputMediaPhoto6.f22443id.file_reference = bArr;
                    }
                }
                final int i17 = 2;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final FileRefController f21029b;

                    {
                        this.f21029b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i17) {
                            case 0:
                                this.f21029b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f21029b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f21029b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f21029b.lambda$onUpdateObjectReference$36(requester);
                                break;
                        }
                    }
                });
                return true;
            }
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia4;
            if (!z10 || !isSameReference(tL_inputMediaDocument6.f22441id.file_reference, bArr)) {
                tL_inputMediaDocument6.f22441id.file_reference = bArr;
                final int i18 = 2;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final FileRefController f21029b;

                    {
                        this.f21029b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i18) {
                            case 0:
                                this.f21029b.lambda$onUpdateObjectReference$33(requester);
                                break;
                            case 1:
                                this.f21029b.lambda$onUpdateObjectReference$34(requester);
                                break;
                            case 2:
                                this.f21029b.lambda$onUpdateObjectReference$35(requester);
                                break;
                            default:
                                this.f21029b.lambda$onUpdateObjectReference$36(requester);
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
                    if (!z10 || !isSameReference(inputPhoto.file_reference, bArr)) {
                        inputPhoto.file_reference = bArr;
                        if (requester.args.length > 1 && (requester.args[1] instanceof Runnable)) {
                            AndroidUtilities.runOnUIThread((Runnable) requester.args[1]);
                        }
                    }
                } else {
                    TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) requester.args[0];
                    if (!z10 || !isSameReference(inputDocument.file_reference, bArr)) {
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
                        if (!z10 || !isSameReference(tL_inputMediaPhoto7.f22443id.file_reference, bArr)) {
                            tL_inputMediaPhoto7.f22443id.file_reference = bArr;
                        }
                    }
                    final int i19 = 3;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                        public final FileRefController f21029b;

                        {
                            this.f21029b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i19) {
                                case 0:
                                    this.f21029b.lambda$onUpdateObjectReference$33(requester);
                                    break;
                                case 1:
                                    this.f21029b.lambda$onUpdateObjectReference$34(requester);
                                    break;
                                case 2:
                                    this.f21029b.lambda$onUpdateObjectReference$35(requester);
                                    break;
                                default:
                                    this.f21029b.lambda$onUpdateObjectReference$36(requester);
                                    break;
                            }
                        }
                    });
                    return true;
                }
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                if (!z10 || !isSameReference(tL_inputMediaDocument7.f22441id.file_reference, bArr)) {
                    tL_inputMediaDocument7.f22441id.file_reference = bArr;
                    final int i110 = 3;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                        public final FileRefController f21029b;

                        {
                            this.f21029b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i110) {
                                case 0:
                                    this.f21029b.lambda$onUpdateObjectReference$33(requester);
                                    break;
                                case 1:
                                    this.f21029b.lambda$onUpdateObjectReference$34(requester);
                                    break;
                                case 2:
                                    this.f21029b.lambda$onUpdateObjectReference$35(requester);
                                    break;
                                default:
                                    this.f21029b.lambda$onUpdateObjectReference$36(requester);
                                    break;
                            }
                        }
                    });
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_messages_saveGif) {
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) requester.args[0];
                if (!z10 || !isSameReference(tL_messages_saveGif.f22487id.file_reference, bArr)) {
                    tL_messages_saveGif.f22487id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_messages_saveGif, new e5(5));
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_messages_saveRecentSticker) {
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) requester.args[0];
                if (!z10 || !isSameReference(tL_messages_saveRecentSticker.f22488id.file_reference, bArr)) {
                    tL_messages_saveRecentSticker.f22488id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new e5(6));
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_stickers_addStickerToSet) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) requester.args[0];
                if (!z10 || !isSameReference(tL_stickers_addStickerToSet.sticker.document.file_reference, bArr)) {
                    tL_stickers_addStickerToSet.sticker.document.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_stickers_addStickerToSet, new e5(7));
                    return true;
                }
            } else if (requester.args[0] instanceof TLRPC.TL_messages_faveSticker) {
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) requester.args[0];
                if (!z10 || !isSameReference(tL_messages_faveSticker.f22464id.file_reference, bArr)) {
                    tL_messages_faveSticker.f22464id.file_reference = bArr;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new e5(4));
                    return true;
                }
            } else {
                if (!(requester.args[0] instanceof TLRPC.TL_messages_getAttachedStickers)) {
                    if (requester.args[1] instanceof FileLoadOperation) {
                        FileLoadOperation fileLoadOperation = (FileLoadOperation) requester.args[1];
                        if (inputFileLocation != null) {
                            if (!z10 || !isSameReference(fileLoadOperation.location.file_reference, inputFileLocation.file_reference)) {
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
                        } else if (!z10 || !isSameReference(requester.location.file_reference, bArr)) {
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
                        if (!z10 || !isSameReference(tL_inputStickeredMediaPhoto.f22450id.file_reference, bArr)) {
                            tL_inputStickeredMediaPhoto.f22450id.file_reference = bArr;
                        }
                    }
                    getConnectionsManager().sendRequest(tL_messages_getAttachedStickers, (RequestDelegate) requester.args[1]);
                    return true;
                }
                TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                if (!z10 || !isSameReference(tL_inputStickeredMediaDocument.f22449id.file_reference, bArr)) {
                    tL_inputStickeredMediaDocument.f22449id.file_reference = bArr;
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
        if (obj instanceof jh.a6) {
            jh.a6 a6Var = (jh.a6) obj;
            jh.b6 b6Var = a6Var.f13045a;
            if (b6Var == null) {
                sendErrorToObject(objArr, 0);
                return;
            }
            j3.m mVar = new j3.m(b6Var, a6Var, new h2(this, str, str2, 2), 6);
            if (b6Var.F != 0) {
                ConnectionsManager.getInstance(b6Var.f13536c).cancelRequest(b6Var.F, true);
                b6Var.F = 0;
            }
            b6Var.C = false;
            b6Var.D = false;
            b6Var.H(mVar);
            return;
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = getMessagesController().getInputPeer(storyItem.dialogId);
            tL_stories_getStoriesByID.f22624id.add(Integer.valueOf(storyItem.f22617id));
            final int i10 = 7;
            getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i10) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_help_premiumPromo) {
            final int i11 = 16;
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i11) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_availableReaction) {
            TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
            tL_messages_getAvailableReactions.hash = 0;
            final int i12 = 17;
            getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i12) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TL_bots.BotInfo) {
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.f22520id = getMessagesController().getInputUser(((TL_bots.BotInfo) obj).user_id);
            final int i13 = 18;
            getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i13) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
            tL_messages_getAttachMenuBot.bot = getMessagesController().getInputUser(((TLRPC.TL_attachMenuBot) obj).bot_id);
            final int i14 = 19;
            getConnectionsManager().sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i14) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
                tL_messages_getScheduledMessages.f22480id.add(Integer.valueOf(messageObject.getRealId()));
                final int i15 = 20;
                getConnectionsManager().sendRequest(tL_messages_getScheduledMessages, new RequestDelegate(this) {

                    public final FileRefController f21124b;

                    {
                        this.f21124b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i15) {
                            case 0:
                                this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
                tL_messages_getQuickReplyMessages.f22479id.add(Integer.valueOf(messageObject.getRealId()));
                final int i16 = 21;
                getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new RequestDelegate(this) {

                    public final FileRefController f21124b;

                    {
                        this.f21124b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i16) {
                            case 0:
                                this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
                getrichmessage.f22600id = messageObject.getRealId();
                final int i17 = 22;
                getConnectionsManager().sendRequest(getrichmessage, new RequestDelegate(this) {

                    public final FileRefController f21124b;

                    {
                        this.f21124b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i17) {
                            case 0:
                                this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            if (channelId == 0) {
                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                tL_messages_getMessages.f22474id.add(Integer.valueOf(messageObject.getRealId()));
                final int i18 = 0;
                getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate(this) {

                    public final FileRefController f21124b;

                    {
                        this.f21124b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i18) {
                            case 0:
                                this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = getMessagesController().getInputChannel(channelId);
            tL_channels_getMessages.f22418id.add(Integer.valueOf(messageObject.getRealId()));
            final int i19 = 23;
            getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i19) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
            tL_inputWallPaper.f22452id = tL_wallPaper.f22532id;
            tL_inputWallPaper.access_hash = tL_wallPaper.access_hash;
            getwallpaper.wallpaper = tL_inputWallPaper;
            final int i20 = 1;
            getConnectionsManager().sendRequest(getwallpaper, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i20) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
            tL_inputTheme.f22451id = tL_theme.f22517id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            gettheme.theme = tL_inputTheme;
            gettheme.format = "android";
            final int i21 = 2;
            getConnectionsManager().sendRequest(gettheme, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i21) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
            final int i22 = 3;
            getConnectionsManager().sendRequest(tL_messages_getWebPage, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i22) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f22521id.add(getMessagesController().getInputUser((TLRPC.User) obj));
            final int i23 = 4;
            getConnectionsManager().sendRequest(tL_users_getUsers, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i23) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
                tL_messages_getChats.f22468id.add(Long.valueOf(chat.f22380id));
                final int i24 = 5;
                getConnectionsManager().sendRequest(tL_messages_getChats, new RequestDelegate(this) {

                    public final FileRefController f21124b;

                    {
                        this.f21124b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i24) {
                            case 0:
                                this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            if ((chat instanceof TLRPC.TL_channel) || (chat instanceof TLRPC.TL_community)) {
                TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                tL_channels_getChannels.f22416id.add(MessagesController.getInputChannel(chat));
                final int i25 = 6;
                getConnectionsManager().sendRequest(tL_channels_getChannels, new RequestDelegate(this) {

                    public final FileRefController f21124b;

                    {
                        this.f21124b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i25) {
                            case 0:
                                this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
                tL_inputStickerSetID.f22400id = stickerSet.f22407id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                final int i26 = 13;
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate(this) {

                    public final FileRefController f21124b;

                    {
                        this.f21124b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i26) {
                            case 0:
                                this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
                final int i27 = 15;
                getConnectionsManager().sendRequest(tL_messages_getStickerSet2, new RequestDelegate(this) {

                    public final FileRefController f21124b;

                    {
                        this.f21124b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i27) {
                            case 0:
                                this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
            tL_inputStickerSetID2.f22400id = stickerSet2.f22407id;
            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
            final int i28 = 14;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet3, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i28) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        String str3 = (String) obj;
        if ("wallpaper".equals(str3)) {
            if (this.wallpaperWaiters.isEmpty()) {
                final int i29 = 0;
                getConnectionsManager().sendRequest(new TL_account.getWallPapers(), new RequestDelegate(this) {

                    public final FileRefController f21221b;

                    {
                        this.f21221b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i29) {
                            case 0:
                                this.f21221b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.f21221b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.f21221b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.f21221b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
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
                final int i30 = 1;
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSavedGifs(), new RequestDelegate(this) {

                    public final FileRefController f21221b;

                    {
                        this.f21221b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i30) {
                            case 0:
                                this.f21221b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.f21221b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.f21221b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.f21221b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
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
                final int i31 = 2;
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getRecentStickers(), new RequestDelegate(this) {

                    public final FileRefController f21221b;

                    {
                        this.f21221b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i31) {
                            case 0:
                                this.f21221b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.f21221b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.f21221b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.f21221b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
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
                final int i32 = 3;
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_getFavedStickers(), new RequestDelegate(this) {

                    public final FileRefController f21221b;

                    {
                        this.f21221b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i32) {
                            case 0:
                                this.f21221b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                break;
                            case 1:
                                this.f21221b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                break;
                            case 2:
                                this.f21221b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                break;
                            default:
                                this.f21221b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
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
            final int i33 = 8;
            getConnectionsManager().sendRequest(tL_help_getAppUpdate, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i33) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
                final int i34 = 9;
                getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) {

                    public final FileRefController f21124b;

                    {
                        this.f21124b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                        switch (i34) {
                            case 0:
                                this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                break;
                            case 1:
                                this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                break;
                            case 2:
                                this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                break;
                            case 3:
                                this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                break;
                            case 4:
                                this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                break;
                            case 5:
                                this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                break;
                            case 6:
                                this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                break;
                            case 7:
                                this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                break;
                            case 8:
                                this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                break;
                            case 9:
                                this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                break;
                            case 10:
                                this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                break;
                            case 11:
                                this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                break;
                            case 12:
                                this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                break;
                            case 13:
                                this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                break;
                            case 14:
                                this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                break;
                            case 15:
                                this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                break;
                            case 16:
                                this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                break;
                            case 17:
                                this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                break;
                            case 18:
                                this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                break;
                            case 19:
                                this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                break;
                            case 20:
                                this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                break;
                            case 21:
                                this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                break;
                            case 22:
                                this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                break;
                            default:
                                this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
            tL_messages_search.f22489q = "";
            tL_messages_search.peer = getMessagesController().getInputPeer(jLongValue);
            final int i35 = 10;
            getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i35) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
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
            tL_messages_getMessages2.f22474id.add(Utilities.parseInt((CharSequence) strArrSplit[2]));
            final int i36 = 12;
            getConnectionsManager().sendRequest(tL_messages_getMessages2, new RequestDelegate(this) {

                public final FileRefController f21124b;

                {
                    this.f21124b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                    switch (i36) {
                        case 0:
                            this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            break;
                        case 1:
                            this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            break;
                        case 2:
                            this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            break;
                        case 3:
                            this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            break;
                        case 4:
                            this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            break;
                        case 5:
                            this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            break;
                        case 6:
                            this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            break;
                        case 7:
                            this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            break;
                        case 8:
                            this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            break;
                        case 9:
                            this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            break;
                        case 10:
                            this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            break;
                        case 11:
                            this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            break;
                        case 12:
                            this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            break;
                        case 13:
                            this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            break;
                        case 14:
                            this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            break;
                        case 15:
                            this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            break;
                        case 16:
                            this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            break;
                        case 17:
                            this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            break;
                        case 18:
                            this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            break;
                        case 19:
                            this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            break;
                        case 20:
                            this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            break;
                        case 21:
                            this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            break;
                        case 22:
                            this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            break;
                        default:
                            this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages2 = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages2.channel = getMessagesController().getInputChannel(jLongValue2);
        tL_channels_getMessages2.f22418id.add(Utilities.parseInt((CharSequence) strArrSplit[2]));
        final int i37 = 11;
        getConnectionsManager().sendRequest(tL_channels_getMessages2, new RequestDelegate(this) {

            public final FileRefController f21124b;

            {
                this.f21124b = this;
            }

            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws FileNotFoundException {
                switch (i37) {
                    case 0:
                        this.f21124b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                        break;
                    case 1:
                        this.f21124b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                        break;
                    case 2:
                        this.f21124b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                        break;
                    case 3:
                        this.f21124b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                        break;
                    case 4:
                        this.f21124b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                        break;
                    case 5:
                        this.f21124b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                        break;
                    case 6:
                        this.f21124b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                        break;
                    case 7:
                        this.f21124b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                        break;
                    case 8:
                        this.f21124b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                        break;
                    case 9:
                        this.f21124b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                        break;
                    case 10:
                        this.f21124b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                        break;
                    case 11:
                        this.f21124b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                        break;
                    case 12:
                        this.f21124b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                        break;
                    case 13:
                        this.f21124b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                        break;
                    case 14:
                        this.f21124b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                        break;
                    case 15:
                        this.f21124b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                        break;
                    case 16:
                        this.f21124b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                        break;
                    case 17:
                        this.f21124b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                        break;
                    case 18:
                        this.f21124b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                        break;
                    case 19:
                        this.f21124b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                        break;
                    case 20:
                        this.f21124b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                        break;
                    case 21:
                        this.f21124b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                        break;
                    case 22:
                        this.f21124b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                        break;
                    default:
                        this.f21124b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                        break;
                }
            }
        });
    }

    private void sendErrorToObject(final Object[] objArr, int i10) {
        boolean z10;
        boolean z11;
        Object obj;
        TLRPC.InputMedia inputMedia;
        Object obj2 = objArr[0];
        if (obj2 instanceof TLRPC.TL_inputSingleMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) objArr[1];
            Object[] objArr2 = this.multiMediaCache.get(tL_messages_sendMultiMedia);
            if (objArr2 != null) {
                this.multiMediaCache.remove(tL_messages_sendMultiMedia);
                AndroidUtilities.runOnUIThread(new k3(this, tL_messages_sendMultiMedia, objArr2, 1));
                return;
            }
            return;
        }
        boolean z12 = obj2 instanceof TLRPC.TL_inputMediaDocument;
        if (z12 || (obj2 instanceof TLRPC.TL_inputMediaPhoto)) {
            Object obj3 = objArr[1];
            if (obj3 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj3;
                Object[] objArr3 = this.multiMediaCache.get(tL_messages_sendMedia);
                if (objArr3 != null) {
                    this.multiMediaCache.remove(tL_messages_sendMedia);
                    AndroidUtilities.runOnUIThread(new l3(this, tL_messages_sendMedia, objArr3, 1));
                    return;
                }
                return;
            }
        }
        if (z12 || (obj2 instanceof TLRPC.TL_inputMediaPhoto)) {
            Object obj4 = objArr[1];
            if (obj4 instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) obj4;
                Object[] objArr4 = this.multiMediaCache.get(tL_sendMessage);
                if (objArr4 != null) {
                    this.multiMediaCache.remove(tL_sendMessage);
                    AndroidUtilities.runOnUIThread(new m3(this, tL_sendMessage, objArr4, 1));
                    return;
                }
                return;
            }
        }
        if (obj2 instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) obj2).media;
            if ((inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) || (inputMedia2 instanceof TLRPC.TL_inputMediaPoll)) {
                z10 = obj2 instanceof TLRPC.TL_messages_editMessage;
                if (!z10 && !((z11 = obj2 instanceof TLRPC.TL_messages_addPollAnswer))) {
                    if (obj2 instanceof TL_ephemeral.TL_sendMessage) {
                        inputMedia = ((TL_ephemeral.TL_sendMessage) obj2).media;
                        if ((inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) || (inputMedia instanceof TLRPC.TL_inputMediaPoll)) {
                            if (!z10 && !z11) {
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
                    } else if (!z10) {
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
                    final int i11 = 1;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {

                        public final FileRefController f21403b;

                        {
                            this.f21403b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.f21403b.lambda$sendErrorToObject$44(objArr);
                                    break;
                                default:
                                    this.f21403b.lambda$sendErrorToObject$45(objArr);
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        } else {
            z10 = obj2 instanceof TLRPC.TL_messages_editMessage;
            if (!z10) {
                if (obj2 instanceof TL_ephemeral.TL_sendMessage) {
                    inputMedia = ((TL_ephemeral.TL_sendMessage) obj2).media;
                    if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                        if (!z10) {
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
                    } else if (!z10) {
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
                } else if (!z10) {
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
                final int i12 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final FileRefController f21403b;

                    {
                        this.f21403b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.f21403b.lambda$sendErrorToObject$44(objArr);
                                break;
                            default:
                                this.f21403b.lambda$sendErrorToObject$45(objArr);
                                break;
                        }
                    }
                });
                return;
            }
        }
        final int i13 = 0;
        AndroidUtilities.runOnUIThread(new Runnable(this) {

            public final FileRefController f21403b;

            {
                this.f21403b = this;
            }

            @Override
            public final void run() {
                switch (i13) {
                    case 0:
                        this.f21403b.lambda$sendErrorToObject$44(objArr);
                        break;
                    default:
                        this.f21403b.lambda$sendErrorToObject$45(objArr);
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
                if (isSameReference(tL_inputMediaDocument.f22441id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument.f22441id.file_reference = bArr;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                if (isSameReference(tL_inputMediaPhoto.f22443id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto.f22443id.file_reference = bArr;
            }
        } else if (obj instanceof TL_ephemeral.TL_sendMessage) {
            TLRPC.InputMedia inputMedia2 = ((TL_ephemeral.TL_sendMessage) obj).media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                if (isSameReference(tL_inputMediaDocument2.f22441id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument2.f22441id.file_reference = bArr;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                if (isSameReference(tL_inputMediaPhoto2.f22443id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto2.f22443id.file_reference = bArr;
            }
        } else if (obj instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.InputMedia inputMedia3 = ((TLRPC.TL_messages_editMessage) obj).media;
            if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                if (isSameReference(tL_inputMediaDocument3.f22441id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument3.f22441id.file_reference = bArr;
            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                if (isSameReference(tL_inputMediaPhoto3.f22443id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto3.f22443id.file_reference = bArr;
            }
        } else if (obj instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_addPollAnswer) obj).answer.input_media;
            if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                if (isSameReference(tL_inputMediaDocument4.f22441id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaDocument4.f22441id.file_reference = bArr;
            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                if (isSameReference(tL_inputMediaPhoto4.f22443id.file_reference, bArr)) {
                    return false;
                }
                tL_inputMediaPhoto4.f22443id.file_reference = bArr;
            }
        } else if (obj instanceof TLRPC.TL_messages_saveGif) {
            TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj;
            if (isSameReference(tL_messages_saveGif.f22487id.file_reference, bArr)) {
                return false;
            }
            tL_messages_saveGif.f22487id.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_messages_saveRecentSticker) {
            TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj;
            if (isSameReference(tL_messages_saveRecentSticker.f22488id.file_reference, bArr)) {
                return false;
            }
            tL_messages_saveRecentSticker.f22488id.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_stickers_addStickerToSet) {
            TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
            if (isSameReference(tL_stickers_addStickerToSet.sticker.document.file_reference, bArr)) {
                return false;
            }
            tL_stickers_addStickerToSet.sticker.document.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_messages_faveSticker) {
            TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj;
            if (isSameReference(tL_messages_faveSticker.f22464id.file_reference, bArr)) {
                return false;
            }
            tL_messages_faveSticker.f22464id.file_reference = bArr;
        } else if (obj instanceof TLRPC.TL_messages_getAttachedStickers) {
            TLRPC.InputStickeredMedia inputStickeredMedia = ((TLRPC.TL_messages_getAttachedStickers) obj).media;
            if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument) {
                TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                if (isSameReference(tL_inputStickeredMediaDocument.f22449id.file_reference, bArr)) {
                    return false;
                }
                tL_inputStickeredMediaDocument.f22449id.file_reference = bArr;
            } else if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                if (isSameReference(tL_inputStickeredMediaPhoto.f22450id.file_reference, bArr)) {
                    return false;
                }
                tL_inputStickeredMediaPhoto.f22450id.file_reference = bArr;
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
        if ((obj2 instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            return null;
        }
        if ((obj2 instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        if ((obj2 instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            return null;
        }
        if ((obj2 instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) obj2).media instanceof TLRPC.TL_inputMediaPoll) && (obj instanceof ArrayList)) {
            return null;
        }
        if (obj2 instanceof jh.a6) {
            jh.a6 a6Var = (jh.a6) obj2;
            TLRPC.MessageMedia messageMedia = a6Var.media;
            if (messageMedia.document != null) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation.f22395id = a6Var.media.document.f22386id;
                return new Pair<>(tL_inputDocumentFileLocation, "botstory_doc_" + a6Var.media.document.f22386id);
            }
            if (messageMedia.photo == null) {
                return new Pair<>(new TLRPC.TL_inputDocumentFileLocation(), "botstory_" + a6Var.f22617id);
            }
            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
            tL_inputPhotoFileLocation.f22395id = a6Var.media.photo.f22404id;
            return new Pair<>(tL_inputPhotoFileLocation, "botstory_photo_" + a6Var.media.photo.f22404id);
        }
        if (obj2 instanceof TL_stories.TL_storyItem) {
            TL_stories.TL_storyItem tL_storyItem = (TL_stories.TL_storyItem) obj2;
            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation2 = new TLRPC.TL_inputDocumentFileLocation();
            tL_inputDocumentFileLocation2.f22395id = tL_storyItem.media.document.f22386id;
            return new Pair<>(tL_inputDocumentFileLocation2, "story_" + tL_storyItem.f22617id);
        }
        if (obj2 instanceof TLRPC.TL_inputSingleMedia) {
            TLRPC.InputMedia inputMedia = ((TLRPC.TL_inputSingleMedia) obj2).media;
            if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation3 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation3.f22395id = tL_inputMediaDocument.f22441id.f22392id;
                return new Pair<>(tL_inputDocumentFileLocation3, "file_" + tL_inputMediaDocument.f22441id.f22392id);
            }
            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation2 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation2.f22395id = tL_inputMediaPhoto.f22443id.f22399id;
                return new Pair<>(tL_inputPhotoFileLocation2, "photo_" + tL_inputMediaPhoto.f22443id.f22399id);
            }
        } else {
            if (obj2 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation4 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation4.f22395id = tL_inputMediaDocument2.f22441id.f22392id;
                return new Pair<>(tL_inputDocumentFileLocation4, "file_" + tL_inputMediaDocument2.f22441id.f22392id);
            }
            if (obj2 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) obj2;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation3 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation3.f22395id = tL_inputMediaPhoto2.f22443id.f22399id;
                return new Pair<>(tL_inputPhotoFileLocation3, "photo_" + tL_inputMediaPhoto2.f22443id.f22399id);
            }
            if (obj2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) obj2).media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation5 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation5.f22395id = tL_inputMediaDocument3.f22441id.f22392id;
                    return new Pair<>(tL_inputDocumentFileLocation5, "file_" + tL_inputMediaDocument3.f22441id.f22392id);
                }
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation4 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation4.f22395id = tL_inputMediaPhoto3.f22443id.f22399id;
                    return new Pair<>(tL_inputPhotoFileLocation4, "photo_" + tL_inputMediaPhoto3.f22443id.f22399id);
                }
                if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia3 = tL_inputMediaPaidMedia.extended_media.get(0);
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation6 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation6.f22395id = tL_inputMediaDocument4.f22441id.f22392id;
                            return new Pair<>(tL_inputDocumentFileLocation6, "file_" + tL_inputMediaDocument4.f22441id.f22392id);
                        }
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation5 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation5.f22395id = tL_inputMediaPhoto4.f22443id.f22399id;
                            return new Pair<>(tL_inputPhotoFileLocation5, "photo_" + tL_inputMediaPhoto4.f22443id.f22399id);
                        }
                    }
                }
            } else if (obj2 instanceof TL_ephemeral.TL_sendMessage) {
                TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) obj2).media;
                if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation7 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation7.f22395id = tL_inputMediaDocument5.f22441id.f22392id;
                    return new Pair<>(tL_inputDocumentFileLocation7, "file_" + tL_inputMediaDocument5.f22441id.f22392id);
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation6 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation6.f22395id = tL_inputMediaPhoto5.f22443id.f22399id;
                    return new Pair<>(tL_inputPhotoFileLocation6, "photo_" + tL_inputMediaPhoto5.f22443id.f22399id);
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia2.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia5 = tL_inputMediaPaidMedia2.extended_media.get(0);
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation8 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation8.f22395id = tL_inputMediaDocument6.f22441id.f22392id;
                            return new Pair<>(tL_inputDocumentFileLocation8, "file_" + tL_inputMediaDocument6.f22441id.f22392id);
                        }
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto6 = (TLRPC.TL_inputMediaPhoto) inputMedia5;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation7 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation7.f22395id = tL_inputMediaPhoto6.f22443id.f22399id;
                            return new Pair<>(tL_inputPhotoFileLocation7, "photo_" + tL_inputMediaPhoto6.f22443id.f22399id);
                        }
                    }
                }
            } else if (obj2 instanceof TLRPC.TL_messages_editMessage) {
                TLRPC.InputMedia inputMedia6 = ((TLRPC.TL_messages_editMessage) obj2).media;
                if (inputMedia6 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) inputMedia6;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation9 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation9.f22395id = tL_inputMediaDocument7.f22441id.f22392id;
                    return new Pair<>(tL_inputDocumentFileLocation9, "file_" + tL_inputMediaDocument7.f22441id.f22392id);
                }
                if (inputMedia6 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto7 = (TLRPC.TL_inputMediaPhoto) inputMedia6;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation8 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation8.f22395id = tL_inputMediaPhoto7.f22443id.f22399id;
                    return new Pair<>(tL_inputPhotoFileLocation8, "photo_" + tL_inputMediaPhoto7.f22443id.f22399id);
                }
            } else {
                if (obj2 instanceof TLRPC.InputPhoto) {
                    TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) obj2;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation9 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation9.f22395id = inputPhoto.f22399id;
                    return new Pair<>(tL_inputPhotoFileLocation9, "photo_" + inputPhoto.f22399id);
                }
                if (obj2 instanceof TLRPC.InputDocument) {
                    TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) obj2;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation10 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation10.f22395id = inputDocument.f22392id;
                    return new Pair<>(tL_inputDocumentFileLocation10, "file_" + inputDocument.f22392id);
                }
                if (obj2 instanceof TLRPC.TL_messages_addPollAnswer) {
                    TLRPC.InputMedia inputMedia7 = ((TLRPC.TL_messages_addPollAnswer) obj2).answer.input_media;
                    if (inputMedia7 instanceof TLRPC.TL_inputMediaDocument) {
                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument8 = (TLRPC.TL_inputMediaDocument) inputMedia7;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation11 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation11.f22395id = tL_inputMediaDocument8.f22441id.f22392id;
                        return new Pair<>(tL_inputDocumentFileLocation11, "file_" + tL_inputMediaDocument8.f22441id.f22392id);
                    }
                    if (inputMedia7 instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto8 = (TLRPC.TL_inputMediaPhoto) inputMedia7;
                        TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation10 = new TLRPC.TL_inputPhotoFileLocation();
                        tL_inputPhotoFileLocation10.f22395id = tL_inputMediaPhoto8.f22443id.f22399id;
                        return new Pair<>(tL_inputPhotoFileLocation10, "photo_" + tL_inputMediaPhoto8.f22443id.f22399id);
                    }
                } else {
                    if (obj2 instanceof TLRPC.TL_messages_saveGif) {
                        TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation12 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation12.f22395id = tL_messages_saveGif.f22487id.f22392id;
                        return new Pair<>(tL_inputDocumentFileLocation12, "file_" + tL_messages_saveGif.f22487id.f22392id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_saveRecentSticker) {
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation13 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation13.f22395id = tL_messages_saveRecentSticker.f22488id.f22392id;
                        return new Pair<>(tL_inputDocumentFileLocation13, "file_" + tL_messages_saveRecentSticker.f22488id.f22392id);
                    }
                    if (obj2 instanceof TLRPC.TL_stickers_addStickerToSet) {
                        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation14 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation14.f22395id = tL_stickers_addStickerToSet.sticker.document.f22392id;
                        return new Pair<>(tL_inputDocumentFileLocation14, "file_" + tL_stickers_addStickerToSet.sticker.document.f22392id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_faveSticker) {
                        TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj2;
                        TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation15 = new TLRPC.TL_inputDocumentFileLocation();
                        tL_inputDocumentFileLocation15.f22395id = tL_messages_faveSticker.f22464id.f22392id;
                        return new Pair<>(tL_inputDocumentFileLocation15, "file_" + tL_messages_faveSticker.f22464id.f22392id);
                    }
                    if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                        TLRPC.InputStickeredMedia inputStickeredMedia = ((TLRPC.TL_messages_getAttachedStickers) obj2).media;
                        if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument) {
                            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation16 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation16.f22395id = tL_inputStickeredMediaDocument.f22449id.f22392id;
                            return new Pair<>(tL_inputDocumentFileLocation16, "file_" + tL_inputStickeredMediaDocument.f22449id.f22392id);
                        }
                        if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation11 = new TLRPC.TL_inputPhotoFileLocation();
                            tL_inputPhotoFileLocation11.f22395id = tL_inputStickeredMediaPhoto.f22450id.f22399id;
                            return new Pair<>(tL_inputPhotoFileLocation11, "photo_" + tL_inputStickeredMediaPhoto.f22450id.f22399id);
                        }
                    } else {
                        if (obj2 instanceof TLRPC.TL_inputFileLocation) {
                            TLRPC.TL_inputFileLocation tL_inputFileLocation = (TLRPC.TL_inputFileLocation) obj2;
                            return new Pair<>(tL_inputFileLocation, "loc_" + tL_inputFileLocation.local_id + "_" + tL_inputFileLocation.volume_id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputDocumentFileLocation) {
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation17 = (TLRPC.TL_inputDocumentFileLocation) obj2;
                            return new Pair<>(tL_inputDocumentFileLocation17, "file_" + tL_inputDocumentFileLocation17.f22395id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputPhotoFileLocation) {
                            TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation12 = (TLRPC.TL_inputPhotoFileLocation) obj2;
                            return new Pair<>(tL_inputPhotoFileLocation12, "photo_" + tL_inputPhotoFileLocation12.f22395id);
                        }
                        if (obj2 instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = (TLRPC.TL_inputPeerPhotoFileLocation) obj2;
                            return new Pair<>(tL_inputPeerPhotoFileLocation, "avatar_" + tL_inputPeerPhotoFileLocation.f22395id);
                        }
                    }
                }
            }
        }
        return null;
    }

    public void requestReference(Object obj, Object... objArr) {
        String str;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        Object obj2;
        int i10 = 0;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start loading request reference parent " + getObjectString(obj) + " args = " + objArr[0]);
        }
        Object obj3 = objArr[0];
        if (obj3 instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) obj3;
            ArrayList arrayList = (ArrayList) obj;
            this.multiMediaCache.put(tL_messages_sendMultiMedia, objArr);
            int size = tL_messages_sendMultiMedia.multi_media.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj4 = (TLRPC.TL_inputSingleMedia) tL_messages_sendMultiMedia.multi_media.get(i11);
                Object obj5 = arrayList.get(i11);
                if (obj5 != null) {
                    requestReference(obj5, obj4, tL_messages_sendMultiMedia);
                }
            }
        } else if ((obj3 instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) obj3).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) obj3;
            TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) tL_messages_sendMedia.media;
            ArrayList arrayList2 = (ArrayList) obj;
            this.multiMediaCache.put(tL_messages_sendMedia, objArr);
            int size2 = tL_inputMediaPaidMedia.extended_media.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Object obj6 = (TLRPC.InputMedia) tL_inputMediaPaidMedia.extended_media.get(i12);
                Object obj7 = arrayList2.get(i12);
                if (obj7 != null) {
                    requestReference(obj7, obj6, tL_messages_sendMedia);
                }
            }
        } else if ((obj3 instanceof TL_ephemeral.TL_sendMessage) && (((TL_ephemeral.TL_sendMessage) obj3).media instanceof TLRPC.TL_inputMediaPaidMedia) && (obj instanceof ArrayList)) {
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) obj3;
            TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) tL_sendMessage.media;
            ArrayList arrayList3 = (ArrayList) obj;
            this.multiMediaCache.put(tL_sendMessage, objArr);
            int size3 = tL_inputMediaPaidMedia2.extended_media.size();
            for (int i13 = 0; i13 < size3; i13++) {
                Object obj8 = (TLRPC.InputMedia) tL_inputMediaPaidMedia2.extended_media.get(i13);
                Object obj9 = arrayList3.get(i13);
                if (obj9 != null) {
                    requestReference(obj9, obj8, tL_sendMessage);
                }
            }
        } else {
            Pair<TLRPC.InputFileLocation, String> locationAndKey = getLocationAndKey(obj, objArr);
            if (locationAndKey == null) {
                sendErrorToObject(objArr, 0);
                return;
            }
            TLRPC.InputFileLocation inputFileLocation = (TLRPC.InputFileLocation) locationAndKey.first;
            String str2 = (String) locationAndKey.second;
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                if (messageObject.getRealId() < 0 && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (obj2 = messageMedia.webpage) != null) {
                    obj = obj2;
                }
            }
            String keyForParentObject = getKeyForParentObject(obj);
            if (keyForParentObject == null) {
                sendErrorToObject(objArr, 0);
                return;
            }
            Requester requester = new Requester();
            requester.args = objArr;
            requester.location = inputFileLocation;
            requester.locationKey = str2;
            ArrayList<Requester> arrayList4 = this.locationRequester.get(str2);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList<>();
                this.locationRequester.put(str2, arrayList4);
                i10 = 1;
            }
            arrayList4.add(requester);
            ArrayList<Requester> arrayList5 = this.parentRequester.get(keyForParentObject);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList<>();
                this.parentRequester.put(keyForParentObject, arrayList5);
                i10++;
            }
            arrayList5.add(requester);
            if (i10 == 2) {
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
                cleanupCache();
                CachedResult cachedResponse = getCachedResponse(str);
                if (cachedResponse == null) {
                    CachedResult cachedResponse2 = getCachedResponse(keyForParentObject);
                    if (cachedResponse2 != null) {
                        if (onRequestComplete(str2, keyForParentObject, cachedResponse2.response, null, false, true)) {
                            return;
                        } else {
                            this.responseCache.remove(keyForParentObject);
                        }
                    }
                } else if (onRequestComplete(str2, keyForParentObject, cachedResponse.response, null, false, true)) {
                    return;
                } else {
                    this.responseCache.remove(str2);
                }
                requestReferenceFromServer(obj, str2, keyForParentObject, objArr);
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
            if (photo.f22404id == inputFileLocation.f22395id) {
                return photo.file_reference;
            }
            return null;
        }
        if (inputFileLocation instanceof TLRPC.TL_inputFileLocation) {
            int size = photo.sizes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.PhotoSize photoSize = photo.sizes.get(i10);
                byte[] fileReference = getFileReference(photoSize, inputFileLocation, zArr);
                if (zArr != null && zArr[0]) {
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                    inputFileLocationArr[0] = tL_inputPhotoFileLocation;
                    tL_inputPhotoFileLocation.f22395id = photo.f22404id;
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

    public static void lambda$onUpdateObjectReference$37(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$onUpdateObjectReference$38(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$onUpdateObjectReference$39(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$onUpdateObjectReference$40(TLObject tLObject, TLRPC.TL_error tL_error) {
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
            int i10 = 0;
            while (i10 < size) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i10);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    int size2 = tL_webPageAttributeTheme.documents.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        byte[] fileReference3 = fileRefController.getFileReference(tL_webPageAttributeTheme.documents.get(i11), null, inputFileLocation, zArr, inputFileLocationArr);
                        if (fileReference3 != null) {
                            return fileReference3;
                        }
                        i11++;
                        fileRefController = this;
                    }
                }
                i10++;
                fileRefController = this;
            }
        }
        TL_iv.Page page = webPage.cached_page;
        if (page == null) {
            return null;
        }
        int size3 = page.documents.size();
        for (int i12 = 0; i12 < size3; i12++) {
            byte[] fileReference4 = getFileReference(webPage.cached_page.documents.get(i12), null, inputFileLocation, zArr, inputFileLocationArr);
            if (fileReference4 != null) {
                return fileReference4;
            }
        }
        int size4 = webPage.cached_page.photos.size();
        for (int i13 = 0; i13 < size4; i13++) {
            byte[] fileReference5 = getFileReference(webPage.cached_page.photos.get(i13), inputFileLocation, zArr, inputFileLocationArr);
            if (fileReference5 != null) {
                return fileReference5;
            }
        }
        return null;
    }
}
