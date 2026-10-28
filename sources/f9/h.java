package f9;

import a8.pb;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class h extends pb implements SortedMap {
    public SortedSet f10282f;
    public final k1 h;

    public h(k1 k1Var, SortedMap sortedMap) {
        super(k1Var, sortedMap, 1);
        this.h = k1Var;
    }

    public SortedSet b() {
        return new i(this.h, d());
    }

    @Override
    public SortedSet keySet() {
        SortedSet sortedSet = this.f10282f;
        if (sortedSet == null) {
            SortedSet b10 = b();
            this.f10282f = b10;
            return b10;
        }
        return sortedSet;
    }

    @Override
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f739b;
    }

    @Override
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new h(this.h, d().headMap(obj));
    }

    @Override
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new h(this.h, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new h(this.h, d().tailMap(obj));
    }
}
