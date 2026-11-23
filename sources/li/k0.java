package li;

import a8.p0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.e4;
import di.vb;
import hi.mb;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p9;
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
    public final Context f19945a;
    public final h6 f19946b;
    public final lc f19947c;
    public final int d;
    public final long f19948e;
    public final TLRPC.Chat f19949f;
    public j0 h;
    public vb f19951i;
    public String f19953k;
    public int f19954l;
    public boolean f19955m;
    public boolean f19956n;
    public long f19957o;
    public int f19958p;
    public t1 f19959q;
    public int f19960r;
    public final a0.h f19950g = new a0.h();
    public ArrayList f19952j = new ArrayList();

    public k0(Context context, h6 h6Var, lc lcVar, int i7, long j3) {
        this.f19945a = context;
        this.f19946b = h6Var;
        this.f19947c = lcVar;
        this.d = i7;
        this.f19948e = j3;
        this.f19949f = np.u1(i7).O0(Long.valueOf(j3));
        this.f19957o = np.u1(i7).h7.getLong(p0.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f19958p = 0;
        ArrayList arrayList = this.f19952j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (!this.f19950g.d(n5.o(((TL_communities.CommunityPeerRequest) this.f19952j.get(i7)).peer))) {
                    if (communityPeerRequest.date <= this.f19957o) {
                        return;
                    }
                    this.f19958p++;
                }
            }
        }
    }

    public final void b(h51 h51Var) {
        if (!this.f19955m && !this.f19956n && h51Var.f35741f3.N0() + 10 > h51Var.f35742g3.E.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f19952j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f19952j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i7);
                    long o4 = n5.o(communityPeerRequest.peer);
                    a0.h hVar = this.f19950g;
                    if (hVar == null || !hVar.d(o4)) {
                        TLRPC.User c22 = np.u1(this.d).c2(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i7 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i10 = mi.g.f21018b;
                        o41 K = o41.K(mi.g.class);
                        K.H = new mi.f(o4, c22, z11);
                        K.I = this;
                        K.f38055j = !z10;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f19956n) {
                arrayList.add(o41.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f19955m && !this.f19956n && v3.y(27, this.f19949f)) {
            this.f19955m = true;
            np u12 = np.u1(this.d);
            String str = this.f19953k;
            i0 i0Var = new i0(this, 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = u12.j1(this.f19948e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            u12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new d3.b(1), new z3(3, u12, i0Var));
        }
    }

    public final void e() {
        int i7 = this.d;
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f19957o = currentTime;
        np.u1(i7).h7.edit().putLong("community_requests_last_view_time_" + this.f19948e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i7;
        String str;
        int i10;
        TextView textView;
        if (this.f19959q == null && this.f19960r == 0) {
            if (z11) {
                if (z10) {
                    i7 = 2131751971;
                } else {
                    i7 = 2131751923;
                }
                String N0 = hd.N0(i7, null);
                if (z10) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.G(this.f19954l, str, new Object[0]));
                if (z10) {
                    i10 = 2131754483;
                } else {
                    i10 = 2131751592;
                }
                t1 M = c5.M(this.f19945a, this.f19946b, N0, W2, hd.N0(i10, null), new ch.k(11, this, z10));
                M.show();
                if (!z10 && (textView = (TextView) M.d(-1)) != null) {
                    t6.U(textView, m6.f29588q7, null);
                    return;
                }
                return;
            }
            vb vbVar = this.f19951i;
            if (vbVar != null) {
                vbVar.run();
            }
            this.f19951i = null;
            t1 t1Var = new t1(3, this.f19945a, this.f19946b);
            this.f19959q = t1Var;
            t1Var.setOnCancelListener(new mb(this, 3));
            this.f19959q.r(500L);
            np u12 = np.u1(this.d);
            i0 i0Var = new i0(this, 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j3 = this.f19948e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = u12.j1(j3);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.f19960r = u12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new d3.b(1), new p9(u12, j3, i0Var, 1));
        }
    }

    public final void g(long j3, boolean z10) {
        int i7;
        int i10;
        this.f19950g.k(null, j3);
        this.f19954l--;
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
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.a0(null, null, i7, n5.s(i11, j3)));
        vb vbVar = this.f19951i;
        if (vbVar != null) {
            vbVar.run();
        }
        this.f19951i = new vb(this, j3, z10, 2);
        Context context = this.f19945a;
        h6 h6Var = this.f19946b;
        fc fcVar = new fc(context, h6Var, false);
        TLObject g22 = np.u1(i11).g2(j3);
        e9 e9Var = fcVar.f35175a;
        if (g22 != null) {
            e9Var.setCount(1);
            e9Var.b(0, k10.f24932t0, g22);
            i10 = 1;
        } else {
            i10 = 0;
        }
        e9Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        e9Var.setScaleX(1.333f);
        e9Var.setScaleY(1.333f);
        e9Var.a(false);
        m80 m80Var = fcVar.f35176b;
        m80Var.setSingleLine(false);
        m80Var.setMaxLines(2);
        m80Var.setTextSize(1, 14.0f);
        m80Var.setText(W2);
        if (m80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i10) * 12));
            if (hd.f24408a0) {
                ((ViewGroup.MarginLayoutParams) m80Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) m80Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (hd.f24408a0) {
            e9Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i10 - 1) * 12)));
        }
        ec ecVar = new ec(context, h6Var, true, true);
        ecVar.e(hd.N0(2131743642, null));
        ecVar.f34715b = new e4(this, j3, 13);
        ecVar.f34716c = this.f19951i;
        fcVar.setButton(ecVar);
        this.f19947c.b(fcVar, 5000).j();
    }
}
