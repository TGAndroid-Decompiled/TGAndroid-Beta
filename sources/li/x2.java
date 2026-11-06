package li;

import android.view.View;
public final class x2 implements Runnable {
    public final int f18981a;
    public final t3 f18982b;
    public final a f18983c;

    public x2(t3 t3Var, a aVar, int i7) {
        this.f18981a = i7;
        this.f18982b = t3Var;
        this.f18983c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f18981a) {
            case 0:
                View C1 = this.f18982b.C1(this.f18983c);
                if (C1 instanceof a6) {
                    a6 a6Var = (a6) C1;
                    a6Var.B();
                    a6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f18982b.g3(this.f18983c);
                return;
            case 2:
                this.f18982b.g3(this.f18983c);
                return;
            case 3:
                this.f18982b.h3(this.f18983c);
                return;
            case 4:
                this.f18982b.g3(this.f18983c);
                return;
            default:
                this.f18982b.g3(this.f18983c);
                return;
        }
    }
}
