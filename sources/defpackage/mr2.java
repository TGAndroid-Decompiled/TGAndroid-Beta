package defpackage;

import android.os.Handler;
import android.os.Looper;
public abstract class mr2 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
