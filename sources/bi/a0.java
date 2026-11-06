package bi;

import java.util.HashMap;
import org.telegram.messenger.qs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements RequestDelegate {
    public final int f3417a;
    public final n0 f3418b;
    public final long f3419c;

    public a0(n0 n0Var, long j3, int i7) {
        this.f3417a = i7;
        this.f3418b = n0Var;
        this.f3419c = j3;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3417a) {
            case 0:
                final n0 n0Var = this.f3418b;
                final long j3 = this.f3419c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        long j10 = j3;
                        TLObject tLObject2 = tLObject;
                        n0 n0Var2 = n0Var;
                        switch (i7) {
                            case 0:
                                HashMap hashMap = n0Var2.f4387e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j10), null);
                                }
                                n0Var2.d.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                qs.f(n0Var2.f4384a).k(225, Long.valueOf(j10));
                                return;
                            default:
                                HashMap hashMap2 = n0Var2.f4386c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j10), null);
                                }
                                n0Var2.f4385b.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                qs.f(n0Var2.f4384a).k(225, Long.valueOf(j10));
                                return;
                        }
                    }
                });
                return;
            default:
                final n0 n0Var2 = this.f3418b;
                final long j10 = this.f3419c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        long j102 = j10;
                        TLObject tLObject2 = tLObject;
                        n0 n0Var22 = n0Var2;
                        switch (i7) {
                            case 0:
                                HashMap hashMap = n0Var22.f4387e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j102), null);
                                }
                                n0Var22.d.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                qs.f(n0Var22.f4384a).k(225, Long.valueOf(j102));
                                return;
                            default:
                                HashMap hashMap2 = n0Var22.f4386c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j102), null);
                                }
                                n0Var22.f4385b.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                qs.f(n0Var22.f4384a).k(225, Long.valueOf(j102));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
