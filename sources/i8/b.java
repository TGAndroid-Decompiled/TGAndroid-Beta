package i8;

import android.os.Build;
public abstract class b {
    public static final int f16169a;

    static {
        int i7;
        if (Build.VERSION.SDK_INT >= 31) {
            i7 = 33554432;
        } else {
            i7 = 0;
        }
        f16169a = i7;
    }
}
