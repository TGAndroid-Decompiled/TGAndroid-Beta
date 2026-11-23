package o7;

import android.os.Build;
public abstract class e {
    public static final int f21769a;

    static {
        int i7;
        if (Build.VERSION.SDK_INT >= 31) {
            i7 = 33554432;
        } else {
            i7 = 0;
        }
        f21769a = i7;
    }
}
