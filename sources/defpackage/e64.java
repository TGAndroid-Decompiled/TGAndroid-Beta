package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class e64 extends d64 implements pe3 {
    public final Executor c;

    public e64(Executor executor) {
        this.c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override
    public final xp3 a(long j, oqb oqbVar, cy2 cy2Var) {
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
                scheduledFuture = scheduledExecutorService.schedule(oqbVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                av5 av5Var = (av5) cy2Var.get(nf5.c);
                if (av5Var != null) {
                    av5Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            return new wp3(scheduledFuture);
        }
        return tb3.w.a(j, oqbVar, cy2Var);
    }

    @Override
    public final void b(long j, vb1 vb1Var) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            tnd tndVar = new tnd(this, vb1Var, (byte) 8);
            cy2 cy2Var = vb1Var.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(tndVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                av5 av5Var = (av5) cy2Var.get(nf5.c);
                if (av5Var != null) {
                    av5Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            vb1Var.v(new qb1(scheduledFuture, (byte) 0));
        } else {
            tb3.w.b(j, vb1Var);
        }
    }

    @Override
    public final void c(cy2 cy2Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            av5 av5Var = (av5) cy2Var.get(nf5.c);
            if (av5Var != null) {
                av5Var.cancel(cancellationException);
            }
            jd3 jd3Var = up3.a;
            jc3.c.c(cy2Var, runnable);
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
        if ((obj instanceof e64) && ((e64) obj).c == this.c) {
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
