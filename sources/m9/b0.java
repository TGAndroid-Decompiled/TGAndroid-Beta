package m9;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class b0 extends h9.o implements ScheduledFuture, y, Future {
    public final o f19967b;
    public final ScheduledFuture f19968c;

    public b0(o oVar, ScheduledFuture scheduledFuture) {
        this.f19967b = oVar;
        this.f19968c = scheduledFuture;
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.f19967b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z9) {
        boolean z10 = z(z9);
        if (z10) {
            this.f19968c.cancel(z9);
        }
        return z10;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f19968c.compareTo(delayed);
    }

    @Override
    public final Object get() {
        return this.f19967b.get();
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f19968c.getDelay(timeUnit);
    }

    @Override
    public final Object i() {
        return this.f19967b;
    }

    @Override
    public final boolean isCancelled() {
        return this.f19967b.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.f19967b.isDone();
    }

    public final boolean z(boolean z9) {
        return this.f19967b.cancel(z9);
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f19967b.get(j3, timeUnit);
    }
}
