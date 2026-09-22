package ci;

import android.view.View;
public final class p8 implements View.OnClickListener {
    public final int f5308a;
    public final x8 f5309b;

    public p8(x8 x8Var, int i10) {
        this.f5308a = i10;
        this.f5309b = x8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5308a) {
            case 0:
                this.f5309b.U();
                return;
            default:
                this.f5309b.X();
                return;
        }
    }
}
