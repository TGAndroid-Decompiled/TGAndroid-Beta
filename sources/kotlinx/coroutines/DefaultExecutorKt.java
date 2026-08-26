package kotlinx.coroutines;

import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;

public abstract class DefaultExecutorKt {
    public static final Delay DefaultDelay;

    static {
        String property;
        ?? r0;
        int i = SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            r0 = MainDispatcherLoader.dispatcher;
            HandlerContext handlerContext = r0.immediate;
            if (!(r0 != 0)) {
                r0 = DefaultExecutor.INSTANCE;
            }
        } else {
            r0 = DefaultExecutor.INSTANCE;
        }
        DefaultDelay = r0;
    }
}
