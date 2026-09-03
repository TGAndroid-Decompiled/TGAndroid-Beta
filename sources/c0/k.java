package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
public final class k implements v8.a {
    public final WeakReference f1882a;
    public final j f1883b = new j(this);

    public k(i iVar) {
        this.f1882a = new WeakReference(iVar);
    }

    @Override
    public final boolean cancel(boolean z4) {
        i iVar = (i) this.f1882a.get();
        boolean cancel = this.f1883b.cancel(z4);
        if (cancel && iVar != null) {
            iVar.f1878a = null;
            iVar.f1879b = null;
            iVar.f1880c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f1883b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f1883b.f1875a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f1883b.isDone();
    }

    public final String toString() {
        return this.f1883b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f1883b.get(j10, timeUnit);
    }
}
