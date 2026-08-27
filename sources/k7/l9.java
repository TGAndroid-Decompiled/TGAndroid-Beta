package k7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class l9 extends i7.d0 {

    public final i7.wa f14871b;

    public l9(i7.wa waVar) {
        super(1);
        this.f14871b = waVar;
    }

    @Override
    public final void clear() {
        this.f14871b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f14871b.f10875b.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f14871b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new i7.c(this.f14871b, (byte) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        Object key = entry.getKey();
        d dVar = ((lg) this.f14871b.f10877e).f14872c;
        dVar.getClass();
        try {
            objRemove = dVar.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        collection.size();
        collection.clear();
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return g7.w8.a(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        int iCeil;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size >= 3) {
                iCeil = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : Integer.MAX_VALUE;
            } else {
                if (size < 0) {
                    throw new IllegalArgumentException(i0.a.k(size, "expectedSize cannot be negative but was: "));
                }
                iCeil = size + 1;
            }
            HashSet hashSet = new HashSet(iCeil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            lg lgVar = (lg) this.f14871b.f10877e;
            ed edVar = lgVar.f14862a;
            if (edVar == null) {
                edVar = new ed(lgVar, lgVar.f14872c);
                lgVar.f14862a = edVar;
            }
            return edVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f14871b.f10875b.size();
    }
}
