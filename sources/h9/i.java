package h9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class i extends d implements SortedSet {
    public final l1 d;

    public i(l1 l1Var, SortedMap sortedMap) {
        super(l1Var, sortedMap);
        this.d = l1Var;
    }

    @Override
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedMap f() {
        return (SortedMap) this.f14309b;
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
