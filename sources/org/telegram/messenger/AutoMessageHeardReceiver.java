package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static final int f21172a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        t0.w();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra != 0 && intExtra != 0 && p10.r(intExtra2)) {
            final c a10 = c.a(intExtra2);
            if (m5.E(longExtra)) {
                if (qp.s1(a10.f21770a).a2(Long.valueOf(longExtra)) == null) {
                    Utilities.f21341e.c(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r6) {
                                case 0:
                                    int i7 = AutoMessageHeardReceiver.f21172a;
                                    c cVar = a10;
                                    yr a02 = yr.a0(cVar.f21770a);
                                    long j3 = longExtra;
                                    g0.h3(new b1(cVar, a02.k0(j3), intExtra2, j3, intExtra, 0));
                                    return;
                                default:
                                    int i10 = AutoMessageHeardReceiver.f21172a;
                                    c cVar2 = a10;
                                    yr a03 = yr.a0(cVar2.f21770a);
                                    long j10 = longExtra;
                                    g0.h3(new b1(cVar2, a03.P(-j10), intExtra2, j10, intExtra, 1));
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else if (m5.z(longExtra) && qp.s1(a10.f21770a).M0(Long.valueOf(-longExtra)) == null) {
                Utilities.f21341e.c(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                int i7 = AutoMessageHeardReceiver.f21172a;
                                c cVar = a10;
                                yr a02 = yr.a0(cVar.f21770a);
                                long j3 = longExtra;
                                g0.h3(new b1(cVar, a02.k0(j3), intExtra2, j3, intExtra, 0));
                                return;
                            default:
                                int i10 = AutoMessageHeardReceiver.f21172a;
                                c cVar2 = a10;
                                yr a03 = yr.a0(cVar2.f21770a);
                                long j10 = longExtra;
                                g0.h3(new b1(cVar2, a03.P(-j10), intExtra2, j10, intExtra, 1));
                                return;
                        }
                    }
                });
                return;
            }
            qp.s1(intExtra2).j3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
            qp.s1(intExtra2).t3(longExtra, 0L);
        }
    }
}
