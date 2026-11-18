package h9;

import a8.la;
import java.util.Iterator;
import java.util.ListIterator;
public final class h0 extends i0 {
    public final transient int f14004c;
    public final transient int d;
    public final i0 f14005e;

    public h0(i0 i0Var, int i7, int i10) {
        this.f14005e = i0Var;
        this.f14004c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        la.j(i7, this.d);
        return this.f14005e.get(i7 + this.f14004c);
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final Object[] j() {
        return this.f14005e.j();
    }

    @Override
    public final int k() {
        return this.f14005e.l() + this.f14004c + this.d;
    }

    @Override
    public final int l() {
        return this.f14005e.l() + this.f14004c;
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
    public final i0 subList(int i7, int i10) {
        la.n(i7, i10, this.d);
        int i11 = this.f14004c;
        return this.f14005e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final ListIterator listIterator(int i7) {
        return listIterator(i7);
    }
}
