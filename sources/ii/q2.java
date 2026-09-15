package ii;

import android.view.View;
public final class q2 implements Runnable {
    public final int f11567a;
    public final w3 f11568b;
    public final a f11569c;
    public final int d;

    public q2(w3 w3Var, a aVar, int i10, int i11) {
        this.f11567a = i11;
        this.f11568b = w3Var;
        this.f11569c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View z12;
        View z13;
        switch (this.f11567a) {
            case 0:
                w3 w3Var = this.f11568b;
                a aVar = this.f11569c;
                if (aVar == null) {
                    w3Var.getClass();
                    z12 = null;
                } else {
                    z12 = w3Var.z1(aVar);
                }
                if (z12 instanceof d6) {
                    d6 d6Var = (d6) z12;
                    d6Var.B();
                    d6Var.getEditText().setSelection(Math.min(this.d, d6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                w3 w3Var2 = this.f11568b;
                a aVar2 = this.f11569c;
                if (aVar2 == null) {
                    w3Var2.getClass();
                    z13 = null;
                } else {
                    z13 = w3Var2.z1(aVar2);
                }
                if (z13 instanceof d6) {
                    d6 d6Var2 = (d6) z13;
                    d6Var2.B();
                    d6Var2.getEditText().setSelection(Math.min(this.d, d6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View z14 = this.f11568b.z1(this.f11569c);
                if (z14 instanceof d6) {
                    d6 d6Var3 = (d6) z14;
                    d6Var3.B();
                    d6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View z15 = this.f11568b.z1(this.f11569c);
                if (z15 instanceof d6) {
                    d6 d6Var4 = (d6) z15;
                    d6Var4.B();
                    d6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View z16 = this.f11568b.z1(this.f11569c);
                if (z16 instanceof d6) {
                    d6 d6Var5 = (d6) z16;
                    d6Var5.B();
                    d6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View z17 = this.f11568b.z1(this.f11569c);
                if (z17 instanceof d6) {
                    d6 d6Var6 = (d6) z17;
                    d6Var6.B();
                    d6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
