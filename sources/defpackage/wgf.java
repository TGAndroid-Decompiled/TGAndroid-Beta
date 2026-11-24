package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public final class wgf extends o7a {
    public final d3 b;

    public wgf(d3 d3Var) {
        super((byte) 2);
        this.b = d3Var;
    }

    @Override
    public final void clear() {
        this.b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        try {
            return ((so2) this.b.d).entrySet().contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new c3(this.b, (char) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        j7d j7dVar = (j7d) this.b.e;
        Object key = entry.getKey();
        so2 so2Var = j7dVar.c;
        so2Var.getClass();
        try {
            obj2 = so2Var.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            j7dVar.d -= size;
            return true;
        }
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return t0f.a(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            boolean z = false;
            for (Object obj : collection) {
                z |= remove(obj);
            }
            return z;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        int i;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i = size + 1;
                } else {
                    w26.j(de9.k(size, "expectedSize cannot be negative but was: "));
                    return false;
                }
            } else if (size < 1073741824) {
                i = (int) Math.ceil(size / 0.75d);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            j7d j7dVar = (j7d) this.b.e;
            d5d d5dVar = j7dVar.a;
            if (d5dVar == null) {
                d5dVar = new d5d(j7dVar, j7dVar.c);
                j7dVar.a = d5dVar;
            }
            return d5dVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return ((so2) this.b.d).size();
    }
}
