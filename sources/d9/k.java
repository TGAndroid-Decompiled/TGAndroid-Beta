package d9;

import b6.m;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
public final class k implements Executor {
    public static final Logger f4274f = Logger.getLogger(k.class.getName());
    public final Executor f4275a;
    public final ArrayDeque f4276b = new ArrayDeque();
    public int f4277c = 1;
    public long d = 0;
    public final androidx.biometric.j e = new androidx.biometric.j(this);

    public k(Executor executor) {
        m.h(executor);
        this.f4275a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        m.h(runnable);
        synchronized (this.f4276b) {
            int i10 = this.f4277c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                j jVar = new j(0, runnable);
                this.f4276b.add(jVar);
                this.f4277c = 2;
                try {
                    this.f4275a.execute(this.e);
                    if (this.f4277c == 2) {
                        synchronized (this.f4276b) {
                            try {
                                if (this.d == j10 && this.f4277c == 2) {
                                    this.f4277c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f4276b) {
                        try {
                            int i11 = this.f4277c;
                            boolean z4 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f4276b.removeLastOccurrence(jVar)) {
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
            this.f4276b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f4275a + "}";
    }
}
