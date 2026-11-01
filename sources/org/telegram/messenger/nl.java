package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class nl implements k20 {
    public final int f17314a;
    public final wp f17315b;
    public final k20 f17316c;

    public nl(wp wpVar, k20 k20Var, int i10) {
        this.f17314a = i10;
        this.f17315b = wpVar;
        this.f17316c = k20Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        switch (this.f17314a) {
            case 0:
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                wp wpVar = this.f17315b;
                wpVar.getClass();
                k20 k20Var = this.f17316c;
                if (messages_chats != null) {
                    ArrayList arrayList = new ArrayList(messages_chats.chats.size());
                    wpVar.P3(messages_chats.chats, true);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Chat chat = arrayList2.get(i11);
                        i11++;
                        TLRPC.Chat chat2 = chat;
                        if (chat2.creator && !w3.p0(chat2) && !w3.Y(chat2)) {
                            arrayList.add(chat2);
                        }
                    }
                    k20Var.a(arrayList, null);
                    return;
                }
                k20Var.a(null, tL_error);
                return;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k20 k20Var2 = this.f17316c;
                if (updates != null) {
                    ArrayList<TLRPC.Update> arrayList3 = updates.updates;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            TLRPC.Update update = arrayList3.get(i12);
                            i12++;
                            TLRPC.Update update2 = update;
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) update2).message.action;
                                if (messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                    i10 = 2;
                                } else if (messageAction instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                    i10 = 1;
                                }
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    wp wpVar2 = this.f17315b;
                    wpVar2.L3(updates, false);
                    i0.g3(new o7(wpVar2, k20Var2, i10, 13));
                    return;
                } else if (k20Var2 != null) {
                    i0.g3(new pi(21, k20Var2, tL_error2));
                    return;
                } else {
                    return;
                }
        }
    }
}
