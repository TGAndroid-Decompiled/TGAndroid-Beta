package c0;

import i9.w;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class k implements w {
    public final WeakReference f3979a;
    public final j f3980b = new j(this);

    public k(i iVar) {
        this.f3979a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f3980b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f3979a.get();
        boolean cancel = this.f3980b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f3975a = null;
            iVar.f3976b = null;
            iVar.f3977c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f3980b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f3980b.f3972a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f3980b.isDone();
    }

    public final String toString() {
        return this.f3980b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f3980b.get(j3, timeUnit);
    }
}
