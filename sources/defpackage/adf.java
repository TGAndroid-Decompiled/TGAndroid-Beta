package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class adf extends ncf implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public adf(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override
    public final void close() {
        z2.j(this);
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        edf edfVar = new edf(Executors.callable(runnable, null));
        return new pcf(edfVar, this.b.schedule(edfVar, j, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zcf zcfVar = new zcf(runnable);
        return new pcf(zcfVar, this.b.scheduleAtFixedRate(zcfVar, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zcf zcfVar = new zcf(runnable);
        return new pcf(zcfVar, this.b.scheduleWithFixedDelay(zcfVar, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        edf edfVar = new edf(callable);
        return new pcf(edfVar, this.b.schedule(edfVar, j, timeUnit));
    }
}
