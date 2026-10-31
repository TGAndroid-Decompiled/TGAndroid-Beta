package e9;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
public final class h extends k implements NavigableSet {
    public final p1 e;

    public h(p1 p1Var, NavigableMap navigableMap) {
        super(p1Var, navigableMap);
        this.e = p1Var;
    }

    @Override
    public final Object ceiling(Object obj) {
        return l().ceilingKey(obj);
    }

    @Override
    public final Iterator descendingIterator() {
        return ((f) descendingSet()).iterator();
    }

    @Override
    public final NavigableSet descendingSet() {
        return new h(this.e, l().descendingMap());
    }

    @Override
    public final Object floor(Object obj) {
        return l().floorKey(obj);
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override
    public final Object higher(Object obj) {
        return l().higherKey(obj);
    }

    @Override
    public final Object lower(Object obj) {
        return l().lowerKey(obj);
    }

    @Override
    public final NavigableMap l() {
        return (NavigableMap) ((SortedMap) this.f6357b);
    }

    @Override
    public final Object pollFirst() {
        d dVar = (d) iterator();
        if (dVar.hasNext()) {
            Object next = dVar.next();
            dVar.remove();
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
        return new h(this.e, l().headMap(obj, z10));
    }

    @Override
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new h(this.e, l().subMap(obj, z10, obj2, z11));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new h(this.e, l().tailMap(obj, z10));
    }
}
