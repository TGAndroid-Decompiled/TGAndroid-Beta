package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class HandlerDispatcherKt {
    public static final HandlerDispatcher Main;
    private static volatile Choreographer choreographer;

    public static final Handler asHandler(Looper looper, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.os.Handler");
                return (Handler) invoke;
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
        Object m211constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m211constructorimpl = Result.m211constructorimpl(new HandlerContext(asHandler(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m211constructorimpl = Result.m211constructorimpl(ResultKt.createFailure(th));
        }
        Main = (HandlerDispatcher) (Result.m215isFailureimpl(m211constructorimpl) ? null : m211constructorimpl);
    }
}
