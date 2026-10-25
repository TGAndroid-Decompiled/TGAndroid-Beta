package b9;

import a8.w1;
public final class i extends j {
    public final transient int f3701c;
    public final transient int d;
    public final j e;

    public i(j jVar, int i10, int i11) {
        this.e = jVar;
        this.f3701c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        w1.a(i10, this.d);
        return this.e.get(i10 + this.f3701c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f3701c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f3701c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final j subList(int i10, int i11) {
        w1.b(i10, i11, this.d);
        int i12 = this.f3701c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
