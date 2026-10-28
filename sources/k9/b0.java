package k9;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class b0 extends f9.o implements ScheduledFuture, y, Future {
    public final o f16461b;
    public final ScheduledFuture f16462c;

    public b0(o oVar, ScheduledFuture scheduledFuture) {
        this.f16461b = oVar;
        this.f16462c = scheduledFuture;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f16461b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        boolean y3 = y(z10);
        if (y3) {
            this.f16462c.cancel(z10);
        }
        return y3;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f16462c.compareTo(delayed);
    }

    @Override
    public final Object get() {
        return this.f16461b.get();
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f16462c.getDelay(timeUnit);
    }

    @Override
    public final Object h() {
        return this.f16461b;
    }

    @Override
    public final boolean isCancelled() {
        return this.f16461b.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.f16461b.isDone();
    }

    public final boolean y(boolean z10) {
        return this.f16461b.cancel(z10);
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f16461b.get(j10, timeUnit);
    }
}
