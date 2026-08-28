package h3;
public final class w implements d5.l, d5.k {
    public final k0 f9787a;

    public w(k0 k0Var) {
        this.f9787a = k0Var;
    }

    @Override
    public void g(Object obj, d5.g gVar) {
        ((a2) obj).onEvents(this.f9787a.f9539f, new z1(gVar));
    }

    @Override
    public void invoke(Object obj) {
        ((a2) obj).onAvailableCommandsChanged(this.f9787a.N);
    }
}
