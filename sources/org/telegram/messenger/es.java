package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
public final class es extends ArrayList {
    public HashSet f22396a;

    @Override
    public final boolean add(Object obj) {
        if (this.f22396a.add(obj)) {
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
        this.f22396a.clear();
        super.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f22396a.contains(obj);
    }

    @Override
    public final Object remove(int i3) {
        Object remove = super.remove(i3);
        if (remove != null) {
            this.f22396a.remove(remove);
        }
        return remove;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void add(int i3, Object obj) {
        if (this.f22396a.add(obj)) {
            super.add(i3, obj);
        }
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean remove(Object obj) {
        if (this.f22396a.remove(obj)) {
            return super.remove(obj);
        }
        return false;
    }
}
