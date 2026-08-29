package j7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a extends d0 {
    public final Map f10899b;
    public final h f10900c;

    public a(h hVar, Map map) {
        super(0);
        this.f10900c = hVar;
        map.getClass();
        this.f10899b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            c cVar = (c) it;
            if (cVar.hasNext()) {
                cVar.next();
                cVar.remove();
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f10899b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f10899b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f10899b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f10899b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f10899b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new c(this, this.f10899b.entrySet().iterator(), 2);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f10899b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f10900c.d -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f10899b.size();
    }
}
