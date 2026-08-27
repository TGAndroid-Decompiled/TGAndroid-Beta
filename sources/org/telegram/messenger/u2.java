package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gs0;

public final class u2 implements RequestDelegate {

    public final int f21674a;

    public final int f21675b;

    public final int f21676c;
    public final Object d;

    public final Object f21677e;

    public final TLObject f21678f;

    public u2(Object obj, Object obj2, int i10, int i11, TLObject tLObject, int i12) {
        this.f21674a = i12;
        this.d = obj;
        this.f21677e = obj2;
        this.f21675b = i10;
        this.f21676c = i11;
        this.f21678f = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21674a) {
            case 0:
                ((FileLoadOperation) this.d).lambda$startDownloadRequest$29((FileLoadOperation.RequestInfo) this.f21677e, this.f21675b, this.f21676c, this.f21678f, tLObject, tL_error);
                break;
            case 1:
                pf.z zVar = (pf.z) this.d;
                String str = (String) this.f21677e;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f21678f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i10 = 0; i10 < messages_messages.chats.size(); i10++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i10);
                        hVar.k(chat, chat.f22380id);
                    }
                    for (int i11 = 0; i11 < messages_messages.users.size(); i11++) {
                        TLRPC.User user = messages_messages.users.get(i11);
                        hVar2.k(user, user.f22527id);
                    }
                    for (int i12 = 0; i12 < messages_messages.messages.size(); i12++) {
                        MessageObject messageObject = new MessageObject(zVar.f45996o0, messages_messages.messages.get(i12), hVar2, hVar, false, true);
                        arrayList.add(messageObject);
                        messageObject.setQuery(str);
                    }
                }
                AndroidUtilities.runOnUIThread(new l7(zVar, this.f21675b, this.f21676c, tL_error, str, tLObject, tL_messages_search, arrayList, 1));
                break;
            default:
                pf.z zVar2 = (pf.z) this.d;
                String str2 = (String) this.f21677e;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f21678f;
                int i13 = zVar2.f45996o0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar3 = new a0.h();
                    a0.h hVar4 = new a0.h();
                    for (int i14 = 0; i14 < messages_messages2.chats.size(); i14++) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i14);
                        hVar3.k(chat2, chat2.f22380id);
                    }
                    for (int i15 = 0; i15 < messages_messages2.users.size(); i15++) {
                        TLRPC.User user2 = messages_messages2.users.get(i15);
                        hVar4.k(user2, user2.f22527id);
                    }
                    for (int i16 = 0; i16 < messages_messages2.messages.size(); i16++) {
                        MessageObject messageObject2 = new MessageObject(zVar2.f45996o0, messages_messages2.messages.get(i16), hVar4, hVar3, false, true);
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
                        if ((message.out ? MessagesController.getInstance(i13).dialogs_read_outbox_max : MessagesController.getInstance(i13).dialogs_read_inbox_max).get(Long.valueOf(dialogId)) == null) {
                            hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(dialogId)));
                        }
                    }
                }
                l7 l7Var = new l7(zVar2, this.f21675b, this.f21676c, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, 2);
                if (hashSet.isEmpty()) {
                    AndroidUtilities.runOnUIThread(l7Var);
                } else {
                    MessagesStorage.getInstance(i13).getStorageQueue().postRunnable(new gs0(zVar2, hashSet, l7Var, 24));
                }
                break;
        }
    }
}
