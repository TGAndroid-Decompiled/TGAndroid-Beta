package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
public final class v4a implements Executor {
    public static final Logger f = Logger.getLogger(v4a.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final tq4 e = new tq4(this);

    public v4a(Executor executor) {
        fre.h(executor);
        this.a = executor;
    }

    @Override
    public final void execute(Runnable runnable) {
        fre.h(runnable);
        synchronized (this.b) {
            int i = this.c;
            if (i != 4 && i != 3) {
                long j = this.d;
                boolean z = true;
                xo9 xo9Var = new xo9(runnable, (byte) 1);
                this.b.add(xo9Var);
                this.c = 2;
                try {
                    this.a.execute(this.e);
                    if (this.c == 2) {
                        synchronized (this.b) {
                            if (this.d == j && this.c == 2) {
                                this.c = 3;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.b) {
                        int i2 = this.c;
                        if ((i2 != 1 && i2 != 2) || !this.b.removeLastOccurrence(xo9Var)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
