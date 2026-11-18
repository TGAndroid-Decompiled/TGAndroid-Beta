package di;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
public final class u2 implements Runnable {
    public final int f9848a = 1;
    public final f6 f9849b;
    public final TLObject f9850c;
    public final long d;
    public final long f9851e;
    public final TLRPC.TL_error f9852f;
    public final long h;
    public final Object f9853n;

    public u2(f6 f6Var, TLObject tLObject, long j3, long j10, x10 x10Var, TLRPC.TL_error tL_error, long j11) {
        this.f9849b = f6Var;
        this.f9850c = tLObject;
        this.d = j3;
        this.f9851e = j10;
        this.f9853n = x10Var;
        this.f9852f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f9848a) {
            case 0:
                f6 f6Var = this.f9849b;
                TLObject tLObject = this.f9850c;
                long j3 = this.d;
                long j10 = this.f9851e;
                long j11 = this.h;
                TLRPC.TL_error tL_error = this.f9852f;
                ((org.telegram.ui.ActionBar.u1) this.f9853n).c(400L);
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        f6Var.dismiss();
                        x8.y(f6Var.f30189a, false).O(j3);
                        if (j3 >= 0) {
                            TLRPC.UserFull d2 = mp.u1(f6Var.f30189a).d2(j10);
                            if (d2 != null) {
                                int max = Math.max(0, d2.stargifts_count - 1);
                                d2.stargifts_count = max;
                                if (max <= 0) {
                                    d2.flags2 &= -257;
                                }
                            }
                            x8.y(f6Var.f30189a, false).N();
                            x8.y(f6Var.f30189a, false).R(true);
                            if (!(T instanceof pb)) {
                                pb pbVar = new pb();
                                pbVar.whenFullyVisible(new bi.y3(pbVar, j11, 1));
                                T.presentFragment(pbVar);
                                return;
                            }
                            org.telegram.ui.Components.lc.b0(T).I(2131624227, gd.M0(2131750205, null), gd.H(',', "Gift2Converted", (int) j11)).k(true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", -j3);
                        bundle.putBoolean("start_from_monetization", true);
                        c51 c51Var = new c51(bundle);
                        e0.g(f6Var.f30189a).h(j3, true);
                        e0.g(f6Var.f30189a).l(j3);
                        c51Var.whenFullyVisible(new bi.y3(c51Var, j11, 2));
                        T.presentFragment(c51Var);
                        return;
                    } else if (tL_error != null) {
                        f6Var.k().t(org.telegram.ui.Components.lc.W(tL_error.text), null).k(false);
                        return;
                    } else {
                        f6Var.k().t(gd.M0(2131743642, null), null).k(false);
                        return;
                    }
                }
                return;
            default:
                f6 f6Var2 = this.f9849b;
                TLObject tLObject2 = this.f9850c;
                long j12 = this.d;
                long j13 = this.f9851e;
                x10 x10Var = (x10) this.f9853n;
                TLRPC.TL_error tL_error2 = this.f9852f;
                long j14 = this.h;
                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    mp.u1(f6Var2.f30189a).f4(tL_payments_paymentResult.updates.users, false);
                    mp.u1(f6Var2.f30189a).Z3(tL_payments_paymentResult.updates.chats, false);
                    x8.y(f6Var2.f30189a, false).R(false);
                    x8.y(f6Var2.f30189a, false).O(j12);
                    x8.y(f6Var2.f30189a, false).O(j13);
                    x8.y(f6Var2.f30189a, false).N();
                    x10Var.a(null);
                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j12 >= 0 && j13 >= 0) {
                            bn ua2 = bn.ua(j12);
                            ua2.whenFullyVisible(new b3(f6Var2, ua2, j12, 1));
                            T2.presentFragment(ua2);
                        } else {
                            org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(T2).I(2131624029, gd.M0(2131749881, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749882, f6Var2.E1(), org.telegram.messenger.n5.t(j12))));
                            I.f35471t = true;
                            I.j();
                        }
                    }
                    Utilities.d.c(new i3(f6Var2, tL_payments_paymentResult, 1));
                    return;
                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                    if (mp.u1(f6Var2.f30189a).f25709m7) {
                        f6Var2.f8782g2.setLoading(false);
                        x8.c0(f6Var2.getContext(), f6Var2.J0);
                        return;
                    }
                    x8 y10 = x8.y(f6Var2.f30189a, false);
                    d3.e0 e0Var = new d3.e0(f6Var2, j14, j12, x10Var, 1);
                    y10.f10021e = false;
                    y10.q(e0Var, false, true);
                    y10.f10021e = true;
                    return;
                } else {
                    x10Var.a(tL_error2);
                    f6Var2.k().g0(tL_error2, false);
                    return;
                }
        }
    }

    public u2(f6 f6Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f9849b = f6Var;
        this.f9853n = u1Var;
        this.f9850c = tLObject;
        this.d = j3;
        this.f9851e = j10;
        this.h = j11;
        this.f9852f = tL_error;
    }
}
