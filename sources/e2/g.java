package e2;

import android.os.Handler;
import android.os.Looper;
public abstract class g {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
