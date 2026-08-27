package jd;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import h7.k6;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.j;

public abstract class f {
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            objA = new e(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objA = k6.a(th);
        }
        if (objA instanceof pc.e) {
            objA = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        j.c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
