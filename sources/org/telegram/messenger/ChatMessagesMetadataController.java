package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.bm;
import org.telegram.ui.qn;
public class ChatMessagesMetadataController {
    final qn chatActivity;
    private final ArrayList<MessageObject> reactionsToCheck = new ArrayList<>(10);
    private final ArrayList<MessageObject> extendedMediaToCheck = new ArrayList<>(10);
    private final ArrayList<MessageObject> storiesToCheck = new ArrayList<>(10);
    ArrayList<Integer> reactionsRequests = new ArrayList<>();
    ArrayList<Integer> extendedMediaRequests = new ArrayList<>();

    public ChatMessagesMetadataController(qn qnVar) {
        this.chatActivity = qnVar;
    }

    public void lambda$loadExtendedMediaForMessages$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            this.chatActivity.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$loadReactionsForMessages$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            for (int i9 = 0; i9 < updates.updates.size(); i9++) {
                if (updates.updates.get(i9) instanceof TL_update.TL_updateMessageReactions) {
                    ((TL_update.TL_updateMessageReactions) updates.updates.get(i9)).updateUnreadState = false;
                }
            }
            this.chatActivity.getMessagesController().processUpdates(updates, false);
        }
    }

    public void lambda$loadStoriesForMessages$0(ArrayList arrayList) {
        this.chatActivity.getMessagesController().getStoriesController().f12244k.j(arrayList);
    }

    public void lambda$loadStoriesForMessages$1(MessageObject messageObject, long j10, TL_stories.StoryItem storyItem) {
        boolean isExpiredStory = messageObject.isExpiredStory();
        ih.i7.b(this.chatActivity.getCurrentAccount(), j10, messageObject, storyItem);
        ArrayList arrayList = new ArrayList();
        messageObject.forceUpdate = true;
        arrayList.add(messageObject);
        this.chatActivity.getMessagesStorage().getStorageQueue().postRunnable(new c3(13, this, arrayList));
        if (!isExpiredStory && messageObject.isExpiredStory() && messageObject.type == 24) {
            this.chatActivity.tc(arrayList, true);
        } else {
            this.chatActivity.tc(arrayList, false);
        }
    }

    public void lambda$loadStoriesForMessages$2(int i9, MessageObject messageObject, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stories.StoryItem storyItem;
        if (tLObject != null) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            if (tL_stories_stories.stories.size() > 0) {
                storyItem = tL_stories_stories.stories.get(0);
            } else {
                storyItem = null;
            }
            if (storyItem == null) {
                storyItem = new TL_stories.TL_storyItemDeleted();
            }
            TL_stories.StoryItem storyItem2 = storyItem;
            storyItem2.lastUpdateTime = System.currentTimeMillis();
            storyItem2.f22617id = i9;
            AndroidUtilities.runOnUIThread(new gh.e2(this, messageObject, j10, storyItem2, 13));
        }
    }

    private void loadStoriesForMessages(long j10, ArrayList<MessageObject> arrayList) {
        TL_stories.StoryItem storyItem;
        if (!arrayList.isEmpty()) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                MessageObject messageObject = arrayList.get(i9);
                new TL_stories.TL_storyItem();
                int i10 = messageObject.type;
                if (i10 != 23 && i10 != 24) {
                    TLRPC.Message message = messageObject.messageOwner;
                    TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                    if (messageReplyHeader != null) {
                        storyItem = message.replyStory;
                        storyItem.dialogId = DialogObject.getPeerDialogId(messageReplyHeader.peer);
                    }
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    TL_stories.StoryItem storyItem2 = messageMedia.storyItem;
                    storyItem2.dialogId = messageMedia.user_id;
                    storyItem = storyItem2;
                }
                long j11 = storyItem.dialogId;
                tL_stories_getStoriesByID.peer = this.chatActivity.getMessagesController().getInputPeer(j11);
                tL_stories_getStoriesByID.f22624id.add(Integer.valueOf(storyItem.f22617id));
                this.extendedMediaRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new gh.v(this, storyItem.f22617id, messageObject, j11, 3))));
            }
            if (this.extendedMediaRequests.size() > 10) {
                this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(0).intValue(), false);
            }
        }
    }

    public void checkMessages(bm bmVar, int i9, int i10, long j10) {
        TL_stories.StoryItem storyItem;
        ArrayList L = bmVar.L();
        if (!this.chatActivity.c() && i9 >= 0 && i10 >= 0) {
            int i11 = bmVar.F;
            int i12 = (i10 - i11) - 10;
            int i13 = (i9 - i11) + 10;
            if (i12 < 0) {
                i12 = 0;
            }
            if (i13 > L.size()) {
                i13 = L.size();
            }
            this.reactionsToCheck.clear();
            this.extendedMediaToCheck.clear();
            this.storiesToCheck.clear();
            while (i12 < i13) {
                MessageObject messageObject = (MessageObject) L.get(i12);
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
                    if (i14 != 23 && i14 != 24) {
                        storyItem = messageObject.messageOwner.replyStory;
                    } else {
                        storyItem = messageObject.messageOwner.media.storyItem;
                    }
                    if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemDeleted) && j10 - storyItem.lastUpdateTime > 300000) {
                        storyItem.lastUpdateTime = j10;
                        this.storiesToCheck.add(messageObject);
                    }
                }
                i12++;
            }
            loadReactionsForMessages(this.chatActivity.a(), this.reactionsToCheck);
            loadExtendedMediaForMessages(this.chatActivity.a(), this.extendedMediaToCheck);
            loadStoriesForMessages(this.chatActivity.a(), this.storiesToCheck);
        }
    }

    public void loadExtendedMediaForMessages(long j10, ArrayList<MessageObject> arrayList) {
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
            tL_messages_getExtendedMedia.peer = this.chatActivity.getMessagesController().getInputPeer(j10);
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                tL_messages_getExtendedMedia.f22469id.add(Integer.valueOf(arrayList.get(i9).getId()));
            }
            this.extendedMediaRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new t0(this, 0))));
            if (this.extendedMediaRequests.size() > 10) {
                this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(0).intValue(), false);
            }
        }
    }

    public void loadReactionsForMessages(long j10, ArrayList<MessageObject> arrayList) {
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
            tL_messages_getMessagesReactions.peer = this.chatActivity.getMessagesController().getInputPeer(j10);
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                tL_messages_getMessagesReactions.f22475id.add(Integer.valueOf(arrayList.get(i9).getId()));
            }
            this.reactionsRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new t0(this, 1))));
            if (this.reactionsRequests.size() > 5) {
                this.chatActivity.getConnectionsManager().cancelRequest(this.reactionsRequests.remove(0).intValue(), true);
            }
        }
    }

    public void onFragmentDestroy() {
        for (int i9 = 0; i9 < this.reactionsRequests.size(); i9++) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.reactionsRequests.get(i9).intValue(), false);
        }
        this.reactionsRequests.clear();
        for (int i10 = 0; i10 < this.extendedMediaRequests.size(); i10++) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.get(i10).intValue(), false);
        }
        this.extendedMediaRequests.clear();
    }
}
