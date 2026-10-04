package c0;

import i9.w;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class k implements w {
    public final WeakReference f3929a;
    public final j f3930b = new j(this);

    public k(i iVar) {
        this.f3929a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f3930b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f3929a.get();
        boolean cancel = this.f3930b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f3925a = null;
            iVar.f3926b = null;
            iVar.f3927c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f3930b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f3930b.f3922a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f3930b.isDone();
    }

    public final String toString() {
        return this.f3930b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f3930b.get(j3, timeUnit);
    }
}
