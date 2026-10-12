package ji;

import android.view.View;
public final class q2 implements Runnable {
    public final int f13474a;
    public final x3 f13475b;
    public final a f13476c;
    public final int d;

    public q2(x3 x3Var, a aVar, int i10, int i11) {
        this.f13474a = i11;
        this.f13475b = x3Var;
        this.f13476c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View A1;
        View A12;
        switch (this.f13474a) {
            case 0:
                x3 x3Var = this.f13475b;
                a aVar = this.f13476c;
                if (aVar == null) {
                    x3Var.getClass();
                    A1 = null;
                } else {
                    A1 = x3Var.A1(aVar);
                }
                if (A1 instanceof i6) {
                    i6 i6Var = (i6) A1;
                    i6Var.B();
                    i6Var.getEditText().setSelection(Math.min(this.d, i6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                x3 x3Var2 = this.f13475b;
                a aVar2 = this.f13476c;
                if (aVar2 == null) {
                    x3Var2.getClass();
                    A12 = null;
                } else {
                    A12 = x3Var2.A1(aVar2);
                }
                if (A12 instanceof i6) {
                    i6 i6Var2 = (i6) A12;
                    i6Var2.B();
                    i6Var2.getEditText().setSelection(Math.min(this.d, i6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View A13 = this.f13475b.A1(this.f13476c);
                if (A13 instanceof i6) {
                    i6 i6Var3 = (i6) A13;
                    i6Var3.B();
                    i6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, i6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View A14 = this.f13475b.A1(this.f13476c);
                if (A14 instanceof i6) {
                    i6 i6Var4 = (i6) A14;
                    i6Var4.B();
                    i6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, i6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View A15 = this.f13475b.A1(this.f13476c);
                if (A15 instanceof i6) {
                    i6 i6Var5 = (i6) A15;
                    i6Var5.B();
                    i6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, i6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View A16 = this.f13475b.A1(this.f13476c);
                if (A16 instanceof i6) {
                    i6 i6Var6 = (i6) A16;
                    i6Var6.B();
                    i6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, i6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
