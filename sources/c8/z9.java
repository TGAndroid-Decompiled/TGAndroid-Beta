package c8;

import android.os.Build;
public abstract class z9 {
    public static boolean a(int i7) {
        if (i7 == 8 || i7 == 7) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && (i7 == 26 || i7 == 27)) {
            return true;
        }
        if (i10 >= 33 && i7 == 30) {
            return true;
        }
        return false;
    }
}
