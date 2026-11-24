package defpackage;
public final class h4a implements l11 {
    public final m21 a;
    public final j4a b;

    public h4a(j4a j4aVar, m21 m21Var) {
        this.b = j4aVar;
        this.a = m21Var;
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
    public final void d(m21 m21Var) {
    }
}
