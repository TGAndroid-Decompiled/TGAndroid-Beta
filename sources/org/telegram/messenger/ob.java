package org.telegram.messenger;

import android.os.SystemClock;
public final class ob {
    public final int f26076a;
    public final ec f26077b;

    public ob(ec ecVar, int i7) {
        this.f26077b = ecVar;
        this.f26076a = i7;
    }

    public final void a(y8 y8Var, final String str, final long j3, final long j10, final boolean z10) {
        this.f26077b.f23722u.put(str, new long[]{j3, j10});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = y8Var.S;
        if (j11 != 0 && j11 >= elapsedRealtime - 100 && j3 != j10) {
            return;
        }
        y8Var.S = elapsedRealtime;
        final int i7 = this.f26076a;
        g0.g3(new Runnable() {
            @Override
            public final void run() {
                ks.f(i7).k(ks.W1, str, Long.valueOf(j3), Long.valueOf(j10), Boolean.valueOf(z10));
            }
        });
    }
}
