package n7;

import android.os.Build;
public abstract class c {
    public static final int f21551a;

    static {
        int i7;
        if (Build.VERSION.SDK_INT >= 31) {
            i7 = 33554432;
        } else {
            i7 = 0;
        }
        f21551a = i7;
    }
}
