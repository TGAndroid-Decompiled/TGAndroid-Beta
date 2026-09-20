package ci;

import android.view.View;
public final class p8 implements View.OnClickListener {
    public final int f5312a;
    public final x8 f5313b;

    public p8(x8 x8Var, int i10) {
        this.f5312a = i10;
        this.f5313b = x8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5312a) {
            case 0:
                this.f5313b.U();
                return;
            default:
                this.f5313b.X();
                return;
        }
    }
}
