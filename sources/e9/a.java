package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f8709a;
    public Object f8710b = null;
    public Collection f8711c = null;
    public Iterator d = o0.f8781a;
    public final v0 f8712e;

    public a(v0 v0Var) {
        this.f8712e = v0Var;
        this.f8709a = v0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8709a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8709a.next();
            this.f8710b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8711c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8711c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8709a.remove();
        }
        v0 v0Var = this.f8712e;
        v0Var.f8813e--;
    }
}
