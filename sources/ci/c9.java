package ci;

import android.content.Context;
import android.view.View;
import b8.mf;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.um;
import org.telegram.ui.wm;
public final class c9 {
    public final x8 f4922a;
    public final zi f4923b;
    public final wm f4924c;
    public final org.telegram.ui.Components.ac d;
    public final org.telegram.ui.Components.ub f4925e;
    public final d9 f4926f;
    public final boolean f4927g;
    public long h;
    public long f4930k;
    public boolean f4931l;
    public boolean f4932m;
    public q6 f4934o;
    public final a9 f4935p;
    public final e9 f4936q;
    public boolean f4928i = false;
    public boolean f4929j = false;
    public Long f4933n = null;

    public c9(e9 e9Var, x8 x8Var, zi ziVar, wm wmVar, boolean z10) {
        this.f4936q = e9Var;
        boolean z11 = false;
        a9 a9Var = new a9(this, 0);
        this.f4935p = a9Var;
        this.f4922a = x8Var;
        this.f4923b = ziVar;
        this.f4924c = wmVar;
        Context t10 = e9.t(wmVar);
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(t10, wmVar.f51557ya);
        this.f4925e = ubVar;
        ubVar.c(2131624226, new String[0]);
        ubVar.f38714b.setText(d());
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(t10, wmVar.f51557ya, true, false);
        ybVar.e(bd.M0(2131745033, null));
        ybVar.f40672b = new a9(this, 1);
        ?? tbVar = new org.telegram.ui.Components.tb(t10, wmVar.f51557ya);
        this.f4926f = tbVar;
        tbVar.f38376b = 5000L;
        int i3 = org.telegram.ui.ActionBar.k6.uj;
        um umVar = wmVar.f51557ya;
        a3.j jVar = new a3.j(20);
        a3.j jVar2 = new a3.j(21);
        int Q = org.telegram.ui.ActionBar.r6.Q(i3, -1, 0, 0.0f, umVar);
        jVar2.f(Q, tbVar);
        org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(101, tbVar);
        x10.c(i3, -1, 0, 0.0f, umVar);
        x10.f28325n = jVar;
        x10.f28326o = jVar2;
        x10.f28324m = false;
        x10.f28319g = Q;
        ybVar.addView((View) tbVar, mf.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ybVar.f40674e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        ubVar.setButton(ybVar);
        org.telegram.ui.Components.ac b10 = org.telegram.ui.Components.fc.a0(wmVar).b(ubVar, -1);
        this.d = b10;
        b10.f31800r = false;
        if (z10) {
            b10.k(true);
            this.f4932m = true;
        }
        b10.v = a9Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (ziVar.f26868k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= ziVar.f26868k.reactions.results.size()) {
                    break;
                } else if (ziVar.f26868k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = ziVar.f26868k.reactions.results.get(i10).chosen;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f4927g = z11;
    }

    public final void a() {
        e9 e9Var = this.f4936q;
        int i3 = e9Var.f5029a;
        org.telegram.messenger.g0.r(this.f4935p);
        this.f4929j = true;
        this.d.b();
        q6 q6Var = this.f4934o;
        if (q6Var != null) {
            q6Var.c();
        }
        boolean z10 = this.f4927g;
        long c2 = c();
        zi ziVar = this.f4923b;
        ziVar.f((int) (-this.h), c2, z10);
        e9Var.f5034g -= this.h;
        hs.f(i3).k(hs.f23343y3, new Object[0]);
        hs.f(i3).k(hs.f23275o1, Long.valueOf(zi.B0(ziVar.f26868k)), Integer.valueOf(ziVar.f1()), ziVar.f26868k.reactions);
        if (e9Var.B == this) {
            e9Var.B = null;
        }
    }

    public final void b() {
        zi ziVar;
        String str;
        int i3 = hs.f23343y3;
        org.telegram.messenger.g0.r(this.f4935p);
        if (this.f4931l) {
            if (!this.f4928i && !this.f4929j) {
                e9 y9 = e9.y(this.f4936q.f5029a, false);
                hp s12 = hp.s1(this.f4936q.f5029a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f4936q.f5029a);
                long j10 = this.h;
                if (y9.f5032e && y9.q(null, false, false).amount < j10) {
                    this.f4929j = true;
                    this.f4923b.f((int) (-this.h), c(), this.f4927g);
                    e9 e9Var = this.f4936q;
                    e9Var.f5034g = 0L;
                    hs.f(e9Var.f5029a).k(i3, new Object[0]);
                    hs.f(this.f4936q.f5029a).k(hs.f23275o1, Long.valueOf(zi.B0(this.f4923b.f26868k)), Integer.valueOf(this.f4923b.f1()), this.f4923b.f26868k.reactions);
                    if (this.f4922a.f6364a >= 0) {
                        str = l10.k(this.f4924c.getMessagesController().a2(Long.valueOf(this.f4922a.f6364a)));
                    } else {
                        TLRPC.Chat M0 = this.f4924c.getMessagesController().M0(Long.valueOf(-this.f4922a.f6364a));
                        if (M0 == null) {
                            str = "";
                        } else {
                            str = M0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f4924c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.K1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.f25457b;
                    }
                    new mb(parentActivity, this.f4924c.getResourceProvider(), j10, 5, str2, new b9(this, j10, 0), 0L).show();
                } else {
                    this.f4928i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = s12.j1(this.f4922a.f6364a);
                    tL_messages_sendPaidReaction.msg_id = this.f4922a.f6365b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.f21385b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c2 = c();
                    if (c2 != 0 && c2 != h10.i(this.f4936q.f5029a).e()) {
                        if (c2 == 2666000) {
                            tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                        } else {
                            TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                            tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                            paidreactionprivacypeer.peer = s12.j1(c2);
                        }
                    } else {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                    }
                    this.f4936q.O();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new u2(this, s12, j10, 2));
                }
            }
        } else {
            this.f4929j = true;
            this.f4923b.f((int) (-this.h), c(), this.f4927g);
            e9 e9Var2 = this.f4936q;
            e9Var2.f5034g -= this.h;
            hs.f(e9Var2.f5029a).k(i3, new Object[0]);
        }
        this.d.b();
        q6 q6Var = this.f4934o;
        if (q6Var != null && (ziVar = this.f4923b) != null && ziVar.f1() == q6Var.f5834c) {
            this.f4934o.c();
        }
        e9 e9Var3 = this.f4936q;
        if (e9Var3.B == this) {
            e9Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f4933n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f4936q.B(this.f4923b);
    }

    public final String d() {
        if (c() == 2666000) {
            return bd.M0(2131745039, null);
        }
        if (c() != 0 && c() != h10.i(this.f4936q.f5029a).e()) {
            return bd.a0(null, null, 2131745034, org.telegram.messenger.m5.t(c()));
        }
        return bd.M0(2131745035, null);
    }
}
