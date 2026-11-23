package h9;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class b implements Iterator {
    public final Iterator f13961a;
    public Object f13962b = null;
    public Collection f13963c = null;
    public Iterator d = y0.f14085a;
    public final l1 f13964e;
    public final int f13965f;

    public b(l1 l1Var, int i7) {
        this.f13965f = i7;
        this.f13964e = l1Var;
        this.f13961a = l1Var.f14014e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.f13961a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f13961a.next();
            this.f13962b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f13963c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.f13962b;
        Object next = this.d.next();
        switch (this.f13965f) {
            case 0:
                return next;
            default:
                return new e0(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.f13963c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f13961a.remove();
        }
        l1 l1Var = this.f13964e;
        l1Var.f14015f--;
    }
}
