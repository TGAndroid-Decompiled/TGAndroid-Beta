package h9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
public final class c2 extends AbstractSet {
    public final Set f13981a;
    public final Set f13982b;

    public c2(Set set, Set set2) {
        this.f13981a = set;
        this.f13982b = set2;
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
        if (this.f13981a.contains(obj) && this.f13982b.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (this.f13981a.containsAll(collection) && this.f13982b.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.f13982b, this.f13981a);
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
        int i7 = 0;
        for (Object obj : this.f13981a) {
            if (this.f13982b.contains(obj)) {
                i7++;
            }
        }
        return i7;
    }
}
