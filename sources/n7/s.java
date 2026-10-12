package n7;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
public abstract class s extends o implements NavigableSet, c0, SortedSet {
    public final transient Comparator d;
    public transient s e;

    public s(Comparator comparator) {
        this.d = comparator;
    }

    public static z w(Comparator comparator) {
        if (v.f16226b.equals(comparator)) {
            return z.h;
        }
        i iVar = m.f16200b;
        return new z(x.e, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Comparator comparator() {
        return this.d;
    }

    @Override
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override
    public final java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.z(0, zVar.x(obj, false));
    }

    @Override
    public abstract Object last();

    @Override
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override
    public final java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.z(zVar.y(obj, true), zVar.f16237f.size());
    }

    @Override
    public final s descendingSet() {
        z zVar = this.e;
        if (zVar == null) {
            z zVar2 = (z) this;
            Comparator reverseOrder = Collections.reverseOrder(zVar2.d);
            if (zVar2.isEmpty()) {
                zVar = w(reverseOrder);
            } else {
                zVar = new z(zVar2.f16237f.q(), reverseOrder);
            }
            this.e = zVar;
            zVar.e = this;
        }
        return zVar;
    }

    @Override
    public final z subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) <= 0) {
            z zVar = (z) this;
            z z12 = zVar.z(zVar.y(obj, z10), zVar.f16237f.size());
            return z12.z(0, z12.x(obj2, z11));
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.z(0, zVar.x(obj, z10));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.z(zVar.y(obj, z10), zVar.f16237f.size());
    }
}
