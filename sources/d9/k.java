package d9;

import b6.m;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
public final class k implements Executor {
    public static final Logger f4372f = Logger.getLogger(k.class.getName());
    public final Executor f4373a;
    public final ArrayDeque f4374b = new ArrayDeque();
    public int f4375c = 1;
    public long d = 0;
    public final androidx.biometric.k f4376e = new androidx.biometric.k(this);

    public k(Executor executor) {
        m.h(executor);
        this.f4373a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        m.h(runnable);
        synchronized (this.f4374b) {
            int i10 = this.f4375c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                j jVar = new j(0, runnable);
                this.f4374b.add(jVar);
                this.f4375c = 2;
                try {
                    this.f4373a.execute(this.f4376e);
                    if (this.f4375c == 2) {
                        synchronized (this.f4374b) {
                            try {
                                if (this.d == j10 && this.f4375c == 2) {
                                    this.f4375c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e6) {
                    synchronized (this.f4374b) {
                        try {
                            int i11 = this.f4375c;
                            boolean z4 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f4374b.removeLastOccurrence(jVar)) {
                                z4 = false;
                            }
                            if (!(e6 instanceof RejectedExecutionException) || z4) {
                                throw e6;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f4374b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f4373a + "}";
    }
}
