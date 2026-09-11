package e9;

import com.google.android.gms.internal.vision.e2;
import j$.util.Map;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public abstract class k0 implements Map, Serializable, j$.util.Map {
    public transient m0 f8966a;
    public transient m0 f8967b;
    public transient d0 f8968c;

    public static k0 a(Map map) {
        int i10;
        if ((map instanceof k0) && !(map instanceof SortedMap)) {
            return (k0) map;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet != null) {
            i10 = entrySet.size();
        } else {
            i10 = 4;
        }
        a5.a aVar = new a5.a(i10, 5);
        if (e2.u(entrySet)) {
            int size = (entrySet.size() + aVar.f285b) * 2;
            Object[] objArr = (Object[]) aVar.f286c;
            if (size > objArr.length) {
                aVar.f286c = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.h(objArr.length, size));
            }
        }
        for (Map.Entry entry : entrySet) {
            aVar.t(entry.getKey(), entry.getValue());
        }
        return aVar.c();
    }

    public abstract c1 b();

    public abstract d1 c();

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override
    public Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract d0 d();

    @Override
    public d0 values() {
        d0 d0Var = this.f8968c;
        if (d0Var == null) {
            d0 d = d();
            this.f8968c = d;
            return d;
        }
        return d0Var;
    }

    @Override
    public final Set entrySet() {
        m0 m0Var = this.f8966a;
        if (m0Var == null) {
            c1 b10 = b();
            this.f8966a = b10;
            return b10;
        }
        return m0Var;
    }

    @Override
    public final boolean equals(Object obj) {
        return q.h(this, obj);
    }

    @Override
    public void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override
    public abstract Object get(Object obj);

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override
    public final int hashCode() {
        m0 m0Var = this.f8966a;
        if (m0Var == null) {
            m0Var = b();
            this.f8966a = m0Var;
        }
        return q.m(m0Var);
    }

    @Override
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        m0 m0Var = this.f8967b;
        if (m0Var == null) {
            d1 c10 = c();
            this.f8967b = c10;
            return c10;
        }
        return m0Var;
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override
    public Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int size = size();
        q.e(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
