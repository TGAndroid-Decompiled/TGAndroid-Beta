package j7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class wa extends d0 {
    public final xa f11246b;

    public wa(xa xaVar) {
        super(0);
        this.f11246b = xaVar;
    }

    @Override
    public final void clear() {
        this.f11246b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f11246b.f11257b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f11246b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new c(this.f11246b);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        h hVar = (h) this.f11246b.f11259e;
        Object key = entry.getKey();
        n nVar = hVar.f11024c;
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
                return h7.s8.a(this, collection);
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
        int i10;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i10 = size + 1;
                } else {
                    throw new IllegalArgumentException(l1.k(size, "expectedSize cannot be negative but was: "));
                }
            } else if (size < 1073741824) {
                i10 = (int) Math.ceil(size / 0.75d);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i10);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            h hVar = (h) this.f11246b.f11259e;
            a aVar = hVar.f11010a;
            if (aVar == null) {
                aVar = new a(hVar, hVar.f11024c);
                hVar.f11010a = aVar;
            }
            return aVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f11246b.f11257b.size();
    }
}
