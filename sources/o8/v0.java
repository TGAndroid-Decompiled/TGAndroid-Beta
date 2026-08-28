package o8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
public final class v0 extends u0 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f19093a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f19093a.iterator();
        it.getClass();
        n8.f fVar = this.f19094b;
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
        return new u0(((SortedSet) this.f19093a).headSet(obj), this.f19094b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f19093a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f19094b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new u0(((SortedSet) this.f19093a).subSet(obj, obj2), this.f19094b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new u0(((SortedSet) this.f19093a).tailSet(obj), this.f19094b);
    }
}
