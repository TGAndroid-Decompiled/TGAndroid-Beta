package di;

import java.util.HashMap;
import org.telegram.messenger.ks;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u implements RequestDelegate {
    public final int f9861a;
    public final e0 f9862b;
    public final long f9863c;

    public u(e0 e0Var, long j3, int i7) {
        this.f9861a = i7;
        this.f9862b = e0Var;
        this.f9863c = j3;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9861a) {
            case 0:
                final e0 e0Var = this.f9862b;
                final long j3 = this.f9863c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        long j10 = j3;
                        TLObject tLObject2 = tLObject;
                        e0 e0Var2 = e0Var;
                        switch (i7) {
                            case 0:
                                HashMap hashMap = e0Var2.f8719e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j10), null);
                                }
                                e0Var2.d.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                ks.f(e0Var2.f8716a).k(227, Long.valueOf(j10));
                                return;
                            default:
                                HashMap hashMap2 = e0Var2.f8718c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j10), null);
                                }
                                e0Var2.f8717b.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                ks.f(e0Var2.f8716a).k(227, Long.valueOf(j10));
                                return;
                        }
                    }
                });
                return;
            default:
                final e0 e0Var2 = this.f9862b;
                final long j10 = this.f9863c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        long j102 = j10;
                        TLObject tLObject2 = tLObject;
                        e0 e0Var22 = e0Var2;
                        switch (i7) {
                            case 0:
                                HashMap hashMap = e0Var22.f8719e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j102), null);
                                }
                                e0Var22.d.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                ks.f(e0Var22.f8716a).k(227, Long.valueOf(j102));
                                return;
                            default:
                                HashMap hashMap2 = e0Var22.f8718c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j102), null);
                                }
                                e0Var22.f8717b.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                ks.f(e0Var22.f8716a).k(227, Long.valueOf(j102));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
