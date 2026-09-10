package e9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class i extends d implements SortedMap {
    public SortedSet f7383f;
    public final v0 h;

    public i(v0 v0Var, SortedMap sortedMap) {
        super(v0Var, sortedMap, 0);
        this.h = v0Var;
    }

    public SortedSet b() {
        return new j(this.h, d());
    }

    @Override
    public SortedSet keySet() {
        SortedSet sortedSet = this.f7383f;
        if (sortedSet == null) {
            SortedSet b10 = b();
            this.f7383f = b10;
            return b10;
        }
        return sortedSet;
    }

    @Override
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f7364b;
    }

    @Override
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new i(this.h, d().headMap(obj));
    }

    @Override
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i(this.h, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i(this.h, d().tailMap(obj));
    }
}
