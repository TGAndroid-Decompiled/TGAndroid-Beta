package ii;

import android.view.View;
public final class z2 implements Runnable {
    public final int f11800a;
    public final w3 f11801b;
    public final a f11802c;

    public z2(w3 w3Var, a aVar, int i10) {
        this.f11800a = i10;
        this.f11801b = w3Var;
        this.f11802c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f11800a) {
            case 0:
                View A1 = this.f11801b.A1(this.f11802c);
                if (A1 instanceof d6) {
                    d6 d6Var = (d6) A1;
                    d6Var.B();
                    d6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f11801b.e3(this.f11802c);
                return;
            case 2:
                this.f11801b.e3(this.f11802c);
                return;
            case 3:
                this.f11801b.f3(this.f11802c);
                return;
            case 4:
                this.f11801b.e3(this.f11802c);
                return;
            default:
                this.f11801b.e3(this.f11802c);
                return;
        }
    }
}
