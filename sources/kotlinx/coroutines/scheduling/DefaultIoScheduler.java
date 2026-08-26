package kotlinx.coroutines.scheduling;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt;

public final class DefaultIoScheduler extends ExecutorCoroutineDispatcher implements Executor {
    public static final DefaultIoScheduler INSTANCE = new DefaultIoScheduler();

    public static final CoroutineDispatcher f4default;

    static {
        CoroutineDispatcher limitedDispatcher;
        UnlimitedIoScheduler unlimitedIoScheduler = UnlimitedIoScheduler.INSTANCE;
        int i = SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS;
        if (64 >= i) {
            i = 64;
        }
        int iSystemProp$default = AtomicKt.systemProp$default(i, 12, "kotlinx.coroutines.io.parallelism");
        unlimitedIoScheduler.getClass();
        if (iSystemProp$default < 1) {
            throw new IllegalArgumentException(Fragment$$ExternalSyntheticOutline0.m(iSystemProp$default, "Expected positive parallelism level, but got ").toString());
        }
        if (iSystemProp$default < TasksKt.MAX_POOL_SIZE) {
            if (iSystemProp$default < 1) {
                throw new IllegalArgumentException(Fragment$$ExternalSyntheticOutline0.m(iSystemProp$default, "Expected positive parallelism level, but got ").toString());
            }
            limitedDispatcher = new LimitedDispatcher(unlimitedIoScheduler, iSystemProp$default);
        }
        limitedDispatcher = unlimitedIoScheduler;
        f4default = limitedDispatcher;
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        f4default.dispatch(coroutineContext, runnable);
    }

    @Override
    public final void execute(Runnable runnable) {
        dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
