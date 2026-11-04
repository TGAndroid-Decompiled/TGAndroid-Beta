package g9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f12047a;
    public Object f12048b = null;
    public Collection f12049c = null;
    public Iterator d = y0.f12170a;
    public final k1 f12050e;
    public final int f12051f;

    public b(k1 k1Var, int i3) {
        this.f12051f = i3;
        this.f12050e = k1Var;
        this.f12047a = k1Var.f12091e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f12047a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f12047a.next();
            this.f12048b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f12049c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f12048b;
        Object next = this.d.next();
        switch (this.f12051f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f12049c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f12047a.remove();
        }
        k1 k1Var = this.f12050e;
        k1Var.f12092f--;
    }
}
