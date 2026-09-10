package f8;

import android.os.Build;
public abstract class b {
    public static final int f7895a;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f7895a = i10;
    }
}
