package ii;

import android.view.View;
import org.telegram.ui.Cells.n9;
public final class p2 implements Runnable {
    public final int f12618a;
    public final x3 f12619b;
    public final a f12620c;

    public p2(x3 x3Var, a aVar, int i10) {
        this.f12618a = i10;
        this.f12619b = x3Var;
        this.f12620c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f12618a) {
            case 0:
                this.f12619b.e3(this.f12620c);
                return;
            case 1:
                View A1 = this.f12619b.A1(this.f12620c);
                if (A1 instanceof e6) {
                    e6 e6Var = (e6) A1;
                    e6Var.B();
                    e6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f12619b.e3(this.f12620c);
                return;
            case 3:
                this.f12619b.d3(this.f12620c, true);
                return;
            case 4:
                this.f12619b.d3(this.f12620c, false);
                return;
            case 5:
                this.f12619b.d3(this.f12620c, true);
                return;
            case 6:
                this.f12619b.e3(this.f12620c);
                return;
            case 7:
                this.f12619b.c3(this.f12620c, false);
                return;
            case 8:
                this.f12619b.c3(this.f12620c, true);
                return;
            case 9:
                this.f12619b.e3(this.f12620c);
                return;
            case 10:
                this.f12619b.c3(this.f12620c, true);
                return;
            case 11:
                this.f12619b.e3(this.f12620c);
                return;
            case 12:
                this.f12619b.d3(this.f12620c, false);
                return;
            case 13:
                this.f12619b.c3(this.f12620c, true);
                return;
            case 14:
                x3 x3Var = this.f12619b;
                View A12 = x3Var.A1(this.f12620c);
                if (A12 instanceof n9) {
                    x3Var.f12818l3.b0(0, 0, (n9) A12);
                    return;
                }
                return;
            case 15:
                x3 x3Var2 = this.f12619b;
                View A13 = x3Var2.A1(this.f12620c);
                if (A13 instanceof n9) {
                    if (A13 instanceof e6) {
                        i10 = ((e6) A13).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    x3Var2.f12818l3.b0(0, i10, (n9) A13);
                    return;
                }
                return;
            case 16:
                this.f12619b.g3(this.f12620c);
                return;
            case 17:
                View A14 = this.f12619b.A1(this.f12620c);
                if (A14 instanceof e6) {
                    e6 e6Var2 = (e6) A14;
                    e6Var2.B();
                    e6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View A15 = this.f12619b.A1(this.f12620c);
                if (A15 instanceof e6) {
                    e6 e6Var3 = (e6) A15;
                    e6Var3.B();
                    e6Var3.getEditText().setSelection(e6Var3.getEditText().length());
                    return;
                } else if (A15 instanceof p5) {
                    p5 p5Var = (p5) A15;
                    if (p5Var.getGrid().getChildCount() > 0) {
                        View childAt = p5Var.getGrid().getChildAt(0);
                        if (childAt instanceof s5) {
                            ((s5) childAt).f12692a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f12619b.f3(this.f12620c);
                return;
            case 20:
                View A16 = this.f12619b.A1(this.f12620c);
                if (A16 instanceof u0) {
                    ((u0) A16).d.r();
                    return;
                }
                return;
            case 21:
                this.f12619b.f3(this.f12620c);
                return;
            case 22:
                this.f12619b.f3(this.f12620c);
                return;
            case 23:
                View A17 = this.f12619b.A1(this.f12620c);
                if (A17 instanceof e6) {
                    e6 e6Var4 = (e6) A17;
                    e6Var4.B();
                    e6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f12619b.e3(this.f12620c);
                return;
            case 25:
                this.f12619b.a5(this.f12620c, "");
                return;
            case 26:
                this.f12619b.e3(this.f12620c);
                return;
            case 27:
                this.f12619b.e3(this.f12620c);
                return;
            case 28:
                this.f12619b.e3(this.f12620c);
                return;
            default:
                this.f12619b.e3(this.f12620c);
                return;
        }
    }
}
