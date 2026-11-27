package defpackage;

import android.os.SystemClock;
public final class sm5 {
    public final int a;
    public final in5 b;

    public sm5(in5 in5Var, int i) {
        this.b = in5Var;
        this.a = i;
    }

    public final void a(nd4 nd4Var, final String str, final long j, final long j2, final boolean z) {
        this.b.u.put(str, new long[]{j, j2});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = nd4Var.S;
        if (j3 != 0 && j3 >= elapsedRealtime - 100 && j != j2) {
            return;
        }
        nd4Var.S = elapsedRealtime;
        final int i = this.a;
        hl.c3(new Runnable() {
            @Override
            public final void run() {
                jn7.f(i).k(jn7.W1, str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z));
            }
        });
    }
}
