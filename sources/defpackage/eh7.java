package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class eh7 extends bh7 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public eh7(ScheduledExecutorService scheduledExecutorService) {
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
        return new ch7(i6cVar, this.b.schedule(i6cVar, j, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        dh7 dh7Var = new dh7(runnable);
        return new ch7(dh7Var, this.b.scheduleAtFixedRate(dh7Var, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        dh7 dh7Var = new dh7(runnable);
        return new ch7(dh7Var, this.b.scheduleWithFixedDelay(dh7Var, j, j2, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        i6c i6cVar = new i6c(callable);
        return new ch7(i6cVar, this.b.schedule(i6cVar, j, timeUnit));
    }
}
