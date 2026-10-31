package bi;

import android.view.View;
import org.telegram.ui.Cells.j9;
public final class v2 implements Runnable {
    public final int f3407a;
    public final d4 f3408b;
    public final a f3409c;

    public v2(d4 d4Var, a aVar, int i10) {
        this.f3407a = i10;
        this.f3408b = d4Var;
        this.f3409c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f3407a) {
            case 0:
                this.f3408b.g3(this.f3409c);
                return;
            case 1:
                View C1 = this.f3408b.C1(this.f3409c);
                if (C1 instanceof q6) {
                    q6 q6Var = (q6) C1;
                    q6Var.B();
                    q6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f3408b.g3(this.f3409c);
                return;
            case 3:
                this.f3408b.f3(this.f3409c, true);
                return;
            case 4:
                this.f3408b.f3(this.f3409c, false);
                return;
            case 5:
                this.f3408b.f3(this.f3409c, true);
                return;
            case 6:
                this.f3408b.g3(this.f3409c);
                return;
            case 7:
                this.f3408b.e3(this.f3409c, false);
                return;
            case 8:
                this.f3408b.e3(this.f3409c, true);
                return;
            case 9:
                this.f3408b.g3(this.f3409c);
                return;
            case 10:
                this.f3408b.e3(this.f3409c, true);
                return;
            case 11:
                this.f3408b.g3(this.f3409c);
                return;
            case 12:
                this.f3408b.f3(this.f3409c, false);
                return;
            case 13:
                this.f3408b.e3(this.f3409c, true);
                return;
            case 14:
                d4 d4Var = this.f3408b;
                View C12 = d4Var.C1(this.f3409c);
                if (C12 instanceof j9) {
                    d4Var.f2950u3.b0(0, 0, (j9) C12);
                    return;
                }
                return;
            case 15:
                d4 d4Var2 = this.f3408b;
                View C13 = d4Var2.C1(this.f3409c);
                if (C13 instanceof j9) {
                    if (C13 instanceof q6) {
                        i10 = ((q6) C13).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    d4Var2.f2950u3.b0(0, i10, (j9) C13);
                    return;
                }
                return;
            case 16:
                this.f3408b.i3(this.f3409c);
                return;
            case 17:
                View C14 = this.f3408b.C1(this.f3409c);
                if (C14 instanceof q6) {
                    q6 q6Var2 = (q6) C14;
                    q6Var2.B();
                    q6Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View C15 = this.f3408b.C1(this.f3409c);
                if (C15 instanceof q6) {
                    q6 q6Var3 = (q6) C15;
                    q6Var3.B();
                    q6Var3.getEditText().setSelection(q6Var3.getEditText().length());
                    return;
                } else if (C15 instanceof z5) {
                    z5 z5Var = (z5) C15;
                    if (z5Var.getGrid().getChildCount() > 0) {
                        View childAt = z5Var.getGrid().getChildAt(0);
                        if (childAt instanceof c6) {
                            ((c6) childAt).f2905a.N();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f3408b.h3(this.f3409c);
                return;
            case 20:
                View C16 = this.f3408b.C1(this.f3409c);
                if (C16 instanceof y0) {
                    ((y0) C16).d.N();
                    return;
                }
                return;
            case 21:
                this.f3408b.h3(this.f3409c);
                return;
            case 22:
                this.f3408b.h3(this.f3409c);
                return;
            case 23:
                View C17 = this.f3408b.C1(this.f3409c);
                if (C17 instanceof q6) {
                    q6 q6Var4 = (q6) C17;
                    q6Var4.B();
                    q6Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f3408b.g3(this.f3409c);
                return;
            case 25:
                this.f3408b.c5(this.f3409c, "");
                return;
            case 26:
                this.f3408b.g3(this.f3409c);
                return;
            case 27:
                this.f3408b.g3(this.f3409c);
                return;
            case 28:
                this.f3408b.g3(this.f3409c);
                return;
            default:
                this.f3408b.g3(this.f3409c);
                return;
        }
    }
}
