package e9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class f extends j2 {
    public final Map f6357b;
    public final p1 f6358c;

    public f(p1 p1Var, Map map) {
        super(0);
        this.f6358c = p1Var;
        map.getClass();
        this.f6357b = map;
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
        return this.f6357b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f6357b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f6357b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f6357b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f6357b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new d(this, this.f6357b.entrySet().iterator(), 1);
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f6357b.remove(obj);
        if (collection != null) {
            i10 = collection.size();
            collection.clear();
            this.f6358c.f6401f -= i10;
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
        return this.f6357b.size();
    }
}
