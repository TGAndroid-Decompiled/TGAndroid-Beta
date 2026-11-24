package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class sm2 implements i8c {
    public final byte a;
    public final xm2 b;

    public sm2(xm2 xm2Var, byte b) {
        this.a = b;
        this.b = xm2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String M0;
        int i;
        byte b = this.a;
        xm2 xm2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l5c l5cVar = (l5c) obj2;
                arrayList.add(c4c.l(0, xm2Var.h));
                c4c c = c4c.c(1, 2131232181, k96.M0(2131751927, null));
                c.r = true;
                arrayList.add(c);
                arrayList.add(c4c.E(2, gl.L(14.0f)));
                ArrayList arrayList2 = xm2Var.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(c4c.t(3, k96.M0(2131751957, null)));
                    ArrayList arrayList3 = xm2Var.n;
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList3.get(i2);
                        i2++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull L0 = xm2Var.getMessagesController().L0(chat.id);
                        c4c w = c4c.w(chat);
                        long j = chat.id;
                        w.d = (int) (j ^ (j >>> 32));
                        if (L0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = L0.linked_peers;
                            if (arrayList4 != null) {
                                i = arrayList4.size();
                            } else {
                                i = 0;
                            }
                            M0 = k96.G(i, "Chats", new Object[0]);
                        } else {
                            M0 = k96.M0(2131748587, null);
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
                    u21.b0(xm2Var).g0(tL_error, false);
                    return;
                } else {
                    no2.d(0, xm2Var.b, xm2Var);
                    return;
                }
        }
    }
}
