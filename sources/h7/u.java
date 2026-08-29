package h7;

import android.os.Build;
public abstract class u {
    public static boolean a(int i10) {
        if ((i10 & 32768) != 0) {
            return true;
        }
        return false;
    }

    public static boolean b(int i10) {
        if (i10 != 15 && i10 != 255) {
            if (i10 != 32768) {
                if (i10 != 32783) {
                    if (i10 != 33023 && i10 != 0) {
                        return false;
                    }
                    return true;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 <= 29) {
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
