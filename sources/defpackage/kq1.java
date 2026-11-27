package defpackage;

import org.telegram.ui.ActionBar.e;
public final class kq1 extends cl0 {
    public final byte s;
    public final zu1 w;

    public kq1(zu1 zu1Var, vnb vnbVar, int i, byte b) {
        super(i, vnbVar);
        this.s = b;
        this.w = zu1Var;
    }

    @Override
    public final int Q1() {
        int i;
        int i2;
        byte b = this.s;
        zu1 zu1Var = this.w;
        switch (b) {
            case 0:
                i = ((e) zu1Var).currentAccount;
                if (!dtd.d(i, zu1Var.Ba)) {
                    return vm2.o(zu1Var.getThemedColor(aob.Je), 255);
                }
                xu1 xu1Var = zu1Var.Ba;
                if (xu1Var != null && !xu1Var.a()) {
                    a();
                    return vm2.o(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return zu1Var.x.Q1();
            default:
                i2 = ((e) zu1Var).currentAccount;
                if (!dtd.d(i2, zu1Var.Ba)) {
                    return vm2.o(zu1Var.getThemedColor(aob.d6), 255);
                }
                xu1 xu1Var2 = zu1Var.Ba;
                if (xu1Var2 != null && !xu1Var2.a()) {
                    a();
                    return vm2.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }

    @Override
    public final int X() {
        xu1 xu1Var;
        switch (this.s) {
            case 0:
                int X = super.X();
                if (X != 0 && (xu1Var = this.w.Ba) != null && xu1Var.a()) {
                    return 385875967;
                }
                return X;
            case 1:
                return 0;
            default:
                return super.X();
        }
    }

    @Override
    public final int x0() {
        switch (this.s) {
            case 1:
                return 0;
            default:
                return super.x0();
        }
    }
}
