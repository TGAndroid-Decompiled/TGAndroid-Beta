package defpackage;

import j$.util.Map;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public final class qt extends cka implements Map, j$.util.Map {
    public mt d;
    public ot e;
    public kt f;

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
    public final Set entrySet() {
        mt mtVar = this.d;
        if (mtVar == null) {
            mt mtVar2 = new mt(this, (byte) 0);
            this.d = mtVar2;
            return mtVar2;
        }
        return mtVar;
    }

    @Override
    public final void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final boolean j(Collection collection) {
        for (Object obj : collection) {
            if (!super.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.c;
        for (Object obj : collection) {
            super.remove(obj);
        }
        if (i != this.c) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        ot otVar = this.e;
        if (otVar == null) {
            ot otVar2 = new ot(this);
            this.e = otVar2;
            return otVar2;
        }
        return otVar;
    }

    @Override
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override
    public final void putAll(java.util.Map map) {
        int size = map.size() + this.c;
        int i = this.c;
        int[] iArr = this.a;
        if (iArr.length < size) {
            this.a = Arrays.copyOf(iArr, size);
            this.b = Arrays.copyOf(this.b, size << 1);
        }
        if (this.c == i) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        zg.b();
    }

    @Override
    public final void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override
    public final Collection values() {
        kt ktVar = this.f;
        if (ktVar == null) {
            kt ktVar2 = new kt(this);
            this.f = ktVar2;
            return ktVar2;
        }
        return ktVar;
    }
}
