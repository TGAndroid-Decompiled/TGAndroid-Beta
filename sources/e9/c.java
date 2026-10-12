package e9;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import v7.t6;
public final class c extends j2 {
    public final int f8538b;
    public final AbstractMap f8539c;

    public c(AbstractMap abstractMap, int i10) {
        super(0);
        this.f8538b = i10;
        this.f8539c = abstractMap;
    }

    @Override
    public final void clear() {
        m().clear();
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f8538b) {
            case 0:
                Set entrySet = ((e) this.f8539c).f8551b.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return h(obj);
        }
    }

    public final boolean h(Object obj) {
        Object obj2;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Map m10 = m();
            m10.getClass();
            try {
                obj2 = m10.get(key);
            } catch (ClassCastException | NullPointerException unused) {
                obj2 = null;
            }
            if (t6.a(obj2, entry.getValue())) {
                if (obj2 != null || m().containsKey(key)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean isEmpty() {
        return m().isEmpty();
    }

    @Override
    public final Iterator iterator() {
        switch (this.f8538b) {
            case 0:
                return new d((e) this.f8539c);
            default:
                m1 m1Var = (m1) this.f8539c;
                Iterator it = m1Var.f8590a.entrySet().iterator();
                l1 l1Var = m1Var.f8591b;
                l1Var.getClass();
                return new b1(it, new a6.i(l1Var, 16));
        }
    }

    public final Map m() {
        switch (this.f8538b) {
            case 0:
                return (e) this.f8539c;
            default:
                return (m1) this.f8539c;
        }
    }

    public final boolean n(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return m().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        Object obj2;
        switch (this.f8538b) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                p1 p1Var = (p1) ((e) this.f8539c).e;
                Object key = entry.getKey();
                Map map = p1Var.e;
                map.getClass();
                try {
                    obj2 = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    p1Var.f8603f -= size;
                }
                return true;
            default:
                return n(obj);
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
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
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(s.c(collection.size()));
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return m().keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return m().size();
    }
}
