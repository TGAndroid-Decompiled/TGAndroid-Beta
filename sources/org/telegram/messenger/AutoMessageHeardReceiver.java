package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static final int f14357a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        w0.w();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra != 0 && intExtra != 0 && e20.r(intExtra2)) {
            final c a2 = c.a(intExtra2);
            if (o5.E(longExtra)) {
                if (wp.r1(a2.f15043a).Z1(Long.valueOf(longExtra)) == null) {
                    Utilities.e.c(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r6) {
                                case 0:
                                    int i10 = AutoMessageHeardReceiver.f14357a;
                                    c cVar = a2;
                                    is a02 = is.a0(cVar.f15043a);
                                    long j10 = longExtra;
                                    i0.g3(new e1(cVar, a02.k0(j10), intExtra2, j10, intExtra, 0));
                                    return;
                                default:
                                    int i11 = AutoMessageHeardReceiver.f14357a;
                                    c cVar2 = a2;
                                    is a03 = is.a0(cVar2.f15043a);
                                    long j11 = longExtra;
                                    i0.g3(new e1(cVar2, a03.P(-j11), intExtra2, j11, intExtra, 1));
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else if (o5.z(longExtra) && wp.r1(a2.f15043a).L0(Long.valueOf(-longExtra)) == null) {
                Utilities.e.c(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                int i10 = AutoMessageHeardReceiver.f14357a;
                                c cVar = a2;
                                is a02 = is.a0(cVar.f15043a);
                                long j10 = longExtra;
                                i0.g3(new e1(cVar, a02.k0(j10), intExtra2, j10, intExtra, 0));
                                return;
                            default:
                                int i11 = AutoMessageHeardReceiver.f14357a;
                                c cVar2 = a2;
                                is a03 = is.a0(cVar2.f15043a);
                                long j11 = longExtra;
                                i0.g3(new e1(cVar2, a03.P(-j11), intExtra2, j11, intExtra, 1));
                                return;
                        }
                    }
                });
                return;
            }
            wp.r1(intExtra2).h3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
            wp.r1(intExtra2).q3(longExtra, 0L);
        }
    }
}
