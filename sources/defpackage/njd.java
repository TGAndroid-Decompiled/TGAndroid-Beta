package defpackage;

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
public final class njd extends did implements NavigableMap, Map {
    public static final njd f;
    public final transient yld c;
    public final transient xhd d;
    public final transient njd e;

    static {
        yld E = vjd.E(cld.b);
        dgd dgdVar = xhd.n;
        f = new njd(E, old.w, null);
    }

    public njd(yld yldVar, xhd xhdVar, njd njdVar) {
        this.c = yldVar;
        this.d = xhdVar;
        this.e = njdVar;
    }

    public static njd c(TreeMap treeMap) {
        boolean z;
        cld cldVar = cld.b;
        Comparator comparator = treeMap.comparator();
        int i = 1;
        int i2 = 0;
        if (comparator != null && cldVar != comparator) {
            z = false;
        } else {
            z = true;
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
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(did.b);
        int length = entryArr.length;
        if (length != 0) {
            if (length != 1) {
                Object[] objArr = new Object[length];
                Object[] objArr2 = new Object[length];
                if (z) {
                    while (i2 < length) {
                        Map.Entry entry = entryArr[i2];
                        Objects.requireNonNull(entry);
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        r0f.a(key, value);
                        objArr[i2] = key;
                        objArr2[i2] = value;
                        i2++;
                    }
                } else {
                    Arrays.sort(entryArr, 0, length, new is6((byte) 15));
                    Map.Entry entry2 = entryArr[0];
                    Objects.requireNonNull(entry2);
                    Object key2 = entry2.getKey();
                    objArr[0] = key2;
                    Object value2 = entry2.getValue();
                    objArr2[0] = value2;
                    r0f.a(objArr[0], value2);
                    while (i < length) {
                        Map.Entry entry3 = entryArr[i - 1];
                        Objects.requireNonNull(entry3);
                        Map.Entry entry4 = entryArr[i];
                        Objects.requireNonNull(entry4);
                        Object key3 = entry4.getKey();
                        Object value3 = entry4.getValue();
                        r0f.a(key3, value3);
                        objArr[i] = key3;
                        objArr2[i] = value3;
                        if (cldVar.compare(key2, key3) != 0) {
                            i++;
                            key2 = key3;
                        } else {
                            w26.j(tb4.q("Multiple entries with same key: ", String.valueOf(entry3), " and ", String.valueOf(entry4)));
                            return null;
                        }
                    }
                }
                return new njd(new yld(xhd.A(length, objArr), cldVar), xhd.A(length, objArr2), null);
            }
            Map.Entry entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Object key4 = entry5.getKey();
            Object value4 = entry5.getValue();
            Object[] objArr3 = {key4};
            for (int i3 = 0; i3 < 1; i3++) {
                if (objArr3[i3] == null) {
                    fvc.f(de9.k(i3, "at index "));
                    return null;
                }
            }
            yld yldVar = new yld(xhd.A(1, objArr3), cldVar);
            Object[] objArr4 = {value4};
            while (i2 < 1) {
                if (objArr4[i2] != null) {
                    i2++;
                } else {
                    fvc.f(de9.k(i2, "at index "));
                    return null;
                }
            }
            return new njd(yldVar, xhd.A(1, objArr4), null);
        }
        return d(cldVar);
    }

    public static njd d(Comparator comparator) {
        if (cld.b != comparator) {
            yld E = vjd.E(comparator);
            dgd dgdVar = xhd.n;
            return new njd(E, old.w, null);
        }
        return f;
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
        return this.c.s;
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return this.c.descendingSet();
    }

    @Override
    public final NavigableMap descendingMap() {
        kld ofdVar;
        njd njdVar = this.e;
        if (njdVar == null) {
            boolean isEmpty = isEmpty();
            yld yldVar = this.c;
            if (isEmpty) {
                Comparator comparator = yldVar.s;
                if (comparator instanceof kld) {
                    ofdVar = (kld) comparator;
                } else {
                    ofdVar = new ofd(comparator);
                }
                return d(ofdVar.a());
            }
            return new njd((yld) yldVar.descendingSet(), this.d.y(), this);
        }
        return njdVar;
    }

    @Override
    public final njd headMap(Object obj, boolean z) {
        obj.getClass();
        return h(0, this.c.F(obj, z));
    }

    @Override
    public final njd subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.s.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        w26.j(l0f.a("expected fromKey <= toKey but %s > %s", obj, obj2));
        return null;
    }

    @Override
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().A().get(0);
    }

    @Override
    public final Object firstKey() {
        return this.c.first();
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

    @Override
    public final njd tailMap(Object obj, boolean z) {
        obj.getClass();
        return h(this.c.G(obj, z), this.d.size());
    }

    @Override
    public final java.lang.Object get(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njd.get(java.lang.Object):java.lang.Object");
    }

    public final njd h(int i, int i2) {
        xhd xhdVar = this.d;
        if (i == 0) {
            if (i2 != xhdVar.size()) {
                i = 0;
            } else {
                return this;
            }
        }
        yld yldVar = this.c;
        if (i == i2) {
            return d(yldVar.s);
        }
        return new njd(yldVar.H(i, i2), xhdVar.subList(i, i2), null);
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
        return this.c;
    }

    @Override
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().A().get(this.d.size() - 1);
    }

    @Override
    public final Object lastKey() {
        return this.c.last();
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
        return this.c;
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
