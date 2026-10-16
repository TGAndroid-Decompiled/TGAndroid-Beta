package e9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class j extends e implements SortedMap {
    public SortedSet f8580f;
    public final p1 h;

    public j(p1 p1Var, SortedMap sortedMap) {
        super(p1Var, sortedMap, 0);
        this.h = p1Var;
    }

    public SortedSet b() {
        return new k(this.h, d());
    }

    @Override
    public SortedSet keySet() {
        SortedSet sortedSet = this.f8580f;
        if (sortedSet == null) {
            SortedSet b10 = b();
            this.f8580f = b10;
            return b10;
        }
        return sortedSet;
    }

    @Override
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f8554b;
    }

    @Override
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new j(this.h, d().headMap(obj));
    }

    @Override
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new j(this.h, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new j(this.h, d().tailMap(obj));
    }
}
