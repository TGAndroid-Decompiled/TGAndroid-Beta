package e9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f7352a;
    public Object f7353b = null;
    public Collection f7354c = null;
    public Iterator d = o0.f7411a;
    public final v0 e;

    public a(v0 v0Var) {
        this.e = v0Var;
        this.f7352a = v0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f7352a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f7352a.next();
            this.f7353b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f7354c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f7354c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f7352a.remove();
        }
        v0 v0Var = this.e;
        v0Var.e--;
    }
}
