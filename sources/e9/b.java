package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f8532a;
    public Object f8533b = null;
    public Collection f8534c = null;
    public Iterator d = d1.f8549a;
    public final p1 e;
    public final int f8535f;

    public b(p1 p1Var, int i10) {
        this.f8535f = i10;
        this.e = p1Var;
        this.f8532a = p1Var.e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8532a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8532a.next();
            this.f8533b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8534c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f8533b;
        Object next = this.d.next();
        switch (this.f8535f) {
            case 0:
                return next;
            default:
                return new j0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8534c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8532a.remove();
        }
        p1 p1Var = this.e;
        p1Var.f8606f--;
    }
}
