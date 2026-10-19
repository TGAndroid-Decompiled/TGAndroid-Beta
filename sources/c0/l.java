package c0;

import j9.y;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class l implements y {
    public final WeakReference f4473a;
    public final k f4474b = new k(this);

    public l(i iVar) {
        this.f4473a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f4474b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f4473a.get();
        boolean cancel = this.f4474b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f4469a = null;
            iVar.f4470b = null;
            iVar.f4471c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f4474b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f4474b.f4466a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f4474b.isDone();
    }

    public final String toString() {
        return this.f4474b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f4474b.get(j10, timeUnit);
    }
}
