package ci;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r41;
import org.telegram.ui.wm;
public final class q2 implements Runnable {
    public final int f5801a = 1;
    public final l6 f5802b;
    public final TLObject f5803c;
    public final long d;
    public final long f5804e;
    public final TLRPC.TL_error f5805f;
    public final long h;
    public final Object f5806n;

    public q2(l6 l6Var, TLObject tLObject, long j10, long j11, u10 u10Var, TLRPC.TL_error tL_error, long j12) {
        this.f5802b = l6Var;
        this.f5803c = tLObject;
        this.d = j10;
        this.f5804e = j11;
        this.f5806n = u10Var;
        this.f5805f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f5801a) {
            case 0:
                l6 l6Var = this.f5802b;
                TLObject tLObject = this.f5803c;
                long j10 = this.d;
                long j11 = this.f5804e;
                long j12 = this.h;
                TLRPC.TL_error tL_error = this.f5805f;
                ((org.telegram.ui.ActionBar.s1) this.f5806n).c(400L);
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        l6Var.dismiss();
                        e9.y(l6Var.f28583a, false).P(j10);
                        if (j10 >= 0) {
                            TLRPC.UserFull b22 = hp.s1(l6Var.f28583a).b2(j11);
                            if (b22 != null) {
                                int max = Math.max(0, b22.stargifts_count - 1);
                                b22.stargifts_count = max;
                                if (max <= 0) {
                                    b22.flags2 &= -257;
                                }
                            }
                            e9.y(l6Var.f28583a, false).O();
                            e9.y(l6Var.f28583a, false).S(true);
                            if (!(T instanceof wb)) {
                                wb wbVar = new wb();
                                wbVar.whenFullyVisible(new e3(wbVar, j12, 0));
                                T.presentFragment(wbVar);
                                return;
                            }
                            org.telegram.ui.Components.fc.a0(T).I(2131624226, bd.M0(2131750229, null), bd.H(',', "Gift2Converted", (int) j12)).k(true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", -j10);
                        bundle.putBoolean("start_from_monetization", true);
                        r41 r41Var = new r41(bundle);
                        i0.g(l6Var.f28583a).h(j10, true);
                        i0.g(l6Var.f28583a).l(j10);
                        r41Var.whenFullyVisible(new e3(r41Var, j12, 1));
                        T.presentFragment(r41Var);
                        return;
                    } else if (tL_error != null) {
                        l6Var.k().t(bd.a0(null, null, 2131743888, tL_error.text), null).k(false);
                        return;
                    } else {
                        l6Var.k().t(bd.M0(2131743889, null), null).k(false);
                        return;
                    }
                }
                return;
            default:
                l6 l6Var2 = this.f5802b;
                TLObject tLObject2 = this.f5803c;
                long j13 = this.d;
                long j14 = this.f5804e;
                u10 u10Var = (u10) this.f5806n;
                TLRPC.TL_error tL_error2 = this.f5805f;
                long j15 = this.h;
                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    hp.s1(l6Var2.f28583a).Y3(tL_payments_paymentResult.updates.users, false);
                    hp.s1(l6Var2.f28583a).S3(tL_payments_paymentResult.updates.chats, false);
                    e9.y(l6Var2.f28583a, false).S(false);
                    e9.y(l6Var2.f28583a, false).P(j13);
                    e9.y(l6Var2.f28583a, false).P(j14);
                    e9.y(l6Var2.f28583a, false).O();
                    u10Var.a(null);
                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j13 >= 0 && j14 >= 0) {
                            wm ra2 = wm.ra(j13);
                            ra2.whenFullyVisible(new f3(l6Var2, ra2, j13, 1));
                            T2.presentFragment(ra2);
                        } else {
                            org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(T2).I(2131624028, bd.M0(2131749905, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749906, l6Var2.z1(), org.telegram.messenger.m5.t(j13))));
                            I.f31802t = true;
                            I.j();
                        }
                    }
                    Utilities.d.c(new n3(l6Var2, tL_payments_paymentResult, 1));
                    return;
                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                    if (hp.s1(l6Var2.f28583a).f23042j7) {
                        l6Var2.f5451d2.setLoading(false);
                        e9.c0(l6Var2.getContext(), l6Var2.J0);
                        return;
                    }
                    e9 y9 = e9.y(l6Var2.f28583a, false);
                    c3.f0 f0Var = new c3.f0(l6Var2, j15, j13, u10Var, 1);
                    y9.f5032e = false;
                    y9.q(f0Var, false, true);
                    y9.f5032e = true;
                    return;
                } else {
                    u10Var.a(tL_error2);
                    l6Var2.k().f0(tL_error2, false);
                    return;
                }
        }
    }

    public q2(l6 l6Var, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f5802b = l6Var;
        this.f5806n = s1Var;
        this.f5803c = tLObject;
        this.d = j10;
        this.f5804e = j11;
        this.h = j12;
        this.f5805f = tL_error;
    }
}
