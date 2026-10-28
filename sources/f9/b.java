package f9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f10253a;
    public Object f10254b = null;
    public Collection f10255c = null;
    public Iterator d = y0.f10359a;
    public final k1 e;
    public final int f10256f;

    public b(k1 k1Var, int i10) {
        this.f10256f = i10;
        this.e = k1Var;
        this.f10253a = k1Var.e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f10253a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f10253a.next();
            this.f10254b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f10255c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f10254b;
        Object next = this.d.next();
        switch (this.f10256f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f10255c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f10253a.remove();
        }
        k1 k1Var = this.e;
        k1Var.f10292f--;
    }
}
