package c0;

import j9.y;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class l implements y {
    public final WeakReference f4477a;
    public final k f4478b = new k(this);

    public l(i iVar) {
        this.f4477a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f4478b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f4477a.get();
        boolean cancel = this.f4478b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f4473a = null;
            iVar.f4474b = null;
            iVar.f4475c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f4478b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f4478b.f4470a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f4478b.isDone();
    }

    public final String toString() {
        return this.f4478b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f4478b.get(j10, timeUnit);
    }
}
