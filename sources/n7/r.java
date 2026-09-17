package n7;

import com.google.android.gms.internal.vision.e2;
import j$.util.Map;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
public final class r extends n implements NavigableMap, Map {
    public static final r f16675f;
    public final transient z f16676c;
    public final transient m d;
    public final transient r f16677e;

    static {
        z x10 = s.x(v.f16688b);
        i iVar = m.f16659b;
        f16675f = new r(x10, x.f16693e, null);
    }

    public r(z zVar, m mVar, r rVar) {
        this.f16676c = zVar;
        this.d = mVar;
        this.f16677e = rVar;
    }

    public static r b(TreeMap treeMap) {
        boolean equals;
        v vVar = v.f16688b;
        Comparator comparator = treeMap.comparator();
        int i10 = 1;
        if (comparator == null) {
            equals = true;
        } else {
            equals = vVar.equals(comparator);
        }
        Set entrySet = treeMap.entrySet();
        if (entrySet == null) {
            Iterator it = entrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            entrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(n.f16663b);
        int length = entryArr.length;
        if (length != 0) {
            int i11 = 0;
            if (length != 1) {
                Object[] objArr = new Object[length];
                Object[] objArr2 = new Object[length];
                if (equals) {
                    while (i11 < length) {
                        Map.Entry entry = entryArr[i11];
                        Objects.requireNonNull(entry);
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        a.f(key, value);
                        objArr[i11] = key;
                        objArr2[i11] = value;
                        i11++;
                    }
                } else {
                    Arrays.sort(entryArr, 0, length, new fb.i(2));
                    Map.Entry entry2 = entryArr[0];
                    Objects.requireNonNull(entry2);
                    Object key2 = entry2.getKey();
                    objArr[0] = key2;
                    Object value2 = entry2.getValue();
                    objArr2[0] = value2;
                    a.f(objArr[0], value2);
                    while (i10 < length) {
                        Map.Entry entry3 = entryArr[i10 - 1];
                        Objects.requireNonNull(entry3);
                        Map.Entry entry4 = entryArr[i10];
                        Objects.requireNonNull(entry4);
                        Object key3 = entry4.getKey();
                        Object value3 = entry4.getValue();
                        a.f(key3, value3);
                        objArr[i10] = key3;
                        objArr2[i10] = value3;
                        if (vVar.compare(key2, key3) != 0) {
                            i10++;
                            key2 = key3;
                        } else {
                            throw new IllegalArgumentException(e2.j("Multiple entries with same key: ", String.valueOf(entry3), " and ", String.valueOf(entry4)));
                        }
                    }
                }
                return new r(new z(m.t(length, objArr), vVar), m.t(length, objArr2), null);
            }
            Map.Entry entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Object key4 = entry5.getKey();
            Object value4 = entry5.getValue();
            Object[] objArr3 = {key4};
            for (int i12 = 0; i12 < 1; i12++) {
                if (objArr3[i12] == null) {
                    throw new NullPointerException(i2.g.i(i12, "at index "));
                }
            }
            z zVar = new z(m.t(1, objArr3), vVar);
            Object[] objArr4 = {value4};
            while (i11 < 1) {
                if (objArr4[i11] != null) {
                    i11++;
                } else {
                    throw new NullPointerException(i2.g.i(i11, "at index "));
                }
            }
            return new r(zVar, m.t(1, objArr4), null);
        }
        return c(vVar);
    }

    public static r c(Comparator comparator) {
        if (v.f16688b.equals(comparator)) {
            return f16675f;
        }
        z x10 = s.x(comparator);
        i iVar = m.f16659b;
        return new r(x10, x.f16693e, null);
    }

    @Override
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override
    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    @Override
    public final Comparator comparator() {
        return this.f16676c.d;
    }

    @Override
    public final r headMap(Object obj, boolean z10) {
        obj.getClass();
        return g(0, this.f16676c.y(obj, z10));
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return this.f16676c.descendingSet();
    }

    @Override
    public final NavigableMap descendingMap() {
        w gVar;
        r rVar = this.f16677e;
        if (rVar == null) {
            boolean isEmpty = isEmpty();
            z zVar = this.f16676c;
            if (isEmpty) {
                Comparator comparator = zVar.d;
                if (comparator instanceof w) {
                    gVar = (w) comparator;
                } else {
                    gVar = new g(comparator);
                }
                return c(gVar.a());
            }
            return new r((z) zVar.descendingSet(), this.d.r(), this);
        }
        return rVar;
    }

    @Override
    public final r subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.f16676c.d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z11).tailMap(obj, z10);
        }
        throw new IllegalArgumentException(a.c("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override
    public final r tailMap(Object obj, boolean z10) {
        obj.getClass();
        return g(this.f16676c.z(obj, z10), this.d.size());
    }

    @Override
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().t().get(0);
    }

    @Override
    public final Object firstKey() {
        return this.f16676c.first();
    }

    @Override
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override
    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    public final r g(int i10, int i11) {
        m mVar = this.d;
        if (i10 == 0) {
            if (i11 != mVar.size()) {
                i10 = 0;
            } else {
                return this;
            }
        }
        z zVar = this.f16676c;
        if (i10 == i11) {
            return c(zVar.d);
        }
        return new r(zVar.A(i10, i11), mVar.subList(i10, i11), null);
    }

    @Override
    public final java.lang.Object get(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: n7.r.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override
    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    @Override
    public final Set keySet() {
        return this.f16676c;
    }

    @Override
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().t().get(this.d.size() - 1);
    }

    @Override
    public final Object lastKey() {
        return this.f16676c.last();
    }

    @Override
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override
    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return this.f16676c;
    }

    @Override
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.d.size();
    }

    @Override
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override
    public final Collection values() {
        return this.d;
    }
}
