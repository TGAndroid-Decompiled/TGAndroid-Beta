package ci;

import java.util.HashMap;
import org.telegram.messenger.hs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w implements RequestDelegate {
    public final int f6222a;
    public final i0 f6223b;
    public final long f6224c;

    public w(i0 i0Var, long j10, int i3) {
        this.f6222a = i3;
        this.f6223b = i0Var;
        this.f6224c = j10;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6222a) {
            case 0:
                final i0 i0Var = this.f6223b;
                final long j10 = this.f6224c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r5;
                        long j11 = j10;
                        TLObject tLObject2 = tLObject;
                        i0 i0Var2 = i0Var;
                        switch (i3) {
                            case 0:
                                HashMap hashMap = i0Var2.f5271e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j11), null);
                                }
                                i0Var2.d.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                hs.f(i0Var2.f5268a).k(225, Long.valueOf(j11));
                                return;
                            default:
                                HashMap hashMap2 = i0Var2.f5270c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j11), null);
                                }
                                i0Var2.f5269b.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                hs.f(i0Var2.f5268a).k(225, Long.valueOf(j11));
                                return;
                        }
                    }
                });
                return;
            default:
                final i0 i0Var2 = this.f6223b;
                final long j11 = this.f6224c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r5;
                        long j112 = j11;
                        TLObject tLObject2 = tLObject;
                        i0 i0Var22 = i0Var2;
                        switch (i3) {
                            case 0:
                                HashMap hashMap = i0Var22.f5271e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j112), null);
                                }
                                i0Var22.d.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                hs.f(i0Var22.f5268a).k(225, Long.valueOf(j112));
                                return;
                            default:
                                HashMap hashMap2 = i0Var22.f5270c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j112), null);
                                }
                                i0Var22.f5269b.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                hs.f(i0Var22.f5268a).k(225, Long.valueOf(j112));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
