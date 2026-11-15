package di;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.z41;
public final class k2 implements Runnable {
    public final int f8897a = 1;
    public final c6 f8898b;
    public final TLObject f8899c;
    public final long d;
    public final long f8900e;
    public final TLRPC.TL_error f8901f;
    public final long h;
    public final Object f8902n;

    public k2(c6 c6Var, TLObject tLObject, long j3, long j10, z10 z10Var, TLRPC.TL_error tL_error, long j11) {
        this.f8898b = c6Var;
        this.f8899c = tLObject;
        this.d = j3;
        this.f8900e = j10;
        this.f8902n = z10Var;
        this.f8901f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f8897a) {
            case 0:
                c6 c6Var = this.f8898b;
                TLObject tLObject = this.f8899c;
                long j3 = this.d;
                long j10 = this.f8900e;
                long j11 = this.h;
                TLRPC.TL_error tL_error = this.f8901f;
                ((org.telegram.ui.ActionBar.t1) this.f8902n).c(400L);
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        c6Var.dismiss();
                        v8.y(c6Var.f29679a, false).P(j3);
                        if (j3 >= 0) {
                            TLRPC.UserFull b22 = np.s1(c6Var.f29679a).b2(j10);
                            if (b22 != null) {
                                int max = Math.max(0, b22.stargifts_count - 1);
                                b22.stargifts_count = max;
                                if (max <= 0) {
                                    b22.flags2 &= -257;
                                }
                            }
                            v8.y(c6Var.f29679a, false).O();
                            v8.y(c6Var.f29679a, false).S(true);
                            if (!(T instanceof mb)) {
                                mb mbVar = new mb();
                                mbVar.whenFullyVisible(new x2(mbVar, j11, 0));
                                T.presentFragment(mbVar);
                                return;
                            }
                            org.telegram.ui.Components.cc.a0(T).I(2131624227, hd.M0(2131750221, null), hd.H(',', "Gift2Converted", (int) j11)).k(true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", -j3);
                        bundle.putBoolean("start_from_monetization", true);
                        z41 z41Var = new z41(bundle);
                        e0.g(c6Var.f29679a).h(j3, true);
                        e0.g(c6Var.f29679a).l(j3);
                        z41Var.whenFullyVisible(new x2(z41Var, j11, 1));
                        T.presentFragment(z41Var);
                        return;
                    } else if (tL_error != null) {
                        c6Var.k().t(hd.a0(null, null, 2131743878, tL_error.text), null).k(false);
                        return;
                    } else {
                        c6Var.k().t(hd.M0(2131743879, null), null).k(false);
                        return;
                    }
                }
                return;
            default:
                c6 c6Var2 = this.f8898b;
                TLObject tLObject2 = this.f8899c;
                long j12 = this.d;
                long j13 = this.f8900e;
                z10 z10Var = (z10) this.f8902n;
                TLRPC.TL_error tL_error2 = this.f8901f;
                long j14 = this.h;
                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    np.s1(c6Var2.f29679a).Y3(tL_payments_paymentResult.updates.users, false);
                    np.s1(c6Var2.f29679a).S3(tL_payments_paymentResult.updates.chats, false);
                    v8.y(c6Var2.f29679a, false).S(false);
                    v8.y(c6Var2.f29679a, false).P(j12);
                    v8.y(c6Var2.f29679a, false).P(j13);
                    v8.y(c6Var2.f29679a, false).O();
                    z10Var.a(null);
                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j12 >= 0 && j13 >= 0) {
                            an ua2 = an.ua(j12);
                            ua2.whenFullyVisible(new y2(c6Var2, ua2, j12, 1));
                            T2.presentFragment(ua2);
                        } else {
                            org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(T2).I(2131624029, hd.M0(2131749897, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749898, c6Var2.z1(), org.telegram.messenger.m5.t(j12))));
                            I.f41653t = true;
                            I.j();
                        }
                    }
                    Utilities.d.c(new e3(c6Var2, tL_payments_paymentResult, 1));
                    return;
                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                    if (np.s1(c6Var2.f29679a).f25322k7) {
                        c6Var2.f8318g2.setLoading(false);
                        v8.c0(c6Var2.getContext(), c6Var2.J0);
                        return;
                    }
                    v8 y10 = v8.y(c6Var2.f29679a, false);
                    d3.e0 e0Var = new d3.e0(c6Var2, j14, j12, z10Var, 1);
                    y10.f9601e = false;
                    y10.q(e0Var, false, true);
                    y10.f9601e = true;
                    return;
                } else {
                    z10Var.a(tL_error2);
                    c6Var2.k().f0(tL_error2, false);
                    return;
                }
        }
    }

    public k2(c6 c6Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f8898b = c6Var;
        this.f8902n = t1Var;
        this.f8899c = tLObject;
        this.d = j3;
        this.f8900e = j10;
        this.h = j11;
        this.f8901f = tL_error;
    }
}
