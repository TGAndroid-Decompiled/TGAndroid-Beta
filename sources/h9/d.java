package h9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class d extends a8.h0 {
    public final Map f13977b;
    public final k1 f13978c;

    public d(k1 k1Var, Map map) {
        super(2);
        this.f13978c = k1Var;
        map.getClass();
        this.f13977b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            a8.d dVar = (a8.d) it;
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
        return this.f13977b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f13977b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f13977b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f13977b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f13977b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new a8.d(this, this.f13977b.entrySet().iterator(), 7);
    }

    @Override
    public final boolean remove(Object obj) {
        int i7;
        Collection collection = (Collection) this.f13977b.remove(obj);
        if (collection != null) {
            i7 = collection.size();
            collection.clear();
            this.f13978c.f14004f -= i7;
        } else {
            i7 = 0;
        }
        if (i7 <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int size() {
        return this.f13977b.size();
    }
}
