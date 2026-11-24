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
public final class pld extends ekd implements NavigableMap, Map {
    public static final pld f;
    public final transient aod c;
    public final transient yjd d;
    public final transient pld e;

    static {
        aod E = xld.E(end.b);
        eid eidVar = yjd.n;
        f = new pld(E, qnd.w, null);
    }

    public pld(aod aodVar, yjd yjdVar, pld pldVar) {
        this.c = aodVar;
        this.d = yjdVar;
        this.e = pldVar;
    }

    public static pld c(TreeMap treeMap) {
        boolean z;
        end endVar = end.b;
        Comparator comparator = treeMap.comparator();
        int i = 1;
        int i2 = 0;
        if (comparator != null && endVar != comparator) {
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
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(ekd.b);
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
                        t2f.a(key, value);
                        objArr[i2] = key;
                        objArr2[i2] = value;
                        i2++;
                    }
                } else {
                    Arrays.sort(entryArr, 0, length, new ju6((byte) 15));
                    Map.Entry entry2 = entryArr[0];
                    Objects.requireNonNull(entry2);
                    Object key2 = entry2.getKey();
                    objArr[0] = key2;
                    Object value2 = entry2.getValue();
                    objArr2[0] = value2;
                    t2f.a(objArr[0], value2);
                    while (i < length) {
                        Map.Entry entry3 = entryArr[i - 1];
                        Objects.requireNonNull(entry3);
                        Map.Entry entry4 = entryArr[i];
                        Objects.requireNonNull(entry4);
                        Object key3 = entry4.getKey();
                        Object value3 = entry4.getValue();
                        t2f.a(key3, value3);
                        objArr[i] = key3;
                        objArr2[i] = value3;
                        if (endVar.compare(key2, key3) != 0) {
                            i++;
                            key2 = key3;
                        } else {
                            u36.j(td4.r("Multiple entries with same key: ", String.valueOf(entry3), " and ", String.valueOf(entry4)));
                            return null;
                        }
                    }
                }
                return new pld(new aod(yjd.A(length, objArr), endVar), yjd.A(length, objArr2), null);
            }
            Map.Entry entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Object key4 = entry5.getKey();
            Object value4 = entry5.getValue();
            Object[] objArr3 = {key4};
            for (int i3 = 0; i3 < 1; i3++) {
                if (objArr3[i3] == null) {
                    gxc.d(hg9.j(i3, "at index "));
                    return null;
                }
            }
            aod aodVar = new aod(yjd.A(1, objArr3), endVar);
            Object[] objArr4 = {value4};
            while (i2 < 1) {
                if (objArr4[i2] != null) {
                    i2++;
                } else {
                    gxc.d(hg9.j(i2, "at index "));
                    return null;
                }
            }
            return new pld(aodVar, yjd.A(1, objArr4), null);
        }
        return d(endVar);
    }

    public static pld d(Comparator comparator) {
        if (end.b != comparator) {
            aod E = xld.E(comparator);
            eid eidVar = yjd.n;
            return new pld(E, qnd.w, null);
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
        mnd phdVar;
        pld pldVar = this.e;
        if (pldVar == null) {
            boolean isEmpty = isEmpty();
            aod aodVar = this.c;
            if (isEmpty) {
                Comparator comparator = aodVar.s;
                if (comparator instanceof mnd) {
                    phdVar = (mnd) comparator;
                } else {
                    phdVar = new phd(comparator);
                }
                return d(phdVar.a());
            }
            return new pld((aod) aodVar.descendingSet(), this.d.y(), this);
        }
        return pldVar;
    }

    @Override
    public final pld headMap(Object obj, boolean z) {
        obj.getClass();
        return h(0, this.c.F(obj, z));
    }

    @Override
    public final pld subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.s.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        u36.j(n2f.a("expected fromKey <= toKey but %s > %s", obj, obj2));
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
    public final pld tailMap(Object obj, boolean z) {
        obj.getClass();
        return h(this.c.G(obj, z), this.d.size());
    }

    @Override
    public final java.lang.Object get(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pld.get(java.lang.Object):java.lang.Object");
    }

    public final pld h(int i, int i2) {
        yjd yjdVar = this.d;
        if (i == 0) {
            if (i2 != yjdVar.size()) {
                i = 0;
            } else {
                return this;
            }
        }
        aod aodVar = this.c;
        if (i == i2) {
            return d(aodVar.s);
        }
        return new pld(aodVar.H(i, i2), yjdVar.subList(i, i2), null);
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
