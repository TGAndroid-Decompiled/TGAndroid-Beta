package n7;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
public abstract class s extends o implements NavigableSet, c0, SortedSet {
    public final transient Comparator d;
    public transient s f16801e;

    public s(Comparator comparator) {
        this.d = comparator;
    }

    public static z x(Comparator comparator) {
        if (v.f16810b.equals(comparator)) {
            return z.h;
        }
        i iVar = m.f16781b;
        return new z(x.f16815e, comparator);
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
        return zVar.A(0, zVar.y(obj, false));
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
        return zVar.A(zVar.z(obj, true), zVar.f16823f.size());
    }

    @Override
    public final s descendingSet() {
        z zVar = this.f16801e;
        if (zVar == null) {
            z zVar2 = (z) this;
            Comparator reverseOrder = Collections.reverseOrder(zVar2.d);
            if (zVar2.isEmpty()) {
                zVar = x(reverseOrder);
            } else {
                zVar = new z(zVar2.f16823f.r(), reverseOrder);
            }
            this.f16801e = zVar;
            zVar.f16801e = this;
        }
        return zVar;
    }

    @Override
    public final z subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) <= 0) {
            z zVar = (z) this;
            z A = zVar.A(zVar.z(obj, z10), zVar.f16823f.size());
            return A.A(0, A.y(obj2, z11));
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.A(0, zVar.y(obj, z10));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.A(zVar.z(obj, z10), zVar.f16823f.size());
    }
}
