package b8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class s9 extends x {
    public final mb f3059b;

    public s9(mb mbVar) {
        super(0);
        this.f3059b = mbVar;
    }

    @Override
    public final void clear() {
        this.f3059b.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Set entrySet = this.f3059b.f2754b.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.f3059b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new ra(this.f3059b);
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
        g gVar = ((dh) this.f3059b.f2756e).f2554c;
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
                return l1.a(this, collection);
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
        int i3;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i3 = size + 1;
                } else {
                    throw new IllegalArgumentException(k2.p1.i(size, "expectedSize cannot be negative but was: "));
                }
            } else if (size < 1073741824) {
                i3 = (int) Math.ceil(size / 0.75d);
            } else {
                i3 = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i3);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            dh dhVar = (dh) this.f3059b.f2756e;
            kd kdVar = dhVar.f2526a;
            if (kdVar == null) {
                kdVar = new kd(dhVar, dhVar.f2554c);
                dhVar.f2526a = kdVar;
            }
            return kdVar.retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return this.f3059b.f2754b.size();
    }
}
