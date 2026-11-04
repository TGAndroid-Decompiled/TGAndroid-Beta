package ci;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c00;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.us;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class cc implements Runnable {
    public final int f4939a;
    public final boolean f4940b;
    public final long f4941c;
    public final Object d;

    public cc(Object obj, long j10, boolean z10, int i3) {
        this.f4939a = i3;
        this.d = obj;
        this.f4941c = j10;
        this.f4940b = z10;
    }

    @Override
    public final void run() {
        int i3 = this.f4939a;
        boolean z10 = this.f4940b;
        long j10 = this.f4941c;
        Object obj = this.d;
        switch (i3) {
            case 0:
                tc tcVar = (tc) obj;
                tcVar.f6066x1 = j10;
                tcVar.f6065w1 = j10;
                if (z10) {
                    ei.u0 u0Var = tcVar.f6067y1;
                    u0Var.f11071c = j10;
                    tcVar.f6068z1.set(u0Var);
                }
                tcVar.M0();
                tcVar.B1.a(true, true);
                sc scVar = tcVar.f6064v1;
                if (scVar != null) {
                    scVar.setMyPrivacy(tcVar.f6065w1);
                    return;
                }
                return;
            case 1:
                gi.o8 o8Var = (gi.o8) obj;
                gi.t8 t8Var = o8Var.f13340a0;
                if (z10) {
                    int i10 = gi.t8.V1;
                    hp.s1(t8Var.f28583a).T2(Long.valueOf(j10), new gi.e8(o8Var, j10, 0), 200);
                    return;
                }
                int i11 = gi.t8.V1;
                hp.s1(t8Var.f28583a).V2(0, j10, true);
                return;
            case 2:
                ji.i0 i0Var = (ji.i0) obj;
                i0Var.f16319i = null;
                i0Var.f16318g.l(j10);
                ArrayList arrayList = i0Var.f16320j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (org.telegram.messenger.m5.o(((TL_communities.CommunityPeerRequest) i0Var.f16320j.get(size)).peer) == j10) {
                            i0Var.f16320j.remove(size);
                        }
                    }
                }
                i0Var.a();
                ji.h0 h0Var = i0Var.h;
                if (h0Var != null) {
                    h0Var.H0();
                }
                hp s12 = hp.s1(i0Var.d);
                long j11 = i0Var.f16316e;
                ji.g0 g0Var = new ji.g0(i0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = s12.h1(j11);
                tL_communities_togglePeerLinkRequestApproval.peer = s12.j1(j10);
                tL_communities_togglePeerLinkRequestApproval.reject = !z10;
                s12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new c3.b(1), new org.telegram.messenger.k9(s12, j11, g0Var, 2));
                return;
            case 3:
                HashSet hashSet = ((us) obj).f25775y;
                if (z10) {
                    hashSet.add(Long.valueOf(j10));
                    return;
                } else {
                    hashSet.remove(Long.valueOf(j10));
                    return;
                }
            default:
                c00 c00Var = (c00) obj;
                c00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j10).apply();
                c00Var.f21922a.l(j10);
                c00Var.f21923b.l(j10);
                c00Var.d.delete(j10);
                c00Var.h.l(j10);
                TLRPC.Chat M0 = c00Var.getMessagesController().M0(Long.valueOf(j10));
                if (M0 != null && (M0.forum || M0.monoforum)) {
                    c00Var.n(0, j10, z10);
                }
                c00Var.y(j10, true);
                return;
        }
    }

    public cc(cs csVar, boolean z10, long j10, int i3) {
        this.f4939a = i3;
        this.d = csVar;
        this.f4940b = z10;
        this.f4941c = j10;
    }
}
