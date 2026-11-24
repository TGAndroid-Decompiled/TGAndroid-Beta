package defpackage;
public final class ws7 implements xr3 {
    public final byte a;
    public final wt7 b;
    public final boolean c;

    public ws7(wt7 wt7Var, boolean z, byte b) {
        this.a = b;
        this.b = wt7Var;
        this.c = z;
    }

    @Override
    public final void a(yla ylaVar, boolean z, float f, float f2) {
        byte b = this.a;
        boolean z2 = this.c;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                it7 it7Var = wt7Var.m1;
                if (ylaVar == wt7Var.s1) {
                    wt7Var.s1 = null;
                    if (!z2) {
                        it7Var.setVisibility(8);
                        k38.e(wt7Var.v1).g();
                        it7Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            default:
                ss7 ss7Var = wt7Var.c1;
                if (ylaVar == wt7Var.l1) {
                    wt7Var.l1 = null;
                    if (!z2) {
                        ss7Var.setVisibility(8);
                    }
                    ss7Var.setMaskProvider(null);
                    return;
                }
                return;
        }
    }
}
