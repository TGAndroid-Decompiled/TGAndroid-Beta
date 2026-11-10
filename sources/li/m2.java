package li;

import android.view.View;
import org.telegram.ui.Cells.h9;
public final class m2 implements Runnable {
    public final int f18701a;
    public final t3 f18702b;
    public final a f18703c;

    public m2(t3 t3Var, a aVar, int i7) {
        this.f18701a = i7;
        this.f18702b = t3Var;
        this.f18703c = aVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f18701a) {
            case 0:
                this.f18702b.g3(this.f18703c);
                return;
            case 1:
                View C1 = this.f18702b.C1(this.f18703c);
                if (C1 instanceof a6) {
                    a6 a6Var = (a6) C1;
                    a6Var.B();
                    a6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f18702b.g3(this.f18703c);
                return;
            case 3:
                this.f18702b.f3(this.f18703c, true);
                return;
            case 4:
                this.f18702b.f3(this.f18703c, false);
                return;
            case 5:
                this.f18702b.f3(this.f18703c, true);
                return;
            case 6:
                this.f18702b.g3(this.f18703c);
                return;
            case 7:
                this.f18702b.e3(this.f18703c, false);
                return;
            case 8:
                this.f18702b.e3(this.f18703c, true);
                return;
            case 9:
                this.f18702b.g3(this.f18703c);
                return;
            case 10:
                this.f18702b.e3(this.f18703c, true);
                return;
            case 11:
                this.f18702b.g3(this.f18703c);
                return;
            case 12:
                this.f18702b.f3(this.f18703c, false);
                return;
            case 13:
                this.f18702b.e3(this.f18703c, true);
                return;
            case 14:
                t3 t3Var = this.f18702b;
                View C12 = t3Var.C1(this.f18703c);
                if (C12 instanceof h9) {
                    t3Var.f18904u3.b0(0, 0, (h9) C12);
                    return;
                }
                return;
            case 15:
                t3 t3Var2 = this.f18702b;
                View C13 = t3Var2.C1(this.f18703c);
                if (C13 instanceof h9) {
                    if (C13 instanceof a6) {
                        i7 = ((a6) C13).getEditText().length();
                    } else {
                        i7 = 0;
                    }
                    t3Var2.f18904u3.b0(0, i7, (h9) C13);
                    return;
                }
                return;
            case 16:
                this.f18702b.i3(this.f18703c);
                return;
            case 17:
                View C14 = this.f18702b.C1(this.f18703c);
                if (C14 instanceof a6) {
                    a6 a6Var2 = (a6) C14;
                    a6Var2.B();
                    a6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View C15 = this.f18702b.C1(this.f18703c);
                if (C15 instanceof a6) {
                    a6 a6Var3 = (a6) C15;
                    a6Var3.B();
                    a6Var3.getEditText().setSelection(a6Var3.getEditText().length());
                    return;
                } else if (C15 instanceof m5) {
                    m5 m5Var = (m5) C15;
                    if (m5Var.getGrid().getChildCount() > 0) {
                        View childAt = m5Var.getGrid().getChildAt(0);
                        if (childAt instanceof p5) {
                            ((p5) childAt).f18781a.N();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f18702b.h3(this.f18703c);
                return;
            case 20:
                View C16 = this.f18702b.C1(this.f18703c);
                if (C16 instanceof r0) {
                    ((r0) C16).d.N();
                    return;
                }
                return;
            case 21:
                this.f18702b.h3(this.f18703c);
                return;
            case 22:
                this.f18702b.h3(this.f18703c);
                return;
            case 23:
                View C17 = this.f18702b.C1(this.f18703c);
                if (C17 instanceof a6) {
                    a6 a6Var4 = (a6) C17;
                    a6Var4.B();
                    a6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f18702b.g3(this.f18703c);
                return;
            case 25:
                this.f18702b.d5("", this.f18703c);
                return;
            case 26:
                this.f18702b.g3(this.f18703c);
                return;
            case 27:
                this.f18702b.g3(this.f18703c);
                return;
            case 28:
                this.f18702b.g3(this.f18703c);
                return;
            default:
                this.f18702b.g3(this.f18703c);
                return;
        }
    }
}
