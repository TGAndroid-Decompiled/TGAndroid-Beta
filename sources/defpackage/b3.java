package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class b3 extends p9a {
    public final byte b;
    public final AbstractMap c;

    public b3(AbstractMap abstractMap, byte b) {
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
                Set entrySet = ((d3) this.c).d.entrySet();
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
            if (ese.a(obj2, entry.getValue())) {
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
                return (d3) abstractMap;
            default:
                return (qk6) abstractMap;
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
                return new c3((d3) abstractMap);
            default:
                qk6 qk6Var = (qk6) abstractMap;
                Iterator it = qk6Var.a.entrySet().iterator();
                pk6 pk6Var = qk6Var.b;
                pk6Var.getClass();
                return new ju5(it, new nk6(pk6Var));
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
                zi7 zi7Var = (zi7) ((d3) this.c).e;
                Object key = entry.getKey();
                Map map = zi7Var.e;
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
                    zi7Var.f -= size;
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
            HashSet hashSet = new HashSet(fqe.a(collection.size()));
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
