package ii;

import android.view.View;
public final class a3 implements Runnable {
    public final int f12270a;
    public final x3 f12271b;
    public final a f12272c;

    public a3(x3 x3Var, a aVar, int i10) {
        this.f12270a = i10;
        this.f12271b = x3Var;
        this.f12272c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f12270a) {
            case 0:
                View A1 = this.f12271b.A1(this.f12272c);
                if (A1 instanceof f6) {
                    f6 f6Var = (f6) A1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f12271b.e3(this.f12272c);
                return;
            case 2:
                this.f12271b.e3(this.f12272c);
                return;
            case 3:
                this.f12271b.f3(this.f12272c);
                return;
            case 4:
                this.f12271b.e3(this.f12272c);
                return;
            default:
                this.f12271b.e3(this.f12272c);
                return;
        }
    }
}
