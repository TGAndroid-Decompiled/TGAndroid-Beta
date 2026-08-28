package b7;

import f7.i0;
public final class u extends v {
    public final transient int f1588c;
    public final transient int d;
    public final v f1589e;

    public u(v vVar, int i9, int i10) {
        this.f1589e = vVar;
        this.f1588c = i9;
        this.d = i10;
    }

    @Override
    public final Object get(int i9) {
        i0.a(i9, this.d);
        return this.f1589e.get(i9 + this.f1588c);
    }

    @Override
    public final int n() {
        return this.f1589e.o() + this.f1588c + this.d;
    }

    @Override
    public final int o() {
        return this.f1589e.o() + this.f1588c;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final Object[] q() {
        return this.f1589e.q();
    }

    @Override
    public final v subList(int i9, int i10) {
        i0.b(i9, i10, this.d);
        int i11 = this.f1588c;
        return this.f1589e.subList(i9 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
