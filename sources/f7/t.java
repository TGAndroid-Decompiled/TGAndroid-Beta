package f7;

import j7.m7;
public final class t extends u {
    public final transient int f6155c;
    public final transient int d;
    public final u f6156e;

    public t(u uVar, int i10, int i11) {
        this.f6156e = uVar;
        this.f6155c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        m7.a(i10, this.d);
        return this.f6156e.get(i10 + this.f6155c);
    }

    @Override
    public final int n() {
        return this.f6156e.o() + this.f6155c + this.d;
    }

    @Override
    public final int o() {
        return this.f6156e.o() + this.f6155c;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final Object[] q() {
        return this.f6156e.q();
    }

    @Override
    public final u subList(int i10, int i11) {
        m7.b(i10, i11, this.d);
        int i12 = this.f6155c;
        return this.f6156e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
