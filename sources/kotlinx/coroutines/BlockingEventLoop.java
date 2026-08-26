package kotlinx.coroutines;

public final class BlockingEventLoop extends EventLoopImplBase {
    public final Thread thread;

    public BlockingEventLoop(Thread thread) {
        this.thread = thread;
    }

    @Override
    public final Thread getThread() {
        return this.thread;
    }
}
