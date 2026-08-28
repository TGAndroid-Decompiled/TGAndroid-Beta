package o8;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a implements Iterator {
    public final Iterator f19020a;
    public Object f19021b = null;
    public Collection f19022c = null;
    public Iterator d = f0.f19043a;
    public final h0 f19023e;

    public a(h0 h0Var) {
        this.f19023e = h0Var;
        this.f19020a = h0Var.d.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f19020a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f19020a.next();
            this.f19021b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f19022c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f19022c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f19020a.remove();
        }
        h0 h0Var = this.f19023e;
        h0Var.f19047e--;
    }
}
