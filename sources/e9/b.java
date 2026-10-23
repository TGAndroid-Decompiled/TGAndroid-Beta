package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f8418a;
    public Object f8419b = null;
    public Collection f8420c = null;
    public Iterator d = d1.f8435a;
    public final p1 e;
    public final int f8421f;

    public b(p1 p1Var, int i10) {
        this.f8421f = i10;
        this.e = p1Var;
        this.f8418a = p1Var.e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8418a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8418a.next();
            this.f8419b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8420c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f8419b;
        Object next = this.d.next();
        switch (this.f8421f) {
            case 0:
                return next;
            default:
                return new j0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8420c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8418a.remove();
        }
        p1 p1Var = this.e;
        p1Var.f8492f--;
    }
}
