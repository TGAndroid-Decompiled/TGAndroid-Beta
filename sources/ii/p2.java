package ii;

import android.view.View;
import org.telegram.ui.Cells.p9;
public final class p2 implements Runnable {
    public final int f12574a;
    public final x3 f12575b;
    public final a f12576c;

    public p2(x3 x3Var, a aVar, int i10) {
        this.f12574a = i10;
        this.f12575b = x3Var;
        this.f12576c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f12574a) {
            case 0:
                this.f12575b.e3(this.f12576c);
                return;
            case 1:
                View A1 = this.f12575b.A1(this.f12576c);
                if (A1 instanceof f6) {
                    f6 f6Var = (f6) A1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f12575b.e3(this.f12576c);
                return;
            case 3:
                this.f12575b.d3(this.f12576c, true);
                return;
            case 4:
                this.f12575b.d3(this.f12576c, false);
                return;
            case 5:
                this.f12575b.d3(this.f12576c, true);
                return;
            case 6:
                this.f12575b.e3(this.f12576c);
                return;
            case 7:
                this.f12575b.c3(this.f12576c, false);
                return;
            case 8:
                this.f12575b.c3(this.f12576c, true);
                return;
            case 9:
                this.f12575b.e3(this.f12576c);
                return;
            case 10:
                this.f12575b.c3(this.f12576c, true);
                return;
            case 11:
                this.f12575b.e3(this.f12576c);
                return;
            case 12:
                this.f12575b.d3(this.f12576c, false);
                return;
            case 13:
                this.f12575b.c3(this.f12576c, true);
                return;
            case 14:
                x3 x3Var = this.f12575b;
                View A12 = x3Var.A1(this.f12576c);
                if (A12 instanceof p9) {
                    x3Var.f12782u3.c0(0, 0, (p9) A12);
                    return;
                }
                return;
            case 15:
                x3 x3Var2 = this.f12575b;
                View A13 = x3Var2.A1(this.f12576c);
                if (A13 instanceof p9) {
                    if (A13 instanceof f6) {
                        i10 = ((f6) A13).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    x3Var2.f12782u3.c0(0, i10, (p9) A13);
                    return;
                }
                return;
            case 16:
                this.f12575b.g3(this.f12576c);
                return;
            case 17:
                View A14 = this.f12575b.A1(this.f12576c);
                if (A14 instanceof f6) {
                    f6 f6Var2 = (f6) A14;
                    f6Var2.B();
                    f6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View A15 = this.f12575b.A1(this.f12576c);
                if (A15 instanceof f6) {
                    f6 f6Var3 = (f6) A15;
                    f6Var3.B();
                    f6Var3.getEditText().setSelection(f6Var3.getEditText().length());
                    return;
                } else if (A15 instanceof q5) {
                    q5 q5Var = (q5) A15;
                    if (q5Var.getGrid().getChildCount() > 0) {
                        View childAt = q5Var.getGrid().getChildAt(0);
                        if (childAt instanceof t5) {
                            ((t5) childAt).f12661a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f12575b.f3(this.f12576c);
                return;
            case 20:
                View A16 = this.f12575b.A1(this.f12576c);
                if (A16 instanceof u0) {
                    ((u0) A16).d.r();
                    return;
                }
                return;
            case 21:
                this.f12575b.f3(this.f12576c);
                return;
            case 22:
                this.f12575b.f3(this.f12576c);
                return;
            case 23:
                View A17 = this.f12575b.A1(this.f12576c);
                if (A17 instanceof f6) {
                    f6 f6Var4 = (f6) A17;
                    f6Var4.B();
                    f6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f12575b.e3(this.f12576c);
                return;
            case 25:
                this.f12575b.a5(this.f12576c, "");
                return;
            case 26:
                this.f12575b.e3(this.f12576c);
                return;
            case 27:
                this.f12575b.e3(this.f12576c);
                return;
            case 28:
                this.f12575b.e3(this.f12576c);
                return;
            default:
                this.f12575b.e3(this.f12576c);
                return;
        }
    }
}
