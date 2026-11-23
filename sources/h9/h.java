package h9;

import a8.lb;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class h extends lb implements SortedMap {
    public SortedSet f13990f;
    public final k1 h;

    public h(k1 k1Var, SortedMap sortedMap) {
        super(k1Var, sortedMap, 2);
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
        SortedSet sortedSet = this.f13990f;
        if (sortedSet == null) {
            SortedSet c10 = c();
            this.f13990f = c10;
            return c10;
        }
        return sortedSet;
    }

    public SortedMap e() {
        return (SortedMap) this.f533b;
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
