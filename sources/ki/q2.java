package ki;

import android.view.View;
public final class q2 implements Runnable {
    public final int f15450a;
    public final w3 f15451b;
    public final a f15452c;
    public final int d;

    public q2(w3 w3Var, a aVar, int i10, int i11) {
        this.f15450a = i11;
        this.f15451b = w3Var;
        this.f15452c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View A1;
        View A12;
        switch (this.f15450a) {
            case 0:
                w3 w3Var = this.f15451b;
                a aVar = this.f15452c;
                if (aVar == null) {
                    w3Var.getClass();
                    A1 = null;
                } else {
                    A1 = w3Var.A1(aVar);
                }
                if (A1 instanceof c6) {
                    c6 c6Var = (c6) A1;
                    c6Var.B();
                    c6Var.getEditText().setSelection(Math.min(this.d, c6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                w3 w3Var2 = this.f15451b;
                a aVar2 = this.f15452c;
                if (aVar2 == null) {
                    w3Var2.getClass();
                    A12 = null;
                } else {
                    A12 = w3Var2.A1(aVar2);
                }
                if (A12 instanceof c6) {
                    c6 c6Var2 = (c6) A12;
                    c6Var2.B();
                    c6Var2.getEditText().setSelection(Math.min(this.d, c6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View A13 = this.f15451b.A1(this.f15452c);
                if (A13 instanceof c6) {
                    c6 c6Var3 = (c6) A13;
                    c6Var3.B();
                    c6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View A14 = this.f15451b.A1(this.f15452c);
                if (A14 instanceof c6) {
                    c6 c6Var4 = (c6) A14;
                    c6Var4.B();
                    c6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View A15 = this.f15451b.A1(this.f15452c);
                if (A15 instanceof c6) {
                    c6 c6Var5 = (c6) A15;
                    c6Var5.B();
                    c6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View A16 = this.f15451b.A1(this.f15452c);
                if (A16 instanceof c6) {
                    c6 c6Var6 = (c6) A16;
                    c6Var6.B();
                    c6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
