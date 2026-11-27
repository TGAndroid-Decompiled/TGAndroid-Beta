package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public final class mlf extends fba {
    public final e3 b;

    public mlf(e3 e3Var) {
        super((byte) 2);
        this.b = e3Var;
    }

    @Override
    public final void clear() {
        this.b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        try {
            return ((lp2) this.b.d).entrySet().contains(obj);
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
        return new d3(this.b, (char) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        ccd ccdVar = (ccd) this.b.e;
        Object key = entry.getKey();
        lp2 lp2Var = ccdVar.c;
        lp2Var.getClass();
        try {
            obj2 = lp2Var.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            ccdVar.d -= size;
            return true;
        }
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return l5f.a(this, collection);
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
                    lq5.j(uh9.k(size, "expectedSize cannot be negative but was: "));
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
            ccd ccdVar = (ccd) this.b.e;
            w9d w9dVar = ccdVar.a;
            if (w9dVar == null) {
                w9dVar = new w9d(ccdVar, ccdVar.c);
                ccdVar.a = w9dVar;
            }
            return w9dVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return ((lp2) this.b.d).size();
    }
}
