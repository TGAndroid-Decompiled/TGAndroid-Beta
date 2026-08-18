package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

public abstract class EventLoopImplPlatform extends EventLoop {
    protected abstract Thread getThread();

    protected final void unpark() {
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            AbstractTimeSourceKt.access$getTimeSource$p();
            LockSupport.unpark(thread);
        }
    }

    protected void reschedule(long j, EventLoopImplBase.DelayedTask delayedTask) {
        DefaultExecutor.INSTANCE.schedule(j, delayedTask);
    }
}
