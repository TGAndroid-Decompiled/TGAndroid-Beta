package ii;

import android.view.View;
import org.telegram.ui.Cells.q9;
public final class o2 implements Runnable {
    public final int f11533a;
    public final w3 f11534b;
    public final a f11535c;

    public o2(w3 w3Var, a aVar, int i10) {
        this.f11533a = i10;
        this.f11534b = w3Var;
        this.f11535c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f11533a) {
            case 0:
                this.f11534b.e3(this.f11535c);
                return;
            case 1:
                View A1 = this.f11534b.A1(this.f11535c);
                if (A1 instanceof d6) {
                    d6 d6Var = (d6) A1;
                    d6Var.B();
                    d6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f11534b.e3(this.f11535c);
                return;
            case 3:
                this.f11534b.d3(this.f11535c, true);
                return;
            case 4:
                this.f11534b.d3(this.f11535c, false);
                return;
            case 5:
                this.f11534b.d3(this.f11535c, true);
                return;
            case 6:
                this.f11534b.e3(this.f11535c);
                return;
            case 7:
                this.f11534b.c3(this.f11535c, false);
                return;
            case 8:
                this.f11534b.c3(this.f11535c, true);
                return;
            case 9:
                this.f11534b.e3(this.f11535c);
                return;
            case 10:
                this.f11534b.c3(this.f11535c, true);
                return;
            case 11:
                this.f11534b.e3(this.f11535c);
                return;
            case 12:
                this.f11534b.d3(this.f11535c, false);
                return;
            case 13:
                this.f11534b.c3(this.f11535c, true);
                return;
            case 14:
                w3 w3Var = this.f11534b;
                View A12 = w3Var.A1(this.f11535c);
                if (A12 instanceof q9) {
                    w3Var.f11725n3.c0(0, 0, (q9) A12);
                    return;
                }
                return;
            case 15:
                w3 w3Var2 = this.f11534b;
                View A13 = w3Var2.A1(this.f11535c);
                if (A13 instanceof q9) {
                    if (A13 instanceof d6) {
                        i10 = ((d6) A13).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    w3Var2.f11725n3.c0(0, i10, (q9) A13);
                    return;
                }
                return;
            case 16:
                this.f11534b.g3(this.f11535c);
                return;
            case 17:
                View A14 = this.f11534b.A1(this.f11535c);
                if (A14 instanceof d6) {
                    d6 d6Var2 = (d6) A14;
                    d6Var2.B();
                    d6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View A15 = this.f11534b.A1(this.f11535c);
                if (A15 instanceof d6) {
                    d6 d6Var3 = (d6) A15;
                    d6Var3.B();
                    d6Var3.getEditText().setSelection(d6Var3.getEditText().length());
                    return;
                } else if (A15 instanceof o5) {
                    o5 o5Var = (o5) A15;
                    if (o5Var.getGrid().getChildCount() > 0) {
                        View childAt = o5Var.getGrid().getChildAt(0);
                        if (childAt instanceof r5) {
                            ((r5) childAt).f11607a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f11534b.f3(this.f11535c);
                return;
            case 20:
                View A16 = this.f11534b.A1(this.f11535c);
                if (A16 instanceof u0) {
                    ((u0) A16).d.r();
                    return;
                }
                return;
            case 21:
                this.f11534b.f3(this.f11535c);
                return;
            case 22:
                this.f11534b.f3(this.f11535c);
                return;
            case 23:
                View A17 = this.f11534b.A1(this.f11535c);
                if (A17 instanceof d6) {
                    d6 d6Var4 = (d6) A17;
                    d6Var4.B();
                    d6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f11534b.e3(this.f11535c);
                return;
            case 25:
                this.f11534b.a5(this.f11535c, "");
                return;
            case 26:
                this.f11534b.e3(this.f11535c);
                return;
            case 27:
                this.f11534b.e3(this.f11535c);
                return;
            case 28:
                this.f11534b.e3(this.f11535c);
                return;
            default:
                this.f11534b.e3(this.f11535c);
                return;
        }
    }
}
