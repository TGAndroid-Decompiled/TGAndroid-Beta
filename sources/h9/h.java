package h9;

import a8.kb;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class h extends kb implements SortedMap {
    public SortedSet f14326f;
    public final l1 h;

    public h(l1 l1Var, SortedMap sortedMap) {
        super(l1Var, sortedMap, 2);
        this.h = l1Var;
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
        SortedSet sortedSet = this.f14326f;
        if (sortedSet == null) {
            SortedSet c10 = c();
            this.f14326f = c10;
            return c10;
        }
        return sortedSet;
    }

    public SortedMap e() {
        return (SortedMap) this.f513b;
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
