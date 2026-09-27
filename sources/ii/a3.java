package ii;

import android.view.View;
public final class a3 implements Runnable {
    public final int f11227a;
    public final x3 f11228b;
    public final a f11229c;

    public a3(x3 x3Var, a aVar, int i10) {
        this.f11227a = i10;
        this.f11228b = x3Var;
        this.f11229c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f11227a) {
            case 0:
                View A1 = this.f11228b.A1(this.f11229c);
                if (A1 instanceof e6) {
                    e6 e6Var = (e6) A1;
                    e6Var.B();
                    e6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f11228b.e3(this.f11229c);
                return;
            case 2:
                this.f11228b.e3(this.f11229c);
                return;
            case 3:
                this.f11228b.f3(this.f11229c);
                return;
            case 4:
                this.f11228b.e3(this.f11229c);
                return;
            default:
                this.f11228b.e3(this.f11229c);
                return;
        }
    }
}
