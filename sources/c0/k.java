package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
public final class k implements v8.a {
    public final WeakReference f2021a;
    public final j f2022b = new j(this);

    public k(i iVar) {
        this.f2021a = new WeakReference(iVar);
    }

    @Override
    public final boolean cancel(boolean z4) {
        i iVar = (i) this.f2021a.get();
        boolean cancel = this.f2022b.cancel(z4);
        if (cancel && iVar != null) {
            iVar.f2017a = null;
            iVar.f2018b = null;
            iVar.f2019c.k(null);
        }
        return cancel;
    }

    @Override
    public final Object get() {
        return this.f2022b.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f2022b.f2014a instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f2022b.isDone();
    }

    public final String toString() {
        return this.f2022b.toString();
    }

    @Override
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f2022b.get(j10, timeUnit);
    }
}
