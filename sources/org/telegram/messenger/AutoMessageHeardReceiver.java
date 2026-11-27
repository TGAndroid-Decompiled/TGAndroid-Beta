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
        if (longExtra != 0 && intExtra != 0 && yac.q(intExtra2)) {
            final k5 a2 = k5.a(intExtra2);
            if (wf3.D(longExtra)) {
                if (uc7.s1(a2.a).X1(Long.valueOf(longExtra)) == null) {
                    Utilities.e.c(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r6) {
                                case 0:
                                    int i = AutoMessageHeardReceiver.a;
                                    k5 k5Var = a2;
                                    kf7 a0 = kf7.a0(k5Var.a);
                                    long j = longExtra;
                                    hl.c3(new c70(k5Var, a0.j0(j), intExtra2, j, intExtra, (byte) 0));
                                    return;
                                default:
                                    int i2 = AutoMessageHeardReceiver.a;
                                    k5 k5Var2 = a2;
                                    kf7 a02 = kf7.a0(k5Var2.a);
                                    long j2 = longExtra;
                                    hl.c3(new c70(k5Var2, a02.Q(-j2), intExtra2, j2, intExtra, (byte) 1));
                                    return;
                            }
                        }
                    });
                    return;
                }
            } else if (wf3.y(longExtra) && uc7.s1(a2.a).M0(Long.valueOf(-longExtra)) == null) {
                Utilities.e.c(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                int i = AutoMessageHeardReceiver.a;
                                k5 k5Var = a2;
                                kf7 a0 = kf7.a0(k5Var.a);
                                long j = longExtra;
                                hl.c3(new c70(k5Var, a0.j0(j), intExtra2, j, intExtra, (byte) 0));
                                return;
                            default:
                                int i2 = AutoMessageHeardReceiver.a;
                                k5 k5Var2 = a2;
                                kf7 a02 = kf7.a0(k5Var2.a);
                                long j2 = longExtra;
                                hl.c3(new c70(k5Var2, a02.Q(-j2), intExtra2, j2, intExtra, (byte) 1));
                                return;
                        }
                    }
                });
                return;
            }
            uc7.s1(intExtra2).r3(longExtra, intExtra, intExtra, 0, false, 0L, 0, true, 0);
            uc7.s1(intExtra2).B3(longExtra, 0L);
        }
    }
}
