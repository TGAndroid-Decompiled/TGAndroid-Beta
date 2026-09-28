package e9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
public final class k1 extends j1 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f8072a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f8072a.iterator();
        it.getClass();
        d9.f fVar = this.f8073b;
        fVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (fVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return new j1(((SortedSet) this.f8072a).headSet(obj), this.f8073b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f8072a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f8073b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new j1(((SortedSet) this.f8072a).subSet(obj, obj2), this.f8073b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new j1(((SortedSet) this.f8072a).tailSet(obj), this.f8073b);
    }
}
