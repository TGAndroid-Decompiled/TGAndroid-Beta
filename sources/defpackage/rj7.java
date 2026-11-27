package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
public final class rj7 {
    public final LinkedHashMap a;
    public final ri6 b;

    public rj7(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new ri6(z);
    }

    public final Map a() {
        rx7 rx7Var;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int b = uk6.b(ul2.c(entrySet, 10));
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                rx7Var = new rx7(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                rx7Var = new rx7(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(rx7Var.a, rx7Var.b);
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (!((AtomicBoolean) this.b.b).get()) {
            return;
        }
        grb.i("Do mutate preferences once returned to DataStore.");
    }

    public final void c(zj8 zj8Var, Object obj) {
        zj8Var.getClass();
        d(zj8Var, obj);
    }

    public final void d(zj8 zj8Var, Object obj) {
        zj8Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(zj8Var);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(sl2.m((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(zj8Var, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(zj8Var, Arrays.copyOf(bArr, bArr.length));
        } else {
            linkedHashMap.put(zj8Var, obj);
        }
    }

    public final boolean equals(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj7.equals(java.lang.Object):boolean");
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
        return sl2.f(this.a.entrySet(), ",\n", "{\n", "\n}", zc4.d, 24);
    }

    public rj7(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
