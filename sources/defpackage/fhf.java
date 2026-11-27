package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class fhf extends n6f implements ScheduledFuture, x76, Future {
    public final lgf b;
    public final ScheduledFuture c;

    public fhf(lgf lgfVar, ScheduledFuture scheduledFuture) {
        this.b = lgfVar;
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
        return this.b.a instanceof dgf;
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
