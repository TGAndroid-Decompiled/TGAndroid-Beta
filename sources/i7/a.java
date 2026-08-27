package i7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class a extends d0 {

    public final Map f10572b;

    public final h f10573c;

    public a(h hVar, Map map) {
        super(0);
        this.f10573c = hVar;
        map.getClass();
        this.f10572b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            c cVar = (c) it;
            if (!cVar.hasNext()) {
                return;
            }
            cVar.next();
            cVar.remove();
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f10572b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f10572b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.f10572b.keySet().equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.f10572b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f10572b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new c(this, this.f10572b.entrySet().iterator(), 2);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f10572b.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f10573c.d -= size;
        return size > 0;
    }

    @Override
    public final int size() {
        return this.f10572b.size();
    }
}
