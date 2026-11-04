package g9;

import b8.mb;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class h extends mb implements SortedMap {
    public SortedSet f12078f;
    public final k1 h;

    public h(k1 k1Var, SortedMap sortedMap) {
        super(k1Var, sortedMap, 1);
        this.h = k1Var;
    }

    public SortedSet c() {
        return new i(this.h, e());
    }

    @Override
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override
    public SortedSet keySet() {
        SortedSet sortedSet = this.f12078f;
        if (sortedSet == null) {
            SortedSet c2 = c();
            this.f12078f = c2;
            return c2;
        }
        return sortedSet;
    }

    public SortedMap e() {
        return (SortedMap) this.f2754b;
    }

    @Override
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new h(this.h, e().headMap(obj));
    }

    @Override
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new h(this.h, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new h(this.h, e().tailMap(obj));
    }
}
