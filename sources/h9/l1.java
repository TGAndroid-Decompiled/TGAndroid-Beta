package h9;

import a8.ia;
import a8.kb;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
public final class l1 extends l implements a1, Serializable {
    public final transient Map f14345e;
    public transient int f14346f;
    public transient k1 h;

    public l1(Map map) {
        ia.f(map.isEmpty());
        this.f14345e = map;
    }

    @Override
    public final void clear() {
        Map map = this.f14345e;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f14346f = 0;
    }

    @Override
    public final Map d() {
        Map map = this.f14345e;
        if (map instanceof NavigableMap) {
            return new e(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new h(this, (SortedMap) map);
        }
        return new kb(this, map, 2);
    }

    @Override
    public final Collection e() {
        return new a8.n(this, 4);
    }

    @Override
    public final Set f() {
        Map map = this.f14345e;
        if (map instanceof NavigableMap) {
            return new f(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new i(this, (SortedMap) map);
        }
        return new d(this, map);
    }

    @Override
    public final Iterator g() {
        return new b(this, 1);
    }

    @Override
    public final Collection get(Object obj) {
        Collection collection = (Collection) this.f14345e.get(obj);
        if (collection == null) {
            collection = h();
        }
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new a8.f(this, obj, list, (a8.f) null);
        }
        return new a8.f(this, obj, list, (a8.f) null);
    }

    public final Collection h() {
        return (List) this.h.get();
    }

    @Override
    public final int size() {
        return this.f14346f;
    }
}
