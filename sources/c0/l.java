package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m9.y;
public final class l implements y {
    public final WeakReference f5242a;
    public final k f5243b = new k(this);

    public l(i iVar) {
        this.f5242a = new WeakReference(iVar);
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.f5243b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z9) {
        i iVar = (i) this.f5242a.get();
        boolean cancel = this.f5243b.cancel(z9);
        if (cancel && iVar != null) {
            iVar.f5238a = null;
            iVar.f5239b = null;
            iVar.f5240c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f5243b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f5243b.f5235a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f5243b.isDone();
    }

    public final String toString() {
        return this.f5243b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f5243b.get(j3, timeUnit);
    }
}
