package ji;

import android.view.View;
public final class a3 implements Runnable {
    public final int f13131a;
    public final x3 f13132b;
    public final a f13133c;

    public a3(x3 x3Var, a aVar, int i10) {
        this.f13131a = i10;
        this.f13132b = x3Var;
        this.f13133c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f13131a) {
            case 0:
                View A1 = this.f13132b.A1(this.f13133c);
                if (A1 instanceof i6) {
                    i6 i6Var = (i6) A1;
                    i6Var.B();
                    i6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f13132b.e3(this.f13133c);
                return;
            case 2:
                this.f13132b.e3(this.f13133c);
                return;
            case 3:
                this.f13132b.f3(this.f13133c);
                return;
            case 4:
                this.f13132b.e3(this.f13133c);
                return;
            default:
                this.f13132b.e3(this.f13133c);
                return;
        }
    }
}
