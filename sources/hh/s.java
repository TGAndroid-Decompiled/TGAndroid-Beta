package hh;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class s implements RequestDelegate {

    public final int f10010a;

    public final c0 f10011b;

    public final long f10012c;

    public s(c0 c0Var, long j10, int i10) {
        this.f10010a = i10;
        this.f10011b = c0Var;
        this.f10012c = j10;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10010a) {
            case 0:
                final int i10 = 1;
                final c0 c0Var = this.f10011b;
                final long j10 = this.f10012c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i11 = i10;
                        long j11 = j10;
                        TLObject tLObject2 = tLObject;
                        c0 c0Var2 = c0Var;
                        switch (i11) {
                            case 0:
                                HashMap map = c0Var2.f9052e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    map.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    map.put(Long.valueOf(j11), null);
                                }
                                c0Var2.d.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(c0Var2.f9049a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                break;
                            default:
                                HashMap map2 = c0Var2.f9051c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    map2.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    map2.put(Long.valueOf(j11), null);
                                }
                                c0Var2.f9050b.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(c0Var2.f9049a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j11));
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final c0 c0Var2 = this.f10011b;
                final long j11 = this.f10012c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i12 = i11;
                        long j12 = j11;
                        TLObject tLObject2 = tLObject;
                        c0 c0Var3 = c0Var2;
                        switch (i12) {
                            case 0:
                                HashMap map = c0Var3.f9052e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    map.put(Long.valueOf(j12), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    map.put(Long.valueOf(j12), null);
                                }
                                c0Var3.d.put(Long.valueOf(j12), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(c0Var3.f9049a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j12));
                                break;
                            default:
                                HashMap map2 = c0Var3.f9051c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    map2.put(Long.valueOf(j12), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    map2.put(Long.valueOf(j12), null);
                                }
                                c0Var3.f9050b.put(Long.valueOf(j12), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(c0Var3.f9049a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j12));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
