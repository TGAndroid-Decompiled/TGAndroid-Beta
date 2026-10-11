package ae;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class a1 extends z0 implements l0 {
    public final Executor f425c;

    public a1(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f425c = executor;
        Method method2 = fe.c.f9888a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = fe.c.f9888a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override
    public final q0 a(long j3, g2 g2Var, jd.h hVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f425c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(g2Var, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                g0.e(hVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new p0(scheduledFuture);
        }
        return h0.f462s.a(j3, g2Var, hVar);
    }

    @Override
    public final void b(long j3, m mVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f425c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            i9.s sVar = new i9.s(1, this, mVar);
            jd.h hVar = mVar.f474e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(sVar, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                g0.e(hVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            mVar.v(new j(scheduledFuture, 0));
        } else {
            h0.f462s.b(j3, mVar);
        }
    }

    @Override
    public final void c(jd.h hVar, Runnable runnable) {
        try {
            this.f425c.execute(runnable);
        } catch (RejectedExecutionException e7) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e7);
            g0.e(hVar, cancellationException);
            o0.f481b.c(hVar, runnable);
        }
    }

    @Override
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f425c;
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
        if ((obj instanceof a1) && ((a1) obj).f425c == this.f425c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f425c);
    }

    @Override
    public final String toString() {
        return this.f425c.toString();
    }
}
