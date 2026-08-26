package org.telegram.messenger;

import android.util.Pair;
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.DialogsSearchAdapter;

public final class FileLoadOperation$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final int f$3;
    public final TLObject f$4;

    public FileLoadOperation$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, int i2, TLObject tLObject, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((FileLoadOperation) this.f$0).lambda$startDownloadRequest$29((FileLoadOperation.RequestInfo) this.f$1, this.f$2, this.f$3, this.f$4, tLObject, tL_error);
                break;
            case 1:
                DialogsSearchAdapter dialogsSearchAdapter = (DialogsSearchAdapter) this.f$0;
                dialogsSearchAdapter.getClass();
                ArrayList arrayList = new ArrayList();
                String str = (String) this.f$1;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    LongSparseArray longSparseArray = new LongSparseArray();
                    LongSparseArray longSparseArray2 = new LongSparseArray();
                    for (int i = 0; i < messages_messages.chats.size(); i++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i);
                        longSparseArray.put(chat, chat.id);
                    }
                    for (int i2 = 0; i2 < messages_messages.users.size(); i2++) {
                        TLRPC.User user = messages_messages.users.get(i2);
                        longSparseArray2.put(user, user.id);
                    }
                    for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                        MessageObject messageObject = new MessageObject(dialogsSearchAdapter.currentAccount, messages_messages.messages.get(i3), longSparseArray2, longSparseArray, false, true);
                        arrayList.add(messageObject);
                        messageObject.setQuery(str);
                    }
                }
                HashSet hashSet = new HashSet();
                int i4 = dialogsSearchAdapter.currentAccount;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    for (int i5 = 0; i5 < messages_messages2.messages.size(); i5++) {
                        TLRPC.Message message = messages_messages2.messages.get(i5);
                        long dialogId = MessageObject.getDialogId(message);
                        if ((message.out ? MessagesController.getInstance(i4).dialogs_read_outbox_max : MessagesController.getInstance(i4).dialogs_read_inbox_max).get(Long.valueOf(dialogId)) == null) {
                            hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(dialogId)));
                        }
                    }
                }
                MediaDataController$$ExternalSyntheticLambda128 mediaDataController$$ExternalSyntheticLambda128 = new MediaDataController$$ExternalSyntheticLambda128(dialogsSearchAdapter, this.f$2, this.f$3, tL_error, str, tLObject, (TLRPC.TL_messages_searchGlobal) this.f$4, arrayList, 2);
                if (hashSet.isEmpty()) {
                    AndroidUtilities.runOnUIThread(mediaDataController$$ExternalSyntheticLambda128);
                } else {
                    MessagesStorage.getInstance(i4).getStorageQueue().postRunnable(new RemoteUtils$$ExternalSyntheticLambda2(dialogsSearchAdapter, hashSet, mediaDataController$$ExternalSyntheticLambda128, 13));
                }
                break;
            default:
                DialogsSearchAdapter dialogsSearchAdapter2 = (DialogsSearchAdapter) this.f$0;
                dialogsSearchAdapter2.getClass();
                ArrayList arrayList2 = new ArrayList();
                String str2 = (String) this.f$1;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    LongSparseArray longSparseArray3 = new LongSparseArray();
                    LongSparseArray longSparseArray4 = new LongSparseArray();
                    for (int i6 = 0; i6 < messages_messages3.chats.size(); i6++) {
                        TLRPC.Chat chat2 = messages_messages3.chats.get(i6);
                        longSparseArray3.put(chat2, chat2.id);
                    }
                    for (int i7 = 0; i7 < messages_messages3.users.size(); i7++) {
                        TLRPC.User user2 = messages_messages3.users.get(i7);
                        longSparseArray4.put(user2, user2.id);
                    }
                    for (int i8 = 0; i8 < messages_messages3.messages.size(); i8++) {
                        MessageObject messageObject2 = new MessageObject(dialogsSearchAdapter2.currentAccount, messages_messages3.messages.get(i8), longSparseArray4, longSparseArray3, false, true);
                        arrayList2.add(messageObject2);
                        messageObject2.setQuery(str2);
                    }
                }
                AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda128(dialogsSearchAdapter2, this.f$2, this.f$3, tL_error, str2, tLObject, (TLRPC.TL_messages_search) this.f$4, arrayList2, 1));
                break;
        }
    }
}
