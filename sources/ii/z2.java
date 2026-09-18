package ii;

import android.view.View;
public final class z2 implements Runnable {
    public final int f11799a;
    public final w3 f11800b;
    public final a f11801c;

    public z2(w3 w3Var, a aVar, int i10) {
        this.f11799a = i10;
        this.f11800b = w3Var;
        this.f11801c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f11799a) {
            case 0:
                View A1 = this.f11800b.A1(this.f11801c);
                if (A1 instanceof d6) {
                    d6 d6Var = (d6) A1;
                    d6Var.B();
                    d6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f11800b.e3(this.f11801c);
                return;
            case 2:
                this.f11800b.e3(this.f11801c);
                return;
            case 3:
                this.f11800b.f3(this.f11801c);
                return;
            case 4:
                this.f11800b.e3(this.f11801c);
                return;
            default:
                this.f11800b.e3(this.f11801c);
                return;
        }
    }
}
