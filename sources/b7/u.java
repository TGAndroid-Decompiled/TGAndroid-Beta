package b7;

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
import kh.a2;
public final class u extends p implements NavigableMap, Map {
    public static final u f1731f;
    public final transient c0 f1732c;
    public final transient o d;
    public final transient u e;

    static {
        c0 x10 = v.x(y.f1740b);
        k kVar = o.f1714b;
        f1731f = new u(x10, a0.e, null);
    }

    public u(c0 c0Var, o oVar, u uVar) {
        this.f1732c = c0Var;
        this.d = oVar;
        this.e = uVar;
    }

    public static u b(TreeMap treeMap) {
        boolean equals;
        y yVar = y.f1740b;
        Comparator comparator = treeMap.comparator();
        int i10 = 1;
        if (comparator == null) {
            equals = true;
        } else {
            equals = yVar.equals(comparator);
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
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(p.f1715b);
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
                        b.f(key, value);
                        objArr[i11] = key;
                        objArr2[i11] = value;
                        i11++;
                    }
                } else {
                    Arrays.sort(entryArr, 0, length, new r(0));
                    Map.Entry entry2 = entryArr[0];
                    Objects.requireNonNull(entry2);
                    Object key2 = entry2.getKey();
                    objArr[0] = key2;
                    Object value2 = entry2.getValue();
                    objArr2[0] = value2;
                    b.f(objArr[0], value2);
                    while (i10 < length) {
                        Map.Entry entry3 = entryArr[i10 - 1];
                        Objects.requireNonNull(entry3);
                        Map.Entry entry4 = entryArr[i10];
                        Objects.requireNonNull(entry4);
                        Object key3 = entry4.getKey();
                        Object value3 = entry4.getValue();
                        b.f(key3, value3);
                        objArr[i10] = key3;
                        objArr2[i10] = value3;
                        if (yVar.compare(key2, key3) != 0) {
                            i10++;
                            key2 = key3;
                        } else {
                            throw new IllegalArgumentException(e2.c.k("Multiple entries with same key: ", String.valueOf(entry3), " and ", String.valueOf(entry4)));
                        }
                    }
                }
                return new u(new c0(o.t(length, objArr), yVar), o.t(length, objArr2), null);
            }
            Map.Entry entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Object key4 = entry5.getKey();
            Object value4 = entry5.getValue();
            Object[] objArr3 = {key4};
            for (int i12 = 0; i12 < 1; i12++) {
                if (objArr3[i12] == null) {
                    throw new NullPointerException(a2.j(i12, "at index "));
                }
            }
            c0 c0Var = new c0(o.t(1, objArr3), yVar);
            Object[] objArr4 = {value4};
            while (i11 < 1) {
                if (objArr4[i11] != null) {
                    i11++;
                } else {
                    throw new NullPointerException(a2.j(i11, "at index "));
                }
            }
            return new u(c0Var, o.t(1, objArr4), null);
        }
        return c(yVar);
    }

    public static u c(Comparator comparator) {
        if (y.f1740b.equals(comparator)) {
            return f1731f;
        }
        c0 x10 = v.x(comparator);
        k kVar = o.f1714b;
        return new u(x10, a0.e, null);
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
        return this.f1732c.d;
    }

    @Override
    public final u headMap(Object obj, boolean z4) {
        obj.getClass();
        return g(0, this.f1732c.y(obj, z4));
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return this.f1732c.descendingSet();
    }

    @Override
    public final NavigableMap descendingMap() {
        z iVar;
        u uVar = this.e;
        if (uVar == null) {
            boolean isEmpty = isEmpty();
            c0 c0Var = this.f1732c;
            if (isEmpty) {
                Comparator comparator = c0Var.d;
                if (comparator instanceof z) {
                    iVar = (z) comparator;
                } else {
                    iVar = new i(comparator);
                }
                return c(iVar.a());
            }
            return new u((c0) c0Var.descendingSet(), this.d.r(), this);
        }
        return uVar;
    }

    @Override
    public final u subMap(Object obj, boolean z4, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.f1732c.d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z10).tailMap(obj, z4);
        }
        throw new IllegalArgumentException(b.d("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override
    public final u tailMap(Object obj, boolean z4) {
        obj.getClass();
        return g(this.f1732c.z(obj, z4), this.d.size());
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
        return this.f1732c.first();
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

    public final u g(int i10, int i11) {
        o oVar = this.d;
        if (i10 == 0) {
            if (i11 != oVar.size()) {
                i10 = 0;
            } else {
                return this;
            }
        }
        c0 c0Var = this.f1732c;
        if (i10 == i11) {
            return c(c0Var.d);
        }
        return new u(c0Var.A(i10, i11), oVar.subList(i10, i11), null);
    }

    @Override
    public final java.lang.Object get(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: b7.u.get(java.lang.Object):java.lang.Object");
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
        return this.f1732c;
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
        return this.f1732c.last();
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
        return this.f1732c;
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
