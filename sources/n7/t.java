package n7;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
public abstract class t extends p implements NavigableSet, d0, SortedSet {
    public final transient Comparator d;
    public transient t e;

    public t(Comparator comparator) {
        this.d = comparator;
    }

    public static a0 x(Comparator comparator) {
        if (w.f14004b.equals(comparator)) {
            return a0.h;
        }
        j jVar = n.f13978b;
        return new a0(y.e, comparator);
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
        a0 a0Var = (a0) this;
        return a0Var.A(0, a0Var.y(obj, false));
    }

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
        a0 a0Var = (a0) this;
        return a0Var.A(a0Var.z(obj, true), a0Var.f13936f.size());
    }

    @Override
    public final t descendingSet() {
        a0 a0Var = this.e;
        if (a0Var == null) {
            a0 a0Var2 = (a0) this;
            Comparator reverseOrder = Collections.reverseOrder(a0Var2.d);
            if (a0Var2.isEmpty()) {
                a0Var = x(reverseOrder);
            } else {
                a0Var = new a0(a0Var2.f13936f.r(), reverseOrder);
            }
            this.e = a0Var;
            a0Var.e = this;
        }
        return a0Var;
    }

    @Override
    public final a0 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) <= 0) {
            a0 a0Var = (a0) this;
            a0 A = a0Var.A(a0Var.z(obj, z10), a0Var.f13936f.size());
            return A.A(0, A.y(obj2, z11));
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.A(0, a0Var.y(obj, z10));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        a0 a0Var = (a0) this;
        return a0Var.A(a0Var.z(obj, z10), a0Var.f13936f.size());
    }
}
