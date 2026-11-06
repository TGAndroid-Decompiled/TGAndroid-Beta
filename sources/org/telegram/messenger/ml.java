package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class ml implements v10 {
    public final int f24042a;
    public final qp f24043b;
    public final v10 f24044c;

    public ml(qp qpVar, v10 v10Var, int i7) {
        this.f24042a = i7;
        this.f24043b = qpVar;
        this.f24044c = v10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        switch (this.f24042a) {
            case 0:
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                qp qpVar = this.f24043b;
                qpVar.getClass();
                v10 v10Var = this.f24044c;
                if (messages_chats != null) {
                    ArrayList arrayList = new ArrayList(messages_chats.chats.size());
                    qpVar.S3(messages_chats.chats, true);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Chat chat = arrayList2.get(i10);
                        i10++;
                        TLRPC.Chat chat2 = chat;
                        if (chat2.creator && !t3.p0(chat2) && !t3.Y(chat2)) {
                            arrayList.add(chat2);
                        }
                    }
                    v10Var.a(arrayList, null);
                    return;
                }
                v10Var.a(null, tL_error);
                return;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                v10 v10Var2 = this.f24044c;
                if (updates != null) {
                    ArrayList<TLRPC.Update> arrayList3 = updates.updates;
                    int size2 = arrayList3.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            TLRPC.Update update = arrayList3.get(i11);
                            i11++;
                            TLRPC.Update update2 = update;
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) update2).message.action;
                                if (messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                    i7 = 2;
                                } else if (messageAction instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                    i7 = 1;
                                }
                            }
                        } else {
                            i7 = 0;
                        }
                    }
                    qp qpVar2 = this.f24043b;
                    qpVar2.O3(updates, false);
                    g0.h3(new k7(qpVar2, v10Var2, i7, 13));
                    return;
                } else if (v10Var2 != null) {
                    g0.h3(new hi(23, v10Var2, tL_error2));
                    return;
                } else {
                    return;
                }
        }
    }
}
