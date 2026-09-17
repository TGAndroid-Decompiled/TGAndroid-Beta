package ji;

import android.view.View;
import org.telegram.ui.Cells.p9;
public final class n2 implements Runnable {
    public final int f14075a;
    public final v3 f14076b;
    public final a f14077c;

    public n2(v3 v3Var, a aVar, int i10) {
        this.f14075a = i10;
        this.f14076b = v3Var;
        this.f14077c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f14075a) {
            case 0:
                this.f14076b.c3(this.f14077c);
                return;
            case 1:
                View y12 = this.f14076b.y1(this.f14077c);
                if (y12 instanceof g6) {
                    g6 g6Var = (g6) y12;
                    g6Var.B();
                    g6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f14076b.c3(this.f14077c);
                return;
            case 3:
                this.f14076b.b3(this.f14077c, true);
                return;
            case 4:
                this.f14076b.b3(this.f14077c, false);
                return;
            case 5:
                this.f14076b.b3(this.f14077c, true);
                return;
            case 6:
                this.f14076b.c3(this.f14077c);
                return;
            case 7:
                this.f14076b.a3(this.f14077c, false);
                return;
            case 8:
                this.f14076b.a3(this.f14077c, true);
                return;
            case 9:
                this.f14076b.c3(this.f14077c);
                return;
            case 10:
                this.f14076b.a3(this.f14077c, true);
                return;
            case 11:
                this.f14076b.c3(this.f14077c);
                return;
            case 12:
                this.f14076b.b3(this.f14077c, false);
                return;
            case 13:
                this.f14076b.a3(this.f14077c, true);
                return;
            case 14:
                v3 v3Var = this.f14076b;
                View y13 = v3Var.y1(this.f14077c);
                if (y13 instanceof p9) {
                    v3Var.f14259n3.c0(0, 0, (p9) y13);
                    return;
                }
                return;
            case 15:
                v3 v3Var2 = this.f14076b;
                View y14 = v3Var2.y1(this.f14077c);
                if (y14 instanceof p9) {
                    if (y14 instanceof g6) {
                        i10 = ((g6) y14).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    v3Var2.f14259n3.c0(0, i10, (p9) y14);
                    return;
                }
                return;
            case 16:
                this.f14076b.e3(this.f14077c);
                return;
            case 17:
                View y15 = this.f14076b.y1(this.f14077c);
                if (y15 instanceof g6) {
                    g6 g6Var2 = (g6) y15;
                    g6Var2.B();
                    g6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View y16 = this.f14076b.y1(this.f14077c);
                if (y16 instanceof g6) {
                    g6 g6Var3 = (g6) y16;
                    g6Var3.B();
                    g6Var3.getEditText().setSelection(g6Var3.getEditText().length());
                    return;
                } else if (y16 instanceof s5) {
                    s5 s5Var = (s5) y16;
                    if (s5Var.getGrid().getChildCount() > 0) {
                        View childAt = s5Var.getGrid().getChildAt(0);
                        if (childAt instanceof v5) {
                            ((v5) childAt).f14277a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f14076b.d3(this.f14077c);
                return;
            case 20:
                View y17 = this.f14076b.y1(this.f14077c);
                if (y17 instanceof t0) {
                    ((t0) y17).d.r();
                    return;
                }
                return;
            case 21:
                this.f14076b.d3(this.f14077c);
                return;
            case 22:
                this.f14076b.d3(this.f14077c);
                return;
            case 23:
                View y18 = this.f14076b.y1(this.f14077c);
                if (y18 instanceof g6) {
                    g6 g6Var4 = (g6) y18;
                    g6Var4.B();
                    g6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f14076b.c3(this.f14077c);
                return;
            case 25:
                this.f14076b.Y4("", this.f14077c);
                return;
            case 26:
                this.f14076b.c3(this.f14077c);
                return;
            case 27:
                this.f14076b.c3(this.f14077c);
                return;
            case 28:
                this.f14076b.c3(this.f14077c);
                return;
            default:
                this.f14076b.c3(this.f14077c);
                return;
        }
    }
}
