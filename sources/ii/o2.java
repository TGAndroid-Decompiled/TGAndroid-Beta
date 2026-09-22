package ii;

import android.view.View;
import org.telegram.ui.Cells.p9;
public final class o2 implements Runnable {
    public final int f11531a;
    public final w3 f11532b;
    public final a f11533c;

    public o2(w3 w3Var, a aVar, int i10) {
        this.f11531a = i10;
        this.f11532b = w3Var;
        this.f11533c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f11531a) {
            case 0:
                this.f11532b.d3(this.f11533c);
                return;
            case 1:
                View z12 = this.f11532b.z1(this.f11533c);
                if (z12 instanceof d6) {
                    d6 d6Var = (d6) z12;
                    d6Var.B();
                    d6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f11532b.d3(this.f11533c);
                return;
            case 3:
                this.f11532b.c3(this.f11533c, true);
                return;
            case 4:
                this.f11532b.c3(this.f11533c, false);
                return;
            case 5:
                this.f11532b.c3(this.f11533c, true);
                return;
            case 6:
                this.f11532b.d3(this.f11533c);
                return;
            case 7:
                this.f11532b.b3(this.f11533c, false);
                return;
            case 8:
                this.f11532b.b3(this.f11533c, true);
                return;
            case 9:
                this.f11532b.d3(this.f11533c);
                return;
            case 10:
                this.f11532b.b3(this.f11533c, true);
                return;
            case 11:
                this.f11532b.d3(this.f11533c);
                return;
            case 12:
                this.f11532b.c3(this.f11533c, false);
                return;
            case 13:
                this.f11532b.b3(this.f11533c, true);
                return;
            case 14:
                w3 w3Var = this.f11532b;
                View z13 = w3Var.z1(this.f11533c);
                if (z13 instanceof p9) {
                    w3Var.f11723n3.c0(0, 0, (p9) z13);
                    return;
                }
                return;
            case 15:
                w3 w3Var2 = this.f11532b;
                View z14 = w3Var2.z1(this.f11533c);
                if (z14 instanceof p9) {
                    if (z14 instanceof d6) {
                        i10 = ((d6) z14).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    w3Var2.f11723n3.c0(0, i10, (p9) z14);
                    return;
                }
                return;
            case 16:
                this.f11532b.f3(this.f11533c);
                return;
            case 17:
                View z15 = this.f11532b.z1(this.f11533c);
                if (z15 instanceof d6) {
                    d6 d6Var2 = (d6) z15;
                    d6Var2.B();
                    d6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View z16 = this.f11532b.z1(this.f11533c);
                if (z16 instanceof d6) {
                    d6 d6Var3 = (d6) z16;
                    d6Var3.B();
                    d6Var3.getEditText().setSelection(d6Var3.getEditText().length());
                    return;
                } else if (z16 instanceof o5) {
                    o5 o5Var = (o5) z16;
                    if (o5Var.getGrid().getChildCount() > 0) {
                        View childAt = o5Var.getGrid().getChildAt(0);
                        if (childAt instanceof r5) {
                            ((r5) childAt).f11605a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f11532b.e3(this.f11533c);
                return;
            case 20:
                View z17 = this.f11532b.z1(this.f11533c);
                if (z17 instanceof u0) {
                    ((u0) z17).d.r();
                    return;
                }
                return;
            case 21:
                this.f11532b.e3(this.f11533c);
                return;
            case 22:
                this.f11532b.e3(this.f11533c);
                return;
            case 23:
                View z18 = this.f11532b.z1(this.f11533c);
                if (z18 instanceof d6) {
                    d6 d6Var4 = (d6) z18;
                    d6Var4.B();
                    d6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f11532b.d3(this.f11533c);
                return;
            case 25:
                this.f11532b.Z4(this.f11533c, "");
                return;
            case 26:
                this.f11532b.d3(this.f11533c);
                return;
            case 27:
                this.f11532b.d3(this.f11533c);
                return;
            case 28:
                this.f11532b.d3(this.f11533c);
                return;
            default:
                this.f11532b.d3(this.f11533c);
                return;
        }
    }
}
