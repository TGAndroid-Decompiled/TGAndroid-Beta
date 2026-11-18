package c8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class cd extends a8.h0 {
    public final Map f4521b;
    public final jg f4522c;

    public cd(jg jgVar, Map map) {
        super(1);
        this.f4522c = jgVar;
        map.getClass();
        this.f4521b = map;
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
        return this.f4521b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f4521b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f4521b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f4521b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f4521b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new a8.d(this, this.f4521b.entrySet().iterator(), 4);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f4521b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f4522c.getClass();
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f4521b.size();
    }
}
