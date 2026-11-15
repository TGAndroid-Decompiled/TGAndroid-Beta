package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static final int f22246a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        t0.w();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra != 0 && intExtra != 0 && m10.r(intExtra2)) {
            final c a10 = c.a(intExtra2);
            if (m5.E(longExtra)) {
                if (np.s1(a10.f22778a).a2(Long.valueOf(longExtra)) == null) {
                    Utilities.f22416e.c(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r6) {
                                case 0:
                                    int i7 = AutoMessageHeardReceiver.f22246a;
                                    c cVar = a10;
                                    vr a02 = vr.a0(cVar.f22778a);
                                    long j3 = longExtra;
                                    g0.h3(new b1(cVar, a02.k0(j3), intExtra2, j3, intExtra, 0));
                                    return;
                                default:
                                    int i10 = AutoMessageHeardReceiver.f22246a;
                                    c cVar2 = a10;
                                    vr a03 = vr.a0(cVar2.f22778a);
                                    long j10 = longExtra;
                                    g0.h3(new b1(cVar2, a03.P(-j10), intExtra2, j10, intExtra, 1));
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else if (m5.z(longExtra) && np.s1(a10.f22778a).M0(Long.valueOf(-longExtra)) == null) {
                Utilities.f22416e.c(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                int i7 = AutoMessageHeardReceiver.f22246a;
                                c cVar = a10;
                                vr a02 = vr.a0(cVar.f22778a);
                                long j3 = longExtra;
                                g0.h3(new b1(cVar, a02.k0(j3), intExtra2, j3, intExtra, 0));
                                return;
                            default:
                                int i10 = AutoMessageHeardReceiver.f22246a;
                                c cVar2 = a10;
                                vr a03 = vr.a0(cVar2.f22778a);
                                long j10 = longExtra;
                                g0.h3(new b1(cVar2, a03.P(-j10), intExtra2, j10, intExtra, 1));
                                return;
                        }
                    }
                });
                return;
            }
            np.s1(intExtra2).j3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
            np.s1(intExtra2).t3(longExtra, 0L);
        }
    }
}
