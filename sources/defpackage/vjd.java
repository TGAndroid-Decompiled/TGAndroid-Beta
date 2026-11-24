package defpackage;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
public abstract class vjd extends mid implements NavigableSet, Iterable, SortedSet {
    public final transient Comparator s;
    public transient vjd w;

    public vjd(Comparator comparator) {
        super((byte) 4);
        this.s = comparator;
    }

    public static yld E(Comparator comparator) {
        if (cld.b != comparator) {
            dgd dgdVar = xhd.n;
            return new yld(old.w, comparator);
        }
        return yld.y;
    }

    @Override
    public final vjd descendingSet() {
        yld yldVar = this.w;
        if (yldVar == null) {
            yld yldVar2 = (yld) this;
            Comparator reverseOrder = Collections.reverseOrder(yldVar2.s);
            if (yldVar2.isEmpty()) {
                yldVar = E(reverseOrder);
            } else {
                yldVar = new yld(yldVar2.x.y(), reverseOrder);
            }
            this.w = yldVar;
            yldVar.w = this;
        }
        return yldVar;
    }

    @Override
    public final yld subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.s.compare(obj, obj2) <= 0) {
            yld yldVar = (yld) this;
            yld H = yldVar.H(yldVar.G(obj, z), yldVar.x.size());
            return H.H(0, H.F(obj2, z2));
        }
        sc8.e();
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
        yld yldVar = (yld) this;
        return yldVar.H(0, yldVar.F(obj, false));
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
        yld yldVar = (yld) this;
        return yldVar.H(yldVar.G(obj, true), yldVar.x.size());
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        yld yldVar = (yld) this;
        return yldVar.H(0, yldVar.F(obj, z));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        yld yldVar = (yld) this;
        return yldVar.H(yldVar.G(obj, z), yldVar.x.size());
    }
}
