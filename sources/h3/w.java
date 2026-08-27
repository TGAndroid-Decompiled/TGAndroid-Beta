package h3;

public final class w implements d5.l, d5.k {

    public final k0 f8218a;

    public w(k0 k0Var) {
        this.f8218a = k0Var;
    }

    @Override
    public void e(Object obj, d5.g gVar) {
        ((a2) obj).onEvents(this.f8218a.f7969f, new z1(gVar));
    }

    @Override
    public void invoke(Object obj) {
        ((a2) obj).onAvailableCommandsChanged(this.f8218a.N);
    }
}
