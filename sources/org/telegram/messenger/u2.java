package org.telegram.messenger;

import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m71;
public final class u2 implements RequestDelegate {
    public final int f18530a;
    public final int f18531b;
    public final int f18532c;
    public final Object d;
    public final Object e;
    public final TLObject f18533f;

    public u2(Object obj, Object obj2, int i10, int i11, TLObject tLObject, int i12) {
        this.f18530a = i12;
        this.d = obj;
        this.e = obj2;
        this.f18531b = i10;
        this.f18532c = i11;
        this.f18533f = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        switch (this.f18530a) {
            case 0:
                ((FileLoadOperation) this.d).lambda$startDownloadRequest$29((FileLoadOperation.RequestInfo) this.e, this.f18531b, this.f18532c, this.f18533f, tLObject, tL_error);
                return;
            case 1:
                tf.z zVar = (tf.z) this.d;
                String str = (String) this.e;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f18533f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i10 = 0; i10 < messages_messages.chats.size(); i10++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i10);
                        hVar.k(chat, chat.f19159id);
                    }
                    for (int i11 = 0; i11 < messages_messages.users.size(); i11++) {
                        TLRPC.User user = messages_messages.users.get(i11);
                        hVar2.k(user, user.f19306id);
                    }
                    for (int i12 = 0; i12 < messages_messages.messages.size(); i12++) {
                        MessageObject messageObject = new MessageObject(zVar.f44970p0, messages_messages.messages.get(i12), hVar2, hVar, false, true);
                        arrayList.add(messageObject);
                        messageObject.setQuery(str);
                    }
                }
                AndroidUtilities.runOnUIThread(new o7(zVar, this.f18531b, this.f18532c, tL_error, str, tLObject, tL_messages_search, arrayList, 1));
                return;
            default:
                tf.z zVar2 = (tf.z) this.d;
                String str2 = (String) this.e;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f18533f;
                int i13 = zVar2.f44970p0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    for (int i14 = 0; i14 < messages_messages2.chats.size(); i14++) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i14);
                        hVar3.k(chat2, chat2.f19159id);
                    }
                    for (int i15 = 0; i15 < messages_messages2.users.size(); i15++) {
                        TLRPC.User user2 = messages_messages2.users.get(i15);
                        hVar4.k(user2, user2.f19306id);
                    }
                    for (int i16 = 0; i16 < messages_messages2.messages.size(); i16++) {
                        MessageObject messageObject2 = new MessageObject(zVar2.f44970p0, messages_messages2.messages.get(i16), hVar4, hVar3, false, true);
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
                o7 o7Var = new o7(zVar2, this.f18531b, this.f18532c, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, 2);
                if (hashSet.isEmpty()) {
                    AndroidUtilities.runOnUIThread(o7Var);
                    return;
                } else {
                    MessagesStorage.getInstance(i13).getStorageQueue().postRunnable(new m71(zVar2, hashSet, o7Var, 25));
                    return;
                }
        }
    }
}
