package o8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class c extends h7.d0 {
    public final Map f19031b;
    public final h0 f19032c;

    public c(h0 h0Var, Map map) {
        super(2);
        this.f19032c = h0Var;
        map.getClass();
        this.f19031b = map;
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
        return this.f19031b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f19031b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f19031b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f19031b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f19031b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new h7.c(this, this.f19031b.entrySet().iterator(), 7);
    }

    @Override
    public final boolean remove(Object obj) {
        int i9;
        Collection collection = (Collection) this.f19031b.remove(obj);
        if (collection != null) {
            i9 = collection.size();
            collection.clear();
            this.f19032c.f19047e -= i9;
        } else {
            i9 = 0;
        }
        if (i9 <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int size() {
        return this.f19031b.size();
    }
}
