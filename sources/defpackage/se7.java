package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class se7 extends cie implements ScheduledFuture, t56, Future {
    public final t2 b;
    public final ScheduledFuture c;

    public se7(t2 t2Var, ScheduledFuture scheduledFuture) {
        this.b = t2Var;
        this.c = scheduledFuture;
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        boolean e = e(z);
        if (e) {
            this.c.cancel(z);
        }
        return e;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.c.compareTo(delayed);
    }

    @Override
    public final Object d() {
        return this.b;
    }

    public final boolean e(boolean z) {
        return this.b.cancel(z);
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
        return this.b.isCancelled();
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
