package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class fl implements q10 {
    public final int f24058a;
    public final mp f24059b;
    public final q10 f24060c;

    public fl(mp mpVar, q10 q10Var, int i7) {
        this.f24058a = i7;
        this.f24059b = mpVar;
        this.f24060c = q10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        switch (this.f24058a) {
            case 0:
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                mp mpVar = this.f24059b;
                mpVar.getClass();
                q10 q10Var = this.f24060c;
                if (messages_chats != null) {
                    ArrayList arrayList = new ArrayList(messages_chats.chats.size());
                    mpVar.Z3(messages_chats.chats, true);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Chat chat = arrayList2.get(i10);
                        i10++;
                        TLRPC.Chat chat2 = chat;
                        if (chat2.creator && !v3.p0(chat2) && !v3.Y(chat2)) {
                            arrayList.add(chat2);
                        }
                    }
                    q10Var.a(arrayList, null);
                    return;
                }
                q10Var.a(null, tL_error);
                return;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                q10 q10Var2 = this.f24060c;
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
                    mp mpVar2 = this.f24059b;
                    mpVar2.V3(updates, false);
                    g0.g3(new l7(mpVar2, q10Var2, i7, 13));
                    return;
                } else if (q10Var2 != null) {
                    g0.g3(new fi(23, q10Var2, tL_error2));
                    return;
                } else {
                    return;
                }
        }
    }
}
