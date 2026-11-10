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
import org.telegram.ui.cn;
public final class ca {
    public final x9 f3590a;
    public final ij f3591b;
    public final cn f3592c;
    public final org.telegram.ui.Components.bc d;
    public final org.telegram.ui.Components.vb f3593e;
    public final da f3594f;
    public final boolean f3595g;
    public long h;
    public long f3598k;
    public boolean f3599l;
    public boolean f3600m;
    public p7 f3602o;
    public final aa f3603p;
    public final ea f3604q;
    public boolean f3596i = false;
    public boolean f3597j = false;
    public Long f3601n = null;

    public ca(ea eaVar, x9 x9Var, ij ijVar, cn cnVar, boolean z9) {
        this.f3604q = eaVar;
        boolean z10 = false;
        aa aaVar = new aa(this, 0);
        this.f3603p = aaVar;
        this.f3590a = x9Var;
        this.f3591b = ijVar;
        this.f3592c = cnVar;
        Context t6 = ea.t(cnVar);
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(t6, cnVar.f44750za);
        this.f3593e = vbVar;
        vbVar.c(2131624226, new String[0]);
        vbVar.f38980b.setText(d());
        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(t6, cnVar.f44750za, true, false);
        zbVar.e(org.telegram.messenger.id.M0(2131745023, null));
        zbVar.f40908b = new aa(this, 1);
        ?? ubVar = new org.telegram.ui.Components.ub(t6, cnVar.f44750za);
        this.f3594f = ubVar;
        ubVar.f38609b = 5000L;
        int i7 = org.telegram.ui.ActionBar.m6.uj;
        an anVar = cnVar.f44750za;
        a3.l lVar = new a3.l(24);
        a3.l lVar2 = new a3.l(25);
        int P = org.telegram.ui.ActionBar.t6.P(i7, -1, 0, 0.0f, anVar);
        lVar2.c(P, ubVar);
        org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, ubVar);
        w10.c(i7, -1, 0, 0.0f, anVar);
        w10.f28335n = lVar;
        w10.f28336o = lVar2;
        w10.f28334m = false;
        w10.f28329g = P;
        zbVar.addView((View) ubVar, c8.ha.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        zbVar.f40910e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        vbVar.setButton(zbVar);
        org.telegram.ui.Components.bc b10 = org.telegram.ui.Components.gc.a0(cnVar).b(vbVar, -1);
        this.d = b10;
        b10.f32211r = false;
        if (z9) {
            b10.k(true);
            this.f3600m = true;
        }
        b10.v = aaVar;
        this.h = 0L;
        System.currentTimeMillis();
        if (ijVar.f23266k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= ijVar.f23266k.reactions.results.size()) {
                    break;
                } else if (ijVar.f23266k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z10 = ijVar.f23266k.reactions.results.get(i10).chosen;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f3595g = z10;
    }

    public final void a() {
        ea eaVar = this.f3604q;
        int i7 = eaVar.f3804a;
        org.telegram.messenger.g0.r(this.f3603p);
        this.f3597j = true;
        this.d.b();
        p7 p7Var = this.f3602o;
        if (p7Var != null) {
            p7Var.c();
        }
        boolean z9 = this.f3595g;
        long c10 = c();
        ij ijVar = this.f3591b;
        ijVar.f((int) (-this.h), c10, z9);
        eaVar.f3809g -= this.h;
        qs.f(i7).k(qs.f25118y3, new Object[0]);
        qs.f(i7).k(qs.f25051o1, Long.valueOf(ij.B0(ijVar.f23266k)), Integer.valueOf(ijVar.e1()), ijVar.f23266k.reactions);
        if (eaVar.B == this) {
            eaVar.B = null;
        }
    }

    public final void b() {
        ij ijVar;
        String str;
        int i7 = qs.f25118y3;
        org.telegram.messenger.g0.r(this.f3603p);
        if (this.f3599l) {
            if (!this.f3596i && !this.f3597j) {
                ea y10 = ea.y(this.f3604q.f3804a, false);
                qp s12 = qp.s1(this.f3604q.f3804a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f3604q.f3804a);
                long j3 = this.h;
                if (y10.f3807e && y10.q(null, false, false).amount < j3) {
                    this.f3597j = true;
                    this.f3591b.f((int) (-this.h), c(), this.f3595g);
                    ea eaVar = this.f3604q;
                    eaVar.f3809g = 0L;
                    qs.f(eaVar.f3804a).k(i7, new Object[0]);
                    qs.f(this.f3604q.f3804a).k(qs.f25051o1, Long.valueOf(ij.B0(this.f3591b.f23266k)), Integer.valueOf(this.f3591b.e1()), this.f3591b.f23266k.reactions);
                    if (this.f3590a.f5045a >= 0) {
                        str = t10.k(this.f3592c.getMessagesController().a2(Long.valueOf(this.f3590a.f5045a)));
                    } else {
                        TLRPC.Chat M0 = this.f3592c.getMessagesController().M0(Long.valueOf(-this.f3590a.f5045a));
                        if (M0 == null) {
                            str = "";
                        } else {
                            str = M0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f3592c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.G1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.f25570b;
                    }
                    new tc(parentActivity, this.f3592c.getResourceProvider(), j3, 5, str2, new ba(this, j3, 0), 0L).show();
                } else {
                    this.f3596i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = s12.j1(this.f3590a.f5045a);
                    tL_messages_sendPaidReaction.msg_id = this.f3590a.f5046b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.f21339b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != p10.i(this.f3604q.f3804a).e()) {
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
                    this.f3604q.O();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new h3(this, s12, j3, 2));
                }
            }
        } else {
            this.f3597j = true;
            this.f3591b.f((int) (-this.h), c(), this.f3595g);
            ea eaVar2 = this.f3604q;
            eaVar2.f3809g -= this.h;
            qs.f(eaVar2.f3804a).k(i7, new Object[0]);
        }
        this.d.b();
        p7 p7Var = this.f3602o;
        if (p7Var != null && (ijVar = this.f3591b) != null && ijVar.e1() == p7Var.f4520c) {
            this.f3602o.c();
        }
        ea eaVar3 = this.f3604q;
        if (eaVar3.B == this) {
            eaVar3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f3601n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f3604q.B(this.f3591b);
    }

    public final String d() {
        if (c() == 2666000) {
            return org.telegram.messenger.id.M0(2131745029, null);
        }
        if (c() != 0 && c() != p10.i(this.f3604q.f3804a).e()) {
            return org.telegram.messenger.id.a0(null, null, 2131745024, org.telegram.messenger.m5.t(c()));
        }
        return org.telegram.messenger.id.M0(2131745025, null);
    }
}
