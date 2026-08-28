package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
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

    public FileRefController(int i9) {
        super(i9);
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

    private void broadcastWaitersData(ArrayList<Waiter> arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            Waiter waiter = arrayList.get(i9);
            String str = waiter.locationKey;
            String str2 = waiter.parentKey;
            if (i9 == size - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            onRequestComplete(str, str2, tLObject, tL_error, z10, false);
        }
        arrayList.clear();
    }

    private void cleanupCache() {
        if (Math.abs(SystemClock.elapsedRealtime() - this.lastCleanupTime) >= 600000) {
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
                for (int i9 = 0; i9 < size; i9++) {
                    this.responseCache.remove(arrayList.get(i9));
                }
            }
        }
    }

    private CachedResult getCachedResponse(String str) {
        CachedResult cachedResult = this.responseCache.get(str);
        if (cachedResult != null && Math.abs(System.currentTimeMillis() - cachedResult.firstQueryTime) >= 60000) {
            this.responseCache.remove(str);
            return null;
        }
        return cachedResult;
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
            int i9 = 0;
            if (inputFileLocation instanceof TLRPC.TL_inputDocumentFileLocation) {
                if (document.f22386id == inputFileLocation.f22395id) {
                    return document.file_reference;
                }
            } else {
                int size = document.thumbs.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.PhotoSize photoSize = document.thumbs.get(i10);
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
                    } else if (fileReference != null) {
                        return fileReference;
                    }
                }
            }
            if (arrayList != null) {
                while (i9 < arrayList.size()) {
                    TLRPC.InputFileLocation inputFileLocation2 = inputFileLocation;
                    boolean[] zArr2 = zArr;
                    TLRPC.InputFileLocation[] inputFileLocationArr2 = inputFileLocationArr;
                    byte[] fileReference2 = getFileReference(arrayList.get(i9), null, inputFileLocation2, zArr2, inputFileLocationArr2);
                    if (fileReference2 != null) {
                        return fileReference2;
                    }
                    i9++;
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
        byte[] bArr = null;
        if (messageMedia == null) {
            return null;
        }
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            inputFileLocation2 = inputFileLocation;
            zArr2 = zArr;
            inputFileLocationArr2 = inputFileLocationArr;
            bArr = getFileReference(document, messageMedia.alt_documents, inputFileLocation2, zArr2, inputFileLocationArr2);
        } else {
            inputFileLocation2 = inputFileLocation;
            zArr2 = zArr;
            inputFileLocationArr2 = inputFileLocationArr;
            TLRPC.TL_game tL_game = messageMedia.game;
            if (tL_game != null) {
                bArr = getFileReference(tL_game.document, null, inputFileLocation2, zArr2, inputFileLocationArr2);
                if (bArr == null) {
                    bArr = getFileReference(messageMedia.game.photo, inputFileLocation2, zArr2, inputFileLocationArr2);
                }
            } else {
                TLRPC.Photo photo2 = messageMedia.photo;
                if (photo2 != null) {
                    bArr = getFileReference(photo2, inputFileLocation2, zArr2, inputFileLocationArr2);
                } else {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (webPage != null) {
                        bArr = getFileReference(webPage, inputFileLocation2, zArr2, inputFileLocationArr2);
                    }
                }
            }
        }
        if (bArr == null && (photo = messageMedia.video_cover) != null) {
            return getFileReference(photo, inputFileLocation2, zArr2, inputFileLocationArr2);
        }
        return bArr;
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
            int i9 = 0;
            while (i9 < size) {
                TLRPC.PollAnswer pollAnswer = arrayList.get(i9);
                i9++;
                fileReferenceForMediaImpl = getFileReferenceForMediaImpl(pollAnswer.media, inputFileLocation, zArr, inputFileLocationArr);
                if (fileReferenceForMediaImpl != null) {
                    break;
                }
            }
        }
        return fileReferenceForMediaImpl;
    }

    private byte[] getFileReferenceForRichMessage(TL_iv.RichMessage richMessage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        byte[] bArr = null;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Photo photo = arrayList.get(i10);
            i10++;
            bArr = getFileReference(photo, inputFileLocation, zArr, inputFileLocationArr);
            if (bArr != null) {
                return bArr;
            }
        }
        ArrayList<TLRPC.Document> arrayList2 = richMessage.documents;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            TLRPC.Document document = arrayList2.get(i9);
            i9++;
            TLRPC.InputFileLocation inputFileLocation2 = inputFileLocation;
            boolean[] zArr2 = zArr;
            TLRPC.InputFileLocation[] inputFileLocationArr2 = inputFileLocationArr;
            bArr = getFileReference(document, null, inputFileLocation2, zArr2, inputFileLocationArr2);
            if (bArr != null) {
                return bArr;
            }
            inputFileLocation = inputFileLocation2;
            zArr = zArr2;
            inputFileLocationArr = inputFileLocationArr2;
        }
        return bArr;
    }

    private android.util.Pair<byte[], org.telegram.tgnet.TLRPC.InputFileLocation> getFileReferenceFromResponse(org.telegram.tgnet.TLRPC.InputFileLocation r20, java.lang.String r21, java.lang.String r22, org.telegram.tgnet.TLObject r23, java.lang.Object... r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.getFileReferenceFromResponse(org.telegram.tgnet.TLRPC$InputFileLocation, java.lang.String, java.lang.String, org.telegram.tgnet.TLObject, java.lang.Object[]):android.util.Pair");
    }

    public static FileRefController getInstance(int i9) {
        FileRefController fileRefController;
        FileRefController fileRefController2 = Instance[i9];
        if (fileRefController2 == null) {
            synchronized (FileRefController.class) {
                try {
                    fileRefController = Instance[i9];
                    if (fileRefController == null) {
                        FileRefController[] fileRefControllerArr = Instance;
                        FileRefController fileRefController3 = new FileRefController(i9);
                        fileRefControllerArr[i9] = fileRefController3;
                        fileRefController = fileRefController3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileRefController;
        }
        return fileRefController2;
    }

    public static String getKeyForParentObject(Object obj) {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (obj instanceof ih.e6) {
            ih.e6 e6Var = (ih.e6) obj;
            if (e6Var.f11366a == null) {
                FileLog.d("failed request reference can't find list in botpreview");
                return null;
            }
            TLRPC.MessageMedia messageMedia = e6Var.media;
            if (messageMedia.document != null) {
                return "botstory_doc_" + e6Var.media.document.f22386id;
            } else if (messageMedia.photo != null) {
                return "botstory_photo_" + e6Var.media.photo.f22404id;
            } else {
                return "botstory_" + e6Var.f22617id;
            }
        }
        long j10 = 0;
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            if (storyItem.dialogId == 0) {
                FileLog.d("failed request reference can't find dialogId");
                return null;
            }
            return "story_" + storyItem.dialogId + "_" + storyItem.f22617id;
        } else if (obj instanceof TLRPC.TL_help_premiumPromo) {
            return "premium_promo";
        } else {
            if (obj instanceof TLRPC.TL_availableReaction) {
                return "available_reaction_" + ((TLRPC.TL_availableReaction) obj).reaction;
            } else if (obj instanceof TL_bots.BotInfo) {
                return "bot_info_" + ((TL_bots.BotInfo) obj).user_id;
            } else if (obj instanceof TLRPC.TL_attachMenuBot) {
                return aa.d.m(((TLRPC.TL_attachMenuBot) obj).bot_id, "attach_menu_bot_");
            } else {
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    long channelId = messageObject.getChannelId();
                    if (messageObject.type == 29 && (message = messageObject.messageOwner) != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        channelId = DialogObject.getPeerDialogId(peer);
                    }
                    return "message" + messageObject.getRealId() + "_" + channelId + "_" + messageObject.scheduled + "_" + messageObject.getQuickReplyId();
                } else if (obj instanceof TLRPC.Message) {
                    TLRPC.Message message2 = (TLRPC.Message) obj;
                    TLRPC.Peer peer2 = message2.peer_id;
                    if (peer2 != null) {
                        j10 = peer2.channel_id;
                    }
                    return "message" + message2.f22401id + "_" + j10 + "_" + message2.from_scheduled;
                } else if (obj instanceof TLRPC.WebPage) {
                    return "webpage" + ((TLRPC.WebPage) obj).f22533id;
                } else if (obj instanceof TLRPC.User) {
                    return "user" + ((TLRPC.User) obj).f22527id;
                } else if (obj instanceof TLRPC.Chat) {
                    return "chat" + ((TLRPC.Chat) obj).f22380id;
                } else if (obj instanceof String) {
                    return "str".concat((String) obj);
                } else {
                    if (obj instanceof TLRPC.TL_messages_stickerSet) {
                        return "set" + ((TLRPC.TL_messages_stickerSet) obj).set.f22407id;
                    } else if (obj instanceof TLRPC.StickerSetCovered) {
                        return "set" + ((TLRPC.StickerSetCovered) obj).set.f22407id;
                    } else if (obj instanceof TLRPC.InputStickerSet) {
                        return "set" + ((TLRPC.InputStickerSet) obj).f22400id;
                    } else if (obj instanceof TLRPC.TL_wallPaper) {
                        return "wallpaper" + ((TLRPC.TL_wallPaper) obj).f22532id;
                    } else if (obj instanceof TLRPC.TL_theme) {
                        return "theme" + ((TLRPC.TL_theme) obj).f22517id;
                    } else if (obj == null) {
                        return null;
                    } else {
                        return "" + obj;
                    }
                }
            }
        }
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
            return aa.d.l(storyItem.f22617id, ")", sb2);
        } else if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            return "message(dialogId=" + messageObject.getDialogId() + "messageId" + messageObject.getId() + ")";
        } else if (obj == null) {
            return null;
        } else {
            return obj.getClass().getSimpleName();
        }
    }

    private boolean getPeerReferenceReplacement(TLRPC.User user, TLRPC.Chat chat, boolean z10, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation[] inputFileLocationArr, boolean[] zArr) {
        TLRPC.InputPeer tL_inputPeerChat;
        TLRPC.InputPeer inputPeer;
        if (zArr == null || !zArr[0]) {
            return false;
        }
        TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
        long j10 = inputFileLocation.volume_id;
        tL_inputPeerPhotoFileLocation.f22395id = j10;
        tL_inputPeerPhotoFileLocation.volume_id = j10;
        tL_inputPeerPhotoFileLocation.local_id = inputFileLocation.local_id;
        tL_inputPeerPhotoFileLocation.big = z10;
        if (user != null) {
            if (user.access_hash == 0 && user.fromMessageId != 0 && user.fromMessageDialogId != 0) {
                inputPeer = new TLRPC.TL_inputPeerUserFromMessage();
                inputPeer.user_id = user.f22527id;
                inputPeer.peer = getMessagesController().getInputPeer(user.fromMessageDialogId);
                inputPeer.msg_id = user.fromMessageId;
                tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
            } else {
                inputPeer = new TLRPC.TL_inputPeerUser();
                inputPeer.user_id = user.f22527id;
                inputPeer.access_hash = user.access_hash;
                tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
            }
        } else {
            if (ChatObject.isChannel(chat)) {
                if (chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChannelFromMessage();
                    tL_inputPeerChat.channel_id = chat.f22380id;
                    tL_inputPeerChat.peer = getMessagesController().getInputPeer(chat.fromMessageDialogId);
                    tL_inputPeerChat.msg_id = chat.fromMessageId;
                } else {
                    tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                    tL_inputPeerChat.channel_id = chat.f22380id;
                    tL_inputPeerChat.access_hash = chat.access_hash;
                }
            } else {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_inputPeerChat.chat_id = chat.f22380id;
            }
            tL_inputPeerPhotoFileLocation.photo_id = chat.photo.photo_id;
            inputPeer = tL_inputPeerChat;
        }
        tL_inputPeerPhotoFileLocation.peer = inputPeer;
        inputFileLocationArr[0] = tL_inputPeerPhotoFileLocation;
        return true;
    }

    public static boolean isFileRefError(String str) {
        if (!"FILEREF_EXPIRED".equals(str) && !"FILE_REFERENCE_EXPIRED".equals(str) && !"FILE_REFERENCE_EMPTY".equals(str)) {
            if (str == null || !str.startsWith("FILE_REFERENCE_")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean isFileRefErrorCover(String str) {
        if (str != null && isFileRefError(str) && str.endsWith("COVER_EXPIRED")) {
            return true;
        }
        return false;
    }

    private boolean isSameReference(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static void lambda$onRequestComplete$46(TLRPC.TL_theme tL_theme) {
        TLRPC.Document document;
        ArrayList arrayList = org.telegram.ui.ActionBar.f6.F;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.TL_theme tL_theme2 = ((org.telegram.ui.ActionBar.e6) arrayList.get(i9)).B;
            if (tL_theme2 != null && tL_theme2.f22517id == tL_theme.f22517id) {
                TLRPC.Document document2 = tL_theme2.document;
                if (document2 != null && (document = tL_theme.document) != null) {
                    document2.file_reference = document.file_reference;
                    org.telegram.ui.ActionBar.f6.s1(true, false);
                    return;
                }
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

    public void lambda$requestReferenceFromServer$0(String str, String str2, ih.e6 e6Var) {
        onRequestComplete(str, str2, e6Var, null, true, false);
    }

    public void lambda$requestReferenceFromServer$1(String str, String str2, ih.e6 e6Var) {
        Utilities.stageQueue.postRunnable(new gk(this, str, str2, e6Var, 7));
    }

    public void lambda$requestReferenceFromServer$10(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$11(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$12(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$13(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$14(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$15(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$16(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$17(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$18(TLObject tLObject, TLRPC.TL_error tL_error) {
        broadcastWaitersData(this.wallpaperWaiters, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        broadcastWaitersData(this.savedGifsWaiters, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$2(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$20(TLObject tLObject, TLRPC.TL_error tL_error) {
        broadcastWaitersData(this.recentStickersWaiter, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$21(TLObject tLObject, TLRPC.TL_error tL_error) {
        broadcastWaitersData(this.favStickersWaiter, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$22(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$23(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$24(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$25(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, false, false);
    }

    public void lambda$requestReferenceFromServer$26(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, false, false);
    }

    public void lambda$requestReferenceFromServer$27(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$28(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$29(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$3(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            getMediaDataController().processLoadedPremiumPromo((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
        }
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$4(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$5(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$6(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$7(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$8(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$9(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
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

    private boolean onRequestComplete(java.lang.String r30, java.lang.String r31, org.telegram.tgnet.TLObject r32, org.telegram.tgnet.TLRPC.TL_error r33, boolean r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.onRequestComplete(java.lang.String, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error, boolean, boolean):boolean");
    }

    private boolean onUpdateObjectReference(final org.telegram.messenger.FileRefController.Requester r8, byte[] r9, org.telegram.tgnet.TLRPC.InputFileLocation r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.onUpdateObjectReference(org.telegram.messenger.FileRefController$Requester, byte[], org.telegram.tgnet.TLRPC$InputFileLocation, boolean):boolean");
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
        if (obj instanceof ih.e6) {
            ih.e6 e6Var = (ih.e6) obj;
            ih.f6 f6Var = e6Var.f11366a;
            if (f6Var == null) {
                sendErrorToObject(objArr, 0);
                return;
            }
            ih.h3 h3Var = new ih.h3(f6Var, e6Var, new g2(this, str, str2, 2), 4);
            if (f6Var.F != 0) {
                ConnectionsManager.getInstance(f6Var.f11847c).cancelRequest(f6Var.F, true);
                f6Var.F = 0;
            }
            f6Var.C = false;
            f6Var.D = false;
            f6Var.H(h3Var);
        } else if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = getMessagesController().getInputPeer(storyItem.dialogId);
            tL_stories_getStoriesByID.f22624id.add(Integer.valueOf(storyItem.f22617id));
            getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else if (obj instanceof TLRPC.TL_help_premiumPromo) {
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else if (obj instanceof TLRPC.TL_availableReaction) {
            TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
            tL_messages_getAvailableReactions.hash = 0;
            getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else if (obj instanceof TL_bots.BotInfo) {
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.f22520id = getMessagesController().getInputUser(((TL_bots.BotInfo) obj).user_id);
            getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
            tL_messages_getAttachMenuBot.bot = getMessagesController().getInputUser(((TLRPC.TL_attachMenuBot) obj).bot_id);
            getConnectionsManager().sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            long channelId = messageObject.getChannelId();
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(messageObject.getDialogId());
            if (messageObject.scheduled) {
                TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                tL_messages_getScheduledMessages.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
                tL_messages_getScheduledMessages.f22480id.add(Integer.valueOf(messageObject.getRealId()));
                getConnectionsManager().sendRequest(tL_messages_getScheduledMessages, new RequestDelegate(this) {
                    public final FileRefController f20938b;

                    {
                        this.f20938b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                return;
                            case 1:
                                this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                return;
                            case 2:
                                this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                return;
                            case 3:
                                this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                return;
                            case 4:
                                this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                return;
                            case 5:
                                this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                return;
                            case 6:
                                this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                return;
                            case 7:
                                this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                return;
                            case 8:
                                this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                return;
                            case 9:
                                this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                return;
                            case 10:
                                this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                return;
                            case 11:
                                this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                return;
                            case 12:
                                this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                return;
                            case 13:
                                this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                return;
                            case 14:
                                this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                return;
                            case 15:
                                this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                return;
                            case 16:
                                this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                return;
                            case 17:
                                this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                return;
                            case 18:
                                this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                return;
                            case 19:
                                this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                return;
                            case 20:
                                this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                return;
                            case 21:
                                this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                return;
                            case 22:
                                this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                return;
                            default:
                                this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                return;
                        }
                    }
                });
            } else if (messageObject.isQuickReply()) {
                TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                tL_messages_getQuickReplyMessages.shortcut_id = messageObject.getQuickReplyId();
                tL_messages_getQuickReplyMessages.flags |= 1;
                tL_messages_getQuickReplyMessages.f22479id.add(Integer.valueOf(messageObject.getRealId()));
                getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new RequestDelegate(this) {
                    public final FileRefController f20938b;

                    {
                        this.f20938b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                return;
                            case 1:
                                this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                return;
                            case 2:
                                this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                return;
                            case 3:
                                this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                return;
                            case 4:
                                this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                return;
                            case 5:
                                this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                return;
                            case 6:
                                this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                return;
                            case 7:
                                this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                return;
                            case 8:
                                this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                return;
                            case 9:
                                this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                return;
                            case 10:
                                this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                return;
                            case 11:
                                this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                return;
                            case 12:
                                this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                return;
                            case 13:
                                this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                return;
                            case 14:
                                this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                return;
                            case 15:
                                this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                return;
                            case 16:
                                this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                return;
                            case 17:
                                this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                return;
                            case 18:
                                this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                return;
                            case 19:
                                this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                return;
                            case 20:
                                this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                return;
                            case 21:
                                this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                return;
                            case 22:
                                this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                return;
                            default:
                                this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                return;
                        }
                    }
                });
            } else {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null && message.rich_message != null && inputPeer != null) {
                    TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                    getrichmessage.peer = inputPeer;
                    getrichmessage.f22600id = messageObject.getRealId();
                    getConnectionsManager().sendRequest(getrichmessage, new RequestDelegate(this) {
                        public final FileRefController f20938b;

                        {
                            this.f20938b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r4) {
                                case 0:
                                    this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                    return;
                                case 1:
                                    this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                    return;
                                case 2:
                                    this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                    return;
                                case 3:
                                    this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                    return;
                                case 4:
                                    this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                    return;
                                case 5:
                                    this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                    return;
                                case 6:
                                    this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                    return;
                                case 7:
                                    this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                    return;
                                case 8:
                                    this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                    return;
                                case 9:
                                    this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                    return;
                                case 10:
                                    this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                    return;
                                case 11:
                                    this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                    return;
                                case 12:
                                    this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                    return;
                                case 13:
                                    this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                    return;
                                case 14:
                                    this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                    return;
                                case 15:
                                    this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                    return;
                                case 16:
                                    this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                    return;
                                case 17:
                                    this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                    return;
                                case 18:
                                    this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                    return;
                                case 19:
                                    this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                    return;
                                case 20:
                                    this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                    return;
                                case 21:
                                    this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                    return;
                                case 22:
                                    this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                    return;
                                default:
                                    this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                    return;
                            }
                        }
                    });
                } else if (channelId != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(channelId);
                    tL_channels_getMessages.f22418id.add(Integer.valueOf(messageObject.getRealId()));
                    getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate(this) {
                        public final FileRefController f20938b;

                        {
                            this.f20938b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r4) {
                                case 0:
                                    this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                    return;
                                case 1:
                                    this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                    return;
                                case 2:
                                    this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                    return;
                                case 3:
                                    this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                    return;
                                case 4:
                                    this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                    return;
                                case 5:
                                    this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                    return;
                                case 6:
                                    this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                    return;
                                case 7:
                                    this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                    return;
                                case 8:
                                    this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                    return;
                                case 9:
                                    this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                    return;
                                case 10:
                                    this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                    return;
                                case 11:
                                    this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                    return;
                                case 12:
                                    this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                    return;
                                case 13:
                                    this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                    return;
                                case 14:
                                    this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                    return;
                                case 15:
                                    this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                    return;
                                case 16:
                                    this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                    return;
                                case 17:
                                    this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                    return;
                                case 18:
                                    this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                    return;
                                case 19:
                                    this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                    return;
                                case 20:
                                    this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                    return;
                                case 21:
                                    this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                    return;
                                case 22:
                                    this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                    return;
                                default:
                                    this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                    return;
                            }
                        }
                    });
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f22474id.add(Integer.valueOf(messageObject.getRealId()));
                    getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate(this) {
                        public final FileRefController f20938b;

                        {
                            this.f20938b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r4) {
                                case 0:
                                    this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                    return;
                                case 1:
                                    this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                    return;
                                case 2:
                                    this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                    return;
                                case 3:
                                    this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                    return;
                                case 4:
                                    this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                    return;
                                case 5:
                                    this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                    return;
                                case 6:
                                    this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                    return;
                                case 7:
                                    this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                    return;
                                case 8:
                                    this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                    return;
                                case 9:
                                    this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                    return;
                                case 10:
                                    this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                    return;
                                case 11:
                                    this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                    return;
                                case 12:
                                    this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                    return;
                                case 13:
                                    this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                    return;
                                case 14:
                                    this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                    return;
                                case 15:
                                    this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                    return;
                                case 16:
                                    this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                    return;
                                case 17:
                                    this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                    return;
                                case 18:
                                    this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                    return;
                                case 19:
                                    this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                    return;
                                case 20:
                                    this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                    return;
                                case 21:
                                    this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                    return;
                                case 22:
                                    this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                    return;
                                default:
                                    this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                    return;
                            }
                        }
                    });
                }
            }
        } else if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
            tL_inputWallPaper.f22452id = tL_wallPaper.f22532id;
            tL_inputWallPaper.access_hash = tL_wallPaper.access_hash;
            getwallpaper.wallpaper = tL_inputWallPaper;
            getConnectionsManager().sendRequest(getwallpaper, new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else if (obj instanceof TLRPC.TL_theme) {
            TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj;
            TL_account.getTheme gettheme = new TL_account.getTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f22451id = tL_theme.f22517id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            gettheme.theme = tL_inputTheme;
            gettheme.format = "android";
            getConnectionsManager().sendRequest(gettheme, new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else if (obj instanceof TLRPC.WebPage) {
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = ((TLRPC.WebPage) obj).url;
            tL_messages_getWebPage.hash = 0;
            getConnectionsManager().sendRequest(tL_messages_getWebPage, new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else if (obj instanceof TLRPC.User) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f22521id.add(getMessagesController().getInputUser((TLRPC.User) obj));
            getConnectionsManager().sendRequest(tL_users_getUsers, new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat instanceof TLRPC.TL_chat) {
                TLRPC.TL_messages_getChats tL_messages_getChats = new TLRPC.TL_messages_getChats();
                tL_messages_getChats.f22468id.add(Long.valueOf(chat.f22380id));
                getConnectionsManager().sendRequest(tL_messages_getChats, new RequestDelegate(this) {
                    public final FileRefController f20938b;

                    {
                        this.f20938b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                return;
                            case 1:
                                this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                return;
                            case 2:
                                this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                return;
                            case 3:
                                this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                return;
                            case 4:
                                this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                return;
                            case 5:
                                this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                return;
                            case 6:
                                this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                return;
                            case 7:
                                this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                return;
                            case 8:
                                this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                return;
                            case 9:
                                this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                return;
                            case 10:
                                this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                return;
                            case 11:
                                this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                return;
                            case 12:
                                this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                return;
                            case 13:
                                this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                return;
                            case 14:
                                this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                return;
                            case 15:
                                this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                return;
                            case 16:
                                this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                return;
                            case 17:
                                this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                return;
                            case 18:
                                this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                return;
                            case 19:
                                this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                return;
                            case 20:
                                this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                return;
                            case 21:
                                this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                return;
                            case 22:
                                this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                return;
                            default:
                                this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                return;
                        }
                    }
                });
            } else if (!(chat instanceof TLRPC.TL_channel) && !(chat instanceof TLRPC.TL_community)) {
            } else {
                TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                tL_channels_getChannels.f22416id.add(MessagesController.getInputChannel(chat));
                getConnectionsManager().sendRequest(tL_channels_getChannels, new RequestDelegate(this) {
                    public final FileRefController f20938b;

                    {
                        this.f20938b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                return;
                            case 1:
                                this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                return;
                            case 2:
                                this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                return;
                            case 3:
                                this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                return;
                            case 4:
                                this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                return;
                            case 5:
                                this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                return;
                            case 6:
                                this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                return;
                            case 7:
                                this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                return;
                            case 8:
                                this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                return;
                            case 9:
                                this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                return;
                            case 10:
                                this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                return;
                            case 11:
                                this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                return;
                            case 12:
                                this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                return;
                            case 13:
                                this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                return;
                            case 14:
                                this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                return;
                            case 15:
                                this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                return;
                            case 16:
                                this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                return;
                            case 17:
                                this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                return;
                            case 18:
                                this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                return;
                            case 19:
                                this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                return;
                            case 20:
                                this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                return;
                            case 21:
                                this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                return;
                            case 22:
                                this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                return;
                            default:
                                this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                return;
                        }
                    }
                });
            }
        } else if (obj instanceof String) {
            String str3 = (String) obj;
            if ("wallpaper".equals(str3)) {
                if (this.wallpaperWaiters.isEmpty()) {
                    getConnectionsManager().sendRequest(new TL_account.getWallPapers(), new RequestDelegate(this) {
                        public final FileRefController f21018b;

                        {
                            this.f21018b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    this.f21018b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                    return;
                                case 1:
                                    this.f21018b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                    return;
                                case 2:
                                    this.f21018b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                    return;
                                default:
                                    this.f21018b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                    return;
                            }
                        }
                    });
                }
                this.wallpaperWaiters.add(new Waiter(str, str2));
            } else if (str3.startsWith("gif")) {
                if (this.savedGifsWaiters.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSavedGifs(), new RequestDelegate(this) {
                        public final FileRefController f21018b;

                        {
                            this.f21018b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    this.f21018b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                    return;
                                case 1:
                                    this.f21018b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                    return;
                                case 2:
                                    this.f21018b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                    return;
                                default:
                                    this.f21018b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                    return;
                            }
                        }
                    });
                }
                this.savedGifsWaiters.add(new Waiter(str, str2));
            } else if ("recent".equals(str3)) {
                if (this.recentStickersWaiter.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC.TL_messages_getRecentStickers(), new RequestDelegate(this) {
                        public final FileRefController f21018b;

                        {
                            this.f21018b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    this.f21018b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                    return;
                                case 1:
                                    this.f21018b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                    return;
                                case 2:
                                    this.f21018b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                    return;
                                default:
                                    this.f21018b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                    return;
                            }
                        }
                    });
                }
                this.recentStickersWaiter.add(new Waiter(str, str2));
            } else if ("fav".equals(str3)) {
                if (this.favStickersWaiter.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC.TL_messages_getFavedStickers(), new RequestDelegate(this) {
                        public final FileRefController f21018b;

                        {
                            this.f21018b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    this.f21018b.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                                    return;
                                case 1:
                                    this.f21018b.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                                    return;
                                case 2:
                                    this.f21018b.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                                    return;
                                default:
                                    this.f21018b.lambda$requestReferenceFromServer$21(tLObject, tL_error);
                                    return;
                            }
                        }
                    });
                }
                this.favStickersWaiter.add(new Waiter(str, str2));
            } else if ("update".equals(str3)) {
                TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                try {
                    tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
                } catch (Exception unused) {
                }
                if (tL_help_getAppUpdate.source == null) {
                    tL_help_getAppUpdate.source = "";
                }
                getConnectionsManager().sendRequest(tL_help_getAppUpdate, new RequestDelegate(this) {
                    public final FileRefController f20938b;

                    {
                        this.f20938b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                return;
                            case 1:
                                this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                return;
                            case 2:
                                this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                return;
                            case 3:
                                this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                return;
                            case 4:
                                this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                return;
                            case 5:
                                this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                return;
                            case 6:
                                this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                return;
                            case 7:
                                this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                return;
                            case 8:
                                this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                return;
                            case 9:
                                this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                return;
                            case 10:
                                this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                return;
                            case 11:
                                this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                return;
                            case 12:
                                this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                return;
                            case 13:
                                this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                return;
                            case 14:
                                this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                return;
                            case 15:
                                this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                return;
                            case 16:
                                this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                return;
                            case 17:
                                this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                return;
                            case 18:
                                this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                return;
                            case 19:
                                this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                return;
                            case 20:
                                this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                return;
                            case 21:
                                this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                return;
                            case 22:
                                this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                return;
                            default:
                                this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                return;
                        }
                    }
                });
            } else if (str3.startsWith("avatar_")) {
                long longValue = Utilities.parseLong(str3).longValue();
                if (longValue > 0) {
                    TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
                    tL_photos_getUserPhotos.limit = 80;
                    tL_photos_getUserPhotos.offset = 0;
                    tL_photos_getUserPhotos.max_id = 0L;
                    tL_photos_getUserPhotos.user_id = getMessagesController().getInputUser(longValue);
                    getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) {
                        public final FileRefController f20938b;

                        {
                            this.f20938b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r4) {
                                case 0:
                                    this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                    return;
                                case 1:
                                    this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                    return;
                                case 2:
                                    this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                    return;
                                case 3:
                                    this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                    return;
                                case 4:
                                    this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                    return;
                                case 5:
                                    this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                    return;
                                case 6:
                                    this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                    return;
                                case 7:
                                    this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                    return;
                                case 8:
                                    this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                    return;
                                case 9:
                                    this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                    return;
                                case 10:
                                    this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                    return;
                                case 11:
                                    this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                    return;
                                case 12:
                                    this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                    return;
                                case 13:
                                    this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                    return;
                                case 14:
                                    this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                    return;
                                case 15:
                                    this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                    return;
                                case 16:
                                    this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                    return;
                                case 17:
                                    this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                    return;
                                case 18:
                                    this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                    return;
                                case 19:
                                    this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                    return;
                                case 20:
                                    this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                    return;
                                case 21:
                                    this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                    return;
                                case 22:
                                    this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                    return;
                                default:
                                    this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                    return;
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
                tL_messages_search.peer = getMessagesController().getInputPeer(longValue);
                getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) {
                    public final FileRefController f20938b;

                    {
                        this.f20938b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                return;
                            case 1:
                                this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                return;
                            case 2:
                                this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                return;
                            case 3:
                                this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                return;
                            case 4:
                                this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                return;
                            case 5:
                                this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                return;
                            case 6:
                                this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                return;
                            case 7:
                                this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                return;
                            case 8:
                                this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                return;
                            case 9:
                                this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                return;
                            case 10:
                                this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                return;
                            case 11:
                                this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                return;
                            case 12:
                                this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                return;
                            case 13:
                                this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                return;
                            case 14:
                                this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                return;
                            case 15:
                                this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                return;
                            case 16:
                                this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                return;
                            case 17:
                                this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                return;
                            case 18:
                                this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                return;
                            case 19:
                                this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                return;
                            case 20:
                                this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                return;
                            case 21:
                                this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                return;
                            case 22:
                                this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                return;
                            default:
                                this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                return;
                        }
                    }
                });
            } else if (str3.startsWith("sent_")) {
                String[] split = str3.split("_");
                if (split.length >= 3) {
                    long longValue2 = Utilities.parseLong(split[1]).longValue();
                    if (longValue2 != 0) {
                        TLRPC.TL_channels_getMessages tL_channels_getMessages2 = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages2.channel = getMessagesController().getInputChannel(longValue2);
                        tL_channels_getMessages2.f22418id.add(Utilities.parseInt((CharSequence) split[2]));
                        getConnectionsManager().sendRequest(tL_channels_getMessages2, new RequestDelegate(this) {
                            public final FileRefController f20938b;

                            {
                                this.f20938b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r4) {
                                    case 0:
                                        this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                        return;
                                    case 1:
                                        this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                        return;
                                    case 2:
                                        this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                        return;
                                    case 3:
                                        this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                        return;
                                    case 4:
                                        this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                        return;
                                    case 5:
                                        this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                        return;
                                    case 6:
                                        this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                        return;
                                    case 7:
                                        this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                        return;
                                    case 8:
                                        this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                        return;
                                    case 9:
                                        this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                        return;
                                    case 10:
                                        this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                        return;
                                    case 11:
                                        this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                        return;
                                    case 12:
                                        this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                        return;
                                    case 13:
                                        this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                        return;
                                    case 14:
                                        this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                        return;
                                    case 15:
                                        this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                        return;
                                    case 16:
                                        this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                        return;
                                    case 17:
                                        this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                        return;
                                    case 18:
                                        this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                        return;
                                    case 19:
                                        this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                        return;
                                    case 20:
                                        this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                        return;
                                    case 21:
                                        this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                        return;
                                    case 22:
                                        this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                        return;
                                    default:
                                        this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages2.f22474id.add(Utilities.parseInt((CharSequence) split[2]));
                    getConnectionsManager().sendRequest(tL_messages_getMessages2, new RequestDelegate(this) {
                        public final FileRefController f20938b;

                        {
                            this.f20938b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r4) {
                                case 0:
                                    this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                                    return;
                                case 1:
                                    this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                                    return;
                                case 2:
                                    this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                                    return;
                                case 3:
                                    this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                                    return;
                                case 4:
                                    this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                                    return;
                                case 5:
                                    this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                                    return;
                                case 6:
                                    this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                                    return;
                                case 7:
                                    this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                                    return;
                                case 8:
                                    this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                                    return;
                                case 9:
                                    this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                                    return;
                                case 10:
                                    this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                                    return;
                                case 11:
                                    this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                                    return;
                                case 12:
                                    this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                                    return;
                                case 13:
                                    this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                                    return;
                                case 14:
                                    this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                                    return;
                                case 15:
                                    this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                                    return;
                                case 16:
                                    this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                                    return;
                                case 17:
                                    this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                                    return;
                                case 18:
                                    this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                                    return;
                                case 19:
                                    this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                                    return;
                                case 20:
                                    this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                                    return;
                                case 21:
                                    this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                                    return;
                                case 22:
                                    this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                                    return;
                                default:
                                    this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                                    return;
                            }
                        }
                    });
                    return;
                }
                sendErrorToObject(objArr, 0);
            } else {
                sendErrorToObject(objArr, 0);
            }
        } else if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) obj).set;
            tL_inputStickerSetID.f22400id = stickerSet.f22407id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet2 = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet2.stickerset = tL_inputStickerSetID2;
            TLRPC.StickerSet stickerSet2 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.f22400id = stickerSet2.f22407id;
            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet2, new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else if (obj instanceof TLRPC.InputStickerSet) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet3 = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet3.stickerset = (TLRPC.InputStickerSet) obj;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet3, new RequestDelegate(this) {
                public final FileRefController f20938b;

                {
                    this.f20938b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r4) {
                        case 0:
                            this.f20938b.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
                            return;
                        case 1:
                            this.f20938b.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
                            return;
                        case 2:
                            this.f20938b.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                            return;
                        case 3:
                            this.f20938b.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                            return;
                        case 4:
                            this.f20938b.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                            return;
                        case 5:
                            this.f20938b.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                            return;
                        case 6:
                            this.f20938b.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                            return;
                        case 7:
                            this.f20938b.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                            return;
                        case 8:
                            this.f20938b.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
                            return;
                        case 9:
                            this.f20938b.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
                            return;
                        case 10:
                            this.f20938b.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                            return;
                        case 11:
                            this.f20938b.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            return;
                        case 12:
                            this.f20938b.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                            return;
                        case 13:
                            this.f20938b.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                            return;
                        case 14:
                            this.f20938b.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                            return;
                        case 15:
                            this.f20938b.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                            return;
                        case 16:
                            this.f20938b.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                            return;
                        case 17:
                            this.f20938b.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                            return;
                        case 18:
                            this.f20938b.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                            return;
                        case 19:
                            this.f20938b.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
                            return;
                        case 20:
                            this.f20938b.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                            return;
                        case 21:
                            this.f20938b.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                            return;
                        case 22:
                            this.f20938b.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                            return;
                        default:
                            this.f20938b.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                            return;
                    }
                }
            });
        } else {
            sendErrorToObject(objArr, 0);
        }
    }

    private void sendErrorToObject(final java.lang.Object[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.sendErrorToObject(java.lang.Object[], int):void");
    }

    private boolean updateFileReferenceFromCache(byte[] bArr, TLRPC.InputFileLocation inputFileLocation, TLRPC.InputFileLocation inputFileLocation2, String str, Object... objArr) {
        String str2;
        String str3;
        Object obj = objArr[0];
        if (obj instanceof TL_stories.TL_storyItem) {
            ((TL_stories.TL_storyItem) obj).media.document.file_reference = bArr;
            return true;
        } else if (obj instanceof TLRPC.TL_inputSingleMedia) {
            return false;
        } else {
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
                    String str4 = null;
                    if (inputFileLocation != null) {
                        if (isSameReference(fileLoadOperation.location.file_reference, inputFileLocation.file_reference)) {
                            return false;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            str3 = Utilities.bytesToHex(fileLoadOperation.location.file_reference);
                        } else {
                            str3 = null;
                        }
                        fileLoadOperation.location = inputFileLocation;
                        if (BuildVars.LOGS_ENABLED) {
                            str4 = Utilities.bytesToHex(inputFileLocation.file_reference);
                        }
                    } else if (isSameReference(inputFileLocation2.file_reference, bArr)) {
                        return false;
                    } else {
                        if (BuildVars.LOGS_ENABLED) {
                            str2 = Utilities.bytesToHex(fileLoadOperation.location.file_reference);
                        } else {
                            str2 = null;
                        }
                        TLRPC.InputFileLocation inputFileLocation3 = fileLoadOperation.location;
                        inputFileLocation2.file_reference = bArr;
                        inputFileLocation3.file_reference = bArr;
                        if (BuildVars.LOGS_ENABLED) {
                            str4 = Utilities.bytesToHex(bArr);
                        }
                        str3 = str2;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("debug_loading: from fileref cache updated fileref from " + str3 + " to " + str4);
                    }
                }
            }
            return true;
        }
    }

    public boolean applyCachedFileReference(java.lang.Object r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.applyCachedFileReference(java.lang.Object, java.lang.Object[]):boolean");
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
        if (obj2 instanceof ih.e6) {
            ih.e6 e6Var = (ih.e6) obj2;
            TLRPC.MessageMedia messageMedia = e6Var.media;
            if (messageMedia.document != null) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation.f22395id = e6Var.media.document.f22386id;
                return new Pair<>(tL_inputDocumentFileLocation, "botstory_doc_" + e6Var.media.document.f22386id);
            } else if (messageMedia.photo != null) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation.f22395id = e6Var.media.photo.f22404id;
                return new Pair<>(tL_inputPhotoFileLocation, "botstory_photo_" + e6Var.media.photo.f22404id);
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation2 = new TLRPC.TL_inputDocumentFileLocation();
                return new Pair<>(tL_inputDocumentFileLocation2, "botstory_" + e6Var.f22617id);
            }
        } else if (obj2 instanceof TL_stories.TL_storyItem) {
            TL_stories.TL_storyItem tL_storyItem = (TL_stories.TL_storyItem) obj2;
            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation3 = new TLRPC.TL_inputDocumentFileLocation();
            tL_inputDocumentFileLocation3.f22395id = tL_storyItem.media.document.f22386id;
            return new Pair<>(tL_inputDocumentFileLocation3, "story_" + tL_storyItem.f22617id);
        } else {
            if (obj2 instanceof TLRPC.TL_inputSingleMedia) {
                TLRPC.InputMedia inputMedia = ((TLRPC.TL_inputSingleMedia) obj2).media;
                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation4 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation4.f22395id = tL_inputMediaDocument.f22441id.f22392id;
                    return new Pair<>(tL_inputDocumentFileLocation4, "file_" + tL_inputMediaDocument.f22441id.f22392id);
                } else if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = (TLRPC.TL_inputMediaPhoto) inputMedia;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation2 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation2.f22395id = tL_inputMediaPhoto.f22443id.f22399id;
                    return new Pair<>(tL_inputPhotoFileLocation2, "photo_" + tL_inputMediaPhoto.f22443id.f22399id);
                }
            } else if (obj2 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation5 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation5.f22395id = tL_inputMediaDocument2.f22441id.f22392id;
                return new Pair<>(tL_inputDocumentFileLocation5, "file_" + tL_inputMediaDocument2.f22441id.f22392id);
            } else if (obj2 instanceof TLRPC.TL_inputMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2 = (TLRPC.TL_inputMediaPhoto) obj2;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation3 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation3.f22395id = tL_inputMediaPhoto2.f22443id.f22399id;
                return new Pair<>(tL_inputPhotoFileLocation3, "photo_" + tL_inputMediaPhoto2.f22443id.f22399id);
            } else if (obj2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) obj2).media;
                if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation6 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation6.f22395id = tL_inputMediaDocument3.f22441id.f22392id;
                    return new Pair<>(tL_inputDocumentFileLocation6, "file_" + tL_inputMediaDocument3.f22441id.f22392id);
                } else if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation4 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation4.f22395id = tL_inputMediaPhoto3.f22443id.f22399id;
                    return new Pair<>(tL_inputPhotoFileLocation4, "photo_" + tL_inputMediaPhoto3.f22443id.f22399id);
                } else if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia3 = tL_inputMediaPaidMedia.extended_media.get(0);
                        if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation7 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation7.f22395id = tL_inputMediaDocument4.f22441id.f22392id;
                            return new Pair<>(tL_inputDocumentFileLocation7, "file_" + tL_inputMediaDocument4.f22441id.f22392id);
                        } else if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
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
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation8 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation8.f22395id = tL_inputMediaDocument5.f22441id.f22392id;
                    return new Pair<>(tL_inputDocumentFileLocation8, "file_" + tL_inputMediaDocument5.f22441id.f22392id);
                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation6 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation6.f22395id = tL_inputMediaPhoto5.f22443id.f22399id;
                    return new Pair<>(tL_inputPhotoFileLocation6, "photo_" + tL_inputMediaPhoto5.f22443id.f22399id);
                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!(obj instanceof ArrayList) && tL_inputMediaPaidMedia2.extended_media.size() == 1) {
                        TLRPC.InputMedia inputMedia5 = tL_inputMediaPaidMedia2.extended_media.get(0);
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                            TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation9 = new TLRPC.TL_inputDocumentFileLocation();
                            tL_inputDocumentFileLocation9.f22395id = tL_inputMediaDocument6.f22441id.f22392id;
                            return new Pair<>(tL_inputDocumentFileLocation9, "file_" + tL_inputMediaDocument6.f22441id.f22392id);
                        } else if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
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
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation10 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation10.f22395id = tL_inputMediaDocument7.f22441id.f22392id;
                    return new Pair<>(tL_inputDocumentFileLocation10, "file_" + tL_inputMediaDocument7.f22441id.f22392id);
                } else if (inputMedia6 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto7 = (TLRPC.TL_inputMediaPhoto) inputMedia6;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation8 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation8.f22395id = tL_inputMediaPhoto7.f22443id.f22399id;
                    return new Pair<>(tL_inputPhotoFileLocation8, "photo_" + tL_inputMediaPhoto7.f22443id.f22399id);
                }
            } else if (obj2 instanceof TLRPC.InputPhoto) {
                TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) obj2;
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation9 = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation9.f22395id = inputPhoto.f22399id;
                return new Pair<>(tL_inputPhotoFileLocation9, "photo_" + inputPhoto.f22399id);
            } else if (obj2 instanceof TLRPC.InputDocument) {
                TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation11 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation11.f22395id = inputDocument.f22392id;
                return new Pair<>(tL_inputDocumentFileLocation11, "file_" + inputDocument.f22392id);
            } else if (obj2 instanceof TLRPC.TL_messages_addPollAnswer) {
                TLRPC.InputMedia inputMedia7 = ((TLRPC.TL_messages_addPollAnswer) obj2).answer.input_media;
                if (inputMedia7 instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument8 = (TLRPC.TL_inputMediaDocument) inputMedia7;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation12 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation12.f22395id = tL_inputMediaDocument8.f22441id.f22392id;
                    return new Pair<>(tL_inputDocumentFileLocation12, "file_" + tL_inputMediaDocument8.f22441id.f22392id);
                } else if (inputMedia7 instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto8 = (TLRPC.TL_inputMediaPhoto) inputMedia7;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation10 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation10.f22395id = tL_inputMediaPhoto8.f22443id.f22399id;
                    return new Pair<>(tL_inputPhotoFileLocation10, "photo_" + tL_inputMediaPhoto8.f22443id.f22399id);
                }
            } else if (obj2 instanceof TLRPC.TL_messages_saveGif) {
                TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation13 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation13.f22395id = tL_messages_saveGif.f22487id.f22392id;
                return new Pair<>(tL_inputDocumentFileLocation13, "file_" + tL_messages_saveGif.f22487id.f22392id);
            } else if (obj2 instanceof TLRPC.TL_messages_saveRecentSticker) {
                TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation14 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation14.f22395id = tL_messages_saveRecentSticker.f22488id.f22392id;
                return new Pair<>(tL_inputDocumentFileLocation14, "file_" + tL_messages_saveRecentSticker.f22488id.f22392id);
            } else if (obj2 instanceof TLRPC.TL_stickers_addStickerToSet) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation15 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation15.f22395id = tL_stickers_addStickerToSet.sticker.document.f22392id;
                return new Pair<>(tL_inputDocumentFileLocation15, "file_" + tL_stickers_addStickerToSet.sticker.document.f22392id);
            } else if (obj2 instanceof TLRPC.TL_messages_faveSticker) {
                TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) obj2;
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation16 = new TLRPC.TL_inputDocumentFileLocation();
                tL_inputDocumentFileLocation16.f22395id = tL_messages_faveSticker.f22464id.f22392id;
                return new Pair<>(tL_inputDocumentFileLocation16, "file_" + tL_messages_faveSticker.f22464id.f22392id);
            } else if (obj2 instanceof TLRPC.TL_messages_getAttachedStickers) {
                TLRPC.InputStickeredMedia inputStickeredMedia = ((TLRPC.TL_messages_getAttachedStickers) obj2).media;
                if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation17 = new TLRPC.TL_inputDocumentFileLocation();
                    tL_inputDocumentFileLocation17.f22395id = tL_inputStickeredMediaDocument.f22449id.f22392id;
                    return new Pair<>(tL_inputDocumentFileLocation17, "file_" + tL_inputStickeredMediaDocument.f22449id.f22392id);
                } else if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                    TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                    TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation11 = new TLRPC.TL_inputPhotoFileLocation();
                    tL_inputPhotoFileLocation11.f22395id = tL_inputStickeredMediaPhoto.f22450id.f22399id;
                    return new Pair<>(tL_inputPhotoFileLocation11, "photo_" + tL_inputStickeredMediaPhoto.f22450id.f22399id);
                }
            } else if (obj2 instanceof TLRPC.TL_inputFileLocation) {
                TLRPC.TL_inputFileLocation tL_inputFileLocation = (TLRPC.TL_inputFileLocation) obj2;
                return new Pair<>(tL_inputFileLocation, "loc_" + tL_inputFileLocation.local_id + "_" + tL_inputFileLocation.volume_id);
            } else if (obj2 instanceof TLRPC.TL_inputDocumentFileLocation) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation18 = (TLRPC.TL_inputDocumentFileLocation) obj2;
                return new Pair<>(tL_inputDocumentFileLocation18, "file_" + tL_inputDocumentFileLocation18.f22395id);
            } else if (obj2 instanceof TLRPC.TL_inputPhotoFileLocation) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation12 = (TLRPC.TL_inputPhotoFileLocation) obj2;
                return new Pair<>(tL_inputPhotoFileLocation12, "photo_" + tL_inputPhotoFileLocation12.f22395id);
            } else if (obj2 instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = (TLRPC.TL_inputPeerPhotoFileLocation) obj2;
                return new Pair<>(tL_inputPeerPhotoFileLocation, "avatar_" + tL_inputPeerPhotoFileLocation.f22395id);
            }
            return null;
        }
    }

    public void requestReference(java.lang.Object r13, java.lang.Object... r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.requestReference(java.lang.Object, java.lang.Object[]):void");
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
            for (int i9 = 0; i9 < size; i9++) {
                TLRPC.PhotoSize photoSize = photo.sizes.get(i9);
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
                } else if (fileReference != null) {
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
        if (fileLocation != null && (inputFileLocation instanceof TLRPC.TL_inputFileLocation) && fileLocation.local_id == inputFileLocation.local_id && fileLocation.volume_id == inputFileLocation.volume_id) {
            byte[] bArr = fileLocation.file_reference;
            if (bArr == null && zArr != null) {
                zArr[0] = true;
            }
            return bArr;
        }
        return null;
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
            int i9 = 0;
            while (i9 < size) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i9);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    int size2 = tL_webPageAttributeTheme.documents.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        byte[] fileReference3 = fileRefController.getFileReference(tL_webPageAttributeTheme.documents.get(i10), null, inputFileLocation, zArr, inputFileLocationArr);
                        if (fileReference3 != null) {
                            return fileReference3;
                        }
                        i10++;
                        fileRefController = this;
                    }
                    continue;
                }
                i9++;
                fileRefController = this;
            }
        }
        TL_iv.Page page = webPage.cached_page;
        if (page != null) {
            int size3 = page.documents.size();
            for (int i11 = 0; i11 < size3; i11++) {
                byte[] fileReference4 = getFileReference(webPage.cached_page.documents.get(i11), null, inputFileLocation, zArr, inputFileLocationArr);
                if (fileReference4 != null) {
                    return fileReference4;
                }
            }
            int size4 = webPage.cached_page.photos.size();
            for (int i12 = 0; i12 < size4; i12++) {
                byte[] fileReference5 = getFileReference(webPage.cached_page.photos.get(i12), inputFileLocation, zArr, inputFileLocationArr);
                if (fileReference5 != null) {
                    return fileReference5;
                }
            }
            return null;
        }
        return null;
    }
}
