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
public final class t8 {
    public final o8 f9475a;
    public final gj f9476b;
    public final an f9477c;
    public final org.telegram.ui.Components.xb d;
    public final org.telegram.ui.Components.rb f9478e;
    public final u8 f9479f;
    public final boolean f9480g;
    public long h;
    public long f9483k;
    public boolean f9484l;
    public boolean f9485m;
    public h6 f9487o;
    public final r8 f9488p;
    public final v8 f9489q;
    public boolean f9481i = false;
    public boolean f9482j = false;
    public Long f9486n = null;

    public t8(v8 v8Var, o8 o8Var, gj gjVar, an anVar, boolean z10) {
        this.f9489q = v8Var;
        boolean z11 = false;
        r8 r8Var = new r8(this, 0);
        this.f9488p = r8Var;
        this.f9475a = o8Var;
        this.f9476b = gjVar;
        this.f9477c = anVar;
        Context t6 = v8.t(anVar);
        org.telegram.ui.Components.rb rbVar = new org.telegram.ui.Components.rb(t6, anVar.Aa);
        this.f9478e = rbVar;
        rbVar.c(2131624227, new String[0]);
        rbVar.f38942b.setText(d());
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(t6, anVar.Aa, true, false);
        vbVar.e(hd.M0(2131745023, null));
        vbVar.f40369b = new r8(this, 1);
        ?? qbVar = new org.telegram.ui.Components.qb(t6, anVar.Aa);
        this.f9479f = qbVar;
        qbVar.f38606b = 5000L;
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
        vbVar.f40371e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        rbVar.setButton(vbVar);
        org.telegram.ui.Components.xb b10 = org.telegram.ui.Components.cc.a0(anVar).b(rbVar, -1);
        this.d = b10;
        b10.f41651r = false;
        if (z10) {
            b10.k(true);
            this.f9485m = true;
        }
        b10.v = r8Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (gjVar.f23817k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= gjVar.f23817k.reactions.results.size()) {
                    break;
                } else if (gjVar.f23817k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = gjVar.f23817k.reactions.results.get(i10).chosen;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f9480g = z11;
    }

    public final void a() {
        v8 v8Var = this.f9489q;
        int i7 = v8Var.f9598a;
        org.telegram.messenger.g0.r(this.f9488p);
        this.f9482j = true;
        this.d.b();
        h6 h6Var = this.f9487o;
        if (h6Var != null) {
            h6Var.c();
        }
        boolean z10 = this.f9480g;
        long c10 = c();
        gj gjVar = this.f9476b;
        gjVar.f((int) (-this.h), c10, z10);
        v8Var.f9603g -= this.h;
        ns.f(i7).k(ns.f25610y3, new Object[0]);
        ns.f(i7).k(ns.f25543o1, Long.valueOf(gj.B0(gjVar.f23817k)), Integer.valueOf(gjVar.e1()), gjVar.f23817k.reactions);
        if (v8Var.B == this) {
            v8Var.B = null;
        }
    }

    public final void b() {
        gj gjVar;
        String str;
        int i7 = ns.f25610y3;
        org.telegram.messenger.g0.r(this.f9488p);
        if (this.f9484l) {
            if (!this.f9481i && !this.f9482j) {
                v8 y10 = v8.y(this.f9489q.f9598a, false);
                np s12 = np.s1(this.f9489q.f9598a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f9489q.f9598a);
                long j3 = this.h;
                if (y10.f9601e && y10.q(null, false, false).amount < j3) {
                    this.f9482j = true;
                    this.f9476b.f((int) (-this.h), c(), this.f9480g);
                    v8 v8Var = this.f9489q;
                    v8Var.f9603g = 0L;
                    ns.f(v8Var.f9598a).k(i7, new Object[0]);
                    ns.f(this.f9489q.f9598a).k(ns.f25543o1, Long.valueOf(gj.B0(this.f9476b.f23817k)), Integer.valueOf(this.f9476b.e1()), this.f9476b.f23817k.reactions);
                    if (this.f9475a.f9181a >= 0) {
                        str = q10.k(this.f9477c.getMessagesController().a2(Long.valueOf(this.f9475a.f9181a)));
                    } else {
                        TLRPC.Chat M0 = this.f9477c.getMessagesController().M0(Long.valueOf(-this.f9475a.f9181a));
                        if (M0 == null) {
                            str = "";
                        } else {
                            str = M0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f9477c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.f26600b;
                    }
                    new cb(parentActivity, this.f9477c.getResourceProvider(), j3, 5, str2, new s8(this, j3, 0), 0L).show();
                } else {
                    this.f9481i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = s12.j1(this.f9475a.f9181a);
                    tL_messages_sendPaidReaction.msg_id = this.f9475a.f9182b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.f22414b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != m10.i(this.f9489q.f9598a).e()) {
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
                    this.f9489q.O();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new o2(this, s12, j3, 2));
                }
            }
        } else {
            this.f9482j = true;
            this.f9476b.f((int) (-this.h), c(), this.f9480g);
            v8 v8Var2 = this.f9489q;
            v8Var2.f9603g -= this.h;
            ns.f(v8Var2.f9598a).k(i7, new Object[0]);
        }
        this.d.b();
        h6 h6Var = this.f9487o;
        if (h6Var != null && (gjVar = this.f9476b) != null && gjVar.e1() == h6Var.f8691c) {
            this.f9487o.c();
        }
        v8 v8Var3 = this.f9489q;
        if (v8Var3.B == this) {
            v8Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f9486n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f9489q.B(this.f9476b);
    }

    public final String d() {
        if (c() == 2666000) {
            return hd.M0(2131745029, null);
        }
        if (c() != 0 && c() != m10.i(this.f9489q.f9598a).e()) {
            return hd.a0(null, null, 2131745024, org.telegram.messenger.m5.t(c()));
        }
        return hd.M0(2131745025, null);
    }
}
