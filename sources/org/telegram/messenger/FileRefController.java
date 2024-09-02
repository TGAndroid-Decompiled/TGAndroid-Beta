package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputFileLocation;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$InputStickeredMedia;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Page;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_account_getTheme;
import org.telegram.tgnet.TLRPC$TL_account_getWallPaper;
import org.telegram.tgnet.TLRPC$TL_account_getWallPapers;
import org.telegram.tgnet.TLRPC$TL_attachMenuBot;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_channel;
import org.telegram.tgnet.TLRPC$TL_channels_getChannels;
import org.telegram.tgnet.TLRPC$TL_channels_getMessages;
import org.telegram.tgnet.TLRPC$TL_chat;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_help_getAppUpdate;
import org.telegram.tgnet.TLRPC$TL_help_getPremiumPromo;
import org.telegram.tgnet.TLRPC$TL_help_premiumPromo;
import org.telegram.tgnet.TLRPC$TL_inputDocumentFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputMediaDocument;
import org.telegram.tgnet.TLRPC$TL_inputMediaPaidMedia;
import org.telegram.tgnet.TLRPC$TL_inputMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterChatPhotos;
import org.telegram.tgnet.TLRPC$TL_inputPeerChannel;
import org.telegram.tgnet.TLRPC$TL_inputPeerChat;
import org.telegram.tgnet.TLRPC$TL_inputPeerPhotoFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputPeerUser;
import org.telegram.tgnet.TLRPC$TL_inputPhotoFileLocation;
import org.telegram.tgnet.TLRPC$TL_inputSingleMedia;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_inputStickeredMediaDocument;
import org.telegram.tgnet.TLRPC$TL_inputStickeredMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_inputTheme;
import org.telegram.tgnet.TLRPC$TL_inputWallPaper;
import org.telegram.tgnet.TLRPC$TL_messages_editMessage;
import org.telegram.tgnet.TLRPC$TL_messages_faveSticker;
import org.telegram.tgnet.TLRPC$TL_messages_getAttachMenuBot;
import org.telegram.tgnet.TLRPC$TL_messages_getAttachedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getAvailableReactions;
import org.telegram.tgnet.TLRPC$TL_messages_getChats;
import org.telegram.tgnet.TLRPC$TL_messages_getFavedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getQuickReplyMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getRecentStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getSavedGifs;
import org.telegram.tgnet.TLRPC$TL_messages_getScheduledMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getStickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_getWebPage;
import org.telegram.tgnet.TLRPC$TL_messages_saveGif;
import org.telegram.tgnet.TLRPC$TL_messages_saveRecentSticker;
import org.telegram.tgnet.TLRPC$TL_messages_search;
import org.telegram.tgnet.TLRPC$TL_messages_sendMedia;
import org.telegram.tgnet.TLRPC$TL_messages_sendMultiMedia;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_photos_getUserPhotos;
import org.telegram.tgnet.TLRPC$TL_stickers_addStickerToSet;
import org.telegram.tgnet.TLRPC$TL_theme;
import org.telegram.tgnet.TLRPC$TL_users_getFullUser;
import org.telegram.tgnet.TLRPC$TL_users_getUsers;
import org.telegram.tgnet.TLRPC$TL_wallPaper;
import org.telegram.tgnet.TLRPC$TL_webPageAttributeTheme;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.TLRPC$WebPageAttribute;
import org.telegram.tgnet.tl.TL_bots$BotInfo;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.tgnet.tl.TL_stories$TL_stories_getStoriesByID;
import org.telegram.tgnet.tl.TL_stories$TL_storyItem;
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

    public static void lambda$onUpdateObjectReference$33(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$onUpdateObjectReference$34(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$onUpdateObjectReference$35(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$onUpdateObjectReference$36(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static class Requester {
        private Object[] args;
        private boolean completed;
        private TLRPC$InputFileLocation location;
        private String locationKey;

        private Requester() {
        }
    }

    public static class CachedResult {
        private long firstQueryTime;
        private TLObject response;

        private CachedResult() {
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

    public static FileRefController getInstance(int i) {
        FileRefController fileRefController = Instance[i];
        if (fileRefController == null) {
            synchronized (FileRefController.class) {
                fileRefController = Instance[i];
                if (fileRefController == null) {
                    FileRefController[] fileRefControllerArr = Instance;
                    FileRefController fileRefController2 = new FileRefController(i);
                    fileRefControllerArr[i] = fileRefController2;
                    fileRefController = fileRefController2;
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
        TLRPC$Message tLRPC$Message;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader;
        TLRPC$Peer tLRPC$Peer;
        if (obj instanceof StoriesController.BotPreview) {
            StoriesController.BotPreview botPreview = (StoriesController.BotPreview) obj;
            if (botPreview.list == null) {
                FileLog.d("failed request reference can't find list in botpreview");
                return null;
            }
            TLRPC$MessageMedia tLRPC$MessageMedia = botPreview.media;
            if (tLRPC$MessageMedia.document != null) {
                return "botstory_doc_" + botPreview.media.document.id;
            }
            if (tLRPC$MessageMedia.photo != null) {
                return "botstory_photo_" + botPreview.media.photo.id;
            }
            return "botstory_" + botPreview.id;
        }
        if (obj instanceof TL_stories$StoryItem) {
            TL_stories$StoryItem tL_stories$StoryItem = (TL_stories$StoryItem) obj;
            if (tL_stories$StoryItem.dialogId == 0) {
                FileLog.d("failed request reference can't find dialogId");
                return null;
            }
            return "story_" + tL_stories$StoryItem.dialogId + "_" + tL_stories$StoryItem.id;
        }
        if (obj instanceof TLRPC$TL_help_premiumPromo) {
            return "premium_promo";
        }
        if (obj instanceof TLRPC$TL_availableReaction) {
            return "available_reaction_" + ((TLRPC$TL_availableReaction) obj).reaction;
        }
        if (obj instanceof TL_bots$BotInfo) {
            return "bot_info_" + ((TL_bots$BotInfo) obj).user_id;
        }
        if (obj instanceof TLRPC$TL_attachMenuBot) {
            return "attach_menu_bot_" + ((TLRPC$TL_attachMenuBot) obj).bot_id;
        }
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            long channelId = messageObject.getChannelId();
            if (messageObject.type == 29 && (tLRPC$Message = messageObject.messageOwner) != null && (tLRPC$MessageFwdHeader = tLRPC$Message.fwd_from) != null && (tLRPC$Peer = tLRPC$MessageFwdHeader.from_id) != null) {
                channelId = DialogObject.getPeerDialogId(tLRPC$Peer);
            }
            return "message" + messageObject.getRealId() + "_" + channelId + "_" + messageObject.scheduled + "_" + messageObject.getQuickReplyId();
        }
        if (obj instanceof TLRPC$Message) {
            TLRPC$Message tLRPC$Message2 = (TLRPC$Message) obj;
            TLRPC$Peer tLRPC$Peer2 = tLRPC$Message2.peer_id;
            return "message" + tLRPC$Message2.id + "_" + (tLRPC$Peer2 != null ? tLRPC$Peer2.channel_id : 0L) + "_" + tLRPC$Message2.from_scheduled;
        }
        if (obj instanceof TLRPC$WebPage) {
            return "webpage" + ((TLRPC$WebPage) obj).id;
        }
        if (obj instanceof TLRPC$User) {
            return "user" + ((TLRPC$User) obj).id;
        }
        if (obj instanceof TLRPC$Chat) {
            return "chat" + ((TLRPC$Chat) obj).id;
        }
        if (obj instanceof String) {
            return "str" + ((String) obj);
        }
        if (obj instanceof TLRPC$TL_messages_stickerSet) {
            return "set" + ((TLRPC$TL_messages_stickerSet) obj).set.id;
        }
        if (obj instanceof TLRPC$StickerSetCovered) {
            return "set" + ((TLRPC$StickerSetCovered) obj).set.id;
        }
        if (obj instanceof TLRPC$InputStickerSet) {
            return "set" + ((TLRPC$InputStickerSet) obj).id;
        }
        if (obj instanceof TLRPC$TL_wallPaper) {
            return "wallpaper" + ((TLRPC$TL_wallPaper) obj).id;
        }
        if (obj instanceof TLRPC$TL_theme) {
            return "theme" + ((TLRPC$TL_theme) obj).id;
        }
        if (obj == null) {
            return null;
        }
        return "" + obj;
    }

    public void requestReference(java.lang.Object r12, java.lang.Object... r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.requestReference(java.lang.Object, java.lang.Object[]):void");
    }

    private String getObjectString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof TL_stories$StoryItem) {
            TL_stories$StoryItem tL_stories$StoryItem = (TL_stories$StoryItem) obj;
            return "story(dialogId=" + tL_stories$StoryItem.dialogId + " id=" + tL_stories$StoryItem.id + ")";
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

    private void broadcastWaitersData(ArrayList<Waiter> arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Waiter waiter = arrayList.get(i);
            onRequestComplete(waiter.locationKey, waiter.parentKey, tLObject, tLRPC$TL_error, i == size + (-1), false);
            i++;
        }
        arrayList.clear();
    }

    private void requestReferenceFromServer(Object obj, final String str, final String str2, Object[] objArr) {
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
                        FileRefController.this.lambda$requestReferenceFromServer$1(str, str2, (StoriesController.BotPreview) obj2);
                    }
                });
                return;
            }
        }
        if (obj instanceof TL_stories$StoryItem) {
            TL_stories$StoryItem tL_stories$StoryItem = (TL_stories$StoryItem) obj;
            TL_stories$TL_stories_getStoriesByID tL_stories$TL_stories_getStoriesByID = new TL_stories$TL_stories_getStoriesByID();
            tL_stories$TL_stories_getStoriesByID.peer = getMessagesController().getInputPeer(tL_stories$StoryItem.dialogId);
            tL_stories$TL_stories_getStoriesByID.id.add(Integer.valueOf(tL_stories$StoryItem.id));
            getConnectionsManager().sendRequest(tL_stories$TL_stories_getStoriesByID, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$2(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC$TL_help_premiumPromo) {
            getConnectionsManager().sendRequest(new TLRPC$TL_help_getPremiumPromo(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$3(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC$TL_availableReaction) {
            TLRPC$TL_messages_getAvailableReactions tLRPC$TL_messages_getAvailableReactions = new TLRPC$TL_messages_getAvailableReactions();
            tLRPC$TL_messages_getAvailableReactions.hash = 0;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getAvailableReactions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$4(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof TL_bots$BotInfo) {
            TLRPC$TL_users_getFullUser tLRPC$TL_users_getFullUser = new TLRPC$TL_users_getFullUser();
            tLRPC$TL_users_getFullUser.id = getMessagesController().getInputUser(((TL_bots$BotInfo) obj).user_id);
            getConnectionsManager().sendRequest(tLRPC$TL_users_getFullUser, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$5(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC$TL_attachMenuBot) {
            TLRPC$TL_messages_getAttachMenuBot tLRPC$TL_messages_getAttachMenuBot = new TLRPC$TL_messages_getAttachMenuBot();
            tLRPC$TL_messages_getAttachMenuBot.bot = getMessagesController().getInputUser(((TLRPC$TL_attachMenuBot) obj).bot_id);
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getAttachMenuBot, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$6(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            long channelId = messageObject.getChannelId();
            if (messageObject.scheduled) {
                TLRPC$TL_messages_getScheduledMessages tLRPC$TL_messages_getScheduledMessages = new TLRPC$TL_messages_getScheduledMessages();
                tLRPC$TL_messages_getScheduledMessages.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
                tLRPC$TL_messages_getScheduledMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getScheduledMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$7(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            if (messageObject.isQuickReply()) {
                TLRPC$TL_messages_getQuickReplyMessages tLRPC$TL_messages_getQuickReplyMessages = new TLRPC$TL_messages_getQuickReplyMessages();
                tLRPC$TL_messages_getQuickReplyMessages.shortcut_id = messageObject.getQuickReplyId();
                tLRPC$TL_messages_getQuickReplyMessages.flags |= 1;
                tLRPC$TL_messages_getQuickReplyMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getQuickReplyMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$8(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            if (channelId != 0) {
                TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages = new TLRPC$TL_channels_getMessages();
                tLRPC$TL_channels_getMessages.channel = getMessagesController().getInputChannel(channelId);
                tLRPC$TL_channels_getMessages.id.add(Integer.valueOf(messageObject.getRealId()));
                getConnectionsManager().sendRequest(tLRPC$TL_channels_getMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$9(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages = new TLRPC$TL_messages_getMessages();
            tLRPC$TL_messages_getMessages.id.add(Integer.valueOf(messageObject.getRealId()));
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$10(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC$TL_wallPaper) {
            TLRPC$TL_wallPaper tLRPC$TL_wallPaper = (TLRPC$TL_wallPaper) obj;
            TLRPC$TL_account_getWallPaper tLRPC$TL_account_getWallPaper = new TLRPC$TL_account_getWallPaper();
            TLRPC$TL_inputWallPaper tLRPC$TL_inputWallPaper = new TLRPC$TL_inputWallPaper();
            tLRPC$TL_inputWallPaper.id = tLRPC$TL_wallPaper.id;
            tLRPC$TL_inputWallPaper.access_hash = tLRPC$TL_wallPaper.access_hash;
            tLRPC$TL_account_getWallPaper.wallpaper = tLRPC$TL_inputWallPaper;
            getConnectionsManager().sendRequest(tLRPC$TL_account_getWallPaper, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$11(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC$TL_theme) {
            TLRPC$TL_theme tLRPC$TL_theme = (TLRPC$TL_theme) obj;
            TLRPC$TL_account_getTheme tLRPC$TL_account_getTheme = new TLRPC$TL_account_getTheme();
            TLRPC$TL_inputTheme tLRPC$TL_inputTheme = new TLRPC$TL_inputTheme();
            tLRPC$TL_inputTheme.id = tLRPC$TL_theme.id;
            tLRPC$TL_inputTheme.access_hash = tLRPC$TL_theme.access_hash;
            tLRPC$TL_account_getTheme.theme = tLRPC$TL_inputTheme;
            tLRPC$TL_account_getTheme.format = "android";
            getConnectionsManager().sendRequest(tLRPC$TL_account_getTheme, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$12(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC$WebPage) {
            TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage = new TLRPC$TL_messages_getWebPage();
            tLRPC$TL_messages_getWebPage.url = ((TLRPC$WebPage) obj).url;
            tLRPC$TL_messages_getWebPage.hash = 0;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getWebPage, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$13(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC$User) {
            TLRPC$TL_users_getUsers tLRPC$TL_users_getUsers = new TLRPC$TL_users_getUsers();
            tLRPC$TL_users_getUsers.id.add(getMessagesController().getInputUser((TLRPC$User) obj));
            getConnectionsManager().sendRequest(tLRPC$TL_users_getUsers, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$14(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC$Chat) {
            TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) obj;
            if (tLRPC$Chat instanceof TLRPC$TL_chat) {
                TLRPC$TL_messages_getChats tLRPC$TL_messages_getChats = new TLRPC$TL_messages_getChats();
                tLRPC$TL_messages_getChats.id.add(Long.valueOf(tLRPC$Chat.id));
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getChats, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$15(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            } else {
                if (tLRPC$Chat instanceof TLRPC$TL_channel) {
                    TLRPC$TL_channels_getChannels tLRPC$TL_channels_getChannels = new TLRPC$TL_channels_getChannels();
                    tLRPC$TL_channels_getChannels.id.add(MessagesController.getInputChannel(tLRPC$Chat));
                    getConnectionsManager().sendRequest(tLRPC$TL_channels_getChannels, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$16(str, str2, tLObject, tLRPC$TL_error);
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
                    getConnectionsManager().sendRequest(new TLRPC$TL_account_getWallPapers(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$17(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                this.wallpaperWaiters.add(new Waiter(str, str2));
                return;
            }
            if (str3.startsWith("gif")) {
                if (this.savedGifsWaiters.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC$TL_messages_getSavedGifs(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$18(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                this.savedGifsWaiters.add(new Waiter(str, str2));
                return;
            }
            if ("recent".equals(str3)) {
                if (this.recentStickersWaiter.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC$TL_messages_getRecentStickers(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$19(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                this.recentStickersWaiter.add(new Waiter(str, str2));
                return;
            }
            if ("fav".equals(str3)) {
                if (this.favStickersWaiter.isEmpty()) {
                    getConnectionsManager().sendRequest(new TLRPC$TL_messages_getFavedStickers(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$20(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                this.favStickersWaiter.add(new Waiter(str, str2));
                return;
            }
            if ("update".equals(str3)) {
                TLRPC$TL_help_getAppUpdate tLRPC$TL_help_getAppUpdate = new TLRPC$TL_help_getAppUpdate();
                try {
                    tLRPC$TL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
                } catch (Exception unused) {
                }
                if (tLRPC$TL_help_getAppUpdate.source == null) {
                    tLRPC$TL_help_getAppUpdate.source = "";
                }
                getConnectionsManager().sendRequest(tLRPC$TL_help_getAppUpdate, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$21(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            if (str3.startsWith("avatar_")) {
                long longValue = Utilities.parseLong(str3).longValue();
                if (longValue > 0) {
                    TLRPC$TL_photos_getUserPhotos tLRPC$TL_photos_getUserPhotos = new TLRPC$TL_photos_getUserPhotos();
                    tLRPC$TL_photos_getUserPhotos.limit = 80;
                    tLRPC$TL_photos_getUserPhotos.offset = 0;
                    tLRPC$TL_photos_getUserPhotos.max_id = 0L;
                    tLRPC$TL_photos_getUserPhotos.user_id = getMessagesController().getInputUser(longValue);
                    getConnectionsManager().sendRequest(tLRPC$TL_photos_getUserPhotos, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$22(str, str2, tLObject, tLRPC$TL_error);
                        }
                    });
                    return;
                }
                TLRPC$TL_messages_search tLRPC$TL_messages_search = new TLRPC$TL_messages_search();
                tLRPC$TL_messages_search.filter = new TLRPC$TL_inputMessagesFilterChatPhotos();
                tLRPC$TL_messages_search.limit = 80;
                tLRPC$TL_messages_search.offset_id = 0;
                tLRPC$TL_messages_search.q = "";
                tLRPC$TL_messages_search.peer = getMessagesController().getInputPeer(longValue);
                getConnectionsManager().sendRequest(tLRPC$TL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        FileRefController.this.lambda$requestReferenceFromServer$23(str, str2, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            if (str3.startsWith("sent_")) {
                String[] split = str3.split("_");
                if (split.length >= 3) {
                    long longValue2 = Utilities.parseLong(split[1]).longValue();
                    if (longValue2 != 0) {
                        TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages2 = new TLRPC$TL_channels_getMessages();
                        tLRPC$TL_channels_getMessages2.channel = getMessagesController().getInputChannel(longValue2);
                        tLRPC$TL_channels_getMessages2.id.add(Utilities.parseInt((CharSequence) split[2]));
                        getConnectionsManager().sendRequest(tLRPC$TL_channels_getMessages2, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                FileRefController.this.lambda$requestReferenceFromServer$24(str, str2, tLObject, tLRPC$TL_error);
                            }
                        });
                        return;
                    }
                    TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages2 = new TLRPC$TL_messages_getMessages();
                    tLRPC$TL_messages_getMessages2.id.add(Utilities.parseInt((CharSequence) split[2]));
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages2, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            FileRefController.this.lambda$requestReferenceFromServer$25(str, str2, tLObject, tLRPC$TL_error);
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
        if (obj instanceof TLRPC$TL_messages_stickerSet) {
            TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
            TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
            tLRPC$TL_messages_getStickerSet.stickerset = tLRPC$TL_inputStickerSetID;
            TLRPC$StickerSet tLRPC$StickerSet = ((TLRPC$TL_messages_stickerSet) obj).set;
            tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
            tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$26(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC$StickerSetCovered) {
            TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet2 = new TLRPC$TL_messages_getStickerSet();
            TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID2 = new TLRPC$TL_inputStickerSetID();
            tLRPC$TL_messages_getStickerSet2.stickerset = tLRPC$TL_inputStickerSetID2;
            TLRPC$StickerSet tLRPC$StickerSet2 = ((TLRPC$StickerSetCovered) obj).set;
            tLRPC$TL_inputStickerSetID2.id = tLRPC$StickerSet2.id;
            tLRPC$TL_inputStickerSetID2.access_hash = tLRPC$StickerSet2.access_hash;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet2, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$27(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        if (obj instanceof TLRPC$InputStickerSet) {
            TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet3 = new TLRPC$TL_messages_getStickerSet();
            tLRPC$TL_messages_getStickerSet3.stickerset = (TLRPC$InputStickerSet) obj;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet3, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    FileRefController.this.lambda$requestReferenceFromServer$28(str, str2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        sendErrorToObject(objArr, 0);
    }

    public void lambda$requestReferenceFromServer$1(final String str, final String str2, final StoriesController.BotPreview botPreview) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileRefController.this.lambda$requestReferenceFromServer$0(str, str2, botPreview);
            }
        });
    }

    public void lambda$requestReferenceFromServer$0(String str, String str2, StoriesController.BotPreview botPreview) {
        onRequestComplete(str, str2, botPreview, null, true, false);
    }

    public void lambda$requestReferenceFromServer$2(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$3(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC$TL_help_premiumPromo) {
            getMediaDataController().processLoadedPremiumPromo((TLRPC$TL_help_premiumPromo) tLObject, currentTimeMillis, false);
        }
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$4(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$5(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$6(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$7(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$8(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$9(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$10(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$11(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$12(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$13(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$14(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$15(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$16(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$17(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        broadcastWaitersData(this.wallpaperWaiters, tLObject, tLRPC$TL_error);
    }

    public void lambda$requestReferenceFromServer$18(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        broadcastWaitersData(this.savedGifsWaiters, tLObject, tLRPC$TL_error);
    }

    public void lambda$requestReferenceFromServer$19(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        broadcastWaitersData(this.recentStickersWaiter, tLObject, tLRPC$TL_error);
    }

    public void lambda$requestReferenceFromServer$20(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        broadcastWaitersData(this.favStickersWaiter, tLObject, tLRPC$TL_error);
    }

    public void lambda$requestReferenceFromServer$21(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$22(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$23(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$24(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, false, false);
    }

    public void lambda$requestReferenceFromServer$25(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, false, false);
    }

    public void lambda$requestReferenceFromServer$26(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$27(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    public void lambda$requestReferenceFromServer$28(String str, String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        onRequestComplete(str, str2, tLObject, tLRPC$TL_error, true, false);
    }

    private boolean isSameReference(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private boolean onUpdateObjectReference(final Requester requester, byte[] bArr, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean z) {
        String str;
        TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto;
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("fileref updated for " + requester.args[0] + " " + requester.locationKey);
        }
        if (!(requester.args[0] instanceof TL_stories$TL_storyItem)) {
            if (requester.args[0] instanceof TLRPC$TL_inputSingleMedia) {
                final TLRPC$TL_messages_sendMultiMedia tLRPC$TL_messages_sendMultiMedia = (TLRPC$TL_messages_sendMultiMedia) requester.args[1];
                final Object[] objArr = this.multiMediaCache.get(tLRPC$TL_messages_sendMultiMedia);
                if (objArr == null) {
                    return true;
                }
                TLRPC$TL_inputSingleMedia tLRPC$TL_inputSingleMedia = (TLRPC$TL_inputSingleMedia) requester.args[0];
                TLRPC$InputMedia tLRPC$InputMedia = tLRPC$TL_inputSingleMedia.media;
                if (tLRPC$InputMedia instanceof TLRPC$TL_inputMediaDocument) {
                    TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument = (TLRPC$TL_inputMediaDocument) tLRPC$InputMedia;
                    if (z && isSameReference(tLRPC$TL_inputMediaDocument.id.file_reference, bArr)) {
                        return false;
                    }
                    tLRPC$TL_inputMediaDocument.id.file_reference = bArr;
                } else if (tLRPC$InputMedia instanceof TLRPC$TL_inputMediaPhoto) {
                    TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto2 = (TLRPC$TL_inputMediaPhoto) tLRPC$InputMedia;
                    if (z && isSameReference(tLRPC$TL_inputMediaPhoto2.id.file_reference, bArr)) {
                        return false;
                    }
                    tLRPC$TL_inputMediaPhoto2.id.file_reference = bArr;
                }
                int indexOf = tLRPC$TL_messages_sendMultiMedia.multi_media.indexOf(tLRPC$TL_inputSingleMedia);
                if (indexOf < 0) {
                    return true;
                }
                ArrayList arrayList = (ArrayList) objArr[3];
                arrayList.set(indexOf, null);
                boolean z2 = true;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) != null) {
                        z2 = false;
                    }
                }
                if (z2) {
                    this.multiMediaCache.remove(tLRPC$TL_messages_sendMultiMedia);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            FileRefController.this.lambda$onUpdateObjectReference$29(tLRPC$TL_messages_sendMultiMedia, objArr);
                        }
                    });
                }
            } else if (requester.args.length < 2 || !(requester.args[1] instanceof TLRPC$TL_messages_sendMedia) || !(((TLRPC$TL_messages_sendMedia) requester.args[1]).media instanceof TLRPC$TL_inputMediaPaidMedia) || (!(requester.args[0] instanceof TLRPC$TL_inputMediaPhoto) && !(requester.args[0] instanceof TLRPC$TL_inputMediaDocument))) {
                if (!(requester.args[0] instanceof TLRPC$TL_messages_sendMedia)) {
                    if (!(requester.args[0] instanceof TLRPC$TL_messages_editMessage)) {
                        if (requester.args[0] instanceof TLRPC$TL_messages_saveGif) {
                            TLRPC$TL_messages_saveGif tLRPC$TL_messages_saveGif = (TLRPC$TL_messages_saveGif) requester.args[0];
                            if (z && isSameReference(tLRPC$TL_messages_saveGif.id.file_reference, bArr)) {
                                return false;
                            }
                            tLRPC$TL_messages_saveGif.id.file_reference = bArr;
                            getConnectionsManager().sendRequest(tLRPC$TL_messages_saveGif, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    FileRefController.lambda$onUpdateObjectReference$33(tLObject, tLRPC$TL_error);
                                }
                            });
                        } else if (requester.args[0] instanceof TLRPC$TL_messages_saveRecentSticker) {
                            TLRPC$TL_messages_saveRecentSticker tLRPC$TL_messages_saveRecentSticker = (TLRPC$TL_messages_saveRecentSticker) requester.args[0];
                            if (z && isSameReference(tLRPC$TL_messages_saveRecentSticker.id.file_reference, bArr)) {
                                return false;
                            }
                            tLRPC$TL_messages_saveRecentSticker.id.file_reference = bArr;
                            getConnectionsManager().sendRequest(tLRPC$TL_messages_saveRecentSticker, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    FileRefController.lambda$onUpdateObjectReference$34(tLObject, tLRPC$TL_error);
                                }
                            });
                        } else if (requester.args[0] instanceof TLRPC$TL_stickers_addStickerToSet) {
                            TLRPC$TL_stickers_addStickerToSet tLRPC$TL_stickers_addStickerToSet = (TLRPC$TL_stickers_addStickerToSet) requester.args[0];
                            if (z && isSameReference(tLRPC$TL_stickers_addStickerToSet.sticker.document.file_reference, bArr)) {
                                return false;
                            }
                            tLRPC$TL_stickers_addStickerToSet.sticker.document.file_reference = bArr;
                            getConnectionsManager().sendRequest(tLRPC$TL_stickers_addStickerToSet, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    FileRefController.lambda$onUpdateObjectReference$35(tLObject, tLRPC$TL_error);
                                }
                            });
                        } else if (requester.args[0] instanceof TLRPC$TL_messages_faveSticker) {
                            TLRPC$TL_messages_faveSticker tLRPC$TL_messages_faveSticker = (TLRPC$TL_messages_faveSticker) requester.args[0];
                            if (z && isSameReference(tLRPC$TL_messages_faveSticker.id.file_reference, bArr)) {
                                return false;
                            }
                            tLRPC$TL_messages_faveSticker.id.file_reference = bArr;
                            getConnectionsManager().sendRequest(tLRPC$TL_messages_faveSticker, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    FileRefController.lambda$onUpdateObjectReference$36(tLObject, tLRPC$TL_error);
                                }
                            });
                        } else if (requester.args[0] instanceof TLRPC$TL_messages_getAttachedStickers) {
                            TLRPC$TL_messages_getAttachedStickers tLRPC$TL_messages_getAttachedStickers = (TLRPC$TL_messages_getAttachedStickers) requester.args[0];
                            TLRPC$InputStickeredMedia tLRPC$InputStickeredMedia = tLRPC$TL_messages_getAttachedStickers.media;
                            if (tLRPC$InputStickeredMedia instanceof TLRPC$TL_inputStickeredMediaDocument) {
                                TLRPC$TL_inputStickeredMediaDocument tLRPC$TL_inputStickeredMediaDocument = (TLRPC$TL_inputStickeredMediaDocument) tLRPC$InputStickeredMedia;
                                if (z && isSameReference(tLRPC$TL_inputStickeredMediaDocument.id.file_reference, bArr)) {
                                    return false;
                                }
                                tLRPC$TL_inputStickeredMediaDocument.id.file_reference = bArr;
                            } else if (tLRPC$InputStickeredMedia instanceof TLRPC$TL_inputStickeredMediaPhoto) {
                                TLRPC$TL_inputStickeredMediaPhoto tLRPC$TL_inputStickeredMediaPhoto = (TLRPC$TL_inputStickeredMediaPhoto) tLRPC$InputStickeredMedia;
                                if (z && isSameReference(tLRPC$TL_inputStickeredMediaPhoto.id.file_reference, bArr)) {
                                    return false;
                                }
                                tLRPC$TL_inputStickeredMediaPhoto.id.file_reference = bArr;
                            }
                            getConnectionsManager().sendRequest(tLRPC$TL_messages_getAttachedStickers, (RequestDelegate) requester.args[1]);
                        } else if (requester.args[1] instanceof FileLoadOperation) {
                            FileLoadOperation fileLoadOperation = (FileLoadOperation) requester.args[1];
                            if (tLRPC$InputFileLocation == null) {
                                if (z && isSameReference(requester.location.file_reference, bArr)) {
                                    return false;
                                }
                                String bytesToHex = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                                TLRPC$InputFileLocation tLRPC$InputFileLocation2 = fileLoadOperation.location;
                                requester.location.file_reference = bArr;
                                tLRPC$InputFileLocation2.file_reference = bArr;
                                r5 = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                                str = bytesToHex;
                            } else {
                                if (z && isSameReference(fileLoadOperation.location.file_reference, tLRPC$InputFileLocation.file_reference)) {
                                    return false;
                                }
                                str = BuildVars.LOGS_ENABLED ? Utilities.bytesToHex(fileLoadOperation.location.file_reference) : null;
                                fileLoadOperation.location = tLRPC$InputFileLocation;
                                if (BuildVars.LOGS_ENABLED) {
                                    r5 = Utilities.bytesToHex(tLRPC$InputFileLocation.file_reference);
                                }
                            }
                            fileLoadOperation.requestingReference = false;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("debug_loading: " + fileLoadOperation.getCacheFileFinal().getName() + " " + str + " " + r5 + " reference updated resume download");
                            }
                            fileLoadOperation.startDownloadRequest(-1);
                        }
                    } else {
                        TLRPC$InputMedia tLRPC$InputMedia2 = ((TLRPC$TL_messages_editMessage) requester.args[0]).media;
                        if (tLRPC$InputMedia2 instanceof TLRPC$TL_inputMediaDocument) {
                            TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument2 = (TLRPC$TL_inputMediaDocument) tLRPC$InputMedia2;
                            if (z && isSameReference(tLRPC$TL_inputMediaDocument2.id.file_reference, bArr)) {
                                return false;
                            }
                            tLRPC$TL_inputMediaDocument2.id.file_reference = bArr;
                        } else if (tLRPC$InputMedia2 instanceof TLRPC$TL_inputMediaPhoto) {
                            TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto3 = (TLRPC$TL_inputMediaPhoto) tLRPC$InputMedia2;
                            if (z && isSameReference(tLRPC$TL_inputMediaPhoto3.id.file_reference, bArr)) {
                                return false;
                            }
                            tLRPC$TL_inputMediaPhoto3.id.file_reference = bArr;
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                FileRefController.this.lambda$onUpdateObjectReference$32(requester);
                            }
                        });
                    }
                } else {
                    TLRPC$InputMedia tLRPC$InputMedia3 = ((TLRPC$TL_messages_sendMedia) requester.args[0]).media;
                    if (tLRPC$InputMedia3 instanceof TLRPC$TL_inputMediaDocument) {
                        TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument3 = (TLRPC$TL_inputMediaDocument) tLRPC$InputMedia3;
                        if (z && isSameReference(tLRPC$TL_inputMediaDocument3.id.file_reference, bArr)) {
                            return false;
                        }
                        tLRPC$TL_inputMediaDocument3.id.file_reference = bArr;
                    } else if (tLRPC$InputMedia3 instanceof TLRPC$TL_inputMediaPhoto) {
                        TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto4 = (TLRPC$TL_inputMediaPhoto) tLRPC$InputMedia3;
                        if (z && isSameReference(tLRPC$TL_inputMediaPhoto4.id.file_reference, bArr)) {
                            return false;
                        }
                        tLRPC$TL_inputMediaPhoto4.id.file_reference = bArr;
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            FileRefController.this.lambda$onUpdateObjectReference$31(requester);
                        }
                    });
                }
            } else {
                final TLRPC$TL_messages_sendMedia tLRPC$TL_messages_sendMedia = (TLRPC$TL_messages_sendMedia) requester.args[1];
                final Object[] objArr2 = this.multiMediaCache.get(tLRPC$TL_messages_sendMedia);
                if (objArr2 == null) {
                    return true;
                }
                if (requester.args[0] instanceof TLRPC$TL_inputMediaDocument) {
                    TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument4 = (TLRPC$TL_inputMediaDocument) requester.args[0];
                    if (z && isSameReference(tLRPC$TL_inputMediaDocument4.id.file_reference, bArr)) {
                        return false;
                    }
                    tLRPC$TL_inputMediaDocument4.id.file_reference = bArr;
                    tLRPC$TL_inputMediaPhoto = tLRPC$TL_inputMediaDocument4;
                } else if (requester.args[0] instanceof TLRPC$TL_inputMediaPhoto) {
                    TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto5 = (TLRPC$TL_inputMediaPhoto) requester.args[0];
                    if (z && isSameReference(tLRPC$TL_inputMediaPhoto5.id.file_reference, bArr)) {
                        return false;
                    }
                    tLRPC$TL_inputMediaPhoto5.id.file_reference = bArr;
                    tLRPC$TL_inputMediaPhoto = tLRPC$TL_inputMediaPhoto5;
                } else {
                    tLRPC$TL_inputMediaPhoto = null;
                }
                int indexOf2 = ((TLRPC$TL_inputMediaPaidMedia) tLRPC$TL_messages_sendMedia.media).extended_media.indexOf(tLRPC$TL_inputMediaPhoto);
                if (indexOf2 < 0) {
                    return true;
                }
                ArrayList arrayList2 = (ArrayList) objArr2[3];
                arrayList2.set(indexOf2, null);
                boolean z3 = true;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (arrayList2.get(i2) != null) {
                        z3 = false;
                    }
                }
                if (z3) {
                    this.multiMediaCache.remove(tLRPC$TL_messages_sendMedia);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            FileRefController.this.lambda$onUpdateObjectReference$30(tLRPC$TL_messages_sendMedia, objArr2);
                        }
                    });
                }
            }
            return true;
        }
        ((TL_stories$TL_storyItem) requester.args[0]).media.document.file_reference = bArr;
        return true;
    }

    public void lambda$onUpdateObjectReference$29(TLRPC$TL_messages_sendMultiMedia tLRPC$TL_messages_sendMultiMedia, Object[] objArr) {
        getSendMessagesHelper().performSendMessageRequestMulti(tLRPC$TL_messages_sendMultiMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    public void lambda$onUpdateObjectReference$30(TLRPC$TL_messages_sendMedia tLRPC$TL_messages_sendMedia, Object[] objArr) {
        getSendMessagesHelper().performSendMessageRequestMulti(tLRPC$TL_messages_sendMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    public void lambda$onUpdateObjectReference$31(Requester requester) {
        getSendMessagesHelper().performSendMessageRequest((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    public void lambda$onUpdateObjectReference$32(Requester requester) {
        getSendMessagesHelper().performSendMessageRequest((TLObject) requester.args[0], (MessageObject) requester.args[1], (String) requester.args[2], (SendMessagesHelper.DelayedMessage) requester.args[3], ((Boolean) requester.args[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) requester.args[5], null, null, ((Boolean) requester.args[6]).booleanValue());
    }

    private void sendErrorToObject(final Object[] objArr, int i) {
        if (objArr[0] instanceof TLRPC$TL_inputSingleMedia) {
            final TLRPC$TL_messages_sendMultiMedia tLRPC$TL_messages_sendMultiMedia = (TLRPC$TL_messages_sendMultiMedia) objArr[1];
            final Object[] objArr2 = this.multiMediaCache.get(tLRPC$TL_messages_sendMultiMedia);
            if (objArr2 != null) {
                this.multiMediaCache.remove(tLRPC$TL_messages_sendMultiMedia);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        FileRefController.this.lambda$sendErrorToObject$37(tLRPC$TL_messages_sendMultiMedia, objArr2);
                    }
                });
                return;
            }
            return;
        }
        if (((objArr[0] instanceof TLRPC$TL_inputMediaDocument) || (objArr[0] instanceof TLRPC$TL_inputMediaPhoto)) && (objArr[1] instanceof TLRPC$TL_messages_sendMedia)) {
            final TLRPC$TL_messages_sendMedia tLRPC$TL_messages_sendMedia = (TLRPC$TL_messages_sendMedia) objArr[1];
            final Object[] objArr3 = this.multiMediaCache.get(tLRPC$TL_messages_sendMedia);
            if (objArr3 != null) {
                this.multiMediaCache.remove(tLRPC$TL_messages_sendMedia);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        FileRefController.this.lambda$sendErrorToObject$38(tLRPC$TL_messages_sendMedia, objArr3);
                    }
                });
                return;
            }
            return;
        }
        if (((objArr[0] instanceof TLRPC$TL_messages_sendMedia) && !(((TLRPC$TL_messages_sendMedia) objArr[0]).media instanceof TLRPC$TL_inputMediaPaidMedia)) || (objArr[0] instanceof TLRPC$TL_messages_editMessage)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    FileRefController.this.lambda$sendErrorToObject$39(objArr);
                }
            });
            return;
        }
        if (objArr[0] instanceof TLRPC$TL_messages_saveGif) {
            return;
        }
        if (objArr[0] instanceof TLRPC$TL_messages_saveRecentSticker) {
            return;
        }
        if (objArr[0] instanceof TLRPC$TL_stickers_addStickerToSet) {
            return;
        }
        if (objArr[0] instanceof TLRPC$TL_messages_faveSticker) {
            return;
        }
        if (objArr[0] instanceof TLRPC$TL_messages_getAttachedStickers) {
            getConnectionsManager().sendRequest((TLRPC$TL_messages_getAttachedStickers) objArr[0], (RequestDelegate) objArr[1]);
        } else if (objArr[1] instanceof FileLoadOperation) {
            FileLoadOperation fileLoadOperation = (FileLoadOperation) objArr[1];
            fileLoadOperation.requestingReference = false;
            FileLog.e("debug_loading: " + fileLoadOperation.getCacheFileFinal().getName() + " reference can't update: fail operation ");
            fileLoadOperation.onFail(false, 0);
        }
    }

    public void lambda$sendErrorToObject$37(TLRPC$TL_messages_sendMultiMedia tLRPC$TL_messages_sendMultiMedia, Object[] objArr) {
        getSendMessagesHelper().performSendMessageRequestMulti(tLRPC$TL_messages_sendMultiMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    public void lambda$sendErrorToObject$38(TLRPC$TL_messages_sendMedia tLRPC$TL_messages_sendMedia, Object[] objArr) {
        getSendMessagesHelper().performSendMessageRequestMulti(tLRPC$TL_messages_sendMedia, (ArrayList) objArr[1], (ArrayList) objArr[2], null, (SendMessagesHelper.DelayedMessage) objArr[4], ((Boolean) objArr[5]).booleanValue());
    }

    public void lambda$sendErrorToObject$39(Object[] objArr) {
        getSendMessagesHelper().performSendMessageRequest((TLObject) objArr[0], (MessageObject) objArr[1], (String) objArr[2], (SendMessagesHelper.DelayedMessage) objArr[3], ((Boolean) objArr[4]).booleanValue(), (SendMessagesHelper.DelayedMessage) objArr[5], null, null, ((Boolean) objArr[6]).booleanValue());
    }

    private boolean onRequestComplete(java.lang.String r29, java.lang.String r30, org.telegram.tgnet.TLObject r31, org.telegram.tgnet.TLRPC$TL_error r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileRefController.onRequestComplete(java.lang.String, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error, boolean, boolean):boolean");
    }

    public void lambda$onRequestComplete$41(TLRPC$User tLRPC$User) {
        getMessagesController().putUser(tLRPC$User, false);
    }

    public void lambda$onRequestComplete$42(TLRPC$Chat tLRPC$Chat) {
        getMessagesController().putChat(tLRPC$Chat, false);
    }

    public void lambda$onRequestComplete$43(TLRPC$Chat tLRPC$Chat) {
        getMessagesController().putChat(tLRPC$Chat, false);
    }

    public void lambda$onRequestComplete$44(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        getMediaDataController().replaceStickerSet(tLRPC$TL_messages_stickerSet);
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

    private void putReponseToCache(String str, TLObject tLObject) {
        if (this.responseCache.get(str) == null) {
            CachedResult cachedResult = new CachedResult();
            cachedResult.response = tLObject;
            cachedResult.firstQueryTime = System.currentTimeMillis();
            this.responseCache.put(str, cachedResult);
        }
    }

    private byte[] getFileReference(TLRPC$Document tLRPC$Document, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr) {
        if (tLRPC$Document != null && tLRPC$InputFileLocation != null) {
            if (!(tLRPC$InputFileLocation instanceof TLRPC$TL_inputDocumentFileLocation)) {
                int size = tLRPC$Document.thumbs.size();
                for (int i = 0; i < size; i++) {
                    TLRPC$PhotoSize tLRPC$PhotoSize = tLRPC$Document.thumbs.get(i);
                    byte[] fileReference = getFileReference(tLRPC$PhotoSize, tLRPC$InputFileLocation, zArr);
                    if (zArr != null && zArr[0]) {
                        tLRPC$InputFileLocationArr[0] = new TLRPC$TL_inputDocumentFileLocation();
                        tLRPC$InputFileLocationArr[0].id = tLRPC$Document.id;
                        tLRPC$InputFileLocationArr[0].volume_id = tLRPC$InputFileLocation.volume_id;
                        tLRPC$InputFileLocationArr[0].local_id = tLRPC$InputFileLocation.local_id;
                        tLRPC$InputFileLocationArr[0].access_hash = tLRPC$Document.access_hash;
                        TLRPC$InputFileLocation tLRPC$InputFileLocation2 = tLRPC$InputFileLocationArr[0];
                        byte[] bArr = tLRPC$Document.file_reference;
                        tLRPC$InputFileLocation2.file_reference = bArr;
                        tLRPC$InputFileLocationArr[0].thumb_size = tLRPC$PhotoSize.type;
                        return bArr;
                    }
                    if (fileReference != null) {
                        return fileReference;
                    }
                }
            } else if (tLRPC$Document.id == tLRPC$InputFileLocation.id) {
                return tLRPC$Document.file_reference;
            }
        }
        return null;
    }

    private boolean getPeerReferenceReplacement(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, boolean z, TLRPC$InputFileLocation tLRPC$InputFileLocation, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr, boolean[] zArr) {
        TLRPC$InputPeer tLRPC$TL_inputPeerChat;
        TLRPC$InputPeer tLRPC$InputPeer;
        if (zArr == null || !zArr[0]) {
            return false;
        }
        TLRPC$TL_inputPeerPhotoFileLocation tLRPC$TL_inputPeerPhotoFileLocation = new TLRPC$TL_inputPeerPhotoFileLocation();
        long j = tLRPC$InputFileLocation.volume_id;
        tLRPC$TL_inputPeerPhotoFileLocation.id = j;
        tLRPC$TL_inputPeerPhotoFileLocation.volume_id = j;
        tLRPC$TL_inputPeerPhotoFileLocation.local_id = tLRPC$InputFileLocation.local_id;
        tLRPC$TL_inputPeerPhotoFileLocation.big = z;
        if (tLRPC$User != null) {
            tLRPC$InputPeer = new TLRPC$TL_inputPeerUser();
            tLRPC$InputPeer.user_id = tLRPC$User.id;
            tLRPC$InputPeer.access_hash = tLRPC$User.access_hash;
            tLRPC$TL_inputPeerPhotoFileLocation.photo_id = tLRPC$User.photo.photo_id;
        } else {
            if (ChatObject.isChannel(tLRPC$Chat)) {
                tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChannel();
                tLRPC$TL_inputPeerChat.channel_id = tLRPC$Chat.id;
                tLRPC$TL_inputPeerChat.access_hash = tLRPC$Chat.access_hash;
            } else {
                tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
                tLRPC$TL_inputPeerChat.chat_id = tLRPC$Chat.id;
            }
            tLRPC$TL_inputPeerPhotoFileLocation.photo_id = tLRPC$Chat.photo.photo_id;
            tLRPC$InputPeer = tLRPC$TL_inputPeerChat;
        }
        tLRPC$TL_inputPeerPhotoFileLocation.peer = tLRPC$InputPeer;
        tLRPC$InputFileLocationArr[0] = tLRPC$TL_inputPeerPhotoFileLocation;
        return true;
    }

    private byte[] getFileReference(TLRPC$User tLRPC$User, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr) {
        TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto;
        if (tLRPC$User == null || (tLRPC$UserProfilePhoto = tLRPC$User.photo) == null || !(tLRPC$InputFileLocation instanceof TLRPC$TL_inputFileLocation)) {
            return null;
        }
        byte[] fileReference = getFileReference(tLRPC$UserProfilePhoto.photo_small, tLRPC$InputFileLocation, zArr);
        if (getPeerReferenceReplacement(tLRPC$User, null, false, tLRPC$InputFileLocation, tLRPC$InputFileLocationArr, zArr)) {
            return new byte[0];
        }
        if (fileReference == null) {
            fileReference = getFileReference(tLRPC$User.photo.photo_big, tLRPC$InputFileLocation, zArr);
            if (getPeerReferenceReplacement(tLRPC$User, null, true, tLRPC$InputFileLocation, tLRPC$InputFileLocationArr, zArr)) {
                return new byte[0];
            }
        }
        return fileReference;
    }

    private byte[] getFileReference(TLRPC$Chat tLRPC$Chat, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr) {
        TLRPC$ChatPhoto tLRPC$ChatPhoto;
        byte[] bArr = null;
        if (tLRPC$Chat != null && (tLRPC$ChatPhoto = tLRPC$Chat.photo) != null && ((tLRPC$InputFileLocation instanceof TLRPC$TL_inputFileLocation) || (tLRPC$InputFileLocation instanceof TLRPC$TL_inputPeerPhotoFileLocation))) {
            if (tLRPC$InputFileLocation instanceof TLRPC$TL_inputPeerPhotoFileLocation) {
                zArr[0] = true;
                if (getPeerReferenceReplacement(null, tLRPC$Chat, false, tLRPC$InputFileLocation, tLRPC$InputFileLocationArr, zArr)) {
                    return new byte[0];
                }
                return null;
            }
            bArr = getFileReference(tLRPC$ChatPhoto.photo_small, tLRPC$InputFileLocation, zArr);
            if (getPeerReferenceReplacement(null, tLRPC$Chat, false, tLRPC$InputFileLocation, tLRPC$InputFileLocationArr, zArr)) {
                return new byte[0];
            }
            if (bArr == null) {
                bArr = getFileReference(tLRPC$Chat.photo.photo_big, tLRPC$InputFileLocation, zArr);
                if (getPeerReferenceReplacement(null, tLRPC$Chat, true, tLRPC$InputFileLocation, tLRPC$InputFileLocationArr, zArr)) {
                    return new byte[0];
                }
            }
        }
        return bArr;
    }

    private byte[] getFileReference(TLRPC$Photo tLRPC$Photo, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr) {
        if (tLRPC$Photo == null) {
            return null;
        }
        if (tLRPC$InputFileLocation instanceof TLRPC$TL_inputPhotoFileLocation) {
            if (tLRPC$Photo.id == tLRPC$InputFileLocation.id) {
                return tLRPC$Photo.file_reference;
            }
            return null;
        }
        if (tLRPC$InputFileLocation instanceof TLRPC$TL_inputFileLocation) {
            int size = tLRPC$Photo.sizes.size();
            for (int i = 0; i < size; i++) {
                TLRPC$PhotoSize tLRPC$PhotoSize = tLRPC$Photo.sizes.get(i);
                byte[] fileReference = getFileReference(tLRPC$PhotoSize, tLRPC$InputFileLocation, zArr);
                if (zArr != null && zArr[0]) {
                    tLRPC$InputFileLocationArr[0] = new TLRPC$TL_inputPhotoFileLocation();
                    tLRPC$InputFileLocationArr[0].id = tLRPC$Photo.id;
                    tLRPC$InputFileLocationArr[0].volume_id = tLRPC$InputFileLocation.volume_id;
                    tLRPC$InputFileLocationArr[0].local_id = tLRPC$InputFileLocation.local_id;
                    tLRPC$InputFileLocationArr[0].access_hash = tLRPC$Photo.access_hash;
                    TLRPC$InputFileLocation tLRPC$InputFileLocation2 = tLRPC$InputFileLocationArr[0];
                    byte[] bArr = tLRPC$Photo.file_reference;
                    tLRPC$InputFileLocation2.file_reference = bArr;
                    tLRPC$InputFileLocationArr[0].thumb_size = tLRPC$PhotoSize.type;
                    return bArr;
                }
                if (fileReference != null) {
                    return fileReference;
                }
            }
        }
        return null;
    }

    private byte[] getFileReference(TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr) {
        if (tLRPC$PhotoSize == null || !(tLRPC$InputFileLocation instanceof TLRPC$TL_inputFileLocation)) {
            return null;
        }
        return getFileReference(tLRPC$PhotoSize.location, tLRPC$InputFileLocation, zArr);
    }

    private byte[] getFileReference(TLRPC$FileLocation tLRPC$FileLocation, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr) {
        if (tLRPC$FileLocation == null || !(tLRPC$InputFileLocation instanceof TLRPC$TL_inputFileLocation) || tLRPC$FileLocation.local_id != tLRPC$InputFileLocation.local_id || tLRPC$FileLocation.volume_id != tLRPC$InputFileLocation.volume_id) {
            return null;
        }
        byte[] bArr = tLRPC$FileLocation.file_reference;
        if (bArr == null && zArr != null) {
            zArr[0] = true;
        }
        return bArr;
    }

    private byte[] getFileReference(TLRPC$WebPage tLRPC$WebPage, TLRPC$InputFileLocation tLRPC$InputFileLocation, boolean[] zArr, TLRPC$InputFileLocation[] tLRPC$InputFileLocationArr) {
        byte[] fileReference = getFileReference(tLRPC$WebPage.document, tLRPC$InputFileLocation, zArr, tLRPC$InputFileLocationArr);
        if (fileReference != null) {
            return fileReference;
        }
        byte[] fileReference2 = getFileReference(tLRPC$WebPage.photo, tLRPC$InputFileLocation, zArr, tLRPC$InputFileLocationArr);
        if (fileReference2 != null) {
            return fileReference2;
        }
        if (!tLRPC$WebPage.attributes.isEmpty()) {
            int size = tLRPC$WebPage.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC$WebPageAttribute tLRPC$WebPageAttribute = tLRPC$WebPage.attributes.get(i);
                if (tLRPC$WebPageAttribute instanceof TLRPC$TL_webPageAttributeTheme) {
                    TLRPC$TL_webPageAttributeTheme tLRPC$TL_webPageAttributeTheme = (TLRPC$TL_webPageAttributeTheme) tLRPC$WebPageAttribute;
                    int size2 = tLRPC$TL_webPageAttributeTheme.documents.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        byte[] fileReference3 = getFileReference(tLRPC$TL_webPageAttributeTheme.documents.get(i2), tLRPC$InputFileLocation, zArr, tLRPC$InputFileLocationArr);
                        if (fileReference3 != null) {
                            return fileReference3;
                        }
                    }
                }
            }
        }
        TLRPC$Page tLRPC$Page = tLRPC$WebPage.cached_page;
        if (tLRPC$Page == null) {
            return null;
        }
        int size3 = tLRPC$Page.documents.size();
        for (int i3 = 0; i3 < size3; i3++) {
            byte[] fileReference4 = getFileReference(tLRPC$WebPage.cached_page.documents.get(i3), tLRPC$InputFileLocation, zArr, tLRPC$InputFileLocationArr);
            if (fileReference4 != null) {
                return fileReference4;
            }
        }
        int size4 = tLRPC$WebPage.cached_page.photos.size();
        for (int i4 = 0; i4 < size4; i4++) {
            byte[] fileReference5 = getFileReference(tLRPC$WebPage.cached_page.photos.get(i4), tLRPC$InputFileLocation, zArr, tLRPC$InputFileLocationArr);
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
}
