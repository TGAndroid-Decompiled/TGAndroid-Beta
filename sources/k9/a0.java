package k9;

import com.google.android.gms.internal.cast.f4;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
public class a0 extends AbstractExecutorService implements z, AutoCloseable {
    public final ExecutorService f16459a;

    public a0(ExecutorService executorService) {
        executorService.getClass();
        this.f16459a = executorService;
    }

    public final y a(Callable callable) {
        return (y) super.submit(callable);
    }

    @Override
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f16459a.awaitTermination(j10, timeUnit);
    }

    @Override
    public void close() {
        f4.g(this);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f16459a.execute(runnable);
    }

    @Override
    public final boolean isShutdown() {
        return this.f16459a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.f16459a.isTerminated();
    }

    @Override
    public final RunnableFuture newTaskFor(Callable callable) {
        return new g0(callable);
    }

    @Override
    public final void shutdown() {
        this.f16459a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return this.f16459a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return (y) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + this.f16459a + "]";
    }

    @Override
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new g0(Executors.callable(runnable, obj));
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return (y) super.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return (y) super.submit(callable);
    }
}
