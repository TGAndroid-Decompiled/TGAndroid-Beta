package b7;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
public abstract class v extends q implements NavigableSet, f0, SortedSet {
    public final transient Comparator d;
    public transient v f1878e;

    public v(Comparator comparator) {
        this.d = comparator;
    }

    public static c0 x(Comparator comparator) {
        if (y.f1886b.equals(comparator)) {
            return c0.h;
        }
        k kVar = o.f1856b;
        return new c0(a0.f1799e, comparator);
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
        c0 c0Var = (c0) this;
        return c0Var.A(0, c0Var.y(obj, false));
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
        c0 c0Var = (c0) this;
        return c0Var.A(c0Var.z(obj, true), c0Var.f1812f.size());
    }

    @Override
    public final v descendingSet() {
        c0 c0Var = this.f1878e;
        if (c0Var == null) {
            c0 c0Var2 = (c0) this;
            Comparator reverseOrder = Collections.reverseOrder(c0Var2.d);
            if (c0Var2.isEmpty()) {
                c0Var = x(reverseOrder);
            } else {
                c0Var = new c0(c0Var2.f1812f.r(), reverseOrder);
            }
            this.f1878e = c0Var;
            c0Var.f1878e = this;
        }
        return c0Var;
    }

    @Override
    public final c0 subSet(Object obj, boolean z4, Object obj2, boolean z10) {
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) <= 0) {
            c0 c0Var = (c0) this;
            c0 A = c0Var.A(c0Var.z(obj, z4), c0Var.f1812f.size());
            return A.A(0, A.y(obj2, z10));
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z4) {
        obj.getClass();
        c0 c0Var = (c0) this;
        return c0Var.A(0, c0Var.y(obj, z4));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z4) {
        obj.getClass();
        c0 c0Var = (c0) this;
        return c0Var.A(c0Var.z(obj, z4), c0Var.f1812f.size());
    }
}
