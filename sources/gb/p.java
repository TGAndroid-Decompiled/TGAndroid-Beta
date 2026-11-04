package gb;

import db.i1;
import java.util.concurrent.atomic.AtomicReference;
import wd.b0;
public final class p {
    public final i1 f12236a;
    public final l1.g f12237b;
    public final AtomicReference f12238c;

    public p(fd.h backgroundDispatcher, i1 timeProvider, l1.g sessionConfigsDataStore) {
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f12236a = timeProvider;
        this.f12237b = sessionConfigsDataStore;
        this.f12238c = new AtomicReference();
        b0.q(b0.b(backgroundDispatcher), new n(this, null, 0));
    }

    public final i a() {
        AtomicReference atomicReference = this.f12238c;
        if (atomicReference.get() == null) {
            Object u10 = b0.u(new n(this, null, 1));
            while (!atomicReference.compareAndSet(null, u10) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        kotlin.jvm.internal.j.d(obj, "get(...)");
        return (i) obj;
    }

    public final boolean b() {
        Long l10 = a().f12221e;
        Integer num = a().d;
        if (l10 != null && num != null && this.f12236a.a().f8671c - l10.longValue() < num.intValue()) {
            return false;
        }
        return true;
    }

    public final java.lang.Object c(gb.i r6, hd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: gb.p.c(gb.i, hd.c):java.lang.Object");
    }
}
