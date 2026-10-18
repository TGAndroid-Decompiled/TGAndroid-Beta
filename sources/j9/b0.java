package j9;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class b0 extends e9.s implements ScheduledFuture, y, Future {
    public final o f14329b;
    public final ScheduledFuture f14330c;

    public b0(o oVar, ScheduledFuture scheduledFuture) {
        this.f14329b = oVar;
        this.f14330c = scheduledFuture;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f14329b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        boolean y3 = y(z10);
        if (y3) {
            this.f14330c.cancel(z10);
        }
        return y3;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f14330c.compareTo(delayed);
    }

    @Override
    public final Object get() {
        return this.f14329b.get();
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f14330c.getDelay(timeUnit);
    }

    @Override
    public final Object h() {
        return this.f14329b;
    }

    @Override
    public final boolean isCancelled() {
        return this.f14329b.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.f14329b.isDone();
    }

    public final boolean y(boolean z10) {
        return this.f14329b.cancel(z10);
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f14329b.get(j10, timeUnit);
    }
}
