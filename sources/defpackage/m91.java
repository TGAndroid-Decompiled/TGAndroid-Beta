package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class m91 implements t56 {
    public final WeakReference a;
    public final l91 b = new l91(this);

    public m91(k91 k91Var) {
        this.a = new WeakReference(k91Var);
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        k91 k91Var = (k91) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && k91Var != null) {
            k91Var.a = null;
            k91Var.b = null;
            k91Var.c.k(null);
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
