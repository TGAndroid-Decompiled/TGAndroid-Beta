package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l9.y;
public final class l implements y {
    public final WeakReference f3956a;
    public final k f3957b = new k(this);

    public l(i iVar) {
        this.f3956a = new WeakReference(iVar);
    }

    @Override
    public final void b(Runnable runnable, Executor executor) {
        this.f3957b.b(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f3956a.get();
        boolean cancel = this.f3957b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f3952a = null;
            iVar.f3953b = null;
            iVar.f3954c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f3957b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f3957b.f3949a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f3957b.isDone();
    }

    public final String toString() {
        return this.f3957b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f3957b.get(j10, timeUnit);
    }
}
