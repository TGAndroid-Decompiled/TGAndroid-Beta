package e9;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
public final class v0 extends o implements Serializable {
    public final transient Map d;
    public transient int f9019e;
    public transient u0 f9020f;

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
        Map map = this.f8986c;
        if (map == null) {
            Map map2 = this.d;
            if (map2 instanceof NavigableMap) {
                dVar = new f(this, (NavigableMap) map2);
            } else if (map2 instanceof SortedMap) {
                dVar = new i(this, (SortedMap) map2);
            } else {
                dVar = new d(this, map2, 0);
            }
            this.f8986c = dVar;
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
        this.f9019e = 0;
    }

    public final Collection c() {
        return (List) this.f9020f.get();
    }
}
