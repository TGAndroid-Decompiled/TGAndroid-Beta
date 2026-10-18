package e2;

import android.os.Handler;
import android.os.Looper;
public final class g0 {
    public static final g0 f8230a = new Object();

    public final i0 a(Looper looper, Handler.Callback callback) {
        return new i0(new Handler(looper, callback));
    }
}
