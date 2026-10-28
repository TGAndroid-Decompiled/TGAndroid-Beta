package li;

import android.view.View;
public final class y2 implements Runnable {
    public final int f17643a;
    public final v3 f17644b;
    public final a f17645c;

    public y2(v3 v3Var, a aVar, int i10) {
        this.f17643a = i10;
        this.f17644b = v3Var;
        this.f17645c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f17643a) {
            case 0:
                View F1 = this.f17644b.F1(this.f17645c);
                if (F1 instanceof d6) {
                    d6 d6Var = (d6) F1;
                    d6Var.A();
                    d6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f17644b.j3(this.f17645c);
                return;
            case 2:
                this.f17644b.j3(this.f17645c);
                return;
            case 3:
                this.f17644b.k3(this.f17645c);
                return;
            case 4:
                this.f17644b.j3(this.f17645c);
                return;
            default:
                this.f17644b.j3(this.f17645c);
                return;
        }
    }
}
