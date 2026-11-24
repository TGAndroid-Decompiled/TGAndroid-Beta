package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
public final class lj7 {
    public final LinkedHashMap a;
    public final ni6 b;

    public lj7(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new ni6(z);
    }

    public final Map a() {
        lw7 lw7Var;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int b = sk6.b(mm2.c(entrySet, 10));
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                lw7Var = new lw7(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                lw7Var = new lw7(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(lw7Var.a, lw7Var.b);
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (!((AtomicBoolean) this.b.b).get()) {
            return;
        }
        dq9.m("Do mutate preferences once returned to DataStore.");
    }

    public final void c(ni8 ni8Var, Object obj) {
        ni8Var.getClass();
        d(ni8Var, obj);
    }

    public final void d(ni8 ni8Var, Object obj) {
        ni8Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(ni8Var);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(km2.m((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(ni8Var, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(ni8Var, Arrays.copyOf(bArr, bArr.length));
        } else {
            linkedHashMap.put(ni8Var, obj);
        }
    }

    public final boolean equals(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    public final String toString() {
        return km2.f(this.a.entrySet(), ",\n", "{\n", "\n}", cd4.d, 24);
    }

    public lj7(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
