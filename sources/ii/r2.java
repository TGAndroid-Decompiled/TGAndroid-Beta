package ii;

import android.view.View;
public final class r2 implements Runnable {
    public final int f11595a;
    public final x3 f11596b;
    public final a f11597c;
    public final int d;

    public r2(x3 x3Var, a aVar, int i10, int i11) {
        this.f11595a = i11;
        this.f11596b = x3Var;
        this.f11597c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View B1;
        View B12;
        switch (this.f11595a) {
            case 0:
                x3 x3Var = this.f11596b;
                a aVar = this.f11597c;
                if (aVar == null) {
                    x3Var.getClass();
                    B1 = null;
                } else {
                    B1 = x3Var.B1(aVar);
                }
                if (B1 instanceof e6) {
                    e6 e6Var = (e6) B1;
                    e6Var.B();
                    e6Var.getEditText().setSelection(Math.min(this.d, e6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                x3 x3Var2 = this.f11596b;
                a aVar2 = this.f11597c;
                if (aVar2 == null) {
                    x3Var2.getClass();
                    B12 = null;
                } else {
                    B12 = x3Var2.B1(aVar2);
                }
                if (B12 instanceof e6) {
                    e6 e6Var2 = (e6) B12;
                    e6Var2.B();
                    e6Var2.getEditText().setSelection(Math.min(this.d, e6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View B13 = this.f11596b.B1(this.f11597c);
                if (B13 instanceof e6) {
                    e6 e6Var3 = (e6) B13;
                    e6Var3.B();
                    e6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View B14 = this.f11596b.B1(this.f11597c);
                if (B14 instanceof e6) {
                    e6 e6Var4 = (e6) B14;
                    e6Var4.B();
                    e6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View B15 = this.f11596b.B1(this.f11597c);
                if (B15 instanceof e6) {
                    e6 e6Var5 = (e6) B15;
                    e6Var5.B();
                    e6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View B16 = this.f11596b.B1(this.f11597c);
                if (B16 instanceof e6) {
                    e6 e6Var6 = (e6) B16;
                    e6Var6.B();
                    e6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
