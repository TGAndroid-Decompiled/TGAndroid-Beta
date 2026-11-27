package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class yif implements prd {
    public final WeakReference a;
    public final khf b = new khf(this);

    public yif(ybf ybfVar) {
        this.a = new WeakReference(ybfVar);
    }

    @Override
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z) {
        ybf ybfVar = (ybf) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && ybfVar != null) {
            ybfVar.a = null;
            ybfVar.b = null;
            ybfVar.c.i(null);
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
        return this.b.a instanceof xxd;
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
