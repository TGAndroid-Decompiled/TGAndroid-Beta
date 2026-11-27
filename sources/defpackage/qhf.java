package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class qhf extends dhf implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public qhf(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override
    public final void close() {
        a3.j(this);
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        uhf uhfVar = new uhf(Executors.callable(runnable, null));
        return new fhf(uhfVar, this.b.schedule(uhfVar, j, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        phf phfVar = new phf(runnable);
        return new fhf(phfVar, this.b.scheduleAtFixedRate(phfVar, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        phf phfVar = new phf(runnable);
        return new fhf(phfVar, this.b.scheduleWithFixedDelay(phfVar, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        uhf uhfVar = new uhf(callable);
        return new fhf(uhfVar, this.b.schedule(uhfVar, j, timeUnit));
    }
}
