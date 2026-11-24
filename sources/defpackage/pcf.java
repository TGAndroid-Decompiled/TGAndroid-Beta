package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class pcf extends v1f implements ScheduledFuture, t56, Future {
    public final vbf b;
    public final ScheduledFuture c;

    public pcf(vbf vbfVar, ScheduledFuture scheduledFuture) {
        this.b = vbfVar;
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
        return this.b.a instanceof nbf;
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
