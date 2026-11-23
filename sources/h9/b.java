package h9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f13998a;
    public Object f13999b = null;
    public Collection f14000c = null;
    public Iterator d = y0.f14122a;
    public final l1 f14001e;
    public final int f14002f;

    public b(l1 l1Var, int i7) {
        this.f14002f = i7;
        this.f14001e = l1Var;
        this.f13998a = l1Var.f14051e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f13998a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f13998a.next();
            this.f13999b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f14000c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f13999b;
        Object next = this.d.next();
        switch (this.f14002f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f14000c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f13998a.remove();
        }
        l1 l1Var = this.f14001e;
        l1Var.f14052f--;
    }
}
