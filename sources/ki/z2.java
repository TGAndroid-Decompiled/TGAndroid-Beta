package ki;

import android.view.View;
public final class z2 implements Runnable {
    public final int f15681a;
    public final w3 f15682b;
    public final a f15683c;

    public z2(w3 w3Var, a aVar, int i10) {
        this.f15681a = i10;
        this.f15682b = w3Var;
        this.f15683c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f15681a) {
            case 0:
                View A1 = this.f15682b.A1(this.f15683c);
                if (A1 instanceof c6) {
                    c6 c6Var = (c6) A1;
                    c6Var.B();
                    c6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f15682b.e3(this.f15683c);
                return;
            case 2:
                this.f15682b.e3(this.f15683c);
                return;
            case 3:
                this.f15682b.f3(this.f15683c);
                return;
            case 4:
                this.f15682b.e3(this.f15683c);
                return;
            default:
                this.f15682b.e3(this.f15683c);
                return;
        }
    }
}
