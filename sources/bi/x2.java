package bi;

import android.view.View;
public final class x2 implements Runnable {
    public final int f3447a;
    public final d4 f3448b;
    public final a f3449c;
    public final int d;

    public x2(d4 d4Var, a aVar, int i10, int i11) {
        this.f3447a = i11;
        this.f3448b = d4Var;
        this.f3449c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View C1;
        View C12;
        switch (this.f3447a) {
            case 0:
                d4 d4Var = this.f3448b;
                a aVar = this.f3449c;
                if (aVar == null) {
                    d4Var.getClass();
                    C1 = null;
                } else {
                    C1 = d4Var.C1(aVar);
                }
                if (C1 instanceof q6) {
                    q6 q6Var = (q6) C1;
                    q6Var.B();
                    q6Var.getEditText().setSelection(Math.min(this.d, q6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                d4 d4Var2 = this.f3448b;
                a aVar2 = this.f3449c;
                if (aVar2 == null) {
                    d4Var2.getClass();
                    C12 = null;
                } else {
                    C12 = d4Var2.C1(aVar2);
                }
                if (C12 instanceof q6) {
                    q6 q6Var2 = (q6) C12;
                    q6Var2.B();
                    q6Var2.getEditText().setSelection(Math.min(this.d, q6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View C13 = this.f3448b.C1(this.f3449c);
                if (C13 instanceof q6) {
                    q6 q6Var3 = (q6) C13;
                    q6Var3.B();
                    q6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, q6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View C14 = this.f3448b.C1(this.f3449c);
                if (C14 instanceof q6) {
                    q6 q6Var4 = (q6) C14;
                    q6Var4.B();
                    q6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, q6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View C15 = this.f3448b.C1(this.f3449c);
                if (C15 instanceof q6) {
                    q6 q6Var5 = (q6) C15;
                    q6Var5.B();
                    q6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, q6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View C16 = this.f3448b.C1(this.f3449c);
                if (C16 instanceof q6) {
                    q6 q6Var6 = (q6) C16;
                    q6Var6.B();
                    q6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, q6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
