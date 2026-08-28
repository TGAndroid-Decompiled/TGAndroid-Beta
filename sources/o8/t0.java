package o8;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
public final class t0 extends AbstractSet {
    public final Set f19090a;
    public final Set f19091b;

    public t0(Set set, Set set2) {
        this.f19090a = set;
        this.f19091b = set2;
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
        if (this.f19090a.contains(obj) && this.f19091b.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (this.f19090a.containsAll(collection) && this.f19091b.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.f19091b, this.f19090a);
    }

    @Override
    public final Iterator iterator() {
        return new d0(this);
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
        int i9 = 0;
        for (Object obj : this.f19090a) {
            if (this.f19091b.contains(obj)) {
                i9++;
            }
        }
        return i9;
    }
}
