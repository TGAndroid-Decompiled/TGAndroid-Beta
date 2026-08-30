package d9;

import b6.m;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
public final class k implements Executor {
    public static final Logger f4293f = Logger.getLogger(k.class.getName());
    public final Executor f4294a;
    public final ArrayDeque f4295b = new ArrayDeque();
    public int f4296c = 1;
    public long d = 0;
    public final androidx.biometric.k e = new androidx.biometric.k(this);

    public k(Executor executor) {
        m.h(executor);
        this.f4294a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        m.h(runnable);
        synchronized (this.f4295b) {
            int i10 = this.f4296c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                j jVar = new j(0, runnable);
                this.f4295b.add(jVar);
                this.f4296c = 2;
                try {
                    this.f4294a.execute(this.e);
                    if (this.f4296c == 2) {
                        synchronized (this.f4295b) {
                            try {
                                if (this.d == j10 && this.f4296c == 2) {
                                    this.f4296c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f4295b) {
                        try {
                            int i11 = this.f4296c;
                            boolean z4 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f4295b.removeLastOccurrence(jVar)) {
                                z4 = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z4) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f4295b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f4294a + "}";
    }
}
