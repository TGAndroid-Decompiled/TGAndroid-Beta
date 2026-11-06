package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.dt;
import org.telegram.messenger.k00;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class kd implements Runnable {
    public final int f4235a;
    public final boolean f4236b;
    public final long f4237c;
    public final Object d;

    public kd(Object obj, long j3, boolean z9, int i7) {
        this.f4235a = i7;
        this.d = obj;
        this.f4237c = j3;
        this.f4236b = z9;
    }

    @Override
    public final void run() {
        int i7 = this.f4235a;
        boolean z9 = this.f4236b;
        long j3 = this.f4237c;
        Object obj = this.d;
        switch (i7) {
            case 0:
                ce ceVar = (ce) obj;
                ceVar.f3626w1 = j3;
                ceVar.f3625v1 = j3;
                if (z9) {
                    di.s0 s0Var = ceVar.f3627x1;
                    s0Var.f9738c = j3;
                    ceVar.f3628y1.set(s0Var);
                }
                ceVar.M0();
                ceVar.A1.a(true, true);
                be beVar = ceVar.f3624u1;
                if (beVar != null) {
                    beVar.setMyPrivacy(ceVar.f3625v1);
                    return;
                }
                return;
            case 1:
                fi.n8 n8Var = (fi.n8) obj;
                fi.s8 s8Var = n8Var.W;
                if (z9) {
                    int i10 = fi.s8.U1;
                    qp.s1(s8Var.f28613a).T2(Long.valueOf(j3), new fi.f8(n8Var, j3, 0), 200);
                    return;
                }
                int i11 = fi.s8.U1;
                qp.s1(s8Var.f28613a).V2(0, j3, true);
                return;
            case 2:
                ii.l0 l0Var = (ii.l0) obj;
                l0Var.f15564i = null;
                l0Var.f15563g.l(j3);
                ArrayList arrayList = l0Var.f15565j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (org.telegram.messenger.m5.o(((TL_communities.CommunityPeerRequest) l0Var.f15565j.get(size)).peer) == j3) {
                            l0Var.f15565j.remove(size);
                        }
                    }
                }
                l0Var.a();
                ii.k0 k0Var = l0Var.h;
                if (k0Var != null) {
                    k0Var.u();
                }
                qp s12 = qp.s1(l0Var.d);
                long j10 = l0Var.f15561e;
                ii.j0 j0Var = new ii.j0(l0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = s12.h1(j10);
                tL_communities_togglePeerLinkRequestApproval.peer = s12.j1(j3);
                tL_communities_togglePeerLinkRequestApproval.reject = !z9;
                s12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new d3.b(1), new org.telegram.messenger.q9(s12, j10, j0Var, 2));
                return;
            case 3:
                HashSet hashSet = ((dt) obj).f22084y;
                if (z9) {
                    hashSet.add(Long.valueOf(j3));
                    return;
                } else {
                    hashSet.remove(Long.valueOf(j3));
                    return;
                }
            default:
                k00 k00Var = (k00) obj;
                k00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j3).apply();
                k00Var.f23637a.l(j3);
                k00Var.f23638b.l(j3);
                k00Var.d.delete(j3);
                k00Var.h.l(j3);
                TLRPC.Chat M0 = k00Var.getMessagesController().M0(Long.valueOf(j3));
                if (M0 != null && (M0.forum || M0.monoforum)) {
                    k00Var.n(0, j3, z9);
                }
                k00Var.y(j3, true);
                return;
        }
    }

    public kd(ls lsVar, boolean z9, long j3, int i7) {
        this.f4235a = i7;
        this.d = lsVar;
        this.f4236b = z9;
        this.f4237c = j3;
    }
}
