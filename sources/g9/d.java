package g9;

import b8.ra;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class d extends b8.x {
    public final Map f12065b;
    public final k1 f12066c;

    public d(k1 k1Var, Map map) {
        super(1);
        this.f12066c = k1Var;
        map.getClass();
        this.f12065b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            ra raVar = (ra) it;
            if (raVar.hasNext()) {
                raVar.next();
                raVar.remove();
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f12065b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f12065b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f12065b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f12065b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f12065b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new ra(this, this.f12065b.entrySet().iterator(), 4);
    }

    @Override
    public final boolean remove(Object obj) {
        int i3;
        Collection collection = (Collection) this.f12065b.remove(obj);
        if (collection != null) {
            i3 = collection.size();
            collection.clear();
            this.f12066c.f12092f -= i3;
        } else {
            i3 = 0;
        }
        if (i3 <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int size() {
        return this.f12065b.size();
    }
}
