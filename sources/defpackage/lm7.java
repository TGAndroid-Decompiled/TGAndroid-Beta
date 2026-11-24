package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
public final class lm7 extends ArrayList {
    public HashSet a;

    @Override
    public final boolean add(Object obj) {
        if (this.a.add(obj)) {
            return super.add(obj);
        }
        return false;
    }

    @Override
    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (add(obj)) {
                z = true;
            }
        }
        return z;
    }

    @Override
    public final void clear() {
        this.a.clear();
        super.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override
    public final boolean remove(Object obj) {
        if (this.a.remove(obj)) {
            return super.remove(obj);
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void add(int i, Object obj) {
        if (this.a.add(obj)) {
            super.add(i, obj);
        }
    }

    @Override
    public final Object remove(int i) {
        Object remove = super.remove(i);
        if (remove != null) {
            this.a.remove(remove);
        }
        return remove;
    }

    @Override
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }
}
