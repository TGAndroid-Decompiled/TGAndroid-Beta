package oi;

import android.view.View;
public final class y2 implements Runnable {
    public final int f22538a;
    public final t3 f22539b;
    public final a f22540c;

    public y2(t3 t3Var, a aVar, int i7) {
        this.f22538a = i7;
        this.f22539b = t3Var;
        this.f22540c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f22538a) {
            case 0:
                View C1 = this.f22539b.C1(this.f22540c);
                if (C1 instanceof a6) {
                    a6 a6Var = (a6) C1;
                    a6Var.B();
                    a6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f22539b.g3(this.f22540c);
                return;
            case 2:
                this.f22539b.g3(this.f22540c);
                return;
            case 3:
                this.f22539b.h3(this.f22540c);
                return;
            case 4:
                this.f22539b.g3(this.f22540c);
                return;
            default:
                this.f22539b.g3(this.f22540c);
                return;
        }
    }
}
