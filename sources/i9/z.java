package i9;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class z extends e9.q implements ScheduledFuture, w, Future {
    public final o f12085b;
    public final ScheduledFuture f12086c;

    public z(o oVar, ScheduledFuture scheduledFuture) {
        this.f12085b = oVar;
        this.f12086c = scheduledFuture;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f12085b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        boolean x10 = x(z10);
        if (x10) {
            this.f12086c.cancel(z10);
        }
        return x10;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f12086c.compareTo(delayed);
    }

    @Override
    public final Object g() {
        return this.f12085b;
    }

    @Override
    public final Object get() {
        return this.f12085b.get();
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f12086c.getDelay(timeUnit);
    }

    @Override
    public final boolean isCancelled() {
        return this.f12085b.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.f12085b.isDone();
    }

    public final boolean x(boolean z10) {
        return this.f12085b.cancel(z10);
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f12085b.get(j3, timeUnit);
    }
}
