package e9;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
public final class v0 extends o implements Serializable {
    public final transient Map d;
    public transient int f8819e;
    public transient u0 f8820f;

    public v0(Map map) {
        if (map.isEmpty()) {
            this.d = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final Map a() {
        Map dVar;
        Map map = this.f8786c;
        if (map == null) {
            Map map2 = this.d;
            if (map2 instanceof NavigableMap) {
                dVar = new f(this, (NavigableMap) map2);
            } else if (map2 instanceof SortedMap) {
                dVar = new i(this, (SortedMap) map2);
            } else {
                dVar = new d(this, map2, 0);
            }
            this.f8786c = dVar;
            return dVar;
        }
        return map;
    }

    public final void b() {
        Map map = this.d;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f8819e = 0;
    }

    public final Collection c() {
        return (List) this.f8820f.get();
    }
}
