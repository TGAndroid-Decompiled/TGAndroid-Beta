package org.telegram.messenger;

import android.os.SystemClock;
public final class jb {
    public final int f23658a;
    public final zb f23659b;

    public jb(zb zbVar, int i3) {
        this.f23659b = zbVar;
        this.f23658a = i3;
    }

    public final void a(y8 y8Var, final String str, final long j10, final long j11, final boolean z10) {
        this.f23659b.f26775u.put(str, new long[]{j10, j11});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = y8Var.S;
        if (j12 != 0 && j12 >= elapsedRealtime - 100 && j10 != j11) {
            return;
        }
        y8Var.S = elapsedRealtime;
        final int i3 = this.f23658a;
        g0.h3(new Runnable() {
            @Override
            public final void run() {
                hs.f(i3).k(hs.W1, str, Long.valueOf(j10), Long.valueOf(j11), Boolean.valueOf(z10));
            }
        });
    }
}
