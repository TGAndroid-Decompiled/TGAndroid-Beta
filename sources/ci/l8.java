package ci;

import android.view.View;
public final class l8 implements View.OnClickListener {
    public final int f5103a;
    public final t8 f5104b;

    public l8(t8 t8Var, int i10) {
        this.f5103a = i10;
        this.f5104b = t8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5103a) {
            case 0:
                this.f5104b.U();
                return;
            default:
                this.f5104b.X();
                return;
        }
    }
}
