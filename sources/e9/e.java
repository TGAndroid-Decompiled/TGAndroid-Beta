package e9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class e extends l1 {
    public final Map f8066b;
    public final v0 f8067c;

    public e(v0 v0Var, Map map) {
        super(0);
        this.f8067c = v0Var;
        map.getClass();
        this.f8066b = map;
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
        return this.f8066b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f8066b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f8066b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f8066b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f8066b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new c(this, this.f8066b.entrySet().iterator(), 1);
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f8066b.remove(obj);
        if (collection != null) {
            i10 = collection.size();
            collection.clear();
            this.f8067c.e -= i10;
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
        return this.f8066b.size();
    }
}
