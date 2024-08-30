package kotlinx.coroutines;

public abstract class EventLoop extends CoroutineDispatcher {
    private boolean shared;
    private long useCount;

    private final long delta(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public static void incrementUseCount$default(EventLoop eventLoop, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        eventLoop.incrementUseCount(z);
    }

    public long getNextTime() {
        return Long.MAX_VALUE;
    }

    public final void incrementUseCount(boolean z) {
        this.useCount += delta(z);
        if (z) {
            return;
        }
        this.shared = true;
    }

    public final boolean isUnconfinedQueueEmpty() {
        return true;
    }

    public final boolean processUnconfinedEvent() {
        return false;
    }
}
