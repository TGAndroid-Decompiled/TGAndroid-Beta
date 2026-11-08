package jb;

import gb.j1;
import java.util.concurrent.atomic.AtomicReference;
import zd.b0;
public final class p {
    public final j1 f16641a;
    public final m1.g f16642b;
    public final AtomicReference f16643c;

    public p(id.h backgroundDispatcher, j1 timeProvider, m1.g sessionConfigsDataStore) {
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f16641a = timeProvider;
        this.f16642b = sessionConfigsDataStore;
        this.f16643c = new AtomicReference();
        b0.q(b0.b(backgroundDispatcher), new n(this, null, 0));
    }

    public final i a() {
        AtomicReference atomicReference = this.f16643c;
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
        Long l10 = a().f16626e;
        Integer num = a().d;
        if (l10 != null && num != null && this.f16641a.a().f13713c - l10.longValue() < num.intValue()) {
            return false;
        }
        return true;
    }

    public final java.lang.Object c(jb.i r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: jb.p.c(jb.i, kd.c):java.lang.Object");
    }
}
