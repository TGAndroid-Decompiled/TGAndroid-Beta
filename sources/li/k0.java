package li;

import a8.p0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import di.sb;
import di.x2;
import hi.lb;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.p9;
import org.telegram.messenger.t3;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z70;
public final class k0 implements mi.e {
    public final Context f19591a;
    public final e6 f19592b;
    public final cc f19593c;
    public final int d;
    public final long f19594e;
    public final TLRPC.Chat f19595f;
    public j0 h;
    public sb f19597i;
    public String f19599k;
    public int f19600l;
    public boolean f19601m;
    public boolean f19602n;
    public long f19603o;
    public int f19604p;
    public t1 f19605q;
    public int f19606r;
    public final a0.h f19596g = new a0.h();
    public ArrayList f19598j = new ArrayList();

    public k0(Context context, e6 e6Var, cc ccVar, int i7, long j3) {
        this.f19591a = context;
        this.f19592b = e6Var;
        this.f19593c = ccVar;
        this.d = i7;
        this.f19594e = j3;
        this.f19595f = np.s1(i7).M0(Long.valueOf(j3));
        this.f19603o = np.s1(i7).f25280f7.getLong(p0.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f19604p = 0;
        ArrayList arrayList = this.f19598j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (!this.f19596g.d(m5.o(((TL_communities.CommunityPeerRequest) this.f19598j.get(i7)).peer))) {
                    if (communityPeerRequest.date <= this.f19603o) {
                        return;
                    }
                    this.f19604p++;
                }
            }
        }
    }

    public final void b(u41 u41Var) {
        if (!this.f19601m && !this.f19602n && u41Var.f39894f3.N0() + 10 > u41Var.f39895g3.E.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f19598j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f19598j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i7);
                    long o4 = m5.o(communityPeerRequest.peer);
                    a0.h hVar = this.f19596g;
                    if (hVar == null || !hVar.d(o4)) {
                        TLRPC.User a22 = np.s1(this.d).a2(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i7 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i10 = mi.g.f20660b;
                        b41 K = b41.K(mi.g.class);
                        K.G = new mi.f(o4, a22, z11);
                        K.H = this;
                        K.f33179j = !z10;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f19602n) {
                arrayList.add(b41.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f19601m && !this.f19602n && t3.y(27, this.f19595f)) {
            this.f19601m = true;
            np s12 = np.s1(this.d);
            String str = this.f19599k;
            i0 i0Var = new i0(this, 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = s12.h1(this.f19594e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            s12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new d3.b(1), new x3(3, s12, i0Var));
        }
    }

    public final void e() {
        int i7 = this.d;
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f19603o = currentTime;
        np.s1(i7).f25280f7.edit().putLong("community_requests_last_view_time_" + this.f19594e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i7;
        String str;
        int i10;
        TextView textView;
        if (this.f19605q == null && this.f19606r == 0) {
            if (z11) {
                if (z10) {
                    i7 = 2131751983;
                } else {
                    i7 = 2131751935;
                }
                String M0 = hd.M0(i7, null);
                if (z10) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.G(this.f19600l, str, new Object[0]));
                if (z10) {
                    i10 = 2131754486;
                } else {
                    i10 = 2131751604;
                }
                t1 M = t4.M(this.f19591a, this.f19592b, M0, X2, hd.M0(i10, null), new ai.q(12, this, z10));
                M.show();
                if (!z10 && (textView = (TextView) M.d(-1)) != null) {
                    q6.U(textView, j6.f29090q7, null);
                    return;
                }
                return;
            }
            sb sbVar = this.f19597i;
            if (sbVar != null) {
                sbVar.run();
            }
            this.f19597i = null;
            t1 t1Var = new t1(3, this.f19591a, this.f19592b);
            this.f19605q = t1Var;
            t1Var.setOnCancelListener(new lb(this, 3));
            this.f19605q.r(500L);
            np s12 = np.s1(this.d);
            i0 i0Var = new i0(this, 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j3 = this.f19594e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = s12.h1(j3);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.f19606r = s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new d3.b(1), new p9(s12, j3, i0Var, 1));
        }
    }

    public final void g(long j3, boolean z10) {
        int i7;
        int i10;
        this.f19596g.k(null, j3);
        this.f19600l--;
        a();
        j0 j0Var = this.h;
        if (j0Var != null) {
            j0Var.I();
        }
        if (z10) {
            i7 = 2131751880;
        } else {
            i7 = 2131751879;
        }
        int i11 = this.d;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, i7, m5.s(i11, j3)));
        sb sbVar = this.f19597i;
        if (sbVar != null) {
            sbVar.run();
        }
        this.f19597i = new sb(this, j3, z10, 2);
        Context context = this.f19591a;
        e6 e6Var = this.f19592b;
        wb wbVar = new wb(context, e6Var, false);
        TLObject e22 = np.s1(i11).e2(j3);
        w8 w8Var = wbVar.f41320a;
        if (e22 != null) {
            w8Var.setCount(1);
            w8Var.b(0, m10.f24934t0, e22);
            i10 = 1;
        } else {
            i10 = 0;
        }
        w8Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        w8Var.setScaleX(1.333f);
        w8Var.setScaleY(1.333f);
        w8Var.a(false);
        z70 z70Var = wbVar.f41321b;
        z70Var.setSingleLine(false);
        z70Var.setMaxLines(2);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setText(X2);
        if (z70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i10) * 12));
            if (hd.f24101a0) {
                ((ViewGroup.MarginLayoutParams) z70Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) z70Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (hd.f24101a0) {
            w8Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i10 - 1) * 12)));
        }
        vb vbVar = new vb(context, e6Var, true, true);
        vbVar.e(hd.M0(2131743885, null));
        vbVar.f40369b = new x2(this, j3, 12);
        vbVar.f40370c = this.f19597i;
        wbVar.setButton(vbVar);
        this.f19593c.b(wbVar, 5000).j();
    }
}
