package i9;

import com.google.android.gms.internal.cast.k4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class b0 extends y implements ScheduledExecutorService {
    public final ScheduledExecutorService f10509b;

    public b0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f10509b = scheduledExecutorService;
    }

    @Override
    public final void close() {
        k4.g(this);
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        e0 e0Var = new e0(callable);
        return new z(e0Var, this.f10509b.schedule(e0Var, j3, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        a0 a0Var = new a0(runnable);
        return new z(a0Var, this.f10509b.scheduleAtFixedRate(a0Var, j3, j10, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        a0 a0Var = new a0(runnable);
        return new z(a0Var, this.f10509b.scheduleWithFixedDelay(a0Var, j3, j10, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        e0 e0Var = new e0(Executors.callable(runnable, null));
        return new z(e0Var, this.f10509b.schedule(e0Var, j3, timeUnit));
    }
}
