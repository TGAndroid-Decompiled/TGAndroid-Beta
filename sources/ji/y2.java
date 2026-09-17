package ji;

import android.view.View;
public final class y2 implements Runnable {
    public final int f14345a;
    public final v3 f14346b;
    public final a f14347c;

    public y2(v3 v3Var, a aVar, int i10) {
        this.f14345a = i10;
        this.f14346b = v3Var;
        this.f14347c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f14345a) {
            case 0:
                View y12 = this.f14346b.y1(this.f14347c);
                if (y12 instanceof g6) {
                    g6 g6Var = (g6) y12;
                    g6Var.B();
                    g6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f14346b.c3(this.f14347c);
                return;
            case 2:
                this.f14346b.c3(this.f14347c);
                return;
            case 3:
                this.f14346b.d3(this.f14347c);
                return;
            case 4:
                this.f14346b.c3(this.f14347c);
                return;
            default:
                this.f14346b.c3(this.f14347c);
                return;
        }
    }
}
