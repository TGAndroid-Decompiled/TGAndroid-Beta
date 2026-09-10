package c0;

import i9.w;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
public final class k implements w {
    public final WeakReference f4057a;
    public final j f4058b = new j(this);

    public k(i iVar) {
        this.f4057a = new WeakReference(iVar);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f4058b.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.f4057a.get();
        boolean cancel = this.f4058b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.f4053a = null;
            iVar.f4054b = null;
            iVar.f4055c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f4058b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f4058b.f4050a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f4058b.isDone();
    }

    public final String toString() {
        return this.f4058b.toString();
    }

    @Override
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f4058b.get(j3, timeUnit);
    }
}
