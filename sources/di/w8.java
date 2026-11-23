package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.zm;
public final class w8 {
    public final r8 f9996a;
    public final gj f9997b;
    public final bn f9998c;
    public final org.telegram.ui.Components.gc d;
    public final org.telegram.ui.Components.ac f9999e;
    public final x8 f10000f;
    public final boolean f10001g;
    public long h;
    public long f10004k;
    public boolean f10005l;
    public boolean f10006m;
    public k6 f10008o;
    public final u8 f10009p;
    public final y8 f10010q;
    public boolean f10002i = false;
    public boolean f10003j = false;
    public Long f10007n = null;

    public w8(y8 y8Var, r8 r8Var, gj gjVar, bn bnVar, boolean z10) {
        this.f10010q = y8Var;
        boolean z11 = false;
        u8 u8Var = new u8(this, 0);
        this.f10009p = u8Var;
        this.f9996a = r8Var;
        this.f9997b = gjVar;
        this.f9998c = bnVar;
        Context t6 = y8.t(bnVar);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, bnVar.Ba);
        this.f9999e = acVar;
        acVar.c(2131624227, new String[0]);
        acVar.f33487b.setText(d());
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, bnVar.Ba, true, false);
        ecVar.e(hd.N0(2131744780, null));
        ecVar.f34725b = new u8(this, 1);
        ?? zbVar = new org.telegram.ui.Components.zb(t6, bnVar.Ba);
        this.f10000f = zbVar;
        zbVar.f42765b = 5000L;
        int i7 = org.telegram.ui.ActionBar.m6.xj;
        zm zmVar = bnVar.Ba;
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.t6.P(i7, -1, 0, 0.0f, zmVar);
        vVar2.d(P, zbVar);
        org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, zbVar);
        w10.c(i7, -1, 0, 0.0f, zmVar);
        w10.f29827n = vVar;
        w10.f29828o = vVar2;
        w10.f29826m = false;
        w10.f29821g = P;
        ecVar.addView((View) zbVar, c8.ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.f34727e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(bnVar).b(acVar, -1);
        this.d = b10;
        b10.f35535r = false;
        if (z10) {
            b10.k(true);
            this.f10006m = true;
        }
        b10.v = u8Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (gjVar.f24213k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= gjVar.f24213k.reactions.results.size()) {
                    break;
                } else if (gjVar.f24213k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = gjVar.f24213k.reactions.results.get(i10).chosen;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f10001g = z11;
    }

    public final void a() {
        y8 y8Var = this.f10010q;
        int i7 = y8Var.f10085a;
        org.telegram.messenger.g0.r(this.f10009p);
        this.f10003j = true;
        this.d.b();
        k6 k6Var = this.f10008o;
        if (k6Var != null) {
            k6Var.c();
        }
        boolean z10 = this.f10001g;
        long c10 = c();
        gj gjVar = this.f9997b;
        gjVar.f((int) (-this.h), c10, z10);
        y8Var.f10090g -= this.h;
        ls.f(i7).k(ls.A3, new Object[0]);
        ls.f(i7).k(ls.f25355o1, Long.valueOf(gj.B0(gjVar.f24213k)), Integer.valueOf(gjVar.e1()), gjVar.f24213k.reactions);
        if (y8Var.B == this) {
            y8Var.B = null;
        }
    }

    public final void b() {
        gj gjVar;
        String str;
        int i7 = ls.A3;
        org.telegram.messenger.g0.r(this.f10009p);
        if (this.f10005l) {
            if (!this.f10002i && !this.f10003j) {
                y8 y10 = y8.y(this.f10010q.f10085a, false);
                np u12 = np.u1(this.f10010q.f10085a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f10010q.f10085a);
                long j3 = this.h;
                if (y10.f10088e && y10.q(null, false, false).amount < j3) {
                    this.f10003j = true;
                    this.f9997b.f((int) (-this.h), c(), this.f10001g);
                    y8 y8Var = this.f10010q;
                    y8Var.f10090g = 0L;
                    ls.f(y8Var.f10085a).k(i7, new Object[0]);
                    ls.f(this.f10010q.f10085a).k(ls.f25355o1, Long.valueOf(gj.B0(this.f9997b.f24213k)), Integer.valueOf(this.f9997b.e1()), this.f9997b.f24213k.reactions);
                    if (this.f9996a.f9699a >= 0) {
                        str = p10.l(this.f9998c.getMessagesController().c2(Long.valueOf(this.f9996a.f9699a)));
                    } else {
                        TLRPC.Chat O0 = this.f9998c.getMessagesController().O0(Long.valueOf(-this.f9996a.f9699a));
                        if (O0 == null) {
                            str = "";
                        } else {
                            str = O0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f9998c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.f26931b;
                    }
                    new fb(parentActivity, this.f9998c.getResourceProvider(), j3, 5, str2, new v8(this, j3, 0), 0L).show();
                } else {
                    this.f10002i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = u12.l1(this.f9996a.f9699a);
                    tL_messages_sendPaidReaction.msg_id = this.f9996a.f9700b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.f22808b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != k10.i(this.f10010q.f10085a).e()) {
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
                    this.f10010q.N();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new q2(this, u12, j3, 2));
                }
            }
        } else {
            this.f10003j = true;
            this.f9997b.f((int) (-this.h), c(), this.f10001g);
            y8 y8Var2 = this.f10010q;
            y8Var2.f10090g -= this.h;
            ls.f(y8Var2.f10085a).k(i7, new Object[0]);
        }
        this.d.b();
        k6 k6Var = this.f10008o;
        if (k6Var != null && (gjVar = this.f9997b) != null && gjVar.e1() == k6Var.f9199c) {
            this.f10008o.c();
        }
        y8 y8Var3 = this.f10010q;
        if (y8Var3.B == this) {
            y8Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f10007n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f10010q.B(this.f9997b);
    }

    public final String d() {
        if (c() == 2666000) {
            return hd.N0(2131744786, null);
        }
        if (c() != 0 && c() != k10.i(this.f10010q.f10085a).e()) {
            return hd.a0(null, null, 2131744781, org.telegram.messenger.n5.t(c()));
        }
        return hd.N0(2131744782, null);
    }
}
