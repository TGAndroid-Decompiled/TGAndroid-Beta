package ei;

import android.view.View;
public final class b8 implements View.OnClickListener {
    public final int f8791a;
    public final j8 f8792b;

    public b8(j8 j8Var, int i10) {
        this.f8791a = i10;
        this.f8792b = j8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8791a) {
            case 0:
                this.f8792b.V();
                return;
            default:
                this.f8792b.Y();
                return;
        }
    }
}
