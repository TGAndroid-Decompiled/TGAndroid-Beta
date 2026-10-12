package j9;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class b0 extends e9.s implements ScheduledFuture, y, Future {
    public final o f12911b;
    public final ScheduledFuture f12912c;

    public b0(o oVar, ScheduledFuture scheduledFuture) {
        this.f12911b = oVar;
        this.f12912c = scheduledFuture;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f12911b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        boolean y3 = y(z10);
        if (y3) {
            this.f12912c.cancel(z10);
        }
        return y3;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f12912c.compareTo(delayed);
    }

    @Override
    public final Object get() {
        return this.f12911b.get();
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f12912c.getDelay(timeUnit);
    }

    @Override
    public final Object h() {
        return this.f12911b;
    }

    @Override
    public final boolean isCancelled() {
        return this.f12911b.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.f12911b.isDone();
    }

    public final boolean y(boolean z10) {
        return this.f12911b.cancel(z10);
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f12911b.get(j10, timeUnit);
    }
}
