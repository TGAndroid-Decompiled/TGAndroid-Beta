package bi;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.c51;
public final class c3 implements Runnable {
    public final int f3558a = 1;
    public final k7 f3559b;
    public final TLObject f3560c;
    public final long d;
    public final long f3561e;
    public final TLRPC.TL_error f3562f;
    public final long h;
    public final Object f3563n;

    public c3(k7 k7Var, TLObject tLObject, long j3, long j10, c20 c20Var, TLRPC.TL_error tL_error, long j11) {
        this.f3559b = k7Var;
        this.f3560c = tLObject;
        this.d = j3;
        this.f3561e = j10;
        this.f3563n = c20Var;
        this.f3562f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f3558a) {
            case 0:
                k7 k7Var = this.f3559b;
                TLObject tLObject = this.f3560c;
                long j3 = this.d;
                long j10 = this.f3561e;
                long j11 = this.h;
                TLRPC.TL_error tL_error = this.f3562f;
                ((org.telegram.ui.ActionBar.u1) this.f3563n).c(400L);
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        k7Var.dismiss();
                        ea.y(k7Var.f28612a, false).P(j3);
                        if (j3 >= 0) {
                            TLRPC.UserFull b22 = qp.s1(k7Var.f28612a).b2(j10);
                            if (b22 != null) {
                                int max = Math.max(0, b22.stargifts_count - 1);
                                b22.stargifts_count = max;
                                if (max <= 0) {
                                    b22.flags2 &= -257;
                                }
                            }
                            ea.y(k7Var.f28612a, false).O();
                            ea.y(k7Var.f28612a, false).S(true);
                            if (!(T instanceof dd)) {
                                dd ddVar = new dd();
                                ddVar.whenFullyVisible(new r3(ddVar, j11, 0));
                                T.presentFragment(ddVar);
                                return;
                            }
                            org.telegram.ui.Components.hc.a0(T).I(2131624226, org.telegram.messenger.hd.M0(2131750220, null), org.telegram.messenger.hd.H(',', "Gift2Converted", (int) j11)).k(true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", -j3);
                        bundle.putBoolean("start_from_monetization", true);
                        c51 c51Var = new c51(bundle);
                        n0.g(k7Var.f28612a).h(j3, true);
                        n0.g(k7Var.f28612a).l(j3);
                        c51Var.whenFullyVisible(new r3(c51Var, j11, 1));
                        T.presentFragment(c51Var);
                        return;
                    } else if (tL_error != null) {
                        k7Var.k().t(org.telegram.messenger.hd.a0(null, null, 2131743879, tL_error.text), null).k(false);
                        return;
                    } else {
                        k7Var.k().t(org.telegram.messenger.hd.M0(2131743880, null), null).k(false);
                        return;
                    }
                }
                return;
            default:
                k7 k7Var2 = this.f3559b;
                TLObject tLObject2 = this.f3560c;
                long j12 = this.d;
                long j13 = this.f3561e;
                c20 c20Var = (c20) this.f3563n;
                TLRPC.TL_error tL_error2 = this.f3562f;
                long j14 = this.h;
                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    qp.s1(k7Var2.f28612a).Y3(tL_payments_paymentResult.updates.users, false);
                    qp.s1(k7Var2.f28612a).S3(tL_payments_paymentResult.updates.chats, false);
                    ea.y(k7Var2.f28612a, false).S(false);
                    ea.y(k7Var2.f28612a, false).P(j12);
                    ea.y(k7Var2.f28612a, false).P(j13);
                    ea.y(k7Var2.f28612a, false).O();
                    c20Var.a(null);
                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j12 >= 0 && j13 >= 0) {
                            an ra2 = an.ra(j12);
                            ra2.whenFullyVisible(new s3(k7Var2, ra2, j12, 1));
                            T2.presentFragment(ra2);
                        } else {
                            org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(T2).I(2131624028, org.telegram.messenger.hd.M0(2131749896, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749897, k7Var2.z1(), org.telegram.messenger.m5.t(j12))));
                            I.f32533t = true;
                            I.j();
                        }
                    }
                    Utilities.d.c(new c4(k7Var2, tL_payments_paymentResult, 1));
                    return;
                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                    if (qp.s1(k7Var2.f28612a).f24802j7) {
                        k7Var2.f4168c2.setLoading(false);
                        ea.c0(k7Var2.getContext(), k7Var2.I0);
                        return;
                    }
                    ea y10 = ea.y(k7Var2.f28612a, false);
                    h4 h4Var = new h4(k7Var2, j14, j12, c20Var, 0);
                    y10.f3810e = false;
                    y10.q(h4Var, false, true);
                    y10.f3810e = true;
                    return;
                } else {
                    c20Var.a(tL_error2);
                    k7Var2.k().f0(tL_error2, false);
                    return;
                }
        }
    }

    public c3(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f3559b = k7Var;
        this.f3563n = u1Var;
        this.f3560c = tLObject;
        this.d = j3;
        this.f3561e = j10;
        this.h = j11;
        this.f3562f = tL_error;
    }
}
