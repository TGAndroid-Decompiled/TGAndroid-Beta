package defpackage;

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
public final class g3 extends j3 implements NavigableMap {
    public final fj7 n;

    public g3(fj7 fj7Var, NavigableMap navigableMap) {
        super(fj7Var, navigableMap);
        this.n = fj7Var;
    }

    @Override
    public final SortedSet c() {
        return new h3(this.n, e());
    }

    @Override
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = e().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return b(ceilingEntry);
    }

    @Override
    public final Object ceilingKey(Object obj) {
        return e().ceilingKey(obj);
    }

    @Override
    public final SortedSet d() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final NavigableMap descendingMap() {
        return new g3(this.n, e().descendingMap());
    }

    public final ko5 f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection m = this.n.m();
        m.addAll((Collection) entry.getValue());
        it.remove();
        return new ko5(entry.getKey(), DesugarCollections.unmodifiableList((List) m));
    }

    @Override
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = e().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return b(firstEntry);
    }

    @Override
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = e().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return b(floorEntry);
    }

    @Override
    public final Object floorKey(Object obj) {
        return e().floorKey(obj);
    }

    @Override
    public final NavigableMap e() {
        return (NavigableMap) ((SortedMap) this.d);
    }

    @Override
    public final NavigableMap headMap(Object obj, boolean z) {
        return new g3(this.n, e().headMap(obj, z));
    }

    @Override
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = e().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return b(higherEntry);
    }

    @Override
    public final Object higherKey(Object obj) {
        return e().higherKey(obj);
    }

    @Override
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = e().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return b(lastEntry);
    }

    @Override
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = e().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return b(lowerEntry);
    }

    @Override
    public final Object lowerKey(Object obj) {
        return e().lowerKey(obj);
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry pollFirstEntry() {
        return f(((c3) entrySet()).iterator());
    }

    @Override
    public final Map.Entry pollLastEntry() {
        return f(((c3) ((e3) descendingMap()).entrySet()).iterator());
    }

    @Override
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new g3(this.n, e().subMap(obj, z, obj2, z2));
    }

    @Override
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new g3(this.n, e().tailMap(obj, z));
    }

    @Override
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
