package li;

import android.view.View;
import org.telegram.ui.Cells.r9;
public final class m2 implements Runnable {
    public final int f17359a;
    public final v3 f17360b;
    public final a f17361c;

    public m2(v3 v3Var, a aVar, int i10) {
        this.f17359a = i10;
        this.f17360b = v3Var;
        this.f17361c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f17359a) {
            case 0:
                this.f17360b.j3(this.f17361c);
                return;
            case 1:
                View F1 = this.f17360b.F1(this.f17361c);
                if (F1 instanceof d6) {
                    d6 d6Var = (d6) F1;
                    d6Var.A();
                    d6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f17360b.j3(this.f17361c);
                return;
            case 3:
                this.f17360b.i3(this.f17361c, true);
                return;
            case 4:
                this.f17360b.i3(this.f17361c, false);
                return;
            case 5:
                this.f17360b.i3(this.f17361c, true);
                return;
            case 6:
                this.f17360b.j3(this.f17361c);
                return;
            case 7:
                this.f17360b.h3(this.f17361c, false);
                return;
            case 8:
                this.f17360b.h3(this.f17361c, true);
                return;
            case 9:
                this.f17360b.j3(this.f17361c);
                return;
            case 10:
                this.f17360b.h3(this.f17361c, true);
                return;
            case 11:
                this.f17360b.j3(this.f17361c);
                return;
            case 12:
                this.f17360b.i3(this.f17361c, false);
                return;
            case 13:
                this.f17360b.h3(this.f17361c, true);
                return;
            case 14:
                v3 v3Var = this.f17360b;
                View F12 = v3Var.F1(this.f17361c);
                if (F12 instanceof r9) {
                    v3Var.f17569v3.b0(0, 0, (r9) F12);
                    return;
                }
                return;
            case 15:
                v3 v3Var2 = this.f17360b;
                View F13 = v3Var2.F1(this.f17361c);
                if (F13 instanceof r9) {
                    if (F13 instanceof d6) {
                        i10 = ((d6) F13).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    v3Var2.f17569v3.b0(0, i10, (r9) F13);
                    return;
                }
                return;
            case 16:
                this.f17360b.l3(this.f17361c);
                return;
            case 17:
                View F14 = this.f17360b.F1(this.f17361c);
                if (F14 instanceof d6) {
                    d6 d6Var2 = (d6) F14;
                    d6Var2.A();
                    d6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View F15 = this.f17360b.F1(this.f17361c);
                if (F15 instanceof d6) {
                    d6 d6Var3 = (d6) F15;
                    d6Var3.A();
                    d6Var3.getEditText().setSelection(d6Var3.getEditText().length());
                    return;
                } else if (F15 instanceof p5) {
                    p5 p5Var = (p5) F15;
                    if (p5Var.getGrid().getChildCount() > 0) {
                        View childAt = p5Var.getGrid().getChildAt(0);
                        if (childAt instanceof s5) {
                            ((s5) childAt).f17475a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f17360b.k3(this.f17361c);
                return;
            case 20:
                View F16 = this.f17360b.F1(this.f17361c);
                if (F16 instanceof s0) {
                    ((s0) F16).d.r();
                    return;
                }
                return;
            case 21:
                this.f17360b.k3(this.f17361c);
                return;
            case 22:
                this.f17360b.k3(this.f17361c);
                return;
            case 23:
                View F17 = this.f17360b.F1(this.f17361c);
                if (F17 instanceof d6) {
                    d6 d6Var4 = (d6) F17;
                    d6Var4.A();
                    d6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f17360b.j3(this.f17361c);
                return;
            case 25:
                this.f17360b.f5("", this.f17361c);
                return;
            case 26:
                this.f17360b.j3(this.f17361c);
                return;
            case 27:
                this.f17360b.j3(this.f17361c);
                return;
            case 28:
                this.f17360b.j3(this.f17361c);
                return;
            default:
                this.f17360b.j3(this.f17361c);
                return;
        }
    }
}
