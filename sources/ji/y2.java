package ji;

import android.view.View;
public final class y2 implements Runnable {
    public final int f14371a;
    public final v3 f14372b;
    public final a f14373c;

    public y2(v3 v3Var, a aVar, int i10) {
        this.f14371a = i10;
        this.f14372b = v3Var;
        this.f14373c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f14371a) {
            case 0:
                View y12 = this.f14372b.y1(this.f14373c);
                if (y12 instanceof g6) {
                    g6 g6Var = (g6) y12;
                    g6Var.B();
                    g6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f14372b.c3(this.f14373c);
                return;
            case 2:
                this.f14372b.c3(this.f14373c);
                return;
            case 3:
                this.f14372b.d3(this.f14373c);
                return;
            case 4:
                this.f14372b.c3(this.f14373c);
                return;
            default:
                this.f14372b.c3(this.f14373c);
                return;
        }
    }
}
