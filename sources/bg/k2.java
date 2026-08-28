package bg;

import android.view.View;
public final class k2 implements View.OnClickListener {
    public final int f1860a;
    public final q2 f1861b;

    public k2(q2 q2Var, int i9) {
        this.f1860a = i9;
        this.f1861b = q2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1860a) {
            case 0:
                q2 q2Var = this.f1861b;
                q2Var.f1923a0.clear();
                q2Var.U.d.b(true);
                q2Var.a0(true, false);
                return;
            default:
                this.f1861b.V(false);
                return;
        }
    }
}
