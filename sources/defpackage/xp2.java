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
public final class xp2 implements uo2 {
    public final Context a;
    public final ylb b;
    public final c41 c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public wp2 h;
    public vp2 i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public he q;
    public int r;
    public final vh6 g = new vh6();
    public final ArrayList j = new ArrayList();

    public xp2(Context context, ylb ylbVar, c41 c41Var, int i, long j) {
        this.a = context;
        this.b = ylbVar;
        this.c = c41Var;
        this.d = i;
        this.e = j;
        this.f = oc7.r1(i).L0(Long.valueOf(j));
        this.o = oc7.r1(i).X3.getLong(kt6.n(j, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.p = 0;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!this.g.d(pg3.n(((TL_communities.CommunityPeerRequest) arrayList.get(i)).peer))) {
                if (communityPeerRequest.date <= this.o) {
                    return;
                }
                this.p++;
            }
        }
    }

    public final void b(q7c q7cVar) {
        if (!this.m && !this.n && q7cVar.f3.M0() + 10 > q7cVar.g3.E.size()) {
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
                    long n = pg3.n(communityPeerRequest.peer);
                    if (!this.g.d(n)) {
                        TLRPC.User W1 = oc7.r1(this.d).W1(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z2 = !communityPeerRequest.visible;
                        if (i < size - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i2 = wo2.b;
                        c6c K = c6c.K(wo2.class);
                        K.H = new vo2(n, W1, z2);
                        K.I = this;
                        K.j = !z;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.n) {
                arrayList.add(c6c.p(29));
            }
        }
    }

    public final void d() {
        if (!this.m && !this.n && sd2.y(27, this.f)) {
            this.m = true;
            oc7 r1 = oc7.r1(this.d);
            String str = this.k;
            up2 up2Var = new up2(this, (byte) 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = r1.g1(this.e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            r1.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new kc((byte) 0), new s87(r1, up2Var, (byte) 2));
        }
    }

    public final void e() {
        int i = this.d;
        long currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        this.o = currentTime;
        oc7.r1(i).X3.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
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
                    i = 2131751920;
                } else {
                    i = 2131751872;
                }
                String M0 = jb6.M0(i, null);
                if (z) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder S2 = gm.S2(jb6.G(this.l, str, new Object[0]));
                if (z) {
                    i2 = 2131754483;
                } else {
                    i2 = 2131751541;
                }
                he M = ik.M(this.a, this.b, M0, S2, jb6.M0(i2, null), new y8c((byte) 13, this, z));
                M.show();
                if (!z && (textView = (TextView) M.c(-1)) != null) {
                    anb.X(textView, cmb.p7, null);
                    return;
                }
                return;
            }
            vp2 vp2Var = this.i;
            if (vp2Var != null) {
                vp2Var.run();
            }
            this.i = null;
            he heVar = new he(3, this.b, this.a);
            this.q = heVar;
            heVar.setOnCancelListener(new ct0(this, (byte) 7));
            this.q.q(500L);
            oc7 r1 = oc7.r1(this.d);
            up2 up2Var = new up2(this, (byte) 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = r1.g1(j);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z;
            this.r = r1.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new kc((byte) 0), new fv4(r1, j, up2Var, (byte) 2));
        }
    }

    public final void g(long j, boolean z) {
        int i;
        int i2;
        this.g.k(null, j);
        this.l--;
        a();
        wp2 wp2Var = this.h;
        if (wp2Var != null) {
            wp2Var.U();
        }
        if (z) {
            i = 2131751817;
        } else {
            i = 2131751816;
        }
        int i3 = this.d;
        SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, i, pg3.r(i3, j)));
        vp2 vp2Var = this.i;
        if (vp2Var != null) {
            vp2Var.run();
        }
        this.i = new vp2(this, j, z, (byte) 0);
        ylb ylbVar = this.b;
        Context context = this.a;
        t31 t31Var = new t31(ylbVar, context, false);
        TLObject a2 = oc7.r1(i3).a2(j);
        hd0 hd0Var = t31Var.a;
        if (a2 != null) {
            hd0Var.setCount(1);
            hd0Var.b(0, z8c.t0, a2);
            i2 = 1;
        } else {
            i2 = 0;
        }
        hd0Var.setTranslationX(gm.L(7.0f));
        hd0Var.setScaleX(1.333f);
        hd0Var.setScaleY(1.333f);
        hd0Var.a(false);
        l66 l66Var = t31Var.b;
        l66Var.setSingleLine(false);
        l66Var.setMaxLines(2);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setText(S2);
        if (l66Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = gm.L(74 - ((3 - i2) * 12));
            if (jb6.a0) {
                ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (jb6.a0) {
            hd0Var.setTranslationX(gm.L(32 - ((i2 - 1) * 12)));
        }
        s31 s31Var = new s31(ylbVar, context, true, true);
        s31Var.e(jb6.M0(2131743572, null));
        s31Var.b = new fu(this, j, (byte) 11);
        s31Var.c = this.i;
        t31Var.setButton(s31Var);
        this.c.b(t31Var, 5000).j();
    }
}
