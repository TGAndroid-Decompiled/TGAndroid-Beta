package li;

import a8.p0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.e4;
import di.vb;
import hi.gc;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
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
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;
public final class j0 implements mi.e {
    public final Context f20042a;
    public final i6 f20043b;
    public final kc f20044c;
    public final int d;
    public final long f20045e;
    public final TLRPC.Chat f20046f;
    public i0 h;
    public vb f20048i;
    public String f20050k;
    public int f20051l;
    public boolean f20052m;
    public boolean f20053n;
    public long f20054o;
    public int f20055p;
    public t1 f20056q;
    public int f20057r;
    public final a0.h f20047g = new a0.h();
    public ArrayList f20049j = new ArrayList();

    public j0(Context context, i6 i6Var, kc kcVar, int i7, long j3) {
        this.f20042a = context;
        this.f20043b = i6Var;
        this.f20044c = kcVar;
        this.d = i7;
        this.f20045e = j3;
        this.f20046f = mp.u1(i7).O0(Long.valueOf(j3));
        this.f20054o = mp.u1(i7).h7.getLong(p0.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f20055p = 0;
        ArrayList arrayList = this.f20049j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (!this.f20047g.d(n5.o(((TL_communities.CommunityPeerRequest) this.f20049j.get(i7)).peer))) {
                    if (communityPeerRequest.date <= this.f20054o) {
                        return;
                    }
                    this.f20055p++;
                }
            }
        }
    }

    public final void b(g51 g51Var) {
        if (!this.f20052m && !this.f20053n && g51Var.f35322f3.N0() + 10 > g51Var.f35323g3.E.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f20049j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f20049j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i7);
                    long o4 = n5.o(communityPeerRequest.peer);
                    a0.h hVar = this.f20047g;
                    if (hVar == null || !hVar.d(o4)) {
                        TLRPC.User c22 = mp.u1(this.d).c2(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i7 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i10 = mi.g.f21114b;
                        n41 K = n41.K(mi.g.class);
                        K.H = new mi.f(o4, c22, z11);
                        K.I = this;
                        K.f37652j = !z10;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.f20053n) {
                arrayList.add(n41.p(29));
            }
        }
    }

    public final void d() {
        if (!this.f20052m && !this.f20053n && v3.y(27, this.f20046f)) {
            this.f20052m = true;
            mp u12 = mp.u1(this.d);
            String str = this.f20050k;
            h0 h0Var = new h0(this, 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = u12.j1(this.f20045e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            u12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new d3.b(1), new z3(3, u12, h0Var));
        }
    }

    public final void e() {
        int i7 = this.d;
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.f20054o = currentTime;
        mp.u1(i7).h7.edit().putLong("community_requests_last_view_time_" + this.f20045e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i7;
        String str;
        int i10;
        TextView textView;
        if (this.f20056q == null && this.f20057r == 0) {
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
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.G(this.f20051l, str, new Object[0]));
                if (z10) {
                    i10 = 2131754483;
                } else {
                    i10 = 2131751592;
                }
                t1 M = b5.M(this.f20042a, this.f20043b, N0, W2, gd.N0(i10, null), new ch.k(11, this, z10));
                M.show();
                if (!z10 && (textView = (TextView) M.d(-1)) != null) {
                    u6.U(textView, n6.f29692q7, null);
                    return;
                }
                return;
            }
            vb vbVar = this.f20048i;
            if (vbVar != null) {
                vbVar.run();
            }
            this.f20048i = null;
            t1 t1Var = new t1(3, this.f20042a, this.f20043b);
            this.f20056q = t1Var;
            t1Var.setOnCancelListener(new gc(this, 3));
            this.f20056q.r(500L);
            mp u12 = mp.u1(this.d);
            h0 h0Var = new h0(this, 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j3 = this.f20045e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = u12.j1(j3);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.f20057r = u12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new d3.b(1), new o9(u12, j3, h0Var, 1));
        }
    }

    public final void g(long j3, boolean z10) {
        int i7;
        int i10;
        this.f20047g.k(null, j3);
        this.f20051l--;
        a();
        i0 i0Var = this.h;
        if (i0Var != null) {
            i0Var.o();
        }
        if (z10) {
            i7 = 2131751868;
        } else {
            i7 = 2131751867;
        }
        int i11 = this.d;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, i7, n5.s(i11, j3)));
        vb vbVar = this.f20048i;
        if (vbVar != null) {
            vbVar.run();
        }
        this.f20048i = new vb(this, j3, z10, 2);
        Context context = this.f20042a;
        i6 i6Var = this.f20043b;
        ec ecVar = new ec(context, i6Var, false);
        TLObject g22 = mp.u1(i11).g2(j3);
        d9 d9Var = ecVar.f34685a;
        if (g22 != null) {
            d9Var.setCount(1);
            d9Var.b(0, i10.f24637t0, g22);
            i10 = 1;
        } else {
            i10 = 0;
        }
        d9Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        d9Var.setScaleX(1.333f);
        d9Var.setScaleY(1.333f);
        d9Var.a(false);
        j80 j80Var = ecVar.f34686b;
        j80Var.setSingleLine(false);
        j80Var.setMaxLines(2);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setText(W2);
        if (j80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i10) * 12));
            if (gd.f24314a0) {
                ((ViewGroup.MarginLayoutParams) j80Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) j80Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (gd.f24314a0) {
            d9Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i10 - 1) * 12)));
        }
        dc dcVar = new dc(context, i6Var, true, true);
        dcVar.e(gd.N0(2131743638, null));
        dcVar.f34267b = new e4(this, j3, 13);
        dcVar.f34268c = this.f20048i;
        ecVar.setButton(dcVar);
        this.f20044c.b(ecVar, 5000).j();
    }
}
