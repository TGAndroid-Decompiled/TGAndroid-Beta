package h9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f13959a;
    public Object f13960b = null;
    public Collection f13961c = null;
    public Iterator d = y0.f14082a;
    public final k1 f13962e;
    public final int f13963f;

    public b(k1 k1Var, int i7) {
        this.f13963f = i7;
        this.f13962e = k1Var;
        this.f13959a = k1Var.f14003e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f13959a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f13959a.next();
            this.f13960b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f13961c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f13960b;
        Object next = this.d.next();
        switch (this.f13963f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f13961c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f13959a.remove();
        }
        k1 k1Var = this.f13962e;
        k1Var.f14004f--;
    }
}
