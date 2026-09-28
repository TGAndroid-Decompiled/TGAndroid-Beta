package c0;

import i9.w;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class k implements w {
    public final WeakReference f3635a;
    public final j f3636b = new j(this);

    public k(i iVar) {
        this.f3635a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f3636b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f3635a.get();
        boolean cancel = this.f3636b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f3631a = null;
            iVar.f3632b = null;
            iVar.f3633c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f3636b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f3636b.f3628a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f3636b.isDone();
    }

    public final String toString() {
        return this.f3636b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f3636b.get(j3, timeUnit);
    }
}
