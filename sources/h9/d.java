package h9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class d extends a8.h0 {
    public final Map f14309b;
    public final l1 f14310c;

    public d(l1 l1Var, Map map) {
        super(2);
        this.f14310c = l1Var;
        map.getClass();
        this.f14309b = map;
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
        return this.f14309b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f14309b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f14309b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f14309b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f14309b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new a8.d(this, this.f14309b.entrySet().iterator(), 7);
    }

    @Override
    public final boolean remove(Object obj) {
        int i7;
        Collection collection = (Collection) this.f14309b.remove(obj);
        if (collection != null) {
            i7 = collection.size();
            collection.clear();
            this.f14310c.f14346f -= i7;
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
        return this.f14309b.size();
    }
}
