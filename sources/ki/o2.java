package ki;

import android.view.View;
import org.telegram.ui.Cells.m9;
public final class o2 implements Runnable {
    public final int f15420a;
    public final w3 f15421b;
    public final a f15422c;

    public o2(w3 w3Var, a aVar, int i10) {
        this.f15420a = i10;
        this.f15421b = w3Var;
        this.f15422c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f15420a) {
            case 0:
                this.f15421b.e3(this.f15422c);
                return;
            case 1:
                View A1 = this.f15421b.A1(this.f15422c);
                if (A1 instanceof c6) {
                    c6 c6Var = (c6) A1;
                    c6Var.B();
                    c6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f15421b.e3(this.f15422c);
                return;
            case 3:
                this.f15421b.d3(this.f15422c, true);
                return;
            case 4:
                this.f15421b.d3(this.f15422c, false);
                return;
            case 5:
                this.f15421b.d3(this.f15422c, true);
                return;
            case 6:
                this.f15421b.e3(this.f15422c);
                return;
            case 7:
                this.f15421b.c3(this.f15422c, false);
                return;
            case 8:
                this.f15421b.c3(this.f15422c, true);
                return;
            case 9:
                this.f15421b.e3(this.f15422c);
                return;
            case 10:
                this.f15421b.c3(this.f15422c, true);
                return;
            case 11:
                this.f15421b.e3(this.f15422c);
                return;
            case 12:
                this.f15421b.d3(this.f15422c, false);
                return;
            case 13:
                this.f15421b.c3(this.f15422c, true);
                return;
            case 14:
                w3 w3Var = this.f15421b;
                View A12 = w3Var.A1(this.f15422c);
                if (A12 instanceof m9) {
                    w3Var.f15604l3.b0(0, 0, (m9) A12);
                    return;
                }
                return;
            case 15:
                w3 w3Var2 = this.f15421b;
                View A13 = w3Var2.A1(this.f15422c);
                if (A13 instanceof m9) {
                    if (A13 instanceof c6) {
                        i10 = ((c6) A13).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    w3Var2.f15604l3.b0(0, i10, (m9) A13);
                    return;
                }
                return;
            case 16:
                this.f15421b.g3(this.f15422c);
                return;
            case 17:
                View A14 = this.f15421b.A1(this.f15422c);
                if (A14 instanceof c6) {
                    c6 c6Var2 = (c6) A14;
                    c6Var2.B();
                    c6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View A15 = this.f15421b.A1(this.f15422c);
                if (A15 instanceof c6) {
                    c6 c6Var3 = (c6) A15;
                    c6Var3.B();
                    c6Var3.getEditText().setSelection(c6Var3.getEditText().length());
                    return;
                } else if (A15 instanceof o5) {
                    o5 o5Var = (o5) A15;
                    if (o5Var.getGrid().getChildCount() > 0) {
                        View childAt = o5Var.getGrid().getChildAt(0);
                        if (childAt instanceof r5) {
                            ((r5) childAt).f15491a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f15421b.f3(this.f15422c);
                return;
            case 20:
                View A16 = this.f15421b.A1(this.f15422c);
                if (A16 instanceof t0) {
                    ((t0) A16).d.r();
                    return;
                }
                return;
            case 21:
                this.f15421b.f3(this.f15422c);
                return;
            case 22:
                this.f15421b.f3(this.f15422c);
                return;
            case 23:
                View A17 = this.f15421b.A1(this.f15422c);
                if (A17 instanceof c6) {
                    c6 c6Var4 = (c6) A17;
                    c6Var4.B();
                    c6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f15421b.e3(this.f15422c);
                return;
            case 25:
                this.f15421b.a5("", this.f15422c);
                return;
            case 26:
                this.f15421b.e3(this.f15422c);
                return;
            case 27:
                this.f15421b.e3(this.f15422c);
                return;
            case 28:
                this.f15421b.e3(this.f15422c);
                return;
            default:
                this.f15421b.e3(this.f15422c);
                return;
        }
    }
}
