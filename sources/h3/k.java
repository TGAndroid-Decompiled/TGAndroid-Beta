package h3;

public final class k implements d5.o {

    public final c2.c0 f7956a;

    public final q0 f7957b;

    public e f7958c;
    public d5.o d;

    public boolean f7959e = true;

    public boolean f7960f;

    public k(q0 q0Var, d5.b0 b0Var) {
        this.f7957b = q0Var;
        this.f7956a = new c2.c0(b0Var);
    }

    @Override
    public final x1 getPlaybackParameters() {
        d5.o oVar = this.d;
        return oVar != null ? oVar.getPlaybackParameters() : (x1) this.f7956a.f2246e;
    }

    @Override
    public final long getPositionUs() {
        if (this.f7959e) {
            return this.f7956a.getPositionUs();
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
        this.f7956a.setPlaybackParameters(x1Var);
    }
}
