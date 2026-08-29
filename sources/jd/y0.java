package jd;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class y0 extends x0 implements j0 {
    public final Executor f11542c;

    public y0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f11542c = executor;
        Method method2 = od.c.f19507a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = od.c.f19507a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override
    public final o0 a(long j10, e2 e2Var, sc.h hVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f11542c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(e2Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                e0.e(hVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new n0(scheduledFuture);
        }
        return f0.f11475s.a(j10, e2Var, hVar);
    }

    @Override
    public final void b(long j10, m mVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f11542c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            ab.o oVar = new ab.o(24, this, mVar);
            sc.h hVar = mVar.f11494e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(oVar, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                e0.e(hVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            mVar.v(new j(scheduledFuture, 0));
        } else {
            f0.f11475s.b(j10, mVar);
        }
    }

    @Override
    public final void c(sc.h hVar, Runnable runnable) {
        try {
            this.f11542c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            e0.e(hVar, cancellationException);
            m0.f11496b.c(hVar, runnable);
        }
    }

    @Override
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f11542c;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof y0) && ((y0) obj).f11542c == this.f11542c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f11542c);
    }

    @Override
    public final String toString() {
        return this.f11542c.toString();
    }
}
