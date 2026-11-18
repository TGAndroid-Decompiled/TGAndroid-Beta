package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.e00;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class vb implements Runnable {
    public final int f9952a;
    public final boolean f9953b;
    public final long f9954c;
    public final Object d;

    public vb(Object obj, long j3, boolean z10, int i7) {
        this.f9952a = i7;
        this.d = obj;
        this.f9954c = j3;
        this.f9953b = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f9952a;
        boolean z10 = this.f9953b;
        long j3 = this.f9954c;
        Object obj = this.d;
        switch (i7) {
            case 0:
                mc mcVar = (mc) obj;
                mcVar.A1 = j3;
                mcVar.f9356z1 = j3;
                if (z10) {
                    fi.r0 r0Var = mcVar.B1;
                    r0Var.f12488c = j3;
                    mcVar.C1.set(r0Var);
                }
                mcVar.N0();
                mcVar.E1.a(true, true);
                lc lcVar = mcVar.f9355y1;
                if (lcVar != null) {
                    lcVar.setMyPrivacy(mcVar.f9356z1);
                    return;
                }
                return;
            case 1:
                hi.l8 l8Var = (hi.l8) obj;
                hi.q8 q8Var = l8Var.f14955a0;
                if (z10) {
                    int i10 = hi.q8.Y1;
                    mp.u1(q8Var.f30189a).Z2(Long.valueOf(j3), new hi.d8(l8Var, j3, 0), 200);
                    return;
                }
                int i11 = hi.q8.Y1;
                mp.u1(q8Var.f30189a).b3(0, j3, true);
                return;
            case 2:
                li.k0 k0Var = (li.k0) obj;
                k0Var.f19957i = null;
                k0Var.f19956g.l(j3);
                ArrayList arrayList = k0Var.f19958j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (org.telegram.messenger.n5.o(((TL_communities.CommunityPeerRequest) k0Var.f19958j.get(size)).peer) == j3) {
                            k0Var.f19958j.remove(size);
                        }
                    }
                }
                k0Var.a();
                li.j0 j0Var = k0Var.h;
                if (j0Var != null) {
                    j0Var.F();
                }
                mp u12 = mp.u1(k0Var.d);
                long j10 = k0Var.f19954e;
                li.i0 i0Var = new li.i0(k0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = u12.j1(j10);
                tL_communities_togglePeerLinkRequestApproval.peer = u12.l1(j3);
                tL_communities_togglePeerLinkRequestApproval.reject = !z10;
                u12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new d3.b(1), new org.telegram.messenger.o9(u12, j10, i0Var, 2));
                return;
            case 3:
                HashSet hashSet = ((xs) obj).f27986y;
                if (z10) {
                    hashSet.add(Long.valueOf(j3));
                    return;
                } else {
                    hashSet.remove(Long.valueOf(j3));
                    return;
                }
            default:
                e00 e00Var = (e00) obj;
                e00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j3).apply();
                e00Var.f23623a.l(j3);
                e00Var.f23624b.l(j3);
                e00Var.d.delete(j3);
                e00Var.f23630s.l(j3);
                TLRPC.Chat O0 = e00Var.getMessagesController().O0(Long.valueOf(j3));
                if (O0 != null && (O0.forum || O0.monoforum)) {
                    e00Var.n(0, j3, z10);
                }
                e00Var.y(j3, true);
                return;
        }
    }

    public vb(fs fsVar, boolean z10, long j3, int i7) {
        this.f9952a = i7;
        this.d = fsVar;
        this.f9953b = z10;
        this.f9954c = j3;
    }
}
