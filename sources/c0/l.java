package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m9.y;
public final class l implements y {
    public final WeakReference f5247a;
    public final k f5248b = new k(this);

    public l(i iVar) {
        this.f5247a = new WeakReference(iVar);
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.f5248b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z9) {
        i iVar = (i) this.f5247a.get();
        boolean cancel = this.f5248b.cancel(z9);
        if (cancel && iVar != null) {
            iVar.f5243a = null;
            iVar.f5244b = null;
            iVar.f5245c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f5248b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f5248b.f5240a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f5248b.isDone();
    }

    public final String toString() {
        return this.f5248b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f5248b.get(j3, timeUnit);
    }
}
