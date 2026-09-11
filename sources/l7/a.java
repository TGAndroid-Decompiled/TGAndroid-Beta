package l7;

import android.os.Build;
public abstract class a {
    public static final int f15313a;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f15313a = i10;
    }
}
