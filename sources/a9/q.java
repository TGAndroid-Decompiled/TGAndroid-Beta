package a9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

public final class q implements Executor {

    public static final Logger f190f = Logger.getLogger(q.class.getName());

    public final Executor f191a;

    public final ArrayDeque f192b = new ArrayDeque();

    public int f193c = 1;
    public long d = 0;

    public final o f194e = new o(this);

    public q(Executor executor) {
        y5.l.h(executor);
        this.f191a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        y5.l.h(runnable);
        synchronized (this.f192b) {
            int i10 = this.f193c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                n nVar = new n(0, runnable);
                this.f192b.add(nVar);
                this.f193c = 2;
                try {
                    this.f191a.execute(this.f194e);
                    if (this.f193c != 2) {
                        return;
                    }
                    synchronized (this.f192b) {
                        try {
                            if (this.d == j10 && this.f193c == 2) {
                                this.f193c = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e9) {
                    synchronized (this.f192b) {
                        try {
                            int i11 = this.f193c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f192b.removeLastOccurrence(nVar)) {
                                z10 = false;
                            }
                            if (!(e9 instanceof RejectedExecutionException) || z10) {
                                throw e9;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f192b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f191a + "}";
    }
}
