package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class dh7 extends ah7 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public dh7(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override
    public final void close() {
        a3.g(this);
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        i6c i6cVar = new i6c(Executors.callable(runnable, null));
        return new bh7(i6cVar, this.b.schedule(i6cVar, j, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ch7 ch7Var = new ch7(runnable);
        return new bh7(ch7Var, this.b.scheduleAtFixedRate(ch7Var, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ch7 ch7Var = new ch7(runnable);
        return new bh7(ch7Var, this.b.scheduleWithFixedDelay(ch7Var, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        i6c i6cVar = new i6c(callable);
        return new bh7(i6cVar, this.b.schedule(i6cVar, j, timeUnit));
    }
}
