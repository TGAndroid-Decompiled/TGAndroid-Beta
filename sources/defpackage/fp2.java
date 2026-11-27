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
public final class fp2 implements co2 {
    public final Context a;
    public final vnb b;
    public final d31 c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public ep2 h;
    public dp2 i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public id q;
    public int r;
    public final zh6 g = new zh6();
    public final ArrayList j = new ArrayList();

    public fp2(Context context, vnb vnbVar, d31 d31Var, int i, long j) {
        this.a = context;
        this.b = vnbVar;
        this.c = d31Var;
        this.d = i;
        this.e = j;
        this.f = uc7.s1(i).M0(Long.valueOf(j));
        this.o = uc7.s1(i).Y3.getLong(qu6.n(j, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.p = 0;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!this.g.d(wf3.n(((TL_communities.CommunityPeerRequest) arrayList.get(i)).peer))) {
                if (communityPeerRequest.date <= this.o) {
                    return;
                }
                this.p++;
            }
        }
    }

    public final void b(q9c q9cVar) {
        if (!this.m && !this.n && q9cVar.f3.M0() + 10 > q9cVar.g3.E.size()) {
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
                    long n = wf3.n(communityPeerRequest.peer);
                    if (!this.g.d(n)) {
                        TLRPC.User X1 = uc7.s1(this.d).X1(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z2 = !communityPeerRequest.visible;
                        if (i < size - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i2 = eo2.b;
                        b8c K = b8c.K(eo2.class);
                        K.H = new do2(n, X1, z2);
                        K.I = this;
                        K.j = !z;
                        arrayList.add(K);
                    }
                }
            }
            if (!this.n) {
                arrayList.add(b8c.p(29));
            }
        }
    }

    public final void d() {
        if (!this.m && !this.n && xc2.y(27, this.f)) {
            this.m = true;
            uc7 s1 = uc7.s1(this.d);
            String str = this.k;
            cp2 cp2Var = new cp2(this, (byte) 1);
            TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
            tL_communities_getPeerLinkRequests.community = s1.h1(this.e);
            tL_communities_getPeerLinkRequests.offset = str;
            tL_communities_getPeerLinkRequests.limit = 100;
            s1.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new ic((byte) 0), new ia7(s1, cp2Var, (byte) 1));
        }
    }

    public final void e() {
        int i = this.d;
        long currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        this.o = currentTime;
        uc7.s1(i).Y3.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
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
                    i = 2131751948;
                } else {
                    i = 2131751900;
                }
                String M0 = ob6.M0(i, null);
                if (z) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder S2 = hl.S2(ob6.G(this.l, str, new Object[0]));
                if (z) {
                    i2 = 2131754479;
                } else {
                    i2 = 2131751569;
                }
                id M = jj.M(this.a, this.b, M0, S2, ob6.M0(i2, null), new xac((byte) 13, this, z));
                M.show();
                if (!z && (textView = (TextView) M.c(-1)) != null) {
                    yob.X(textView, aob.q7, null);
                    return;
                }
                return;
            }
            dp2 dp2Var = this.i;
            if (dp2Var != null) {
                dp2Var.run();
            }
            this.i = null;
            id idVar = new id(3, this.b, this.a);
            this.q = idVar;
            idVar.setOnCancelListener(new cs0(this, (byte) 7));
            this.q.q(500L);
            uc7 s1 = uc7.s1(this.d);
            cp2 cp2Var = new cp2(this, (byte) 0);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = s1.h1(j);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z;
            this.r = s1.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new ic((byte) 0), new iv4(s1, j, cp2Var, (byte) 2));
        }
    }

    public final void g(long j, boolean z) {
        int i;
        int i2;
        this.g.k(j, null);
        this.l--;
        a();
        ep2 ep2Var = this.h;
        if (ep2Var != null) {
            ep2Var.W();
        }
        if (z) {
            i = 2131751845;
        } else {
            i = 2131751844;
        }
        int i3 = this.d;
        SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, i, wf3.r(i3, j)));
        dp2 dp2Var = this.i;
        if (dp2Var != null) {
            dp2Var.run();
        }
        this.i = new dp2(this, j, z, (byte) 0);
        vnb vnbVar = this.b;
        Context context = this.a;
        u21 u21Var = new u21(vnbVar, context, false);
        TLObject b2 = uc7.s1(i3).b2(j);
        jc0 jc0Var = u21Var.a;
        if (b2 != null) {
            jc0Var.setCount(1);
            jc0Var.b(0, yac.t0, b2);
            i2 = 1;
        } else {
            i2 = 0;
        }
        jc0Var.setTranslationX(hl.L(7.0f));
        jc0Var.setScaleX(1.333f);
        jc0Var.setScaleY(1.333f);
        jc0Var.a(false);
        p66 p66Var = u21Var.b;
        p66Var.setSingleLine(false);
        p66Var.setMaxLines(2);
        p66Var.setTextSize(1, 14.0f);
        p66Var.setText(S2);
        if (p66Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = hl.L(74 - ((3 - i2) * 12));
            if (ob6.a0) {
                ((ViewGroup.MarginLayoutParams) p66Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) p66Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (ob6.a0) {
            jc0Var.setTranslationX(hl.L(32 - ((i2 - 1) * 12)));
        }
        t21 t21Var = new t21(vnbVar, context, true, true);
        t21Var.e(ob6.M0(2131743540, null));
        t21Var.b = new kt(this, j, (byte) 11);
        t21Var.c = this.i;
        u21Var.setButton(t21Var);
        this.c.b(u21Var, 5000).j();
    }
}
