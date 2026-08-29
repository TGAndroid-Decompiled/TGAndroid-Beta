package kd;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import i7.c7;
import kotlin.jvm.internal.j;
public abstract class e {
    private static volatile Choreographer choreographer;

    static {
        Object a2;
        try {
            a2 = new d(a(Looper.getMainLooper()), false);
        } catch (Throwable th2) {
            a2 = c7.a(th2);
        }
        if (a2 instanceof qc.e) {
            a2 = null;
        }
        d dVar = (d) a2;
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
