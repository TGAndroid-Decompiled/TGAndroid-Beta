package n1;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
public final class b {
    public final LinkedHashMap f17083a;
    public final AtomicBoolean f17084b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f17083a = linkedHashMap;
        this.f17084b = new AtomicBoolean(z10);
    }

    public final Object a(d key) {
        j.e(key, "key");
        return this.f17083a.get(key);
    }

    public final void b(d key, Object obj) {
        j.e(key, "key");
        AtomicBoolean atomicBoolean = this.f17084b;
        if (!atomicBoolean.get()) {
            LinkedHashMap linkedHashMap = this.f17083a;
            if (obj == null) {
                if (!atomicBoolean.get()) {
                    linkedHashMap.remove(key);
                    return;
                }
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            } else if (obj instanceof Set) {
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(rc.g.p((Iterable) obj));
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
            return j.a(this.f17083a, ((b) obj).f17083a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17083a.hashCode();
    }

    public final String toString() {
        return rc.g.h(this.f17083a.entrySet(), ",\n", "{\n", "\n}", a.f17082b, 24);
    }

    public b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}
