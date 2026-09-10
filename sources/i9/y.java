package i9;

import com.google.android.gms.internal.cast.k4;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
public class y extends AbstractExecutorService implements x, AutoCloseable {
    public final ExecutorService f10542a;

    public y(ExecutorService executorService) {
        executorService.getClass();
        this.f10542a = executorService;
    }

    public final w a(Callable callable) {
        return (w) super.submit(callable);
    }

    @Override
    public final boolean awaitTermination(long j3, TimeUnit timeUnit) {
        return this.f10542a.awaitTermination(j3, timeUnit);
    }

    public void close() {
        k4.f(this);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f10542a.execute(runnable);
    }

    @Override
    public final boolean isShutdown() {
        return this.f10542a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.f10542a.isTerminated();
    }

    @Override
    public final RunnableFuture newTaskFor(Callable callable) {
        return new e0(callable);
    }

    @Override
    public final void shutdown() {
        this.f10542a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return this.f10542a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return (w) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + this.f10542a + "]";
    }

    @Override
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new e0(Executors.callable(runnable, obj));
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return (w) super.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return (w) super.submit(callable);
    }
}
