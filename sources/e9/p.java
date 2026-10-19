package e9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public abstract class p implements n1 {
    public transient Collection f8479a;
    public transient Set f8480b;
    public transient Collection f8481c;
    public transient Map d;

    @Override
    public Collection a() {
        Collection collection = this.f8479a;
        if (collection == null) {
            Collection e = e();
            this.f8479a = e;
            return e;
        }
        return collection;
    }

    @Override
    public Map b() {
        Map map = this.d;
        if (map == null) {
            Map d = d();
            this.d = d;
            return d;
        }
        return map;
    }

    public boolean c(Object obj) {
        for (Collection collection : b().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map d();

    public abstract Collection e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            return b().equals(((n1) obj).b());
        }
        return false;
    }

    public abstract Set f();

    public abstract Iterator g();

    public final int hashCode() {
        return b().hashCode();
    }

    @Override
    public Set keySet() {
        Set set = this.f8480b;
        if (set == null) {
            Set f7 = f();
            this.f8480b = f7;
            return f7;
        }
        return set;
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return b().toString();
    }
}
