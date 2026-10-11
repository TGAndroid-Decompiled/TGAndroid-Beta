package ii;

import android.view.View;
public final class a3 implements Runnable {
    public final int f12269a;
    public final x3 f12270b;
    public final a f12271c;

    public a3(x3 x3Var, a aVar, int i10) {
        this.f12269a = i10;
        this.f12270b = x3Var;
        this.f12271c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f12269a) {
            case 0:
                View A1 = this.f12270b.A1(this.f12271c);
                if (A1 instanceof f6) {
                    f6 f6Var = (f6) A1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f12270b.e3(this.f12271c);
                return;
            case 2:
                this.f12270b.e3(this.f12271c);
                return;
            case 3:
                this.f12270b.f3(this.f12271c);
                return;
            case 4:
                this.f12270b.e3(this.f12271c);
                return;
            default:
                this.f12270b.e3(this.f12271c);
                return;
        }
    }
}
