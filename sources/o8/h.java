package o8;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class h extends c implements SortedSet {
    public final h0 d;

    public h(h0 h0Var, SortedMap sortedMap) {
        super(h0Var, sortedMap);
        this.d = h0Var;
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
        return new h(this.d, i().headMap(obj));
    }

    public SortedMap i() {
        return (SortedMap) this.f19031b;
    }

    @Override
    public final Object last() {
        return i().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new h(this.d, i().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new h(this.d, i().tailMap(obj));
    }
}
