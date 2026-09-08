package e9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class j extends e implements SortedSet {
    public final v0 d;

    public j(v0 v0Var, SortedMap sortedMap) {
        super(v0Var, sortedMap);
        this.d = v0Var;
    }

    @Override
    public final Comparator comparator() {
        return i().comparator();
    }

    @Override
    public final Object first() {
        return i().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new j(this.d, i().headMap(obj));
    }

    public SortedMap i() {
        return (SortedMap) this.f8963b;
    }

    @Override
    public final Object last() {
        return i().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new j(this.d, i().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new j(this.d, i().tailMap(obj));
    }
}
