package h9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
public final class d2 extends c2 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f13666a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f13666a.iterator();
        it.getClass();
        g9.l lVar = this.f13667b;
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
        return new c2(((SortedSet) this.f13666a).headSet(obj), this.f13667b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f13666a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f13667b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new c2(((SortedSet) this.f13666a).subSet(obj, obj2), this.f13667b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new c2(((SortedSet) this.f13666a).tailSet(obj), this.f13667b);
    }
}
