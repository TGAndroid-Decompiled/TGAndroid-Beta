package org.telegram.messenger;

import android.os.SystemClock;
public final class pb {
    public final int f26294a;
    public final fc f26295b;

    public pb(fc fcVar, int i7) {
        this.f26295b = fcVar;
        this.f26294a = i7;
    }

    public final void a(y8 y8Var, final String str, final long j3, final long j10, final boolean z10) {
        this.f26295b.f23903u.put(str, new long[]{j3, j10});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = y8Var.S;
        if (j11 != 0 && j11 >= elapsedRealtime - 100 && j3 != j10) {
            return;
        }
        y8Var.S = elapsedRealtime;
        final int i7 = this.f26294a;
        g0.g3(new Runnable() {
            @Override
            public final void run() {
                ls.f(i7).k(ls.W1, str, Long.valueOf(j3), Long.valueOf(j10), Boolean.valueOf(z10));
            }
        });
    }
}
