package gg;

import android.view.View;
public final class a2 implements View.OnClickListener {
    public final int f6542a;
    public final f2 f6543b;

    public a2(f2 f2Var, int i10) {
        this.f6542a = i10;
        this.f6543b = f2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6542a) {
            case 0:
                f2 f2Var = this.f6543b;
                f2Var.f6614b0.clear();
                f2Var.V.d.b(true);
                f2Var.b0(true, false);
                return;
            default:
                this.f6543b.W(false);
                return;
        }
    }
}
