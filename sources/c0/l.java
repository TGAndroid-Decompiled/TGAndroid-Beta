package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m9.y;
public final class l implements y {
    public final WeakReference f4063a;
    public final k f4064b = new k(this);

    public l(i iVar) {
        this.f4063a = new WeakReference(iVar);
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.f4064b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f4063a.get();
        boolean cancel = this.f4064b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f4059a = null;
            iVar.f4060b = null;
            iVar.f4061c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f4064b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f4064b.f4056a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f4064b.isDone();
    }

    public final String toString() {
        return this.f4064b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f4064b.get(j3, timeUnit);
    }
}
