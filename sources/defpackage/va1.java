package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class va1 implements t76 {
    public final WeakReference a;
    public final ua1 b = new ua1(this);

    public va1(ta1 ta1Var) {
        this.a = new WeakReference(ta1Var);
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        ta1 ta1Var = (ta1) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && ta1Var != null) {
            ta1Var.a = null;
            ta1Var.b = null;
            ta1Var.c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.b.a instanceof t3;
    }

    @Override
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
