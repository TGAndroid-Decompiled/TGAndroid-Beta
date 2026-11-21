package h9;

import a8.ka;
import a8.lb;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class c extends a8.h0 {
    public final int f14006b;
    public final AbstractMap f14007c;

    public c(AbstractMap abstractMap, int i7) {
        super(2);
        this.f14006b = i7;
        this.f14007c = abstractMap;
    }

    @Override
    public final void clear() {
        i().clear();
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f14006b) {
            case 0:
                Set entrySet = ((lb) this.f14007c).f533b.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return f(obj);
        }
    }

    public final boolean f(Object obj) {
        Object obj2;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Map i7 = i();
            i7.getClass();
            try {
                obj2 = i7.get(key);
            } catch (ClassCastException | NullPointerException unused) {
                obj2 = null;
            }
            if (ka.a(obj2, entry.getValue())) {
                if (obj2 != null || i().containsKey(key)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Map i() {
        switch (this.f14006b) {
            case 0:
                return (lb) this.f14007c;
            default:
                return (i1) this.f14007c;
        }
    }

    @Override
    public final boolean isEmpty() {
        return i().isEmpty();
    }

    @Override
    public final Iterator iterator() {
        switch (this.f14006b) {
            case 0:
                return new a8.d((lb) this.f14007c, (char) 0);
            default:
                i1 i1Var = (i1) this.f14007c;
                Iterator it = i1Var.f14033a.entrySet().iterator();
                h1 h1Var = i1Var.f14034b;
                h1Var.getClass();
                return new w0(it, new ob.c(h1Var, 27));
        }
    }

    public final boolean j(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return i().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        Object obj2;
        switch (this.f14006b) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                l1 l1Var = (l1) ((lb) this.f14007c).f535e;
                Object key = entry.getKey();
                Map map = l1Var.f14048e;
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
                    l1Var.f14049f -= size;
                }
                return true;
            default:
                return j(obj);
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
            HashSet hashSet = new HashSet(o.d(collection.size()));
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return i().keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return i().size();
    }
}
