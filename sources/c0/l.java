package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import k9.y;
public final class l implements y {
    public final WeakReference f5913a;
    public final k f5914b = new k(this);

    public l(i iVar) {
        this.f5913a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f5914b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f5913a.get();
        boolean cancel = this.f5914b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f5909a = null;
            iVar.f5910b = null;
            iVar.f5911c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f5914b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f5914b.f5906a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f5914b.isDone();
    }

    public final String toString() {
        return this.f5914b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f5914b.get(j10, timeUnit);
    }
}
