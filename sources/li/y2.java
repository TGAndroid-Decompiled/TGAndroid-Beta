package li;

import android.view.View;
public final class y2 implements Runnable {
    public final int f17644a;
    public final v3 f17645b;
    public final a f17646c;

    public y2(v3 v3Var, a aVar, int i10) {
        this.f17644a = i10;
        this.f17645b = v3Var;
        this.f17646c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f17644a) {
            case 0:
                View F1 = this.f17645b.F1(this.f17646c);
                if (F1 instanceof d6) {
                    d6 d6Var = (d6) F1;
                    d6Var.A();
                    d6Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f17645b.j3(this.f17646c);
                return;
            case 2:
                this.f17645b.j3(this.f17646c);
                return;
            case 3:
                this.f17645b.k3(this.f17646c);
                return;
            case 4:
                this.f17645b.j3(this.f17646c);
                return;
            default:
                this.f17645b.j3(this.f17646c);
                return;
        }
    }
}
