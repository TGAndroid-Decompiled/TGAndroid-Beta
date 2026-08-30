package kf;

import android.os.Build;
import z9.d;
public final class b {
    public static final a f10407a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f10407a = new d(10);
        } else {
            f10407a = new ab.a(11);
        }
    }
}
