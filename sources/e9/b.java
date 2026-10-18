package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f8414a;
    public Object f8415b = null;
    public Collection f8416c = null;
    public Iterator d = d1.f8431a;
    public final p1 e;
    public final int f8417f;

    public b(p1 p1Var, int i10) {
        this.f8417f = i10;
        this.e = p1Var;
        this.f8414a = p1Var.e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8414a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8414a.next();
            this.f8415b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8416c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f8415b;
        Object next = this.d.next();
        switch (this.f8417f) {
            case 0:
                return next;
            default:
                return new j0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8416c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8414a.remove();
        }
        p1 p1Var = this.e;
        p1Var.f8488f--;
    }
}
