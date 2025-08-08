package kotlinx.coroutines;

public final class BlockingEventLoop extends EventLoopImplBase {
    private final Thread thread;

    @Override
    protected Thread getThread() {
        return this.thread;
    }

    public BlockingEventLoop(Thread thread) {
        this.thread = thread;
    }
}
