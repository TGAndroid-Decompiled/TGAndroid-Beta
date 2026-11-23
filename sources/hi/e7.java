package hi;

import android.view.View;
public final class e7 implements View.OnClickListener {
    public final int f14598a;
    public final k7 f14599b;

    public e7(k7 k7Var, int i7) {
        this.f14598a = i7;
        this.f14599b = k7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14598a) {
            case 0:
                this.f14599b.f1();
                return;
            default:
                this.f14599b.i1();
                return;
        }
    }
}
