package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
public final class ih7 {
    public final LinkedHashMap a;
    public final l69 b;

    public ih7(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new l69(z);
    }

    public final Map a() {
        ku7 ku7Var;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int b = qi6.b(al2.c(entrySet, 10));
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                ku7Var = new ku7(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                ku7Var = new ku7(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(ku7Var.a, ku7Var.b);
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (!((AtomicBoolean) this.b.b).get()) {
            return;
        }
        sc8.j("Do mutate preferences once returned to DataStore.");
    }

    public final void c(lg8 lg8Var, Object obj) {
        lg8Var.getClass();
        d(lg8Var, obj);
    }

    public final void d(lg8 lg8Var, Object obj) {
        lg8Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(lg8Var);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(yk2.m((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(lg8Var, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(lg8Var, Arrays.copyOf(bArr, bArr.length));
        } else {
            linkedHashMap.put(lg8Var, obj);
        }
    }

    public final boolean equals(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih7.equals(java.lang.Object):boolean");
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
        return yk2.f(this.a.entrySet(), ",\n", "{\n", "\n}", cb4.d, 24);
    }

    public ih7(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
