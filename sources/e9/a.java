package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f8915a;
    public Object f8916b = null;
    public Collection f8917c = null;
    public Iterator d = o0.f8987a;
    public final v0 f8918e;

    public a(v0 v0Var) {
        this.f8918e = v0Var;
        this.f8915a = v0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8915a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8915a.next();
            this.f8916b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8917c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8917c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8915a.remove();
        }
        v0 v0Var = this.f8918e;
        v0Var.f9019e--;
    }
}
