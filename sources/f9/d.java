package f9;

import a8.ta;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class d extends a8.x {
    public final Map f10271b;
    public final k1 f10272c;

    public d(k1 k1Var, Map map) {
        super(1);
        this.f10272c = k1Var;
        map.getClass();
        this.f10271b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            ta taVar = (ta) it;
            if (taVar.hasNext()) {
                taVar.next();
                taVar.remove();
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f10271b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f10271b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f10271b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f10271b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f10271b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new ta(this, this.f10271b.entrySet().iterator(), 4);
    }

    @Override
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f10271b.remove(obj);
        if (collection != null) {
            i10 = collection.size();
            collection.clear();
            this.f10272c.f10293f -= i10;
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
        return this.f10271b.size();
    }
}
