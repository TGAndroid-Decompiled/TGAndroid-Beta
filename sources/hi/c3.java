package hi;

import android.view.View;
public final class c3 implements Runnable {
    public final int f9498a;
    public final z3 f9499b;
    public final a f9500c;

    public c3(z3 z3Var, a aVar, int i10) {
        this.f9498a = i10;
        this.f9499b = z3Var;
        this.f9500c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f9498a) {
            case 0:
                View y12 = this.f9499b.y1(this.f9500c);
                if (y12 instanceof g6) {
                    g6 g6Var = (g6) y12;
                    g6Var.B();
                    g6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f9499b.c3(this.f9500c);
                return;
            case 2:
                this.f9499b.c3(this.f9500c);
                return;
            case 3:
                this.f9499b.d3(this.f9500c);
                return;
            case 4:
                this.f9499b.c3(this.f9500c);
                return;
            default:
                this.f9499b.c3(this.f9500c);
                return;
        }
    }
}
