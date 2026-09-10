package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class b extends l1 {
    public final d f7357b;

    public b(d dVar) {
        super(0);
        this.f7357b = dVar;
    }

    @Override
    public final void clear() {
        this.f7357b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f7357b.f7364b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f7357b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new c(this.f7357b);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        v0 v0Var = (v0) this.f7357b.e;
        Object key = entry.getKey();
        Map map = v0Var.d;
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
            v0Var.e -= size;
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
            HashSet hashSet = new HashSet(q.c(collection.size()));
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.f7357b.keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f7357b.f7364b.size();
    }
}
