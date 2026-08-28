package j7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class l9 extends h7.d0 {
    public final h7.wa f14017b;

    public l9(h7.wa waVar) {
        super(1);
        this.f14017b = waVar;
    }

    @Override
    public final void clear() {
        this.f14017b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f14017b.f10166b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f14017b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new h7.c(this.f14017b, (byte) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        Object key = entry.getKey();
        d dVar = ((lg) this.f14017b.f10168e).f14018c;
        dVar.getClass();
        try {
            obj2 = dVar.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            collection.size();
            collection.clear();
            return true;
        }
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return f7.w8.a(this, collection);
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
            lg lgVar = (lg) this.f14017b.f10168e;
            ed edVar = lgVar.f14008a;
            if (edVar == null) {
                edVar = new ed(lgVar, lgVar.f14018c);
                lgVar.f14008a = edVar;
            }
            return edVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f14017b.f10166b.size();
    }
}
