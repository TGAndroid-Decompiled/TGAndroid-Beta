package ii;

import android.view.View;
import org.telegram.ui.Cells.q9;
public final class p2 implements Runnable {
    public final int f11545a;
    public final x3 f11546b;
    public final a f11547c;

    public p2(x3 x3Var, a aVar, int i10) {
        this.f11545a = i10;
        this.f11546b = x3Var;
        this.f11547c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f11545a) {
            case 0:
                this.f11546b.d3(this.f11547c);
                return;
            case 1:
                View z12 = this.f11546b.z1(this.f11547c);
                if (z12 instanceof e6) {
                    e6 e6Var = (e6) z12;
                    e6Var.B();
                    e6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f11546b.d3(this.f11547c);
                return;
            case 3:
                this.f11546b.c3(this.f11547c, true);
                return;
            case 4:
                this.f11546b.c3(this.f11547c, false);
                return;
            case 5:
                this.f11546b.c3(this.f11547c, true);
                return;
            case 6:
                this.f11546b.d3(this.f11547c);
                return;
            case 7:
                this.f11546b.b3(this.f11547c, false);
                return;
            case 8:
                this.f11546b.b3(this.f11547c, true);
                return;
            case 9:
                this.f11546b.d3(this.f11547c);
                return;
            case 10:
                this.f11546b.b3(this.f11547c, true);
                return;
            case 11:
                this.f11546b.d3(this.f11547c);
                return;
            case 12:
                this.f11546b.c3(this.f11547c, false);
                return;
            case 13:
                this.f11546b.b3(this.f11547c, true);
                return;
            case 14:
                x3 x3Var = this.f11546b;
                View z13 = x3Var.z1(this.f11547c);
                if (z13 instanceof q9) {
                    x3Var.f11738n3.c0(0, 0, (q9) z13);
                    return;
                }
                return;
            case 15:
                x3 x3Var2 = this.f11546b;
                View z14 = x3Var2.z1(this.f11547c);
                if (z14 instanceof q9) {
                    if (z14 instanceof e6) {
                        i10 = ((e6) z14).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    x3Var2.f11738n3.c0(0, i10, (q9) z14);
                    return;
                }
                return;
            case 16:
                this.f11546b.f3(this.f11547c);
                return;
            case 17:
                View z15 = this.f11546b.z1(this.f11547c);
                if (z15 instanceof e6) {
                    e6 e6Var2 = (e6) z15;
                    e6Var2.B();
                    e6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View z16 = this.f11546b.z1(this.f11547c);
                if (z16 instanceof e6) {
                    e6 e6Var3 = (e6) z16;
                    e6Var3.B();
                    e6Var3.getEditText().setSelection(e6Var3.getEditText().length());
                    return;
                } else if (z16 instanceof p5) {
                    p5 p5Var = (p5) z16;
                    if (p5Var.getGrid().getChildCount() > 0) {
                        View childAt = p5Var.getGrid().getChildAt(0);
                        if (childAt instanceof s5) {
                            ((s5) childAt).f11616a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f11546b.e3(this.f11547c);
                return;
            case 20:
                View z17 = this.f11546b.z1(this.f11547c);
                if (z17 instanceof u0) {
                    ((u0) z17).d.r();
                    return;
                }
                return;
            case 21:
                this.f11546b.e3(this.f11547c);
                return;
            case 22:
                this.f11546b.e3(this.f11547c);
                return;
            case 23:
                View z18 = this.f11546b.z1(this.f11547c);
                if (z18 instanceof e6) {
                    e6 e6Var4 = (e6) z18;
                    e6Var4.B();
                    e6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f11546b.d3(this.f11547c);
                return;
            case 25:
                this.f11546b.Z4(this.f11547c, "");
                return;
            case 26:
                this.f11546b.d3(this.f11547c);
                return;
            case 27:
                this.f11546b.d3(this.f11547c);
                return;
            case 28:
                this.f11546b.d3(this.f11547c);
                return;
            default:
                this.f11546b.d3(this.f11547c);
                return;
        }
    }
}
