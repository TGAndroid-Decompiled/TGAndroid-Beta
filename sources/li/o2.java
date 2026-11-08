package li;

import android.view.View;
public final class o2 implements Runnable {
    public final int f18738a;
    public final t3 f18739b;
    public final a f18740c;
    public final int d;

    public o2(t3 t3Var, a aVar, int i7, int i10) {
        this.f18738a = i10;
        this.f18739b = t3Var;
        this.f18740c = aVar;
        this.d = i7;
    }

    @Override
    public final void run() {
        View C1;
        View C12;
        switch (this.f18738a) {
            case 0:
                t3 t3Var = this.f18739b;
                a aVar = this.f18740c;
                if (aVar == null) {
                    t3Var.getClass();
                    C1 = null;
                } else {
                    C1 = t3Var.C1(aVar);
                }
                if (C1 instanceof a6) {
                    a6 a6Var = (a6) C1;
                    a6Var.B();
                    a6Var.getEditText().setSelection(Math.min(this.d, a6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f18739b;
                a aVar2 = this.f18740c;
                if (aVar2 == null) {
                    t3Var2.getClass();
                    C12 = null;
                } else {
                    C12 = t3Var2.C1(aVar2);
                }
                if (C12 instanceof a6) {
                    a6 a6Var2 = (a6) C12;
                    a6Var2.B();
                    a6Var2.getEditText().setSelection(Math.min(this.d, a6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View C13 = this.f18739b.C1(this.f18740c);
                if (C13 instanceof a6) {
                    a6 a6Var3 = (a6) C13;
                    a6Var3.B();
                    a6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, a6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View C14 = this.f18739b.C1(this.f18740c);
                if (C14 instanceof a6) {
                    a6 a6Var4 = (a6) C14;
                    a6Var4.B();
                    a6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, a6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View C15 = this.f18739b.C1(this.f18740c);
                if (C15 instanceof a6) {
                    a6 a6Var5 = (a6) C15;
                    a6Var5.B();
                    a6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, a6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View C16 = this.f18739b.C1(this.f18740c);
                if (C16 instanceof a6) {
                    a6 a6Var6 = (a6) C16;
                    a6Var6.B();
                    a6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, a6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
