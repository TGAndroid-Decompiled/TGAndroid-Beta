package g9;

import b8.kg;
import j$.util.Map;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public abstract class l0 implements Map, Serializable, j$.util.Map {
    public transient t0 f12096a;
    public transient t0 f12097b;
    public transient d0 f12098c;

    public static l0 b(Map map) {
        int i3;
        if ((map instanceof l0) && !(map instanceof SortedMap)) {
            return (l0) map;
        }
        Set entrySet = map.entrySet();
        if (entrySet != null) {
            i3 = entrySet.size();
        } else {
            i3 = 4;
        }
        kg kgVar = new kg(i3, 8);
        kgVar.x(entrySet);
        return kgVar.e(true);
    }

    public abstract u1 c();

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

    public abstract v1 d();

    public abstract d0 e();

    @Override
    public final Set entrySet() {
        t0 t0Var = this.f12096a;
        if (t0Var == null) {
            u1 c2 = c();
            this.f12096a = c2;
            return c2;
        }
        return t0Var;
    }

    @Override
    public final boolean equals(Object obj) {
        return o.j(this, obj);
    }

    @Override
    public d0 values() {
        d0 d0Var = this.f12098c;
        if (d0Var == null) {
            d0 e10 = e();
            this.f12098c = e10;
            return e10;
        }
        return d0Var;
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
        t0 t0Var = this.f12096a;
        if (t0Var == null) {
            t0Var = c();
            this.f12096a = t0Var;
        }
        return o.o(t0Var);
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
        t0 t0Var = this.f12097b;
        if (t0Var == null) {
            v1 d = d();
            this.f12097b = d;
            return d;
        }
        return t0Var;
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
        o.g(size, "size");
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
