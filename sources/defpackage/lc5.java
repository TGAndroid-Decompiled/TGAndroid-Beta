package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
public abstract class lc5 {
    private static volatile Choreographer choreographer;

    static {
        Object sa9Var;
        try {
            sa9Var = new kc5(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            sa9Var = new sa9(th);
        }
        if (sa9Var instanceof sa9) {
            sa9Var = null;
        }
        kc5 kc5Var = (kc5) sa9Var;
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
