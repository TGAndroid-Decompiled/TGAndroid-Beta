package org.telegram.messenger;

import android.os.SystemClock;
public final class sb {
    public final int f18076a;
    public final ic f18077b;

    public sb(ic icVar, int i10) {
        this.f18077b = icVar;
        this.f18076a = i10;
    }

    public final void a(d9 d9Var, final String str, final long j10, final long j11, final boolean z10) {
        this.f18077b.f16263u.put(str, new long[]{j10, j11});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = d9Var.S;
        if (j12 != 0 && j12 >= elapsedRealtime - 100 && j10 != j11) {
            return;
        }
        d9Var.S = elapsedRealtime;
        final int i10 = this.f18076a;
        i0.g3(new Runnable() {
            @Override
            public final void run() {
                at.f(i10).k(at.W1, str, Long.valueOf(j10), Long.valueOf(j11), Boolean.valueOf(z10));
            }
        });
    }
}
