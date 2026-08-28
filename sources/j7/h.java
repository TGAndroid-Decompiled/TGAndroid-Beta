package j7;
public final class h extends i {
    public final transient int f13810c;
    public final transient int d;
    public final i f13811e;

    public h(i iVar, int i9, int i10) {
        this.f13811e = iVar;
        this.f13810c = i9;
        this.d = i10;
    }

    @Override
    public final Object get(int i9) {
        f7.y8.a(i9, this.d);
        return this.f13811e.get(i9 + this.f13810c);
    }

    @Override
    public final int n() {
        return this.f13811e.o() + this.f13810c + this.d;
    }

    @Override
    public final int o() {
        return this.f13811e.o() + this.f13810c;
    }

    @Override
    public final Object[] p() {
        return this.f13811e.p();
    }

    @Override
    public final i subList(int i9, int i10) {
        f7.y8.b(i9, i10, this.d);
        int i11 = this.f13810c;
        return this.f13811e.subList(i9 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
