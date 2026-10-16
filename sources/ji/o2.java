package ji;

import android.view.View;
import org.telegram.ui.Cells.n9;
public final class o2 implements Runnable {
    public final int f13450a;
    public final x3 f13451b;
    public final a f13452c;

    public o2(x3 x3Var, a aVar, int i10) {
        this.f13450a = i10;
        this.f13451b = x3Var;
        this.f13452c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f13450a) {
            case 0:
                this.f13451b.e3(this.f13452c);
                return;
            case 1:
                View A1 = this.f13451b.A1(this.f13452c);
                if (A1 instanceof i6) {
                    i6 i6Var = (i6) A1;
                    i6Var.B();
                    i6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f13451b.e3(this.f13452c);
                return;
            case 3:
                this.f13451b.d3(this.f13452c, true);
                return;
            case 4:
                this.f13451b.d3(this.f13452c, false);
                return;
            case 5:
                this.f13451b.d3(this.f13452c, true);
                return;
            case 6:
                this.f13451b.e3(this.f13452c);
                return;
            case 7:
                this.f13451b.c3(this.f13452c, false);
                return;
            case 8:
                this.f13451b.c3(this.f13452c, true);
                return;
            case 9:
                this.f13451b.e3(this.f13452c);
                return;
            case 10:
                this.f13451b.c3(this.f13452c, true);
                return;
            case 11:
                this.f13451b.e3(this.f13452c);
                return;
            case 12:
                this.f13451b.d3(this.f13452c, false);
                return;
            case 13:
                this.f13451b.c3(this.f13452c, true);
                return;
            case 14:
                x3 x3Var = this.f13451b;
                View A12 = x3Var.A1(this.f13452c);
                if (A12 instanceof n9) {
                    x3Var.f13642l3.b0(0, 0, (n9) A12);
                    return;
                }
                return;
            case 15:
                x3 x3Var2 = this.f13451b;
                View A13 = x3Var2.A1(this.f13452c);
                if (A13 instanceof n9) {
                    if (A13 instanceof i6) {
                        i10 = ((i6) A13).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    x3Var2.f13642l3.b0(0, i10, (n9) A13);
                    return;
                }
                return;
            case 16:
                this.f13451b.g3(this.f13452c);
                return;
            case 17:
                View A14 = this.f13451b.A1(this.f13452c);
                if (A14 instanceof i6) {
                    i6 i6Var2 = (i6) A14;
                    i6Var2.B();
                    i6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View A15 = this.f13451b.A1(this.f13452c);
                if (A15 instanceof i6) {
                    i6 i6Var3 = (i6) A15;
                    i6Var3.B();
                    i6Var3.getEditText().setSelection(i6Var3.getEditText().length());
                    return;
                } else if (A15 instanceof u5) {
                    u5 u5Var = (u5) A15;
                    if (u5Var.getGrid().getChildCount() > 0) {
                        View childAt = u5Var.getGrid().getChildAt(0);
                        if (childAt instanceof x5) {
                            ((x5) childAt).f13661a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f13451b.f3(this.f13452c);
                return;
            case 20:
                View A16 = this.f13451b.A1(this.f13452c);
                if (A16 instanceof t0) {
                    ((t0) A16).d.r();
                    return;
                }
                return;
            case 21:
                this.f13451b.f3(this.f13452c);
                return;
            case 22:
                this.f13451b.f3(this.f13452c);
                return;
            case 23:
                View A17 = this.f13451b.A1(this.f13452c);
                if (A17 instanceof i6) {
                    i6 i6Var4 = (i6) A17;
                    i6Var4.B();
                    i6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f13451b.e3(this.f13452c);
                return;
            case 25:
                this.f13451b.a5("", this.f13452c);
                return;
            case 26:
                this.f13451b.e3(this.f13452c);
                return;
            case 27:
                this.f13451b.e3(this.f13452c);
                return;
            case 28:
                this.f13451b.e3(this.f13452c);
                return;
            default:
                this.f13451b.e3(this.f13452c);
                return;
        }
    }
}
