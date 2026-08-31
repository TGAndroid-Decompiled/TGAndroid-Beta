package n7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class fd extends l7.d0 {
    public final Map f15340b;
    public final mg f15341c;

    public fd(mg mgVar, Map map) {
        super(1);
        this.f15341c = mgVar;
        map.getClass();
        this.f15340b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            l7.c cVar = (l7.c) it;
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
        return this.f15340b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f15340b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f15340b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f15340b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f15340b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new l7.c(this, this.f15340b.entrySet().iterator(), 4);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f15340b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f15341c.getClass();
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f15340b.size();
    }
}
