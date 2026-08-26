package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class BlockingCoroutine extends AbstractCoroutine {
    public final Thread blockedThread;
    public final EventLoopImplPlatform eventLoop;

    public BlockingCoroutine(CoroutineContext coroutineContext, Thread thread, EventLoopImplPlatform eventLoopImplPlatform) {
        super(coroutineContext, true);
        this.blockedThread = thread;
        this.eventLoop = eventLoopImplPlatform;
    }

    @Override
    public final void afterCompletion(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.blockedThread;
        if (Intrinsics.areEqual(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
