package defpackage;

import java.util.Collection;
import java.util.Iterator;
public final class w9d extends fba {
    public final lp2 b;
    public final ccd c;

    public w9d(ccd ccdVar, lp2 lp2Var) {
        super((byte) 2);
        this.c = ccdVar;
        lp2Var.getClass();
        this.b = lp2Var;
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
        return new d3(this, this.b.entrySet().iterator(), (byte) 7);
    }

    @Override
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.c.d -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.b.size();
    }
}
