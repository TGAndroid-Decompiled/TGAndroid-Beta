package hg;

import android.view.View;
public final class a2 implements View.OnClickListener {
    public final int f7393a;
    public final f2 f7394b;

    public a2(f2 f2Var, int i10) {
        this.f7393a = i10;
        this.f7394b = f2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7393a) {
            case 0:
                f2 f2Var = this.f7394b;
                f2Var.f7471b0.clear();
                f2Var.V.d.b(true);
                f2Var.b0(true, false);
                return;
            default:
                this.f7394b.W(false);
                return;
        }
    }
}
