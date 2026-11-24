package defpackage;

import android.os.SystemClock;
public abstract class abd {
    public static final mad a;

    static {
        mad madVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            madVar = new mad((byte) 0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            madVar = new mad((byte) 1);
        }
        a = madVar;
    }
}
