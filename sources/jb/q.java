package jb;

import gb.i1;
import java.util.concurrent.atomic.AtomicReference;
import zd.b0;
public final class q {
    public final i1 f17473a;
    public final m1.g f17474b;
    public final AtomicReference f17475c;

    public q(id.h backgroundDispatcher, i1 timeProvider, m1.g sessionConfigsDataStore) {
        kotlin.jvm.internal.j.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f17473a = timeProvider;
        this.f17474b = sessionConfigsDataStore;
        this.f17475c = new AtomicReference();
        b0.q(b0.b(backgroundDispatcher), new o(this, null, 0));
    }

    public final i a() {
        AtomicReference atomicReference = this.f17475c;
        if (atomicReference.get() == null) {
            Object u10 = b0.u(new o(this, null, 1));
            while (!atomicReference.compareAndSet(null, u10) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        kotlin.jvm.internal.j.d(obj, "get(...)");
        return (i) obj;
    }

    public final boolean b() {
        Long l10 = a().f17455e;
        Integer num = a().d;
        if (l10 != null && num != null && this.f17473a.a().f13348c - l10.longValue() < num.intValue()) {
            return false;
        }
        return true;
    }

    public final java.lang.Object c(jb.i r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: jb.q.c(jb.i, kd.c):java.lang.Object");
    }
}
