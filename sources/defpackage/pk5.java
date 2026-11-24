package defpackage;

import android.os.SystemClock;
public final class pk5 {
    public final int a;
    public final fl5 b;

    public pk5(fl5 fl5Var, int i) {
        this.b = fl5Var;
        this.a = i;
    }

    public final void a(qb4 qb4Var, final String str, final long j, final long j2, final boolean z) {
        this.b.u.put(str, new long[]{j, j2});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = qb4Var.S;
        if (j3 != 0 && j3 >= elapsedRealtime - 100 && j != j2) {
            return;
        }
        qb4Var.S = elapsedRealtime;
        final int i = this.a;
        gl.d3(new Runnable() {
            @Override
            public final void run() {
                kk7.f(i).k(kk7.V1, str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z));
            }
        });
    }
}
