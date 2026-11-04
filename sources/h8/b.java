package h8;

import android.os.Build;
public abstract class b {
    public static final int f14353a;

    static {
        int i3;
        if (Build.VERSION.SDK_INT >= 31) {
            i3 = 33554432;
        } else {
            i3 = 0;
        }
        f14353a = i3;
    }
}
