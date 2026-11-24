package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
public class i3 extends d3 implements SortedMap {
    public SortedSet f;
    public final wg7 h;

    public i3(wg7 wg7Var, SortedMap sortedMap) {
        super(wg7Var, sortedMap, (byte) 0);
        this.h = wg7Var;
    }

    public SortedSet c() {
        return new j3(this.h, e());
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
        return new i3(this.h, e().headMap(obj));
    }

    @Override
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i3(this.h, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i3(this.h, e().tailMap(obj));
    }
}
