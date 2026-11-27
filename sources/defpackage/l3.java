package defpackage;

import java.util.List;
import java.util.ListIterator;
public final class l3 extends d3 implements ListIterator {
    public final m3 e;

    public l3(m3 m3Var, int i) {
        super(m3Var, ((List) m3Var.c).listIterator(i));
        this.e = m3Var;
    }

    @Override
    public final void add(Object obj) {
        m3 m3Var = this.e;
        boolean isEmpty = m3Var.isEmpty();
        c().add(obj);
        ((gj7) m3Var.h).f++;
        if (isEmpty) {
            m3Var.h();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.b;
    }

    @Override
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override
    public final Object previous() {
        return c().previous();
    }

    @Override
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override
    public final void set(Object obj) {
        c().set(obj);
    }

    public l3(m3 m3Var) {
        super(m3Var);
        this.e = m3Var;
    }
}
