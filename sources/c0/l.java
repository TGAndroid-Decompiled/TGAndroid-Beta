package c0;

import j9.y;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class l implements y {
    public final WeakReference f4106a;
    public final k f4107b = new k(this);

    public l(i iVar) {
        this.f4106a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f4107b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f4106a.get();
        boolean cancel = this.f4107b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f4102a = null;
            iVar.f4103b = null;
            iVar.f4104c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f4107b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f4107b.f4099a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f4107b.isDone();
    }

    public final String toString() {
        return this.f4107b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f4107b.get(j10, timeUnit);
    }
}
