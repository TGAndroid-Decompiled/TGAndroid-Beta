package b9;

import ab.o;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
public final class l implements Executor {
    public static final Logger f2017f = Logger.getLogger(l.class.getName());
    public final Executor f2018a;
    public final ArrayDeque f2019b = new ArrayDeque();
    public int f2020c = 1;
    public long d = 0;
    public final o f2021e = new o(this);

    public l(Executor executor) {
        z5.l.h(executor);
        this.f2018a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        z5.l.h(runnable);
        synchronized (this.f2019b) {
            int i10 = this.f2020c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                k kVar = new k(0, runnable);
                this.f2019b.add(kVar);
                this.f2020c = 2;
                try {
                    this.f2018a.execute(this.f2021e);
                    if (this.f2020c == 2) {
                        synchronized (this.f2019b) {
                            try {
                                if (this.d == j10 && this.f2020c == 2) {
                                    this.f2020c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f2019b) {
                        try {
                            int i11 = this.f2020c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f2019b.removeLastOccurrence(kVar)) {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f2019b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f2018a + "}";
    }
}
