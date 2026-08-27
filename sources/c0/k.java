package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public final class k implements s8.a {

    public final WeakReference f2215a;

    public final j f2216b = new j(this);

    public k(i iVar) {
        this.f2215a = new WeakReference(iVar);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f2215a.get();
        boolean zCancel = this.f2216b.cancel(z10);
        if (zCancel && iVar != null) {
            iVar.f2211a = null;
            iVar.f2212b = null;
            iVar.f2213c.k(null);
        }
        return zCancel;
    }

    @Override
    public final Object get() {
        return this.f2216b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f2216b.f2208a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f2216b.isDone();
    }

    public final String toString() {
        return this.f2216b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f2216b.get(j10, timeUnit);
    }
}
