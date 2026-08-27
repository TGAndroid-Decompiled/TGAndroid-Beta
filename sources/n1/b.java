package n1;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;

public final class b {

    public final LinkedHashMap f18082a;

    public final AtomicBoolean f18083b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f18082a = linkedHashMap;
        this.f18083b = new AtomicBoolean(z10);
    }

    public final Object a(e key) {
        j.e(key, "key");
        return this.f18082a.get(key);
    }

    public final void b(e key, Object obj) {
        j.e(key, "key");
        AtomicBoolean atomicBoolean = this.f18083b;
        if (atomicBoolean.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        LinkedHashMap linkedHashMap = this.f18082a;
        if (obj == null) {
            if (atomicBoolean.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            linkedHashMap.remove(key);
        } else {
            if (!(obj instanceof Set)) {
                linkedHashMap.put(key, obj);
                return;
            }
            Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(qc.g.p((Iterable) obj));
            j.d(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return j.a(this.f18082a, ((b) obj).f18082a);
    }

    public final int hashCode() {
        return this.f18082a.hashCode();
    }

    public final String toString() {
        return qc.g.h(this.f18082a.entrySet(), ",\n", "{\n", "\n}", a.f18081b, 24);
    }

    public b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}
