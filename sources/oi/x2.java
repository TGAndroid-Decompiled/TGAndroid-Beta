package oi;

import android.view.View;
public final class x2 implements Runnable {
    public final int f22452a;
    public final s3 f22453b;
    public final a f22454c;

    public x2(s3 s3Var, a aVar, int i7) {
        this.f22452a = i7;
        this.f22453b = s3Var;
        this.f22454c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f22452a) {
            case 0:
                View C1 = this.f22453b.C1(this.f22454c);
                if (C1 instanceof z5) {
                    z5 z5Var = (z5) C1;
                    z5Var.B();
                    z5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f22453b.g3(this.f22454c);
                return;
            case 2:
                this.f22453b.g3(this.f22454c);
                return;
            case 3:
                this.f22453b.h3(this.f22454c);
                return;
            case 4:
                this.f22453b.g3(this.f22454c);
                return;
            default:
                this.f22453b.g3(this.f22454c);
                return;
        }
    }
}
