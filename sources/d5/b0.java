package d5;

import android.os.Handler;
import android.os.Looper;

public final class b0 {

    public static final b0 f4778a = new b0();

    public final d0 a(Looper looper, Handler.Callback callback) {
        return new d0(new Handler(looper, callback));
    }
}
