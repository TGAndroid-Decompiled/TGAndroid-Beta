package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
public final class k implements t8.a {
    public final WeakReference f2745a;
    public final j f2746b = new j(this);

    public k(i iVar) {
        this.f2745a = new WeakReference(iVar);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f2745a.get();
        boolean cancel = this.f2746b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f2741a = null;
            iVar.f2742b = null;
            iVar.f2743c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f2746b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f2746b.f2738a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f2746b.isDone();
    }

    public final String toString() {
        return this.f2746b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f2746b.get(j10, timeUnit);
    }
}
