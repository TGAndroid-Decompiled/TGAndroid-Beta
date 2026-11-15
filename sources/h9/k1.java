package h9;

import a8.ja;
import a8.lb;
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
    public final transient Map f13694e;
    public transient int f13695f;
    public transient j1 h;

    public k1(Map map) {
        ja.f(map.isEmpty());
        this.f13694e = map;
    }

    @Override
    public final void clear() {
        Map map = this.f13694e;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f13695f = 0;
    }

    @Override
    public final Map d() {
        Map map = this.f13694e;
        if (map instanceof NavigableMap) {
            return new e(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new h(this, (SortedMap) map);
        }
        return new lb(this, map, 2);
    }

    @Override
    public final Collection e() {
        return new a8.n(this, 4);
    }

    @Override
    public final Set f() {
        Map map = this.f13694e;
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
        Collection collection = (Collection) this.f13694e.get(obj);
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
        return this.f13695f;
    }
}
