package cg;

import android.view.View;

public final class d2 implements View.OnClickListener {

    public final int f2654a;

    public final i2 f2655b;

    public d2(i2 i2Var, int i10) {
        this.f2654a = i10;
        this.f2655b = i2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2654a) {
            case 0:
                i2 i2Var = this.f2655b;
                i2Var.f2709a0.clear();
                i2Var.U.d.b(true);
                i2Var.b0(true, false);
                break;
            default:
                this.f2655b.W(false);
                break;
        }
    }
}
