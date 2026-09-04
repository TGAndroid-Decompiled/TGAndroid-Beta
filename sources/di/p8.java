package di;

import android.view.View;
public final class p8 implements View.OnClickListener {
    public final int f7833a;
    public final x8 f7834b;

    public p8(x8 x8Var, int i10) {
        this.f7833a = i10;
        this.f7834b = x8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7833a) {
            case 0:
                this.f7834b.U();
                return;
            default:
                this.f7834b.X();
                return;
        }
    }
}
