package a8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b extends h0 {
    public final Map f325b;
    public final i f326c;

    public b(i iVar, Map map) {
        super(0);
        this.f326c = iVar;
        map.getClass();
        this.f325b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            d dVar = (d) it;
            if (dVar.hasNext()) {
                dVar.next();
                dVar.remove();
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f325b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f325b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f325b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f325b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f325b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new d(this, this.f325b.entrySet().iterator(), 2);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f325b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f326c.d -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f325b.size();
    }
}
