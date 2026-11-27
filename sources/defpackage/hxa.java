package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class hxa {
    public final cxa a;
    public final r47 b;
    public final zu1 c;
    public final v21 d;
    public final p21 e;
    public final ixa f;
    public final boolean g;
    public long h;
    public long k;
    public boolean l;
    public boolean m;
    public lva o;
    public final fxa p;
    public final jxa q;
    public boolean i = false;
    public boolean j = false;
    public Long n = null;

    public hxa(jxa jxaVar, cxa cxaVar, r47 r47Var, zu1 zu1Var, boolean z) {
        this.q = jxaVar;
        boolean z2 = false;
        fxa fxaVar = new fxa(this, (byte) 0);
        this.p = fxaVar;
        this.a = cxaVar;
        this.b = r47Var;
        this.c = zu1Var;
        Context q = jxa.q(zu1Var);
        p21 p21Var = new p21(q, zu1Var.Ba);
        this.e = p21Var;
        p21Var.a.f(2131624221, 32, 32, null);
        p21Var.b.setText(d());
        t21 t21Var = new t21(zu1Var.Ba, q, true, false);
        t21Var.e(ob6.M0(2131744680, null));
        t21Var.b = new fxa(this, (byte) 1);
        ?? o21Var = new o21(q, zu1Var.Ba);
        this.f = o21Var;
        o21Var.b = 5000L;
        int i = aob.xj;
        xu1 xu1Var = zu1Var.Ba;
        vr9 vr9Var = new vr9((byte) 28);
        vr9 vr9Var2 = new vr9((byte) 29);
        int P = yob.P(i, -1, 0, 0.0f, xu1Var);
        vr9Var2.e(P, o21Var);
        sob w = yob.w(101, o21Var);
        w.c(i, -1, 0, 0.0f, xu1Var);
        w.n = vr9Var;
        w.o = vr9Var2;
        w.m = false;
        w.g = P;
        t21Var.addView((View) o21Var, tre.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        t21Var.e.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(30.0f), hl.L(8.0f));
        p21Var.setButton(t21Var);
        v21 b = d31.b0(zu1Var).b(p21Var, -1);
        this.d = b;
        b.s = false;
        if (z) {
            b.k(true);
            this.m = true;
        }
        b.w = fxaVar;
        this.h = 0L;
        System.currentTimeMillis();
        if (r47Var.k.reactions != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= r47Var.k.reactions.results.size()) {
                    break;
                } else if (r47Var.k.reactions.results.get(i2).reaction instanceof TLRPC.TL_reactionPaid) {
                    z2 = r47Var.k.reactions.results.get(i2).chosen;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.g = z2;
    }

    public final void a() {
        jxa jxaVar = this.q;
        int i = jxaVar.a;
        hl.r(this.p);
        this.j = true;
        this.d.b();
        lva lvaVar = this.o;
        if (lvaVar != null) {
            lvaVar.c();
        }
        boolean z = this.g;
        long c = c();
        r47 r47Var = this.b;
        r47Var.f((int) (-this.h), c, z);
        jxaVar.g -= this.h;
        jn7.f(i).k(jn7.A3, new Object[0]);
        jn7.f(i).k(jn7.o1, Long.valueOf(r47.B0(r47Var.k)), Integer.valueOf(r47Var.e1()), r47Var.k.reactions);
        if (jxaVar.B == this) {
            jxaVar.B = null;
        }
    }

    public final void b() {
        r47 r47Var;
        String str;
        int i = jn7.A3;
        hl.r(this.p);
        if (this.l) {
            if (!this.i && !this.j) {
                jxa v = jxa.v(this.q.a, false);
                uc7 s1 = uc7.s1(this.q.a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.q.a);
                long j = this.h;
                if (v.e && v.n(null, false, false).amount < j) {
                    this.j = true;
                    this.b.f((int) (-this.h), c(), this.g);
                    jxa jxaVar = this.q;
                    jxaVar.g = 0L;
                    jn7.f(jxaVar.a).k(i, new Object[0]);
                    jn7.f(this.q.a).k(jn7.o1, Long.valueOf(r47.B0(this.b.k)), Integer.valueOf(this.b.e1()), this.b.k.reactions);
                    int i2 = (this.a.a > 0L ? 1 : (this.a.a == 0L ? 0 : -1));
                    zu1 zu1Var = this.c;
                    if (i2 >= 0) {
                        str = lbc.l(zu1Var.getMessagesController().X1(Long.valueOf(this.a.a)));
                    } else {
                        TLRPC.Chat M0 = zu1Var.getMessagesController().M0(Long.valueOf(-this.a.a));
                        if (M0 == null) {
                            str = "";
                        } else {
                            str = M0.title;
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
                    new dza(parentActivity, this.c.getResourceProvider(), j, 5, str2, new gxa(this, j, (byte) 0), 0L).show();
                } else {
                    this.i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = s1.j1(this.a.a);
                    tL_messages_sendPaidReaction.msg_id = this.a.b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c = c();
                    if (c != 0 && c != yac.h(this.q.a).e()) {
                        if (c == 2666000) {
                            tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                        } else {
                            TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                            tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                            paidreactionprivacypeer.peer = s1.j1(c);
                        }
                    } else {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                    }
                    this.q.L();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new p87(this, s1, j));
                }
            }
        } else {
            this.j = true;
            this.b.f((int) (-this.h), c(), this.g);
            jxa jxaVar2 = this.q;
            jxaVar2.g -= this.h;
            jn7.f(jxaVar2.a).k(i, new Object[0]);
        }
        this.d.b();
        lva lvaVar = this.o;
        if (lvaVar != null && (r47Var = this.b) != null && r47Var.e1() == lvaVar.c) {
            this.o.c();
        }
        jxa jxaVar3 = this.q;
        if (jxaVar3.B == this) {
            jxaVar3.B = null;
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
            return ob6.M0(2131744686, null);
        }
        if (c() != 0 && c() != yac.h(this.q.a).e()) {
            return ob6.a0(null, null, 2131744681, wf3.s(c()));
        }
        return ob6.M0(2131744682, null);
    }
}
