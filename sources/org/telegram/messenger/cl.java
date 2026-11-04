package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class cl implements n10 {
    public final int f22036a;
    public final hp f22037b;
    public final n10 f22038c;

    public cl(hp hpVar, n10 n10Var, int i3) {
        this.f22036a = i3;
        this.f22037b = hpVar;
        this.f22038c = n10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3;
        switch (this.f22036a) {
            case 0:
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                hp hpVar = this.f22037b;
                hpVar.getClass();
                n10 n10Var = this.f22038c;
                if (messages_chats != null) {
                    ArrayList arrayList = new ArrayList(messages_chats.chats.size());
                    hpVar.S3(messages_chats.chats, true);
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
                    n10Var.a(arrayList, null);
                    return;
                }
                n10Var.a(null, tL_error);
                return;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                n10 n10Var2 = this.f22038c;
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
                                    i3 = 2;
                                } else if (messageAction instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                    i3 = 1;
                                }
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                    hp hpVar2 = this.f22037b;
                    hpVar2.O3(updates, false);
                    g0.h3(new k7(hpVar2, n10Var2, i3, 13));
                    return;
                } else if (n10Var2 != null) {
                    g0.h3(new yh(23, n10Var2, tL_error2));
                    return;
                } else {
                    return;
                }
        }
    }
}
