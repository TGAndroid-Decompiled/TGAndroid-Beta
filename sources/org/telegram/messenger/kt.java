package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class kt implements Runnable {
    public final int f16633a;
    public final long f16634b;
    public final boolean f16635c;
    public final Object d;

    public kt(Object obj, long j10, boolean z10, int i10) {
        this.f16633a = i10;
        this.d = obj;
        this.f16634b = j10;
        this.f16635c = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f16633a;
        boolean z10 = this.f16635c;
        long j10 = this.f16634b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                HashSet hashSet = ((ot) obj).f17329y;
                if (z10) {
                    hashSet.add(Long.valueOf(j10));
                    return;
                } else {
                    hashSet.remove(Long.valueOf(j10));
                    return;
                }
            case 1:
                x00 x00Var = (x00) obj;
                x00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j10).apply();
                x00Var.f19171a.l(j10);
                x00Var.f19172b.l(j10);
                x00Var.d.delete(j10);
                x00Var.h.l(j10);
                TLRPC.Chat L0 = x00Var.getMessagesController().L0(Long.valueOf(j10));
                if (L0 != null && (L0.forum || L0.monoforum)) {
                    x00Var.n(0, j10, z10);
                }
                x00Var.y(j10, true);
                return;
            case 2:
                rh.y8 y8Var = (rh.y8) obj;
                y8Var.f47781w1 = j10;
                y8Var.f47780v1 = j10;
                if (z10) {
                    th.h0 h0Var = y8Var.f47782x1;
                    h0Var.f49008c = j10;
                    y8Var.f47783y1.set(h0Var);
                }
                y8Var.M0();
                y8Var.A1.a(true, true);
                rh.x8 x8Var = y8Var.f47779u1;
                if (x8Var != null) {
                    x8Var.setMyPrivacy(y8Var.f47780v1);
                    return;
                }
                return;
            case 3:
                vh.r6 r6Var = (vh.r6) obj;
                vh.w6 w6Var = r6Var.W;
                if (z10) {
                    int i11 = vh.w6.U1;
                    vp.r1(w6Var.f21583a).R2(Long.valueOf(j10), new org.telegram.ui.ActionBar.u3(r6Var, j10, 2), 200);
                    return;
                }
                int i12 = vh.w6.U1;
                vp.r1(w6Var.f21583a).T2(0, j10, true);
                return;
            default:
                yh.e0 e0Var = (yh.e0) obj;
                e0Var.f54478i = null;
                e0Var.f54477g.l(j10);
                ArrayList arrayList = e0Var.f54479j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (o5.o(((TL_communities.CommunityPeerRequest) e0Var.f54479j.get(size)).peer) == j10) {
                            e0Var.f54479j.remove(size);
                        }
                    }
                }
                e0Var.a();
                yh.d0 d0Var = e0Var.h;
                if (d0Var != null) {
                    d0Var.b();
                }
                vp r12 = vp.r1(e0Var.d);
                long j11 = e0Var.e;
                yh.c0 c0Var = new yh.c0(e0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = r12.g1(j11);
                tL_communities_togglePeerLinkRequestApproval.peer = r12.i1(j10);
                tL_communities_togglePeerLinkRequestApproval.reject = !z10;
                r12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new a3.b(1), new r9(r12, j11, c0Var, 2));
                return;
        }
    }

    public kt(us usVar, boolean z10, long j10, int i10) {
        this.f16633a = i10;
        this.d = usVar;
        this.f16635c = z10;
        this.f16634b = j10;
    }
}
