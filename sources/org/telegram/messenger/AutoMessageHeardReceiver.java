package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.messenger.AutoMessageHeardReceiver;
public class AutoMessageHeardReceiver extends BroadcastReceiver {
    public static final int a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        a.v();
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final int intExtra2 = intent.getIntExtra("currentAccount", 0);
        if (longExtra != 0 && intExtra != 0 && y6c.q(intExtra2)) {
            final j5 a2 = j5.a(intExtra2);
            if (cf3.D(longExtra)) {
                if (na7.q1(a2.a).V1(Long.valueOf(longExtra)) == null) {
                    Utilities.e.c(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r6) {
                                case 0:
                                    int i = AutoMessageHeardReceiver.a;
                                    j5 j5Var = a2;
                                    ad7 Y = ad7.Y(j5Var.a);
                                    long j = longExtra;
                                    gl.d3(new a70(j5Var, Y.h0(j), intExtra2, j, intExtra, (byte) 0));
                                    return;
                                default:
                                    int i2 = AutoMessageHeardReceiver.a;
                                    j5 j5Var2 = a2;
                                    ad7 Y2 = ad7.Y(j5Var2.a);
                                    long j2 = longExtra;
                                    gl.d3(new a70(j5Var2, Y2.O(-j2), intExtra2, j2, intExtra, (byte) 1));
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else if (cf3.y(longExtra) && na7.q1(a2.a).K0(Long.valueOf(-longExtra)) == null) {
                Utilities.e.c(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                int i = AutoMessageHeardReceiver.a;
                                j5 j5Var = a2;
                                ad7 Y = ad7.Y(j5Var.a);
                                long j = longExtra;
                                gl.d3(new a70(j5Var, Y.h0(j), intExtra2, j, intExtra, (byte) 0));
                                return;
                            default:
                                int i2 = AutoMessageHeardReceiver.a;
                                j5 j5Var2 = a2;
                                ad7 Y2 = ad7.Y(j5Var2.a);
                                long j2 = longExtra;
                                gl.d3(new a70(j5Var2, Y2.O(-j2), intExtra2, j2, intExtra, (byte) 1));
                                return;
                        }
                    }
                });
                return;
            }
            na7.q1(intExtra2).k3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
            na7.q1(intExtra2).u3(longExtra, 0L);
        }
    }
}
