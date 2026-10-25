package n1;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
public final class b {
    public final LinkedHashMap f18573a;
    public final AtomicBoolean f18574b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f18573a = linkedHashMap;
        this.f18574b = new AtomicBoolean(z10);
    }

    public final Object a(d key) {
        i.e(key, "key");
        return this.f18573a.get(key);
    }

    public final void b(d key, Object obj) {
        i.e(key, "key");
        AtomicBoolean atomicBoolean = this.f18574b;
        if (!atomicBoolean.get()) {
            LinkedHashMap linkedHashMap = this.f18573a;
            if (obj == null) {
                if (!atomicBoolean.get()) {
                    linkedHashMap.remove(key);
                    return;
                }
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            } else if (obj instanceof Set) {
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(kd.g.p((Iterable) obj));
                i.d(unmodifiableSet, "unmodifiableSet(value.toSet())");
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
            return i.a(this.f18573a, ((b) obj).f18573a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18573a.hashCode();
    }

    public final String toString() {
        return kd.g.h(this.f18573a.entrySet(), ",\n", "{\n", "\n}", a.f18572b, 24);
    }

    public b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}
