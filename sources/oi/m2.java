package oi;

import android.view.View;
public final class m2 implements Runnable {
    public final int f21811a;
    public final q3 f21812b;
    public final a f21813c;
    public final int d;

    public m2(q3 q3Var, a aVar, int i7, int i10) {
        this.f21811a = i10;
        this.f21812b = q3Var;
        this.f21813c = aVar;
        this.d = i7;
    }

    @Override
    public final void run() {
        View C1;
        View C12;
        switch (this.f21811a) {
            case 0:
                q3 q3Var = this.f21812b;
                a aVar = this.f21813c;
                if (aVar == null) {
                    q3Var.getClass();
                    C1 = null;
                } else {
                    C1 = q3Var.C1(aVar);
                }
                if (C1 instanceof y5) {
                    y5 y5Var = (y5) C1;
                    y5Var.B();
                    y5Var.getEditText().setSelection(Math.min(this.d, y5Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                q3 q3Var2 = this.f21812b;
                a aVar2 = this.f21813c;
                if (aVar2 == null) {
                    q3Var2.getClass();
                    C12 = null;
                } else {
                    C12 = q3Var2.C1(aVar2);
                }
                if (C12 instanceof y5) {
                    y5 y5Var2 = (y5) C12;
                    y5Var2.B();
                    y5Var2.getEditText().setSelection(Math.min(this.d, y5Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View C13 = this.f21812b.C1(this.f21813c);
                if (C13 instanceof y5) {
                    y5 y5Var3 = (y5) C13;
                    y5Var3.B();
                    y5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, y5Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View C14 = this.f21812b.C1(this.f21813c);
                if (C14 instanceof y5) {
                    y5 y5Var4 = (y5) C14;
                    y5Var4.B();
                    y5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, y5Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View C15 = this.f21812b.C1(this.f21813c);
                if (C15 instanceof y5) {
                    y5 y5Var5 = (y5) C15;
                    y5Var5.B();
                    y5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, y5Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View C16 = this.f21812b.C1(this.f21813c);
                if (C16 instanceof y5) {
                    y5 y5Var6 = (y5) C16;
                    y5Var6.B();
                    y5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, y5Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
