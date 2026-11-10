package c8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class k9 extends a8.h0 {
    public final a8.kb f5749b;

    public k9(a8.kb kbVar) {
        super(1);
        this.f5749b = kbVar;
    }

    @Override
    public final void clear() {
        this.f5749b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f5749b.f513b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f5749b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new a8.d(this.f5749b, (byte) 0);
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
        d dVar = ((jg) this.f5749b.f515e).f5741c;
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
                return a8.d8.a(this, collection);
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
            jg jgVar = (jg) this.f5749b.f515e;
            cd cdVar = jgVar.f5726a;
            if (cdVar == null) {
                cdVar = new cd(jgVar, jgVar.f5741c);
                jgVar.f5726a = cdVar;
            }
            return cdVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f5749b.f513b.size();
    }
}
