package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class lt implements Runnable {
    public final int f16998a;
    public final long f16999b;
    public final boolean f17000c;
    public final Object d;

    public lt(Object obj, long j10, boolean z10, int i10) {
        this.f16998a = i10;
        this.d = obj;
        this.f16999b = j10;
        this.f17000c = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f16998a;
        boolean z10 = this.f17000c;
        long j10 = this.f16999b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                HashSet hashSet = ((pt) obj).f17662y;
                if (z10) {
                    hashSet.add(Long.valueOf(j10));
                    return;
                } else {
                    hashSet.remove(Long.valueOf(j10));
                    return;
                }
            case 1:
                y00 y00Var = (y00) obj;
                y00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j10).apply();
                y00Var.f19511a.l(j10);
                y00Var.f19512b.l(j10);
                y00Var.d.delete(j10);
                y00Var.h.l(j10);
                TLRPC.Chat L0 = y00Var.getMessagesController().L0(Long.valueOf(j10));
                if (L0 != null && (L0.forum || L0.monoforum)) {
                    y00Var.n(0, j10, z10);
                }
                y00Var.y(j10, true);
                return;
            case 2:
                rh.y8 y8Var = (rh.y8) obj;
                y8Var.f47793w1 = j10;
                y8Var.f47792v1 = j10;
                if (z10) {
                    th.h0 h0Var = y8Var.f47794x1;
                    h0Var.f49022c = j10;
                    y8Var.f47795y1.set(h0Var);
                }
                y8Var.M0();
                y8Var.A1.a(true, true);
                rh.x8 x8Var = y8Var.f47791u1;
                if (x8Var != null) {
                    x8Var.setMyPrivacy(y8Var.f47792v1);
                    return;
                }
                return;
            case 3:
                vh.r6 r6Var = (vh.r6) obj;
                vh.w6 w6Var = r6Var.W;
                if (z10) {
                    int i11 = vh.w6.U1;
                    wp.r1(w6Var.f21584a).R2(Long.valueOf(j10), new org.telegram.ui.ActionBar.u3(r6Var, j10, 2), 200);
                    return;
                }
                int i12 = vh.w6.U1;
                wp.r1(w6Var.f21584a).T2(0, j10, true);
                return;
            default:
                yh.d0 d0Var = (yh.d0) obj;
                d0Var.f54476i = null;
                d0Var.f54475g.l(j10);
                ArrayList arrayList = d0Var.f54477j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (o5.o(((TL_communities.CommunityPeerRequest) d0Var.f54477j.get(size)).peer) == j10) {
                            d0Var.f54477j.remove(size);
                        }
                    }
                }
                d0Var.a();
                yh.c0 c0Var = d0Var.h;
                if (c0Var != null) {
                    c0Var.b();
                }
                wp r12 = wp.r1(d0Var.d);
                long j11 = d0Var.e;
                yh.b0 b0Var = new yh.b0(d0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = r12.g1(j11);
                tL_communities_togglePeerLinkRequestApproval.peer = r12.i1(j10);
                tL_communities_togglePeerLinkRequestApproval.reject = !z10;
                r12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new a3.b(1), new s9(r12, j11, b0Var, 2));
                return;
        }
    }

    public lt(vs vsVar, boolean z10, long j10, int i10) {
        this.f16998a = i10;
        this.d = vsVar;
        this.f17000c = z10;
        this.f16999b = j10;
    }
}
