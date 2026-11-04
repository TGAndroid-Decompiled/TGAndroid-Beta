package o7;

import b8.bf;
public final class d extends e {
    public final transient int f20921c;
    public final transient int d;
    public final e f20922e;

    public d(e eVar, int i3, int i10) {
        this.f20922e = eVar;
        this.f20921c = i3;
        this.d = i10;
    }

    @Override
    public final Object get(int i3) {
        bf.a(i3, this.d);
        return this.f20922e.get(i3 + this.f20921c);
    }

    @Override
    public final Object[] h() {
        return this.f20922e.h();
    }

    @Override
    public final int i() {
        return this.f20922e.i() + this.f20921c;
    }

    @Override
    public final int j() {
        return this.f20922e.i() + this.f20921c + this.d;
    }

    @Override
    public final e subList(int i3, int i10) {
        bf.b(i3, i10, this.d);
        int i11 = this.f20921c;
        return this.f20922e.subList(i3 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
