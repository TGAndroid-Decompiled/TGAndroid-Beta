package ii;

import android.view.View;
public final class a3 implements Runnable {
    public final int f12222a;
    public final x3 f12223b;
    public final a f12224c;

    public a3(x3 x3Var, a aVar, int i10) {
        this.f12222a = i10;
        this.f12223b = x3Var;
        this.f12224c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f12222a) {
            case 0:
                View B1 = this.f12223b.B1(this.f12224c);
                if (B1 instanceof f6) {
                    f6 f6Var = (f6) B1;
                    f6Var.B();
                    f6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f12223b.f3(this.f12224c);
                return;
            case 2:
                this.f12223b.f3(this.f12224c);
                return;
            case 3:
                this.f12223b.g3(this.f12224c);
                return;
            case 4:
                this.f12223b.f3(this.f12224c);
                return;
            default:
                this.f12223b.f3(this.f12224c);
                return;
        }
    }
}
