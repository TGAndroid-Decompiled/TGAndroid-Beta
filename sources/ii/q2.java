package ii;

import android.view.View;
public final class q2 implements Runnable {
    public final int f11571a;
    public final w3 f11572b;
    public final a f11573c;
    public final int d;

    public q2(w3 w3Var, a aVar, int i10, int i11) {
        this.f11571a = i11;
        this.f11572b = w3Var;
        this.f11573c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View A1;
        View A12;
        switch (this.f11571a) {
            case 0:
                w3 w3Var = this.f11572b;
                a aVar = this.f11573c;
                if (aVar == null) {
                    w3Var.getClass();
                    A1 = null;
                } else {
                    A1 = w3Var.A1(aVar);
                }
                if (A1 instanceof d6) {
                    d6 d6Var = (d6) A1;
                    d6Var.B();
                    d6Var.getEditText().setSelection(Math.min(this.d, d6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                w3 w3Var2 = this.f11572b;
                a aVar2 = this.f11573c;
                if (aVar2 == null) {
                    w3Var2.getClass();
                    A12 = null;
                } else {
                    A12 = w3Var2.A1(aVar2);
                }
                if (A12 instanceof d6) {
                    d6 d6Var2 = (d6) A12;
                    d6Var2.B();
                    d6Var2.getEditText().setSelection(Math.min(this.d, d6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View A13 = this.f11572b.A1(this.f11573c);
                if (A13 instanceof d6) {
                    d6 d6Var3 = (d6) A13;
                    d6Var3.B();
                    d6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View A14 = this.f11572b.A1(this.f11573c);
                if (A14 instanceof d6) {
                    d6 d6Var4 = (d6) A14;
                    d6Var4.B();
                    d6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View A15 = this.f11572b.A1(this.f11573c);
                if (A15 instanceof d6) {
                    d6 d6Var5 = (d6) A15;
                    d6Var5.B();
                    d6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View A16 = this.f11572b.A1(this.f11573c);
                if (A16 instanceof d6) {
                    d6 d6Var6 = (d6) A16;
                    d6Var6.B();
                    d6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
