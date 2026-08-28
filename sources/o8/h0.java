package o8;

import h7.wa;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
public final class h0 extends k implements Serializable {
    public transient Map d;
    public transient int f19047e;
    public transient g0 f19048f;

    @Override
    public final wa a() {
        wa waVar;
        wa waVar2 = this.f19055c;
        if (waVar2 == null) {
            Map map = this.d;
            if (map instanceof NavigableMap) {
                waVar = new d(this, (NavigableMap) map);
            } else if (map instanceof SortedMap) {
                waVar = new g(this, (SortedMap) map);
            } else {
                waVar = new wa(this, map, 2);
            }
            this.f19055c = waVar;
            return waVar;
        }
        return waVar2;
    }

    public final void b() {
        Map map = this.d;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f19047e = 0;
    }
}
