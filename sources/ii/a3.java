package ii;

import android.view.View;
public final class a3 implements Runnable {
    public final int f12223a;
    public final x3 f12224b;
    public final a f12225c;

    public a3(x3 x3Var, a aVar, int i10) {
        this.f12223a = i10;
        this.f12224b = x3Var;
        this.f12225c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f12223a) {
            case 0:
                View B1 = this.f12224b.B1(this.f12225c);
                if (B1 instanceof f6) {
                    f6 f6Var = (f6) B1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f12224b.f3(this.f12225c);
                return;
            case 2:
                this.f12224b.f3(this.f12225c);
                return;
            case 3:
                this.f12224b.g3(this.f12225c);
                return;
            case 4:
                this.f12224b.f3(this.f12225c);
                return;
            default:
                this.f12224b.f3(this.f12225c);
                return;
        }
    }
}
