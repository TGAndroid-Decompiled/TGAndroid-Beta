package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class hva {
    public final cva a;
    public final k47 b;
    public final yv1 c;
    public final u31 d;
    public final o31 e;
    public final iva f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public kta o;
    public final fva p;
    public final jva q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public hva(jva jvaVar, cva cvaVar, k47 k47Var, yv1 yv1Var, boolean z) {
        this.q = jvaVar;
        boolean z2 = false;
        fva fvaVar = new fva(this, (byte) 0);
        this.p = fvaVar;
        this.a = cvaVar;
        this.b = k47Var;
        this.c = yv1Var;
        Context q = jva.q(yv1Var);
        o31 o31Var = new o31(q, yv1Var.Ba);
        this.e = o31Var;
        o31Var.a.f(2131624221, 32, 32, null);
        o31Var.b.setText(d());
        s31 s31Var = new s31(yv1Var.Ba, q, true, false);
        s31Var.e(jb6.M0(2131744712, null));
        s31Var.b = new fva(this, (byte) 1);
        ?? n31Var = new n31(q, yv1Var.Ba);
        this.f = n31Var;
        n31Var.b = 5000L;
        int i = cmb.wj;
        wv1 wv1Var = yv1Var.Ba;
        dq9 dq9Var = new dq9((byte) 27);
        dq9 dq9Var2 = new dq9((byte) 28);
        int P = anb.P(i, -1, 0, 0.0f, wv1Var);
        dq9Var2.e(P, n31Var);
        umb w = anb.w(101, n31Var);
        w.c(i, -1, 0, 0.0f, wv1Var);
        w.n = dq9Var;
        w.o = dq9Var2;
        w.m = false;
        w.g = P;
        s31Var.addView((View) n31Var, qoe.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        s31Var.e.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(30.0f), gm.L(8.0f));
        o31Var.setButton(s31Var);
        u31 b = c41.b0(yv1Var).b(o31Var, -1);
        this.d = b;
        b.s = false;
        if (z) {
            b.k(true);
            this.m = true;
        }
        b.w = fvaVar;
        this.h = 0L;
        System.currentTimeMillis();
        if (k47Var.k.reactions != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= k47Var.k.reactions.results.size()) {
                    break;
                } else if (k47Var.k.reactions.results.get(i2).reaction instanceof TLRPC.TL_reactionPaid) {
                    z2 = k47Var.k.reactions.results.get(i2).chosen;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.g = z2;
    }

    public final void a() {
        jva jvaVar = this.q;
        int i = jvaVar.a;
        gm.r(this.p);
        this.j = true;
        this.d.b();
        kta ktaVar = this.o;
        if (ktaVar != null) {
            ktaVar.c();
        }
        boolean z = this.g;
        long c = c();
        k47 k47Var = this.b;
        k47Var.f((int) (-this.h), c, z);
        jvaVar.g -= this.h;
        nm7.f(i).k(nm7.A3, new Object[0]);
        nm7.f(i).k(nm7.o1, Long.valueOf(k47.B0(k47Var.k)), Integer.valueOf(k47Var.e1()), k47Var.k.reactions);
        if (jvaVar.B == this) {
            jvaVar.B = null;
        }
    }

    public final void b() {
        k47 k47Var;
        String str;
        int i = nm7.A3;
        gm.r(this.p);
        if (this.l) {
            if (!this.i && !this.j) {
                jva v = jva.v(this.q.a, false);
                oc7 r1 = oc7.r1(this.q.a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.q.a);
                long j = this.h;
                if (v.e && v.n(null, false, false).amount < j) {
                    this.j = true;
                    this.b.f((int) (-this.h), c(), this.g);
                    jva jvaVar = this.q;
                    jvaVar.g = 0L;
                    nm7.f(jvaVar.a).k(i, new Object[0]);
                    nm7.f(this.q.a).k(nm7.o1, Long.valueOf(k47.B0(this.b.k)), Integer.valueOf(this.b.e1()), this.b.k.reactions);
                    int i2 = (this.a.a > 0L ? 1 : (this.a.a == 0L ? 0 : -1));
                    yv1 yv1Var = this.c;
                    if (i2 >= 0) {
                        str = m9c.l(yv1Var.getMessagesController().W1(Long.valueOf(this.a.a)));
                    } else {
                        TLRPC.Chat L0 = yv1Var.getMessagesController().L0(Long.valueOf(-this.a.a));
                        if (L0 == null) {
                            str = "";
                        } else {
                            str = L0.title;
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
                    new dxa(parentActivity, this.c.getResourceProvider(), j, 5, str2, new gva(this, j, (byte) 0), 0L).show();
                } else {
                    this.i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = r1.i1(this.a.a);
                    tL_messages_sendPaidReaction.msg_id = this.a.b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c = c();
                    if (c != 0 && c != z8c.h(this.q.a).e()) {
                        if (c == 2666000) {
                            tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                        } else {
                            TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                            tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                            paidreactionprivacypeer.peer = r1.i1(c);
                        }
                    } else {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                    }
                    this.q.L();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new jb7(this, r1, j));
                }
            }
        } else {
            this.j = true;
            this.b.f((int) (-this.h), c(), this.g);
            jva jvaVar2 = this.q;
            jvaVar2.g -= this.h;
            nm7.f(jvaVar2.a).k(i, new Object[0]);
        }
        this.d.b();
        kta ktaVar = this.o;
        if (ktaVar != null && (k47Var = this.b) != null && k47Var.e1() == ktaVar.c) {
            this.o.c();
        }
        jva jvaVar3 = this.q;
        if (jvaVar3.B == this) {
            jvaVar3.B = null;
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
            return jb6.M0(2131744718, null);
        }
        if (c() != 0 && c() != z8c.h(this.q.a).e()) {
            return jb6.a0(null, null, 2131744713, pg3.s(c()));
        }
        return jb6.M0(2131744714, null);
    }
}
