package jb;

import gb.h1;
import java.util.concurrent.atomic.AtomicReference;
import zd.b0;
public final class p {
    public final h1 f17379a;
    public final m1.g f17380b;
    public final AtomicReference f17381c;

    public p(id.h backgroundDispatcher, h1 timeProvider, m1.g sessionConfigsDataStore) {
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f17379a = timeProvider;
        this.f17380b = sessionConfigsDataStore;
        this.f17381c = new AtomicReference();
        b0.q(b0.b(backgroundDispatcher), new n(this, null, 0));
    }

    public final i a() {
        AtomicReference atomicReference = this.f17381c;
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
        Long l10 = a().f17364e;
        Integer num = a().d;
        if (l10 != null && num != null && this.f17379a.a().f13348c - l10.longValue() < num.intValue()) {
            return false;
        }
        return true;
    }

    public final java.lang.Object c(jb.i r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: jb.p.c(jb.i, kd.c):java.lang.Object");
    }
}
