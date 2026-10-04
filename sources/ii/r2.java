package ii;

import android.view.View;
public final class r2 implements Runnable {
    public final int f12611a;
    public final x3 f12612b;
    public final a f12613c;
    public final int d;

    public r2(x3 x3Var, a aVar, int i10, int i11) {
        this.f12611a = i11;
        this.f12612b = x3Var;
        this.f12613c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View B1;
        View B12;
        switch (this.f12611a) {
            case 0:
                x3 x3Var = this.f12612b;
                a aVar = this.f12613c;
                if (aVar == null) {
                    x3Var.getClass();
                    B1 = null;
                } else {
                    B1 = x3Var.B1(aVar);
                }
                if (B1 instanceof f6) {
                    f6 f6Var = (f6) B1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(Math.min(this.d, f6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                x3 x3Var2 = this.f12612b;
                a aVar2 = this.f12613c;
                if (aVar2 == null) {
                    x3Var2.getClass();
                    B12 = null;
                } else {
                    B12 = x3Var2.B1(aVar2);
                }
                if (B12 instanceof f6) {
                    f6 f6Var2 = (f6) B12;
                    f6Var2.B();
                    f6Var2.getEditText().setSelection(Math.min(this.d, f6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View B13 = this.f12612b.B1(this.f12613c);
                if (B13 instanceof f6) {
                    f6 f6Var3 = (f6) B13;
                    f6Var3.B();
                    f6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View B14 = this.f12612b.B1(this.f12613c);
                if (B14 instanceof f6) {
                    f6 f6Var4 = (f6) B14;
                    f6Var4.B();
                    f6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View B15 = this.f12612b.B1(this.f12613c);
                if (B15 instanceof f6) {
                    f6 f6Var5 = (f6) B15;
                    f6Var5.B();
                    f6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View B16 = this.f12612b.B1(this.f12613c);
                if (B16 instanceof f6) {
                    f6 f6Var6 = (f6) B16;
                    f6Var6.B();
                    f6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, f6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
