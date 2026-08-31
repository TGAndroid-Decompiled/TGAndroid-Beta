package l7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class wa extends d0 {
    public final xa f12087b;

    public wa(xa xaVar) {
        super(0);
        this.f12087b = xaVar;
    }

    @Override
    public final void clear() {
        this.f12087b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f12087b.f12098b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f12087b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new c(this.f12087b);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        h hVar = (h) this.f12087b.f12100e;
        Object key = entry.getKey();
        n nVar = hVar.f11865c;
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
                return k7.i.a(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            boolean z4 = false;
            for (Object obj : collection) {
                z4 |= remove(obj);
            }
            return z4;
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
                    throw new IllegalArgumentException(l.d.j(size, "expectedSize cannot be negative but was: "));
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
            h hVar = (h) this.f12087b.f12100e;
            a aVar = hVar.f11851a;
            if (aVar == null) {
                aVar = new a(hVar, hVar.f11865c);
                hVar.f11851a = aVar;
            }
            return aVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f12087b.f12098b.size();
    }
}
