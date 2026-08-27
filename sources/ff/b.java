package ff;

import android.os.Build;
import w9.d;

public final class b {

    public static final a f6050a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f6050a = new d(7);
        } else {
            f6050a = new xa.a(7);
        }
    }
}
