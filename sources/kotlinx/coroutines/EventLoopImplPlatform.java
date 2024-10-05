package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

public abstract class EventLoopImplPlatform extends EventLoop {
    protected abstract Thread getThread();

    public final void unpark() {
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            AbstractTimeSourceKt.getTimeSource();
            LockSupport.unpark(thread);
        }
    }
}
