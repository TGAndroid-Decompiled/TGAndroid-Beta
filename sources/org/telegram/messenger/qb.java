package org.telegram.messenger;

import android.os.SystemClock;
public final class qb {
    public final int f24683a;
    public final gc f24684b;

    public qb(gc gcVar, int i7) {
        this.f24684b = gcVar;
        this.f24683a = i7;
    }

    public final void a(y8 y8Var, final String str, final long j3, final long j10, final boolean z9) {
        this.f24684b.f22634u.put(str, new long[]{j3, j10});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = y8Var.S;
        if (j11 != 0 && j11 >= elapsedRealtime - 100 && j3 != j10) {
            return;
        }
        y8Var.S = elapsedRealtime;
        final int i7 = this.f24683a;
        g0.h3(new Runnable() {
            @Override
            public final void run() {
                qs.f(i7).k(qs.W1, str, Long.valueOf(j3), Long.valueOf(j10), Boolean.valueOf(z9));
            }
        });
    }
}
