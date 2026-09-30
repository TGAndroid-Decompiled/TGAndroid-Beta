package ii;

import android.view.View;
public final class a3 implements Runnable {
    public final int f11224a;
    public final x3 f11225b;
    public final a f11226c;

    public a3(x3 x3Var, a aVar, int i10) {
        this.f11224a = i10;
        this.f11225b = x3Var;
        this.f11226c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f11224a) {
            case 0:
                View z12 = this.f11225b.z1(this.f11226c);
                if (z12 instanceof e6) {
                    e6 e6Var = (e6) z12;
                    e6Var.B();
                    e6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f11225b.d3(this.f11226c);
                return;
            case 2:
                this.f11225b.d3(this.f11226c);
                return;
            case 3:
                this.f11225b.e3(this.f11226c);
                return;
            case 4:
                this.f11225b.d3(this.f11226c);
                return;
            default:
                this.f11225b.d3(this.f11226c);
                return;
        }
    }
}
