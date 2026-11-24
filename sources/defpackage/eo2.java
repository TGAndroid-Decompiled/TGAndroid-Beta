package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class eo2 implements jac {
    public final byte a;
    public final io2 b;

    public eo2(io2 io2Var, byte b) {
        this.a = b;
        this.b = io2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        int i;
        byte b = this.a;
        io2 io2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l7c l7cVar = (l7c) obj2;
                arrayList.add(c6c.l(0, io2Var.h));
                c6c c = c6c.c(1, 2131232182, jb6.M0(2131751876, null));
                c.r = true;
                arrayList.add(c);
                arrayList.add(c6c.E(2, gm.L(14.0f)));
                ArrayList arrayList2 = io2Var.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(c6c.t(3, jb6.M0(2131751906, null)));
                    ArrayList arrayList3 = io2Var.n;
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList3.get(i2);
                        i2++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull M02 = io2Var.getMessagesController().M0(chat.id);
                        c6c w = c6c.w(chat);
                        long j = chat.id;
                        w.d = (int) (j ^ (j >>> 32));
                        if (M02 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = M02.linked_peers;
                            if (arrayList4 != null) {
                                i = arrayList4.size();
                            } else {
                                i = 0;
                            }
                            M0 = jb6.G(i, "Chats", new Object[0]);
                        } else {
                            M0 = jb6.M0(2131748536, null);
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
                    c41.b0(io2Var).g0(tL_error, false);
                    return;
                } else {
                    yp2.d(0, io2Var.b, io2Var);
                    return;
                }
        }
    }
}
