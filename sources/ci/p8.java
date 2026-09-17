package ci;

import android.view.View;
public final class p8 implements View.OnClickListener {
    public final int f5311a;
    public final x8 f5312b;

    public p8(x8 x8Var, int i10) {
        this.f5311a = i10;
        this.f5312b = x8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5311a) {
            case 0:
                this.f5312b.U();
                return;
            default:
                this.f5312b.X();
                return;
        }
    }
}
