package mi;

import android.view.View;
public final class y2 implements Runnable {
    public final int f20050a;
    public final t3 f20051b;
    public final a f20052c;

    public y2(t3 t3Var, a aVar, int i3) {
        this.f20050a = i3;
        this.f20051b = t3Var;
        this.f20052c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f20050a) {
            case 0:
                View C1 = this.f20051b.C1(this.f20052c);
                if (C1 instanceof b6) {
                    b6 b6Var = (b6) C1;
                    b6Var.B();
                    b6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f20051b.g3(this.f20052c);
                return;
            case 2:
                this.f20051b.g3(this.f20052c);
                return;
            case 3:
                this.f20051b.h3(this.f20052c);
                return;
            case 4:
                this.f20051b.g3(this.f20052c);
                return;
            default:
                this.f20051b.g3(this.f20052c);
                return;
        }
    }
}
