package ii;

import android.view.View;
public final class r2 implements Runnable {
    public final int f11581a;
    public final x3 f11582b;
    public final a f11583c;
    public final int d;

    public r2(x3 x3Var, a aVar, int i10, int i11) {
        this.f11581a = i11;
        this.f11582b = x3Var;
        this.f11583c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View z12;
        View z13;
        switch (this.f11581a) {
            case 0:
                x3 x3Var = this.f11582b;
                a aVar = this.f11583c;
                if (aVar == null) {
                    x3Var.getClass();
                    z12 = null;
                } else {
                    z12 = x3Var.z1(aVar);
                }
                if (z12 instanceof e6) {
                    e6 e6Var = (e6) z12;
                    e6Var.B();
                    e6Var.getEditText().setSelection(Math.min(this.d, e6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                x3 x3Var2 = this.f11582b;
                a aVar2 = this.f11583c;
                if (aVar2 == null) {
                    x3Var2.getClass();
                    z13 = null;
                } else {
                    z13 = x3Var2.z1(aVar2);
                }
                if (z13 instanceof e6) {
                    e6 e6Var2 = (e6) z13;
                    e6Var2.B();
                    e6Var2.getEditText().setSelection(Math.min(this.d, e6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View z14 = this.f11582b.z1(this.f11583c);
                if (z14 instanceof e6) {
                    e6 e6Var3 = (e6) z14;
                    e6Var3.B();
                    e6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View z15 = this.f11582b.z1(this.f11583c);
                if (z15 instanceof e6) {
                    e6 e6Var4 = (e6) z15;
                    e6Var4.B();
                    e6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View z16 = this.f11582b.z1(this.f11583c);
                if (z16 instanceof e6) {
                    e6 e6Var5 = (e6) z16;
                    e6Var5.B();
                    e6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View z17 = this.f11582b.z1(this.f11583c);
                if (z17 instanceof e6) {
                    e6 e6Var6 = (e6) z17;
                    e6Var6.B();
                    e6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
