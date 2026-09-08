package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.co;
import org.telegram.ui.om;
public class ChatMessagesMetadataController {
    final co chatActivity;
    private final ArrayList<MessageObject> reactionsToCheck = new ArrayList<>(10);
    private final ArrayList<MessageObject> extendedMediaToCheck = new ArrayList<>(10);
    private final ArrayList<MessageObject> storiesToCheck = new ArrayList<>(10);
    ArrayList<Integer> reactionsRequests = new ArrayList<>();
    ArrayList<Integer> extendedMediaRequests = new ArrayList<>();

    public ChatMessagesMetadataController(co coVar) {
        this.chatActivity = coVar;
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
        this.chatActivity.getMessagesController().getStoriesController().f3840k.j(arrayList);
    }

    public void lambda$loadStoriesForMessages$1(MessageObject messageObject, long j3, TL_stories.StoryItem storyItem) {
        boolean isExpiredStory = messageObject.isExpiredStory();
        bi.h9.b(this.chatActivity.getCurrentAccount(), j3, messageObject, storyItem);
        ArrayList arrayList = new ArrayList();
        messageObject.forceUpdate = true;
        arrayList.add(messageObject);
        this.chatActivity.getMessagesStorage().getStorageQueue().postRunnable(new d3(13, this, arrayList));
        if (!isExpiredStory && messageObject.isExpiredStory() && messageObject.type == 24) {
            this.chatActivity.tc(arrayList, true);
        } else {
            this.chatActivity.tc(arrayList, false);
        }
    }

    public void lambda$loadStoriesForMessages$2(int i10, MessageObject messageObject, long j3, TLObject tLObject, TLRPC.TL_error tL_error) {
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
            storyItem2.f20134id = i10;
            AndroidUtilities.runOnUIThread(new bi.x7(this, messageObject, j3, storyItem2, 7));
        }
    }

    private void loadStoriesForMessages(long j3, ArrayList<MessageObject> arrayList) {
        TL_stories.StoryItem storyItem;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                MessageObject messageObject = arrayList.get(i10);
                new TL_stories.TL_storyItem();
                int i11 = messageObject.type;
                if (i11 != 23 && i11 != 24) {
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
                long j10 = storyItem.dialogId;
                tL_stories_getStoriesByID.peer = this.chatActivity.getMessagesController().getInputPeer(j10);
                tL_stories_getStoriesByID.f20141id.add(Integer.valueOf(storyItem.f20134id));
                this.extendedMediaRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_stories_getStoriesByID, new bi.s7(this, storyItem.f20134id, messageObject, j10, 1))));
            }
            if (this.extendedMediaRequests.size() > 10) {
                this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(0).intValue(), false);
            }
        }
    }

    public void checkMessages(om omVar, int i10, int i11, long j3) {
        TL_stories.StoryItem storyItem;
        ArrayList L = omVar.L();
        if (!this.chatActivity.c() && i10 >= 0 && i11 >= 0) {
            int i12 = omVar.J;
            int i13 = (i11 - i12) - 10;
            int i14 = (i10 - i12) + 10;
            if (i13 < 0) {
                i13 = 0;
            }
            if (i14 > L.size()) {
                i14 = L.size();
            }
            this.reactionsToCheck.clear();
            this.extendedMediaToCheck.clear();
            this.storiesToCheck.clear();
            while (i13 < i14) {
                MessageObject messageObject = (MessageObject) L.get(i13);
                if (this.chatActivity.X3 != messageObject && messageObject.getId() > 0 && ((messageObject.messageOwner.action == null || messageObject.canSetReaction()) && j3 - messageObject.reactionsLastCheckTime > 15000)) {
                    messageObject.reactionsLastCheckTime = j3;
                    this.reactionsToCheck.add(messageObject);
                }
                if (this.chatActivity.X3 != messageObject && messageObject.getId() > 0 && ((messageObject.hasExtendedMediaPreview() || messageObject.hasPaidMediaPreview()) && j3 - messageObject.extendedMediaLastCheckTime > 30000)) {
                    messageObject.extendedMediaLastCheckTime = j3;
                    this.extendedMediaToCheck.add(messageObject);
                }
                int i15 = messageObject.type;
                if (i15 == 23 || i15 == 24 || messageObject.messageOwner.replyStory != null) {
                    if (i15 != 23 && i15 != 24) {
                        storyItem = messageObject.messageOwner.replyStory;
                    } else {
                        storyItem = messageObject.messageOwner.media.storyItem;
                    }
                    if (storyItem != null && !(storyItem instanceof TL_stories.TL_storyItemDeleted) && j3 - storyItem.lastUpdateTime > 300000) {
                        storyItem.lastUpdateTime = j3;
                        this.storiesToCheck.add(messageObject);
                    }
                }
                i13++;
            }
            loadReactionsForMessages(this.chatActivity.a(), this.reactionsToCheck);
            loadExtendedMediaForMessages(this.chatActivity.a(), this.extendedMediaToCheck);
            loadStoriesForMessages(this.chatActivity.a(), this.storiesToCheck);
        }
    }

    public void loadExtendedMediaForMessages(long j3, ArrayList<MessageObject> arrayList) {
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
            tL_messages_getExtendedMedia.peer = this.chatActivity.getMessagesController().getInputPeer(j3);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tL_messages_getExtendedMedia.f19985id.add(Integer.valueOf(arrayList.get(i10).getId()));
            }
            this.extendedMediaRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_messages_getExtendedMedia, new s0(this, 0))));
            if (this.extendedMediaRequests.size() > 10) {
                this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(0).intValue(), false);
            }
        }
    }

    public void loadReactionsForMessages(long j3, ArrayList<MessageObject> arrayList) {
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_getMessagesReactions tL_messages_getMessagesReactions = new TLRPC.TL_messages_getMessagesReactions();
            tL_messages_getMessagesReactions.peer = this.chatActivity.getMessagesController().getInputPeer(j3);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tL_messages_getMessagesReactions.f19991id.add(Integer.valueOf(arrayList.get(i10).getId()));
            }
            this.reactionsRequests.add(Integer.valueOf(this.chatActivity.getConnectionsManager().sendRequest(tL_messages_getMessagesReactions, new s0(this, 1))));
            if (this.reactionsRequests.size() > 5) {
                this.chatActivity.getConnectionsManager().cancelRequest(this.reactionsRequests.remove(0).intValue(), true);
            }
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
