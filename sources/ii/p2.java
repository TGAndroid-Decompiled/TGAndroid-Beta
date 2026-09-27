package ii;

import android.view.View;
import org.telegram.ui.Cells.p9;
public final class p2 implements Runnable {
    public final int f11548a;
    public final x3 f11549b;
    public final a f11550c;

    public p2(x3 x3Var, a aVar, int i10) {
        this.f11548a = i10;
        this.f11549b = x3Var;
        this.f11550c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f11548a) {
            case 0:
                this.f11549b.e3(this.f11550c);
                return;
            case 1:
                View A1 = this.f11549b.A1(this.f11550c);
                if (A1 instanceof e6) {
                    e6 e6Var = (e6) A1;
                    e6Var.B();
                    e6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f11549b.e3(this.f11550c);
                return;
            case 3:
                this.f11549b.d3(this.f11550c, true);
                return;
            case 4:
                this.f11549b.d3(this.f11550c, false);
                return;
            case 5:
                this.f11549b.d3(this.f11550c, true);
                return;
            case 6:
                this.f11549b.e3(this.f11550c);
                return;
            case 7:
                this.f11549b.c3(this.f11550c, false);
                return;
            case 8:
                this.f11549b.c3(this.f11550c, true);
                return;
            case 9:
                this.f11549b.e3(this.f11550c);
                return;
            case 10:
                this.f11549b.c3(this.f11550c, true);
                return;
            case 11:
                this.f11549b.e3(this.f11550c);
                return;
            case 12:
                this.f11549b.d3(this.f11550c, false);
                return;
            case 13:
                this.f11549b.c3(this.f11550c, true);
                return;
            case 14:
                x3 x3Var = this.f11549b;
                View A12 = x3Var.A1(this.f11550c);
                if (A12 instanceof p9) {
                    x3Var.f11741n3.c0(0, 0, (p9) A12);
                    return;
                }
                return;
            case 15:
                x3 x3Var2 = this.f11549b;
                View A13 = x3Var2.A1(this.f11550c);
                if (A13 instanceof p9) {
                    if (A13 instanceof e6) {
                        i10 = ((e6) A13).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    x3Var2.f11741n3.c0(0, i10, (p9) A13);
                    return;
                }
                return;
            case 16:
                this.f11549b.g3(this.f11550c);
                return;
            case 17:
                View A14 = this.f11549b.A1(this.f11550c);
                if (A14 instanceof e6) {
                    e6 e6Var2 = (e6) A14;
                    e6Var2.B();
                    e6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View A15 = this.f11549b.A1(this.f11550c);
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
                            ((s5) childAt).f11619a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f11549b.f3(this.f11550c);
                return;
            case 20:
                View A16 = this.f11549b.A1(this.f11550c);
                if (A16 instanceof u0) {
                    ((u0) A16).d.r();
                    return;
                }
                return;
            case 21:
                this.f11549b.f3(this.f11550c);
                return;
            case 22:
                this.f11549b.f3(this.f11550c);
                return;
            case 23:
                View A17 = this.f11549b.A1(this.f11550c);
                if (A17 instanceof e6) {
                    e6 e6Var4 = (e6) A17;
                    e6Var4.B();
                    e6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f11549b.e3(this.f11550c);
                return;
            case 25:
                this.f11549b.a5(this.f11550c, "");
                return;
            case 26:
                this.f11549b.e3(this.f11550c);
                return;
            case 27:
                this.f11549b.e3(this.f11550c);
                return;
            case 28:
                this.f11549b.e3(this.f11550c);
                return;
            default:
                this.f11549b.e3(this.f11550c);
                return;
        }
    }
}
