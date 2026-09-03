package jf;

import android.os.Build;
public final class b {
    public static final a f9350a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f9350a = new cb.b(10);
        } else {
            f9350a = new db.a(10);
        }
    }
}
