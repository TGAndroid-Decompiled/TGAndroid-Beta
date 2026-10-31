package c0;

import j9.y;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class l implements y {
    public final WeakReference f3512a;
    public final k f3513b = new k(this);

    public l(i iVar) {
        this.f3512a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f3513b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f3512a.get();
        boolean cancel = this.f3513b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f3508a = null;
            iVar.f3509b = null;
            iVar.f3510c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f3513b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f3513b.f3505a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f3513b.isDone();
    }

    public final String toString() {
        return this.f3513b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f3513b.get(j10, timeUnit);
    }
}
