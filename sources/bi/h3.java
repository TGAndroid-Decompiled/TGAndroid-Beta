package bi;

import android.view.View;
public final class h3 implements Runnable {
    public final int f3054a;
    public final d4 f3055b;
    public final a f3056c;

    public h3(d4 d4Var, a aVar, int i10) {
        this.f3054a = i10;
        this.f3055b = d4Var;
        this.f3056c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f3054a) {
            case 0:
                View C1 = this.f3055b.C1(this.f3056c);
                if (C1 instanceof q6) {
                    q6 q6Var = (q6) C1;
                    q6Var.B();
                    q6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f3055b.g3(this.f3056c);
                return;
            case 2:
                this.f3055b.g3(this.f3056c);
                return;
            case 3:
                this.f3055b.h3(this.f3056c);
                return;
            case 4:
                this.f3055b.g3(this.f3056c);
                return;
            default:
                this.f3055b.g3(this.f3056c);
                return;
        }
    }
}
