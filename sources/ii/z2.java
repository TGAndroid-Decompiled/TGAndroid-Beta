package ii;

import android.view.View;
public final class z2 implements Runnable {
    public final int f11798a;
    public final w3 f11799b;
    public final a f11800c;

    public z2(w3 w3Var, a aVar, int i10) {
        this.f11798a = i10;
        this.f11799b = w3Var;
        this.f11800c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f11798a) {
            case 0:
                View z12 = this.f11799b.z1(this.f11800c);
                if (z12 instanceof d6) {
                    d6 d6Var = (d6) z12;
                    d6Var.B();
                    d6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f11799b.d3(this.f11800c);
                return;
            case 2:
                this.f11799b.d3(this.f11800c);
                return;
            case 3:
                this.f11799b.e3(this.f11800c);
                return;
            case 4:
                this.f11799b.d3(this.f11800c);
                return;
            default:
                this.f11799b.d3(this.f11800c);
                return;
        }
    }
}
