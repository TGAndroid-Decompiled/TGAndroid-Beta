package a8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class jb extends h0 {
    public final kb f497b;

    public jb(kb kbVar) {
        super(0);
        this.f497b = kbVar;
    }

    @Override
    public final void clear() {
        this.f497b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f497b.f513b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f497b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new d(this.f497b);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        i iVar = (i) this.f497b.f515e;
        Object key = entry.getKey();
        o oVar = iVar.f482c;
        oVar.getClass();
        try {
            obj2 = oVar.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            iVar.d -= size;
            return true;
        }
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return v0.a(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            boolean z9 = false;
            for (Object obj : collection) {
                z9 |= remove(obj);
            }
            return z9;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        int i7;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i7 = size + 1;
                } else {
                    throw new IllegalArgumentException(jg.g.j(size, "expectedSize cannot be negative but was: "));
                }
            } else if (size < 1073741824) {
                i7 = (int) Math.ceil(size / 0.75d);
            } else {
                i7 = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i7);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            i iVar = (i) this.f497b.f515e;
            b bVar = iVar.f459a;
            if (bVar == null) {
                bVar = new b(iVar, iVar.f482c);
                iVar.f459a = bVar;
            }
            return bVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f497b.f513b.size();
    }
}
