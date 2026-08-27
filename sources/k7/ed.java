package k7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class ed extends i7.d0 {

    public final Map f14555b;

    public final lg f14556c;

    public ed(lg lgVar, Map map) {
        super(1);
        this.f14556c = lgVar;
        map.getClass();
        this.f14555b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            i7.c cVar = (i7.c) it;
            if (!cVar.hasNext()) {
                return;
            }
            cVar.next();
            cVar.remove();
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f14555b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f14555b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.f14555b.keySet().equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.f14555b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f14555b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new i7.c(this, this.f14555b.entrySet().iterator(), 4);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f14555b.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f14556c.getClass();
        return size > 0;
    }

    @Override
    public final int size() {
        return this.f14555b.size();
    }
}
