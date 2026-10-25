package a8;

import android.os.Build;
public abstract class ld {
    public static boolean a(int i10) {
        if (i10 == 8 || i10 == 7) {
            return true;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 && (i10 == 26 || i10 == 27)) {
            return true;
        }
        if (i11 >= 33 && i10 == 30) {
            return true;
        }
        return false;
    }
}
