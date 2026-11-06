package h9;

import a8.kb;
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
public final class e extends h implements NavigableMap {
    public final l1 f14316n;

    public e(l1 l1Var, NavigableMap navigableMap) {
        super(l1Var, navigableMap);
        this.f14316n = l1Var;
    }

    @Override
    public final SortedSet c() {
        return new f(this.f14316n, e());
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
        return new e(this.f14316n, e().descendingMap());
    }

    public final e0 f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection h = this.f14316n.h();
        h.addAll((Collection) entry.getValue());
        it.remove();
        return new e0(entry.getKey(), DesugarCollections.unmodifiableList((List) h));
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
        return (NavigableMap) ((SortedMap) this.f513b);
    }

    @Override
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
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
        return f(((c) entrySet()).iterator());
    }

    @Override
    public final Map.Entry pollLastEntry() {
        return f(((c) ((kb) descendingMap()).entrySet()).iterator());
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
    public final NavigableMap headMap(Object obj, boolean z9) {
        return new e(this.f14316n, e().headMap(obj, z9));
    }

    @Override
    public final NavigableMap subMap(Object obj, boolean z9, Object obj2, boolean z10) {
        return new e(this.f14316n, e().subMap(obj, z9, obj2, z10));
    }

    @Override
    public final NavigableMap tailMap(Object obj, boolean z9) {
        return new e(this.f14316n, e().tailMap(obj, z9));
    }
}
