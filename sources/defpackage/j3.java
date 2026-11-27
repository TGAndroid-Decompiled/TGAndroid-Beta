package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class j3 extends e3 implements SortedMap {
    public SortedSet f;
    public final fj7 h;

    public j3(fj7 fj7Var, SortedMap sortedMap) {
        super(fj7Var, sortedMap, (byte) 0);
        this.h = fj7Var;
    }

    public SortedSet c() {
        return new k3(this.h, e());
    }

    @Override
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet == null) {
            SortedSet c = c();
            this.f = c;
            return c;
        }
        return sortedSet;
    }

    public SortedMap e() {
        return (SortedMap) this.d;
    }

    @Override
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new j3(this.h, e().headMap(obj));
    }

    @Override
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new j3(this.h, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new j3(this.h, e().tailMap(obj));
    }
}
