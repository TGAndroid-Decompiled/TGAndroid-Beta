package e9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import v7.u6;
public final class p1 extends p implements f1, Serializable {
    public final transient Map e;
    public transient int f8606f;
    public transient o1 h;

    public p1(Map map) {
        u6.g(map.isEmpty());
        this.e = map;
    }

    @Override
    public final void clear() {
        Map map = this.e;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f8606f = 0;
    }

    @Override
    public final Map d() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new g(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new j(this, (SortedMap) map);
        }
        return new e(this, map, 0);
    }

    @Override
    public final Collection e() {
        return new o(this, 0);
    }

    @Override
    public final Set f() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new h(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new k(this, (SortedMap) map);
        }
        return new f(this, map);
    }

    @Override
    public final Iterator g() {
        return new b(this, 1);
    }

    @Override
    public final Collection get(Object obj) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection == null) {
            collection = h();
        }
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new m(this, obj, list, (m) null);
        }
        return new m(this, obj, list, (m) null);
    }

    public final Collection h() {
        return (List) this.h.get();
    }

    @Override
    public final int size() {
        return this.f8606f;
    }
}
