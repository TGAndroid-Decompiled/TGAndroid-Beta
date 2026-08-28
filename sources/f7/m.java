package f7;

import android.os.Build;
public abstract class m {
    public static boolean a(int i9) {
        if ((i9 & 32768) != 0) {
            return true;
        }
        return false;
    }

    public static boolean b(int i9) {
        if (i9 != 15 && i9 != 255) {
            if (i9 != 32768) {
                if (i9 != 32783) {
                    if (i9 != 33023 && i9 != 0) {
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
