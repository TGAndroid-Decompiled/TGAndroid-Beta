package m9;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class b0 extends h9.o implements ScheduledFuture, y, Future {
    public final o f21013b;
    public final ScheduledFuture f21014c;

    public b0(o oVar, ScheduledFuture scheduledFuture) {
        this.f21013b = oVar;
        this.f21014c = scheduledFuture;
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.f21013b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        boolean z11 = z(z10);
        if (z11) {
            this.f21014c.cancel(z10);
        }
        return z11;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f21014c.compareTo(delayed);
    }

    @Override
    public final Object get() {
        return this.f21013b.get();
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f21014c.getDelay(timeUnit);
    }

    @Override
    public final Object i() {
        return this.f21013b;
    }

    @Override
    public final boolean isCancelled() {
        return this.f21013b.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.f21013b.isDone();
    }

    public final boolean z(boolean z10) {
        return this.f21013b.cancel(z10);
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f21013b.get(j3, timeUnit);
    }
}
