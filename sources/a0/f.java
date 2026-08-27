package a0;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
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
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override
    public Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override
    public final Set entrySet() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this, 0);
        this.d = aVar2;
        return aVar2;
    }

    @Override
    public void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i10 = this.f28c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f28c;
    }

    @Override
    public final Set keySet() {
        c cVar = this.f11e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f11e = cVar2;
        return cVar2;
    }

    @Override
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public final void putAll(Map map) {
        int size = map.size() + this.f28c;
        int i10 = this.f28c;
        int[] iArr = this.f26a;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            kotlin.jvm.internal.j.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f26a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f27b, size * 2);
            kotlin.jvm.internal.j.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f27b = objArrCopyOf;
        }
        if (this.f28c != i10) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override
    public final Collection values() {
        e eVar = this.f12f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f12f = eVar2;
        return eVar2;
    }
}
