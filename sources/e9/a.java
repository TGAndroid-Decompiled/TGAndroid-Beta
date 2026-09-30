package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f8046a;
    public Object f8047b = null;
    public Collection f8048c = null;
    public Iterator d = o0.f8105a;
    public final v0 e;

    public a(v0 v0Var) {
        this.e = v0Var;
        this.f8046a = v0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8046a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8046a.next();
            this.f8047b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8048c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8048c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8046a.remove();
        }
        v0 v0Var = this.e;
        v0Var.e--;
    }
}
