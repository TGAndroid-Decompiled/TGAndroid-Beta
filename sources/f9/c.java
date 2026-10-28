package f9;

import a8.pb;
import a8.ta;
import a8.xb;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class c extends a8.x {
    public final int f10264b;
    public final AbstractMap f10265c;

    public c(AbstractMap abstractMap, int i10) {
        super(1);
        this.f10264b = i10;
        this.f10265c = abstractMap;
    }

    @Override
    public final void clear() {
        m().clear();
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f10264b) {
            case 0:
                Set entrySet = ((pb) this.f10265c).f739b.entrySet();
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
            if (xb.a(obj2, entry.getValue())) {
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
        switch (this.f10264b) {
            case 0:
                return new ta((pb) this.f10265c, (byte) 0);
            default:
                h1 h1Var = (h1) this.f10265c;
                Iterator it = h1Var.f10284a.entrySet().iterator();
                g1 g1Var = h1Var.f10285b;
                g1Var.getClass();
                return new w0(it, new za.c(g1Var, 19));
        }
    }

    public final Map m() {
        switch (this.f10264b) {
            case 0:
                return (pb) this.f10265c;
            default:
                return (h1) this.f10265c;
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
        switch (this.f10264b) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                k1 k1Var = (k1) ((pb) this.f10265c).e;
                Object key = entry.getKey();
                Map map = k1Var.e;
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
                    k1Var.f10292f -= size;
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
            HashSet hashSet = new HashSet(o.c(collection.size()));
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
