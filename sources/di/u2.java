package di;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
public final class u2 implements Runnable {
    public final int f9845a = 1;
    public final f6 f9846b;
    public final TLObject f9847c;
    public final long d;
    public final long f9848e;
    public final TLRPC.TL_error f9849f;
    public final long h;
    public final Object f9850n;

    public u2(f6 f6Var, TLObject tLObject, long j3, long j10, y10 y10Var, TLRPC.TL_error tL_error, long j11) {
        this.f9846b = f6Var;
        this.f9847c = tLObject;
        this.d = j3;
        this.f9848e = j10;
        this.f9850n = y10Var;
        this.f9849f = tL_error;
        this.h = j11;
    }

    @Override
    public final void run() {
        switch (this.f9845a) {
            case 0:
                f6 f6Var = this.f9846b;
                TLObject tLObject = this.f9847c;
                long j3 = this.d;
                long j10 = this.f9848e;
                long j11 = this.h;
                TLRPC.TL_error tL_error = this.f9849f;
                ((org.telegram.ui.ActionBar.t1) this.f9850n).c(400L);
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        f6Var.dismiss();
                        y8.y(f6Var.f30139a, false).O(j3);
                        if (j3 >= 0) {
                            TLRPC.UserFull d2 = np.u1(f6Var.f30139a).d2(j10);
                            if (d2 != null) {
                                int max = Math.max(0, d2.stargifts_count - 1);
                                d2.stargifts_count = max;
                                if (max <= 0) {
                                    d2.flags2 &= -257;
                                }
                            }
                            y8.y(f6Var.f30139a, false).N();
                            y8.y(f6Var.f30139a, false).R(true);
                            if (!(T instanceof pb)) {
                                pb pbVar = new pb();
                                pbVar.whenFullyVisible(new bi.e4(pbVar, j11, 1));
                                T.presentFragment(pbVar);
                                return;
                            }
                            org.telegram.ui.Components.lc.b0(T).I(2131624227, hd.N0(2131750204, null), hd.H(',', "Gift2Converted", (int) j11)).k(true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", -j3);
                        bundle.putBoolean("start_from_monetization", true);
                        c51 c51Var = new c51(bundle);
                        e0.g(f6Var.f30139a).h(j3, true);
                        e0.g(f6Var.f30139a).l(j3);
                        c51Var.whenFullyVisible(new bi.e4(c51Var, j11, 2));
                        T.presentFragment(c51Var);
                        return;
                    } else if (tL_error != null) {
                        f6Var.k().t(org.telegram.ui.Components.lc.W(tL_error.text), null).k(false);
                        return;
                    } else {
                        f6Var.k().t(hd.N0(2131743636, null), null).k(false);
                        return;
                    }
                }
                return;
            default:
                f6 f6Var2 = this.f9846b;
                TLObject tLObject2 = this.f9847c;
                long j12 = this.d;
                long j13 = this.f9848e;
                y10 y10Var = (y10) this.f9850n;
                TLRPC.TL_error tL_error2 = this.f9849f;
                long j14 = this.h;
                if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    np.u1(f6Var2.f30139a).f4(tL_payments_paymentResult.updates.users, false);
                    np.u1(f6Var2.f30139a).Z3(tL_payments_paymentResult.updates.chats, false);
                    y8.y(f6Var2.f30139a, false).R(false);
                    y8.y(f6Var2.f30139a, false).O(j12);
                    y8.y(f6Var2.f30139a, false).O(j13);
                    y8.y(f6Var2.f30139a, false).N();
                    y10Var.a(null);
                    org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j12 >= 0 && j13 >= 0) {
                            bn ua2 = bn.ua(j12);
                            ua2.whenFullyVisible(new b3(f6Var2, ua2, j12, 1));
                            T2.presentFragment(ua2);
                        } else {
                            org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(T2).I(2131624029, hd.N0(2131749880, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749881, f6Var2.E1(), org.telegram.messenger.n5.t(j12))));
                            I.f35499t = true;
                            I.j();
                        }
                    }
                    Utilities.d.c(new i3(f6Var2, tL_payments_paymentResult, 1));
                    return;
                } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                    if (np.u1(f6Var2.f30139a).f25870m7) {
                        f6Var2.f8768g2.setLoading(false);
                        y8.c0(f6Var2.getContext(), f6Var2.J0);
                        return;
                    }
                    y8 y10 = y8.y(f6Var2.f30139a, false);
                    d3.e0 e0Var = new d3.e0(f6Var2, j14, j12, y10Var, 1);
                    y10.f10051e = false;
                    y10.q(e0Var, false, true);
                    y10.f10051e = true;
                    return;
                } else {
                    y10Var.a(tL_error2);
                    f6Var2.k().g0(tL_error2, false);
                    return;
                }
        }
    }

    public u2(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        this.f9846b = f6Var;
        this.f9850n = t1Var;
        this.f9847c = tLObject;
        this.d = j3;
        this.f9848e = j10;
        this.h = j11;
        this.f9849f = tL_error;
    }
}
