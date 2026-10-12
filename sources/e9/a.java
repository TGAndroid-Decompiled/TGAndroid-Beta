package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f8707a;
    public Object f8708b = null;
    public Collection f8709c = null;
    public Iterator d = o0.f8779a;
    public final v0 f8710e;

    public a(v0 v0Var) {
        this.f8710e = v0Var;
        this.f8707a = v0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8707a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8707a.next();
            this.f8708b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8709c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f8709c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8707a.remove();
        }
        v0 v0Var = this.f8710e;
        v0Var.f8811e--;
    }
}
