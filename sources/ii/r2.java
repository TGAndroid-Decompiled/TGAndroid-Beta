package ii;

import android.view.View;
public final class r2 implements Runnable {
    public final int f12612a;
    public final x3 f12613b;
    public final a f12614c;
    public final int d;

    public r2(x3 x3Var, a aVar, int i10, int i11) {
        this.f12612a = i11;
        this.f12613b = x3Var;
        this.f12614c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View A1;
        View A12;
        switch (this.f12612a) {
            case 0:
                x3 x3Var = this.f12613b;
                a aVar = this.f12614c;
                if (aVar == null) {
                    x3Var.getClass();
                    A1 = null;
                } else {
                    A1 = x3Var.A1(aVar);
                }
                if (A1 instanceof f6) {
                    f6 f6Var = (f6) A1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(Math.min(this.d, f6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                x3 x3Var2 = this.f12613b;
                a aVar2 = this.f12614c;
                if (aVar2 == null) {
                    x3Var2.getClass();
                    A12 = null;
                } else {
                    A12 = x3Var2.A1(aVar2);
                }
                if (A12 instanceof f6) {
                    f6 f6Var2 = (f6) A12;
                    f6Var2.B();
                    f6Var2.getEditText().setSelection(Math.min(this.d, f6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View A13 = this.f12613b.A1(this.f12614c);
                if (A13 instanceof f6) {
                    f6 f6Var3 = (f6) A13;
                    f6Var3.B();
                    f6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View A14 = this.f12613b.A1(this.f12614c);
                if (A14 instanceof f6) {
                    f6 f6Var4 = (f6) A14;
                    f6Var4.B();
                    f6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View A15 = this.f12613b.A1(this.f12614c);
                if (A15 instanceof f6) {
                    f6 f6Var5 = (f6) A15;
                    f6Var5.B();
                    f6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View A16 = this.f12613b.A1(this.f12614c);
                if (A16 instanceof f6) {
                    f6 f6Var6 = (f6) A16;
                    f6Var6.B();
                    f6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
