package l7;

import android.os.Build;
public abstract class d {
    public static final int f16950a;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f16950a = i10;
    }
}
