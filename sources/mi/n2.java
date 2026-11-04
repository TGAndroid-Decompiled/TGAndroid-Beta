package mi;

import android.view.View;
import org.telegram.ui.Cells.g9;
public final class n2 implements Runnable {
    public final int f19758a;
    public final t3 f19759b;
    public final a f19760c;

    public n2(t3 t3Var, a aVar, int i3) {
        this.f19758a = i3;
        this.f19759b = t3Var;
        this.f19760c = aVar;
    }

    @Override
    public final void run() {
        int i3;
        switch (this.f19758a) {
            case 0:
                this.f19759b.g3(this.f19760c);
                return;
            case 1:
                View C1 = this.f19759b.C1(this.f19760c);
                if (C1 instanceof b6) {
                    b6 b6Var = (b6) C1;
                    b6Var.B();
                    b6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f19759b.g3(this.f19760c);
                return;
            case 3:
                this.f19759b.f3(this.f19760c, true);
                return;
            case 4:
                this.f19759b.f3(this.f19760c, false);
                return;
            case 5:
                this.f19759b.f3(this.f19760c, true);
                return;
            case 6:
                this.f19759b.g3(this.f19760c);
                return;
            case 7:
                this.f19759b.e3(this.f19760c, false);
                return;
            case 8:
                this.f19759b.e3(this.f19760c, true);
                return;
            case 9:
                this.f19759b.g3(this.f19760c);
                return;
            case 10:
                this.f19759b.e3(this.f19760c, true);
                return;
            case 11:
                this.f19759b.g3(this.f19760c);
                return;
            case 12:
                this.f19759b.f3(this.f19760c, false);
                return;
            case 13:
                this.f19759b.e3(this.f19760c, true);
                return;
            case 14:
                t3 t3Var = this.f19759b;
                View C12 = t3Var.C1(this.f19760c);
                if (C12 instanceof g9) {
                    t3Var.f19928v3.b0(0, 0, (g9) C12);
                    return;
                }
                return;
            case 15:
                t3 t3Var2 = this.f19759b;
                View C13 = t3Var2.C1(this.f19760c);
                if (C13 instanceof g9) {
                    if (C13 instanceof b6) {
                        i3 = ((b6) C13).getEditText().length();
                    } else {
                        i3 = 0;
                    }
                    t3Var2.f19928v3.b0(0, i3, (g9) C13);
                    return;
                }
                return;
            case 16:
                this.f19759b.i3(this.f19760c);
                return;
            case 17:
                View C14 = this.f19759b.C1(this.f19760c);
                if (C14 instanceof b6) {
                    b6 b6Var2 = (b6) C14;
                    b6Var2.B();
                    b6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View C15 = this.f19759b.C1(this.f19760c);
                if (C15 instanceof b6) {
                    b6 b6Var3 = (b6) C15;
                    b6Var3.B();
                    b6Var3.getEditText().setSelection(b6Var3.getEditText().length());
                    return;
                } else if (C15 instanceof n5) {
                    n5 n5Var = (n5) C15;
                    if (n5Var.getGrid().getChildCount() > 0) {
                        View childAt = n5Var.getGrid().getChildAt(0);
                        if (childAt instanceof q5) {
                            ((q5) childAt).f19842a.N();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f19759b.h3(this.f19760c);
                return;
            case 20:
                View C16 = this.f19759b.C1(this.f19760c);
                if (C16 instanceof s0) {
                    ((s0) C16).d.N();
                    return;
                }
                return;
            case 21:
                this.f19759b.h3(this.f19760c);
                return;
            case 22:
                this.f19759b.h3(this.f19760c);
                return;
            case 23:
                View C17 = this.f19759b.C1(this.f19760c);
                if (C17 instanceof b6) {
                    b6 b6Var4 = (b6) C17;
                    b6Var4.B();
                    b6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f19759b.g3(this.f19760c);
                return;
            case 25:
                this.f19759b.d5("", this.f19760c);
                return;
            case 26:
                this.f19759b.g3(this.f19760c);
                return;
            case 27:
                this.f19759b.g3(this.f19760c);
                return;
            case 28:
                this.f19759b.g3(this.f19760c);
                return;
            default:
                this.f19759b.g3(this.f19760c);
                return;
        }
    }
}
