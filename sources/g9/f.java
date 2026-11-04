package g9;

import b8.ra;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
public final class f extends i implements NavigableSet {
    public final k1 f12075e;

    public f(k1 k1Var, NavigableMap navigableMap) {
        super(k1Var, navigableMap);
        this.f12075e = k1Var;
    }

    @Override
    public final Object ceiling(Object obj) {
        return h().ceilingKey(obj);
    }

    @Override
    public final Iterator descendingIterator() {
        return ((d) descendingSet()).iterator();
    }

    @Override
    public final NavigableSet descendingSet() {
        return new f(this.f12075e, h().descendingMap());
    }

    @Override
    public final Object floor(Object obj) {
        return h().floorKey(obj);
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override
    public final Object higher(Object obj) {
        return h().higherKey(obj);
    }

    @Override
    public final NavigableMap h() {
        return (NavigableMap) ((SortedMap) this.f12065b);
    }

    @Override
    public final Object lower(Object obj) {
        return h().lowerKey(obj);
    }

    @Override
    public final Object pollFirst() {
        ra raVar = (ra) iterator();
        if (raVar.hasNext()) {
            Object next = raVar.next();
            raVar.remove();
            return next;
        }
        return null;
    }

    @Override
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new f(this.f12075e, h().headMap(obj, z10));
    }

    @Override
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new f(this.f12075e, h().subMap(obj, z10, obj2, z11));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new f(this.f12075e, h().tailMap(obj, z10));
    }
}
