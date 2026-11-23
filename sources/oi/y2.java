package oi;

import android.view.View;
public final class y2 implements Runnable {
    public final int f22608a;
    public final t3 f22609b;
    public final a f22610c;

    public y2(t3 t3Var, a aVar, int i7) {
        this.f22608a = i7;
        this.f22609b = t3Var;
        this.f22610c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f22608a) {
            case 0:
                View C1 = this.f22609b.C1(this.f22610c);
                if (C1 instanceof a6) {
                    a6 a6Var = (a6) C1;
                    a6Var.B();
                    a6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f22609b.g3(this.f22610c);
                return;
            case 2:
                this.f22609b.g3(this.f22610c);
                return;
            case 3:
                this.f22609b.h3(this.f22610c);
                return;
            case 4:
                this.f22609b.g3(this.f22610c);
                return;
            default:
                this.f22609b.g3(this.f22610c);
                return;
        }
    }
}
