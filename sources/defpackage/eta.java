package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class eta {
    public final zsa a;
    public final k27 b;
    public final mu1 c;
    public final m21 d;
    public final g21 e;
    public final fta f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public jra o;
    public final cta p;
    public final gta q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public eta(gta gtaVar, zsa zsaVar, k27 k27Var, mu1 mu1Var, boolean z) {
        this.q = gtaVar;
        boolean z2 = false;
        cta ctaVar = new cta(this, (byte) 0);
        this.p = ctaVar;
        this.a = zsaVar;
        this.b = k27Var;
        this.c = mu1Var;
        Context q = gta.q(mu1Var);
        g21 g21Var = new g21(q, mu1Var.Ba);
        this.e = g21Var;
        g21Var.a.f(2131624221, 32, 32, null);
        g21Var.b.setText(d());
        k21 k21Var = new k21(mu1Var.Ba, q, true, false);
        k21Var.e(k96.M0(2131744786, null));
        k21Var.b = new cta(this, (byte) 1);
        ?? f21Var = new f21(q, mu1Var.Ba);
        this.f = f21Var;
        f21Var.b = 5000L;
        int i = bkb.wj;
        ku1 ku1Var = mu1Var.Ba;
        ho9 ho9Var = new ho9((byte) 26);
        ho9 ho9Var2 = new ho9((byte) 27);
        int P = zkb.P(i, -1, 0, 0.0f, ku1Var);
        ho9Var2.d(P, f21Var);
        tkb w = zkb.w(101, f21Var);
        w.c(i, -1, 0, 0.0f, ku1Var);
        w.n = ho9Var;
        w.o = ho9Var2;
        w.m = false;
        w.g = P;
        k21Var.addView((View) f21Var, nme.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        k21Var.e.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(30.0f), gl.L(8.0f));
        g21Var.setButton(k21Var);
        m21 b = u21.b0(mu1Var).b(g21Var, -1);
        this.d = b;
        b.r = false;
        if (z) {
            b.k(true);
            this.m = true;
        }
        b.v = ctaVar;
        this.h = 0L;
        System.currentTimeMillis();
        if (k27Var.k.reactions != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= k27Var.k.reactions.results.size()) {
                    break;
                } else if (k27Var.k.reactions.results.get(i2).reaction instanceof TLRPC.TL_reactionPaid) {
                    z2 = k27Var.k.reactions.results.get(i2).chosen;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.g = z2;
    }

    public final void a() {
        gta gtaVar = this.q;
        int i = gtaVar.a;
        gl.r(this.p);
        this.j = true;
        this.d.b();
        jra jraVar = this.o;
        if (jraVar != null) {
            jraVar.c();
        }
        boolean z = this.g;
        long c = c();
        k27 k27Var = this.b;
        k27Var.f((int) (-this.h), c, z);
        gtaVar.g -= this.h;
        kk7.f(i).k(kk7.z3, new Object[0]);
        kk7.f(i).k(kk7.n1, Long.valueOf(k27.B0(k27Var.k)), Integer.valueOf(k27Var.e1()), k27Var.k.reactions);
        if (gtaVar.B == this) {
            gtaVar.B = null;
        }
    }

    public final void b() {
        k27 k27Var;
        String str;
        int i = kk7.z3;
        gl.r(this.p);
        if (this.l) {
            if (!this.i && !this.j) {
                gta v = gta.v(this.q.a, false);
                na7 q1 = na7.q1(this.q.a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.q.a);
                long j = this.h;
                if (v.e && v.n(null, false, false).amount < j) {
                    this.j = true;
                    this.b.f((int) (-this.h), c(), this.g);
                    gta gtaVar = this.q;
                    gtaVar.g = 0L;
                    kk7.f(gtaVar.a).k(i, new Object[0]);
                    kk7.f(this.q.a).k(kk7.n1, Long.valueOf(k27.B0(this.b.k)), Integer.valueOf(this.b.e1()), this.b.k.reactions);
                    int i2 = (this.a.a > 0L ? 1 : (this.a.a == 0L ? 0 : -1));
                    mu1 mu1Var = this.c;
                    if (i2 >= 0) {
                        str = l7c.l(mu1Var.getMessagesController().V1(Long.valueOf(this.a.a)));
                    } else {
                        TLRPC.Chat K0 = mu1Var.getMessagesController().K0(Long.valueOf(-this.a.a));
                        if (K0 == null) {
                            str = "";
                        } else {
                            str = K0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = a.b;
                    }
                    new zua(parentActivity, this.c.getResourceProvider(), j, 5, str2, new dta(this, j, (byte) 0), 0L).show();
                } else {
                    this.i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = q1.h1(this.a.a);
                    tL_messages_sendPaidReaction.msg_id = this.a.b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c = c();
                    if (c != 0 && c != y6c.h(this.q.a).e()) {
                        if (c == 2666000) {
                            tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                        } else {
                            TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                            tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                            paidreactionprivacypeer.peer = q1.h1(c);
                        }
                    } else {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                    }
                    this.q.L();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new w47(this, q1, j));
                }
            }
        } else {
            this.j = true;
            this.b.f((int) (-this.h), c(), this.g);
            gta gtaVar2 = this.q;
            gtaVar2.g -= this.h;
            kk7.f(gtaVar2.a).k(i, new Object[0]);
        }
        this.d.b();
        jra jraVar = this.o;
        if (jraVar != null && (k27Var = this.b) != null && k27Var.e1() == jraVar.c) {
            this.o.c();
        }
        gta gtaVar3 = this.q;
        if (gtaVar3.B == this) {
            gtaVar3.B = null;
        }
    }

    public final long c() {
        Long l = this.n;
        if (l != null) {
            return l.longValue();
        }
        return this.q.x(this.b);
    }

    public final String d() {
        if (c() == 2666000) {
            return k96.M0(2131744792, null);
        }
        if (c() != 0 && c() != y6c.h(this.q.a).e()) {
            return k96.a0(null, null, 2131744787, cf3.s(c()));
        }
        return k96.M0(2131744788, null);
    }
}
