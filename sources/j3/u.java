package j3;
public final class u implements h5.k, h5.j {
    public final f0 f9423a;

    public u(f0 f0Var) {
        this.f9423a = f0Var;
    }

    @Override
    public void d(Object obj, h5.g gVar) {
        ((y1) obj).onEvents(this.f9423a.f9113f, new x1(gVar));
    }

    @Override
    public void invoke(Object obj) {
        ((y1) obj).onAvailableCommandsChanged(this.f9423a.L);
    }
}
