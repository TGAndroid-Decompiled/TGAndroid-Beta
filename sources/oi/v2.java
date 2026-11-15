package oi;

import android.view.View;
public final class v2 implements Runnable {
    public final int f22054a;
    public final q3 f22055b;
    public final a f22056c;

    public v2(q3 q3Var, a aVar, int i7) {
        this.f22054a = i7;
        this.f22055b = q3Var;
        this.f22056c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f22054a) {
            case 0:
                View C1 = this.f22055b.C1(this.f22056c);
                if (C1 instanceof y5) {
                    y5 y5Var = (y5) C1;
                    y5Var.B();
                    y5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f22055b.g3(this.f22056c);
                return;
            case 2:
                this.f22055b.g3(this.f22056c);
                return;
            case 3:
                this.f22055b.h3(this.f22056c);
                return;
            case 4:
                this.f22055b.g3(this.f22056c);
                return;
            default:
                this.f22055b.g3(this.f22056c);
                return;
        }
    }
}
