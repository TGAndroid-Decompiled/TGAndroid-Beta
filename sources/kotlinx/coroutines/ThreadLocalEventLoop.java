package kotlinx.coroutines;

public final class ThreadLocalEventLoop {
    public static final ThreadLocalEventLoop INSTANCE = new ThreadLocalEventLoop();
    private static final ThreadLocal ref = new ThreadLocal();

    private ThreadLocalEventLoop() {
    }

    public final void setEventLoop$kotlinx_coroutines_core(EventLoop eventLoop) {
        ref.set(eventLoop);
    }
}
