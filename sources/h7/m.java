package h7;

import com.google.android.gms.internal.cast.i4;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public abstract class m implements ExecutorService, AutoCloseable {
    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return ((cb.i) this).f2223a.awaitTermination(j10, timeUnit);
    }

    @Override
    public final void close() {
        i4.f(this);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return ((cb.i) this).f2223a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return ((cb.i) this).f2223a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return ((cb.i) this).f2223a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return ((cb.i) this).f2223a.isTerminated();
    }

    @Override
    public final void shutdown() {
        ((cb.i) this).f2223a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return ((cb.i) this).f2223a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return ((cb.i) this).f2223a.submit(runnable);
    }

    public final String toString() {
        return ((cb.i) this).f2223a.toString();
    }

    @Override
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return ((cb.i) this).f2223a.invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return ((cb.i) this).f2223a.invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return ((cb.i) this).f2223a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return ((cb.i) this).f2223a.submit(callable);
    }
}
