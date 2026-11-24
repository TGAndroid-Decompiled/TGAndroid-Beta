package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
public final class g3 extends j3 implements NavigableSet {
    public final zi7 e;

    public g3(zi7 zi7Var, NavigableMap navigableMap) {
        super(zi7Var, navigableMap);
        this.e = zi7Var;
    }

    @Override
    public final Object ceiling(Object obj) {
        return h().ceilingKey(obj);
    }

    @Override
    public final Iterator descendingIterator() {
        return ((e3) descendingSet()).iterator();
    }

    @Override
    public final NavigableSet descendingSet() {
        return new g3(this.e, h().descendingMap());
    }

    @Override
    public final Object floor(Object obj) {
        return h().floorKey(obj);
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z) {
        return new g3(this.e, h().headMap(obj, z));
    }

    @Override
    public final Object higher(Object obj) {
        return h().higherKey(obj);
    }

    @Override
    public final NavigableMap h() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override
    public final Object lower(Object obj) {
        return h().lowerKey(obj);
    }

    @Override
    public final Object pollFirst() {
        c3 c3Var = (c3) iterator();
        if (c3Var.hasNext()) {
            Object next = c3Var.next();
            c3Var.remove();
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
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new g3(this.e, h().subMap(obj, z, obj2, z2));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new g3(this.e, h().tailMap(obj, z));
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
