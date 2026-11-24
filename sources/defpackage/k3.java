package defpackage;

import java.util.List;
import java.util.ListIterator;
public final class k3 extends c3 implements ListIterator {
    public final l3 e;

    public k3(l3 l3Var, int i) {
        super(l3Var, ((List) l3Var.c).listIterator(i));
        this.e = l3Var;
    }

    @Override
    public final void add(Object obj) {
        l3 l3Var = this.e;
        boolean isEmpty = l3Var.isEmpty();
        c().add(obj);
        ((zi7) l3Var.h).f++;
        if (isEmpty) {
            l3Var.h();
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

    public k3(l3 l3Var) {
        super(l3Var);
        this.e = l3Var;
    }
}
