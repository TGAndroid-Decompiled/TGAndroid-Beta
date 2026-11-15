package org.telegram.messenger;

import android.os.SystemClock;
public final class pb {
    public final int f25918a;
    public final fc f25919b;

    public pb(fc fcVar, int i7) {
        this.f25919b = fcVar;
        this.f25918a = i7;
    }

    public final void a(y8 y8Var, final String str, final long j3, final long j10, final boolean z10) {
        this.f25919b.f23478u.put(str, new long[]{j3, j10});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = y8Var.S;
        if (j11 != 0 && j11 >= elapsedRealtime - 100 && j3 != j10) {
            return;
        }
        y8Var.S = elapsedRealtime;
        final int i7 = this.f25918a;
        g0.h3(new Runnable() {
            @Override
            public final void run() {
                ns.f(i7).k(ns.W1, str, Long.valueOf(j3), Long.valueOf(j10), Boolean.valueOf(z10));
            }
        });
    }
}
