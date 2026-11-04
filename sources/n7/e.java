package n7;

import android.os.Build;
public abstract class e {
    public static final int f20275a;

    static {
        int i3;
        if (Build.VERSION.SDK_INT >= 31) {
            i3 = 33554432;
        } else {
            i3 = 0;
        }
        f20275a = i3;
    }
}
