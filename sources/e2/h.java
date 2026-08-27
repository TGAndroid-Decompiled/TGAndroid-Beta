package e2;

import android.os.Handler;
import android.os.Looper;

public abstract class h {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
