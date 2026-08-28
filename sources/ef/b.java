package ef;

import android.os.Build;
import d7.u;
import v9.d;
public final class b {
    public static final a f5119a;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f5119a = new u(7);
        } else {
            f5119a = new d(7);
        }
    }
}
