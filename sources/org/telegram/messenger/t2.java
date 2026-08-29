package org.telegram.messenger;

import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yw0;
public final class t2 implements RequestDelegate {
    public final int f21602a;
    public final int f21603b;
    public final int f21604c;
    public final Object d;
    public final Object f21605e;
    public final TLObject f21606f;

    public t2(Object obj, Object obj2, int i10, int i11, TLObject tLObject, int i12) {
        this.f21602a = i12;
        this.d = obj;
        this.f21605e = obj2;
        this.f21603b = i10;
        this.f21604c = i11;
        this.f21606f = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        switch (this.f21602a) {
            case 0:
                ((FileLoadOperation) this.d).lambda$startDownloadRequest$29((FileLoadOperation.RequestInfo) this.f21605e, this.f21603b, this.f21604c, this.f21606f, tLObject, tL_error);
                return;
            case 1:
                rf.a0 a0Var = (rf.a0) this.d;
                String str = (String) this.f21605e;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f21606f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i10 = 0; i10 < messages_messages.chats.size(); i10++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i10);
                        hVar.k(chat, chat.f22392id);
                    }
                    for (int i11 = 0; i11 < messages_messages.users.size(); i11++) {
                        TLRPC.User user = messages_messages.users.get(i11);
                        hVar2.k(user, user.f22539id);
                    }
                    for (int i12 = 0; i12 < messages_messages.messages.size(); i12++) {
                        MessageObject messageObject = new MessageObject(a0Var.f47155o0, messages_messages.messages.get(i12), hVar2, hVar, false, true);
                        arrayList.add(messageObject);
                        messageObject.setQuery(str);
                    }
                }
                AndroidUtilities.runOnUIThread(new n7(a0Var, this.f21603b, this.f21604c, tL_error, str, tLObject, tL_messages_search, arrayList, 1));
                return;
            default:
                rf.a0 a0Var2 = (rf.a0) this.d;
                String str2 = (String) this.f21605e;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f21606f;
                int i13 = a0Var2.f47155o0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    for (int i14 = 0; i14 < messages_messages2.chats.size(); i14++) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i14);
                        hVar3.k(chat2, chat2.f22392id);
                    }
                    for (int i15 = 0; i15 < messages_messages2.users.size(); i15++) {
                        TLRPC.User user2 = messages_messages2.users.get(i15);
                        hVar4.k(user2, user2.f22539id);
                    }
                    for (int i16 = 0; i16 < messages_messages2.messages.size(); i16++) {
                        MessageObject messageObject2 = new MessageObject(a0Var2.f47155o0, messages_messages2.messages.get(i16), hVar4, hVar3, false, true);
                        arrayList2.add(messageObject2);
                        messageObject2.setQuery(str2);
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
                n7 n7Var = new n7(a0Var2, this.f21603b, this.f21604c, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, 2);
                if (hashSet.isEmpty()) {
                    AndroidUtilities.runOnUIThread(n7Var);
                    return;
                } else {
                    MessagesStorage.getInstance(i13).getStorageQueue().postRunnable(new yw0(a0Var2, hashSet, n7Var, 24));
                    return;
                }
        }
    }
}
