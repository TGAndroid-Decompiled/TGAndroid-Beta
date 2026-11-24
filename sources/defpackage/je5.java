package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
public abstract class je5 {
    private static volatile Choreographer choreographer;

    static {
        Object sc9Var;
        try {
            sc9Var = new ie5(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            sc9Var = new sc9(th);
        }
        if (sc9Var instanceof sc9) {
            sc9Var = null;
        }
        ie5 ie5Var = (ie5) sc9Var;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            invoke.getClass();
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
