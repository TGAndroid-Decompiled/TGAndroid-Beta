package h9;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
public final class f extends i implements NavigableSet {
    public final l1 f14323e;

    public f(l1 l1Var, NavigableMap navigableMap) {
        super(l1Var, navigableMap);
        this.f14323e = l1Var;
    }

    @Override
    public final Object ceiling(Object obj) {
        return f().ceilingKey(obj);
    }

    @Override
    public final Iterator descendingIterator() {
        return ((d) descendingSet()).iterator();
    }

    @Override
    public final NavigableSet descendingSet() {
        return new f(this.f14323e, f().descendingMap());
    }

    @Override
    public final Object floor(Object obj) {
        return f().floorKey(obj);
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override
    public final Object higher(Object obj) {
        return f().higherKey(obj);
    }

    @Override
    public final NavigableMap f() {
        return (NavigableMap) ((SortedMap) this.f14311b);
    }

    @Override
    public final Object lower(Object obj) {
        return f().lowerKey(obj);
    }

    @Override
    public final Object pollFirst() {
        a8.d dVar = (a8.d) iterator();
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
    public final NavigableSet headSet(Object obj, boolean z9) {
        return new f(this.f14323e, f().headMap(obj, z9));
    }

    @Override
    public final NavigableSet subSet(Object obj, boolean z9, Object obj2, boolean z10) {
        return new f(this.f14323e, f().subMap(obj, z9, obj2, z10));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z9) {
        return new f(this.f14323e, f().tailMap(obj, z9));
    }
}
