package defpackage;

import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class dp2 implements Runnable {
    public final byte a;
    public final boolean b;
    public final long c;
    public final Object d;

    public dp2(fn7 fn7Var, boolean z, long j, byte b) {
        this.a = b;
        this.d = fn7Var;
        this.b = z;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.b;
        long j = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                fp2 fp2Var = (fp2) obj;
                fp2Var.i = null;
                fp2Var.g.l(j);
                for (int size = fp2Var.j.size() - 1; size >= 0; size--) {
                    if (wf3.n(((TL_communities.CommunityPeerRequest) fp2Var.j.get(size)).peer) == j) {
                        fp2Var.j.remove(size);
                    }
                }
                fp2Var.a();
                ep2 ep2Var = fp2Var.h;
                if (ep2Var != null) {
                    ep2Var.W();
                }
                uc7 s1 = uc7.s1(fp2Var.d);
                long j2 = fp2Var.e;
                cp2 cp2Var = new cp2(fp2Var, (byte) 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = s1.h1(j2);
                tL_communities_togglePeerLinkRequestApproval.peer = s1.j1(j);
                tL_communities_togglePeerLinkRequestApproval.reject = !z;
                s1.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new ic((byte) 0), new iv4(s1, j2, cp2Var, (byte) 3));
                return;
            case 1:
                HashSet hashSet = ((ip7) obj).y;
                if (z) {
                    hashSet.add(Long.valueOf(j));
                    return;
                } else {
                    hashSet.remove(Long.valueOf(j));
                    return;
                }
            case 2:
                e0b e0bVar = (e0b) obj;
                e0bVar.z1 = j;
                e0bVar.y1 = j;
                if (z) {
                    m96 m96Var = e0bVar.A1;
                    m96Var.c = j;
                    e0bVar.B1.set(m96Var);
                }
                e0bVar.I0();
                e0bVar.D1.a(true, true);
                d0b d0bVar = e0bVar.x1;
                if (d0bVar != null) {
                    d0bVar.setMyPrivacy(e0bVar.y1);
                    return;
                }
                return;
            case 3:
                r9b r9bVar = (r9b) obj;
                w9b w9bVar = r9bVar.a0;
                if (z) {
                    int i = w9b.X1;
                    uc7.s1(w9bVar.a).c3(Long.valueOf(j), new cz3(r9bVar, j, (byte) 2), 200);
                    return;
                }
                int i2 = w9b.X1;
                uc7.s1(w9bVar.a).e3(0, j, true);
                return;
            default:
                qyb qybVar = (qyb) obj;
                qybVar.getUserConfig().j().edit().remove("topics_end_reached_" + j).apply();
                qybVar.a.l(j);
                qybVar.b.l(j);
                qybVar.d.delete(j);
                qybVar.s.l(j);
                TLRPC.Chat M0 = qybVar.getMessagesController().M0(Long.valueOf(j));
                if (M0 != null && (M0.forum || M0.monoforum)) {
                    qybVar.n(0, j, z);
                }
                qybVar.y(j, true);
                return;
        }
    }

    public dp2(Object obj, long j, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = z;
    }
}
