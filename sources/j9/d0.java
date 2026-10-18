package j9;

import com.google.android.gms.internal.cast.i4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class d0 extends a0 implements ScheduledExecutorService {
    public final ScheduledExecutorService f14336b;

    public d0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f14336b = scheduledExecutorService;
    }

    @Override
    public final void close() {
        i4.g(this);
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        g0 g0Var = new g0(callable);
        return new b0(g0Var, this.f14336b.schedule(g0Var, j10, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c0 c0Var = new c0(runnable);
        return new b0(c0Var, this.f14336b.scheduleAtFixedRate(c0Var, j10, j11, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c0 c0Var = new c0(runnable);
        return new b0(c0Var, this.f14336b.scheduleWithFixedDelay(c0Var, j10, j11, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        g0 g0Var = new g0(Executors.callable(runnable, null));
        return new b0(g0Var, this.f14336b.schedule(g0Var, j10, timeUnit));
    }
}
