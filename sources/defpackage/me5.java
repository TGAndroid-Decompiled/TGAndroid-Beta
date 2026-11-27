package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
public abstract class me5 {
    private static volatile Choreographer choreographer;

    static {
        Object ge9Var;
        try {
            ge9Var = new le5(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            ge9Var = new ge9(th);
        }
        if (ge9Var instanceof ge9) {
            ge9Var = null;
        }
        le5 le5Var = (le5) ge9Var;
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
