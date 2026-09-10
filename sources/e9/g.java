package e9;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
public final class g extends j implements NavigableSet {
    public final v0 e;

    public g(v0 v0Var, NavigableMap navigableMap) {
        super(v0Var, navigableMap);
        this.e = v0Var;
    }

    @Override
    public final Object ceiling(Object obj) {
        return i().ceilingKey(obj);
    }

    @Override
    public final Iterator descendingIterator() {
        return ((e) descendingSet()).iterator();
    }

    @Override
    public final NavigableSet descendingSet() {
        return new g(this.e, i().descendingMap());
    }

    @Override
    public final Object floor(Object obj) {
        return i().floorKey(obj);
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override
    public final Object higher(Object obj) {
        return i().higherKey(obj);
    }

    @Override
    public final Object lower(Object obj) {
        return i().lowerKey(obj);
    }

    @Override
    public final NavigableMap i() {
        return (NavigableMap) ((SortedMap) this.f7367b);
    }

    @Override
    public final Object pollFirst() {
        c cVar = (c) iterator();
        if (cVar.hasNext()) {
            Object next = cVar.next();
            cVar.remove();
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
        return new g(this.e, i().headMap(obj, z10));
    }

    @Override
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new g(this.e, i().subMap(obj, z10, obj2, z11));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new g(this.e, i().tailMap(obj, z10));
    }
}
