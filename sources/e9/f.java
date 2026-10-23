package e9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class f extends j2 {
    public final Map f8448b;
    public final p1 f8449c;

    public f(p1 p1Var, Map map) {
        super(0);
        this.f8449c = p1Var;
        map.getClass();
        this.f8448b = map;
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
        return this.f8448b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f8448b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f8448b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f8448b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f8448b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new d(this, this.f8448b.entrySet().iterator(), 1);
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f8448b.remove(obj);
        if (collection != null) {
            i10 = collection.size();
            collection.clear();
            this.f8449c.f8492f -= i10;
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
        return this.f8448b.size();
    }
}
