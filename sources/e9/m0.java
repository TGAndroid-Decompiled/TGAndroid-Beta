package e9;

import java.util.Iterator;
import java.util.ListIterator;
import v7.u6;
public final class m0 extends n0 {
    public final transient int f8473c;
    public final transient int d;
    public final n0 e;

    public m0(n0 n0Var, int i10, int i11) {
        this.e = n0Var;
        this.f8473c = i10;
        this.d = i11;
    }

    @Override
    public final n0 subList(int i10, int i11) {
        u6.n(i10, i11, this.d);
        int i12 = this.f8473c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final Object get(int i10) {
        u6.j(i10, this.d);
        return this.e.get(i10 + this.f8473c);
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
    public final Object[] n() {
        return this.e.n();
    }

    @Override
    public final int o() {
        return this.e.p() + this.f8473c + this.d;
    }

    @Override
    public final int p() {
        return this.e.p() + this.f8473c;
    }

    @Override
    public final boolean q() {
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
