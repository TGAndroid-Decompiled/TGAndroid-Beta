package defpackage;

import android.os.Build;
public abstract class ate {
    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }
}
