package h9;

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
        return f().comparator();
    }

    public SortedMap f() {
        return (SortedMap) this.f13977b;
    }

    @Override
    public final Object first() {
        return f().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new i(this.d, f().headMap(obj));
    }

    @Override
    public final Object last() {
        return f().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new i(this.d, f().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new i(this.d, f().tailMap(obj));
    }
}
