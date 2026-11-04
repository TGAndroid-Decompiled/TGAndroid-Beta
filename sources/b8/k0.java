package b8;

import android.os.Build;
public abstract class k0 {
    public static boolean a(int i3) {
        if ((i3 & 32768) != 0) {
            return true;
        }
        return false;
    }

    public static boolean b(int i3) {
        if (i3 != 15 && i3 != 255) {
            if (i3 != 32768) {
                if (i3 != 32783) {
                    if (i3 != 33023 && i3 != 0) {
                        return false;
                    }
                    return true;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28 && i10 <= 29) {
                    return false;
                }
                return true;
            } else if (Build.VERSION.SDK_INT < 30) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
