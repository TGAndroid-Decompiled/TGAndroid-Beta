package defpackage;

import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class ko2 implements Runnable {
    public final byte a;
    public final boolean b;
    public final long c;
    public final Object d;

    public ko2(gk7 gk7Var, boolean z, long j, byte b) {
        this.a = b;
        this.d = gk7Var;
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
                mo2 mo2Var = (mo2) obj;
                mo2Var.i = null;
                mo2Var.g.l(j);
                for (int size = mo2Var.j.size() - 1; size >= 0; size--) {
                    if (cf3.n(((TL_communities.CommunityPeerRequest) mo2Var.j.get(size)).peer) == j) {
                        mo2Var.j.remove(size);
                    }
                }
                mo2Var.a();
                lo2 lo2Var = mo2Var.h;
                if (lo2Var != null) {
                    lo2Var.U0();
                }
                na7 q1 = na7.q1(mo2Var.d);
                long j2 = mo2Var.e;
                jo2 jo2Var = new jo2(mo2Var, (byte) 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = q1.f1(j2);
                tL_communities_togglePeerLinkRequestApproval.peer = q1.h1(j);
                tL_communities_togglePeerLinkRequestApproval.reject = !z;
                q1.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new hc((byte) 0), new et4(q1, j2, jo2Var, (byte) 3));
                return;
            case 1:
                HashSet hashSet = ((im7) obj).y;
                if (z) {
                    hashSet.add(Long.valueOf(j));
                    return;
                } else {
                    hashSet.remove(Long.valueOf(j));
                    return;
                }
            case 2:
                bwa bwaVar = (bwa) obj;
                bwaVar.z1 = j;
                bwaVar.y1 = j;
                if (z) {
                    i76 i76Var = bwaVar.A1;
                    i76Var.c = j;
                    bwaVar.B1.set(i76Var);
                }
                bwaVar.H0();
                bwaVar.D1.a(true, true);
                awa awaVar = bwaVar.x1;
                if (awaVar != null) {
                    awaVar.setMyPrivacy(bwaVar.y1);
                    return;
                }
                return;
            case 3:
                t5b t5bVar = (t5b) obj;
                y5b y5bVar = t5bVar.a0;
                if (z) {
                    int i = y5b.X1;
                    na7.q1(y5bVar.a).W2(Long.valueOf(j), new hy3(t5bVar, j, (byte) 2), 200);
                    return;
                }
                int i2 = y5b.X1;
                na7.q1(y5bVar.a).Y2(0, j, true);
                return;
            default:
                pub pubVar = (pub) obj;
                pubVar.getUserConfig().j().edit().remove("topics_end_reached_" + j).apply();
                pubVar.a.l(j);
                pubVar.b.l(j);
                pubVar.d.delete(j);
                pubVar.s.l(j);
                TLRPC.Chat K0 = pubVar.getMessagesController().K0(Long.valueOf(j));
                if (K0 != null && (K0.forum || K0.monoforum)) {
                    pubVar.n(0, j, z);
                }
                pubVar.y(j, true);
                return;
        }
    }

    public ko2(Object obj, long j, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = z;
    }
}
