package e9;

import java.util.Iterator;
import java.util.ListIterator;
import v7.t6;
public final class h0 extends i0 {
    public final transient int f7381c;
    public final transient int d;
    public final i0 e;

    public h0(i0 i0Var, int i10, int i11) {
        this.e = i0Var;
        this.f7381c = i10;
        this.d = i11;
    }

    @Override
    public final i0 subList(int i10, int i11) {
        t6.f(i10, i11, this.d);
        int i12 = this.f7381c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final Object get(int i10) {
        t6.c(i10, this.d);
        return this.e.get(i10 + this.f7381c);
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final int p() {
        return this.e.q() + this.f7381c + this.d;
    }

    @Override
    public final int q() {
        return this.e.q() + this.f7381c;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.d;
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
