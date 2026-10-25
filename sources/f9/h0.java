package f9;

import a8.yb;
import java.util.Iterator;
import java.util.ListIterator;
public final class h0 extends i0 {
    public final transient int f10284c;
    public final transient int d;
    public final i0 e;

    public h0(i0 i0Var, int i10, int i11) {
        this.e = i0Var;
        this.f10284c = i10;
        this.d = i11;
    }

    @Override
    public final i0 subList(int i10, int i11) {
        yb.n(i10, i11, this.d);
        int i12 = this.f10284c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final Object get(int i10) {
        yb.j(i10, this.d);
        return this.e.get(i10 + this.f10284c);
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
        return this.e.p() + this.f10284c + this.d;
    }

    @Override
    public final int p() {
        return this.e.p() + this.f10284c;
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
