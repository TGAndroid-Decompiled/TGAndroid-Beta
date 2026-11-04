package ji;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.cc;
import ci.e1;
import ci.e3;
import gi.ob;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.k9;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.yb;
import org.telegram.ui.Components.zb;
public final class i0 implements ki.e {
    public final Context f16313a;
    public final e6 f16314b;
    public final fc f16315c;
    public final int d;
    public final long f16316e;
    public final TLRPC.Chat f16317f;
    public h0 h;
    public cc f16319i;
    public String f16321k;
    public int f16322l;
    public boolean f16323m;
    public boolean f16324n;
    public long f16325o;
    public int f16326p;
    public s1 f16327q;
    public int f16328r;
    public final a0.h f16318g = new a0.h();
    public ArrayList f16320j = new ArrayList();

    public i0(Context context, e6 e6Var, fc fcVar, int i3, long j10) {
        this.f16313a = context;
        this.f16314b = e6Var;
        this.f16315c = fcVar;
        this.d = i3;
        this.f16316e = j10;
        this.f16317f = hp.s1(i3).M0(Long.valueOf(j10));
        this.f16325o = hp.s1(i3).f22999e7.getLong(a1.g.p(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f16326p = 0;
        ArrayList arrayList = this.f16320j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!this.f16318g.d(m5.o(((TL_communities.CommunityPeerRequest) this.f16320j.get(i3)).peer))) {
                    if (communityPeerRequest.date <= this.f16325o) {
                        return;
                    }
                    this.f16326p++;
                }
            }
        }
    }

    public final void b(l41 l41Var) {
        if (!this.f16323m && !this.f16324n && l41Var.f35593f3.N0() + 10 > l41Var.f35594g3.E.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f16320j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f16320j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i3);
                    long o10 = m5.o(communityPeerRequest.peer);
                    a0.h hVar = this.f16318g;
                    if (hVar == null || !hVar.d(o10)) {
                        TLRPC.User a22 = hp.s1(this.d).a2(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i3 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i10 = ki.g.f17328b;
                        r31 K = r31.K(ki.g.class);
                        K.G = new ki.f(o10, a22, z11);
                        K.H = this;
                        K.f37625j = !z10;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f16324n) {
                arrayList.add(r31.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f16323m && !this.f16324n && t3.y(27, this.f16317f)) {
            this.f16323m = true;
            hp s12 = hp.s1(this.d);
            String str = this.f16321k;
            g0 g0Var = new g0(this, 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = s12.h1(this.f16316e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            s12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new c3.b(1), new x3(2, s12, g0Var));
        }
    }

    public final void e() {
        int i3 = this.d;
        long currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        this.f16325o = currentTime;
        hp.s1(i3).f22999e7.edit().putLong("community_requests_last_view_time_" + this.f16316e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i3;
        String str;
        int i10;
        TextView textView;
        if (this.f16327q == null && this.f16328r == 0) {
            if (z11) {
                if (z10) {
                    i3 = 2131751983;
                } else {
                    i3 = 2131751935;
                }
                String M0 = bd.M0(i3, null);
                if (z10) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.G(this.f16322l, str, new Object[0]));
                if (z10) {
                    i10 = 2131754486;
                } else {
                    i10 = 2131751605;
                }
                s1 O = t4.O(this.f16313a, this.f16314b, M0, X2, bd.M0(i10, null), new e1(11, this, z10));
                O.show();
                if (!z10 && (textView = (TextView) O.d(-1)) != null) {
                    r6.V(textView, k6.f28122q7, null);
                    return;
                }
                return;
            }
            cc ccVar = this.f16319i;
            if (ccVar != null) {
                ccVar.run();
            }
            this.f16319i = null;
            s1 s1Var = new s1(3, this.f16313a, this.f16314b);
            this.f16327q = s1Var;
            s1Var.setOnCancelListener(new ob(this, 3));
            this.f16327q.r(500L);
            hp s12 = hp.s1(this.d);
            g0 g0Var = new g0(this, 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j10 = this.f16316e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = s12.h1(j10);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.f16328r = s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new c3.b(1), new k9(s12, j10, g0Var, 1));
        }
    }

    public final void g(long j10, boolean z10) {
        int i3;
        int i10;
        this.f16318g.k(null, j10);
        this.f16322l--;
        a();
        h0 h0Var = this.h;
        if (h0Var != null) {
            h0Var.H0();
        }
        if (z10) {
            i3 = 2131751880;
        } else {
            i3 = 2131751879;
        }
        int i11 = this.d;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, i3, m5.s(i11, j10)));
        cc ccVar = this.f16319i;
        if (ccVar != null) {
            ccVar.run();
        }
        this.f16319i = new cc(this, j10, z10, 2);
        Context context = this.f16313a;
        e6 e6Var = this.f16314b;
        zb zbVar = new zb(context, e6Var, false);
        TLObject e22 = hp.s1(i11).e2(j10);
        x8 x8Var = zbVar.f40994a;
        if (e22 != null) {
            x8Var.setCount(1);
            x8Var.b(0, h10.f22829t0, e22);
            i10 = 1;
        } else {
            i10 = 0;
        }
        x8Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        x8Var.setScaleX(1.333f);
        x8Var.setScaleY(1.333f);
        x8Var.a(false);
        s70 s70Var = zbVar.f40995b;
        s70Var.setSingleLine(false);
        s70Var.setMaxLines(2);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setText(X2);
        if (s70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i10) * 12));
            if (bd.f21784a0) {
                ((ViewGroup.MarginLayoutParams) s70Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) s70Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (bd.f21784a0) {
            x8Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i10 - 1) * 12)));
        }
        yb ybVar = new yb(context, e6Var, true, true);
        ybVar.e(bd.M0(2131743895, null));
        ybVar.f40672b = new e3(this, j10, 11);
        ybVar.f40673c = this.f16319i;
        zbVar.setButton(ybVar);
        this.f16315c.b(zbVar, 5000).j();
    }
}
