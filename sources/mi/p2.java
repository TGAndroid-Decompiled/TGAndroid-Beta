package mi;

import android.view.View;
public final class p2 implements Runnable {
    public final int f19802a;
    public final t3 f19803b;
    public final a f19804c;
    public final int d;

    public p2(t3 t3Var, a aVar, int i3, int i10) {
        this.f19802a = i10;
        this.f19803b = t3Var;
        this.f19804c = aVar;
        this.d = i3;
    }

    @Override
    public final void run() {
        View C1;
        View C12;
        switch (this.f19802a) {
            case 0:
                t3 t3Var = this.f19803b;
                a aVar = this.f19804c;
                if (aVar == null) {
                    t3Var.getClass();
                    C1 = null;
                } else {
                    C1 = t3Var.C1(aVar);
                }
                if (C1 instanceof b6) {
                    b6 b6Var = (b6) C1;
                    b6Var.B();
                    b6Var.getEditText().setSelection(Math.min(this.d, b6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                t3 t3Var2 = this.f19803b;
                a aVar2 = this.f19804c;
                if (aVar2 == null) {
                    t3Var2.getClass();
                    C12 = null;
                } else {
                    C12 = t3Var2.C1(aVar2);
                }
                if (C12 instanceof b6) {
                    b6 b6Var2 = (b6) C12;
                    b6Var2.B();
                    b6Var2.getEditText().setSelection(Math.min(this.d, b6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View C13 = this.f19803b.C1(this.f19804c);
                if (C13 instanceof b6) {
                    b6 b6Var3 = (b6) C13;
                    b6Var3.B();
                    b6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, b6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View C14 = this.f19803b.C1(this.f19804c);
                if (C14 instanceof b6) {
                    b6 b6Var4 = (b6) C14;
                    b6Var4.B();
                    b6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, b6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View C15 = this.f19803b.C1(this.f19804c);
                if (C15 instanceof b6) {
                    b6 b6Var5 = (b6) C15;
                    b6Var5.B();
                    b6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, b6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View C16 = this.f19803b.C1(this.f19804c);
                if (C16 instanceof b6) {
                    b6 b6Var6 = (b6) C16;
                    b6Var6.B();
                    b6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, b6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
