package ig;

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
public final class r implements RequestDelegate {
    public final int f14208a;
    public final Object f14209b;
    public final Object f14210c;
    public final int d;
    public final int e;
    public final TLObject f14211f;

    public r(Object obj, Object obj2, int i10, int i11, TLObject tLObject, int i12) {
        this.f14208a = i12;
        this.f14209b = obj;
        this.f14210c = obj2;
        this.d = i10;
        this.e = i11;
        this.f14211f = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        switch (this.f14208a) {
            case 0:
                i0 i0Var = (i0) this.f14209b;
                String str = (String) this.f14210c;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.f14211f;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    int i10 = 0;
                    for (int i11 = 0; i11 < messages_messages.chats.size(); i11++) {
                        TLRPC.Chat chat = messages_messages.chats.get(i11);
                        hVar.k(chat, chat.f22028id);
                    }
                    for (int i12 = 0; i12 < messages_messages.users.size(); i12++) {
                        TLRPC.User user = messages_messages.users.get(i12);
                        hVar2.k(user, user.f22177id);
                    }
                    while (i10 < messages_messages.messages.size()) {
                        a0.h hVar3 = hVar;
                        MessageObject messageObject = new MessageObject(i0Var.f14093s0, messages_messages.messages.get(i10), hVar2, hVar3, false, true);
                        arrayList.add(messageObject);
                        messageObject.setQuery(str);
                        i10++;
                        hVar = hVar3;
                    }
                }
                AndroidUtilities.runOnUIThread(new t(i0Var, this.d, this.e, tL_error, str, tLObject, tL_messages_search, arrayList, 0));
                return;
            case 1:
                i0 i0Var2 = (i0) this.f14209b;
                String str2 = (String) this.f14210c;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f14211f;
                int i13 = i0Var2.f14093s0;
                ArrayList arrayList2 = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    a0.h hVar4 = new a0.h();
                    a0.h hVar5 = new a0.h();
                    for (int i14 = 0; i14 < messages_messages2.chats.size(); i14++) {
                        TLRPC.Chat chat2 = messages_messages2.chats.get(i14);
                        hVar4.k(chat2, chat2.f22028id);
                    }
                    for (int i15 = 0; i15 < messages_messages2.users.size(); i15++) {
                        TLRPC.User user2 = messages_messages2.users.get(i15);
                        hVar5.k(user2, user2.f22177id);
                    }
                    int i16 = 0;
                    while (i16 < messages_messages2.messages.size()) {
                        a0.h hVar6 = hVar4;
                        MessageObject messageObject2 = new MessageObject(i0Var2.f14093s0, messages_messages2.messages.get(i16), hVar5, hVar6, false, true);
                        arrayList2.add(messageObject2);
                        messageObject2.setQuery(str2);
                        i16++;
                        hVar4 = hVar6;
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
                t tVar = new t(i0Var2, this.d, this.e, tL_error, str2, tLObject, tL_messages_searchGlobal, arrayList2, 1);
                if (hashSet.isEmpty()) {
                    AndroidUtilities.runOnUIThread(tVar);
                    return;
                } else {
                    MessagesStorage.getInstance(i13).getStorageQueue().postRunnable(new e2.m0(i0Var2, hashSet, tVar, 19));
                    return;
                }
            default:
                ((FileLoadOperation) this.f14209b).lambda$startDownloadRequest$30((FileLoadOperation.RequestInfo) this.f14210c, this.d, this.e, this.f14211f, tLObject, tL_error);
                return;
        }
    }
}
