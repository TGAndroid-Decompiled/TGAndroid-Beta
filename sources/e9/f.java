package e9;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
public final class f extends i implements NavigableMap {
    public final v0 f8969n;

    public f(v0 v0Var, NavigableMap navigableMap) {
        super(v0Var, navigableMap);
        this.f8969n = v0Var;
    }

    @Override
    public final SortedSet b() {
        return new g(this.f8969n, d());
    }

    @Override
    public final SortedSet c() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = d().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override
    public final Object ceilingKey(Object obj) {
        return d().ceilingKey(obj);
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final NavigableMap descendingMap() {
        return new f(this.f8969n, d().descendingMap());
    }

    public final e0 e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection c10 = this.f8969n.c();
        c10.addAll((Collection) entry.getValue());
        it.remove();
        return new e0(entry.getKey(), DesugarCollections.unmodifiableList((List) c10));
    }

    @Override
    public final NavigableMap d() {
        return (NavigableMap) ((SortedMap) this.f8958b);
    }

    @Override
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = d().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = d().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override
    public final Object floorKey(Object obj) {
        return d().floorKey(obj);
    }

    @Override
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = d().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override
    public final Object higherKey(Object obj) {
        return d().higherKey(obj);
    }

    @Override
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = d().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = d().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override
    public final Object lowerKey(Object obj) {
        return d().lowerKey(obj);
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry pollFirstEntry() {
        return e(((b) entrySet()).iterator());
    }

    @Override
    public final Map.Entry pollLastEntry() {
        return e(((b) ((d) descendingMap()).entrySet()).iterator());
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
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new f(this.f8969n, d().headMap(obj, z10));
    }

    @Override
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new f(this.f8969n, d().subMap(obj, z10, obj2, z11));
    }

    @Override
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new f(this.f8969n, d().tailMap(obj, z10));
    }
}
