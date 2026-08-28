package h3;
public final class k implements d5.o {
    public final c2.d0 f9526a;
    public final q0 f9527b;
    public e f9528c;
    public d5.o d;
    public boolean f9529e = true;
    public boolean f9530f;

    public k(q0 q0Var, d5.a0 a0Var) {
        this.f9527b = q0Var;
        this.f9526a = new c2.d0(a0Var);
    }

    @Override
    public final x1 getPlaybackParameters() {
        d5.o oVar = this.d;
        if (oVar != null) {
            return oVar.getPlaybackParameters();
        }
        return (x1) this.f9526a.f2133e;
    }

    @Override
    public final long getPositionUs() {
        if (this.f9529e) {
            return this.f9526a.getPositionUs();
        }
        d5.o oVar = this.d;
        oVar.getClass();
        return oVar.getPositionUs();
    }

    @Override
    public final void setPlaybackParameters(x1 x1Var) {
        d5.o oVar = this.d;
        if (oVar != null) {
            oVar.setPlaybackParameters(x1Var);
            x1Var = this.d.getPlaybackParameters();
        }
        this.f9526a.setPlaybackParameters(x1Var);
    }
}
