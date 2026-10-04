package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f8715a;
    public Object f8716b = null;
    public Collection f8717c = null;
    public Iterator d = o0.f8787a;
    public final v0 f8718e;

    public a(v0 v0Var) {
        this.f8718e = v0Var;
        this.f8715a = v0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8715a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8715a.next();
            this.f8716b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8717c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8717c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8715a.remove();
        }
        v0 v0Var = this.f8718e;
        v0Var.f8819e--;
    }
}
