package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
public final class l7a extends AbstractSet {
    public final ym5 a;
    public final ym5 b;

    public l7a(ym5 ym5Var, ym5 ym5Var2) {
        this.a = ym5Var;
        this.b = ym5Var2;
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
        if (this.a.contains(obj) && this.b.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        if (this.a.containsAll(collection) && this.b.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.b, this.a);
    }

    @Override
    public final Iterator iterator() {
        return new js5(this);
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
        int i = 0;
        for (Object obj : this.a) {
            if (this.b.contains(obj)) {
                i++;
            }
        }
        return i;
    }
}
