package defpackage;

import android.os.SystemClock;
public final class pm5 {
    public final int a;
    public final fn5 b;

    public pm5(fn5 fn5Var, int i) {
        this.b = fn5Var;
        this.a = i;
    }

    public final void a(qd4 qd4Var, final String str, final long j, final long j2, final boolean z) {
        this.b.u.put(str, new long[]{j, j2});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = qd4Var.S;
        if (j3 != 0 && j3 >= elapsedRealtime - 100 && j != j2) {
            return;
        }
        qd4Var.S = elapsedRealtime;
        final int i = this.a;
        gm.c3(new Runnable() {
            @Override
            public final void run() {
                nm7.f(i).k(nm7.W1, str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z));
            }
        });
    }
}
