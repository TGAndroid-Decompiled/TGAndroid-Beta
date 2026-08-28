package j7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class ed extends h7.d0 {
    public final Map f13701b;
    public final lg f13702c;

    public ed(lg lgVar, Map map) {
        super(1);
        this.f13702c = lgVar;
        map.getClass();
        this.f13701b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            h7.c cVar = (h7.c) it;
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
        return this.f13701b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f13701b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f13701b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f13701b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f13701b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new h7.c(this, this.f13701b.entrySet().iterator(), 4);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f13701b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f13702c.getClass();
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f13701b.size();
    }
}
