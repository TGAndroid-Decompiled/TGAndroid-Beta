package f9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f10254a;
    public Object f10255b = null;
    public Collection f10256c = null;
    public Iterator d = y0.f10360a;
    public final k1 e;
    public final int f10257f;

    public b(k1 k1Var, int i10) {
        this.f10257f = i10;
        this.e = k1Var;
        this.f10254a = k1Var.e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f10254a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f10254a.next();
            this.f10255b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f10256c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f10255b;
        Object next = this.d.next();
        switch (this.f10257f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f10256c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f10254a.remove();
        }
        k1 k1Var = this.e;
        k1Var.f10293f--;
    }
}
