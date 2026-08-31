package kf;

import android.os.Build;
import z9.d;
public final class b {
    public static final a f11183a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f11183a = new d(10);
        } else {
            f11183a = new ab.a(11);
        }
    }
}
