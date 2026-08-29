package j3;
public final class w implements f5.k, f5.j {
    public final k0 f10824a;

    public w(k0 k0Var) {
        this.f10824a = k0Var;
    }

    @Override
    public void e(Object obj, f5.g gVar) {
        ((a2) obj).onEvents(this.f10824a.f10576f, new z1(gVar));
    }

    @Override
    public void invoke(Object obj) {
        ((a2) obj).onAvailableCommandsChanged(this.f10824a.N);
    }
}
