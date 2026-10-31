package mg;

import android.view.View;
public final class q1 implements View.OnClickListener {
    public final int f13212a;
    public final v1 f13213b;

    public q1(v1 v1Var, int i10) {
        this.f13212a = i10;
        this.f13213b = v1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f13212a) {
            case 0:
                v1 v1Var = this.f13213b;
                v1Var.W1.clear();
                v1Var.Q1.d.b(true);
                v1Var.n1(true, false);
                return;
            default:
                this.f13213b.i1(false);
                return;
        }
    }
}
