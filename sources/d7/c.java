package d7;

import f7.r6;
public final class c extends d {
    public final transient int f4422c;
    public final transient int d;
    public final d f4423e;

    public c(d dVar, int i9, int i10) {
        this.f4423e = dVar;
        this.f4422c = i9;
        this.d = i10;
    }

    @Override
    public final Object get(int i9) {
        r6.a(i9, this.d);
        return this.f4423e.get(i9 + this.f4422c);
    }

    @Override
    public final int n() {
        return this.f4423e.o() + this.f4422c + this.d;
    }

    @Override
    public final int o() {
        return this.f4423e.o() + this.f4422c;
    }

    @Override
    public final Object[] p() {
        return this.f4423e.p();
    }

    @Override
    public final d subList(int i9, int i10) {
        r6.c(i9, i10, this.d);
        int i11 = this.f4422c;
        return this.f4423e.subList(i9 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
