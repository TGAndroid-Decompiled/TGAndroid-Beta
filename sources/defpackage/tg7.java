package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
public class tg7 extends AbstractExecutorService implements AutoCloseable, ExecutorService {
    public final ExecutorService a;

    public tg7(ExecutorService executorService) {
        executorService.getClass();
        this.a = executorService;
    }

    public final t76 a(Callable callable) {
        return (t76) super.submit(callable);
    }

    @Override
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override
    public void close() {
        z2.f(this);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
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
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new i4c(Executors.callable(runnable, obj));
    }

    @Override
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return (t76) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + this.a + "]";
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return (t76) super.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return (t76) super.submit(callable);
    }

    @Override
    public final RunnableFuture newTaskFor(Callable callable) {
        return new i4c(callable);
    }
}
