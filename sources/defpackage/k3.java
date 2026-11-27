package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class k3 extends f3 implements SortedSet {
    public final fj7 d;

    public k3(fj7 fj7Var, SortedMap sortedMap) {
        super(fj7Var, sortedMap);
        this.d = fj7Var;
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
        return (SortedMap) this.b;
    }

    public SortedSet headSet(Object obj) {
        return new k3(this.d, h().headMap(obj));
    }

    @Override
    public final Object last() {
        return h().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new k3(this.d, h().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new k3(this.d, h().tailMap(obj));
    }
}
