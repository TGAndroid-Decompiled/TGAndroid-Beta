package o8;

import h7.wa;
import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class b extends h7.d0 {
    public final wa f19027b;

    public b(wa waVar) {
        super(2);
        this.f19027b = waVar;
    }

    @Override
    public final void clear() {
        this.f19027b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f19027b.f10166b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f19027b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new h7.c(this.f19027b, (char) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        h0 h0Var = (h0) this.f19027b.f10168e;
        Object key = entry.getKey();
        Map map = h0Var.d;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            h0Var.f19047e -= size;
            return true;
        }
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            boolean z10 = false;
            for (Object obj : collection) {
                z10 |= remove(obj);
            }
            return z10;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet l10 = l.l(collection.size());
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    l10.add(((Map.Entry) obj).getKey());
                }
            }
            return this.f19027b.keySet().retainAll(l10);
        }
    }

    @Override
    public final int size() {
        return this.f19027b.f10166b.size();
    }
}
