package n7;

import j$.util.Map;
import java.io.Serializable;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public abstract class o implements Map, Serializable, j$.util.Map {
    public static final Map.Entry[] f13982b = new Map.Entry[0];
    public transient p f13983a;

    @Override
    public final p entrySet() {
        p pVar = this.f13983a;
        if (pVar == null) {
            s sVar = (s) this;
            if (sVar.isEmpty()) {
                pVar = z.f14011s;
            } else {
                pVar = new r(sVar);
            }
            this.f13983a = pVar;
        }
        return pVar;
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
        return ((s) this).d.contains(obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        return ((s) this).entrySet().equals(((java.util.Map) obj).entrySet());
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
        return a.b(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        if (((s) this).size() == 0) {
            return true;
        }
        return false;
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
        s sVar = (s) this;
        int size = sVar.size();
        if (size >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb2.append('{');
            boolean z10 = true;
            for (Map.Entry entry : sVar.entrySet()) {
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
        throw new IllegalArgumentException(hc.b.j(size, "size cannot be negative but was: "));
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
