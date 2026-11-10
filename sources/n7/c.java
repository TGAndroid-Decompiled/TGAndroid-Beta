package n7;

import android.os.Build;
public abstract class c {
    public static final int f20530a;

    static {
        int i7;
        if (Build.VERSION.SDK_INT >= 31) {
            i7 = 33554432;
        } else {
            i7 = 0;
        }
        f20530a = i7;
    }
}
