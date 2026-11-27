package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
public final class fj7 extends r3 implements Serializable {
    public final transient Map e;
    public transient int f;
    public transient ej7 h;

    public fj7(Map map) {
        yve.f(map.isEmpty());
        this.e = map;
    }

    @Override
    public final void b() {
        Map map = this.e;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f = 0;
    }

    @Override
    public final Map d() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new g3(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new j3(this, (SortedMap) map);
        }
        return new e3(this, map, (byte) 0);
    }

    @Override
    public final Set f() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new h3(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new k3(this, (SortedMap) map);
        }
        return new f3(this, map);
    }

    @Override
    public final Collection g() {
        return super.g();
    }

    @Override
    public final Iterator h() {
        return new b3(this, (byte) 1);
    }

    @Override
    public final Collection i(Object obj) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection == null) {
            collection = m();
        }
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new m3(this, obj, list, (m3) null);
        }
        return new m3(this, obj, list, (m3) null);
    }

    @Override
    public final int l() {
        return this.f;
    }

    public final Collection m() {
        return (List) this.h.get();
    }
}
