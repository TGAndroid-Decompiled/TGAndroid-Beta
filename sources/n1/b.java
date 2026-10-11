package n1;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
public final class b {
    public final LinkedHashMap f16512a;
    public final AtomicBoolean f16513b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f16512a = linkedHashMap;
        this.f16513b = new AtomicBoolean(z10);
    }

    public final Object a(d key) {
        i.e(key, "key");
        return this.f16512a.get(key);
    }

    public final void b(d key, Object obj) {
        i.e(key, "key");
        AtomicBoolean atomicBoolean = this.f16513b;
        if (!atomicBoolean.get()) {
            LinkedHashMap linkedHashMap = this.f16512a;
            if (obj == null) {
                if (!atomicBoolean.get()) {
                    linkedHashMap.remove(key);
                    return;
                }
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            } else if (obj instanceof Set) {
                Set unmodifiableSet = DesugarCollections.unmodifiableSet(id.g.p((Iterable) obj));
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
            return i.a(this.f16512a, ((b) obj).f16512a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16512a.hashCode();
    }

    public final String toString() {
        return id.g.h(this.f16512a.entrySet(), ",\n", "{\n", "\n}", a.f16511b, 24);
    }

    public b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}
