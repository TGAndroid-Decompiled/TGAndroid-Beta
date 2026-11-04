package g9;

import b8.mb;
import b8.ra;
import b8.yb;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class c extends b8.x {
    public final int f12059b;
    public final AbstractMap f12060c;

    public c(AbstractMap abstractMap, int i3) {
        super(1);
        this.f12059b = i3;
        this.f12060c = abstractMap;
    }

    @Override
    public final void clear() {
        i().clear();
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f12059b) {
            case 0:
                Set entrySet = ((mb) this.f12060c).f2754b.entrySet();
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
            Map i3 = i();
            i3.getClass();
            try {
                obj2 = i3.get(key);
            } catch (ClassCastException | NullPointerException unused) {
                obj2 = null;
            }
            if (yb.a(obj2, entry.getValue())) {
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
        switch (this.f12059b) {
            case 0:
                return (mb) this.f12060c;
            default:
                return (h1) this.f12060c;
        }
    }

    @Override
    public final boolean isEmpty() {
        return i().isEmpty();
    }

    @Override
    public final Iterator iterator() {
        switch (this.f12059b) {
            case 0:
                return new ra((mb) this.f12060c, (byte) 0);
            default:
                h1 h1Var = (h1) this.f12060c;
                Iterator it = h1Var.f12081a.entrySet().iterator();
                g1 g1Var = h1Var.f12082b;
                g1Var.getClass();
                return new w0(it, new bb.c(g1Var, 27));
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
        switch (this.f12059b) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                k1 k1Var = (k1) ((mb) this.f12060c).f2756e;
                Object key = entry.getKey();
                Map map = k1Var.f12091e;
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
                    k1Var.f12092f -= size;
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
