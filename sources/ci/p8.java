package ci;

import android.view.View;
public final class p8 implements View.OnClickListener {
    public final int f5310a;
    public final x8 f5311b;

    public p8(x8 x8Var, int i10) {
        this.f5310a = i10;
        this.f5311b = x8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5310a) {
            case 0:
                this.f5311b.U();
                return;
            default:
                this.f5311b.X();
                return;
        }
    }
}
