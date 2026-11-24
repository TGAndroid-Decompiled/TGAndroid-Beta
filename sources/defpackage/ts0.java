package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ts0 implements RequestDelegate {
    public final byte a;
    public final ct0 b;
    public final long c;

    public ts0(ct0 ct0Var, long j, byte b) {
        this.a = b;
        this.b = ct0Var;
        this.c = j;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final ct0 ct0Var = this.b;
                final long j = this.c;
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        long j2 = j;
                        TLObject tLObject2 = tLObject;
                        ct0 ct0Var2 = ct0Var;
                        switch (b) {
                            case 0:
                                boolean z = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap hashMap = ct0Var2.e;
                                if (z) {
                                    hashMap.put(Long.valueOf(j2), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j2), null);
                                }
                                ct0Var2.d.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
                                kk7.f(ct0Var2.a).k(227, Long.valueOf(j2));
                                return;
                            default:
                                boolean z2 = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap hashMap2 = ct0Var2.c;
                                if (z2) {
                                    hashMap2.put(Long.valueOf(j2), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j2), null);
                                }
                                ct0Var2.b.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
                                kk7.f(ct0Var2.a).k(227, Long.valueOf(j2));
                                return;
                        }
                    }
                });
                return;
            default:
                final ct0 ct0Var2 = this.b;
                final long j2 = this.c;
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r5;
                        long j22 = j2;
                        TLObject tLObject2 = tLObject;
                        ct0 ct0Var22 = ct0Var2;
                        switch (b) {
                            case 0:
                                boolean z = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap hashMap = ct0Var22.e;
                                if (z) {
                                    hashMap.put(Long.valueOf(j22), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j22), null);
                                }
                                ct0Var22.d.put(Long.valueOf(j22), Long.valueOf(System.currentTimeMillis()));
                                kk7.f(ct0Var22.a).k(227, Long.valueOf(j22));
                                return;
                            default:
                                boolean z2 = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap hashMap2 = ct0Var22.c;
                                if (z2) {
                                    hashMap2.put(Long.valueOf(j22), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j22), null);
                                }
                                ct0Var22.b.put(Long.valueOf(j22), Long.valueOf(System.currentTimeMillis()));
                                kk7.f(ct0Var22.a).k(227, Long.valueOf(j22));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
