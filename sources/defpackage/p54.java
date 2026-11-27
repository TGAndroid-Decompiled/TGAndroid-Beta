package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class p54 extends o54 implements vd3 {
    public final Executor c;

    public p54(Executor executor) {
        this.c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override
    public final ep3 a(long j, nsb nsbVar, mx2 mx2Var) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(nsbVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ev5 ev5Var = (ev5) mx2Var.get(qf5.c);
                if (ev5Var != null) {
                    ev5Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            return new dp3(scheduledFuture);
        }
        return ab3.w.a(j, nsbVar, mx2Var);
    }

    @Override
    public final void b(long j, va1 va1Var) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            iqd iqdVar = new iqd(this, va1Var, (byte) 8);
            mx2 mx2Var = va1Var.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(iqdVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ev5 ev5Var = (ev5) mx2Var.get(qf5.c);
                if (ev5Var != null) {
                    ev5Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            va1Var.v(new qa1(scheduledFuture, (byte) 0));
        } else {
            ab3.w.b(j, va1Var);
        }
    }

    @Override
    public final void c(mx2 mx2Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            ev5 ev5Var = (ev5) mx2Var.get(qf5.c);
            if (ev5Var != null) {
                ev5Var.cancel(cancellationException);
            }
            qc3 qc3Var = bp3.a;
            qb3.c.c(mx2Var, runnable);
        }
    }

    @Override
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.c;
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
        if ((obj instanceof p54) && ((p54) obj).c == this.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override
    public final String toString() {
        return this.c.toString();
    }
}
