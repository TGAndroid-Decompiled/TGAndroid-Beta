package g9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
public final class b2 extends AbstractSet {
    public final Set f12057a;
    public final Set f12058b;

    public b2(Set set, Set set2) {
        this.f12057a = set;
        this.f12058b = set2;
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
        if (this.f12057a.contains(obj) && this.f12058b.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (this.f12057a.containsAll(collection) && this.f12058b.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.f12058b, this.f12057a);
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
        int i3 = 0;
        for (Object obj : this.f12057a) {
            if (this.f12058b.contains(obj)) {
                i3++;
            }
        }
        return i3;
    }
}
