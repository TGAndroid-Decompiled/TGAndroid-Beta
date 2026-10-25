package a8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class u9 extends x {
    public final pb f952b;

    public u9(pb pbVar) {
        super(0);
        this.f952b = pbVar;
    }

    @Override
    public final void clear() {
        this.f952b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f952b.f739b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f952b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new ta(this.f952b);
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
        g gVar = ((gh) this.f952b.e).f508c;
        gVar.getClass();
        try {
            obj2 = gVar.remove(key);
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
                return m0.a(this, collection);
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
                    throw new IllegalArgumentException(ic.a.i(size, "expectedSize cannot be negative but was: "));
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
            gh ghVar = (gh) this.f952b.e;
            nd ndVar = ghVar.f466a;
            if (ndVar == null) {
                ndVar = new nd(ghVar, ghVar.f508c);
                ghVar.f466a = ndVar;
            }
            return ndVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f952b.f739b.size();
    }
}
