package h9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f13969a;
    public Object f13970b = null;
    public Collection f13971c = null;
    public Iterator d = y0.f14093a;
    public final l1 f13972e;
    public final int f13973f;

    public b(l1 l1Var, int i7) {
        this.f13973f = i7;
        this.f13972e = l1Var;
        this.f13969a = l1Var.f14022e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f13969a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f13969a.next();
            this.f13970b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f13971c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f13970b;
        Object next = this.d.next();
        switch (this.f13973f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f13971c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f13969a.remove();
        }
        l1 l1Var = this.f13972e;
        l1Var.f14023f--;
    }
}
