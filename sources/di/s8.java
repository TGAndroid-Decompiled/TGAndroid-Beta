package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.ym;
public final class s8 {
    public final n8 f9389a;
    public final gj f9390b;
    public final an f9391c;
    public final org.telegram.ui.Components.xb d;
    public final org.telegram.ui.Components.rb f9392e;
    public final t8 f9393f;
    public final boolean f9394g;
    public long h;
    public long f9397k;
    public boolean f9398l;
    public boolean f9399m;
    public h6 f9401o;
    public final q8 f9402p;
    public final u8 f9403q;
    public boolean f9395i = false;
    public boolean f9396j = false;
    public Long f9400n = null;

    public s8(u8 u8Var, n8 n8Var, gj gjVar, an anVar, boolean z10) {
        this.f9403q = u8Var;
        boolean z11 = false;
        q8 q8Var = new q8(this, 0);
        this.f9402p = q8Var;
        this.f9389a = n8Var;
        this.f9390b = gjVar;
        this.f9391c = anVar;
        Context t6 = u8.t(anVar);
        org.telegram.ui.Components.rb rbVar = new org.telegram.ui.Components.rb(t6, anVar.Aa);
        this.f9392e = rbVar;
        rbVar.c(2131624227, new String[0]);
        rbVar.f38939b.setText(d());
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(t6, anVar.Aa, true, false);
        vbVar.e(hd.M0(2131745023, null));
        vbVar.f40372b = new q8(this, 1);
        ?? qbVar = new org.telegram.ui.Components.qb(t6, anVar.Aa);
        this.f9393f = qbVar;
        qbVar.f38604b = 5000L;
        int i7 = org.telegram.ui.ActionBar.j6.xj;
        ym ymVar = anVar.Aa;
        o oVar = new o(3);
        o oVar2 = new o(4);
        int P = org.telegram.ui.ActionBar.q6.P(i7, -1, 0, 0.0f, ymVar);
        oVar2.f(P, qbVar);
        org.telegram.ui.ActionBar.k6 w10 = org.telegram.ui.ActionBar.q6.w(101, qbVar);
        w10.c(i7, -1, 0, 0.0f, ymVar);
        w10.f29354n = oVar;
        w10.f29355o = oVar2;
        w10.f29353m = false;
        w10.f29348g = P;
        vbVar.addView((View) qbVar, c8.ja.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        vbVar.f40374e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        rbVar.setButton(vbVar);
        org.telegram.ui.Components.xb b10 = org.telegram.ui.Components.cc.a0(anVar).b(rbVar, -1);
        this.d = b10;
        b10.f41643r = false;
        if (z10) {
            b10.k(true);
            this.f9399m = true;
        }
        b10.v = q8Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (gjVar.f23819k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= gjVar.f23819k.reactions.results.size()) {
                    break;
                } else if (gjVar.f23819k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = gjVar.f23819k.reactions.results.get(i10).chosen;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f9394g = z11;
    }

    public final void a() {
        u8 u8Var = this.f9403q;
        int i7 = u8Var.f9529a;
        org.telegram.messenger.g0.r(this.f9402p);
        this.f9396j = true;
        this.d.b();
        h6 h6Var = this.f9401o;
        if (h6Var != null) {
            h6Var.c();
        }
        boolean z10 = this.f9394g;
        long c10 = c();
        gj gjVar = this.f9390b;
        gjVar.f((int) (-this.h), c10, z10);
        u8Var.f9534g -= this.h;
        ns.f(i7).k(ns.f25611y3, new Object[0]);
        ns.f(i7).k(ns.f25544o1, Long.valueOf(gj.B0(gjVar.f23819k)), Integer.valueOf(gjVar.e1()), gjVar.f23819k.reactions);
        if (u8Var.B == this) {
            u8Var.B = null;
        }
    }

    public final void b() {
        gj gjVar;
        String str;
        int i7 = ns.f25611y3;
        org.telegram.messenger.g0.r(this.f9402p);
        if (this.f9398l) {
            if (!this.f9395i && !this.f9396j) {
                u8 y10 = u8.y(this.f9403q.f9529a, false);
                np s12 = np.s1(this.f9403q.f9529a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f9403q.f9529a);
                long j3 = this.h;
                if (y10.f9532e && y10.q(null, false, false).amount < j3) {
                    this.f9396j = true;
                    this.f9390b.f((int) (-this.h), c(), this.f9394g);
                    u8 u8Var = this.f9403q;
                    u8Var.f9534g = 0L;
                    ns.f(u8Var.f9529a).k(i7, new Object[0]);
                    ns.f(this.f9403q.f9529a).k(ns.f25544o1, Long.valueOf(gj.B0(this.f9390b.f23819k)), Integer.valueOf(this.f9390b.e1()), this.f9390b.f23819k.reactions);
                    if (this.f9389a.f9113a >= 0) {
                        str = q10.k(this.f9391c.getMessagesController().a2(Long.valueOf(this.f9389a.f9113a)));
                    } else {
                        TLRPC.Chat M0 = this.f9391c.getMessagesController().M0(Long.valueOf(-this.f9389a.f9113a));
                        if (M0 == null) {
                            str = "";
                        } else {
                            str = M0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f9391c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.f26609b;
                    }
                    new bb(parentActivity, this.f9391c.getResourceProvider(), j3, 5, str2, new r8(this, j3, 0), 0L).show();
                } else {
                    this.f9395i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = s12.j1(this.f9389a.f9113a);
                    tL_messages_sendPaidReaction.msg_id = this.f9389a.f9114b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.f22414b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != m10.i(this.f9403q.f9529a).e()) {
                        if (c10 == 2666000) {
                            tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                        } else {
                            TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                            tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                            paidreactionprivacypeer.peer = s12.j1(c10);
                        }
                    } else {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                    }
                    this.f9403q.O();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new o2(this, s12, j3, 2));
                }
            }
        } else {
            this.f9396j = true;
            this.f9390b.f((int) (-this.h), c(), this.f9394g);
            u8 u8Var2 = this.f9403q;
            u8Var2.f9534g -= this.h;
            ns.f(u8Var2.f9529a).k(i7, new Object[0]);
        }
        this.d.b();
        h6 h6Var = this.f9401o;
        if (h6Var != null && (gjVar = this.f9390b) != null && gjVar.e1() == h6Var.f8717c) {
            this.f9401o.c();
        }
        u8 u8Var3 = this.f9403q;
        if (u8Var3.B == this) {
            u8Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f9400n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f9403q.B(this.f9390b);
    }

    public final String d() {
        if (c() == 2666000) {
            return hd.M0(2131745029, null);
        }
        if (c() != 0 && c() != m10.i(this.f9403q.f9529a).e()) {
            return hd.a0(null, null, 2131745024, org.telegram.messenger.m5.t(c()));
        }
        return hd.M0(2131745025, null);
    }
}
