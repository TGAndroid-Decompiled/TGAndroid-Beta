package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.zm;
public final class v8 {
    public final q8 f9931a;
    public final fj f9932b;
    public final bn f9933c;
    public final org.telegram.ui.Components.gc d;
    public final org.telegram.ui.Components.ac f9934e;
    public final w8 f9935f;
    public final boolean f9936g;
    public long h;
    public long f9939k;
    public boolean f9940l;
    public boolean f9941m;
    public k6 f9943o;
    public final t8 f9944p;
    public final x8 f9945q;
    public boolean f9937i = false;
    public boolean f9938j = false;
    public Long f9942n = null;

    public v8(x8 x8Var, q8 q8Var, fj fjVar, bn bnVar, boolean z10) {
        this.f9945q = x8Var;
        boolean z11 = false;
        t8 t8Var = new t8(this, 0);
        this.f9944p = t8Var;
        this.f9931a = q8Var;
        this.f9932b = fjVar;
        this.f9933c = bnVar;
        Context t6 = x8.t(bnVar);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, bnVar.Ba);
        this.f9934e = acVar;
        acVar.c(2131624227, new String[0]);
        acVar.f33328b.setText(d());
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, bnVar.Ba, true, false);
        ecVar.e(gd.M0(2131744788, null));
        ecVar.f34666b = new t8(this, 1);
        ?? zbVar = new org.telegram.ui.Components.zb(t6, bnVar.Ba);
        this.f9935f = zbVar;
        zbVar.f42849b = 5000L;
        int i7 = org.telegram.ui.ActionBar.n6.xj;
        zm zmVar = bnVar.Ba;
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.u6.P(i7, -1, 0, 0.0f, zmVar);
        vVar2.d(P, zbVar);
        org.telegram.ui.ActionBar.o6 w10 = org.telegram.ui.ActionBar.u6.w(101, zbVar);
        w10.c(i7, -1, 0, 0.0f, zmVar);
        w10.f29841n = vVar;
        w10.f29842o = vVar2;
        w10.f29840m = false;
        w10.f29835g = P;
        ecVar.addView((View) zbVar, c8.ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.f34668e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(bnVar).b(acVar, -1);
        this.d = b10;
        b10.f35469r = false;
        if (z10) {
            b10.k(true);
            this.f9941m = true;
        }
        b10.v = t8Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (fjVar.f23965k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= fjVar.f23965k.reactions.results.size()) {
                    break;
                } else if (fjVar.f23965k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = fjVar.f23965k.reactions.results.get(i10).chosen;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f9936g = z11;
    }

    public final void a() {
        x8 x8Var = this.f9945q;
        int i7 = x8Var.f10015a;
        org.telegram.messenger.g0.r(this.f9944p);
        this.f9938j = true;
        this.d.b();
        k6 k6Var = this.f9943o;
        if (k6Var != null) {
            k6Var.c();
        }
        boolean z10 = this.f9936g;
        long c10 = c();
        fj fjVar = this.f9932b;
        fjVar.f((int) (-this.h), c10, z10);
        x8Var.f10020g -= this.h;
        ks.f(i7).k(ks.A3, new Object[0]);
        ks.f(i7).k(ks.f25161o1, Long.valueOf(fj.B0(fjVar.f23965k)), Integer.valueOf(fjVar.e1()), fjVar.f23965k.reactions);
        if (x8Var.B == this) {
            x8Var.B = null;
        }
    }

    public final void b() {
        fj fjVar;
        String str;
        int i7 = ks.A3;
        org.telegram.messenger.g0.r(this.f9944p);
        if (this.f9940l) {
            if (!this.f9937i && !this.f9938j) {
                x8 y10 = x8.y(this.f9945q.f10015a, false);
                mp u12 = mp.u1(this.f9945q.f10015a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f9945q.f10015a);
                long j3 = this.h;
                if (y10.f10018e && y10.q(null, false, false).amount < j3) {
                    this.f9938j = true;
                    this.f9932b.f((int) (-this.h), c(), this.f9936g);
                    x8 x8Var = this.f9945q;
                    x8Var.f10020g = 0L;
                    ks.f(x8Var.f10015a).k(i7, new Object[0]);
                    ks.f(this.f9945q.f10015a).k(ks.f25161o1, Long.valueOf(fj.B0(this.f9932b.f23965k)), Integer.valueOf(this.f9932b.e1()), this.f9932b.f23965k.reactions);
                    if (this.f9931a.f9596a >= 0) {
                        str = o10.l(this.f9933c.getMessagesController().c2(Long.valueOf(this.f9931a.f9596a)));
                    } else {
                        TLRPC.Chat O0 = this.f9933c.getMessagesController().O0(Long.valueOf(-this.f9931a.f9596a));
                        if (O0 == null) {
                            str = "";
                        } else {
                            str = O0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f9933c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.f26913b;
                    }
                    new fb(parentActivity, this.f9933c.getResourceProvider(), j3, 5, str2, new u8(this, j3, 0), 0L).show();
                } else {
                    this.f9937i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = u12.l1(this.f9931a.f9596a);
                    tL_messages_sendPaidReaction.msg_id = this.f9931a.f9597b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.f22777b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != j10.i(this.f9945q.f10015a).e()) {
                        if (c10 == 2666000) {
                            tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                        } else {
                            TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                            tL_messages_sendPaidReaction.privacy = paidreactionprivacypeer;
                            paidreactionprivacypeer.peer = u12.l1(c10);
                        }
                    } else {
                        tL_messages_sendPaidReaction.privacy = new TL_stars.paidReactionPrivacyDefault();
                    }
                    this.f9945q.N();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new p2(this, u12, j3, 2));
                }
            }
        } else {
            this.f9938j = true;
            this.f9932b.f((int) (-this.h), c(), this.f9936g);
            x8 x8Var2 = this.f9945q;
            x8Var2.f10020g -= this.h;
            ks.f(x8Var2.f10015a).k(i7, new Object[0]);
        }
        this.d.b();
        k6 k6Var = this.f9943o;
        if (k6Var != null && (fjVar = this.f9932b) != null && fjVar.e1() == k6Var.f9173c) {
            this.f9943o.c();
        }
        x8 x8Var3 = this.f9945q;
        if (x8Var3.B == this) {
            x8Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f9942n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f9945q.B(this.f9932b);
    }

    public final String d() {
        if (c() == 2666000) {
            return gd.M0(2131744794, null);
        }
        if (c() != 0 && c() != j10.i(this.f9945q.f10015a).e()) {
            return gd.a0(null, null, 2131744789, org.telegram.messenger.n5.t(c()));
        }
        return gd.M0(2131744790, null);
    }
}
