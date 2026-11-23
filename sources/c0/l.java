package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m9.y;
public final class l implements y {
    public final WeakReference f4339a;
    public final k f4340b = new k(this);

    public l(i iVar) {
        this.f4339a = new WeakReference(iVar);
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.f4340b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f4339a.get();
        boolean cancel = this.f4340b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f4335a = null;
            iVar.f4336b = null;
            iVar.f4337c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f4340b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f4340b.f4332a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f4340b.isDone();
    }

    public final String toString() {
        return this.f4340b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f4340b.get(j3, timeUnit);
    }
}
