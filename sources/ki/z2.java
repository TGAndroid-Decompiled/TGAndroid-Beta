package ki;

import android.view.View;
public final class z2 implements Runnable {
    public final int f15750a;
    public final w3 f15751b;
    public final a f15752c;

    public z2(w3 w3Var, a aVar, int i10) {
        this.f15750a = i10;
        this.f15751b = w3Var;
        this.f15752c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f15750a) {
            case 0:
                View F1 = this.f15751b.F1(this.f15752c);
                if (F1 instanceof c6) {
                    c6 c6Var = (c6) F1;
                    c6Var.A();
                    c6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f15751b.j3(this.f15752c);
                return;
            case 2:
                this.f15751b.j3(this.f15752c);
                return;
            case 3:
                this.f15751b.k3(this.f15752c);
                return;
            case 4:
                this.f15751b.j3(this.f15752c);
                return;
            default:
                this.f15751b.j3(this.f15752c);
                return;
        }
    }
}
