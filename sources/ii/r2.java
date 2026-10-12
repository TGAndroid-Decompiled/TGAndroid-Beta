package ii;

import android.view.View;
public final class r2 implements Runnable {
    public final int f12654a;
    public final x3 f12655b;
    public final a f12656c;
    public final int d;

    public r2(x3 x3Var, a aVar, int i10, int i11) {
        this.f12654a = i11;
        this.f12655b = x3Var;
        this.f12656c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View A1;
        View A12;
        switch (this.f12654a) {
            case 0:
                x3 x3Var = this.f12655b;
                a aVar = this.f12656c;
                if (aVar == null) {
                    x3Var.getClass();
                    A1 = null;
                } else {
                    A1 = x3Var.A1(aVar);
                }
                if (A1 instanceof e6) {
                    e6 e6Var = (e6) A1;
                    e6Var.B();
                    e6Var.getEditText().setSelection(Math.min(this.d, e6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                x3 x3Var2 = this.f12655b;
                a aVar2 = this.f12656c;
                if (aVar2 == null) {
                    x3Var2.getClass();
                    A12 = null;
                } else {
                    A12 = x3Var2.A1(aVar2);
                }
                if (A12 instanceof e6) {
                    e6 e6Var2 = (e6) A12;
                    e6Var2.B();
                    e6Var2.getEditText().setSelection(Math.min(this.d, e6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View A13 = this.f12655b.A1(this.f12656c);
                if (A13 instanceof e6) {
                    e6 e6Var3 = (e6) A13;
                    e6Var3.B();
                    e6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View A14 = this.f12655b.A1(this.f12656c);
                if (A14 instanceof e6) {
                    e6 e6Var4 = (e6) A14;
                    e6Var4.B();
                    e6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View A15 = this.f12655b.A1(this.f12656c);
                if (A15 instanceof e6) {
                    e6 e6Var5 = (e6) A15;
                    e6Var5.B();
                    e6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View A16 = this.f12655b.A1(this.f12656c);
                if (A16 instanceof e6) {
                    e6 e6Var6 = (e6) A16;
                    e6Var6.B();
                    e6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, e6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
