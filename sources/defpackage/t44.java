package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class t44 extends s44 implements dd3 {
    public final Executor c;

    public t44(Executor executor) {
        this.c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override
    public final no3 a(long j, nob nobVar, sw2 sw2Var) {
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
                scheduledFuture = scheduledExecutorService.schedule(nobVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                bt5 bt5Var = (bt5) sw2Var.get(pd5.c);
                if (bt5Var != null) {
                    bt5Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            return new mo3(scheduledFuture);
        }
        return ha3.w.a(j, nobVar, sw2Var);
    }

    @Override
    public final void b(long j, na1 na1Var) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            rld rldVar = new rld(this, na1Var, (byte) 8);
            sw2 sw2Var = na1Var.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(rldVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                bt5 bt5Var = (bt5) sw2Var.get(pd5.c);
                if (bt5Var != null) {
                    bt5Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            na1Var.v(new ia1(scheduledFuture, (byte) 0));
        } else {
            ha3.w.b(j, na1Var);
        }
    }

    @Override
    public final void c(sw2 sw2Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            bt5 bt5Var = (bt5) sw2Var.get(pd5.c);
            if (bt5Var != null) {
                bt5Var.cancel(cancellationException);
            }
            xb3 xb3Var = ko3.a;
            xa3.c.c(sw2Var, runnable);
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
        if ((obj instanceof t44) && ((t44) obj).c == this.c) {
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
