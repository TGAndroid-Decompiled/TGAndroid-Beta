package e9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
public final class k1 extends j1 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f8089a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f8089a.iterator();
        it.getClass();
        d9.g gVar = this.f8090b;
        gVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (gVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return new j1(((SortedSet) this.f8089a).headSet(obj), this.f8090b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f8089a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f8090b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new j1(((SortedSet) this.f8089a).subSet(obj, obj2), this.f8090b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new j1(((SortedSet) this.f8089a).tailSet(obj), this.f8090b);
    }
}
