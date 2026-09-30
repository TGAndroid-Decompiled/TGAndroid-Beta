package ii;

import android.view.View;
import org.telegram.ui.Cells.p9;
public final class p2 implements Runnable {
    public final int f11559a;
    public final x3 f11560b;
    public final a f11561c;

    public p2(x3 x3Var, a aVar, int i10) {
        this.f11559a = i10;
        this.f11560b = x3Var;
        this.f11561c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f11559a) {
            case 0:
                this.f11560b.f3(this.f11561c);
                return;
            case 1:
                View B1 = this.f11560b.B1(this.f11561c);
                if (B1 instanceof e6) {
                    e6 e6Var = (e6) B1;
                    e6Var.B();
                    e6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f11560b.f3(this.f11561c);
                return;
            case 3:
                this.f11560b.e3(this.f11561c, true);
                return;
            case 4:
                this.f11560b.e3(this.f11561c, false);
                return;
            case 5:
                this.f11560b.e3(this.f11561c, true);
                return;
            case 6:
                this.f11560b.f3(this.f11561c);
                return;
            case 7:
                this.f11560b.d3(this.f11561c, false);
                return;
            case 8:
                this.f11560b.d3(this.f11561c, true);
                return;
            case 9:
                this.f11560b.f3(this.f11561c);
                return;
            case 10:
                this.f11560b.d3(this.f11561c, true);
                return;
            case 11:
                this.f11560b.f3(this.f11561c);
                return;
            case 12:
                this.f11560b.e3(this.f11561c, false);
                return;
            case 13:
                this.f11560b.d3(this.f11561c, true);
                return;
            case 14:
                x3 x3Var = this.f11560b;
                View B12 = x3Var.B1(this.f11561c);
                if (B12 instanceof p9) {
                    x3Var.f11760u3.c0(0, 0, (p9) B12);
                    return;
                }
                return;
            case 15:
                x3 x3Var2 = this.f11560b;
                View B13 = x3Var2.B1(this.f11561c);
                if (B13 instanceof p9) {
                    if (B13 instanceof e6) {
                        i10 = ((e6) B13).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    x3Var2.f11760u3.c0(0, i10, (p9) B13);
                    return;
                }
                return;
            case 16:
                this.f11560b.h3(this.f11561c);
                return;
            case 17:
                View B14 = this.f11560b.B1(this.f11561c);
                if (B14 instanceof e6) {
                    e6 e6Var2 = (e6) B14;
                    e6Var2.B();
                    e6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View B15 = this.f11560b.B1(this.f11561c);
                if (B15 instanceof e6) {
                    e6 e6Var3 = (e6) B15;
                    e6Var3.B();
                    e6Var3.getEditText().setSelection(e6Var3.getEditText().length());
                    return;
                } else if (B15 instanceof p5) {
                    p5 p5Var = (p5) B15;
                    if (p5Var.getGrid().getChildCount() > 0) {
                        View childAt = p5Var.getGrid().getChildAt(0);
                        if (childAt instanceof s5) {
                            ((s5) childAt).f11630a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f11560b.g3(this.f11561c);
                return;
            case 20:
                View B16 = this.f11560b.B1(this.f11561c);
                if (B16 instanceof u0) {
                    ((u0) B16).d.r();
                    return;
                }
                return;
            case 21:
                this.f11560b.g3(this.f11561c);
                return;
            case 22:
                this.f11560b.g3(this.f11561c);
                return;
            case 23:
                View B17 = this.f11560b.B1(this.f11561c);
                if (B17 instanceof e6) {
                    e6 e6Var4 = (e6) B17;
                    e6Var4.B();
                    e6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f11560b.f3(this.f11561c);
                return;
            case 25:
                this.f11560b.b5(this.f11561c, "");
                return;
            case 26:
                this.f11560b.f3(this.f11561c);
                return;
            case 27:
                this.f11560b.f3(this.f11561c);
                return;
            case 28:
                this.f11560b.f3(this.f11561c);
                return;
            default:
                this.f11560b.f3(this.f11561c);
                return;
        }
    }
}
