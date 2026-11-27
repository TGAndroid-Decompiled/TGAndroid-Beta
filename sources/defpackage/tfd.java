package defpackage;

import android.os.SystemClock;
public abstract class tfd {
    public static final ffd a;

    static {
        ffd ffdVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            ffdVar = new ffd((byte) 0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            ffdVar = new ffd((byte) 1);
        }
        a = ffdVar;
    }
}
