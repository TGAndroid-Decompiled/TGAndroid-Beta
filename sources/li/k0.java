package li;

import a8.p0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.c4;
import di.vb;
import hi.lb;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.o41;
public final class k0 implements mi.e {
    public final Context f19976a;
    public final h6 f19977b;
    public final lc f19978c;
    public final int d;
    public final long f19979e;
    public final TLRPC.Chat f19980f;
    public j0 h;
    public vb f19982i;
    public String f19984k;
    public int f19985l;
    public boolean f19986m;
    public boolean f19987n;
    public long f19988o;
    public int f19989p;
    public t1 f19990q;
    public int f19991r;
    public final a0.h f19981g = new a0.h();
    public ArrayList f19983j = new ArrayList();

    public k0(Context context, h6 h6Var, lc lcVar, int i7, long j3) {
        this.f19976a = context;
        this.f19977b = h6Var;
        this.f19978c = lcVar;
        this.d = i7;
        this.f19979e = j3;
        this.f19980f = mp.u1(i7).O0(Long.valueOf(j3));
        this.f19988o = mp.u1(i7).h7.getLong(p0.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f19989p = 0;
        ArrayList arrayList = this.f19983j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (!this.f19981g.d(n5.o(((TL_communities.CommunityPeerRequest) this.f19983j.get(i7)).peer))) {
                    if (communityPeerRequest.date <= this.f19988o) {
                        return;
                    }
                    this.f19989p++;
                }
            }
        }
    }

    public final void b(h51 h51Var) {
        if (!this.f19986m && !this.f19987n && h51Var.f35795f3.N0() + 10 > h51Var.f35796g3.E.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f19983j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f19983j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i7);
                    long o4 = n5.o(communityPeerRequest.peer);
                    a0.h hVar = this.f19981g;
                    if (hVar == null || !hVar.d(o4)) {
                        TLRPC.User c22 = mp.u1(this.d).c2(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i7 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i10 = mi.g.f21049b;
                        o41 K = o41.K(mi.g.class);
                        K.H = new mi.f(o4, c22, z11);
                        K.I = this;
                        K.f38095j = !z10;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f19987n) {
                arrayList.add(o41.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f19986m && !this.f19987n && v3.y(27, this.f19980f)) {
            this.f19986m = true;
            mp u12 = mp.u1(this.d);
            String str = this.f19984k;
            i0 i0Var = new i0(this, 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = u12.j1(this.f19979e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            u12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new d3.b(1), new z3(3, u12, i0Var));
        }
    }

    public final void e() {
        int i7 = this.d;
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f19988o = currentTime;
        mp.u1(i7).h7.edit().putLong("community_requests_last_view_time_" + this.f19979e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i7;
        String str;
        int i10;
        TextView textView;
        if (this.f19990q == null && this.f19991r == 0) {
            if (z11) {
                if (z10) {
                    i7 = 2131751971;
                } else {
                    i7 = 2131751923;
                }
                String N0 = gd.N0(i7, null);
                if (z10) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.G(this.f19985l, str, new Object[0]));
                if (z10) {
                    i10 = 2131754483;
                } else {
                    i10 = 2131751592;
                }
                t1 M = c5.M(this.f19976a, this.f19977b, N0, W2, gd.N0(i10, null), new ch.k(11, this, z10));
                M.show();
                if (!z10 && (textView = (TextView) M.d(-1)) != null) {
                    t6.U(textView, m6.f29619q7, null);
                    return;
                }
                return;
            }
            vb vbVar = this.f19982i;
            if (vbVar != null) {
                vbVar.run();
            }
            this.f19982i = null;
            t1 t1Var = new t1(3, this.f19976a, this.f19977b);
            this.f19990q = t1Var;
            t1Var.setOnCancelListener(new lb(this, 3));
            this.f19990q.r(500L);
            mp u12 = mp.u1(this.d);
            i0 i0Var = new i0(this, 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j3 = this.f19979e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = u12.j1(j3);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.f19991r = u12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new d3.b(1), new o9(u12, j3, i0Var, 1));
        }
    }

    public final void g(long j3, boolean z10) {
        int i7;
        int i10;
        this.f19981g.k(null, j3);
        this.f19985l--;
        a();
        j0 j0Var = this.h;
        if (j0Var != null) {
            j0Var.F();
        }
        if (z10) {
            i7 = 2131751868;
        } else {
            i7 = 2131751867;
        }
        int i11 = this.d;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, i7, n5.s(i11, j3)));
        vb vbVar = this.f19982i;
        if (vbVar != null) {
            vbVar.run();
        }
        this.f19982i = new vb(this, j3, z10, 2);
        Context context = this.f19976a;
        h6 h6Var = this.f19977b;
        fc fcVar = new fc(context, h6Var, false);
        TLObject g22 = mp.u1(i11).g2(j3);
        e9 e9Var = fcVar.f35198a;
        if (g22 != null) {
            e9Var.setCount(1);
            e9Var.b(0, j10.f24798t0, g22);
            i10 = 1;
        } else {
            i10 = 0;
        }
        e9Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        e9Var.setScaleX(1.333f);
        e9Var.setScaleY(1.333f);
        e9Var.a(false);
        m80 m80Var = fcVar.f35199b;
        m80Var.setSingleLine(false);
        m80Var.setMaxLines(2);
        m80Var.setTextSize(1, 14.0f);
        m80Var.setText(W2);
        if (m80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i10) * 12));
            if (gd.f24241a0) {
                ((ViewGroup.MarginLayoutParams) m80Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) m80Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (gd.f24241a0) {
            e9Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i10 - 1) * 12)));
        }
        ec ecVar = new ec(context, h6Var, true, true);
        ecVar.e(gd.N0(2131743642, null));
        ecVar.f34727b = new c4(this, j3, 13);
        ecVar.f34728c = this.f19982i;
        fcVar.setButton(ecVar);
        this.f19978c.b(fcVar, 5000).j();
    }
}
