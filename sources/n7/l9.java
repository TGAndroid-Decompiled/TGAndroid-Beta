package n7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class l9 extends l7.d0 {
    public final l7.xa f14651b;

    public l9(l7.xa xaVar) {
        super(1);
        this.f14651b = xaVar;
    }

    @Override
    public final void clear() {
        this.f14651b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f14651b.f11694b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f14651b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new l7.c(this.f14651b, (byte) 0);
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
        d dVar = ((mg) this.f14651b.e).f14666c;
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
                return k7.c0.a(this, collection);
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
                    throw new IllegalArgumentException(kh.a2.j(size, "expectedSize cannot be negative but was: "));
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
            mg mgVar = (mg) this.f14651b.e;
            fd fdVar = mgVar.f14652a;
            if (fdVar == null) {
                fdVar = new fd(mgVar, mgVar.f14666c);
                mgVar.f14652a = fdVar;
            }
            return fdVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f14651b.f11694b.size();
    }
}
