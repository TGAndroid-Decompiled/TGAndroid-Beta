package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
public final class k implements v8.a {
    public final WeakReference f1860a;
    public final j f1861b = new j(this);

    public k(i iVar) {
        this.f1860a = new WeakReference(iVar);
    }

    @Override
    public final boolean cancel(boolean z4) {
        i iVar = (i) this.f1860a.get();
        boolean cancel = this.f1861b.cancel(z4);
        if (cancel && iVar != null) {
            iVar.f1856a = null;
            iVar.f1857b = null;
            iVar.f1858c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f1861b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f1861b.f1853a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f1861b.isDone();
    }

    public final String toString() {
        return this.f1861b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f1861b.get(j10, timeUnit);
    }
}
