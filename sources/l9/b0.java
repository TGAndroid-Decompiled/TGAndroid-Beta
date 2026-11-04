package l9;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class b0 extends g9.o implements ScheduledFuture, y, Future {
    public final o f18130b;
    public final ScheduledFuture f18131c;

    public b0(o oVar, ScheduledFuture scheduledFuture) {
        this.f18130b = oVar;
        this.f18131c = scheduledFuture;
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.f18130b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        boolean z11 = z(z10);
        if (z11) {
            this.f18131c.cancel(z10);
        }
        return z11;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f18131c.compareTo(delayed);
    }

    @Override
    public final Object get() {
        return this.f18130b.get();
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f18131c.getDelay(timeUnit);
    }

    @Override
    public final Object i() {
        return this.f18130b;
    }

    @Override
    public final boolean isCancelled() {
        return this.f18130b.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.f18130b.isDone();
    }

    public final boolean z(boolean z10) {
        return this.f18130b.cancel(z10);
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f18130b.get(j10, timeUnit);
    }
}
