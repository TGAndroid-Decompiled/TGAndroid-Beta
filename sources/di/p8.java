package di;

import android.view.View;
public final class p8 implements View.OnClickListener {
    public final int f7861a;
    public final x8 f7862b;

    public p8(x8 x8Var, int i10) {
        this.f7861a = i10;
        this.f7862b = x8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7861a) {
            case 0:
                this.f7862b.U();
                return;
            default:
                this.f7862b.X();
                return;
        }
    }
}
