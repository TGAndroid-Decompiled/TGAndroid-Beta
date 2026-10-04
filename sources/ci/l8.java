package ci;

import android.view.View;
public final class l8 implements View.OnClickListener {
    public final int f5498a;
    public final t8 f5499b;

    public l8(t8 t8Var, int i10) {
        this.f5498a = i10;
        this.f5499b = t8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5498a) {
            case 0:
                this.f5499b.S();
                return;
            default:
                this.f5499b.W();
                return;
        }
    }
}
