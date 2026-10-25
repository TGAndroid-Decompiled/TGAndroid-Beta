package bi;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f5813a;
    public final m0 f5814b;
    public final long f5815c;

    public z(m0 m0Var, long j10, int i10) {
        this.f5813a = i10;
        this.f5814b = m0Var;
        this.f5815c = j10;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5813a) {
            case 0:
                final m0 m0Var = this.f5814b;
                final long j10 = this.f5815c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j11 = j10;
                        TLObject tLObject2 = tLObject;
                        m0 m0Var2 = m0Var;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = m0Var2.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j11), null);
                                }
                                m0Var2.d.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(m0Var2.f5062a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                return;
                            default:
                                HashMap hashMap2 = m0Var2.f5064c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j11), null);
                                }
                                m0Var2.f5063b.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(m0Var2.f5062a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                return;
                        }
                    }
                });
                return;
            default:
                final m0 m0Var2 = this.f5814b;
                final long j11 = this.f5815c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r5;
                        long j112 = j11;
                        TLObject tLObject2 = tLObject;
                        m0 m0Var22 = m0Var2;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = m0Var22.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j112), null);
                                }
                                m0Var22.d.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(m0Var22.f5062a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j112));
                                return;
                            default:
                                HashMap hashMap2 = m0Var22.f5064c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j112), null);
                                }
                                m0Var22.f5063b.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(m0Var22.f5062a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j112));
                                return;
                        }
                    }
                });
                return;
        }
    }
}
