package h9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f13966a;
    public Object f13967b = null;
    public Collection f13968c = null;
    public Iterator d = y0.f14090a;
    public final l1 f13969e;
    public final int f13970f;

    public b(l1 l1Var, int i7) {
        this.f13970f = i7;
        this.f13969e = l1Var;
        this.f13966a = l1Var.f14019e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f13966a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f13966a.next();
            this.f13967b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f13968c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f13967b;
        Object next = this.d.next();
        switch (this.f13970f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f13968c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f13966a.remove();
        }
        l1 l1Var = this.f13969e;
        l1Var.f14020f--;
    }
}
