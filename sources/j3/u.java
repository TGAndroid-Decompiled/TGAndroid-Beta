package j3;
public final class u implements h5.k, h5.j {
    public final f0 f8829a;

    public u(f0 f0Var) {
        this.f8829a = f0Var;
    }

    @Override
    public void d(Object obj, h5.g gVar) {
        ((y1) obj).onEvents(this.f8829a.f8546f, new x1(gVar));
    }

    @Override
    public void invoke(Object obj) {
        ((y1) obj).onAvailableCommandsChanged(this.f8829a.L);
    }
}
