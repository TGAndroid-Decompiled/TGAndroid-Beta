package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
public final class k implements r8.a {
    public final WeakReference f2076a;
    public final j f2077b = new j(this);

    public k(i iVar) {
        this.f2076a = new WeakReference(iVar);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f2076a.get();
        boolean cancel = this.f2077b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f2072a = null;
            iVar.f2073b = null;
            iVar.f2074c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f2077b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f2077b.f2069a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f2077b.isDone();
    }

    public final String toString() {
        return this.f2077b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f2077b.get(j10, timeUnit);
    }
}
