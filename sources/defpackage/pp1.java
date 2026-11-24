package defpackage;
public final class pp1 extends c01 {
    public final byte d;
    public final int e;
    public final gb2 f;
    public final mu1 g;

    public pp1(mu1 mu1Var, int i, gb2 gb2Var, byte b) {
        this.d = b;
        this.g = mu1Var;
        this.e = i;
        this.f = gb2Var;
    }

    @Override
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    gl.e3(new eg(this, this.e, (byte) 15), 240L);
                    return;
                }
                return;
            case 1:
                if (!z) {
                    gl.e3(new eg(this, this.e, (byte) 18), 240L);
                    return;
                }
                return;
            default:
                if (!z) {
                    gl.e3(new eg(this, this.e, (byte) 19), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        byte b = this.d;
        gb2 gb2Var = this.f;
        int i = this.e;
        mu1 mu1Var = this.g;
        switch (b) {
            case 0:
                mu1Var.ac = i;
                mu1Var.bc = 6;
                gb2Var.invalidate();
                return;
            case 1:
                mu1Var.ac = i;
                mu1Var.bc = 5;
                mu1Var.dc = null;
                gb2Var.invalidate();
                return;
            default:
                mu1Var.ac = i;
                mu1Var.bc = 7;
                gb2Var.invalidate();
                return;
        }
    }
}
