package ci;

import android.view.View;
public final class l8 implements View.OnClickListener {
    public final int f5497a;
    public final t8 f5498b;

    public l8(t8 t8Var, int i10) {
        this.f5497a = i10;
        this.f5498b = t8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5497a) {
            case 0:
                this.f5498b.S();
                return;
            default:
                this.f5498b.W();
                return;
        }
    }
}
