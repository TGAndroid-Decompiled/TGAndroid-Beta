package hi;

import android.view.View;
public final class e7 implements View.OnClickListener {
    public final int f14245a;
    public final l7 f14246b;

    public e7(l7 l7Var, int i7) {
        this.f14245a = i7;
        this.f14246b = l7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14245a) {
            case 0:
                this.f14246b.e1();
                return;
            default:
                this.f14246b.h1();
                return;
        }
    }
}
