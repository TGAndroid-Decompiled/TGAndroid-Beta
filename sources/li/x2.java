package li;

import android.view.View;
public final class x2 implements Runnable {
    public final int f18989a;
    public final t3 f18990b;
    public final a f18991c;

    public x2(t3 t3Var, a aVar, int i7) {
        this.f18989a = i7;
        this.f18990b = t3Var;
        this.f18991c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f18989a) {
            case 0:
                View C1 = this.f18990b.C1(this.f18991c);
                if (C1 instanceof a6) {
                    a6 a6Var = (a6) C1;
                    a6Var.B();
                    a6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f18990b.g3(this.f18991c);
                return;
            case 2:
                this.f18990b.g3(this.f18991c);
                return;
            case 3:
                this.f18990b.h3(this.f18991c);
                return;
            case 4:
                this.f18990b.g3(this.f18991c);
                return;
            default:
                this.f18990b.g3(this.f18991c);
                return;
        }
    }
}
