package h9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public abstract class l implements i1 {
    public transient Collection f13696a;
    public transient Set f13697b;
    public transient Collection f13698c;
    public transient Map d;

    @Override
    public Collection a() {
        Collection collection = this.f13696a;
        if (collection == null) {
            Collection e10 = e();
            this.f13696a = e10;
            return e10;
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
        if (obj instanceof i1) {
            return b().equals(((i1) obj).b());
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
        Set set = this.f13697b;
        if (set == null) {
            Set f10 = f();
            this.f13697b = f10;
            return f10;
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
