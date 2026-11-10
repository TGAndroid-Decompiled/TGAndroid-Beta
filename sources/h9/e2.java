package h9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
public final class e2 extends d2 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f14316a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f14316a.iterator();
        it.getClass();
        g9.m mVar = this.f14317b;
        mVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (mVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return new d2(((SortedSet) this.f14316a).headSet(obj), this.f14317b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f14316a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f14317b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new d2(((SortedSet) this.f14316a).subSet(obj, obj2), this.f14317b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new d2(((SortedSet) this.f14316a).tailSet(obj), this.f14317b);
    }
}
