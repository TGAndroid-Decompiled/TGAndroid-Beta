package j3;
public final class k implements f5.n {
    public final c2.e0 f10563a;
    public final q0 f10564b;
    public e f10565c;
    public f5.n d;
    public boolean f10566e = true;
    public boolean f10567f;

    public k(q0 q0Var, f5.y yVar) {
        this.f10564b = q0Var;
        this.f10563a = new c2.e0(yVar);
    }

    @Override
    public final x1 getPlaybackParameters() {
        f5.n nVar = this.d;
        if (nVar != null) {
            return nVar.getPlaybackParameters();
        }
        return (x1) this.f10563a.f2830e;
    }

    @Override
    public final long getPositionUs() {
        if (this.f10566e) {
            return this.f10563a.getPositionUs();
        }
        f5.n nVar = this.d;
        nVar.getClass();
        return nVar.getPositionUs();
    }

    @Override
    public final void setPlaybackParameters(x1 x1Var) {
        f5.n nVar = this.d;
        if (nVar != null) {
            nVar.setPlaybackParameters(x1Var);
            x1Var = this.d.getPlaybackParameters();
        }
        this.f10563a.setPlaybackParameters(x1Var);
    }
}
