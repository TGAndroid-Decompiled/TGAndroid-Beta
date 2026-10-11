package gg;

import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q implements RequestDelegate {
    public final int f10768a;
    public final Object f10769b;
    public final Object f10770c;
    public final int d;
    public final int f10771e;
    public final TLObject f10772f;

    public q(Object obj, Object obj2, int i10, int i11, TLObject tLObject, int i12) {
        this.f10768a = i12;
        this.f10769b = obj;
        this.f10770c = obj2;
        this.d = i10;
        this.f10771e = i11;
        this.f10772f = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        switch (this.f10768a) {
            case 0:
                h0 h0Var = (h0) this.f10769b;
                String str = (String) this.f10770c;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f10772f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.i iVar = new a0.i();
                    a0.i iVar2 = new a0.i();
                    int i10 = 0;
                    for (int i11 = 0; i11 < messages_messages.chats.size(); i11++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i11);
                        iVar.k(chat, chat.f20032id);
                    }
                    for (int i12 = 0; i12 < messages_messages.users.size(); i12++) {
                        TLRPC.User user = messages_messages.users.get(i12);
                        iVar2.k(user, user.f20179id);
                    }
                    while (i10 < messages_messages.messages.size()) {
                        a0.i iVar3 = iVar;
                        MessageObject messageObject = new MessageObject(h0Var.f10637s0, messages_messages.messages.get(i10), iVar2, iVar3, false, true);
                        arrayList.add(messageObject);
                        messageObject.setQuery(str);
                        i10++;
                        iVar = iVar3;
                    }
                }
                AndroidUtilities.runOnUIThread(new s(h0Var, this.d, this.f10771e, tL_error, str, tLObject, tL_messages_search, arrayList, 0));
                return;
            case 1:
                h0 h0Var2 = (h0) this.f10769b;
                String str2 = (String) this.f10770c;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f10772f;
                int i13 = h0Var2.f10637s0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.i iVar4 = new a0.i();
                    a0.i iVar5 = new a0.i();
                    for (int i14 = 0; i14 < messages_messages2.chats.size(); i14++) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i14);
                        iVar4.k(chat2, chat2.f20032id);
                    }
                    for (int i15 = 0; i15 < messages_messages2.users.size(); i15++) {
                        TLRPC.User user2 = messages_messages2.users.get(i15);
                        iVar5.k(user2, user2.f20179id);
                    }
                    int i16 = 0;
                    while (i16 < messages_messages2.messages.size()) {
                        a0.i iVar6 = iVar4;
                        MessageObject messageObject2 = new MessageObject(h0Var2.f10637s0, messages_messages2.messages.get(i16), iVar5, iVar6, false, true);
                        arrayList2.add(messageObject2);
                        messageObject2.setQuery(str2);
                        i16++;
                        iVar4 = iVar6;
                    }
                }
                HashSet hashSet = new HashSet();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    for (int i17 = 0; i17 < messages_messages3.messages.size(); i17++) {
                        TLRPC.Message message = messages_messages3.messages.get(i17);
                        long dialogId = MessageObject.getDialogId(message);
                        if (message.out) {
                            concurrentHashMap = MessagesController.getInstance(i13).dialogs_read_outbox_max;
                        } else {
                            concurrentHashMap = MessagesController.getInstance(i13).dialogs_read_inbox_max;
                        }
                        if (concurrentHashMap.get(Long.valueOf(dialogId)) == null) {
                            hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(dialogId)));
                        }
                    }
                }
                s sVar = new s(h0Var2, this.d, this.f10771e, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, 1);
                if (hashSet.isEmpty()) {
                    AndroidUtilities.runOnUIThread(sVar);
                    return;
                } else {
                    MessagesStorage.getInstance(i13).getStorageQueue().postRunnable(new t(h0Var2, hashSet, sVar, 0));
                    return;
                }
            default:
                ((FileLoadOperation) this.f10769b).lambda$startDownloadRequest$30((FileLoadOperation.RequestInfo) this.f10770c, this.d, this.f10771e, this.f10772f, tLObject, tL_error);
                return;
        }
    }
}
