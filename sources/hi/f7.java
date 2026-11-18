package hi;

import android.view.View;
public final class f7 implements View.OnClickListener {
    public final int f14654a;
    public final l7 f14655b;

    public f7(l7 l7Var, int i7) {
        this.f14654a = i7;
        this.f14655b = l7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14654a) {
            case 0:
                this.f14655b.f1();
                return;
            default:
                this.f14655b.i1();
                return;
        }
    }
}
