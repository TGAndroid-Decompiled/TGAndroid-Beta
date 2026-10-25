package f9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class i extends d implements SortedSet {
    public final k1 d;

    public i(k1 k1Var, SortedMap sortedMap) {
        super(k1Var, sortedMap);
        this.d = k1Var;
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
        return (SortedMap) this.f10271b;
    }

    public SortedSet headSet(Object obj) {
        return new i(this.d, h().headMap(obj));
    }

    @Override
    public final Object last() {
        return h().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new i(this.d, h().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new i(this.d, h().tailMap(obj));
    }
}
