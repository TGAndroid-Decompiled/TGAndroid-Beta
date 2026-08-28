package a0;

import j$.util.Map;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public final class f extends k implements Map, j$.util.Map {
    public a d;
    public c f11e;
    public e f12f;

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
    public final Set entrySet() {
        a aVar = this.d;
        if (aVar == null) {
            a aVar2 = new a(this, 0);
            this.d = aVar2;
            return aVar2;
        }
        return aVar;
    }

    @Override
    public void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final boolean i(Collection collection) {
        for (Object obj : collection) {
            if (!super.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i9 = this.f28c;
        for (Object obj : collection) {
            super.remove(obj);
        }
        if (i9 != this.f28c) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        c cVar = this.f11e;
        if (cVar == null) {
            c cVar2 = new c(this);
            this.f11e = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public final void putAll(java.util.Map map) {
        int size = map.size() + this.f28c;
        int i9 = this.f28c;
        int[] iArr = this.f26a;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            this.f26a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f27b, size * 2);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(this, newSize)");
            this.f27b = copyOf2;
        }
        if (this.f28c == i9) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override
    public final Collection values() {
        e eVar = this.f12f;
        if (eVar == null) {
            e eVar2 = new e(this);
            this.f12f = eVar2;
            return eVar2;
        }
        return eVar;
    }
}
