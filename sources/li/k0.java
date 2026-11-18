package li;

import a8.p0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.y3;
import di.vb;
import hi.mb;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o9;
import org.telegram.messenger.v3;
import org.telegram.messenger.z3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
public final class k0 implements mi.e {
    public final Context f19948a;
    public final i6 f19949b;
    public final lc f19950c;
    public final int d;
    public final long f19951e;
    public final TLRPC.Chat f19952f;
    public j0 h;
    public vb f19954i;
    public String f19956k;
    public int f19957l;
    public boolean f19958m;
    public boolean f19959n;
    public long f19960o;
    public int f19961p;
    public u1 f19962q;
    public int f19963r;
    public final a0.h f19953g = new a0.h();
    public ArrayList f19955j = new ArrayList();

    public k0(Context context, i6 i6Var, lc lcVar, int i7, long j3) {
        this.f19948a = context;
        this.f19949b = i6Var;
        this.f19950c = lcVar;
        this.d = i7;
        this.f19951e = j3;
        this.f19952f = mp.u1(i7).O0(Long.valueOf(j3));
        this.f19960o = mp.u1(i7).h7.getLong(p0.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f19961p = 0;
        ArrayList arrayList = this.f19955j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (!this.f19953g.d(n5.o(((TL_communities.CommunityPeerRequest) this.f19955j.get(i7)).peer))) {
                    if (communityPeerRequest.date <= this.f19960o) {
                        return;
                    }
                    this.f19961p++;
                }
            }
        }
    }

    public final void b(e51 e51Var) {
        if (!this.f19958m && !this.f19959n && e51Var.f34606f3.N0() + 10 > e51Var.f34607g3.E.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f19955j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f19955j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i7);
                    long o4 = n5.o(communityPeerRequest.peer);
                    a0.h hVar = this.f19953g;
                    if (hVar == null || !hVar.d(o4)) {
                        TLRPC.User c22 = mp.u1(this.d).c2(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i7 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i10 = mi.g.f21021b;
                        l41 K = l41.K(mi.g.class);
                        K.H = new mi.f(o4, c22, z11);
                        K.I = this;
                        K.f37015j = !z10;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f19959n) {
                arrayList.add(l41.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f19958m && !this.f19959n && v3.y(27, this.f19952f)) {
            this.f19958m = true;
            mp u12 = mp.u1(this.d);
            String str = this.f19956k;
            i0 i0Var = new i0(this, 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = u12.j1(this.f19951e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            u12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new d3.b(1), new z3(3, u12, i0Var));
        }
    }

    public final void e() {
        int i7 = this.d;
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f19960o = currentTime;
        mp.u1(i7).h7.edit().putLong("community_requests_last_view_time_" + this.f19951e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i7;
        String str;
        int i10;
        TextView textView;
        if (this.f19962q == null && this.f19963r == 0) {
            if (z11) {
                if (z10) {
                    i7 = 2131751972;
                } else {
                    i7 = 2131751924;
                }
                String M0 = gd.M0(i7, null);
                if (z10) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.G(this.f19957l, str, new Object[0]));
                if (z10) {
                    i10 = 2131754484;
                } else {
                    i10 = 2131751593;
                }
                u1 M = b5.M(this.f19948a, this.f19949b, M0, W2, gd.M0(i10, null), new ch.k(11, this, z10));
                M.show();
                if (!z10 && (textView = (TextView) M.d(-1)) != null) {
                    u6.U(textView, n6.f29635q7, null);
                    return;
                }
                return;
            }
            vb vbVar = this.f19954i;
            if (vbVar != null) {
                vbVar.run();
            }
            this.f19954i = null;
            u1 u1Var = new u1(3, this.f19948a, this.f19949b);
            this.f19962q = u1Var;
            u1Var.setOnCancelListener(new mb(this, 3));
            this.f19962q.r(500L);
            mp u12 = mp.u1(this.d);
            i0 i0Var = new i0(this, 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j3 = this.f19951e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = u12.j1(j3);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.f19963r = u12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new d3.b(1), new o9(u12, j3, i0Var, 1));
        }
    }

    public final void g(long j3, boolean z10) {
        int i7;
        int i10;
        this.f19953g.k(null, j3);
        this.f19957l--;
        a();
        j0 j0Var = this.h;
        if (j0Var != null) {
            j0Var.F();
        }
        if (z10) {
            i7 = 2131751869;
        } else {
            i7 = 2131751868;
        }
        int i11 = this.d;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, i7, n5.s(i11, j3)));
        vb vbVar = this.f19954i;
        if (vbVar != null) {
            vbVar.run();
        }
        this.f19954i = new vb(this, j3, z10, 2);
        Context context = this.f19948a;
        i6 i6Var = this.f19949b;
        fc fcVar = new fc(context, i6Var, false);
        TLObject g22 = mp.u1(i11).g2(j3);
        e9 e9Var = fcVar.f35063a;
        if (g22 != null) {
            e9Var.setCount(1);
            e9Var.b(0, j10.f24770t0, g22);
            i10 = 1;
        } else {
            i10 = 0;
        }
        e9Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        e9Var.setScaleX(1.333f);
        e9Var.setScaleY(1.333f);
        e9Var.a(false);
        k80 k80Var = fcVar.f35064b;
        k80Var.setSingleLine(false);
        k80Var.setMaxLines(2);
        k80Var.setTextSize(1, 14.0f);
        k80Var.setText(W2);
        if (k80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i10) * 12));
            if (gd.f24213a0) {
                ((ViewGroup.MarginLayoutParams) k80Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) k80Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (gd.f24213a0) {
            e9Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i10 - 1) * 12)));
        }
        ec ecVar = new ec(context, i6Var, true, true);
        ecVar.e(gd.M0(2131743648, null));
        ecVar.f34666b = new y3(this, j3, 13);
        ecVar.f34667c = this.f19954i;
        fcVar.setButton(ecVar);
        this.f19950c.b(fcVar, 5000).j();
    }
}
