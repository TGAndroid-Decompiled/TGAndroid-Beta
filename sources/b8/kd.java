package b8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class kd extends x {
    public final Map f2713b;
    public final dh f2714c;

    public kd(dh dhVar, Map map) {
        super(0);
        this.f2714c = dhVar;
        map.getClass();
        this.f2713b = map;
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
        return this.f2713b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f2713b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.f2713b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.f2713b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f2713b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new ra(this, this.f2713b.entrySet().iterator(), 1);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f2713b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f2714c.getClass();
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f2713b.size();
    }
}
