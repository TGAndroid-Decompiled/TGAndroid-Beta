package defpackage;

import java.util.Collection;
import java.util.Iterator;
public final class f7d extends p9a {
    public final dq2 b;
    public final l9d c;

    public f7d(l9d l9dVar, dq2 dq2Var) {
        super((byte) 2);
        this.c = l9dVar;
        dq2Var.getClass();
        this.b = dq2Var;
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
        return new c3(this, this.b.entrySet().iterator(), (byte) 7);
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
