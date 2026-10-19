package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f8411a;
    public Object f8412b = null;
    public Collection f8413c = null;
    public Iterator d = d1.f8428a;
    public final p1 e;
    public final int f8414f;

    public b(p1 p1Var, int i10) {
        this.f8414f = i10;
        this.e = p1Var;
        this.f8411a = p1Var.e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8411a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8411a.next();
            this.f8412b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8413c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f8412b;
        Object next = this.d.next();
        switch (this.f8414f) {
            case 0:
                return next;
            default:
                return new j0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8413c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8411a.remove();
        }
        p1 p1Var = this.e;
        p1Var.f8485f--;
    }
}
