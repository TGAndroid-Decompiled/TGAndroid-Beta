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
public final class s extends o implements NavigableMap, Map {
    public static final s f13994f;
    public final transient a0 f13995c;
    public final transient n d;
    public final transient s e;

    static {
        a0 x10 = t.x(w.f14004b);
        j jVar = n.f13978b;
        f13994f = new s(x10, y.e, null);
    }

    public s(a0 a0Var, n nVar, s sVar) {
        this.f13995c = a0Var;
        this.d = nVar;
        this.e = sVar;
    }

    public static s b(TreeMap treeMap) {
        boolean equals;
        w wVar = w.f14004b;
        Comparator comparator = treeMap.comparator();
        int i10 = 1;
        if (comparator == null) {
            equals = true;
        } else {
            equals = wVar.equals(comparator);
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
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(o.f13982b);
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
                        if (wVar.compare(key2, key3) != 0) {
                            i10++;
                            key2 = key3;
                        } else {
                            throw new IllegalArgumentException(e2.i("Multiple entries with same key: ", String.valueOf(entry3), " and ", String.valueOf(entry4)));
                        }
                    }
                }
                return new s(new a0(n.t(length, objArr), wVar), n.t(length, objArr2), null);
            }
            Map.Entry entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Object key4 = entry5.getKey();
            Object value4 = entry5.getValue();
            Object[] objArr3 = {key4};
            for (int i12 = 0; i12 < 1; i12++) {
                if (objArr3[i12] == null) {
                    throw new NullPointerException(hc.b.j(i12, "at index "));
                }
            }
            a0 a0Var = new a0(n.t(1, objArr3), wVar);
            Object[] objArr4 = {value4};
            while (i11 < 1) {
                if (objArr4[i11] != null) {
                    i11++;
                } else {
                    throw new NullPointerException(hc.b.j(i11, "at index "));
                }
            }
            return new s(a0Var, n.t(1, objArr4), null);
        }
        return c(wVar);
    }

    public static s c(Comparator comparator) {
        if (w.f14004b.equals(comparator)) {
            return f13994f;
        }
        a0 x10 = t.x(comparator);
        j jVar = n.f13978b;
        return new s(x10, y.e, null);
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
        return this.f13995c.d;
    }

    @Override
    public final s headMap(Object obj, boolean z10) {
        obj.getClass();
        return g(0, this.f13995c.y(obj, z10));
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return this.f13995c.descendingSet();
    }

    @Override
    public final NavigableMap descendingMap() {
        x hVar;
        s sVar = this.e;
        if (sVar == null) {
            boolean isEmpty = isEmpty();
            a0 a0Var = this.f13995c;
            if (isEmpty) {
                Comparator comparator = a0Var.d;
                if (comparator instanceof x) {
                    hVar = (x) comparator;
                } else {
                    hVar = new h(comparator);
                }
                return c(hVar.a());
            }
            return new s((a0) a0Var.descendingSet(), this.d.r(), this);
        }
        return sVar;
    }

    @Override
    public final s subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.f13995c.d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z11).tailMap(obj, z10);
        }
        throw new IllegalArgumentException(a.c("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override
    public final s tailMap(Object obj, boolean z10) {
        obj.getClass();
        return g(this.f13995c.z(obj, z10), this.d.size());
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
        return this.f13995c.first();
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

    public final s g(int i10, int i11) {
        n nVar = this.d;
        if (i10 == 0) {
            if (i11 != nVar.size()) {
                i10 = 0;
            } else {
                return this;
            }
        }
        a0 a0Var = this.f13995c;
        if (i10 == i11) {
            return c(a0Var.d);
        }
        return new s(a0Var.A(i10, i11), nVar.subList(i10, i11), null);
    }

    @Override
    public final java.lang.Object get(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: n7.s.get(java.lang.Object):java.lang.Object");
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
        return this.f13995c;
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
        return this.f13995c.last();
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
        return this.f13995c;
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
