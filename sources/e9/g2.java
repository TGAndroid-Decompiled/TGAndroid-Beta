package e9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
public final class g2 extends AbstractSet {
    public final Set f8568a;
    public final Set f8569b;

    public g2(Set set, Set set2) {
        this.f8568a = set;
        this.f8569b = set2;
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
        if (this.f8568a.contains(obj) && this.f8569b.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (this.f8568a.containsAll(collection) && this.f8569b.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.f8569b, this.f8568a);
    }

    @Override
    public final Iterator iterator() {
        return new a1(this);
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
        for (Object obj : this.f8568a) {
            if (this.f8569b.contains(obj)) {
                i10++;
            }
        }
        return i10;
    }
}
