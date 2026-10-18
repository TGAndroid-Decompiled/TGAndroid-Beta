package e9;

import j$.util.Map;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public abstract class q0 implements Map, Serializable, j$.util.Map {
    public transient y0 f8489a;
    public transient y0 f8490b;
    public transient i0 f8491c;

    public static q0 a(Map map) {
        int i10;
        if ((map instanceof q0) && !(map instanceof SortedMap)) {
            return (q0) map;
        }
        Set entrySet = map.entrySet();
        if (entrySet != null) {
            i10 = entrySet.size();
        } else {
            i10 = 4;
        }
        a5.a aVar = new a5.a(i10, 5);
        aVar.y(entrySet);
        return aVar.d(true);
    }

    public abstract z1 b();

    public abstract a2 c();

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

    public abstract i0 d();

    @Override
    public i0 values() {
        i0 i0Var = this.f8491c;
        if (i0Var == null) {
            i0 d = d();
            this.f8491c = d;
            return d;
        }
        return i0Var;
    }

    @Override
    public final Set entrySet() {
        y0 y0Var = this.f8489a;
        if (y0Var == null) {
            z1 b10 = b();
            this.f8489a = b10;
            return b10;
        }
        return y0Var;
    }

    @Override
    public final boolean equals(Object obj) {
        return s.i(this, obj);
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
        y0 y0Var = this.f8489a;
        if (y0Var == null) {
            y0Var = b();
            this.f8489a = y0Var;
        }
        return s.n(y0Var);
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
        y0 y0Var = this.f8490b;
        if (y0Var == null) {
            a2 c10 = c();
            this.f8490b = c10;
            return c10;
        }
        return y0Var;
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
        s.f(size, "size");
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
