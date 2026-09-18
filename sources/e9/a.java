package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f8051a;
    public Object f8052b = null;
    public Collection f8053c = null;
    public Iterator d = o0.f8110a;
    public final v0 e;

    public a(v0 v0Var) {
        this.e = v0Var;
        this.f8051a = v0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8051a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8051a.next();
            this.f8052b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8053c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8053c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8051a.remove();
        }
        v0 v0Var = this.e;
        v0Var.e--;
    }
}
