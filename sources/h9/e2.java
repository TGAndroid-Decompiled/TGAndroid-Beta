package h9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
public final class e2 extends d2 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f13983a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f13983a.iterator();
        it.getClass();
        g9.l lVar = this.f13984b;
        lVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (lVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return new d2(((SortedSet) this.f13983a).headSet(obj), this.f13984b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f13983a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f13984b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new d2(((SortedSet) this.f13983a).subSet(obj, obj2), this.f13984b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new d2(((SortedSet) this.f13983a).tailSet(obj), this.f13984b);
    }
}
