package defpackage;

import java.util.List;
import java.util.ListIterator;
public final class gff extends c3 implements ListIterator {
    public final l3 e;

    public gff(l3 l3Var, int i) {
        super(l3Var, ((List) l3Var.c).listIterator(i), (char) 0);
        this.e = l3Var;
    }

    @Override
    public final void add(Object obj) {
        l3 l3Var = this.e;
        boolean isEmpty = l3Var.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        if (isEmpty) {
            l3Var.k();
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

    public gff(l3 l3Var) {
        super(l3Var, (char) 0);
        this.e = l3Var;
    }
}
