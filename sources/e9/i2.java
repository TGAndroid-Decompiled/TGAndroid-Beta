package e9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
public final class i2 extends h2 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f6370a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f6370a.iterator();
        it.getClass();
        d9.l lVar = this.f6371b;
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
        return new h2(((SortedSet) this.f6370a).headSet(obj), this.f6371b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f6370a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f6371b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new h2(((SortedSet) this.f6370a).subSet(obj, obj2), this.f6371b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new h2(((SortedSet) this.f6370a).tailSet(obj), this.f6371b);
    }
}
