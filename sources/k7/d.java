package k7;

import android.os.Build;
public abstract class d {
    public static final int f14863a;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f14863a = i10;
    }
}
