package f7;

import j7.l7;
public final class t extends u {
    public final transient int f6033c;
    public final transient int d;
    public final u e;

    public t(u uVar, int i10, int i11) {
        this.e = uVar;
        this.f6033c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        l7.a(i10, this.d);
        return this.e.get(i10 + this.f6033c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f6033c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f6033c;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final Object[] q() {
        return this.e.q();
    }

    @Override
    public final u subList(int i10, int i11) {
        l7.b(i10, i11, this.d);
        int i12 = this.f6033c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
