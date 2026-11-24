package defpackage;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public final class a3 implements Iterator {
    public final Iterator a;
    public Object b = null;
    public Collection c = null;
    public Iterator d = ms5.a;
    public final wg7 e;
    public final byte f;

    public a3(wg7 wg7Var, byte b) {
        this.f = b;
        this.e = wg7Var;
        this.a = wg7Var.e.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        if (!this.a.hasNext() && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.b;
        Object next = this.d.next();
        switch (this.f) {
            case 0:
                return next;
            default:
                return new hm5(obj, next);
        }
    }

    @Override
    public final void remove() {
        this.d.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.a.remove();
        }
        wg7 wg7Var = this.e;
        wg7Var.f--;
    }
}
