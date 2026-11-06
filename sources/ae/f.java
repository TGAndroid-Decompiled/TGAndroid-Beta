package ae;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.j;
public abstract class f {
    private static volatile Choreographer choreographer;

    static {
        Object b10;
        try {
            b10 = new e(a(Looper.getMainLooper()), false);
        } catch (Throwable th2) {
            b10 = af.b.b(th2);
        }
        if (b10 instanceof gd.f) {
            b10 = null;
        }
        e eVar = (e) b10;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            j.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
