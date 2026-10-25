package li;

import android.view.View;
public final class o2 implements Runnable {
    public final int f17388a;
    public final v3 f17389b;
    public final a f17390c;
    public final int d;

    public o2(v3 v3Var, a aVar, int i10, int i11) {
        this.f17388a = i11;
        this.f17389b = v3Var;
        this.f17390c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View F1;
        View F12;
        switch (this.f17388a) {
            case 0:
                v3 v3Var = this.f17389b;
                a aVar = this.f17390c;
                if (aVar == null) {
                    v3Var.getClass();
                    F1 = null;
                } else {
                    F1 = v3Var.F1(aVar);
                }
                if (F1 instanceof d6) {
                    d6 d6Var = (d6) F1;
                    d6Var.A();
                    d6Var.getEditText().setSelection(Math.min(this.d, d6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f17389b;
                a aVar2 = this.f17390c;
                if (aVar2 == null) {
                    v3Var2.getClass();
                    F12 = null;
                } else {
                    F12 = v3Var2.F1(aVar2);
                }
                if (F12 instanceof d6) {
                    d6 d6Var2 = (d6) F12;
                    d6Var2.A();
                    d6Var2.getEditText().setSelection(Math.min(this.d, d6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View F13 = this.f17389b.F1(this.f17390c);
                if (F13 instanceof d6) {
                    d6 d6Var3 = (d6) F13;
                    d6Var3.A();
                    d6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View F14 = this.f17389b.F1(this.f17390c);
                if (F14 instanceof d6) {
                    d6 d6Var4 = (d6) F14;
                    d6Var4.A();
                    d6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View F15 = this.f17389b.F1(this.f17390c);
                if (F15 instanceof d6) {
                    d6 d6Var5 = (d6) F15;
                    d6Var5.A();
                    d6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View F16 = this.f17389b.F1(this.f17390c);
                if (F16 instanceof d6) {
                    d6 d6Var6 = (d6) F16;
                    d6Var6.A();
                    d6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, d6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
