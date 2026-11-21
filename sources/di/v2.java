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
public final class v2 implements Runnable {
    public final int f9931a = 1;
    public final f6 f9932b;
    public final TLObject f9933c;
    public final long d;
    public final long f9934e;
    public final TLRPC.TL_error f9935f;
    public final long h;
    public final Object f9936n;

    public v2(f6 f6Var, TLObject tLObject, long j3, long j10, x10 x10Var, TLRPC.TL_error tL_error, long j11) {
        this.f9932b = f6Var;
        this.f9933c = tLObject;
        this.d = j3;
        this.f9934e = j10;
        this.f9936n = x10Var;
        this.f9935f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f9931a) {
            case 0:
                f6 f6Var = this.f9932b;
                TLObject tLObject = this.f9933c;
                long j3 = this.d;
                long j10 = this.f9934e;
                long j11 = this.h;
                TLRPC.TL_error tL_error = this.f9935f;
                ((org.telegram.ui.ActionBar.t1) this.f9936n).c(400L);
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        f6Var.dismiss();
                        y8.y(f6Var.f30170a, false).O(j3);
                        if (j3 >= 0) {
                            TLRPC.UserFull d2 = mp.u1(f6Var.f30170a).d2(j10);
                            if (d2 != null) {
                                int max = Math.max(0, d2.stargifts_count - 1);
                                d2.stargifts_count = max;
                                if (max <= 0) {
                                    d2.flags2 &= -257;
                                }
                            }
                            y8.y(f6Var.f30170a, false).N();
                            y8.y(f6Var.f30170a, false).R(true);
                            if (!(T instanceof pb)) {
                                pb pbVar = new pb();
                                pbVar.whenFullyVisible(new bi.c4(pbVar, j11, 1));
                                T.presentFragment(pbVar);
                                return;
                            }
                            org.telegram.ui.Components.lc.b0(T).I(2131624227, gd.N0(2131750204, null), gd.H(',', "Gift2Converted", (int) j11)).k(true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", -j3);
                        bundle.putBoolean("start_from_monetization", true);
                        c51 c51Var = new c51(bundle);
                        e0.g(f6Var.f30170a).h(j3, true);
                        e0.g(f6Var.f30170a).l(j3);
                        c51Var.whenFullyVisible(new bi.c4(c51Var, j11, 2));
                        T.presentFragment(c51Var);
                        return;
                    } else if (tL_error != null) {
                        f6Var.k().t(org.telegram.ui.Components.lc.W(tL_error.text), null).k(false);
                        return;
                    } else {
                        f6Var.k().t(gd.N0(2131743636, null), null).k(false);
                        return;
                    }
                }
                return;
            default:
                f6 f6Var2 = this.f9932b;
                TLObject tLObject2 = this.f9933c;
                long j12 = this.d;
                long j13 = this.f9934e;
                x10 x10Var = (x10) this.f9936n;
                TLRPC.TL_error tL_error2 = this.f9935f;
                long j14 = this.h;
                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    mp.u1(f6Var2.f30170a).f4(tL_payments_paymentResult.updates.users, false);
                    mp.u1(f6Var2.f30170a).Z3(tL_payments_paymentResult.updates.chats, false);
                    y8.y(f6Var2.f30170a, false).R(false);
                    y8.y(f6Var2.f30170a, false).O(j12);
                    y8.y(f6Var2.f30170a, false).O(j13);
                    y8.y(f6Var2.f30170a, false).N();
                    x10Var.a(null);
                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j12 >= 0 && j13 >= 0) {
                            bn ua2 = bn.ua(j12);
                            ua2.whenFullyVisible(new b3(f6Var2, ua2, j12, 1));
                            T2.presentFragment(ua2);
                        } else {
                            org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(T2).I(2131624029, gd.N0(2131749880, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749881, f6Var2.E1(), org.telegram.messenger.n5.t(j12))));
                            I.f35518t = true;
                            I.j();
                        }
                    }
                    Utilities.d.c(new i3(f6Var2, tL_payments_paymentResult, 1));
                    return;
                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                    if (mp.u1(f6Var2.f30170a).f25735m7) {
                        f6Var2.f8803g2.setLoading(false);
                        y8.c0(f6Var2.getContext(), f6Var2.J0);
                        return;
                    }
                    y8 y10 = y8.y(f6Var2.f30170a, false);
                    d3.e0 e0Var = new d3.e0(f6Var2, j14, j12, x10Var, 1);
                    y10.f10085e = false;
                    y10.q(e0Var, false, true);
                    y10.f10085e = true;
                    return;
                } else {
                    x10Var.a(tL_error2);
                    f6Var2.k().g0(tL_error2, false);
                    return;
                }
        }
    }

    public v2(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f9932b = f6Var;
        this.f9936n = t1Var;
        this.f9933c = tLObject;
        this.d = j3;
        this.f9934e = j10;
        this.h = j11;
        this.f9935f = tL_error;
    }
}
