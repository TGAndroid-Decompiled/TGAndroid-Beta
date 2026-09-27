package c0;

import i9.w;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class k implements w {
    public final WeakReference f3637a;
    public final j f3638b = new j(this);

    public k(i iVar) {
        this.f3637a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f3638b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f3637a.get();
        boolean cancel = this.f3638b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f3633a = null;
            iVar.f3634b = null;
            iVar.f3635c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f3638b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f3638b.f3630a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f3638b.isDone();
    }

    public final String toString() {
        return this.f3638b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f3638b.get(j3, timeUnit);
    }
}
