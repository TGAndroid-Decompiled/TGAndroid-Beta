package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public final class xif extends p9a {
    public final d3 b;

    public xif(d3 d3Var) {
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
            return ((dq2) this.b.d).entrySet().contains(obj);
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
        l9d l9dVar = (l9d) this.b.e;
        Object key = entry.getKey();
        dq2 dq2Var = l9dVar.c;
        dq2Var.getClass();
        try {
            obj2 = dq2Var.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            l9dVar.d -= size;
            return true;
        }
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return v2f.a(this, collection);
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
                    u36.j(hg9.j(size, "expectedSize cannot be negative but was: "));
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
            l9d l9dVar = (l9d) this.b.e;
            f7d f7dVar = l9dVar.a;
            if (f7dVar == null) {
                f7dVar = new f7d(l9dVar, l9dVar.c);
                l9dVar.a = f7dVar;
            }
            return f7dVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return ((dq2) this.b.d).size();
    }
}
