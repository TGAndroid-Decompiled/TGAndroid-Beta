package e9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class f extends j2 {
    public final Map f8441b;
    public final p1 f8442c;

    public f(p1 p1Var, Map map) {
        super(0);
        this.f8442c = p1Var;
        map.getClass();
        this.f8441b = map;
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
        return this.f8441b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f8441b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f8441b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f8441b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f8441b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new d(this, this.f8441b.entrySet().iterator(), 1);
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f8441b.remove(obj);
        if (collection != null) {
            i10 = collection.size();
            collection.clear();
            this.f8442c.f8485f -= i10;
        } else {
            i10 = 0;
        }
        if (i10 <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int size() {
        return this.f8441b.size();
    }
}
