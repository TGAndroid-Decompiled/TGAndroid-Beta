package f9;

import a8.dh;
import a8.pb;
import a8.yb;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
public final class k1 extends l implements a1, Serializable {
    public final transient Map e;
    public transient int f10292f;
    public transient j1 h;

    public k1(Map map) {
        yb.g(map.isEmpty());
        this.e = map;
    }

    @Override
    public final void clear() {
        Map map = this.e;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f10292f = 0;
    }

    @Override
    public final Map d() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new e(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new h(this, (SortedMap) map);
        }
        return new pb(this, map, 1);
    }

    @Override
    public final Collection e() {
        return new a8.f(this, 2);
    }

    @Override
    public final Set f() {
        Map map = this.e;
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
        Collection collection = (Collection) this.e.get(obj);
        if (collection == null) {
            collection = h();
        }
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new dh(this, obj, list, (dh) null);
        }
        return new dh(this, obj, list, (dh) null);
    }

    public final Collection h() {
        return (List) this.h.get();
    }

    @Override
    public final int size() {
        return this.f10292f;
    }
}
