package defpackage;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
public abstract class mod extends dnd implements NavigableSet, Iterable, SortedSet {
    public final transient Comparator s;
    public transient mod w;

    public mod(Comparator comparator) {
        super((byte) 4);
        this.s = comparator;
    }

    public static pqd E(Comparator comparator) {
        if (tpd.b != comparator) {
            ukd ukdVar = omd.n;
            return new pqd(fqd.w, comparator);
        }
        return pqd.y;
    }

    @Override
    public final mod descendingSet() {
        pqd pqdVar = this.w;
        if (pqdVar == null) {
            pqd pqdVar2 = (pqd) this;
            Comparator reverseOrder = Collections.reverseOrder(pqdVar2.s);
            if (pqdVar2.isEmpty()) {
                pqdVar = E(reverseOrder);
            } else {
                pqdVar = new pqd(pqdVar2.x.y(), reverseOrder);
            }
            this.w = pqdVar;
            pqdVar.w = this;
        }
        return pqdVar;
    }

    @Override
    public final pqd subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.s.compare(obj, obj2) <= 0) {
            pqd pqdVar = (pqd) this;
            pqd H = pqdVar.H(pqdVar.G(obj, z), pqdVar.x.size());
            return H.H(0, H.F(obj2, z2));
        }
        iy8.d();
        return null;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Comparator comparator() {
        return this.s;
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
        pqd pqdVar = (pqd) this;
        return pqdVar.H(0, pqdVar.F(obj, false));
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
        pqd pqdVar = (pqd) this;
        return pqdVar.H(pqdVar.G(obj, true), pqdVar.x.size());
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        pqd pqdVar = (pqd) this;
        return pqdVar.H(0, pqdVar.F(obj, z));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        pqd pqdVar = (pqd) this;
        return pqdVar.H(pqdVar.G(obj, z), pqdVar.x.size());
    }
}
