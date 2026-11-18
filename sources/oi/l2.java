package oi;

import android.view.View;
import org.telegram.ui.Cells.i9;
public final class l2 implements Runnable {
    public final int f22152a;
    public final s3 f22153b;
    public final a f22154c;

    public l2(s3 s3Var, a aVar, int i7) {
        this.f22152a = i7;
        this.f22153b = s3Var;
        this.f22154c = aVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f22152a) {
            case 0:
                this.f22153b.g3(this.f22154c);
                return;
            case 1:
                View C1 = this.f22153b.C1(this.f22154c);
                if (C1 instanceof z5) {
                    z5 z5Var = (z5) C1;
                    z5Var.B();
                    z5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f22153b.g3(this.f22154c);
                return;
            case 3:
                this.f22153b.f3(this.f22154c, true);
                return;
            case 4:
                this.f22153b.f3(this.f22154c, false);
                return;
            case 5:
                this.f22153b.f3(this.f22154c, true);
                return;
            case 6:
                this.f22153b.g3(this.f22154c);
                return;
            case 7:
                this.f22153b.e3(this.f22154c, false);
                return;
            case 8:
                this.f22153b.e3(this.f22154c, true);
                return;
            case 9:
                this.f22153b.g3(this.f22154c);
                return;
            case 10:
                this.f22153b.e3(this.f22154c, true);
                return;
            case 11:
                this.f22153b.g3(this.f22154c);
                return;
            case 12:
                this.f22153b.f3(this.f22154c, false);
                return;
            case 13:
                this.f22153b.e3(this.f22154c, true);
                return;
            case 14:
                s3 s3Var = this.f22153b;
                View C12 = s3Var.C1(this.f22154c);
                if (C12 instanceof i9) {
                    s3Var.f22346v3.b0(0, 0, (i9) C12);
                    return;
                }
                return;
            case 15:
                s3 s3Var2 = this.f22153b;
                View C13 = s3Var2.C1(this.f22154c);
                if (C13 instanceof i9) {
                    if (C13 instanceof z5) {
                        i7 = ((z5) C13).getEditText().length();
                    } else {
                        i7 = 0;
                    }
                    s3Var2.f22346v3.b0(0, i7, (i9) C13);
                    return;
                }
                return;
            case 16:
                this.f22153b.i3(this.f22154c);
                return;
            case 17:
                View C14 = this.f22153b.C1(this.f22154c);
                if (C14 instanceof z5) {
                    z5 z5Var2 = (z5) C14;
                    z5Var2.B();
                    z5Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View C15 = this.f22153b.C1(this.f22154c);
                if (C15 instanceof z5) {
                    z5 z5Var3 = (z5) C15;
                    z5Var3.B();
                    z5Var3.getEditText().setSelection(z5Var3.getEditText().length());
                    return;
                } else if (C15 instanceof l5) {
                    l5 l5Var = (l5) C15;
                    if (l5Var.getGrid().getChildCount() > 0) {
                        View childAt = l5Var.getGrid().getChildAt(0);
                        if (childAt instanceof o5) {
                            ((o5) childAt).f22223a.O();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f22153b.h3(this.f22154c);
                return;
            case 20:
                View C16 = this.f22153b.C1(this.f22154c);
                if (C16 instanceof p0) {
                    ((p0) C16).d.O();
                    return;
                }
                return;
            case 21:
                this.f22153b.h3(this.f22154c);
                return;
            case 22:
                this.f22153b.h3(this.f22154c);
                return;
            case 23:
                View C17 = this.f22153b.C1(this.f22154c);
                if (C17 instanceof z5) {
                    z5 z5Var4 = (z5) C17;
                    z5Var4.B();
                    z5Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f22153b.g3(this.f22154c);
                return;
            case 25:
                this.f22153b.d5("", this.f22154c);
                return;
            case 26:
                this.f22153b.g3(this.f22154c);
                return;
            case 27:
                this.f22153b.g3(this.f22154c);
                return;
            case 28:
                this.f22153b.g3(this.f22154c);
                return;
            default:
                this.f22153b.g3(this.f22154c);
                return;
        }
    }
}
