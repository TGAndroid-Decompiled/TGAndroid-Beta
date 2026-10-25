package k9;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class b0 extends f9.o implements ScheduledFuture, y, Future {
    public final o f16462b;
    public final ScheduledFuture f16463c;

    public b0(o oVar, ScheduledFuture scheduledFuture) {
        this.f16462b = oVar;
        this.f16463c = scheduledFuture;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f16462b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        boolean y3 = y(z10);
        if (y3) {
            this.f16463c.cancel(z10);
        }
        return y3;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f16463c.compareTo(delayed);
    }

    @Override
    public final Object get() {
        return this.f16462b.get();
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f16463c.getDelay(timeUnit);
    }

    @Override
    public final Object h() {
        return this.f16462b;
    }

    @Override
    public final boolean isCancelled() {
        return this.f16462b.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.f16462b.isDone();
    }

    public final boolean y(boolean z10) {
        return this.f16462b.cancel(z10);
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f16462b.get(j10, timeUnit);
    }
}
