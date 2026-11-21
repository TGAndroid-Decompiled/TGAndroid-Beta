package hi;

import android.view.View;
public final class e7 implements View.OnClickListener {
    public final int f14595a;
    public final k7 f14596b;

    public e7(k7 k7Var, int i7) {
        this.f14595a = i7;
        this.f14596b = k7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14595a) {
            case 0:
                this.f14596b.f1();
                return;
            default:
                this.f14596b.i1();
                return;
        }
    }
}
