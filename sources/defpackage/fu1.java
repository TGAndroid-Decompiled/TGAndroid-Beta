package defpackage;
public final class fu1 extends l01 {
    public final wb2 d;
    public final ju1 e;

    public fu1(ju1 ju1Var, wb2 wb2Var) {
        this.e = ju1Var;
        this.d = wb2Var;
    }

    @Override
    public final void c(boolean z) {
        if (!z) {
            hl.d3(new zo1(this.e.a, (byte) 7), 250L);
        }
    }

    @Override
    public final void d() {
        zu1 zu1Var = this.e.a;
        wb2 wb2Var = this.d;
        zu1Var.lc = wb2Var.getMessageObject().e1();
        zu1Var.mc = 2;
        zu1Var.nc = null;
        wb2Var.invalidate();
    }
}
