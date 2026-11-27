package defpackage;
public final class dq1 extends l01 {
    public final byte d;
    public final int e;
    public final wb2 f;
    public final zu1 g;

    public dq1(zu1 zu1Var, int i, wb2 wb2Var, byte b) {
        this.d = b;
        this.g = zu1Var;
        this.e = i;
        this.f = wb2Var;
    }

    @Override
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    hl.d3(new zd(this, this.e, (byte) 16), 240L);
                    return;
                }
                return;
            case 1:
                if (!z) {
                    hl.d3(new zd(this, this.e, (byte) 18), 240L);
                    return;
                }
                return;
            default:
                if (!z) {
                    hl.d3(new zd(this, this.e, (byte) 19), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        byte b = this.d;
        wb2 wb2Var = this.f;
        int i = this.e;
        zu1 zu1Var = this.g;
        switch (b) {
            case 0:
                zu1Var.lc = i;
                zu1Var.mc = 6;
                wb2Var.invalidate();
                return;
            case 1:
                zu1Var.lc = i;
                zu1Var.mc = 5;
                zu1Var.oc = null;
                wb2Var.invalidate();
                return;
            default:
                zu1Var.lc = i;
                zu1Var.mc = 7;
                wb2Var.invalidate();
                return;
        }
    }
}
