package ji;

import android.view.View;
public final class p2 implements Runnable {
    public final int f14109a;
    public final v3 f14110b;
    public final a f14111c;
    public final int d;

    public p2(v3 v3Var, a aVar, int i10, int i11) {
        this.f14109a = i11;
        this.f14110b = v3Var;
        this.f14111c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View y12;
        View y13;
        switch (this.f14109a) {
            case 0:
                v3 v3Var = this.f14110b;
                a aVar = this.f14111c;
                if (aVar == null) {
                    v3Var.getClass();
                    y12 = null;
                } else {
                    y12 = v3Var.y1(aVar);
                }
                if (y12 instanceof g6) {
                    g6 g6Var = (g6) y12;
                    g6Var.B();
                    g6Var.getEditText().setSelection(Math.min(this.d, g6Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                v3 v3Var2 = this.f14110b;
                a aVar2 = this.f14111c;
                if (aVar2 == null) {
                    v3Var2.getClass();
                    y13 = null;
                } else {
                    y13 = v3Var2.y1(aVar2);
                }
                if (y13 instanceof g6) {
                    g6 g6Var2 = (g6) y13;
                    g6Var2.B();
                    g6Var2.getEditText().setSelection(Math.min(this.d, g6Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View y14 = this.f14110b.y1(this.f14111c);
                if (y14 instanceof g6) {
                    g6 g6Var3 = (g6) y14;
                    g6Var3.B();
                    g6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, g6Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View y15 = this.f14110b.y1(this.f14111c);
                if (y15 instanceof g6) {
                    g6 g6Var4 = (g6) y15;
                    g6Var4.B();
                    g6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, g6Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View y16 = this.f14110b.y1(this.f14111c);
                if (y16 instanceof g6) {
                    g6 g6Var5 = (g6) y16;
                    g6Var5.B();
                    g6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, g6Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View y17 = this.f14110b.y1(this.f14111c);
                if (y17 instanceof g6) {
                    g6 g6Var6 = (g6) y17;
                    g6Var6.B();
                    g6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, g6Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
