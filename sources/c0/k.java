package c0;

import i9.w;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class k implements w {
    public final WeakReference f4124a;
    public final j f4125b = new j(this);

    public k(i iVar) {
        this.f4124a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f4125b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f4124a.get();
        boolean cancel = this.f4125b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f4120a = null;
            iVar.f4121b = null;
            iVar.f4122c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f4125b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f4125b.f4117a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f4125b.isDone();
    }

    public final String toString() {
        return this.f4125b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f4125b.get(j3, timeUnit);
    }
}
