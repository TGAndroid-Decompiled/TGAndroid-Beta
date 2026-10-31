package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f6327a;
    public Object f6328b = null;
    public Collection f6329c = null;
    public Iterator d = d1.f6344a;
    public final p1 e;
    public final int f6330f;

    public b(p1 p1Var, int i10) {
        this.f6330f = i10;
        this.e = p1Var;
        this.f6327a = p1Var.e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f6327a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f6327a.next();
            this.f6328b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f6329c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f6328b;
        Object next = this.d.next();
        switch (this.f6330f) {
            case 0:
                return next;
            default:
                return new j0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f6329c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f6327a.remove();
        }
        p1 p1Var = this.e;
        p1Var.f6401f--;
    }
}
