package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt;
import org.telegram.ui.CastSync;

public abstract class TasksKt {
    public static final CastSync.AnonymousClass1 BlockingContext;
    public static final int CORE_POOL_SIZE;
    public static final String DEFAULT_SCHEDULER_NAME;
    public static final long IDLE_WORKER_KEEP_ALIVE_NS;
    public static final int MAX_POOL_SIZE;
    public static final CastSync.AnonymousClass1 NonBlockingContext;
    public static final long WORK_STEALING_TIME_RESOLUTION_NS;
    public static final NanoTimeSource schedulerTimeSource;

    static {
        String property;
        int i = SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        DEFAULT_SCHEDULER_NAME = property;
        WORK_STEALING_TIME_RESOLUTION_NS = AtomicKt.systemProp("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS;
        if (i2 < 2) {
            i2 = 2;
        }
        CORE_POOL_SIZE = AtomicKt.systemProp$default(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        MAX_POOL_SIZE = AtomicKt.systemProp$default(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        IDLE_WORKER_KEEP_ALIVE_NS = TimeUnit.SECONDS.toNanos(AtomicKt.systemProp("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        schedulerTimeSource = NanoTimeSource.INSTANCE;
        NonBlockingContext = new CastSync.AnonymousClass1(0);
        BlockingContext = new CastSync.AnonymousClass1(1);
    }
}
