package h9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f13995a;
    public Object f13996b = null;
    public Collection f13997c = null;
    public Iterator d = y0.f14119a;
    public final l1 f13998e;
    public final int f13999f;

    public b(l1 l1Var, int i7) {
        this.f13999f = i7;
        this.f13998e = l1Var;
        this.f13995a = l1Var.f14048e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f13995a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f13995a.next();
            this.f13996b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f13997c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f13996b;
        Object next = this.d.next();
        switch (this.f13999f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f13997c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f13995a.remove();
        }
        l1 l1Var = this.f13998e;
        l1Var.f14049f--;
    }
}
