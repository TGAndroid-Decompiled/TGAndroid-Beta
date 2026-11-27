package defpackage;

import android.os.SystemClock;
public final class aa4 implements io4 {
    @Override
    public final void a() {
        ea4.b = SystemClock.elapsedRealtime();
    }

    @Override
    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = ea4.b;
        if (j != 0 && elapsedRealtime - j > 300000) {
            ea4.c = elapsedRealtime;
        }
        ea4.b = 0L;
    }
}
