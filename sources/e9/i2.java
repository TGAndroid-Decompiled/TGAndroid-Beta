package e9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
public final class i2 extends h2 implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.f8572a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.f8572a.iterator();
        it.getClass();
        d9.m mVar = this.f8573b;
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
        return new h2(((SortedSet) this.f8572a).headSet(obj), this.f8573b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f8572a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f8573b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new h2(((SortedSet) this.f8572a).subSet(obj, obj2), this.f8573b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new h2(((SortedSet) this.f8572a).tailSet(obj), this.f8573b);
    }
}
