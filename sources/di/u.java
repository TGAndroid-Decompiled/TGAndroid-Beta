package di;

import java.util.HashMap;
import org.telegram.messenger.ks;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u implements RequestDelegate {
    public final int f9825a;
    public final e0 f9826b;
    public final long f9827c;

    public u(e0 e0Var, long j3, int i7) {
        this.f9825a = i7;
        this.f9826b = e0Var;
        this.f9827c = j3;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9825a) {
            case 0:
                final e0 e0Var = this.f9826b;
                final long j3 = this.f9827c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        long j10 = j3;
                        TLObject tLObject2 = tLObject;
                        e0 e0Var2 = e0Var;
                        switch (i7) {
                            case 0:
                                HashMap hashMap = e0Var2.f8683e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j10), null);
                                }
                                e0Var2.d.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                ks.f(e0Var2.f8680a).k(227, Long.valueOf(j10));
                                return;
                            default:
                                HashMap hashMap2 = e0Var2.f8682c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j10), null);
                                }
                                e0Var2.f8681b.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                ks.f(e0Var2.f8680a).k(227, Long.valueOf(j10));
                                return;
                        }
                    }
                });
                return;
            default:
                final e0 e0Var2 = this.f9826b;
                final long j10 = this.f9827c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        long j102 = j10;
                        TLObject tLObject2 = tLObject;
                        e0 e0Var22 = e0Var2;
                        switch (i7) {
                            case 0:
                                HashMap hashMap = e0Var22.f8683e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j102), null);
                                }
                                e0Var22.d.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                ks.f(e0Var22.f8680a).k(227, Long.valueOf(j102));
                                return;
                            default:
                                HashMap hashMap2 = e0Var22.f8682c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j102), null);
                                }
                                e0Var22.f8681b.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                ks.f(e0Var22.f8680a).k(227, Long.valueOf(j102));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
