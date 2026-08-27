package l8;

public final class h extends i {

    public final transient int f15470c;
    public final transient int d;

    public final i f15471e;

    public h(i iVar, int i10, int i11) {
        this.f15471e = iVar;
        this.f15470c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        h7.i.a(i10, this.d);
        return this.f15471e.get(i10 + this.f15470c);
    }

    @Override
    public final int n() {
        return this.f15471e.o() + this.f15470c + this.d;
    }

    @Override
    public final int o() {
        return this.f15471e.o() + this.f15470c;
    }

    @Override
    public final Object[] p() {
        return this.f15471e.p();
    }

    @Override
    public final i subList(int i10, int i11) {
        h7.i.b(i10, i11, this.d);
        int i12 = this.f15470c;
        return this.f15471e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
