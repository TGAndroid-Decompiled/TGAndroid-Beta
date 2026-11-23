package hi;

import android.view.View;
public final class f7 implements View.OnClickListener {
    public final int f14607a;
    public final l7 f14608b;

    public f7(l7 l7Var, int i7) {
        this.f14607a = i7;
        this.f14608b = l7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14607a) {
            case 0:
                this.f14608b.f1();
                return;
            default:
                this.f14608b.i1();
                return;
        }
    }
}
