package of;

import android.util.Pair;
import ih.h3;
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
    public final int f19464a;
    public final Object f19465b;
    public final Object f19466c;
    public final int d;
    public final int f19467e;
    public final TLObject f19468f;

    public q(Object obj, Object obj2, int i9, int i10, TLObject tLObject, int i11) {
        this.f19464a = i11;
        this.f19465b = obj;
        this.f19466c = obj2;
        this.d = i9;
        this.f19467e = i10;
        this.f19468f = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        switch (this.f19464a) {
            case 0:
                f0 f0Var = (f0) this.f19465b;
                String str = (String) this.f19466c;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f19468f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    int i9 = 0;
                    for (int i10 = 0; i10 < messages_messages.chats.size(); i10++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i10);
                        hVar.k(chat, chat.f22380id);
                    }
                    for (int i11 = 0; i11 < messages_messages.users.size(); i11++) {
                        TLRPC.User user = messages_messages.users.get(i11);
                        hVar2.k(user, user.f22527id);
                    }
                    while (i9 < messages_messages.messages.size()) {
                        a0.h hVar3 = hVar;
                        MessageObject messageObject = new MessageObject(f0Var.f19303o0, messages_messages.messages.get(i9), hVar2, hVar3, false, true);
                        arrayList.add(messageObject);
                        messageObject.setQuery(str);
                        i9++;
                        hVar = hVar3;
                    }
                }
                AndroidUtilities.runOnUIThread(new r(f0Var, this.d, this.f19467e, tL_error, str, tLObject, tL_messages_search, arrayList, 0));
                return;
            case 1:
                f0 f0Var2 = (f0) this.f19465b;
                String str2 = (String) this.f19466c;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f19468f;
                int i12 = f0Var2.f19303o0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar4 = new a0.h();
                    a0.h hVar5 = new a0.h();
                    for (int i13 = 0; i13 < messages_messages2.chats.size(); i13++) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i13);
                        hVar4.k(chat2, chat2.f22380id);
                    }
                    for (int i14 = 0; i14 < messages_messages2.users.size(); i14++) {
                        TLRPC.User user2 = messages_messages2.users.get(i14);
                        hVar5.k(user2, user2.f22527id);
                    }
                    int i15 = 0;
                    while (i15 < messages_messages2.messages.size()) {
                        a0.h hVar6 = hVar4;
                        MessageObject messageObject2 = new MessageObject(f0Var2.f19303o0, messages_messages2.messages.get(i15), hVar5, hVar6, false, true);
                        arrayList2.add(messageObject2);
                        messageObject2.setQuery(str2);
                        i15++;
                        hVar4 = hVar6;
                    }
                }
                HashSet hashSet = new HashSet();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    for (int i16 = 0; i16 < messages_messages3.messages.size(); i16++) {
                        TLRPC.Message message = messages_messages3.messages.get(i16);
                        long dialogId = MessageObject.getDialogId(message);
                        if (message.out) {
                            concurrentHashMap = MessagesController.getInstance(i12).dialogs_read_outbox_max;
                        } else {
                            concurrentHashMap = MessagesController.getInstance(i12).dialogs_read_inbox_max;
                        }
                        if (concurrentHashMap.get(Long.valueOf(dialogId)) == null) {
                            hashSet.add(new Pair(Boolean.valueOf(message.out), Long.valueOf(dialogId)));
                        }
                    }
                }
                r rVar = new r(f0Var2, this.d, this.f19467e, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, 1);
                if (hashSet.isEmpty()) {
                    AndroidUtilities.runOnUIThread(rVar);
                    return;
                } else {
                    MessagesStorage.getInstance(i12).getStorageQueue().postRunnable(new h3(f0Var2, hashSet, rVar, 24));
                    return;
                }
            default:
                ((FileLoadOperation) this.f19465b).lambda$startDownloadRequest$29((FileLoadOperation.RequestInfo) this.f19466c, this.d, this.f19467e, this.f19468f, tLObject, tL_error);
                return;
        }
    }
}
