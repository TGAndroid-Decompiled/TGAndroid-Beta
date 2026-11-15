package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.at;
import org.telegram.messenger.h00;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class rb implements Runnable {
    public final int f9340a;
    public final boolean f9341b;
    public final long f9342c;
    public final Object d;

    public rb(Object obj, long j3, boolean z10, int i7) {
        this.f9340a = i7;
        this.d = obj;
        this.f9342c = j3;
        this.f9341b = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f9340a;
        boolean z10 = this.f9341b;
        long j3 = this.f9342c;
        Object obj = this.d;
        switch (i7) {
            case 0:
                ic icVar = (ic) obj;
                icVar.A1 = j3;
                icVar.f8833z1 = j3;
                if (z10) {
                    fi.s0 s0Var = icVar.B1;
                    s0Var.f12299c = j3;
                    icVar.C1.set(s0Var);
                }
                icVar.M0();
                icVar.E1.a(true, true);
                hc hcVar = icVar.f8832y1;
                if (hcVar != null) {
                    hcVar.setMyPrivacy(icVar.f8833z1);
                    return;
                }
                return;
            case 1:
                hi.l8 l8Var = (hi.l8) obj;
                hi.q8 q8Var = l8Var.f14600a0;
                if (z10) {
                    int i10 = hi.q8.Y1;
                    np.s1(q8Var.f29679a).T2(Long.valueOf(j3), new hi.d8(l8Var, j3, 0), 200);
                    return;
                }
                int i11 = hi.q8.Y1;
                np.s1(q8Var.f29679a).V2(0, j3, true);
                return;
            case 2:
                li.k0 k0Var = (li.k0) obj;
                k0Var.f19597i = null;
                k0Var.f19596g.l(j3);
                ArrayList arrayList = k0Var.f19598j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (org.telegram.messenger.m5.o(((TL_communities.CommunityPeerRequest) k0Var.f19598j.get(size)).peer) == j3) {
                            k0Var.f19598j.remove(size);
                        }
                    }
                }
                k0Var.a();
                li.j0 j0Var = k0Var.h;
                if (j0Var != null) {
                    j0Var.I();
                }
                np s12 = np.s1(k0Var.d);
                long j10 = k0Var.f19594e;
                li.i0 i0Var = new li.i0(k0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = s12.h1(j10);
                tL_communities_togglePeerLinkRequestApproval.peer = s12.j1(j3);
                tL_communities_togglePeerLinkRequestApproval.reject = !z10;
                s12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new d3.b(1), new org.telegram.messenger.p9(s12, j10, i0Var, 2));
                return;
            case 3:
                HashSet hashSet = ((at) obj).f22585y;
                if (z10) {
                    hashSet.add(Long.valueOf(j3));
                    return;
                } else {
                    hashSet.remove(Long.valueOf(j3));
                    return;
                }
            default:
                h00 h00Var = (h00) obj;
                h00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j3).apply();
                h00Var.f24011a.l(j3);
                h00Var.f24012b.l(j3);
                h00Var.d.delete(j3);
                h00Var.h.l(j3);
                TLRPC.Chat M0 = h00Var.getMessagesController().M0(Long.valueOf(j3));
                if (M0 != null && (M0.forum || M0.monoforum)) {
                    h00Var.n(0, j3, z10);
                }
                h00Var.y(j3, true);
                return;
        }
    }

    public rb(is isVar, boolean z10, long j3, int i7) {
        this.f9340a = i7;
        this.d = isVar;
        this.f9341b = z10;
        this.f9342c = j3;
    }
}
