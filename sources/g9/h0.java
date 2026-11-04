package g9;

import b8.zb;
import java.util.Iterator;
import java.util.ListIterator;
public final class h0 extends i0 {
    public final transient int f12079c;
    public final transient int d;
    public final i0 f12080e;

    public h0(i0 i0Var, int i3, int i10) {
        this.f12080e = i0Var;
        this.f12079c = i3;
        this.d = i10;
    }

    @Override
    public final Object get(int i3) {
        zb.j(i3, this.d);
        return this.f12080e.get(i3 + this.f12079c);
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final Object[] j() {
        return this.f12080e.j();
    }

    @Override
    public final int k() {
        return this.f12080e.l() + this.f12079c + this.d;
    }

    @Override
    public final int l() {
        return this.f12080e.l() + this.f12079c;
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
    public final i0 subList(int i3, int i10) {
        zb.n(i3, i10, this.d);
        int i11 = this.f12079c;
        return this.f12080e.subList(i3 + i11, i10 + i11);
    }

    @Override
    public final ListIterator listIterator(int i3) {
        return listIterator(i3);
    }
}
