package c7;

import g7.j0;

public final class t extends u {

    public final transient int f2494c;
    public final transient int d;

    public final u f2495e;

    public t(u uVar, int i10, int i11) {
        this.f2495e = uVar;
        this.f2494c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        j0.a(i10, this.d);
        return this.f2495e.get(i10 + this.f2494c);
    }

    @Override
    public final int n() {
        return this.f2495e.o() + this.f2494c + this.d;
    }

    @Override
    public final int o() {
        return this.f2495e.o() + this.f2494c;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final Object[] q() {
        return this.f2495e.q();
    }

    @Override
    public final u subList(int i10, int i11) {
        j0.b(i10, i11, this.d);
        int i12 = this.f2494c;
        return this.f2495e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
