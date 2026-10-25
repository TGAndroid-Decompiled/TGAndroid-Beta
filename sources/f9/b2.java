package f9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
public final class b2 extends AbstractSet {
    public final Set f10263a;
    public final Set f10264b;

    public b2(Set set, Set set2) {
        this.f10263a = set;
        this.f10264b = set2;
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f10263a.contains(obj) && this.f10264b.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (this.f10263a.containsAll(collection) && this.f10264b.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.f10264b, this.f10263a);
    }

    @Override
    public final Iterator iterator() {
        return new v0(this);
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        int i10 = 0;
        for (Object obj : this.f10263a) {
            if (this.f10264b.contains(obj)) {
                i10++;
            }
        }
        return i10;
    }
}
