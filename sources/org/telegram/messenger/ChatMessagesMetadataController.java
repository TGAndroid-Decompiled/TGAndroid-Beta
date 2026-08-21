package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Stories.StoriesStorage;

public class ChatMessagesMetadataController {
    final ChatActivity chatActivity;
    private final ArrayList<MessageObject> reactionsToCheck = new ArrayList<>(10);
    private final ArrayList<MessageObject> extendedMediaToCheck = new ArrayList<>(10);
    private final ArrayList<MessageObject> storiesToCheck = new ArrayList<>(10);
    ArrayList<Integer> reactionsRequests = new ArrayList<>();
    ArrayList<Integer> extendedMediaRequests = new ArrayList<>();

    public ChatMessagesMetadataController(ChatActivity chatActivity) {
        this.chatActivity = chatActivity;
    }

    public void checkMessages(ChatActivity.ChatActivityAdapter chatActivityAdapter, int i, int i2, long j) {
        ArrayList messages = chatActivityAdapter.getMessages();
        if (this.chatActivity.isInScheduleMode() || i < 0 || i2 < 0) {
            return;
        }
        int i3 = chatActivityAdapter.messagesStartRow;
        int i4 = (i2 - i3) - 10;
        int size = (i - i3) + 10;
        if (i4 < 0) {
            i4 = 0;
        }
        if (size > messages.size()) {
            size = messages.size();
        }
        this.reactionsToCheck.clear();
        this.extendedMediaToCheck.clear();
        this.storiesToCheck.clear();
        while (i4 < size) {
            MessageObject messageObject = (MessageObject) messages.get(i4);
            if (this.chatActivity.getThreadMessage() != messageObject && messageObject.getId() > 0 && ((messageObject.messageOwner.action == null || messageObject.canSetReaction()) && j - messageObject.reactionsLastCheckTime > 15000)) {
                messageObject.reactionsLastCheckTime = j;
                this.reactionsToCheck.add(messageObject);
            }
            if (this.chatActivity.getThreadMessage() != messageObject && messageObject.getId() > 0 && ((messageObject.hasExtendedMediaPreview() || messageObject.hasPaidMediaPreview()) && j - messageObject.extendedMediaLastCheckTime > 30000)) {
                messageObject.extendedMediaLastCheckTime = j;
                this.extendedMediaToCheck.add(messageObject);
            }
            int i5 = messageObject.type;
            if (i5 == 23 || i5 == 24 || messageObject.messageOwner.replyStory != null) {
                TL_stories.StoryItem storyItem = (i5 == 23 || i5 == 24) ? messageObject.messageOwner.media.storyItem : messageObject.messageOwner.replyStory;
                if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemDeleted) && j - storyItem.lastUpdateTime > 300000) {
                    storyItem.lastUpdateTime = j;
                    this.storiesToCheck.add(messageObject);
                }
            }
            i4++;
        }
        loadReactionsForMessages(this.chatActivity.getDialogId(), this.reactionsToCheck);
        loadExtendedMediaForMessages(this.chatActivity.getDialogId(), this.extendedMediaToCheck);
        loadStoriesForMessages(this.chatActivity.getDialogId(), this.storiesToCheck);
    }

    private void loadStoriesForMessages(long j, ArrayList<MessageObject> arrayList) {
        TL_stories.StoryItem storyItem;
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            final MessageObject messageObject = arrayList.get(i);
            new TL_stories.TL_storyItem();
            int i2 = messageObject.type;
            if (i2 == 23 || i2 == 24) {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                TL_stories.StoryItem storyItem2 = messageMedia.storyItem;
                storyItem2.dialogId = messageMedia.user_id;
                storyItem = storyItem2;
            } else {
                TLRPC.Message message = messageObject.messageOwner;
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader != null) {
                    storyItem = message.replyStory;
                    storyItem.dialogId = DialogObject.getPeerDialogId(messageReplyHeader.peer);
                }
            }
            final long j2 = storyItem.dialogId;
            tL_stories_getStoriesByID.peer = this.chatActivity.getMessagesController().getInputPeer(j2);
            tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
            final int i3 = storyItem.id;
            this.extendedMediaRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChatMessagesMetadataController.$r8$lambda$gBMPgfVvbMyor0kZPTdBTkf916Y(this.f$0, i3, messageObject, j2, tLObject, tL_error);
                }
            })));
        }
        if (this.extendedMediaRequests.size() > 10) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(0).intValue(), false);
        }
    }

    public static void $r8$lambda$gBMPgfVvbMyor0kZPTdBTkf916Y(final ChatMessagesMetadataController chatMessagesMetadataController, int i, final MessageObject messageObject, final long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        chatMessagesMetadataController.getClass();
        if (tLObject != null) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            TL_stories.StoryItem tL_storyItemDeleted = tL_stories_stories.stories.size() > 0 ? tL_stories_stories.stories.get(0) : null;
            if (tL_storyItemDeleted == null) {
                tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
            }
            final TL_stories.StoryItem storyItem = tL_storyItemDeleted;
            storyItem.lastUpdateTime = System.currentTimeMillis();
            storyItem.id = i;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatMessagesMetadataController.$r8$lambda$NMt7yqqhKoev3YOznq0ba2GPiAQ(this.f$0, messageObject, j, storyItem);
                }
            });
        }
    }

    public static void $r8$lambda$NMt7yqqhKoev3YOznq0ba2GPiAQ(final ChatMessagesMetadataController chatMessagesMetadataController, MessageObject messageObject, long j, TL_stories.StoryItem storyItem) {
        chatMessagesMetadataController.getClass();
        boolean zIsExpiredStory = messageObject.isExpiredStory();
        StoriesStorage.applyStory(chatMessagesMetadataController.chatActivity.getCurrentAccount(), j, messageObject, storyItem);
        final ArrayList arrayList = new ArrayList();
        messageObject.forceUpdate = true;
        arrayList.add(messageObject);
        chatMessagesMetadataController.chatActivity.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.chatActivity.getMessagesController().getStoriesController().getStoriesStorage().updateMessagesWithStories(arrayList);
            }
        });
        if (!zIsExpiredStory && messageObject.isExpiredStory() && messageObject.type == 24) {
            chatMessagesMetadataController.chatActivity.updateMessages(arrayList, true);
        } else {
            chatMessagesMetadataController.chatActivity.updateMessages(arrayList, false);
        }
    }

    public void loadReactionsForMessages(long j, ArrayList<MessageObject> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
        tL_messages_getMessagesReactions.peer = this.chatActivity.getMessagesController().getInputPeer(j);
        for (int i = 0; i < arrayList.size(); i++) {
            tL_messages_getMessagesReactions.id.add(Integer.valueOf(arrayList.get(i).getId()));
        }
        this.reactionsRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatMessagesMetadataController.m377$r8$lambda$xbfr_rJ_Vv3SlLBtnioI0_HMa8(this.f$0, tLObject, tL_error);
            }
        })));
        if (this.reactionsRequests.size() > 5) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.reactionsRequests.remove(0).intValue(), true);
        }
    }

    public static void m377$r8$lambda$xbfr_rJ_Vv3SlLBtnioI0_HMa8(ChatMessagesMetadataController chatMessagesMetadataController, TLObject tLObject, TLRPC.TL_error tL_error) {
        chatMessagesMetadataController.getClass();
        if (tL_error == null) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            for (int i = 0; i < updates.updates.size(); i++) {
                if (updates.updates.get(i) instanceof TL_update.TL_updateMessageReactions) {
                    ((TL_update.TL_updateMessageReactions) updates.updates.get(i)).updateUnreadState = false;
                }
            }
            chatMessagesMetadataController.chatActivity.getMessagesController().processUpdates(updates, false);
        }
    }

    public void loadExtendedMediaForMessages(long j, ArrayList<MessageObject> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
        tL_messages_getExtendedMedia.peer = this.chatActivity.getMessagesController().getInputPeer(j);
        for (int i = 0; i < arrayList.size(); i++) {
            tL_messages_getExtendedMedia.id.add(Integer.valueOf(arrayList.get(i).getId()));
        }
        this.extendedMediaRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChatMessagesMetadataController.$r8$lambda$oTLsHhIz8bp2ojpwkYylDNogmfE(this.f$0, tLObject, tL_error);
            }
        })));
        if (this.extendedMediaRequests.size() > 10) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(0).intValue(), false);
        }
    }

    public static void $r8$lambda$oTLsHhIz8bp2ojpwkYylDNogmfE(ChatMessagesMetadataController chatMessagesMetadataController, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            chatMessagesMetadataController.chatActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        } else {
            chatMessagesMetadataController.getClass();
        }
    }

    public void onFragmentDestroy() {
        for (int i = 0; i < this.reactionsRequests.size(); i++) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.reactionsRequests.get(i).intValue(), false);
        }
        this.reactionsRequests.clear();
        for (int i2 = 0; i2 < this.extendedMediaRequests.size(); i2++) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.get(i2).intValue(), false);
        }
        this.extendedMediaRequests.clear();
    }
}
