package defpackage;

import java.util.List;
import java.util.ListIterator;
public final class wjf extends d3 implements ListIterator {
    public final m3 e;

    public wjf(m3 m3Var, int i) {
        super(m3Var, ((List) m3Var.c).listIterator(i), (char) 0);
        this.e = m3Var;
    }

    @Override
    public final void add(Object obj) {
        m3 m3Var = this.e;
        boolean isEmpty = m3Var.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        if (isEmpty) {
            m3Var.k();
        }
    }

    @Override
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        b();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override
    public final Object previous() {
        b();
        return ((ListIterator) this.b).previous();
    }

    @Override
    public final int previousIndex() {
        b();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b();
        ((ListIterator) this.b).set(obj);
    }

    public wjf(m3 m3Var) {
        super(m3Var, (char) 0);
        this.e = m3Var;
    }
}
