package nh;
public final class k4 implements o1.g {
    public final int f18002a;
    public final t5 f18003b;
    public final boolean f18004c;

    public k4(t5 t5Var, boolean z10, int i10) {
        this.f18002a = i10;
        this.f18003b = t5Var;
        this.f18004c = z10;
    }

    @Override
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.f18002a) {
            case 0:
                t5 t5Var = this.f18003b;
                x4 x4Var = t5Var.f18657s1;
                if (iVar == t5Var.f18669y1) {
                    t5Var.f18669y1 = null;
                    if (!this.f18004c) {
                        x4Var.setVisibility(8);
                        ag.h1.e(t5Var.B1).g();
                        x4Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            default:
                t5 t5Var2 = this.f18003b;
                bg.t2 t2Var = t5Var2.f18638i1;
                if (iVar == t5Var2.f18655r1) {
                    t5Var2.f18655r1 = null;
                    if (!this.f18004c) {
                        t2Var.setVisibility(8);
                    }
                    t2Var.setMaskProvider(null);
                    return;
                }
                return;
        }
    }
}
