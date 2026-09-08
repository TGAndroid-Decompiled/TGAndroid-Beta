package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f8943a;
    public Object f8944b = null;
    public Collection f8945c = null;
    public Iterator d = o0.f9015a;
    public final v0 f8946e;

    public a(v0 v0Var) {
        this.f8946e = v0Var;
        this.f8943a = v0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8943a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8943a.next();
            this.f8944b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8945c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8945c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8943a.remove();
        }
        v0 v0Var = this.f8946e;
        v0Var.f9047e--;
    }
}
