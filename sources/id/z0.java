package id;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class z0 extends y0 implements k0 {

    public final Executor f11219c;

    public z0(Executor executor) {
        Method method;
        this.f11219c = executor;
        Method method2 = nd.c.f18480a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = nd.c.f18480a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override
    public final void a(long j10, m mVar) {
        Executor executor = this.f11219c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            a9.o oVar = new a9.o(this, mVar, false, 20);
            rc.h hVar = mVar.f11167e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(oVar, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                f0.e(hVar, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            mVar.v(new j(scheduledFutureSchedule, 0));
        } else {
            g0.f11153s.a(j10, mVar);
        }
    }

    @Override
    public final p0 b(long j10, f2 f2Var, rc.h hVar) {
        Executor executor = this.f11219c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(f2Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e9) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e9);
                f0.e(hVar, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new o0(scheduledFutureSchedule) : g0.f11153s.b(j10, f2Var, hVar);
    }

    @Override
    public final void c(rc.h hVar, Runnable runnable) {
        try {
            this.f11219c.execute(runnable);
        } catch (RejectedExecutionException e9) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e9);
            f0.e(hVar, cancellationException);
            n0.f11172b.c(hVar, runnable);
        }
    }

    @Override
    public final void close() {
        Executor executor = this.f11219c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z0) && ((z0) obj).f11219c == this.f11219c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f11219c);
    }

    @Override
    public final String toString() {
        return this.f11219c.toString();
    }
}
