package defpackage;

import android.os.SystemClock;
public final class ea4 implements eo4 {
    @Override
    public final void a() {
        ia4.b = SystemClock.elapsedRealtime();
    }

    @Override
    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = ia4.b;
        if (j != 0 && elapsedRealtime - j > 300000) {
            qa4 qa4Var = ia4.a;
        }
        ia4.b = 0L;
    }
}
