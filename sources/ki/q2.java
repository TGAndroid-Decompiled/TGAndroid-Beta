package ki;

import android.view.View;
public final class q2 implements Runnable {
    public final int f15516a;
    public final w3 f15517b;
    public final a f15518c;
    public final int d;

    public q2(w3 w3Var, a aVar, int i10, int i11) {
        this.f15516a = i11;
        this.f15517b = w3Var;
        this.f15518c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View F1;
        View F12;
        switch (this.f15516a) {
            case 0:
                w3 w3Var = this.f15517b;
                a aVar = this.f15518c;
                if (aVar == null) {
                    w3Var.getClass();
                    F1 = null;
                } else {
                    F1 = w3Var.F1(aVar);
                }
                if (F1 instanceof c6) {
                    c6 c6Var = (c6) F1;
                    c6Var.A();
                    c6Var.getEditText().setSelection(Math.min(this.d, c6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                w3 w3Var2 = this.f15517b;
                a aVar2 = this.f15518c;
                if (aVar2 == null) {
                    w3Var2.getClass();
                    F12 = null;
                } else {
                    F12 = w3Var2.F1(aVar2);
                }
                if (F12 instanceof c6) {
                    c6 c6Var2 = (c6) F12;
                    c6Var2.A();
                    c6Var2.getEditText().setSelection(Math.min(this.d, c6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View F13 = this.f15517b.F1(this.f15518c);
                if (F13 instanceof c6) {
                    c6 c6Var3 = (c6) F13;
                    c6Var3.A();
                    c6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View F14 = this.f15517b.F1(this.f15518c);
                if (F14 instanceof c6) {
                    c6 c6Var4 = (c6) F14;
                    c6Var4.A();
                    c6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View F15 = this.f15517b.F1(this.f15518c);
                if (F15 instanceof c6) {
                    c6 c6Var5 = (c6) F15;
                    c6Var5.A();
                    c6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View F16 = this.f15517b.F1(this.f15518c);
                if (F16 instanceof c6) {
                    c6 c6Var6 = (c6) F16;
                    c6Var6.A();
                    c6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, c6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
