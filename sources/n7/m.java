package n7;
public final class m extends n {
    public final transient int f13976c;
    public final transient int d;
    public final n e;

    public m(n nVar, int i10, int i11) {
        this.e = nVar;
        this.f13976c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        a.e(i10, this.d);
        return this.e.get(i10 + this.f13976c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f13976c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f13976c;
    }

    @Override
    public final Object[] q() {
        return this.e.q();
    }

    @Override
    public final n subList(int i10, int i11) {
        a.m(i10, i11, this.d);
        int i12 = this.f13976c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
