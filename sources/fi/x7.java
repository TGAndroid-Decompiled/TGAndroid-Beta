package fi;

import android.view.View;
public final class x7 implements View.OnClickListener {
    public final int f11959a;
    public final f8 f11960b;

    public x7(f8 f8Var, int i10) {
        this.f11959a = i10;
        this.f11960b = f8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11959a) {
            case 0:
                this.f11960b.U();
                return;
            default:
                this.f11960b.X();
                return;
        }
    }
}
