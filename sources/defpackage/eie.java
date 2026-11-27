package defpackage;

import android.os.Build;
public abstract class eie {
    public static boolean a(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 && (i == 26 || i == 27)) {
            return true;
        }
        if (i2 >= 33 && i == 30) {
            return true;
        }
        return false;
    }
}
