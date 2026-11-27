package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class c3 extends fba {
    public final byte b;
    public final AbstractMap c;

    public c3(AbstractMap abstractMap, byte b) {
        super((byte) 0);
        this.b = b;
        this.c = abstractMap;
    }

    @Override
    public final void clear() {
        i().clear();
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                Set entrySet = ((e3) this.c).d.entrySet();
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
            Map i = i();
            i.getClass();
            try {
                obj2 = i.get(key);
            } catch (ClassCastException | NullPointerException unused) {
                obj2 = null;
            }
            if (tue.a(obj2, entry.getValue())) {
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
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return (e3) abstractMap;
            default:
                return (sk6) abstractMap;
        }
    }

    @Override
    public final boolean isEmpty() {
        return i().isEmpty();
    }

    @Override
    public final Iterator iterator() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return new d3((e3) abstractMap);
            default:
                sk6 sk6Var = (sk6) abstractMap;
                Iterator it = sk6Var.a.entrySet().iterator();
                rk6 rk6Var = sk6Var.b;
                rk6Var.getClass();
                return new nu5(it, new pk6(rk6Var));
        }
    }

    public final boolean j(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return i().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override
    public final boolean remove(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                gj7 gj7Var = (gj7) ((e3) this.c).e;
                Object key = entry.getKey();
                Map map = gj7Var.e;
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
                    gj7Var.f -= size;
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
            boolean z = false;
            for (Object obj : collection) {
                z |= this.remove(obj);
            }
            return z;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(use.a(collection.size()));
            for (Object obj : collection) {
                if (this.contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.i().keySet().retainAll(hashSet);
        }
    }

    @Override
    public final int size() {
        return i().size();
    }
}
