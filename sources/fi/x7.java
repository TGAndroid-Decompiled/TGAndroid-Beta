package fi;

import android.view.View;
public final class x7 implements View.OnClickListener {
    public final int f11960a;
    public final f8 f11961b;

    public x7(f8 f8Var, int i10) {
        this.f11960a = i10;
        this.f11961b = f8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11960a) {
            case 0:
                this.f11961b.U();
                return;
            default:
                this.f11961b.X();
                return;
        }
    }
}
