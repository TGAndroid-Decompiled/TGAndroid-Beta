package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class HandlerDispatcherKt {
    public static final HandlerDispatcher Main;
    private static volatile Choreographer choreographer;

    public static final Handler asHandler(Looper looper, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
                return (Handler) objInvoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    static {
        Object objM307constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM307constructorimpl = Result.m307constructorimpl(new HandlerContext(asHandler(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM307constructorimpl = Result.m307constructorimpl(ResultKt.createFailure(th));
        }
        Main = (HandlerDispatcher) (Result.m311isFailureimpl(objM307constructorimpl) ? null : objM307constructorimpl);
    }
}
