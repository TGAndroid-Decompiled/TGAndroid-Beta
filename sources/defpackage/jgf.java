package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class jgf implements bpd {
    public final WeakReference a;
    public final vef b = new vef(this);

    public jgf(j9f j9fVar) {
        this.a = new WeakReference(j9fVar);
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        j9f j9fVar = (j9f) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && j9fVar != null) {
            j9fVar.a = null;
            j9fVar.b = null;
            j9fVar.c.i(null);
            return true;
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.b.a instanceof kvd;
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
