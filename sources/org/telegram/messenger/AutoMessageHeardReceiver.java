package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static final int f22604a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        t0.w();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra != 0 && intExtra != 0 && k10.r(intExtra2)) {
            final c a10 = c.a(intExtra2);
            if (n5.E(longExtra)) {
                if (np.u1(a10.f23166a).c2(Long.valueOf(longExtra)) == null) {
                    Utilities.f22774e.c(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r6) {
                                case 0:
                                    int i7 = AutoMessageHeardReceiver.f22604a;
                                    c cVar = a10;
                                    ur a02 = ur.a0(cVar.f23166a);
                                    long j3 = longExtra;
                                    g0.g3(new b1(cVar, a02.k0(j3), intExtra2, j3, intExtra, 0));
                                    return;
                                default:
                                    int i10 = AutoMessageHeardReceiver.f22604a;
                                    c cVar2 = a10;
                                    ur a03 = ur.a0(cVar2.f23166a);
                                    long j10 = longExtra;
                                    g0.g3(new b1(cVar2, a03.P(-j10), intExtra2, j10, intExtra, 1));
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else if (n5.z(longExtra) && np.u1(a10.f23166a).O0(Long.valueOf(-longExtra)) == null) {
                Utilities.f22774e.c(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                int i7 = AutoMessageHeardReceiver.f22604a;
                                c cVar = a10;
                                ur a02 = ur.a0(cVar.f23166a);
                                long j3 = longExtra;
                                g0.g3(new b1(cVar, a02.k0(j3), intExtra2, j3, intExtra, 0));
                                return;
                            default:
                                int i10 = AutoMessageHeardReceiver.f22604a;
                                c cVar2 = a10;
                                ur a03 = ur.a0(cVar2.f23166a);
                                long j10 = longExtra;
                                g0.g3(new b1(cVar2, a03.P(-j10), intExtra2, j10, intExtra, 1));
                                return;
                        }
                    }
                });
                return;
            }
            np.u1(intExtra2).q3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
            np.u1(intExtra2).A3(longExtra, 0L);
        }
    }
}
