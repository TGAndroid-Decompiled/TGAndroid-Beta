package h9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f14292a;
    public Object f14293b = null;
    public Collection f14294c = null;
    public Iterator d = y0.f14416a;
    public final l1 f14295e;
    public final int f14296f;

    public b(l1 l1Var, int i7) {
        this.f14296f = i7;
        this.f14295e = l1Var;
        this.f14292a = l1Var.f14345e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14292a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14292a.next();
            this.f14293b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f14294c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f14293b;
        Object next = this.d.next();
        switch (this.f14296f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f14294c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f14292a.remove();
        }
        l1 l1Var = this.f14295e;
        l1Var.f14346f--;
    }
}
