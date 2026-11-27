package defpackage;

import java.util.Iterator;
import java.util.ListIterator;
public final class oo5 extends po5 {
    public final transient int c;
    public final transient int d;
    public final po5 e;

    public oo5(po5 po5Var, int i, int i2) {
        this.e = po5Var;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final Object get(int i) {
        yve.j(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final Object[] j() {
        return this.e.j();
    }

    @Override
    public final int k() {
        return this.e.l() + this.c + this.d;
    }

    @Override
    public final int l() {
        return this.e.l() + this.c;
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final int size() {
        return this.d;
    }

    @Override
    public final po5 subList(int i, int i2) {
        yve.n(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override
    public final ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
