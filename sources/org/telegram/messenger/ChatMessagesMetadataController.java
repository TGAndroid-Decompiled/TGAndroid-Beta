package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.dm;
import org.telegram.ui.rn;

public class ChatMessagesMetadataController {
    final rn chatActivity;
    private final ArrayList<MessageObject> reactionsToCheck = new ArrayList<>(10);
    private final ArrayList<MessageObject> extendedMediaToCheck = new ArrayList<>(10);
    private final ArrayList<MessageObject> storiesToCheck = new ArrayList<>(10);
    ArrayList<Integer> reactionsRequests = new ArrayList<>();
    ArrayList<Integer> extendedMediaRequests = new ArrayList<>();

    public ChatMessagesMetadataController(rn rnVar) {
        this.chatActivity = rnVar;
    }

    public void lambda$loadExtendedMediaForMessages$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            this.chatActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$loadReactionsForMessages$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                if (updates.updates.get(i10) instanceof TL_update.TL_updateMessageReactions) {
                    ((TL_update.TL_updateMessageReactions) updates.updates.get(i10)).updateUnreadState = false;
                }
            }
            this.chatActivity.getMessagesController().processUpdates(updates, false);
        }
    }

    public void lambda$loadStoriesForMessages$0(ArrayList arrayList) {
        this.chatActivity.getMessagesController().getStoriesController().f13963k.j(arrayList);
    }

    public void lambda$loadStoriesForMessages$1(MessageObject messageObject, long j10, TL_stories.StoryItem storyItem) {
        boolean zIsExpiredStory = messageObject.isExpiredStory();
        jh.f7.b(this.chatActivity.getCurrentAccount(), j10, messageObject, storyItem);
        ArrayList arrayList = new ArrayList();
        messageObject.forceUpdate = true;
        arrayList.add(messageObject);
        this.chatActivity.getMessagesStorage().getStorageQueue().postRunnable(new e3(13, this, arrayList));
        if (!zIsExpiredStory && messageObject.isExpiredStory() && messageObject.type == 24) {
            this.chatActivity.tc(arrayList, true);
        } else {
            this.chatActivity.tc(arrayList, false);
        }
    }

    public void lambda$loadStoriesForMessages$2(int i10, MessageObject messageObject, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            TL_stories.StoryItem tL_storyItemDeleted = tL_stories_stories.stories.size() > 0 ? tL_stories_stories.stories.get(0) : null;
            if (tL_storyItemDeleted == null) {
                tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
            }
            TL_stories.StoryItem storyItem = tL_storyItemDeleted;
            storyItem.lastUpdateTime = System.currentTimeMillis();
            storyItem.f22617id = i10;
            AndroidUtilities.runOnUIThread(new hh.e2(this, messageObject, j10, storyItem, 13));
        }
    }

    private void loadStoriesForMessages(long j10, ArrayList<MessageObject> arrayList) {
        TL_stories.StoryItem storyItem;
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            MessageObject messageObject = arrayList.get(i10);
            new TL_stories.TL_storyItem();
            int i11 = messageObject.type;
            if (i11 == 23 || i11 == 24) {
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
            long j11 = storyItem.dialogId;
            tL_stories_getStoriesByID.peer = this.chatActivity.getMessagesController().getInputPeer(j11);
            tL_stories_getStoriesByID.f22624id.add(Integer.valueOf(storyItem.f22617id));
            this.extendedMediaRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new hh.v(this, storyItem.f22617id, messageObject, j11, 3))));
        }
        if (this.extendedMediaRequests.size() > 10) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(0).intValue(), false);
        }
    }

    public void checkMessages(dm dmVar, int i10, int i11, long j10) {
        ArrayList arrayListL = dmVar.L();
        if (this.chatActivity.c() || i10 < 0 || i11 < 0) {
            return;
        }
        int i12 = dmVar.F;
        int i13 = (i11 - i12) - 10;
        int size = (i10 - i12) + 10;
        if (i13 < 0) {
            i13 = 0;
        }
        if (size > arrayListL.size()) {
            size = arrayListL.size();
        }
        this.reactionsToCheck.clear();
        this.extendedMediaToCheck.clear();
        this.storiesToCheck.clear();
        while (i13 < size) {
            MessageObject messageObject = (MessageObject) arrayListL.get(i13);
            if (this.chatActivity.T3 != messageObject && messageObject.getId() > 0 && ((messageObject.messageOwner.action == null || messageObject.canSetReaction()) && j10 - messageObject.reactionsLastCheckTime > 15000)) {
                messageObject.reactionsLastCheckTime = j10;
                this.reactionsToCheck.add(messageObject);
            }
            if (this.chatActivity.T3 != messageObject && messageObject.getId() > 0 && ((messageObject.hasExtendedMediaPreview() || messageObject.hasPaidMediaPreview()) && j10 - messageObject.extendedMediaLastCheckTime > 30000)) {
                messageObject.extendedMediaLastCheckTime = j10;
                this.extendedMediaToCheck.add(messageObject);
            }
            int i14 = messageObject.type;
            if (i14 == 23 || i14 == 24 || messageObject.messageOwner.replyStory != null) {
                TL_stories.StoryItem storyItem = (i14 == 23 || i14 == 24) ? messageObject.messageOwner.media.storyItem : messageObject.messageOwner.replyStory;
                if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemDeleted) && j10 - storyItem.lastUpdateTime > 300000) {
                    storyItem.lastUpdateTime = j10;
                    this.storiesToCheck.add(messageObject);
                }
            }
            i13++;
        }
        loadReactionsForMessages(this.chatActivity.a(), this.reactionsToCheck);
        loadExtendedMediaForMessages(this.chatActivity.a(), this.extendedMediaToCheck);
        loadStoriesForMessages(this.chatActivity.a(), this.storiesToCheck);
    }

    public void loadExtendedMediaForMessages(long j10, ArrayList<MessageObject> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
        tL_messages_getExtendedMedia.peer = this.chatActivity.getMessagesController().getInputPeer(j10);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            tL_messages_getExtendedMedia.f22469id.add(Integer.valueOf(arrayList.get(i10).getId()));
        }
        this.extendedMediaRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new s0(this, 0))));
        if (this.extendedMediaRequests.size() > 10) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(0).intValue(), false);
        }
    }

    public void loadReactionsForMessages(long j10, ArrayList<MessageObject> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
        tL_messages_getMessagesReactions.peer = this.chatActivity.getMessagesController().getInputPeer(j10);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            tL_messages_getMessagesReactions.f22475id.add(Integer.valueOf(arrayList.get(i10).getId()));
        }
        this.reactionsRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new s0(this, 1))));
        if (this.reactionsRequests.size() > 5) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.reactionsRequests.remove(0).intValue(), true);
        }
    }

    public void onFragmentDestroy() {
        for (int i10 = 0; i10 < this.reactionsRequests.size(); i10++) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.reactionsRequests.get(i10).intValue(), false);
        }
        this.reactionsRequests.clear();
        for (int i11 = 0; i11 < this.extendedMediaRequests.size(); i11++) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.get(i11).intValue(), false);
        }
        this.extendedMediaRequests.clear();
    }
}
