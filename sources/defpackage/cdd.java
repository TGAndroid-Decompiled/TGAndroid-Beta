package defpackage;

import android.os.SystemClock;
public abstract class cdd {
    public static final ocd a;

    static {
        ocd ocdVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            ocdVar = new ocd((byte) 0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            ocdVar = new ocd((byte) 1);
        }
        a = ocdVar;
    }
}
