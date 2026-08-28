package d5;

import android.os.Handler;
import android.os.Looper;
public final class a0 {
    public static final a0 f4330a = new Object();

    public final c0 a(Looper looper, Handler.Callback callback) {
        return new c0(new Handler(looper, callback));
    }
}
