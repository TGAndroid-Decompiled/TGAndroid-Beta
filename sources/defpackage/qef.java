package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class qef extends x3f implements ScheduledFuture, t76, Future {
    public final wdf b;
    public final ScheduledFuture c;

    public qef(wdf wdfVar, ScheduledFuture scheduledFuture) {
        this.b = wdfVar;
        this.c = scheduledFuture;
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        boolean cancel = this.b.cancel(z);
        if (cancel) {
            this.c.cancel(z);
        }
        return cancel;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.c.compareTo(delayed);
    }

    @Override
    public final Object get() {
        return this.b.get();
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.c.getDelay(timeUnit);
    }

    @Override
    public final boolean isCancelled() {
        return this.b.a instanceof odf;
    }

    @Override
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
