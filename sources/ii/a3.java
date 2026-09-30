package ii;

import android.view.View;
public final class a3 implements Runnable {
    public final int f11238a;
    public final x3 f11239b;
    public final a f11240c;

    public a3(x3 x3Var, a aVar, int i10) {
        this.f11238a = i10;
        this.f11239b = x3Var;
        this.f11240c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f11238a) {
            case 0:
                View B1 = this.f11239b.B1(this.f11240c);
                if (B1 instanceof e6) {
                    e6 e6Var = (e6) B1;
                    e6Var.B();
                    e6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f11239b.f3(this.f11240c);
                return;
            case 2:
                this.f11239b.f3(this.f11240c);
                return;
            case 3:
                this.f11239b.g3(this.f11240c);
                return;
            case 4:
                this.f11239b.f3(this.f11240c);
                return;
            default:
                this.f11239b.f3(this.f11240c);
                return;
        }
    }
}
