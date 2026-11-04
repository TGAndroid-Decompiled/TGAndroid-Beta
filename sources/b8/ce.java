package b8;

import android.os.Build;
public abstract class ce {
    public static boolean a(int i3) {
        if (i3 == 8 || i3 == 7) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && (i3 == 26 || i3 == 27)) {
            return true;
        }
        if (i10 >= 33 && i3 == 30) {
            return true;
        }
        return false;
    }
}
