package h7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class va extends d0 {
    public final wa f10154b;

    public va(wa waVar) {
        super(0);
        this.f10154b = waVar;
    }

    @Override
    public final void clear() {
        this.f10154b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f10154b.f10166b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f10154b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new c(this.f10154b);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        h hVar = (h) this.f10154b.f10168e;
        Object key = entry.getKey();
        n nVar = hVar.f9942c;
        nVar.getClass();
        try {
            obj2 = nVar.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            hVar.d -= size;
            return true;
        }
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return f7.z7.a(this, collection);
            }
            throw null;
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
        int i9;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i9 = size + 1;
                } else {
                    throw new IllegalArgumentException(j3.r0.l(size, "expectedSize cannot be negative but was: "));
                }
            } else if (size < 1073741824) {
                i9 = (int) Math.ceil(size / 0.75d);
            } else {
                i9 = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i9);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            h hVar = (h) this.f10154b.f10168e;
            a aVar = hVar.f9933a;
            if (aVar == null) {
                aVar = new a(hVar, hVar.f9942c);
                hVar.f9933a = aVar;
            }
            return aVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f10154b.f10166b.size();
    }
}
