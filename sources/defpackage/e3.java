package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class e3 extends p9a {
    public final Map b;
    public final zi7 c;

    public e3(zi7 zi7Var, Map map) {
        super((byte) 0);
        this.c = zi7Var;
        map.getClass();
        this.b = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            c3 c3Var = (c3) it;
            if (c3Var.hasNext()) {
                c3Var.next();
                c3Var.remove();
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
        return new c3(this, this.b.entrySet().iterator(), (byte) 1);
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
