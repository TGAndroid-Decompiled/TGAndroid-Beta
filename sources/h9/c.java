package h9;

import a8.ia;
import a8.lb;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class c extends a8.h0 {
    public final int f13662b;
    public final AbstractMap f13663c;

    public c(AbstractMap abstractMap, int i7) {
        super(2);
        this.f13662b = i7;
        this.f13663c = abstractMap;
    }

    @Override
    public final void clear() {
        i().clear();
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f13662b) {
            case 0:
                Set entrySet = ((lb) this.f13663c).f533b.entrySet();
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
            if (ia.a(obj2, entry.getValue())) {
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
        switch (this.f13662b) {
            case 0:
                return (lb) this.f13663c;
            default:
                return (h1) this.f13663c;
        }
    }

    @Override
    public final boolean isEmpty() {
        return i().isEmpty();
    }

    @Override
    public final Iterator iterator() {
        switch (this.f13662b) {
            case 0:
                return new a8.d((lb) this.f13663c, (char) 0);
            default:
                h1 h1Var = (h1) this.f13663c;
                Iterator it = h1Var.f13684a.entrySet().iterator();
                g1 g1Var = h1Var.f13685b;
                g1Var.getClass();
                return new w0(it, new d6.i(g1Var, 24));
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
        switch (this.f13662b) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                k1 k1Var = (k1) ((lb) this.f13663c).f535e;
                Object key = entry.getKey();
                Map map = k1Var.f13694e;
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
                    k1Var.f13695f -= size;
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
