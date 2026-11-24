package defpackage;
public final class jz0 extends a69 {
    public final a69 a;
    public final kz0 b;

    public jz0(kz0 kz0Var, a69 a69Var) {
        this.b = kz0Var;
        this.a = a69Var;
    }

    @Override
    public final void a() {
        this.a.a();
    }

    @Override
    public final void b(int i, int i2) {
        this.a.b(i + (!((mz0) this.b.f).J1 ? 1 : 0), i2);
    }

    @Override
    public final void c(int i, int i2, Object obj) {
        this.a.c(i + (!((mz0) this.b.f).J1 ? 1 : 0), i2, obj);
    }

    @Override
    public final void d(int i, int i2) {
        this.a.d(i + (!((mz0) this.b.f).J1 ? 1 : 0), i2);
    }

    @Override
    public final void e(int i, int i2) {
        int i3 = !((mz0) this.b.f).J1 ? 1 : 0;
        this.a.e(i + i3, i2 + i3);
    }

    @Override
    public final void f(int i, int i2) {
        this.a.f(i + (!((mz0) this.b.f).J1 ? 1 : 0), i2);
    }
}
