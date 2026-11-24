package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public abstract class q3 {
    public transient Collection a;
    public transient Set b;
    public transient Collection c;
    public transient Map d;

    public Map a() {
        Map map = this.d;
        if (map == null) {
            Map d = d();
            this.d = d;
            return d;
        }
        return map;
    }

    public void b() {
        throw new UnsupportedOperationException();
    }

    public boolean c(Object obj) {
        for (Collection collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Map d() {
        throw new AssertionError("should never be called");
    }

    public Collection e() {
        return new p3(this, (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q3) {
            return a().equals(((q3) obj).a());
        }
        return false;
    }

    public Set f() {
        throw new AssertionError("unreachable");
    }

    public Collection g() {
        Collection collection = this.a;
        if (collection == null) {
            Collection e = e();
            this.a = e;
            return e;
        }
        return collection;
    }

    public abstract Iterator h();

    public final int hashCode() {
        return a().hashCode();
    }

    public abstract Collection i(Object obj);

    public Set j() {
        Set set = this.b;
        if (set == null) {
            Set f = f();
            this.b = f;
            return f;
        }
        return set;
    }

    public boolean k(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public abstract int l();

    public final String toString() {
        return a().toString();
    }
}
