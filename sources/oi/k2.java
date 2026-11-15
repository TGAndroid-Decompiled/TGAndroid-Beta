package oi;

import android.view.View;
import org.telegram.ui.Cells.g9;
public final class k2 implements Runnable {
    public final int f21770a;
    public final q3 f21771b;
    public final a f21772c;

    public k2(q3 q3Var, a aVar, int i7) {
        this.f21770a = i7;
        this.f21771b = q3Var;
        this.f21772c = aVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f21770a) {
            case 0:
                this.f21771b.g3(this.f21772c);
                return;
            case 1:
                View C1 = this.f21771b.C1(this.f21772c);
                if (C1 instanceof y5) {
                    y5 y5Var = (y5) C1;
                    y5Var.B();
                    y5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f21771b.g3(this.f21772c);
                return;
            case 3:
                this.f21771b.f3(this.f21772c, true);
                return;
            case 4:
                this.f21771b.f3(this.f21772c, false);
                return;
            case 5:
                this.f21771b.f3(this.f21772c, true);
                return;
            case 6:
                this.f21771b.g3(this.f21772c);
                return;
            case 7:
                this.f21771b.e3(this.f21772c, false);
                return;
            case 8:
                this.f21771b.e3(this.f21772c, true);
                return;
            case 9:
                this.f21771b.g3(this.f21772c);
                return;
            case 10:
                this.f21771b.e3(this.f21772c, true);
                return;
            case 11:
                this.f21771b.g3(this.f21772c);
                return;
            case 12:
                this.f21771b.f3(this.f21772c, false);
                return;
            case 13:
                this.f21771b.e3(this.f21772c, true);
                return;
            case 14:
                q3 q3Var = this.f21771b;
                View C12 = q3Var.C1(this.f21772c);
                if (C12 instanceof g9) {
                    q3Var.f21943v3.b0(0, 0, (g9) C12);
                    return;
                }
                return;
            case 15:
                q3 q3Var2 = this.f21771b;
                View C13 = q3Var2.C1(this.f21772c);
                if (C13 instanceof g9) {
                    if (C13 instanceof y5) {
                        i7 = ((y5) C13).getEditText().length();
                    } else {
                        i7 = 0;
                    }
                    q3Var2.f21943v3.b0(0, i7, (g9) C13);
                    return;
                }
                return;
            case 16:
                this.f21771b.i3(this.f21772c);
                return;
            case 17:
                View C14 = this.f21771b.C1(this.f21772c);
                if (C14 instanceof y5) {
                    y5 y5Var2 = (y5) C14;
                    y5Var2.B();
                    y5Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View C15 = this.f21771b.C1(this.f21772c);
                if (C15 instanceof y5) {
                    y5 y5Var3 = (y5) C15;
                    y5Var3.B();
                    y5Var3.getEditText().setSelection(y5Var3.getEditText().length());
                    return;
                } else if (C15 instanceof k5) {
                    k5 k5Var = (k5) C15;
                    if (k5Var.getGrid().getChildCount() > 0) {
                        View childAt = k5Var.getGrid().getChildAt(0);
                        if (childAt instanceof n5) {
                            ((n5) childAt).f21845a.O();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f21771b.h3(this.f21772c);
                return;
            case 20:
                View C16 = this.f21771b.C1(this.f21772c);
                if (C16 instanceof p0) {
                    ((p0) C16).d.O();
                    return;
                }
                return;
            case 21:
                this.f21771b.h3(this.f21772c);
                return;
            case 22:
                this.f21771b.h3(this.f21772c);
                return;
            case 23:
                View C17 = this.f21771b.C1(this.f21772c);
                if (C17 instanceof y5) {
                    y5 y5Var4 = (y5) C17;
                    y5Var4.B();
                    y5Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f21771b.g3(this.f21772c);
                return;
            case 25:
                this.f21771b.d5("", this.f21772c);
                return;
            case 26:
                this.f21771b.g3(this.f21772c);
                return;
            case 27:
                this.f21771b.g3(this.f21772c);
                return;
            case 28:
                this.f21771b.g3(this.f21772c);
                return;
            default:
                this.f21771b.g3(this.f21772c);
                return;
        }
    }
}
