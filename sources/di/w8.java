package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.zm;
public final class w8 {
    public final r8 f9957a;
    public final fj f9958b;
    public final bn f9959c;
    public final org.telegram.ui.Components.fc d;
    public final org.telegram.ui.Components.zb f9960e;
    public final x8 f9961f;
    public final boolean f9962g;
    public long h;
    public long f9965k;
    public boolean f9966l;
    public boolean f9967m;
    public k6 f9969o;
    public final u8 f9970p;
    public final y8 f9971q;
    public boolean f9963i = false;
    public boolean f9964j = false;
    public Long f9968n = null;

    public w8(y8 y8Var, r8 r8Var, fj fjVar, bn bnVar, boolean z10) {
        this.f9971q = y8Var;
        boolean z11 = false;
        u8 u8Var = new u8(this, 0);
        this.f9970p = u8Var;
        this.f9957a = r8Var;
        this.f9958b = fjVar;
        this.f9959c = bnVar;
        Context t6 = y8.t(bnVar);
        org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(t6, bnVar.Ba);
        this.f9960e = zbVar;
        zbVar.f42810a.f(2131624227, 32, 32, null);
        zbVar.f42811b.setText(d());
        org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(t6, bnVar.Ba, true, false);
        dcVar.e(gd.N0(2131744782, null));
        dcVar.f34267b = new u8(this, 1);
        ?? ybVar = new org.telegram.ui.Components.yb(t6, bnVar.Ba);
        this.f9961f = ybVar;
        ybVar.f42399b = 5000L;
        int i7 = org.telegram.ui.ActionBar.n6.xj;
        zm zmVar = bnVar.Ba;
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.u6.P(i7, -1, 0, 0.0f, zmVar);
        vVar2.g(P, ybVar);
        org.telegram.ui.ActionBar.o6 w10 = org.telegram.ui.ActionBar.u6.w(101, ybVar);
        w10.c(i7, -1, 0, 0.0f, zmVar);
        w10.f29912n = vVar;
        w10.f29913o = vVar2;
        w10.f29911m = false;
        w10.f29906g = P;
        dcVar.addView((View) ybVar, c8.na.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        dcVar.f34269e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        zbVar.setButton(dcVar);
        org.telegram.ui.Components.fc b10 = org.telegram.ui.Components.kc.b0(bnVar).b(zbVar, -1);
        this.d = b10;
        b10.f35099r = false;
        if (z10) {
            b10.k(true);
            this.f9967m = true;
        }
        b10.v = u8Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (fjVar.f24073k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= fjVar.f24073k.reactions.results.size()) {
                    break;
                } else if (fjVar.f24073k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = fjVar.f24073k.reactions.results.get(i10).chosen;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f9962g = z11;
    }

    public final void a() {
        y8 y8Var = this.f9971q;
        int i7 = y8Var.f10046a;
        org.telegram.messenger.g0.r(this.f9970p);
        this.f9964j = true;
        this.d.b();
        k6 k6Var = this.f9969o;
        if (k6Var != null) {
            k6Var.c();
        }
        boolean z10 = this.f9962g;
        long c10 = c();
        fj fjVar = this.f9958b;
        fjVar.f((int) (-this.h), c10, z10);
        y8Var.f10051g -= this.h;
        ks.f(i7).k(ks.A3, new Object[0]);
        ks.f(i7).k(ks.f25260o1, Long.valueOf(fj.B0(fjVar.f24073k)), Integer.valueOf(fjVar.e1()), fjVar.f24073k.reactions);
        if (y8Var.B == this) {
            y8Var.B = null;
        }
    }

    public final void b() {
        fj fjVar;
        String str;
        int i7 = ks.A3;
        org.telegram.messenger.g0.r(this.f9970p);
        if (this.f9966l) {
            if (!this.f9963i && !this.f9964j) {
                y8 y10 = y8.y(this.f9971q.f10046a, false);
                mp u12 = mp.u1(this.f9971q.f10046a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f9971q.f10046a);
                long j3 = this.h;
                if (y10.f10049e && y10.q(null, false, false).amount < j3) {
                    this.f9964j = true;
                    this.f9958b.f((int) (-this.h), c(), this.f9962g);
                    y8 y8Var = this.f9971q;
                    y8Var.f10051g = 0L;
                    ks.f(y8Var.f10046a).k(i7, new Object[0]);
                    ks.f(this.f9971q.f10046a).k(ks.f25260o1, Long.valueOf(fj.B0(this.f9958b.f24073k)), Integer.valueOf(this.f9958b.e1()), this.f9958b.f24073k.reactions);
                    if (this.f9957a.f9660a >= 0) {
                        str = n10.l(this.f9959c.getMessagesController().c2(Long.valueOf(this.f9957a.f9660a)));
                    } else {
                        TLRPC.Chat O0 = this.f9959c.getMessagesController().O0(Long.valueOf(-this.f9957a.f9660a));
                        if (O0 == null) {
                            str = "";
                        } else {
                            str = O0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f9959c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.f27013b;
                    }
                    new fb(parentActivity, this.f9959c.getResourceProvider(), j3, 5, str2, new v8(this, j3, 0), 0L).show();
                } else {
                    this.f9963i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = u12.l1(this.f9957a.f9660a);
                    tL_messages_sendPaidReaction.msg_id = this.f9957a.f9661b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.f22875b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != i10.i(this.f9971q.f10046a).e()) {
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
                    this.f9971q.N();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new q2(this, u12, j3, 2));
                }
            }
        } else {
            this.f9964j = true;
            this.f9958b.f((int) (-this.h), c(), this.f9962g);
            y8 y8Var2 = this.f9971q;
            y8Var2.f10051g -= this.h;
            ks.f(y8Var2.f10046a).k(i7, new Object[0]);
        }
        this.d.b();
        k6 k6Var = this.f9969o;
        if (k6Var != null && (fjVar = this.f9958b) != null && fjVar.e1() == k6Var.f9160c) {
            this.f9969o.c();
        }
        y8 y8Var3 = this.f9971q;
        if (y8Var3.B == this) {
            y8Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f9968n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f9971q.B(this.f9958b);
    }

    public final String d() {
        if (c() == 2666000) {
            return gd.N0(2131744788, null);
        }
        if (c() != 0 && c() != i10.i(this.f9971q.f10046a).e()) {
            return gd.a0(null, null, 2131744783, org.telegram.messenger.n5.t(c()));
        }
        return gd.N0(2131744784, null);
    }
}
