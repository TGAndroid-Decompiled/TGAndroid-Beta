package h9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f13650a;
    public Object f13651b = null;
    public Collection f13652c = null;
    public Iterator d = y0.f13773a;
    public final k1 f13653e;
    public final int f13654f;

    public b(k1 k1Var, int i7) {
        this.f13654f = i7;
        this.f13653e = k1Var;
        this.f13650a = k1Var.f13694e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f13650a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f13650a.next();
            this.f13651b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f13652c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f13651b;
        Object next = this.d.next();
        switch (this.f13654f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f13652c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f13650a.remove();
        }
        k1 k1Var = this.f13653e;
        k1Var.f13695f--;
    }
}
