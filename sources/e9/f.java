package e9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class f extends j2 {
    public final Map f8559b;
    public final p1 f8560c;

    public f(p1 p1Var, Map map) {
        super(0);
        this.f8560c = p1Var;
        map.getClass();
        this.f8559b = map;
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
        return this.f8559b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f8559b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f8559b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f8559b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f8559b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new d(this, this.f8559b.entrySet().iterator(), 1);
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f8559b.remove(obj);
        if (collection != null) {
            i10 = collection.size();
            collection.clear();
            this.f8560c.f8603f -= i10;
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
        return this.f8559b.size();
    }
}
