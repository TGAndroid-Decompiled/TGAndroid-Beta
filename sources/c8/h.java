package c8;
public final class h extends i {
    public final transient int f5696c;
    public final transient int d;
    public final i f5697e;

    public h(i iVar, int i7, int i10) {
        this.f5697e = iVar;
        this.f5696c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        a8.f8.a(i7, this.d);
        return this.f5697e.get(i7 + this.f5696c);
    }

    @Override
    public final int i() {
        return this.f5697e.j() + this.f5696c + this.d;
    }

    @Override
    public final int j() {
        return this.f5697e.j() + this.f5696c;
    }

    @Override
    public final Object[] k() {
        return this.f5697e.k();
    }

    @Override
    public final i subList(int i7, int i10) {
        a8.f8.b(i7, i10, this.d);
        int i11 = this.f5696c;
        return this.f5697e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
