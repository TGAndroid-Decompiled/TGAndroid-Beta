package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m9.y;
public final class l implements y {
    public final WeakReference f4066a;
    public final k f4067b = new k(this);

    public l(i iVar) {
        this.f4066a = new WeakReference(iVar);
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.f4067b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f4066a.get();
        boolean cancel = this.f4067b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f4062a = null;
            iVar.f4063b = null;
            iVar.f4064c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f4067b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f4067b.f4059a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f4067b.isDone();
    }

    public final String toString() {
        return this.f4067b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f4067b.get(j3, timeUnit);
    }
}
