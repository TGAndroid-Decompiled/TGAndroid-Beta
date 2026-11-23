package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.f00;
import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.ys;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class vb implements Runnable {
    public final int f9967a;
    public final boolean f9968b;
    public final long f9969c;
    public final Object d;

    public vb(Object obj, long j3, boolean z10, int i7) {
        this.f9967a = i7;
        this.d = obj;
        this.f9969c = j3;
        this.f9968b = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f9967a;
        boolean z10 = this.f9968b;
        long j3 = this.f9969c;
        Object obj = this.d;
        switch (i7) {
            case 0:
                mc mcVar = (mc) obj;
                mcVar.A1 = j3;
                mcVar.f9380z1 = j3;
                if (z10) {
                    fi.r0 r0Var = mcVar.B1;
                    r0Var.f12519c = j3;
                    mcVar.C1.set(r0Var);
                }
                mcVar.N0();
                mcVar.E1.a(true, true);
                lc lcVar = mcVar.f9379y1;
                if (lcVar != null) {
                    lcVar.setMyPrivacy(mcVar.f9380z1);
                    return;
                }
                return;
            case 1:
                hi.k8 k8Var = (hi.k8) obj;
                hi.p8 p8Var = k8Var.f14930a0;
                if (z10) {
                    int i10 = hi.p8.Y1;
                    np.u1(p8Var.f30173a).Z2(Long.valueOf(j3), new hi.c8(k8Var, j3, 0), 200);
                    return;
                }
                int i11 = hi.p8.Y1;
                np.u1(p8Var.f30173a).b3(0, j3, true);
                return;
            case 2:
                li.k0 k0Var = (li.k0) obj;
                k0Var.f19985i = null;
                k0Var.f19984g.l(j3);
                ArrayList arrayList = k0Var.f19986j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (org.telegram.messenger.n5.o(((TL_communities.CommunityPeerRequest) k0Var.f19986j.get(size)).peer) == j3) {
                            k0Var.f19986j.remove(size);
                        }
                    }
                }
                k0Var.a();
                li.j0 j0Var = k0Var.h;
                if (j0Var != null) {
                    j0Var.F();
                }
                np u12 = np.u1(k0Var.d);
                long j10 = k0Var.f19982e;
                li.i0 i0Var = new li.i0(k0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = u12.j1(j10);
                tL_communities_togglePeerLinkRequestApproval.peer = u12.l1(j3);
                tL_communities_togglePeerLinkRequestApproval.reject = !z10;
                u12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new d3.b(1), new org.telegram.messenger.p9(u12, j10, i0Var, 2));
                return;
            case 3:
                HashSet hashSet = ((ys) obj).f28196y;
                if (z10) {
                    hashSet.add(Long.valueOf(j3));
                    return;
                } else {
                    hashSet.remove(Long.valueOf(j3));
                    return;
                }
            default:
                f00 f00Var = (f00) obj;
                f00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j3).apply();
                f00Var.f23807a.l(j3);
                f00Var.f23808b.l(j3);
                f00Var.d.delete(j3);
                f00Var.f23814s.l(j3);
                TLRPC.Chat O0 = f00Var.getMessagesController().O0(Long.valueOf(j3));
                if (O0 != null && (O0.forum || O0.monoforum)) {
                    f00Var.n(0, j3, z10);
                }
                f00Var.y(j3, true);
                return;
        }
    }

    public vb(gs gsVar, boolean z10, long j3, int i7) {
        this.f9967a = i7;
        this.d = gsVar;
        this.f9968b = z10;
        this.f9969c = j3;
    }
}
