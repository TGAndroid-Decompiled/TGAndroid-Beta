package d7;

import h7.z6;
public final class s extends t {
    public final transient int f5463c;
    public final transient int d;
    public final t f5464e;

    public s(t tVar, int i10, int i11) {
        this.f5464e = tVar;
        this.f5463c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        z6.a(i10, this.d);
        return this.f5464e.get(i10 + this.f5463c);
    }

    @Override
    public final int n() {
        return this.f5464e.o() + this.f5463c + this.d;
    }

    @Override
    public final int o() {
        return this.f5464e.o() + this.f5463c;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final Object[] q() {
        return this.f5464e.q();
    }

    @Override
    public final t subList(int i10, int i11) {
        z6.b(i10, i11, this.d);
        int i12 = this.f5463c;
        return this.f5464e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
