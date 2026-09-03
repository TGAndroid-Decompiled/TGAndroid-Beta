package n1;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
public final class b {
    public final LinkedHashMap f14196a;
    public final AtomicBoolean f14197b;

    public b(LinkedHashMap linkedHashMap, boolean z4) {
        this.f14196a = linkedHashMap;
        this.f14197b = new AtomicBoolean(z4);
    }

    public final Object a(d key) {
        j.e(key, "key");
        return this.f14196a.get(key);
    }

    public final void b(d key, Object obj) {
        j.e(key, "key");
        AtomicBoolean atomicBoolean = this.f14197b;
        if (!atomicBoolean.get()) {
            LinkedHashMap linkedHashMap = this.f14196a;
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
            return j.a(this.f14196a, ((b) obj).f14196a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14196a.hashCode();
    }

    public final String toString() {
        return tc.g.h(this.f14196a.entrySet(), ",\n", "{\n", "\n}", a.f14195b, 24);
    }

    public b(boolean z4) {
        this(new LinkedHashMap(), z4);
    }
}
