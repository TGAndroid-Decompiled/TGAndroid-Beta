package hi;

import android.view.View;
import org.telegram.ui.Cells.r9;
public final class r2 implements Runnable {
    public final int f9818a;
    public final z3 f9819b;
    public final a f9820c;

    public r2(z3 z3Var, a aVar, int i10) {
        this.f9818a = i10;
        this.f9819b = z3Var;
        this.f9820c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f9818a) {
            case 0:
                this.f9819b.c3(this.f9820c);
                return;
            case 1:
                View y12 = this.f9819b.y1(this.f9820c);
                if (y12 instanceof g6) {
                    g6 g6Var = (g6) y12;
                    g6Var.B();
                    g6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f9819b.c3(this.f9820c);
                return;
            case 3:
                this.f9819b.b3(this.f9820c, true);
                return;
            case 4:
                this.f9819b.b3(this.f9820c, false);
                return;
            case 5:
                this.f9819b.b3(this.f9820c, true);
                return;
            case 6:
                this.f9819b.c3(this.f9820c);
                return;
            case 7:
                this.f9819b.a3(this.f9820c, false);
                return;
            case 8:
                this.f9819b.a3(this.f9820c, true);
                return;
            case 9:
                this.f9819b.c3(this.f9820c);
                return;
            case 10:
                this.f9819b.a3(this.f9820c, true);
                return;
            case 11:
                this.f9819b.c3(this.f9820c);
                return;
            case 12:
                this.f9819b.b3(this.f9820c, false);
                return;
            case 13:
                this.f9819b.a3(this.f9820c, true);
                return;
            case 14:
                z3 z3Var = this.f9819b;
                View y13 = z3Var.y1(this.f9820c);
                if (y13 instanceof r9) {
                    z3Var.f10011n3.c0(0, 0, (r9) y13);
                    return;
                }
                return;
            case 15:
                z3 z3Var2 = this.f9819b;
                View y14 = z3Var2.y1(this.f9820c);
                if (y14 instanceof r9) {
                    if (y14 instanceof g6) {
                        i10 = ((g6) y14).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    z3Var2.f10011n3.c0(0, i10, (r9) y14);
                    return;
                }
                return;
            case 16:
                this.f9819b.e3(this.f9820c);
                return;
            case 17:
                View y15 = this.f9819b.y1(this.f9820c);
                if (y15 instanceof g6) {
                    g6 g6Var2 = (g6) y15;
                    g6Var2.B();
                    g6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View y16 = this.f9819b.y1(this.f9820c);
                if (y16 instanceof g6) {
                    g6 g6Var3 = (g6) y16;
                    g6Var3.B();
                    g6Var3.getEditText().setSelection(g6Var3.getEditText().length());
                    return;
                } else if (y16 instanceof r5) {
                    r5 r5Var = (r5) y16;
                    if (r5Var.getGrid().getChildCount() > 0) {
                        View childAt = r5Var.getGrid().getChildAt(0);
                        if (childAt instanceof u5) {
                            ((u5) childAt).f9892a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f9819b.d3(this.f9820c);
                return;
            case 20:
                View y17 = this.f9819b.y1(this.f9820c);
                if (y17 instanceof w0) {
                    ((w0) y17).d.r();
                    return;
                }
                return;
            case 21:
                this.f9819b.d3(this.f9820c);
                return;
            case 22:
                this.f9819b.d3(this.f9820c);
                return;
            case 23:
                View y18 = this.f9819b.y1(this.f9820c);
                if (y18 instanceof g6) {
                    g6 g6Var4 = (g6) y18;
                    g6Var4.B();
                    g6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f9819b.c3(this.f9820c);
                return;
            case 25:
                this.f9819b.Y4(this.f9820c, "");
                return;
            case 26:
                this.f9819b.c3(this.f9820c);
                return;
            case 27:
                this.f9819b.c3(this.f9820c);
                return;
            case 28:
                this.f9819b.c3(this.f9820c);
                return;
            default:
                this.f9819b.c3(this.f9820c);
                return;
        }
    }
}
