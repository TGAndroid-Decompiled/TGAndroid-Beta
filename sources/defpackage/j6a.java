package defpackage;
public final class j6a implements t21 {
    public final u31 a;
    public final l6a b;

    public j6a(l6a l6aVar, u31 u31Var) {
        this.b = l6aVar;
        this.a = u31Var;
    }

    @Override
    public final void a() {
        this.b.G.add(this.a);
    }

    @Override
    public final void b() {
        this.b.G.remove(this.a);
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(u31 u31Var) {
    }
}
