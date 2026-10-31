package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
public final class ws extends ArrayList {
    public HashSet f19131a;

    @Override
    public final boolean add(Object obj) {
        if (this.f19131a.add(obj)) {
            return super.add(obj);
        }
        return false;
    }

    @Override
    public final boolean addAll(Collection collection) {
        boolean z10 = false;
        for (Object obj : collection) {
            if (add(obj)) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final void clear() {
        this.f19131a.clear();
        super.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f19131a.contains(obj);
    }

    @Override
    public final Object remove(int i10) {
        Object remove = super.remove(i10);
        if (remove != null) {
            this.f19131a.remove(remove);
        }
        return remove;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void add(int i10, Object obj) {
        if (this.f19131a.add(obj)) {
            super.add(i10, obj);
        }
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean remove(Object obj) {
        if (this.f19131a.remove(obj)) {
            return super.remove(obj);
        }
        return false;
    }
}
