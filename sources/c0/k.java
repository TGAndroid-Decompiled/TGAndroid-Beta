package c0;

import i9.w;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class k implements w {
    public final WeakReference f3930a;
    public final j f3931b = new j(this);

    public k(i iVar) {
        this.f3930a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f3931b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f3930a.get();
        boolean cancel = this.f3931b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f3926a = null;
            iVar.f3927b = null;
            iVar.f3928c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f3931b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f3931b.f3923a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f3931b.isDone();
    }

    public final String toString() {
        return this.f3931b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f3931b.get(j3, timeUnit);
    }
}
