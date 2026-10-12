package ii;

import android.view.View;
public final class a3 implements Runnable {
    public final int f12268a;
    public final x3 f12269b;
    public final a f12270c;

    public a3(x3 x3Var, a aVar, int i10) {
        this.f12268a = i10;
        this.f12269b = x3Var;
        this.f12270c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f12268a) {
            case 0:
                View A1 = this.f12269b.A1(this.f12270c);
                if (A1 instanceof e6) {
                    e6 e6Var = (e6) A1;
                    e6Var.B();
                    e6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f12269b.e3(this.f12270c);
                return;
            case 2:
                this.f12269b.e3(this.f12270c);
                return;
            case 3:
                this.f12269b.f3(this.f12270c);
                return;
            case 4:
                this.f12269b.e3(this.f12270c);
                return;
            default:
                this.f12269b.e3(this.f12270c);
                return;
        }
    }
}
