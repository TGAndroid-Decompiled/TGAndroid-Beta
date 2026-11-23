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
    public final r8 f9959a;
    public final gj f9960b;
    public final bn f9961c;
    public final org.telegram.ui.Components.gc d;
    public final org.telegram.ui.Components.ac f9962e;
    public final x8 f9963f;
    public final boolean f9964g;
    public long h;
    public long f9967k;
    public boolean f9968l;
    public boolean f9969m;
    public k6 f9971o;
    public final u8 f9972p;
    public final y8 f9973q;
    public boolean f9965i = false;
    public boolean f9966j = false;
    public Long f9970n = null;

    public w8(y8 y8Var, r8 r8Var, gj gjVar, bn bnVar, boolean z10) {
        this.f9973q = y8Var;
        boolean z11 = false;
        u8 u8Var = new u8(this, 0);
        this.f9972p = u8Var;
        this.f9959a = r8Var;
        this.f9960b = gjVar;
        this.f9961c = bnVar;
        Context t6 = y8.t(bnVar);
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(t6, bnVar.Ba);
        this.f9962e = acVar;
        acVar.c(2131624227, new String[0]);
        acVar.f33453b.setText(d());
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(t6, bnVar.Ba, true, false);
        ecVar.e(hd.N0(2131744782, null));
        ecVar.f34715b = new u8(this, 1);
        ?? zbVar = new org.telegram.ui.Components.zb(t6, bnVar.Ba);
        this.f9963f = zbVar;
        zbVar.f42723b = 5000L;
        int i7 = org.telegram.ui.ActionBar.m6.xj;
        zm zmVar = bnVar.Ba;
        ci.v vVar = new ci.v(4);
        ci.v vVar2 = new ci.v(5);
        int P = org.telegram.ui.ActionBar.t6.P(i7, -1, 0, 0.0f, zmVar);
        vVar2.d(P, zbVar);
        org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, zbVar);
        w10.c(i7, -1, 0, 0.0f, zmVar);
        w10.f29793n = vVar;
        w10.f29794o = vVar2;
        w10.f29792m = false;
        w10.f29787g = P;
        ecVar.addView((View) zbVar, c8.na.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        ecVar.f34717e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
        acVar.setButton(ecVar);
        org.telegram.ui.Components.gc b10 = org.telegram.ui.Components.lc.b0(bnVar).b(acVar, -1);
        this.d = b10;
        b10.f35497r = false;
        if (z10) {
            b10.k(true);
            this.f9969m = true;
        }
        b10.v = u8Var;
        this.h = 0L;
        System.currentTimeMillis();
        if (gjVar.f24177k.reactions != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= gjVar.f24177k.reactions.results.size()) {
                    break;
                } else if (gjVar.f24177k.reactions.results.get(i10).reaction instanceof TLRPC.TL_reactionPaid) {
                    z11 = gjVar.f24177k.reactions.results.get(i10).chosen;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f9964g = z11;
    }

    public final void a() {
        y8 y8Var = this.f9973q;
        int i7 = y8Var.f10048a;
        org.telegram.messenger.g0.r(this.f9972p);
        this.f9966j = true;
        this.d.b();
        k6 k6Var = this.f9971o;
        if (k6Var != null) {
            k6Var.c();
        }
        boolean z10 = this.f9964g;
        long c10 = c();
        gj gjVar = this.f9960b;
        gjVar.f((int) (-this.h), c10, z10);
        y8Var.f10053g -= this.h;
        ls.f(i7).k(ls.A3, new Object[0]);
        ls.f(i7).k(ls.f25319o1, Long.valueOf(gj.B0(gjVar.f24177k)), Integer.valueOf(gjVar.e1()), gjVar.f24177k.reactions);
        if (y8Var.B == this) {
            y8Var.B = null;
        }
    }

    public final void b() {
        gj gjVar;
        String str;
        int i7 = ls.A3;
        org.telegram.messenger.g0.r(this.f9972p);
        if (this.f9968l) {
            if (!this.f9965i && !this.f9966j) {
                y8 y10 = y8.y(this.f9973q.f10048a, false);
                np u12 = np.u1(this.f9973q.f10048a);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f9973q.f10048a);
                long j3 = this.h;
                if (y10.f10051e && y10.q(null, false, false).amount < j3) {
                    this.f9966j = true;
                    this.f9960b.f((int) (-this.h), c(), this.f9964g);
                    y8 y8Var = this.f9973q;
                    y8Var.f10053g = 0L;
                    ls.f(y8Var.f10048a).k(i7, new Object[0]);
                    ls.f(this.f9973q.f10048a).k(ls.f25319o1, Long.valueOf(gj.B0(this.f9960b.f24177k)), Integer.valueOf(this.f9960b.e1()), this.f9960b.f24177k.reactions);
                    if (this.f9959a.f9663a >= 0) {
                        str = p10.l(this.f9961c.getMessagesController().c2(Long.valueOf(this.f9959a.f9663a)));
                    } else {
                        TLRPC.Chat O0 = this.f9961c.getMessagesController().O0(Long.valueOf(-this.f9959a.f9663a));
                        if (O0 == null) {
                            str = "";
                        } else {
                            str = O0.title;
                        }
                    }
                    String str2 = str;
                    Context parentActivity = this.f9961c.getParentActivity();
                    if (parentActivity == null) {
                        parentActivity = LaunchActivity.H1;
                    }
                    if (parentActivity == null) {
                        parentActivity = org.telegram.messenger.t0.f26895b;
                    }
                    new fb(parentActivity, this.f9961c.getResourceProvider(), j3, 5, str2, new v8(this, j3, 0), 0L).show();
                } else {
                    this.f9965i = true;
                    TLRPC.TL_messages_sendPaidReaction tL_messages_sendPaidReaction = new TLRPC.TL_messages_sendPaidReaction();
                    tL_messages_sendPaidReaction.peer = u12.l1(this.f9959a.f9663a);
                    tL_messages_sendPaidReaction.msg_id = this.f9959a.f9664b;
                    tL_messages_sendPaidReaction.random_id = (Utilities.f22772b.nextLong() & 4294967295L) | (connectionsManager.getCurrentTime() << 32);
                    tL_messages_sendPaidReaction.count = (int) this.h;
                    tL_messages_sendPaidReaction.flags |= 1;
                    long c10 = c();
                    if (c10 != 0 && c10 != k10.i(this.f9973q.f10048a).e()) {
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
                    this.f9973q.N();
                    connectionsManager.sendRequest(tL_messages_sendPaidReaction, new p2(this, u12, j3, 2));
                }
            }
        } else {
            this.f9966j = true;
            this.f9960b.f((int) (-this.h), c(), this.f9964g);
            y8 y8Var2 = this.f9973q;
            y8Var2.f10053g -= this.h;
            ls.f(y8Var2.f10048a).k(i7, new Object[0]);
        }
        this.d.b();
        k6 k6Var = this.f9971o;
        if (k6Var != null && (gjVar = this.f9960b) != null && gjVar.e1() == k6Var.f9164c) {
            this.f9971o.c();
        }
        y8 y8Var3 = this.f9973q;
        if (y8Var3.B == this) {
            y8Var3.B = null;
        }
    }

    public final long c() {
        Long l10 = this.f9970n;
        if (l10 != null) {
            return l10.longValue();
        }
        return this.f9973q.B(this.f9960b);
    }

    public final String d() {
        if (c() == 2666000) {
            return hd.N0(2131744788, null);
        }
        if (c() != 0 && c() != k10.i(this.f9973q.f10048a).e()) {
            return hd.a0(null, null, 2131744783, org.telegram.messenger.n5.t(c()));
        }
        return hd.N0(2131744784, null);
    }
}
