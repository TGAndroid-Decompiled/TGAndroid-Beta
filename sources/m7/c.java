package m7;

import android.os.Build;
public abstract class c {
    public static final int f19213a;

    static {
        int i3;
        if (Build.VERSION.SDK_INT >= 31) {
            i3 = 33554432;
        } else {
            i3 = 0;
        }
        f19213a = i3;
    }
}
