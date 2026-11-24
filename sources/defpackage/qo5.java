package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public abstract class qo5 implements Map, Serializable, j$.util.Map {
    public transient yo5 a;
    public transient yo5 b;
    public transient go5 c;

    public static qo5 b(Map map) {
        int i;
        if ((map instanceof qo5) && !(map instanceof SortedMap)) {
            return (qo5) map;
        }
        Set entrySet = map.entrySet();
        if (entrySet != null) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        kq kqVar = new kq(i);
        kqVar.x(entrySet);
        return kqVar.e(true);
    }

    public abstract a89 c();

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override
    public final Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
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

    public abstract b89 d();

    public go5 e() {
        throw new AssertionError("should never be called");
    }

    @Override
    public final Set entrySet() {
        yo5 yo5Var = this.a;
        if (yo5Var == null) {
            a89 c = c();
            this.a = c;
            return c;
        }
        return yo5Var;
    }

    @Override
    public final boolean equals(Object obj) {
        return fqe.b(this, obj);
    }

    @Override
    public go5 values() {
        go5 go5Var = this.c;
        if (go5Var == null) {
            go5 e = e();
            this.c = e;
            return e;
        }
        return go5Var;
    }

    @Override
    public final void forEach(BiConsumer biConsumer) {
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
        yo5 yo5Var = this.a;
        if (yo5Var == null) {
            yo5Var = c();
            this.a = yo5Var;
        }
        return bwe.c(yo5Var);
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
        yo5 yo5Var = this.b;
        if (yo5Var == null) {
            b89 d = d();
            this.b = d;
            return d;
        }
        return yo5Var;
    }

    @Override
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
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
    public final Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override
    public final void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int size = size();
        ntd.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }
}
