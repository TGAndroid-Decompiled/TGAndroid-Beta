package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.ym;
public final class ca {
    public final x9 f3587a;
    public final ij f3588b;
    public final an f3589c;
    public final org.telegram.ui.Components.cc d;
    public final org.telegram.ui.Components.wb f3590e;
    public final da f3591f;
    public final boolean f3592g;
    public long h;
    public long f3595k;
    public boolean f3596l;
    public boolean f3597m;
    public p7 f3599o;
    public final aa f3600p;
    public final ea f3601q;
    public boolean f3593i = false;
    public boolean f3594j = false;
    public Long f3598n = null;

    public ca(ea eaVar, x9 x9Var, ij ijVar, an anVar, boolean z9) {
        this.f3601q = eaVar;
        boolean z10 = false;
        aa aaVar = new aa(this, 0);
        this.f3600p = aaVar;
        this.f3587a = x9Var;
        this.f3588b = ijVar;
        this.f3589c = anVar;
        Context t6 = ea.t(anVar);
        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(t6, anVar.f44022xa);
        this.f3590e = wbVar;
        wbVar.c(2131624226, new String[0]);
        wbVar.f39955b.setText(d());
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, anVar.f44022xa, true, false);
        acVar.e(org.telegram.messenger.hd.M0(2131745024, null));
        acVar.f31756b = new aa(this, 1);
        ?? vbVar = new org.telegram.ui.Components.vb(t6, anVar.f44022xa);
        this.f3591f = vbVar;
        vbVar.f38931b = 5000L;
        int i7 = org.telegram.ui.ActionBar.k6.uj;
        ym ymVar = anVar.f44022xa;
        a3.l lVar = new a3.l(24);
        a3.l lVar2 = new a3.l(25);
        int Q = org.telegram.ui.ActionBar.r6.Q(i7, -1, 0, 0.0f, ymVar);
        lVar2.c(Q, vbVar);
        org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(101, vbVar);
        x10.c(i7, -1, 0, 0.0f, ymVar);
        x10.f28292n = lVar;
        x10.f28293o = lVar2;
        x10.f28291m = false;
        x10.f28286g = Q;
        acVar.addView((View) vbVar, c8.ha.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        acVar.f31758e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        wbVar.setButton(acVar);
        org.telegram.ui.Components.cc b10 = org.telegram.ui.Components.hc.a0(anVar).b(wbVar, -1);
        this.d = b10;
        b10.f32522r = false;
        if (z9) {
            b10.k(true);
            this.f3597m = true;
        }
        b10.v = aaVar;
        this.h = 0L;
        System.currentTimeMillis();
        if (ijVar.f23244k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= ijVar.f23244k.reactions.results.size()) {
                    break;
                } else if (ijVar.f23244k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z10 = ijVar.f23244k.reactions.results.get(i10).chosen;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f3592g = z10;
    }

    public final void a() {
        ea eaVar = this.f3601q;
        int i7 = eaVar.f3807a;
        org.telegram.messenger.g0.r(this.f3600p);
        this.f3594j = true;
        this.d.b();
        p7 p7Var = this.f3599o;
        if (p7Var != null) {
            p7Var.c();
        }
        boolean z9 = this.f3592g;
        long c10 = c();
        ij ijVar = this.f3588b;
        ijVar.f((int) (-this.h), c10, z9);
        eaVar.f3812g -= this.h;
        qs.f(i7).k(qs.f25105y3, new Object[0]);
        qs.f(i7).k(qs.f25038o1, Long.valueOf(ij.B0(ijVar.f23244k)), Integer.valueOf(ijVar.f1()), ijVar.f23244k.reactions);
        if (eaVar.B == this) {
            eaVar.B = null;
        }
    }

    public final void b() {
        ij ijVar;
        String str;
        int i7 = qs.f25105y3;
        org.telegram.messenger.g0.r(this.f3600p);
        if (this.f3596l) {
            if (!this.f3593i && !this.f3594j) {
                ea y10 = ea.y(this.f3601q.f3807a, false);
                qp s12 = qp.s1(this.f3601q.f3807a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f3601q.f3807a);
                long j3 = this.h;
                if (y10.f3810e && y10.q(null, false, false).amount < j3) {
                    this.f3594j = true;
                    this.f3588b.f((int) (-this.h), c(), this.f3592g);
                    ea eaVar = this.f3601q;
                    eaVar.f3812g = 0L;
                    qs.f(eaVar.f3807a).k(i7, new Object[0]);
                    qs.f(this.f3601q.f3807a).k(qs.f25038o1, Long.valueOf(ij.B0(this.f3588b.f23244k)), Integer.valueOf(this.f3588b.f1()), this.f3588b.f23244k.reactions);
                    if (this.f3587a.f5042a >= 0) {
                        str = t10.k(this.f3589c.getMessagesController().a2(Long.valueOf(this.f3587a.f5042a)));
                    } else {
                        TLRPC.Chat M0 = this.f3589c.getMessagesController().M0(Long.valueOf(-this.f3587a.f5042a));
                        if (M0 == null) {
                            str = "";
                        } else {
                            str = M0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f3589c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.f25563b;
                    }
                    new tc(parentActivity, this.f3589c.getResourceProvider(), j3, 5, str2, new ba(this, j3, 0), 0L).show();
                } else {
                    this.f3593i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = s12.j1(this.f3587a.f5042a);
                    tL_messages_sendPaidReaction.msg_id = this.f3587a.f5043b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.f21331b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != p10.i(this.f3601q.f3807a).e()) {
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
                    this.f3601q.O();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new h3(this, s12, j3, 2));
                }
            }
        } else {
            this.f3594j = true;
            this.f3588b.f((int) (-this.h), c(), this.f3592g);
            ea eaVar2 = this.f3601q;
            eaVar2.f3812g -= this.h;
            qs.f(eaVar2.f3807a).k(i7, new Object[0]);
        }
        this.d.b();
        p7 p7Var = this.f3599o;
        if (p7Var != null && (ijVar = this.f3588b) != null && ijVar.f1() == p7Var.f4520c) {
            this.f3599o.c();
        }
        ea eaVar3 = this.f3601q;
        if (eaVar3.B == this) {
            eaVar3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f3598n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f3601q.B(this.f3588b);
    }

    public final String d() {
        if (c() == 2666000) {
            return org.telegram.messenger.hd.M0(2131745030, null);
        }
        if (c() != 0 && c() != p10.i(this.f3601q.f3807a).e()) {
            return org.telegram.messenger.hd.a0(null, null, 2131745025, org.telegram.messenger.m5.t(c()));
        }
        return org.telegram.messenger.hd.M0(2131745026, null);
    }
}
