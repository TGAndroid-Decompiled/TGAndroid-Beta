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
                this.f12575b.f3(this.f12576c);
                return;
            case 1:
                View B1 = this.f12575b.B1(this.f12576c);
                if (B1 instanceof f6) {
                    f6 f6Var = (f6) B1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f12575b.f3(this.f12576c);
                return;
            case 3:
                this.f12575b.e3(this.f12576c, true);
                return;
            case 4:
                this.f12575b.e3(this.f12576c, false);
                return;
            case 5:
                this.f12575b.e3(this.f12576c, true);
                return;
            case 6:
                this.f12575b.f3(this.f12576c);
                return;
            case 7:
                this.f12575b.d3(this.f12576c, false);
                return;
            case 8:
                this.f12575b.d3(this.f12576c, true);
                return;
            case 9:
                this.f12575b.f3(this.f12576c);
                return;
            case 10:
                this.f12575b.d3(this.f12576c, true);
                return;
            case 11:
                this.f12575b.f3(this.f12576c);
                return;
            case 12:
                this.f12575b.e3(this.f12576c, false);
                return;
            case 13:
                this.f12575b.d3(this.f12576c, true);
                return;
            case 14:
                x3 x3Var = this.f12575b;
                View B12 = x3Var.B1(this.f12576c);
                if (B12 instanceof p9) {
                    x3Var.f12782u3.c0(0, 0, (p9) B12);
                    return;
                }
                return;
            case 15:
                x3 x3Var2 = this.f12575b;
                View B13 = x3Var2.B1(this.f12576c);
                if (B13 instanceof p9) {
                    if (B13 instanceof f6) {
                        i10 = ((f6) B13).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    x3Var2.f12782u3.c0(0, i10, (p9) B13);
                    return;
                }
                return;
            case 16:
                this.f12575b.h3(this.f12576c);
                return;
            case 17:
                View B14 = this.f12575b.B1(this.f12576c);
                if (B14 instanceof f6) {
                    f6 f6Var2 = (f6) B14;
                    f6Var2.B();
                    f6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View B15 = this.f12575b.B1(this.f12576c);
                if (B15 instanceof f6) {
                    f6 f6Var3 = (f6) B15;
                    f6Var3.B();
                    f6Var3.getEditText().setSelection(f6Var3.getEditText().length());
                    return;
                } else if (B15 instanceof q5) {
                    q5 q5Var = (q5) B15;
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
                this.f12575b.g3(this.f12576c);
                return;
            case 20:
                View B16 = this.f12575b.B1(this.f12576c);
                if (B16 instanceof u0) {
                    ((u0) B16).d.r();
                    return;
                }
                return;
            case 21:
                this.f12575b.g3(this.f12576c);
                return;
            case 22:
                this.f12575b.g3(this.f12576c);
                return;
            case 23:
                View B17 = this.f12575b.B1(this.f12576c);
                if (B17 instanceof f6) {
                    f6 f6Var4 = (f6) B17;
                    f6Var4.B();
                    f6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f12575b.f3(this.f12576c);
                return;
            case 25:
                this.f12575b.b5(this.f12576c, "");
                return;
            case 26:
                this.f12575b.f3(this.f12576c);
                return;
            case 27:
                this.f12575b.f3(this.f12576c);
                return;
            case 28:
                this.f12575b.f3(this.f12576c);
                return;
            default:
                this.f12575b.f3(this.f12576c);
                return;
        }
    }
}
