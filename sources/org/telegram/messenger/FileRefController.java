package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.StoriesController;

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

    public static void lambda$onUpdateObjectReference$37(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$onUpdateObjectReference$38(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$onUpdateObjectReference$39(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$onUpdateObjectReference$40(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    static class Requester {
        private Object[] args;
        private boolean completed;
        private TLRPC.InputFileLocation location;
        private String locationKey;

        private Requester() {
        }
    }

    private static class CachedResult {
        private long firstQueryTime;
        private TLObject response;

        private CachedResult() {
        }
    }

    private static class Waiter {
        private String locationKey;
        private String parentKey;

        public Waiter(String str, String str2) {
            this.locationKey = str;
            this.parentKey = str2;
        }
    }

    public static FileRefController getInstance(int i) {
        FileRefController fileRefController = Instance[i];
        if (fileRefController == null) {
            synchronized (FileRefController.class) {
                try {
                    fileRefController = Instance[i];
                    if (fileRefController == null) {
                        FileRefController[] fileRefControllerArr = Instance;
                        FileRefController fileRefController2 = new FileRefController(i);
                        fileRefControllerArr[i] = fileRefController2;
                        fileRefController = fileRefController2;
                    }
                } finally {
                }
            }
        }
        return fileRefController;
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
            return "attach_menu_bot_" + ((TLRPC.TL_attachMenuBot) obj).bot_id;
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
            return "str" + ((String) obj);
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
            if (messageMedia.photo != null) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                tL_inputPhotoFileLocation.id = botPreview.media.photo.id;
                return new Pair<>(tL_inputPhotoFileLocation, "botstory_photo_" + botPreview.media.photo.id);
            }
            return new Pair<>(new TLRPC.TL_inputDocumentFileLocation(), "botstory_" + botPreview.id);
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

    public void requestReference(java.lang.Object r14, java.lang.Object... r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.requestReference(java.lang.Object, java.lang.Object[]):void");
    }

    private String getObjectString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            return "story(dialogId=" + storyItem.dialogId + " id=" + storyItem.id + ")";
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

    private void broadcastWaitersData(ArrayList<Waiter> arrayList, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Waiter waiter = arrayList.get(i);
            onRequestComplete(waiter.locationKey, waiter.parentKey, tLObject, tL_error, i == size + (-1), false);
            i++;
        }
        arrayList.clear();
    }

    private void requestReferenceFromServer(Object obj, final String str, final String str2, Object[] objArr) throws IOException {
        if (obj instanceof StoriesController.BotPreview) {
            StoriesController.BotPreview botPreview = (StoriesController.BotPreview) obj;
            StoriesController.BotPreviewsList botPreviewsList = botPreview.list;
            if (botPreviewsList == null) {
                sendErrorToObject(objArr, 0);
                return;
            } else {
                botPreviewsList.requestReference(botPreview, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        this.f$0.lambda$requestReferenceFromServer$1(str, str2, (StoriesController.BotPreview) obj2);
                    }
                });
                return;
            }
        }
        if (obj instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = getMessagesController().getInputPeer(storyItem.dialogId);
            tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
            getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$2(str, str2, tLObject, tL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_help_premiumPromo) {
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$3(str, str2, tLObject, tL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_availableReaction) {
            TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
            tL_messages_getAvailableReactions.hash = 0;
            getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$4(str, str2, tLObject, tL_error);
                }
            });
            return;
        }
        if (obj instanceof TL_bots.BotInfo) {
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.id = getMessagesController().getInputUser(((TL_bots.BotInfo) obj).user_id);
            getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$5(str, str2, tLObject, tL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
            tL_messages_getAttachMenuBot.bot = getMessagesController().getInputUser(((TLRPC.TL_attachMenuBot) obj).bot_id);
            getConnectionsManager().sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$6(str, str2, tLObject, tL_error);
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
                getConnectionsManager().sendRequest(tL_messages_getScheduledMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                        this.f$0.lambda$requestReferenceFromServer$7(str, str2, tLObject, tL_error);
                    }
                });
                return;
            }
            if (messageObject.isQuickReply()) {
                TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                tL_messages_getQuickReplyMessages.shortcut_id = messageObject.getQuickReplyId();
                tL_messages_getQuickReplyMessages.flags |= 1;
                tL_messages_getQuickReplyMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                        this.f$0.lambda$requestReferenceFromServer$8(str, str2, tLObject, tL_error);
                    }
                });
                return;
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.rich_message != null && inputPeer != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.id = messageObject.getRealId();
                getConnectionsManager().sendRequest(getrichmessage, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                        this.f$0.lambda$requestReferenceFromServer$9(str, str2, tLObject, tL_error);
                    }
                });
                return;
            }
            if (channelId != 0) {
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = getMessagesController().getInputChannel(channelId);
                tL_channels_getMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                        this.f$0.lambda$requestReferenceFromServer$10(str, str2, tLObject, tL_error);
                    }
                });
                return;
            }
            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages.id.add(Integer.valueOf(messageObject.getRealId()));
            getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$11(str, str2, tLObject, tL_error);
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
            getConnectionsManager().sendRequest(getwallpaper, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$12(str, str2, tLObject, tL_error);
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
            getConnectionsManager().sendRequest(gettheme, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$13(str, str2, tLObject, tL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC.WebPage) {
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = ((TLRPC.WebPage) obj).url;
            tL_messages_getWebPage.hash = 0;
            getConnectionsManager().sendRequest(tL_messages_getWebPage, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$14(str, str2, tLObject, tL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.id.add(getMessagesController().getInputUser((TLRPC.User) obj));
            getConnectionsManager().sendRequest(tL_users_getUsers, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$15(str, str2, tLObject, tL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat instanceof TLRPC.TL_chat) {
                TLRPC.TL_messages_getChats tL_messages_getChats = new TLRPC.TL_messages_getChats();
                tL_messages_getChats.id.add(Long.valueOf(chat.id));
                getConnectionsManager().sendRequest(tL_messages_getChats, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                        this.f$0.lambda$requestReferenceFromServer$16(str, str2, tLObject, tL_error);
                    }
                });
                return;
            } else {
                if ((chat instanceof TLRPC.TL_channel) || (chat instanceof TLRPC.TL_community)) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    tL_channels_getChannels.id.add(MessagesController.getInputChannel(chat));
                    getConnectionsManager().sendRequest(tL_channels_getChannels, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                            this.f$0.lambda$requestReferenceFromServer$17(str, str2, tLObject, tL_error);
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (obj instanceof String) {
            String str3 = (String) obj;
            if ("wallpaper".equals(str3)) {
                if (this.wallpaperWaiters.isEmpty()) {
                    getConnectionsManager().sendRequest(new TL_account.getWallPapers(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                            this.f$0.lambda$requestReferenceFromServer$18(tLObject, tL_error);
                        }
                    });
                }
                this.wallpaperWaiters.add(new Waiter(str, str2));
                return;
            }
            if (str3.startsWith("gif")) {
                if (this.savedGifsWaiters.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSavedGifs(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                            this.f$0.lambda$requestReferenceFromServer$19(tLObject, tL_error);
                        }
                    });
                }
                this.savedGifsWaiters.add(new Waiter(str, str2));
                return;
            }
            if ("recent".equals(str3)) {
                if (this.recentStickersWaiter.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC.TL_messages_getRecentStickers(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                            this.f$0.lambda$requestReferenceFromServer$20(tLObject, tL_error);
                        }
                    });
                }
                this.recentStickersWaiter.add(new Waiter(str, str2));
                return;
            }
            if ("fav".equals(str3)) {
                if (this.favStickersWaiter.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC.TL_messages_getFavedStickers(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                            this.f$0.lambda$requestReferenceFromServer$21(tLObject, tL_error);
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
                getConnectionsManager().sendRequest(tL_help_getAppUpdate, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                        this.f$0.lambda$requestReferenceFromServer$22(str, str2, tLObject, tL_error);
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
                    getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                            this.f$0.lambda$requestReferenceFromServer$23(str, str2, tLObject, tL_error);
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
                getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                        this.f$0.lambda$requestReferenceFromServer$24(str, str2, tLObject, tL_error);
                    }
                });
                return;
            }
            if (str3.startsWith("sent_")) {
                String[] strArrSplit = str3.split("_");
                if (strArrSplit.length >= 3) {
                    long jLongValue2 = Utilities.parseLong(strArrSplit[1]).longValue();
                    if (jLongValue2 != 0) {
                        TLRPC.TL_channels_getMessages tL_channels_getMessages2 = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages2.channel = getMessagesController().getInputChannel(jLongValue2);
                        tL_channels_getMessages2.id.add(Utilities.parseInt((CharSequence) strArrSplit[2]));
                        getConnectionsManager().sendRequest(tL_channels_getMessages2, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                                this.f$0.lambda$requestReferenceFromServer$25(str, str2, tLObject, tL_error);
                            }
                        });
                        return;
                    }
                    TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages2.id.add(Utilities.parseInt((CharSequence) strArrSplit[2]));
                    getConnectionsManager().sendRequest(tL_messages_getMessages2, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                            this.f$0.lambda$requestReferenceFromServer$26(str, str2, tLObject, tL_error);
                        }
                    });
                    return;
                }
                sendErrorToObject(objArr, 0);
                return;
            }
            sendErrorToObject(objArr, 0);
            return;
        }
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) obj).set;
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$27(str, str2, tLObject, tL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet2 = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet2.stickerset = tL_inputStickerSetID2;
            TLRPC.StickerSet stickerSet2 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet2.id;
            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet2, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$28(str, str2, tLObject, tL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC.InputStickerSet) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet3 = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet3.stickerset = (TLRPC.InputStickerSet) obj;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet3, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
                    this.f$0.lambda$requestReferenceFromServer$29(str, str2, tLObject, tL_error);
                }
            });
            return;
        }
        sendErrorToObject(objArr, 0);
    }

    public void lambda$requestReferenceFromServer$1(final String str, final String str2, final StoriesController.BotPreview botPreview) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException, IOException {
                this.f$0.lambda$requestReferenceFromServer$0(str, str2, botPreview);
            }
        });
    }

    public void lambda$requestReferenceFromServer$0(String str, String str2, StoriesController.BotPreview botPreview) throws InterruptedException, IOException {
        onRequestComplete(str, str2, botPreview, null, true, false);
    }

    public void lambda$requestReferenceFromServer$2(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$3(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            getMediaDataController().processLoadedPremiumPromo((TLRPC.TL_help_premiumPromo) tLObject, iCurrentTimeMillis, false);
        }
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$4(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$5(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$6(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$7(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$8(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$9(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$10(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$11(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$12(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$13(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$14(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$15(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$16(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$17(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$18(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        broadcastWaitersData(this.wallpaperWaiters, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$19(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        broadcastWaitersData(this.savedGifsWaiters, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$20(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        broadcastWaitersData(this.recentStickersWaiter, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$21(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        broadcastWaitersData(this.favStickersWaiter, tLObject, tL_error);
    }

    public void lambda$requestReferenceFromServer$22(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$23(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$24(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$25(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, false, false);
    }

    public void lambda$requestReferenceFromServer$26(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, false, false);
    }

    public void lambda$requestReferenceFromServer$27(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$28(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$29(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException, IOException {
        onRequestComplete(str, str2, tLObject, tL_error, true, false);
    }

    private boolean isSameReference(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private boolean onUpdateObjectReference(final Requester requester, byte[] bArr, TLRPC.InputFileLocation inputFileLocation, boolean z) throws IOException {
        String strBytesToHex;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("fileref updated for " + requester.args[0] + " " + requester.locationKey);
        }
        if (!(requester.args[0] instanceof TL_stories.TL_storyItem)) {
            if (requester.args[0] instanceof TLRPC.TL_inputSingleMedia) {
                final TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) requester.args[1];
                final Object[] objArr = this.multiMediaCache.get(tL_messages_sendMultiMedia);
                if (objArr == null) {
                    return true;
                }
                TLRPC.TL_inputSingleMedia tL_inputSingleMedia = (TLRPC.TL_inputSingleMedia) requester.args[0];
                TLRPC.InputMedia inputMedia = tL_inputSingleMedia.media;
                if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                    if (z && isSameReference(tL_inputMediaDocument.id.file_reference, bArr)) {
                        return false;
                    }
                    tL_inputMediaDocument.id.file_reference = bArr;
                } else if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = (TLRPC.TL_inputMediaPhoto) inputMedia;
                    if (z && isSameReference(tL_inputMediaPhoto3.id.file_reference, bArr)) {
                        return false;
                    }
                    tL_inputMediaPhoto3.id.file_reference = bArr;
                }
                int iIndexOf = tL_messages_sendMultiMedia.multi_media.indexOf(tL_inputSingleMedia);
                if (iIndexOf < 0) {
                    return true;
                }
                ArrayList arrayList = (ArrayList) objArr[3];
                arrayList.set(iIndexOf, null);
                boolean z2 = true;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) != null) {
                        z2 = false;
                    }
                }
                if (z2) {
                    this.multiMediaCache.remove(tL_messages_sendMultiMedia);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onUpdateObjectReference$30(tL_messages_sendMultiMedia, objArr);
                        }
                    });
                }
            } else if (requester.args.length < 2 || !(requester.args[1] instanceof TLRPC.TL_messages_sendMedia) || !(((TLRPC.TL_messages_sendMedia) requester.args[1]).media instanceof TLRPC.TL_inputMediaPaidMedia) || (!(requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) && !(requester.args[0] instanceof TLRPC.TL_inputMediaDocument))) {
                if (requester.args.length < 2 || !(requester.args[1] instanceof TL_ephemeral.TL_sendMessage) || !(((TL_ephemeral.TL_sendMessage) requester.args[1]).media instanceof TLRPC.TL_inputMediaPaidMedia) || (!(requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) && !(requester.args[0] instanceof TLRPC.TL_inputMediaDocument))) {
                    if (!(requester.args[0] instanceof TLRPC.TL_messages_sendMedia)) {
                        if (!(requester.args[0] instanceof TL_ephemeral.TL_sendMessage)) {
                            if (!(requester.args[0] instanceof TLRPC.TL_messages_editMessage)) {
                                if ((requester.args[0] instanceof TLRPC.InputPhoto) || (requester.args[0] instanceof TLRPC.InputDocument)) {
                                    if (requester.args[0] instanceof TLRPC.InputPhoto) {
                                        TLRPC.InputPhoto inputPhoto = (TLRPC.InputPhoto) requester.args[0];
                                        if (z && isSameReference(inputPhoto.file_reference, bArr)) {
                                            return false;
                                        }
                                        inputPhoto.file_reference = bArr;
                                    } else {
                                        TLRPC.InputDocument inputDocument = (TLRPC.InputDocument) requester.args[0];
                                        if (z && isSameReference(inputDocument.file_reference, bArr)) {
                                            return false;
                                        }
                                        inputDocument.file_reference = bArr;
                                    }
                                    if (requester.args.length > 1 && (requester.args[1] instanceof Runnable)) {
                                        AndroidUtilities.runOnUIThread((Runnable) requester.args[1]);
                                    }
                                } else if (!(requester.args[0] instanceof TLRPC.TL_messages_addPollAnswer)) {
                                    if (requester.args[0] instanceof TLRPC.TL_messages_saveGif) {
                                        TLRPC.TL_messages_saveGif tL_messages_saveGif = (TLRPC.TL_messages_saveGif) requester.args[0];
                                        if (z && isSameReference(tL_messages_saveGif.id.file_reference, bArr)) {
                                            return false;
                                        }
                                        tL_messages_saveGif.id.file_reference = bArr;
                                        getConnectionsManager().sendRequest(tL_messages_saveGif, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                FileRefController.lambda$onUpdateObjectReference$37(tLObject, tL_error);
                                            }
                                        });
                                    } else if (requester.args[0] instanceof TLRPC.TL_messages_saveRecentSticker) {
                                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = (TLRPC.TL_messages_saveRecentSticker) requester.args[0];
                                        if (z && isSameReference(tL_messages_saveRecentSticker.id.file_reference, bArr)) {
                                            return false;
                                        }
                                        tL_messages_saveRecentSticker.id.file_reference = bArr;
                                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                FileRefController.lambda$onUpdateObjectReference$38(tLObject, tL_error);
                                            }
                                        });
                                    } else if (requester.args[0] instanceof TLRPC.TL_stickers_addStickerToSet) {
                                        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) requester.args[0];
                                        if (z && isSameReference(tL_stickers_addStickerToSet.sticker.document.file_reference, bArr)) {
                                            return false;
                                        }
                                        tL_stickers_addStickerToSet.sticker.document.file_reference = bArr;
                                        getConnectionsManager().sendRequest(tL_stickers_addStickerToSet, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                FileRefController.lambda$onUpdateObjectReference$39(tLObject, tL_error);
                                            }
                                        });
                                    } else if (requester.args[0] instanceof TLRPC.TL_messages_faveSticker) {
                                        TLRPC.TL_messages_faveSticker tL_messages_faveSticker = (TLRPC.TL_messages_faveSticker) requester.args[0];
                                        if (z && isSameReference(tL_messages_faveSticker.id.file_reference, bArr)) {
                                            return false;
                                        }
                                        tL_messages_faveSticker.id.file_reference = bArr;
                                        getConnectionsManager().sendRequest(tL_messages_faveSticker, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                FileRefController.lambda$onUpdateObjectReference$40(tLObject, tL_error);
                                            }
                                        });
                                    } else if (requester.args[0] instanceof TLRPC.TL_messages_getAttachedStickers) {
                                        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) requester.args[0];
                                        TLRPC.InputStickeredMedia inputStickeredMedia = tL_messages_getAttachedStickers.media;
                                        if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaDocument) {
                                            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = (TLRPC.TL_inputStickeredMediaDocument) inputStickeredMedia;
                                            if (z && isSameReference(tL_inputStickeredMediaDocument.id.file_reference, bArr)) {
                                                return false;
                                            }
                                            tL_inputStickeredMediaDocument.id.file_reference = bArr;
                                        } else if (inputStickeredMedia instanceof TLRPC.TL_inputStickeredMediaPhoto) {
                                            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = (TLRPC.TL_inputStickeredMediaPhoto) inputStickeredMedia;
                                            if (z && isSameReference(tL_inputStickeredMediaPhoto.id.file_reference, bArr)) {
                                                return false;
                                            }
                                            tL_inputStickeredMediaPhoto.id.file_reference = bArr;
                                        }
                                        getConnectionsManager().sendRequest(tL_messages_getAttachedStickers, (RequestDelegate) requester.args[1]);
                                    } else if (requester.args[1] instanceof FileLoadOperation) {
                                        FileLoadOperation fileLoadOperation = (FileLoadOperation) requester.args[1];
                                        if (inputFileLocation == null) {
                                            if (z && isSameReference(requester.location.file_reference, bArr)) {
                                                return false;
                                            }
                                            String strBytesToHex2 = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                                            TLRPC.InputFileLocation inputFileLocation2 = fileLoadOperation.location;
                                            requester.location.file_reference = bArr;
                                            inputFileLocation2.file_reference = bArr;
                                            strBytesToHex = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                                            strBytesToHex = strBytesToHex2;
                                        } else {
                                            if (z && isSameReference(fileLoadOperation.location.file_reference, inputFileLocation.file_reference)) {
                                                return false;
                                            }
                                            strBytesToHex = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                                            fileLoadOperation.location = inputFileLocation;
                                            if (BuildVars.LOGS_ENABLED) {
                                                strBytesToHex = Utilities.bytesToHex(inputFileLocation.file_reference);
                                            }
                                        }
                                        fileLoadOperation.requestingReference = false;
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("debug_loading: " + fileLoadOperation.getCacheFileFinal().getName() + " " + strBytesToHex + " " + strBytesToHex + " reference updated resume download");
                                        }
                                        fileLoadOperation.startDownloadRequest(-1);
                                    }
                                } else {
                                    TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_addPollAnswer) requester.args[0]).answer.input_media;
                                    if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                                        if (z && isSameReference(tL_inputMediaDocument2.id.file_reference, bArr)) {
                                            return false;
                                        }
                                        tL_inputMediaDocument2.id.file_reference = bArr;
                                    } else if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto4 = (TLRPC.TL_inputMediaPhoto) inputMedia2;
                                        if (z && isSameReference(tL_inputMediaPhoto4.id.file_reference, bArr)) {
                                            return false;
                                        }
                                        tL_inputMediaPhoto4.id.file_reference = bArr;
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            this.f$0.lambda$onUpdateObjectReference$36(requester);
                                        }
                                    });
                                }
                            } else {
                                TLRPC.InputMedia inputMedia3 = ((TLRPC.TL_messages_editMessage) requester.args[0]).media;
                                if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                                    if (z && isSameReference(tL_inputMediaDocument3.id.file_reference, bArr)) {
                                        return false;
                                    }
                                    tL_inputMediaDocument3.id.file_reference = bArr;
                                } else if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto5 = (TLRPC.TL_inputMediaPhoto) inputMedia3;
                                    if (z && isSameReference(tL_inputMediaPhoto5.id.file_reference, bArr)) {
                                        return false;
                                    }
                                    tL_inputMediaPhoto5.id.file_reference = bArr;
                                }
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.lambda$onUpdateObjectReference$35(requester);
                                    }
                                });
                            }
                        } else {
                            TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) requester.args[0]).media;
                            if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                                TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                                if (z && isSameReference(tL_inputMediaDocument4.id.file_reference, bArr)) {
                                    return false;
                                }
                                tL_inputMediaDocument4.id.file_reference = bArr;
                            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto6 = (TLRPC.TL_inputMediaPhoto) inputMedia4;
                                if (z && isSameReference(tL_inputMediaPhoto6.id.file_reference, bArr)) {
                                    return false;
                                }
                                tL_inputMediaPhoto6.id.file_reference = bArr;
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$onUpdateObjectReference$34(requester);
                                }
                            });
                        }
                    } else {
                        TLRPC.InputMedia inputMedia5 = ((TLRPC.TL_messages_sendMedia) requester.args[0]).media;
                        if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                            TLRPC.TL_inputMediaDocument tL_inputMediaDocument5 = (TLRPC.TL_inputMediaDocument) inputMedia5;
                            if (z && isSameReference(tL_inputMediaDocument5.id.file_reference, bArr)) {
                                return false;
                            }
                            tL_inputMediaDocument5.id.file_reference = bArr;
                        } else if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto7 = (TLRPC.TL_inputMediaPhoto) inputMedia5;
                            if (z && isSameReference(tL_inputMediaPhoto7.id.file_reference, bArr)) {
                                return false;
                            }
                            tL_inputMediaPhoto7.id.file_reference = bArr;
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onUpdateObjectReference$33(requester);
                            }
                        });
                    }
                } else {
                    final TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) requester.args[1];
                    final Object[] objArr2 = this.multiMediaCache.get(tL_sendMessage);
                    if (objArr2 == null) {
                        return true;
                    }
                    if (requester.args[0] instanceof TLRPC.TL_inputMediaDocument) {
                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument6 = (TLRPC.TL_inputMediaDocument) requester.args[0];
                        if (z && isSameReference(tL_inputMediaDocument6.id.file_reference, bArr)) {
                            return false;
                        }
                        tL_inputMediaDocument6.id.file_reference = bArr;
                        tL_inputMediaPhoto = tL_inputMediaDocument6;
                    } else if (requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto8 = (TLRPC.TL_inputMediaPhoto) requester.args[0];
                        if (z && isSameReference(tL_inputMediaPhoto8.id.file_reference, bArr)) {
                            return false;
                        }
                        tL_inputMediaPhoto8.id.file_reference = bArr;
                        tL_inputMediaPhoto = tL_inputMediaPhoto8;
                    } else {
                        tL_inputMediaPhoto = null;
                    }
                    int iIndexOf2 = ((TLRPC.TL_inputMediaPaidMedia) tL_sendMessage.media).extended_media.indexOf(tL_inputMediaPhoto);
                    if (iIndexOf2 < 0) {
                        return true;
                    }
                    ArrayList arrayList2 = (ArrayList) objArr2[3];
                    arrayList2.set(iIndexOf2, null);
                    boolean z3 = true;
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        if (arrayList2.get(i2) != null) {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        this.multiMediaCache.remove(tL_sendMessage);
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onUpdateObjectReference$32(tL_sendMessage, objArr2);
                            }
                        });
                    }
                }
            } else {
                final TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) requester.args[1];
                final Object[] objArr3 = this.multiMediaCache.get(tL_messages_sendMedia);
                if (objArr3 == null) {
                    return true;
                }
                if (requester.args[0] instanceof TLRPC.TL_inputMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument7 = (TLRPC.TL_inputMediaDocument) requester.args[0];
                    if (z && isSameReference(tL_inputMediaDocument7.id.file_reference, bArr)) {
                        return false;
                    }
                    tL_inputMediaDocument7.id.file_reference = bArr;
                    tL_inputMediaPhoto2 = tL_inputMediaDocument7;
                } else if (requester.args[0] instanceof TLRPC.TL_inputMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto9 = (TLRPC.TL_inputMediaPhoto) requester.args[0];
                    if (z && isSameReference(tL_inputMediaPhoto9.id.file_reference, bArr)) {
                        return false;
                    }
                    tL_inputMediaPhoto9.id.file_reference = bArr;
                    tL_inputMediaPhoto2 = tL_inputMediaPhoto9;
                } else {
                    tL_inputMediaPhoto2 = null;
                }
                int iIndexOf3 = ((TLRPC.TL_inputMediaPaidMedia) tL_messages_sendMedia.media).extended_media.indexOf(tL_inputMediaPhoto2);
                if (iIndexOf3 < 0) {
                    return true;
                }
                ArrayList arrayList3 = (ArrayList) objArr3[3];
                arrayList3.set(iIndexOf3, null);
                boolean z4 = true;
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    if (arrayList3.get(i3) != null) {
                        z4 = false;
                    }
                }
                if (z4) {
                    this.multiMediaCache.remove(tL_messages_sendMedia);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onUpdateObjectReference$31(tL_messages_sendMedia, objArr3);
                        }
                    });
                }
            }
            return true;
        }
        ((TL_stories.TL_storyItem) requester.args[0]).media.document.file_reference = bArr;
        return true;
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

    private void sendErrorToObject(final java.lang.Object[] r7, int r8) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.sendErrorToObject(java.lang.Object[], int):void");
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

    private boolean onRequestComplete(java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLObject r34, org.telegram.tgnet.TLRPC.TL_error r35, boolean r36, boolean r37) throws java.lang.InterruptedException, java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.onRequestComplete(java.lang.String, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error, boolean, boolean):boolean");
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

    private Pair<byte[], TLRPC.InputFileLocation> getFileReferenceFromResponse(TLRPC.InputFileLocation inputFileLocation, String str, String str2, TLObject tLObject, Object... objArr) throws InterruptedException {
        TLRPC.InputFileLocation[] inputFileLocationArr;
        boolean[] zArr;
        byte[] fileReference;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.InputFileLocation inputFileLocation2;
        Pair<byte[], TLRPC.InputFileLocation> fileReferenceFromResponse;
        TLRPC.InputFileLocation inputFileLocation3 = null;
        if ((inputFileLocation instanceof TLRPC.TL_inputFileLocation) || (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation)) {
            inputFileLocationArr = new TLRPC.InputFileLocation[1];
            zArr = new boolean[1];
        } else {
            inputFileLocationArr = null;
            zArr = null;
        }
        if (str2 == null || (fileReferenceFromResponse = getFileReferenceFromResponse(inputFileLocation, str, null, tLObject, objArr)) == null) {
            fileReference = null;
        } else {
            fileReference = (byte[]) fileReferenceFromResponse.first;
            Object obj = fileReferenceFromResponse.second;
            if (obj != null && inputFileLocationArr != null) {
                inputFileLocationArr[0] = (TLRPC.InputFileLocation) obj;
            }
        }
        if (tLObject instanceof StoriesController.BotPreview) {
            TLRPC.MessageMedia messageMedia3 = ((StoriesController.BotPreview) tLObject).media;
            TLRPC.Document document2 = messageMedia3.document;
            if (document2 != null) {
                fileReference = getFileReference(document2, messageMedia3.alt_documents, inputFileLocation, zArr, inputFileLocationArr);
            } else {
                TLRPC.Photo photo3 = messageMedia3.photo;
                if (photo3 != null) {
                    fileReference = getFileReference(photo3, inputFileLocation, zArr, inputFileLocationArr);
                }
            }
        } else if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (!messages_messages.messages.isEmpty()) {
                int size = messages_messages.messages.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.Message message = messages_messages.messages.get(i);
                    TLRPC.MessageMedia messageMedia4 = message.media;
                    if (messageMedia4 instanceof TLRPC.TL_messageMediaPaidMedia) {
                        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia4;
                        for (int i2 = 0; i2 < tL_messageMediaPaidMedia.extended_media.size(); i2++) {
                            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i2);
                            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                fileReference = getFileReferenceForMediaImpl(((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media, inputFileLocation, zArr, inputFileLocationArr);
                            }
                            if (fileReference != null) {
                                break;
                            }
                        }
                    } else {
                        TL_iv.RichMessage richMessage = message.rich_message;
                        if (richMessage != null) {
                            fileReference = getFileReferenceForRichMessage(richMessage, inputFileLocation, zArr, inputFileLocationArr);
                        } else if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                            fileReference = getFileReferenceForPoll((TLRPC.TL_messageMediaPoll) messageMedia4, inputFileLocation, zArr, inputFileLocationArr);
                        } else if (messageMedia4 != null) {
                            fileReference = getFileReferenceForMediaImpl(messageMedia4, inputFileLocation, zArr, inputFileLocationArr);
                        } else {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto)) {
                                fileReference = getFileReference(messageAction.photo, inputFileLocation, zArr, inputFileLocationArr);
                            }
                        }
                    }
                }
                if (fileReference == null) {
                    getMessagesStorage().replaceMessageIfExists(messages_messages.messages.get(0), messages_messages.users, messages_messages.chats, true);
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("file ref not found in messages, replacing message");
                    }
                }
            } else if (BuildVars.DEBUG_VERSION) {
                FileLog.d("empty messages, file ref not found");
            }
        } else if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            Iterator<TLRPC.Document> it = ((TLRPC.TL_help_premiumPromo) tLObject).videos.iterator();
            while (it.hasNext() && (fileReference = getFileReference(it.next(), null, inputFileLocation, zArr, inputFileLocationArr)) == null) {
            }
        } else if (tLObject instanceof TLRPC.TL_messages_availableReactions) {
            TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject;
            getMediaDataController().processLoadedReactions(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, (int) (System.currentTimeMillis() / 1000), false);
            Iterator<TLRPC.TL_availableReaction> it2 = tL_messages_availableReactions.reactions.iterator();
            while (it2.hasNext()) {
                TLRPC.TL_availableReaction next = it2.next();
                byte[] fileReference2 = getFileReference(next.static_icon, null, inputFileLocation, zArr, inputFileLocationArr);
                if (fileReference2 != null || (fileReference2 = getFileReference(next.appear_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (fileReference2 = getFileReference(next.select_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (fileReference2 = getFileReference(next.activate_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (fileReference2 = getFileReference(next.effect_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null || (fileReference2 = getFileReference(next.around_animation, null, inputFileLocation, zArr, inputFileLocationArr)) != null) {
                    fileReference = fileReference2;
                    break;
                }
                fileReference = getFileReference(next.center_icon, null, inputFileLocation, zArr, inputFileLocationArr);
                if (fileReference != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            getMessagesController().putUsers(tL_users_userFull.users, false);
            getMessagesController().putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            TL_bots.BotInfo botInfo = userFull.bot_info;
            if (botInfo != null) {
                getMessagesStorage().updateUserInfo(userFull, true);
                if (fileReference == null) {
                    fileReference = getFileReference(botInfo.description_document, null, inputFileLocation, zArr, inputFileLocationArr);
                }
                if (fileReference == null) {
                    fileReference = getFileReference(botInfo.description_photo, inputFileLocation, zArr, inputFileLocationArr);
                }
            }
        } else if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            Iterator<TLRPC.TL_attachMenuBotIcon> it3 = ((TLRPC.TL_attachMenuBotsBot) tLObject).bot.icons.iterator();
            while (it3.hasNext() && (fileReference = getFileReference(it3.next().icon, null, inputFileLocation, zArr, inputFileLocationArr)) == null) {
            }
        } else if (tLObject instanceof TLRPC.TL_help_appUpdate) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject;
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
                TLRPC.Document document3 = tL_help_appUpdate.document;
                if (document3 != null) {
                    fileReference = document3.file_reference;
                    TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                    TLRPC.Document document4 = tL_help_appUpdate.document;
                    tL_inputDocumentFileLocation.id = document4.id;
                    tL_inputDocumentFileLocation.access_hash = document4.access_hash;
                    tL_inputDocumentFileLocation.file_reference = document4.file_reference;
                    tL_inputDocumentFileLocation.thumb_size = "";
                    inputFileLocationArr = new TLRPC.InputFileLocation[]{tL_inputDocumentFileLocation};
                }
            } catch (Exception e3) {
                FileLog.e(e3);
                fileReference = null;
            }
            if (fileReference == null) {
                fileReference = getFileReference(tL_help_appUpdate.document, null, inputFileLocation, zArr, inputFileLocationArr);
            }
            if (fileReference == null) {
                fileReference = getFileReference(tL_help_appUpdate.sticker, null, inputFileLocation, zArr, inputFileLocationArr);
            }
        } else if (tLObject instanceof TLRPC.TL_messages_webPage) {
            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
            getMessagesController().putChats(tL_messages_webPage.chats, false);
            getMessagesController().putUsers(tL_messages_webPage.users, false);
            fileReference = getFileReference(tL_messages_webPage.webpage, inputFileLocation, zArr, inputFileLocationArr);
        } else if (tLObject instanceof TLRPC.WebPage) {
            fileReference = getFileReference((TLRPC.WebPage) tLObject, inputFileLocation, zArr, inputFileLocationArr);
        } else if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            int size2 = tL_wallPapers.wallpapers.size();
            for (int i3 = 0; i3 < size2; i3++) {
                fileReference = getFileReference(tL_wallPapers.wallpapers.get(i3).document, null, inputFileLocation, zArr, inputFileLocationArr);
                if (fileReference != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_wallPaper) {
            fileReference = getFileReference(((TLRPC.TL_wallPaper) tLObject).document, null, inputFileLocation, zArr, inputFileLocationArr);
        } else if (tLObject instanceof TLRPC.TL_theme) {
            fileReference = getFileReference(((TLRPC.TL_theme) tLObject).document, null, inputFileLocation, zArr, inputFileLocationArr);
        } else if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                int size3 = vector.objects.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Object obj2 = vector.objects.get(i4);
                    if (obj2 instanceof TLRPC.User) {
                        fileReference = getFileReference((TLRPC.User) obj2, inputFileLocation, zArr, inputFileLocationArr);
                    } else if (obj2 instanceof TLRPC.Chat) {
                        fileReference = getFileReference((TLRPC.Chat) obj2, inputFileLocation, zArr, inputFileLocationArr);
                    }
                    if (fileReference != null) {
                        break;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_chats) {
            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
            if (!tL_messages_chats.chats.isEmpty()) {
                int size4 = tL_messages_chats.chats.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    fileReference = getFileReference(tL_messages_chats.chats.get(i5), inputFileLocation, zArr, inputFileLocationArr);
                    if (fileReference != null) {
                        break;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
            TLRPC.TL_messages_savedGifs tL_messages_savedGifs = (TLRPC.TL_messages_savedGifs) tLObject;
            int size5 = tL_messages_savedGifs.gifs.size();
            for (int i6 = 0; i6 < size5; i6++) {
                fileReference = getFileReference(tL_messages_savedGifs.gifs.get(i6), null, inputFileLocation, zArr, inputFileLocationArr);
                if (fileReference != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            if (fileReference == null) {
                int size6 = tL_messages_stickerSet.documents.size();
                for (int i7 = 0; i7 < size6; i7++) {
                    fileReference = getFileReference(tL_messages_stickerSet.documents.get(i7), null, inputFileLocation, zArr, inputFileLocationArr);
                    if (fileReference != null) {
                        break;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
            TLRPC.TL_messages_recentStickers tL_messages_recentStickers = (TLRPC.TL_messages_recentStickers) tLObject;
            int size7 = tL_messages_recentStickers.stickers.size();
            for (int i8 = 0; i8 < size7; i8++) {
                fileReference = getFileReference(tL_messages_recentStickers.stickers.get(i8), null, inputFileLocation, zArr, inputFileLocationArr);
                if (fileReference != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
            TLRPC.TL_messages_favedStickers tL_messages_favedStickers = (TLRPC.TL_messages_favedStickers) tLObject;
            int size8 = tL_messages_favedStickers.stickers.size();
            for (int i9 = 0; i9 < size8; i9++) {
                fileReference = getFileReference(tL_messages_favedStickers.stickers.get(i9), null, inputFileLocation, zArr, inputFileLocationArr);
                if (fileReference != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TLRPC.photos_Photos) {
            TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
            int size9 = photos_photos.photos.size();
            for (int i10 = 0; i10 < size9; i10++) {
                fileReference = getFileReference(photos_photos.photos.get(i10), inputFileLocation, zArr, inputFileLocationArr);
                if (fileReference != null) {
                    break;
                }
            }
        } else if (tLObject instanceof TL_stories.TL_stories_stories) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            if (tL_stories_stories.stories.isEmpty() || (messageMedia = (storyItem = tL_stories_stories.stories.get(0)).media) == null) {
                storyItem = null;
            } else {
                if (fileReference == null && (photo2 = messageMedia.photo) != null) {
                    fileReference = getFileReference(photo2, inputFileLocation, zArr, inputFileLocationArr);
                }
                if (fileReference == null && (photo = storyItem.media.video_cover) != null) {
                    fileReference = getFileReference(photo, inputFileLocation, zArr, inputFileLocationArr);
                }
                if (fileReference == null && (document = (messageMedia2 = storyItem.media).document) != null) {
                    fileReference = getFileReference(document, messageMedia2.alt_documents, inputFileLocation, zArr, inputFileLocationArr);
                }
            }
            Object obj3 = objArr[1];
            if (obj3 instanceof FileLoadOperation) {
                Object obj4 = ((FileLoadOperation) obj3).parentObject;
                if (obj4 instanceof TL_stories.StoryItem) {
                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj4;
                    if (storyItem == null) {
                        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                        tL_updateStory.peer = getMessagesController().getPeer(storyItem2.dialogId);
                        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
                        tL_updateStory.story = tL_storyItemDeleted;
                        tL_storyItemDeleted.id = storyItem2.id;
                        ArrayList<TLRPC.Update> arrayList = new ArrayList<>();
                        arrayList.add(tL_updateStory);
                        getMessagesController().processUpdateArray(arrayList, null, null, false, 0);
                    } else {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(storyItem2.dialogId));
                        if (user != null && user.contact) {
                            MessagesController.getInstance(this.currentAccount).getStoriesController().getStoriesStorage().updateStoryItem(storyItem2.dialogId, storyItem);
                        }
                    }
                    if (storyItem != null && fileReference == null) {
                        TL_stories.TL_updateStory tL_updateStory2 = new TL_stories.TL_updateStory();
                        tL_updateStory2.peer = MessagesController.getInstance(this.currentAccount).getPeer(storyItem2.dialogId);
                        tL_updateStory2.story = storyItem;
                        ArrayList<TLRPC.Update> arrayList2 = new ArrayList<>();
                        arrayList2.add(tL_updateStory2);
                        MessagesController.getInstance(this.currentAccount).processUpdateArray(arrayList2, null, null, false, 0);
                    }
                }
            }
        }
        if (fileReference == null) {
            return null;
        }
        if (inputFileLocationArr != null && (inputFileLocation2 = inputFileLocationArr[0]) != null) {
            inputFileLocation3 = inputFileLocation2;
        }
        return new Pair<>(fileReference, inputFileLocation3);
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
            Iterator<TLRPC.PollAnswer> it = arrayList.iterator();
            while (it.hasNext() && (fileReferenceForMediaImpl = getFileReferenceForMediaImpl(it.next().media, inputFileLocation, zArr, inputFileLocationArr)) == null) {
            }
        }
        return fileReferenceForMediaImpl;
    }

    private byte[] getFileReferenceForRichMessage(TL_iv.RichMessage richMessage, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        byte[] fileReference = null;
        if (richMessage == null) {
            return null;
        }
        Iterator<TLRPC.Photo> it = richMessage.photos.iterator();
        while (it.hasNext()) {
            fileReference = getFileReference(it.next(), inputFileLocation, zArr, inputFileLocationArr);
            if (fileReference != null) {
                return fileReference;
            }
        }
        Iterator<TLRPC.Document> it2 = richMessage.documents.iterator();
        while (it2.hasNext() && (fileReference = getFileReference(it2.next(), null, inputFileLocation, zArr, inputFileLocationArr)) == null) {
        }
        return fileReference;
    }

    private byte[] getFileReferenceForMediaImpl(TLRPC.MessageMedia messageMedia, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.Photo photo;
        byte[] fileReference = null;
        if (messageMedia == null) {
            return null;
        }
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            fileReference = getFileReference(document, messageMedia.alt_documents, inputFileLocation, zArr, inputFileLocationArr);
        } else {
            TLRPC.TL_game tL_game = messageMedia.game;
            if (tL_game != null) {
                fileReference = getFileReference(tL_game.document, null, inputFileLocation, zArr, inputFileLocationArr);
                if (fileReference == null) {
                    fileReference = getFileReference(messageMedia.game.photo, inputFileLocation, zArr, inputFileLocationArr);
                }
            } else {
                TLRPC.Photo photo2 = messageMedia.photo;
                if (photo2 != null) {
                    fileReference = getFileReference(photo2, inputFileLocation, zArr, inputFileLocationArr);
                } else {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (webPage != null) {
                        fileReference = getFileReference(webPage, inputFileLocation, zArr, inputFileLocationArr);
                    }
                }
            }
        }
        return (fileReference != null || (photo = messageMedia.video_cover) == null) ? fileReference : getFileReference(photo, inputFileLocation, zArr, inputFileLocationArr);
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
                if (inputFileLocation != null) {
                    if (isSameReference(fileLoadOperation.location.file_reference, inputFileLocation.file_reference)) {
                        return false;
                    }
                    strBytesToHex = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                    fileLoadOperation.location = inputFileLocation;
                    if (BuildVars.LOGS_ENABLED) {
                        strBytesToHex = Utilities.bytesToHex(inputFileLocation.file_reference);
                    }
                } else {
                    if (isSameReference(inputFileLocation2.file_reference, bArr)) {
                        return false;
                    }
                    String strBytesToHex2 = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                    TLRPC.InputFileLocation inputFileLocation3 = fileLoadOperation.location;
                    inputFileLocation2.file_reference = bArr;
                    inputFileLocation3.file_reference = bArr;
                    strBytesToHex = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(bArr) : null;
                    strBytesToHex = strBytesToHex2;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_loading: from fileref cache updated fileref from " + strBytesToHex + " to " + strBytesToHex);
                }
            }
        }
        return true;
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

    public boolean applyCachedFileReference(java.lang.Object r11, java.lang.Object... r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.applyCachedFileReference(java.lang.Object, java.lang.Object[]):boolean");
    }

    private CachedResult getCachedResponse(String str) {
        CachedResult cachedResult = this.responseCache.get(str);
        if (cachedResult == null || Math.abs(System.currentTimeMillis() - cachedResult.firstQueryTime) < 60000) {
            return cachedResult;
        }
        this.responseCache.remove(str);
        return null;
    }

    private void putReponseToCache(String str, TLObject tLObject) {
        if (this.responseCache.get(str) == null) {
            CachedResult cachedResult = new CachedResult();
            cachedResult.response = tLObject;
            cachedResult.firstQueryTime = System.currentTimeMillis();
            this.responseCache.put(str, cachedResult);
        }
    }

    private byte[] getFileReference(TLRPC.Document document, ArrayList<TLRPC.Document> arrayList, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        if (document != null && inputFileLocation != null) {
            if (!(inputFileLocation instanceof TLRPC.TL_inputDocumentFileLocation)) {
                int size = document.thumbs.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.PhotoSize photoSize = document.thumbs.get(i);
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
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    byte[] fileReference2 = getFileReference(arrayList.get(i2), null, inputFileLocation, zArr, inputFileLocationArr);
                    if (fileReference2 != null) {
                        return fileReference2;
                    }
                }
            }
        }
        return null;
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
            } else if (chat.access_hash == 0 && chat.fromMessageDialogId != 0 && chat.fromMessageId != 0) {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChannelFromMessage();
                tL_inputPeerChat.channel_id = chat.id;
                tL_inputPeerChat.peer = getMessagesController().getInputPeer(chat.fromMessageDialogId);
                tL_inputPeerChat.msg_id = chat.fromMessageId;
            } else {
                tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerChat.channel_id = chat.id;
                tL_inputPeerChat.access_hash = chat.access_hash;
            }
            tL_inputPeerPhotoFileLocation.photo_id = chat.photo.photo_id;
            tL_inputPeerUser = tL_inputPeerChat;
        } else if (user.access_hash == 0 && user.fromMessageId != 0 && user.fromMessageDialogId != 0) {
            tL_inputPeerUser = new TLRPC.TL_inputPeerUserFromMessage();
            tL_inputPeerUser.user_id = user.id;
            tL_inputPeerUser.peer = getMessagesController().getInputPeer(user.fromMessageDialogId);
            tL_inputPeerUser.msg_id = user.fromMessageId;
            tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
        } else {
            tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputPeerUser.user_id = user.id;
            tL_inputPeerUser.access_hash = user.access_hash;
            tL_inputPeerPhotoFileLocation.photo_id = user.photo.photo_id;
        }
        tL_inputPeerPhotoFileLocation.peer = tL_inputPeerUser;
        inputFileLocationArr[0] = tL_inputPeerPhotoFileLocation;
        return true;
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
            fileReference = getFileReference(user.photo.photo_big, inputFileLocation, zArr);
            if (getPeerReferenceReplacement(user, null, true, inputFileLocation, inputFileLocationArr, zArr)) {
                return new byte[0];
            }
        }
        return fileReference;
    }

    private byte[] getFileReference(TLRPC.Chat chat, TLRPC.InputFileLocation inputFileLocation, boolean[] zArr, TLRPC.InputFileLocation[] inputFileLocationArr) {
        TLRPC.ChatPhoto chatPhoto;
        byte[] fileReference = null;
        if (chat != null && (chatPhoto = chat.photo) != null && ((inputFileLocation instanceof TLRPC.TL_inputFileLocation) || (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation))) {
            if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                zArr[0] = true;
                if (getPeerReferenceReplacement(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
                    return new byte[0];
                }
                return null;
            }
            fileReference = getFileReference(chatPhoto.photo_small, inputFileLocation, zArr);
            if (getPeerReferenceReplacement(null, chat, false, inputFileLocation, inputFileLocationArr, zArr)) {
                return new byte[0];
            }
            if (fileReference == null) {
                fileReference = getFileReference(chat.photo.photo_big, inputFileLocation, zArr);
                if (getPeerReferenceReplacement(null, chat, true, inputFileLocation, inputFileLocationArr, zArr)) {
                    return new byte[0];
                }
            }
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
        byte[] fileReference = getFileReference(webPage.document, null, inputFileLocation, zArr, inputFileLocationArr);
        if (fileReference != null) {
            return fileReference;
        }
        byte[] fileReference2 = getFileReference(webPage.photo, inputFileLocation, zArr, inputFileLocationArr);
        if (fileReference2 != null) {
            return fileReference2;
        }
        if (!webPage.attributes.isEmpty()) {
            int size = webPage.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                    TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                    int size2 = tL_webPageAttributeTheme.documents.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        int i3 = i2;
                        byte[] fileReference3 = getFileReference(tL_webPageAttributeTheme.documents.get(i2), null, inputFileLocation, zArr, inputFileLocationArr);
                        if (fileReference3 != null) {
                            return fileReference3;
                        }
                        i2 = i3 + 1;
                    }
                }
            }
        }
        TL_iv.Page page = webPage.cached_page;
        if (page == null) {
            return null;
        }
        int size3 = page.documents.size();
        for (int i4 = 0; i4 < size3; i4++) {
            byte[] fileReference4 = getFileReference(webPage.cached_page.documents.get(i4), null, inputFileLocation, zArr, inputFileLocationArr);
            if (fileReference4 != null) {
                return fileReference4;
            }
        }
        int size4 = webPage.cached_page.photos.size();
        for (int i5 = 0; i5 < size4; i5++) {
            byte[] fileReference5 = getFileReference(webPage.cached_page.photos.get(i5), inputFileLocation, zArr, inputFileLocationArr);
            if (fileReference5 != null) {
                return fileReference5;
            }
        }
        return null;
    }

    public static boolean isFileRefError(String str) {
        return "FILEREF_EXPIRED".equals(str) || "FILE_REFERENCE_EXPIRED".equals(str) || "FILE_REFERENCE_EMPTY".equals(str) || (str != null && str.startsWith("FILE_REFERENCE_"));
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

    public static boolean isFileRefErrorCover(String str) {
        return str != null && isFileRefError(str) && str.endsWith("COVER_EXPIRED");
    }
}
