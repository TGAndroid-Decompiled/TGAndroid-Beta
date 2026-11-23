package h9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class d extends a8.h0 {
    public final Map f13978b;
    public final l1 f13979c;

    public d(l1 l1Var, Map map) {
        super(2);
        this.f13979c = l1Var;
        map.getClass();
        this.f13978b = map;
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
        return this.f13978b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f13978b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f13978b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f13978b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f13978b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new a8.d(this, this.f13978b.entrySet().iterator(), 7);
    }

    @Override
    public final boolean remove(Object obj) {
        int i7;
        Collection collection = (Collection) this.f13978b.remove(obj);
        if (collection != null) {
            i7 = collection.size();
            collection.clear();
            this.f13979c.f14015f -= i7;
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
        return this.f13978b.size();
    }
}
