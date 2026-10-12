package c0;

import i9.w;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class k implements w {
    public final WeakReference f3978a;
    public final j f3979b = new j(this);

    public k(i iVar) {
        this.f3978a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f3979b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f3978a.get();
        boolean cancel = this.f3979b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f3974a = null;
            iVar.f3975b = null;
            iVar.f3976c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f3979b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f3979b.f3971a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f3979b.isDone();
    }

    public final String toString() {
        return this.f3979b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f3979b.get(j3, timeUnit);
    }
}
