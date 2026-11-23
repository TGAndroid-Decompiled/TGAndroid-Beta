package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.d00;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class vb implements Runnable {
    public final int f9928a;
    public final boolean f9929b;
    public final long f9930c;
    public final Object d;

    public vb(Object obj, long j3, boolean z10, int i7) {
        this.f9928a = i7;
        this.d = obj;
        this.f9930c = j3;
        this.f9929b = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f9928a;
        boolean z10 = this.f9929b;
        long j3 = this.f9930c;
        Object obj = this.d;
        switch (i7) {
            case 0:
                mc mcVar = (mc) obj;
                mcVar.A1 = j3;
                mcVar.f9341z1 = j3;
                if (z10) {
                    fi.r0 r0Var = mcVar.B1;
                    r0Var.f12481c = j3;
                    mcVar.C1.set(r0Var);
                }
                mcVar.N0();
                mcVar.E1.a(true, true);
                lc lcVar = mcVar.f9340y1;
                if (lcVar != null) {
                    lcVar.setMyPrivacy(mcVar.f9341z1);
                    return;
                }
                return;
            case 1:
                hi.f9 f9Var = (hi.f9) obj;
                hi.k9 k9Var = f9Var.f14495a0;
                if (z10) {
                    int i10 = hi.k9.Y1;
                    mp.u1(k9Var.f30223a).Z2(Long.valueOf(j3), new hi.x8(f9Var, j3, 0), 200);
                    return;
                }
                int i11 = hi.k9.Y1;
                mp.u1(k9Var.f30223a).b3(0, j3, true);
                return;
            case 2:
                li.j0 j0Var = (li.j0) obj;
                j0Var.f20048i = null;
                j0Var.f20047g.l(j3);
                ArrayList arrayList = j0Var.f20049j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (org.telegram.messenger.n5.o(((TL_communities.CommunityPeerRequest) j0Var.f20049j.get(size)).peer) == j3) {
                            j0Var.f20049j.remove(size);
                        }
                    }
                }
                j0Var.a();
                li.i0 i0Var = j0Var.h;
                if (i0Var != null) {
                    i0Var.o();
                }
                mp u12 = mp.u1(j0Var.d);
                long j10 = j0Var.f20045e;
                li.h0 h0Var = new li.h0(j0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = u12.j1(j10);
                tL_communities_togglePeerLinkRequestApproval.peer = u12.l1(j3);
                tL_communities_togglePeerLinkRequestApproval.reject = !z10;
                u12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new d3.b(1), new org.telegram.messenger.o9(u12, j10, h0Var, 2));
                return;
            case 3:
                HashSet hashSet = ((xs) obj).f28100y;
                if (z10) {
                    hashSet.add(Long.valueOf(j3));
                    return;
                } else {
                    hashSet.remove(Long.valueOf(j3));
                    return;
                }
            default:
                d00 d00Var = (d00) obj;
                d00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j3).apply();
                d00Var.f23570a.l(j3);
                d00Var.f23571b.l(j3);
                d00Var.d.delete(j3);
                d00Var.f23577s.l(j3);
                TLRPC.Chat O0 = d00Var.getMessagesController().O0(Long.valueOf(j3));
                if (O0 != null && (O0.forum || O0.monoforum)) {
                    d00Var.n(0, j3, z10);
                }
                d00Var.y(j3, true);
                return;
        }
    }

    public vb(fs fsVar, boolean z10, long j3, int i7) {
        this.f9928a = i7;
        this.d = fsVar;
        this.f9929b = z10;
        this.f9930c = j3;
    }
}
