package hi;

import android.view.View;
public final class f7 implements View.OnClickListener {
    public final int f14657a;
    public final l7 f14658b;

    public f7(l7 l7Var, int i7) {
        this.f14657a = i7;
        this.f14658b = l7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14657a) {
            case 0:
                this.f14658b.f1();
                return;
            default:
                this.f14658b.i1();
                return;
        }
    }
}
