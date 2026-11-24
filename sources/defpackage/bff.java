package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class bff extends oef implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public bff(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override
    public final void close() {
        z2.j(this);
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        fff fffVar = new fff(Executors.callable(runnable, null));
        return new qef(fffVar, this.b.schedule(fffVar, j, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        aff affVar = new aff(runnable);
        return new qef(affVar, this.b.scheduleAtFixedRate(affVar, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        aff affVar = new aff(runnable);
        return new qef(affVar, this.b.scheduleWithFixedDelay(affVar, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        fff fffVar = new fff(callable);
        return new qef(fffVar, this.b.schedule(fffVar, j, timeUnit));
    }
}
