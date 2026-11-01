package mg;

import android.view.View;
public final class q1 implements View.OnClickListener {
    public final int f13213a;
    public final v1 f13214b;

    public q1(v1 v1Var, int i10) {
        this.f13213a = i10;
        this.f13214b = v1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f13213a) {
            case 0:
                v1 v1Var = this.f13214b;
                v1Var.W1.clear();
                v1Var.Q1.d.b(true);
                v1Var.n1(true, false);
                return;
            default:
                this.f13214b.i1(false);
                return;
        }
    }
}
