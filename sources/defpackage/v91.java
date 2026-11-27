package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class v91 implements x76 {
    public final WeakReference a;
    public final u91 b = new u91(this);

    public v91(t91 t91Var) {
        this.a = new WeakReference(t91Var);
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        t91 t91Var = (t91) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && t91Var != null) {
            t91Var.a = null;
            t91Var.b = null;
            t91Var.c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.b.a instanceof u3;
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
