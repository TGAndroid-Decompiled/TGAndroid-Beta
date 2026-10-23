package ki;

import android.view.View;
import org.telegram.ui.Cells.n9;
public final class o2 implements Runnable {
    public final int f15480a;
    public final w3 f15481b;
    public final a f15482c;

    public o2(w3 w3Var, a aVar, int i10) {
        this.f15480a = i10;
        this.f15481b = w3Var;
        this.f15482c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f15480a) {
            case 0:
                this.f15481b.j3(this.f15482c);
                return;
            case 1:
                View F1 = this.f15481b.F1(this.f15482c);
                if (F1 instanceof c6) {
                    c6 c6Var = (c6) F1;
                    c6Var.A();
                    c6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f15481b.j3(this.f15482c);
                return;
            case 3:
                this.f15481b.i3(this.f15482c, true);
                return;
            case 4:
                this.f15481b.i3(this.f15482c, false);
                return;
            case 5:
                this.f15481b.i3(this.f15482c, true);
                return;
            case 6:
                this.f15481b.j3(this.f15482c);
                return;
            case 7:
                this.f15481b.h3(this.f15482c, false);
                return;
            case 8:
                this.f15481b.h3(this.f15482c, true);
                return;
            case 9:
                this.f15481b.j3(this.f15482c);
                return;
            case 10:
                this.f15481b.h3(this.f15482c, true);
                return;
            case 11:
                this.f15481b.j3(this.f15482c);
                return;
            case 12:
                this.f15481b.i3(this.f15482c, false);
                return;
            case 13:
                this.f15481b.h3(this.f15482c, true);
                return;
            case 14:
                w3 w3Var = this.f15481b;
                View F12 = w3Var.F1(this.f15482c);
                if (F12 instanceof n9) {
                    w3Var.f15667o3.b0(0, 0, (n9) F12);
                    return;
                }
                return;
            case 15:
                w3 w3Var2 = this.f15481b;
                View F13 = w3Var2.F1(this.f15482c);
                if (F13 instanceof n9) {
                    if (F13 instanceof c6) {
                        i10 = ((c6) F13).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    w3Var2.f15667o3.b0(0, i10, (n9) F13);
                    return;
                }
                return;
            case 16:
                this.f15481b.l3(this.f15482c);
                return;
            case 17:
                View F14 = this.f15481b.F1(this.f15482c);
                if (F14 instanceof c6) {
                    c6 c6Var2 = (c6) F14;
                    c6Var2.A();
                    c6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View F15 = this.f15481b.F1(this.f15482c);
                if (F15 instanceof c6) {
                    c6 c6Var3 = (c6) F15;
                    c6Var3.A();
                    c6Var3.getEditText().setSelection(c6Var3.getEditText().length());
                    return;
                } else if (F15 instanceof o5) {
                    o5 o5Var = (o5) F15;
                    if (o5Var.getGrid().getChildCount() > 0) {
                        View childAt = o5Var.getGrid().getChildAt(0);
                        if (childAt instanceof r5) {
                            ((r5) childAt).f15551a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f15481b.k3(this.f15482c);
                return;
            case 20:
                View F16 = this.f15481b.F1(this.f15482c);
                if (F16 instanceof t0) {
                    ((t0) F16).d.r();
                    return;
                }
                return;
            case 21:
                this.f15481b.k3(this.f15482c);
                return;
            case 22:
                this.f15481b.k3(this.f15482c);
                return;
            case 23:
                View F17 = this.f15481b.F1(this.f15482c);
                if (F17 instanceof c6) {
                    c6 c6Var4 = (c6) F17;
                    c6Var4.A();
                    c6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f15481b.j3(this.f15482c);
                return;
            case 25:
                this.f15481b.f5("", this.f15482c);
                return;
            case 26:
                this.f15481b.j3(this.f15482c);
                return;
            case 27:
                this.f15481b.j3(this.f15482c);
                return;
            case 28:
                this.f15481b.j3(this.f15482c);
                return;
            default:
                this.f15481b.j3(this.f15482c);
                return;
        }
    }
}
