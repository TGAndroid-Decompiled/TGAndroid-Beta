package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_getExtendedMedia;
import org.telegram.tgnet.TLRPC$TL_messages_getMessagesReactions;
import org.telegram.tgnet.TLRPC$TL_updateMessageReactions;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.ui.ChatActivity;
public class ChatMessagesMetadataController {
    final ChatActivity chatActivity;
    private ArrayList<MessageObject> reactionsToCheck = new ArrayList<>(10);
    private ArrayList<MessageObject> extendedMediaToCheck = new ArrayList<>(10);
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
            i4++;
        }
        loadReactionsForMessages(this.chatActivity.getDialogId(), this.reactionsToCheck);
        loadExtendedMediaForMessages(this.chatActivity.getDialogId(), this.extendedMediaToCheck);
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
                ChatMessagesMetadataController.this.lambda$loadReactionsForMessages$0(tLObject, tLRPC$TL_error);
            }
        })));
        if (this.reactionsRequests.size() > 5) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.reactionsRequests.remove(0).intValue(), false);
        }
    }

    public void lambda$loadReactionsForMessages$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                ChatMessagesMetadataController.this.lambda$loadExtendedMediaForMessages$1(tLObject, tLRPC$TL_error);
            }
        })));
        if (this.extendedMediaRequests.size() > 5) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(0).intValue(), false);
        }
    }

    public void lambda$loadExtendedMediaForMessages$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            this.chatActivity.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void onFragmentDestroy() {
        for (int i = 0; i < this.reactionsRequests.size(); i++) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.reactionsRequests.remove(i).intValue(), false);
        }
        this.reactionsRequests.clear();
        for (int i2 = 0; i2 < this.extendedMediaRequests.size(); i2++) {
            this.chatActivity.getConnectionsManager().cancelRequest(this.extendedMediaRequests.remove(i2).intValue(), false);
        }
        this.extendedMediaRequests.clear();
    }
}
