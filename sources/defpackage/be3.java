package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class be3 implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService a;
    public final ScheduledExecutorService b;

    public be3(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.a = executorService;
        this.b = scheduledExecutorService;
    }

    @Override
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override
    public final void close() {
        a3.c(this);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new de3(new jn1(this, runnable, j, timeUnit, (byte) 1));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new de3(new yd3(this, runnable, j, j2, timeUnit, (byte) 0));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new de3(new yd3(this, runnable, j, j2, timeUnit, (byte) 1));
    }

    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public final Future submit(Callable callable) {
        return this.a.submit(callable);
    }

    @Override
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return new de3(new jn1(this, callable, j, timeUnit, (byte) 2));
    }
}
