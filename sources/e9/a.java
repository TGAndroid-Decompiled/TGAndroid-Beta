package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f8047a;
    public Object f8048b = null;
    public Collection f8049c = null;
    public Iterator d = o0.f8106a;
    public final v0 e;

    public a(v0 v0Var) {
        this.e = v0Var;
        this.f8047a = v0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8047a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8047a.next();
            this.f8048b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8049c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8049c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8047a.remove();
        }
        v0 v0Var = this.e;
        v0Var.e--;
    }
}
