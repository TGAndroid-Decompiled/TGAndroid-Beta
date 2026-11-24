package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class j3 extends e3 implements SortedSet {
    public final wg7 d;

    public j3(wg7 wg7Var, SortedMap sortedMap) {
        super(wg7Var, sortedMap);
        this.d = wg7Var;
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
        return new j3(this.d, h().headMap(obj));
    }

    @Override
    public final Object last() {
        return h().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new j3(this.d, h().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new j3(this.d, h().tailMap(obj));
    }
}
