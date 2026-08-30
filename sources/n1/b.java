package n1;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
public final class b {
    public final LinkedHashMap f14208a;
    public final AtomicBoolean f14209b;

    public b(LinkedHashMap linkedHashMap, boolean z4) {
        this.f14208a = linkedHashMap;
        this.f14209b = new AtomicBoolean(z4);
    }

    public final Object a(d key) {
        j.e(key, "key");
        return this.f14208a.get(key);
    }

    public final void b(d key, Object obj) {
        j.e(key, "key");
        AtomicBoolean atomicBoolean = this.f14209b;
        if (!atomicBoolean.get()) {
            LinkedHashMap linkedHashMap = this.f14208a;
            if (obj == null) {
                if (!atomicBoolean.get()) {
                    linkedHashMap.remove(key);
                    return;
                }
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            } else if (obj instanceof Set) {
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(tc.g.p((Iterable) obj));
                j.d(unmodifiableSet, "unmodifiableSet(value.toSet())");
                linkedHashMap.put(key, unmodifiableSet);
                return;
            } else {
                linkedHashMap.put(key, obj);
                return;
            }
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return j.a(this.f14208a, ((b) obj).f14208a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14208a.hashCode();
    }

    public final String toString() {
        return tc.g.h(this.f14208a.entrySet(), ",\n", "{\n", "\n}", a.f14207b, 24);
    }

    public b(boolean z4) {
        this(new LinkedHashMap(), z4);
    }
}
