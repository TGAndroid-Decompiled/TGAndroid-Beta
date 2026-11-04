package g9;

import b8.ah;
import b8.mb;
import b8.zb;
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
    public final transient Map f12091e;
    public transient int f12092f;
    public transient j1 h;

    public k1(Map map) {
        zb.f(map.isEmpty());
        this.f12091e = map;
    }

    @Override
    public final void clear() {
        Map map = this.f12091e;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f12092f = 0;
    }

    @Override
    public final Map d() {
        Map map = this.f12091e;
        if (map instanceof NavigableMap) {
            return new e(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new h(this, (SortedMap) map);
        }
        return new mb(this, map, 1);
    }

    @Override
    public final Collection e() {
        return new b8.f(this, 2);
    }

    @Override
    public final Set f() {
        Map map = this.f12091e;
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
        Collection collection = (Collection) this.f12091e.get(obj);
        if (collection == null) {
            collection = h();
        }
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new ah(this, obj, list, (ah) null);
        }
        return new ah(this, obj, list, (ah) null);
    }

    public final Collection h() {
        return (List) this.h.get();
    }

    @Override
    public final int size() {
        return this.f12092f;
    }
}
