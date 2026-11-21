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
public final class w8 {
    public final r8 f9993a;
    public final fj f9994b;
    public final bn f9995c;
    public final org.telegram.ui.Components.gc d;
    public final org.telegram.ui.Components.ac f9996e;
    public final x8 f9997f;
    public final boolean f9998g;
    public long h;
    public long f10001k;
    public boolean f10002l;
    public boolean f10003m;
    public k6 f10005o;
    public final u8 f10006p;
    public final y8 f10007q;
    public boolean f9999i = false;
    public boolean f10000j = false;
    public Long f10004n = null;

    public w8(y8 y8Var, r8 r8Var, fj fjVar, bn bnVar, boolean z10) {
        this.f10007q = y8Var;
        boolean z11 = false;
        u8 u8Var = new u8(this, 0);
        this.f10006p = u8Var;
        this.f9993a = r8Var;
        this.f9994b = fjVar;
        this.f9995c = bnVar;
        Context t6 = y8.t(bnVar);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, bnVar.Ba);
        this.f9996e = acVar;
        acVar.c(2131624227, new String[0]);
        acVar.f33474b.setText(d());
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, bnVar.Ba, true, false);
        ecVar.e(gd.N0(2131744782, null));
        ecVar.f34727b = new u8(this, 1);
        ?? zbVar = new org.telegram.ui.Components.zb(t6, bnVar.Ba);
        this.f9997f = zbVar;
        zbVar.f42762b = 5000L;
        int i7 = org.telegram.ui.ActionBar.m6.xj;
        zm zmVar = bnVar.Ba;
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.t6.P(i7, -1, 0, 0.0f, zmVar);
        vVar2.d(P, zbVar);
        org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, zbVar);
        w10.c(i7, -1, 0, 0.0f, zmVar);
        w10.f29824n = vVar;
        w10.f29825o = vVar2;
        w10.f29823m = false;
        w10.f29818g = P;
        ecVar.addView((View) zbVar, c8.ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.f34729e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(bnVar).b(acVar, -1);
        this.d = b10;
        b10.f35516r = false;
        if (z10) {
            b10.k(true);
            this.f10003m = true;
        }
        b10.v = u8Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (fjVar.f23993k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= fjVar.f23993k.reactions.results.size()) {
                    break;
                } else if (fjVar.f23993k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = fjVar.f23993k.reactions.results.get(i10).chosen;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f9998g = z11;
    }

    public final void a() {
        y8 y8Var = this.f10007q;
        int i7 = y8Var.f10082a;
        org.telegram.messenger.g0.r(this.f10006p);
        this.f10000j = true;
        this.d.b();
        k6 k6Var = this.f10005o;
        if (k6Var != null) {
            k6Var.c();
        }
        boolean z10 = this.f9998g;
        long c10 = c();
        fj fjVar = this.f9994b;
        fjVar.f((int) (-this.h), c10, z10);
        y8Var.f10087g -= this.h;
        ks.f(i7).k(ks.A3, new Object[0]);
        ks.f(i7).k(ks.f25189o1, Long.valueOf(fj.B0(fjVar.f23993k)), Integer.valueOf(fjVar.e1()), fjVar.f23993k.reactions);
        if (y8Var.B == this) {
            y8Var.B = null;
        }
    }

    public final void b() {
        fj fjVar;
        String str;
        int i7 = ks.A3;
        org.telegram.messenger.g0.r(this.f10006p);
        if (this.f10002l) {
            if (!this.f9999i && !this.f10000j) {
                y8 y10 = y8.y(this.f10007q.f10082a, false);
                mp u12 = mp.u1(this.f10007q.f10082a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f10007q.f10082a);
                long j3 = this.h;
                if (y10.f10085e && y10.q(null, false, false).amount < j3) {
                    this.f10000j = true;
                    this.f9994b.f((int) (-this.h), c(), this.f9998g);
                    y8 y8Var = this.f10007q;
                    y8Var.f10087g = 0L;
                    ks.f(y8Var.f10082a).k(i7, new Object[0]);
                    ks.f(this.f10007q.f10082a).k(ks.f25189o1, Long.valueOf(fj.B0(this.f9994b.f23993k)), Integer.valueOf(this.f9994b.e1()), this.f9994b.f23993k.reactions);
                    if (this.f9993a.f9696a >= 0) {
                        str = o10.l(this.f9995c.getMessagesController().c2(Long.valueOf(this.f9993a.f9696a)));
                    } else {
                        TLRPC.Chat O0 = this.f9995c.getMessagesController().O0(Long.valueOf(-this.f9993a.f9696a));
                        if (O0 == null) {
                            str = "";
                        } else {
                            str = O0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f9995c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.f26941b;
                    }
                    new fb(parentActivity, this.f9995c.getResourceProvider(), j3, 5, str2, new v8(this, j3, 0), 0L).show();
                } else {
                    this.f9999i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = u12.l1(this.f9993a.f9696a);
                    tL_messages_sendPaidReaction.msg_id = this.f9993a.f9697b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.f22805b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != j10.i(this.f10007q.f10082a).e()) {
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
                    this.f10007q.N();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new q2(this, u12, j3, 2));
                }
            }
        } else {
            this.f10000j = true;
            this.f9994b.f((int) (-this.h), c(), this.f9998g);
            y8 y8Var2 = this.f10007q;
            y8Var2.f10087g -= this.h;
            ks.f(y8Var2.f10082a).k(i7, new Object[0]);
        }
        this.d.b();
        k6 k6Var = this.f10005o;
        if (k6Var != null && (fjVar = this.f9994b) != null && fjVar.e1() == k6Var.f9196c) {
            this.f10005o.c();
        }
        y8 y8Var3 = this.f10007q;
        if (y8Var3.B == this) {
            y8Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f10004n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f10007q.B(this.f9994b);
    }

    public final String d() {
        if (c() == 2666000) {
            return gd.N0(2131744788, null);
        }
        if (c() != 0 && c() != j10.i(this.f10007q.f10082a).e()) {
            return gd.a0(null, null, 2131744783, org.telegram.messenger.n5.t(c()));
        }
        return gd.N0(2131744784, null);
    }
}
