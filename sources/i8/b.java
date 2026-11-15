package i8;

import android.os.Build;
public abstract class b {
    public static final int f15854a;

    static {
        int i7;
        if (Build.VERSION.SDK_INT >= 31) {
            i7 = 33554432;
        } else {
            i7 = 0;
        }
        f15854a = i7;
    }
}
