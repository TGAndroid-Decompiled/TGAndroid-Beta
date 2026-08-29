package nh;

import android.view.View;
public final class p7 implements View.OnClickListener {
    public final int f18357a;
    public final y7 f18358b;

    public p7(y7 y7Var, int i10) {
        this.f18357a = i10;
        this.f18358b = y7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18357a) {
            case 0:
                this.f18358b.U();
                return;
            default:
                this.f18358b.X();
                return;
        }
    }
}
