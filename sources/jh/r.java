package jh;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r implements RequestDelegate {
    public final int f12684a;
    public final b0 f12685b;
    public final long f12686c;

    public r(b0 b0Var, long j10, int i10) {
        this.f12684a = i10;
        this.f12685b = b0Var;
        this.f12686c = j10;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12684a) {
            case 0:
                final b0 b0Var = this.f12685b;
                final long j10 = this.f12686c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j11 = j10;
                        TLObject tLObject2 = tLObject;
                        b0 b0Var2 = b0Var;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = b0Var2.f11777e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j11), null);
                                }
                                b0Var2.d.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(b0Var2.f11774a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                return;
                            default:
                                HashMap hashMap2 = b0Var2.f11776c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j11), null);
                                }
                                b0Var2.f11775b.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(b0Var2.f11774a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                return;
                        }
                    }
                });
                return;
            default:
                final b0 b0Var2 = this.f12685b;
                final long j11 = this.f12686c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j112 = j11;
                        TLObject tLObject2 = tLObject;
                        b0 b0Var22 = b0Var2;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = b0Var22.f11777e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j112), null);
                                }
                                b0Var22.d.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(b0Var22.f11774a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j112));
                                return;
                            default:
                                HashMap hashMap2 = b0Var22.f11776c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j112), null);
                                }
                                b0Var22.f11775b.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(b0Var22.f11774a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j112));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
