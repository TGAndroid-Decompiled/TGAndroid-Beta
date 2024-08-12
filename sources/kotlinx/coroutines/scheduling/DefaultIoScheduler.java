package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;
public final class DefaultIoScheduler extends ExecutorCoroutineDispatcher implements Executor {
    public static final DefaultIoScheduler INSTANCE = new DefaultIoScheduler();
    private static final CoroutineDispatcher f0default;

    @Override
    public String toString() {
        return "Dispatchers.IO";
    }

    private DefaultIoScheduler() {
    }

    static {
        int coerceAtLeast;
        int systemProp$default;
        UnlimitedIoScheduler unlimitedIoScheduler = UnlimitedIoScheduler.INSTANCE;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(64, SystemPropsKt.getAVAILABLE_PROCESSORS());
        systemProp$default = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.io.parallelism", coerceAtLeast, 0, 0, 12, (Object) null);
        f0default = unlimitedIoScheduler.limitedParallelism(systemProp$default);
    }

    @Override
    public void execute(Runnable runnable) {
        mo155dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override
    public void mo155dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        f0default.mo155dispatch(coroutineContext, runnable);
    }

    @Override
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }
}
