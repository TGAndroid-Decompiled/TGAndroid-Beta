package ii;

import a8.p0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.k1;
import bi.kd;
import bi.r3;
import fi.ob;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.q9;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.z8;
public final class l0 implements ji.e {
    public final Context f15561a;
    public final g6 f15562b;
    public final hc f15563c;
    public final int d;
    public final long f15564e;
    public final TLRPC.Chat f15565f;
    public k0 h;
    public kd f15567i;
    public String f15569k;
    public int f15570l;
    public boolean f15571m;
    public boolean f15572n;
    public long f15573o;
    public int f15574p;
    public u1 f15575q;
    public int f15576r;
    public final a0.h f15566g = new a0.h();
    public ArrayList f15568j = new ArrayList();

    public l0(Context context, g6 g6Var, hc hcVar, int i7, long j3) {
        this.f15561a = context;
        this.f15562b = g6Var;
        this.f15563c = hcVar;
        this.d = i7;
        this.f15564e = j3;
        this.f15565f = qp.s1(i7).M0(Long.valueOf(j3));
        this.f15573o = qp.s1(i7).f24774e7.getLong(p0.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f15574p = 0;
        ArrayList arrayList = this.f15568j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (!this.f15566g.d(m5.o(((TL_communities.CommunityPeerRequest) this.f15568j.get(i7)).peer))) {
                    if (communityPeerRequest.date <= this.f15573o) {
                        return;
                    }
                    this.f15574p++;
                }
            }
        }
    }

    public final void b(r41 r41Var) {
        if (!this.f15571m && !this.f15572n && r41Var.f37555e3.N0() + 10 > r41Var.f37556f3.D.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z9;
        ArrayList arrayList2 = this.f15568j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f15568j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i7);
                    long o4 = m5.o(communityPeerRequest.peer);
                    a0.h hVar = this.f15566g;
                    if (hVar == null || !hVar.d(o4)) {
                        TLRPC.User a22 = qp.s1(this.d).a2(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z10 = !communityPeerRequest.visible;
                        if (i7 < size - 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i10 = ji.g.f17086b;
                        y31 K = y31.K(ji.g.class);
                        K.G = new ji.f(o4, a22, z10);
                        K.H = this;
                        K.f40566j = !z9;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f15572n) {
                arrayList.add(y31.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f15571m && !this.f15572n && t3.y(27, this.f15565f)) {
            this.f15571m = true;
            qp s12 = qp.s1(this.d);
            String str = this.f15569k;
            j0 j0Var = new j0(this, 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = s12.h1(this.f15564e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            s12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new d3.b(1), new x3(3, s12, j0Var));
        }
    }

    public final void e() {
        int i7 = this.d;
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f15573o = currentTime;
        qp.s1(i7).f24774e7.edit().putLong("community_requests_last_view_time_" + this.f15564e, currentTime).apply();
        a();
    }

    public final void f(boolean z9, boolean z10) {
        int i7;
        String str;
        int i10;
        TextView textView;
        if (this.f15575q == null && this.f15576r == 0) {
            if (z10) {
                if (z9) {
                    i7 = 2131751983;
                } else {
                    i7 = 2131751935;
                }
                String M0 = id.M0(i7, null);
                if (z9) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.G(this.f15570l, str, new Object[0]));
                if (z9) {
                    i10 = 2131754486;
                } else {
                    i10 = 2131751604;
                }
                u1 M = v4.M(this.f15561a, this.f15562b, M0, X2, id.M0(i10, null), new k1(11, this, z9));
                M.show();
                if (!z9 && (textView = (TextView) M.d(-1)) != null) {
                    s6.U(textView, l6.f28106q7, null);
                    return;
                }
                return;
            }
            kd kdVar = this.f15567i;
            if (kdVar != null) {
                kdVar.run();
            }
            this.f15567i = null;
            u1 u1Var = new u1(3, this.f15561a, this.f15562b);
            this.f15575q = u1Var;
            u1Var.setOnCancelListener(new ob(this, 3));
            this.f15575q.r(500L);
            qp s12 = qp.s1(this.d);
            j0 j0Var = new j0(this, 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j3 = this.f15564e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = s12.h1(j3);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z9;
            this.f15576r = s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new d3.b(1), new q9(s12, j3, j0Var, 1));
        }
    }

    public final void g(long j3, boolean z9) {
        int i7;
        int i10;
        this.f15566g.k(null, j3);
        this.f15570l--;
        a();
        k0 k0Var = this.h;
        if (k0Var != null) {
            k0Var.u();
        }
        if (z9) {
            i7 = 2131751880;
        } else {
            i7 = 2131751879;
        }
        int i11 = this.d;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.a0(null, null, i7, m5.s(i11, j3)));
        kd kdVar = this.f15567i;
        if (kdVar != null) {
            kdVar.run();
        }
        this.f15567i = new kd(this, j3, z9, 2);
        Context context = this.f15561a;
        g6 g6Var = this.f15562b;
        bc bcVar = new bc(context, g6Var, false);
        TLObject e22 = qp.s1(i11).e2(j3);
        z8 z8Var = bcVar.f32206a;
        if (e22 != null) {
            z8Var.setCount(1);
            z8Var.b(0, p10.f24470s0, e22);
            i10 = 1;
        } else {
            i10 = 0;
        }
        z8Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        z8Var.setScaleX(1.333f);
        z8Var.setScaleY(1.333f);
        z8Var.a(false);
        x70 x70Var = bcVar.f32207b;
        x70Var.setSingleLine(false);
        x70Var.setMaxLines(2);
        x70Var.setTextSize(1, 14.0f);
        x70Var.setText(X2);
        if (x70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i10) * 12));
            if (id.f23157a0) {
                ((ViewGroup.MarginLayoutParams) x70Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) x70Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (id.f23157a0) {
            z8Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i10 - 1) * 12)));
        }
        ac acVar = new ac(context, g6Var, true, true);
        acVar.e(id.M0(2131743885, null));
        acVar.f31766b = new r3(this, j3, 11);
        acVar.f31767c = this.f15567i;
        bcVar.setButton(acVar);
        this.f15563c.b(bcVar, 5000).j();
    }
}
