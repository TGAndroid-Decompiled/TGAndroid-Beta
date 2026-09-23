package n1;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
public final class b {
    public final LinkedHashMap f14830a;
    public final AtomicBoolean f14831b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f14830a = linkedHashMap;
        this.f14831b = new AtomicBoolean(z10);
    }

    public final Object a(d key) {
        i.e(key, "key");
        return this.f14830a.get(key);
    }

    public final void b(d key, Object obj) {
        i.e(key, "key");
        AtomicBoolean atomicBoolean = this.f14831b;
        if (!atomicBoolean.get()) {
            LinkedHashMap linkedHashMap = this.f14830a;
            if (obj == null) {
                if (!atomicBoolean.get()) {
                    linkedHashMap.remove(key);
                    return;
                }
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            } else if (obj instanceof Set) {
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(hd.g.p((Iterable) obj));
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
            return i.a(this.f14830a, ((b) obj).f14830a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14830a.hashCode();
    }

    public final String toString() {
        return hd.g.h(this.f14830a.entrySet(), ",\n", "{\n", "\n}", a.f14829b, 24);
    }

    public b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}
