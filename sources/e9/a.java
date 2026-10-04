package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f8716a;
    public Object f8717b = null;
    public Collection f8718c = null;
    public Iterator d = o0.f8788a;
    public final v0 f8719e;

    public a(v0 v0Var) {
        this.f8719e = v0Var;
        this.f8716a = v0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8716a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8716a.next();
            this.f8717b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8718c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8718c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8716a.remove();
        }
        v0 v0Var = this.f8719e;
        v0Var.f8820e--;
    }
}
