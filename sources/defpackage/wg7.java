package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class wg7 extends tg7 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public wg7(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override
    public final void close() {
        z2.g(this);
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        i4c i4cVar = new i4c(Executors.callable(runnable, null));
        return new ug7(i4cVar, this.b.schedule(i4cVar, j, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        vg7 vg7Var = new vg7(runnable);
        return new ug7(vg7Var, this.b.scheduleAtFixedRate(vg7Var, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        vg7 vg7Var = new vg7(runnable);
        return new ug7(vg7Var, this.b.scheduleWithFixedDelay(vg7Var, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        i4c i4cVar = new i4c(callable);
        return new ug7(i4cVar, this.b.schedule(i4cVar, j, timeUnit));
    }
}
