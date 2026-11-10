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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.zb;
public final class l0 implements ji.e {
    public final Context f15560a;
    public final h6 f15561b;
    public final gc f15562c;
    public final int d;
    public final long f15563e;
    public final TLRPC.Chat f15564f;
    public k0 h;
    public kd f15566i;
    public String f15568k;
    public int f15569l;
    public boolean f15570m;
    public boolean f15571n;
    public long f15572o;
    public int f15573p;
    public u1 f15574q;
    public int f15575r;
    public final a0.h f15565g = new a0.h();
    public ArrayList f15567j = new ArrayList();

    public l0(Context context, h6 h6Var, gc gcVar, int i7, long j3) {
        this.f15560a = context;
        this.f15561b = h6Var;
        this.f15562c = gcVar;
        this.d = i7;
        this.f15563e = j3;
        this.f15564f = qp.s1(i7).M0(Long.valueOf(j3));
        this.f15572o = qp.s1(i7).f24778e7.getLong(p0.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f15573p = 0;
        ArrayList arrayList = this.f15567j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (!this.f15565g.d(m5.o(((TL_communities.CommunityPeerRequest) this.f15567j.get(i7)).peer))) {
                    if (communityPeerRequest.date <= this.f15572o) {
                        return;
                    }
                    this.f15573p++;
                }
            }
        }
    }

    public final void b(r41 r41Var) {
        if (!this.f15570m && !this.f15571n && r41Var.f37495e3.N0() + 10 > r41Var.f37496f3.D.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z9;
        ArrayList arrayList2 = this.f15567j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f15567j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i7);
                    long o4 = m5.o(communityPeerRequest.peer);
                    a0.h hVar = this.f15565g;
                    if (hVar == null || !hVar.d(o4)) {
                        TLRPC.User a22 = qp.s1(this.d).a2(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z10 = !communityPeerRequest.visible;
                        if (i7 < size - 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i10 = ji.g.f17086b;
                        x31 K = x31.K(ji.g.class);
                        K.G = new ji.f(o4, a22, z10);
                        K.H = this;
                        K.f40154j = !z9;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f15571n) {
                arrayList.add(x31.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f15570m && !this.f15571n && t3.y(27, this.f15564f)) {
            this.f15570m = true;
            qp s12 = qp.s1(this.d);
            String str = this.f15568k;
            j0 j0Var = new j0(this, 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = s12.h1(this.f15563e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            s12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new d3.b(1), new x3(3, s12, j0Var));
        }
    }

    public final void e() {
        int i7 = this.d;
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f15572o = currentTime;
        qp.s1(i7).f24778e7.edit().putLong("community_requests_last_view_time_" + this.f15563e, currentTime).apply();
        a();
    }

    public final void f(boolean z9, boolean z10) {
        int i7;
        String str;
        int i10;
        TextView textView;
        if (this.f15574q == null && this.f15575r == 0) {
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
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.G(this.f15569l, str, new Object[0]));
                if (z9) {
                    i10 = 2131754486;
                } else {
                    i10 = 2131751604;
                }
                u1 M = u4.M(this.f15560a, this.f15561b, M0, X2, id.M0(i10, null), new k1(11, this, z9));
                M.show();
                if (!z9 && (textView = (TextView) M.d(-1)) != null) {
                    t6.U(textView, m6.f28131q7, null);
                    return;
                }
                return;
            }
            kd kdVar = this.f15566i;
            if (kdVar != null) {
                kdVar.run();
            }
            this.f15566i = null;
            u1 u1Var = new u1(3, this.f15560a, this.f15561b);
            this.f15574q = u1Var;
            u1Var.setOnCancelListener(new ob(this, 3));
            this.f15574q.r(500L);
            qp s12 = qp.s1(this.d);
            j0 j0Var = new j0(this, 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j3 = this.f15563e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = s12.h1(j3);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z9;
            this.f15575r = s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new d3.b(1), new q9(s12, j3, j0Var, 1));
        }
    }

    public final void g(long j3, boolean z9) {
        int i7;
        int i10;
        this.f15565g.k(null, j3);
        this.f15569l--;
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
        kd kdVar = this.f15566i;
        if (kdVar != null) {
            kdVar.run();
        }
        this.f15566i = new kd(this, j3, z9, 2);
        Context context = this.f15560a;
        h6 h6Var = this.f15561b;
        ac acVar = new ac(context, h6Var, false);
        TLObject e22 = qp.s1(i11).e2(j3);
        y8 y8Var = acVar.f31812a;
        if (e22 != null) {
            y8Var.setCount(1);
            y8Var.b(0, p10.f24474s0, e22);
            i10 = 1;
        } else {
            i10 = 0;
        }
        y8Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        y8Var.setScaleX(1.333f);
        y8Var.setScaleY(1.333f);
        y8Var.a(false);
        w70 w70Var = acVar.f31813b;
        w70Var.setSingleLine(false);
        w70Var.setMaxLines(2);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setText(X2);
        if (w70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i10) * 12));
            if (id.f23161a0) {
                ((ViewGroup.MarginLayoutParams) w70Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) w70Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (id.f23161a0) {
            y8Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i10 - 1) * 12)));
        }
        zb zbVar = new zb(context, h6Var, true, true);
        zbVar.e(id.M0(2131743885, null));
        zbVar.f40908b = new r3(this, j3, 11);
        zbVar.f40909c = this.f15566i;
        acVar.setButton(zbVar);
        this.f15562c.b(acVar, 5000).j();
    }
}
