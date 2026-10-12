package ji;

import android.view.View;
public final class a3 implements Runnable {
    public final int f13127a;
    public final x3 f13128b;
    public final a f13129c;

    public a3(x3 x3Var, a aVar, int i10) {
        this.f13127a = i10;
        this.f13128b = x3Var;
        this.f13129c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f13127a) {
            case 0:
                View A1 = this.f13128b.A1(this.f13129c);
                if (A1 instanceof i6) {
                    i6 i6Var = (i6) A1;
                    i6Var.B();
                    i6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f13128b.e3(this.f13129c);
                return;
            case 2:
                this.f13128b.e3(this.f13129c);
                return;
            case 3:
                this.f13128b.f3(this.f13129c);
                return;
            case 4:
                this.f13128b.e3(this.f13129c);
                return;
            default:
                this.f13128b.e3(this.f13129c);
                return;
        }
    }
}
