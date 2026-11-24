package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
public final class o9a extends n9a implements SortedSet {
    @Override
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override
    public final Object first() {
        Iterator it = this.a.iterator();
        it.getClass();
        di8 di8Var = this.b;
        di8Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (di8Var.apply(next)) {
                return next;
            }
        }
        u36.g();
        return null;
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return new n9a(((SortedSet) this.a).headSet(obj), this.b);
    }

    @Override
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            Object last = sortedSet.last();
            if (this.b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return new n9a(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return new n9a(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
