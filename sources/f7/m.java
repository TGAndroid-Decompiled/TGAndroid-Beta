package f7;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public abstract class m implements ExecutorService, AutoCloseable {
    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return ((ab.i) this).f314a.awaitTermination(j10, timeUnit);
    }

    @Override
    public final void close() {
        b9.b.f(this);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return ((ab.i) this).f314a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return ((ab.i) this).f314a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return ((ab.i) this).f314a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return ((ab.i) this).f314a.isTerminated();
    }

    @Override
    public final void shutdown() {
        ((ab.i) this).f314a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return ((ab.i) this).f314a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return ((ab.i) this).f314a.submit(runnable);
    }

    public final String toString() {
        return ((ab.i) this).f314a.toString();
    }

    @Override
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return ((ab.i) this).f314a.invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return ((ab.i) this).f314a.invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return ((ab.i) this).f314a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return ((ab.i) this).f314a.submit(callable);
    }
}
