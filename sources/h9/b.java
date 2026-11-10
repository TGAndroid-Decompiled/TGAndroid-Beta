package h9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f14294a;
    public Object f14295b = null;
    public Collection f14296c = null;
    public Iterator d = y0.f14418a;
    public final l1 f14297e;
    public final int f14298f;

    public b(l1 l1Var, int i7) {
        this.f14298f = i7;
        this.f14297e = l1Var;
        this.f14294a = l1Var.f14347e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14294a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14294a.next();
            this.f14295b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f14296c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f14295b;
        Object next = this.d.next();
        switch (this.f14298f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f14296c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f14294a.remove();
        }
        l1 l1Var = this.f14297e;
        l1Var.f14348f--;
    }
}
