package d7;

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
        return ((ya.h) this).f49695a.awaitTermination(j10, timeUnit);
    }

    @Override
    public final void close() {
        i4.e(this);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return ((ya.h) this).f49695a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return ((ya.h) this).f49695a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return ((ya.h) this).f49695a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return ((ya.h) this).f49695a.isTerminated();
    }

    @Override
    public final void shutdown() {
        ((ya.h) this).f49695a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return ((ya.h) this).f49695a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return ((ya.h) this).f49695a.submit(runnable);
    }

    public final String toString() {
        return ((ya.h) this).f49695a.toString();
    }

    @Override
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return ((ya.h) this).f49695a.invokeAll(collection, j10, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return ((ya.h) this).f49695a.invokeAny(collection, j10, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return ((ya.h) this).f49695a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return ((ya.h) this).f49695a.submit(callable);
    }
}
