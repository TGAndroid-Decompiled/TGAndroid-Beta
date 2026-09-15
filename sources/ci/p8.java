package ci;

import android.view.View;
public final class p8 implements View.OnClickListener {
    public final int f5306a;
    public final x8 f5307b;

    public p8(x8 x8Var, int i10) {
        this.f5306a = i10;
        this.f5307b = x8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5306a) {
            case 0:
                this.f5307b.U();
                return;
            default:
                this.f5307b.X();
                return;
        }
    }
}
