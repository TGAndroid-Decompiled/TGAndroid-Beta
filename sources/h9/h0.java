package h9;

import a8.ja;
import java.util.Iterator;
import java.util.ListIterator;
public final class h0 extends i0 {
    public final transient int f13682c;
    public final transient int d;
    public final i0 f13683e;

    public h0(i0 i0Var, int i7, int i10) {
        this.f13683e = i0Var;
        this.f13682c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        ja.j(i7, this.d);
        return this.f13683e.get(i7 + this.f13682c);
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final Object[] j() {
        return this.f13683e.j();
    }

    @Override
    public final int k() {
        return this.f13683e.l() + this.f13682c + this.d;
    }

    @Override
    public final int l() {
        return this.f13683e.l() + this.f13682c;
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
        ja.n(i7, i10, this.d);
        int i11 = this.f13682c;
        return this.f13683e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final ListIterator listIterator(int i7) {
        return listIterator(i7);
    }
}
