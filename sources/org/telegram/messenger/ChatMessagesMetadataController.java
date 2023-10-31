package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$MessageReplyHeader;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_getExtendedMedia;
import org.telegram.tgnet.TLRPC$TL_messages_getMessagesReactions;
import org.telegram.tgnet.TLRPC$TL_updateMessageReactions;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.tgnet.tl.TL_stories$TL_stories_getStoriesByID;
import org.telegram.tgnet.tl.TL_stories$TL_stories_stories;
import org.telegram.tgnet.tl.TL_stories$TL_storyItem;
import org.telegram.tgnet.tl.TL_stories$TL_storyItemDeleted;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Stories.StoriesStorage;
public class ChatMessagesMetadataController {
    final ChatActivity chatActivity;
    private ArrayList<MessageObject> reactionsToCheck = new ArrayList<>(10);
    private ArrayList<MessageObject> extendedMediaToCheck = new ArrayList<>(10);
    private ArrayList<MessageObject> storiesToCheck = new ArrayList<>(10);
    ArrayList<Integer> reactionsRequests = new ArrayList<>();
    ArrayList<Integer> extendedMediaRequests = new ArrayList<>();

    public ChatMessagesMetadataController(ChatActivity chatActivity) {
        this.chatActivity = chatActivity;
    }

    public void checkMessages(ChatActivity.ChatActivityAdapter chatActivityAdapter, int i, int i2, long j) {
        ChatActivity chatActivity = this.chatActivity;
        ArrayList<MessageObject> arrayList = chatActivity.messages;
        if (chatActivity.isInScheduleMode() || i < 0 || i2 < 0) {
            return;
        }
        int i3 = chatActivityAdapter.messagesStartRow;
        int i4 = (i2 - i3) - 10;
        int i5 = (i - i3) + 10;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 > arrayList.size()) {
            i5 = arrayList.size();
        }
        this.reactionsToCheck.clear();
        this.extendedMediaToCheck.clear();
        this.storiesToCheck.clear();
        while (i4 < i5) {
            MessageObject messageObject = arrayList.get(i4);
            if (this.chatActivity.getThreadMessage() != messageObject && messageObject.getId() > 0 && messageObject.messageOwner.action == null && j - messageObject.reactionsLastCheckTime > 15000) {
                messageObject.reactionsLastCheckTime = j;
                this.reactionsToCheck.add(messageObject);
            }
            if (this.chatActivity.getThreadMessage() != messageObject && messageObject.getId() > 0 && messageObject.hasExtendedMediaPreview() && j - messageObject.extendedMediaLastCheckTime > 30000) {
                messageObject.extendedMediaLastCheckTime = j;
                this.extendedMediaToCheck.add(messageObject);
            }
            int i6 = messageObject.type;
            if (i6 == 23 || i6 == 24 || messageObject.messageOwner.replyStory != null) {
                TL_stories$StoryItem tL_stories$StoryItem = (i6 == 23 || i6 == 24) ? messageObject.messageOwner.media.storyItem : messageObject.messageOwner.replyStory;
                if (tL_stories$StoryItem != null && !(tL_stories$StoryItem instanceof TL_stories$TL_storyItemDeleted) && j - tL_stories$StoryItem.lastUpdateTime > 300000) {
                    tL_stories$StoryItem.lastUpdateTime = j;
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
        TL_stories$StoryItem tL_stories$StoryItem;
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories$TL_stories_getStoriesByID tL_stories$TL_stories_getStoriesByID = new TL_stories$TL_stories_getStoriesByID();
            final MessageObject messageObject = arrayList.get(i);
            new TL_stories$TL_storyItem();
            int i2 = messageObject.type;
            if (i2 == 23 || i2 == 24) {
                TLRPC$MessageMedia tLRPC$MessageMedia = messageObject.messageOwner.media;
                TL_stories$StoryItem tL_stories$StoryItem2 = tLRPC$MessageMedia.storyItem;
                tL_stories$StoryItem2.dialogId = tLRPC$MessageMedia.user_id;
                tL_stories$StoryItem = tL_stories$StoryItem2;
            } else {
                TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader = tLRPC$Message.reply_to;
                if (tLRPC$MessageReplyHeader != null) {
                    tL_stories$StoryItem = tLRPC$Message.replyStory;
                    tL_stories$StoryItem.dialogId = tLRPC$MessageReplyHeader.user_id;
                }
            }
            final long j2 = tL_stories$StoryItem.dialogId;
            tL_stories$TL_stories_getStoriesByID.peer = this.chatActivity.getMessagesController().getInputPeer(j2);
            tL_stories$TL_stories_getStoriesByID.id.add(Integer.valueOf(tL_stories$StoryItem.id));
            final int i3 = tL_stories$StoryItem.id;
            this.extendedMediaRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_stories$TL_stories_getStoriesByID, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatMessagesMetadataController.this.lambda$loadStoriesForMessages$2(i3, messageObject, j2, tLObject, tLRPC$TL_error);
                }
            })));
        }
        if (this.extendedMediaRequests.size() > 10) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(0).intValue(), false);
        }
    }

    public void lambda$loadStoriesForMessages$2(int i, final MessageObject messageObject, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TL_stories$TL_stories_stories tL_stories$TL_stories_stories = (TL_stories$TL_stories_stories) tLObject;
            TL_stories$StoryItem tL_stories$StoryItem = tL_stories$TL_stories_stories.stories.size() > 0 ? tL_stories$TL_stories_stories.stories.get(0) : null;
            if (tL_stories$StoryItem == null) {
                tL_stories$StoryItem = new TL_stories$TL_storyItemDeleted();
            }
            final TL_stories$StoryItem tL_stories$StoryItem2 = tL_stories$StoryItem;
            tL_stories$StoryItem2.lastUpdateTime = System.currentTimeMillis();
            tL_stories$StoryItem2.id = i;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatMessagesMetadataController.this.lambda$loadStoriesForMessages$1(messageObject, j, tL_stories$StoryItem2);
                }
            });
        }
    }

    public void lambda$loadStoriesForMessages$1(MessageObject messageObject, long j, TL_stories$StoryItem tL_stories$StoryItem) {
        boolean isExpiredStory = messageObject.isExpiredStory();
        StoriesStorage.applyStory(this.chatActivity.getCurrentAccount(), j, messageObject, tL_stories$StoryItem);
        final ArrayList<MessageObject> arrayList = new ArrayList<>();
        messageObject.forceUpdate = true;
        arrayList.add(messageObject);
        this.chatActivity.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                ChatMessagesMetadataController.this.lambda$loadStoriesForMessages$0(arrayList);
            }
        });
        if (!isExpiredStory && messageObject.isExpiredStory() && messageObject.type == 24) {
            this.chatActivity.updateMessages(arrayList, true);
        } else {
            this.chatActivity.updateMessages(arrayList, false);
        }
    }

    public void lambda$loadStoriesForMessages$0(ArrayList arrayList) {
        this.chatActivity.getMessagesController().getStoriesController().getStoriesStorage().lambda$fillMessagesWithStories$13(arrayList);
    }

    public void loadReactionsForMessages(long j, ArrayList<MessageObject> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC$TL_messages_getMessagesReactions tLRPC$TL_messages_getMessagesReactions = new TLRPC$TL_messages_getMessagesReactions();
        tLRPC$TL_messages_getMessagesReactions.peer = this.chatActivity.getMessagesController().getInputPeer(j);
        for (int i = 0; i < arrayList.size(); i++) {
            tLRPC$TL_messages_getMessagesReactions.id.add(Integer.valueOf(arrayList.get(i).getId()));
        }
        this.reactionsRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessagesReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChatMessagesMetadataController.this.lambda$loadReactionsForMessages$3(tLObject, tLRPC$TL_error);
            }
        })));
        if (this.reactionsRequests.size() > 5) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.reactionsRequests.remove(0).intValue(), true);
        }
    }

    public void lambda$loadReactionsForMessages$3(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
            for (int i = 0; i < tLRPC$Updates.updates.size(); i++) {
                if (tLRPC$Updates.updates.get(i) instanceof TLRPC$TL_updateMessageReactions) {
                    ((TLRPC$TL_updateMessageReactions) tLRPC$Updates.updates.get(i)).updateUnreadState = false;
                }
            }
            this.chatActivity.getMessagesController().processUpdates(tLRPC$Updates, false);
        }
    }

    public void loadExtendedMediaForMessages(long j, ArrayList<MessageObject> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC$TL_messages_getExtendedMedia tLRPC$TL_messages_getExtendedMedia = new TLRPC$TL_messages_getExtendedMedia();
        tLRPC$TL_messages_getExtendedMedia.peer = this.chatActivity.getMessagesController().getInputPeer(j);
        for (int i = 0; i < arrayList.size(); i++) {
            tLRPC$TL_messages_getExtendedMedia.id.add(Integer.valueOf(arrayList.get(i).getId()));
        }
        this.extendedMediaRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tLRPC$TL_messages_getExtendedMedia, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ChatMessagesMetadataController.this.lambda$loadExtendedMediaForMessages$4(tLObject, tLRPC$TL_error);
            }
        })));
        if (this.extendedMediaRequests.size() > 10) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(0).intValue(), false);
        }
    }

    public void lambda$loadExtendedMediaForMessages$4(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            this.chatActivity.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
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
