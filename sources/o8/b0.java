package o8;

import j$.util.Map;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public abstract class b0 implements Map, Serializable, j$.util.Map {
    public transient n0 f19028a;
    public transient o0 f19029b;
    public transient p0 f19030c;

    public static b0 a(Map map) {
        boolean z10;
        int i9;
        if ((map instanceof b0) && !(map instanceof SortedMap)) {
            return (b0) map;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i9 = entrySet.size();
        } else {
            i9 = 4;
        }
        a6.a aVar = new a6.a(i9, 17);
        if (z10) {
            int size = entrySet.size() * 2;
            Object[] objArr = (Object[]) aVar.f101b;
            if (size > objArr.length) {
                aVar.f101b = Arrays.copyOf(objArr, w.d(objArr.length, size));
            }
        }
        for (Map.Entry entry : entrySet) {
            aVar.j(entry.getKey(), entry.getValue());
        }
        return aVar.c();
    }

    @Override
    public final c0 entrySet() {
        n0 n0Var = this.f19028a;
        if (n0Var == null) {
            q0 q0Var = (q0) this;
            n0 n0Var2 = new n0(q0Var, q0Var.f19079e, q0Var.f19080f);
            this.f19028a = n0Var2;
            return n0Var2;
        }
        return n0Var;
    }

    @Override
    public final u values() {
        p0 p0Var = this.f19030c;
        if (p0Var == null) {
            q0 q0Var = (q0) this;
            p0 p0Var2 = new p0(1, q0Var.f19080f, q0Var.f19079e);
            this.f19030c = p0Var2;
            return p0Var2;
        }
        return p0Var;
    }

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

    @Override
    public final boolean equals(Object obj) {
        return l.c(this, obj);
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
        return l.h(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        if (((q0) this).size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        o0 o0Var = this.f19029b;
        if (o0Var == null) {
            q0 q0Var = (q0) this;
            o0 o0Var2 = new o0(q0Var, new p0(0, q0Var.f19080f, q0Var.f19079e));
            this.f19029b = o0Var2;
            return o0Var2;
        }
        return o0Var;
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
        int i9 = ((q0) this).f19080f;
        l.a(i9, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i9 * 8, 1073741824L));
        sb2.append('{');
        x0 w8 = ((n0) entrySet()).w();
        boolean z10 = true;
        while (true) {
            x xVar = (x) w8;
            if (xVar.hasNext()) {
                Map.Entry entry = (Map.Entry) xVar.next();
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z10 = false;
            } else {
                sb2.append('}');
                return sb2.toString();
            }
        }
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
