package defpackage;

import android.os.Build;
public abstract class wmd {
    public static int a(hj0 hj0Var, gj0 gj0Var) {
        byte b = hj0Var.d;
        if (b != 0) {
            return b;
        }
        if (gj0Var != null) {
            return 15;
        }
        return 255;
    }

    public static boolean b(int i) {
        if ((i & 32768) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c(int i) {
        if (i != 15 && i != 255) {
            if (i != 32768) {
                if (i != 32783) {
                    if (i != 33023 && i != 0) {
                        return false;
                    }
                    return true;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 <= 29) {
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
