package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
public final class hs extends ArrayList {
    public HashSet f24599a;

    @Override
    public final boolean add(Object obj) {
        if (this.f24599a.add(obj)) {
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
        this.f24599a.clear();
        super.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f24599a.contains(obj);
    }

    @Override
    public final Object remove(int i7) {
        Object remove = super.remove(i7);
        if (remove != null) {
            this.f24599a.remove(remove);
        }
        return remove;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void add(int i7, Object obj) {
        if (this.f24599a.add(obj)) {
            super.add(i7, obj);
        }
    }

    @Override
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean remove(Object obj) {
        if (this.f24599a.remove(obj)) {
            return super.remove(obj);
        }
        return false;
    }
}
