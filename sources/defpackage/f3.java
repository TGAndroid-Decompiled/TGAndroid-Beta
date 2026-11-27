package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class f3 extends fba {
    public final Map b;
    public final fj7 c;

    public f3(fj7 fj7Var, Map map) {
        super((byte) 0);
        this.c = fj7Var;
        map.getClass();
        this.b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            d3 d3Var = (d3) it;
            if (d3Var.hasNext()) {
                d3Var.next();
                d3Var.remove();
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.b.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj && !this.b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.b.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new d3(this, this.b.entrySet().iterator(), (byte) 1);
    }

    @Override
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.b.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.c.f -= i;
        } else {
            i = 0;
        }
        if (i <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int size() {
        return this.b.size();
    }
}
