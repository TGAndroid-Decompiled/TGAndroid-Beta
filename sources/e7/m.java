package e7;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class m implements ExecutorService, AutoCloseable {
    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return ((za.h) this).f50290a.awaitTermination(j10, timeUnit);
    }

    @Override
    public final void close() {
        a9.b.f(this);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return ((za.h) this).f50290a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return ((za.h) this).f50290a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return ((za.h) this).f50290a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return ((za.h) this).f50290a.isTerminated();
    }

    @Override
    public final void shutdown() {
        ((za.h) this).f50290a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return ((za.h) this).f50290a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return ((za.h) this).f50290a.submit(runnable);
    }

    public final String toString() {
        return ((za.h) this).f50290a.toString();
    }

    @Override
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return ((za.h) this).f50290a.invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return ((za.h) this).f50290a.invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return ((za.h) this).f50290a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return ((za.h) this).f50290a.submit(callable);
    }
}
