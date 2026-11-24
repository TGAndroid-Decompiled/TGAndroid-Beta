package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
public final class mo2 implements jn2 {
    public final Context a;
    public final wjb b;
    public final u21 c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public lo2 h;
    public ko2 i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public hd q;
    public int r;
    public final vf6 g = new vf6();
    public final ArrayList j = new ArrayList();

    public mo2(Context context, wjb wjbVar, u21 u21Var, int i, long j) {
        this.a = context;
        this.b = wjbVar;
        this.c = u21Var;
        this.d = i;
        this.e = j;
        this.f = na7.q1(i).K0(Long.valueOf(j));
        this.o = na7.q1(i).X3.getLong(ls6.n(j, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.p = 0;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!this.g.d(cf3.n(((TL_communities.CommunityPeerRequest) arrayList.get(i)).peer))) {
                if (communityPeerRequest.date <= this.o) {
                    return;
                }
                this.p++;
            }
        }
    }

    public final void b(q5c q5cVar) {
        if (!this.m && !this.n && q5cVar.f3.M0() + 10 > q5cVar.g3.E.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z;
        ArrayList arrayList2 = this.j;
        if (!arrayList2.isEmpty()) {
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList2.get(i);
                    long n = cf3.n(communityPeerRequest.peer);
                    if (!this.g.d(n)) {
                        TLRPC.User V1 = na7.q1(this.d).V1(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z2 = !communityPeerRequest.visible;
                        if (i < size - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i2 = ln2.b;
                        c4c K = c4c.K(ln2.class);
                        K.H = new kn2(n, V1, z2);
                        K.I = this;
                        K.j = !z;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.n) {
                arrayList.add(c4c.p(29));
            }
        }
    }

    public final void d() {
        if (!this.m && !this.n && hc2.y(27, this.f)) {
            this.m = true;
            na7 q1 = na7.q1(this.d);
            String str = this.k;
            jo2 jo2Var = new jo2(this, (byte) 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = q1.f1(this.e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            q1.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new hc((byte) 0), new w77(q1, jo2Var, (byte) 0));
        }
    }

    public final void e() {
        int i = this.d;
        long currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        this.o = currentTime;
        na7.q1(i).X3.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z, boolean z2) {
        int i;
        String str;
        int i2;
        TextView textView;
        if (this.q == null && this.r == 0) {
            if (z2) {
                if (z) {
                    i = 2131751971;
                } else {
                    i = 2131751923;
                }
                String M0 = k96.M0(i, null);
                if (z) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder T2 = gl.T2(k96.G(this.l, str, new Object[0]));
                if (z) {
                    i2 = 2131754483;
                } else {
                    i2 = 2131751592;
                }
                hd M = ij.M(this.a, this.b, M0, T2, k96.M0(i2, null), new x6c((byte) 13, this, z));
                M.show();
                if (!z && (textView = (TextView) M.c(-1)) != null) {
                    zkb.X(textView, bkb.p7, null);
                    return;
                }
                return;
            }
            ko2 ko2Var = this.i;
            if (ko2Var != null) {
                ko2Var.run();
            }
            this.i = null;
            hd hdVar = new hd(3, this.b, this.a);
            this.q = hdVar;
            hdVar.setOnCancelListener(new ur0(this, (byte) 7));
            this.q.q(500L);
            na7 q1 = na7.q1(this.d);
            jo2 jo2Var = new jo2(this, (byte) 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = q1.f1(j);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z;
            this.r = q1.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new hc((byte) 0), new et4(q1, j, jo2Var, (byte) 2));
        }
    }

    public final void g(long j, boolean z) {
        int i;
        int i2;
        this.g.k(null, j);
        this.l--;
        a();
        lo2 lo2Var = this.h;
        if (lo2Var != null) {
            lo2Var.U0();
        }
        if (z) {
            i = 2131751868;
        } else {
            i = 2131751867;
        }
        int i3 = this.d;
        SpannableStringBuilder T2 = gl.T2(k96.a0(null, null, i, cf3.r(i3, j)));
        ko2 ko2Var = this.i;
        if (ko2Var != null) {
            ko2Var.run();
        }
        this.i = new ko2(this, j, z, (byte) 0);
        wjb wjbVar = this.b;
        Context context = this.a;
        l21 l21Var = new l21(wjbVar, context, false);
        TLObject Z1 = na7.q1(i3).Z1(j);
        hc0 hc0Var = l21Var.a;
        if (Z1 != null) {
            hc0Var.setCount(1);
            hc0Var.b(0, y6c.t0, Z1);
            i2 = 1;
        } else {
            i2 = 0;
        }
        hc0Var.setTranslationX(gl.L(7.0f));
        hc0Var.setScaleX(1.333f);
        hc0Var.setScaleY(1.333f);
        hc0Var.a(false);
        l46 l46Var = l21Var.b;
        l46Var.setSingleLine(false);
        l46Var.setMaxLines(2);
        l46Var.setTextSize(1, 14.0f);
        l46Var.setText(T2);
        if (l46Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = gl.L(74 - ((3 - i2) * 12));
            if (k96.a0) {
                ((ViewGroup.MarginLayoutParams) l46Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) l46Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (k96.a0) {
            hc0Var.setTranslationX(gl.L(32 - ((i2 - 1) * 12)));
        }
        k21 k21Var = new k21(wjbVar, context, true, true);
        k21Var.e(k96.M0(2131743646, null));
        k21Var.b = new et(this, j, (byte) 11);
        k21Var.c = this.i;
        l21Var.setButton(k21Var);
        this.c.b(l21Var, 5000).j();
    }
}
