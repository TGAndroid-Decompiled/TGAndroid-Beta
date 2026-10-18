package e9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class k extends f implements SortedSet {
    public final p1 d;

    public k(p1 p1Var, SortedMap sortedMap) {
        super(p1Var, sortedMap);
        this.d = p1Var;
    }

    @Override
    public final Comparator comparator() {
        return h().comparator();
    }

    @Override
    public final Object first() {
        return h().firstKey();
    }

    public SortedMap h() {
        return (SortedMap) this.f8444b;
    }

    public SortedSet headSet(Object obj) {
        return new k(this.d, h().headMap(obj));
    }

    @Override
    public final Object last() {
        return h().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new k(this.d, h().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new k(this.d, h().tailMap(obj));
    }
}
