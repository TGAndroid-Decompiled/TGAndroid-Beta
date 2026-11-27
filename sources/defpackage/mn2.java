package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class mn2 implements icc {
    public final byte a;
    public final qn2 b;

    public mn2(qn2 qn2Var, byte b) {
        this.a = b;
        this.b = qn2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        int i;
        byte b = this.a;
        qn2 qn2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                arrayList.add(b8c.l(0, qn2Var.h));
                b8c c = b8c.c(1, 2131232181, ob6.M0(2131751904, null));
                c.r = true;
                arrayList.add(c);
                arrayList.add(b8c.E(2, hl.L(14.0f)));
                ArrayList arrayList2 = qn2Var.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(b8c.t(3, ob6.M0(2131751934, null)));
                    ArrayList arrayList3 = qn2Var.n;
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList3.get(i2);
                        i2++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull N0 = qn2Var.getMessagesController().N0(chat.id);
                        b8c w = b8c.w(chat);
                        long j = chat.id;
                        w.d = (int) (j ^ (j >>> 32));
                        if (N0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = N0.linked_peers;
                            if (arrayList4 != null) {
                                i = arrayList4.size();
                            } else {
                                i = 0;
                            }
                            M0 = ob6.G(i, "Chats", new Object[0]);
                        } else {
                            M0 = ob6.M0(2131748533, null);
                        }
                        w.n = M0;
                        arrayList.add(w);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    d31.b0(qn2Var).g0(tL_error, false);
                    return;
                } else {
                    gp2.d(0, qn2Var.b, qn2Var);
                    return;
                }
        }
    }
}
