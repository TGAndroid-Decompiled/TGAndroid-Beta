package ei;

import android.view.View;
public final class b8 implements View.OnClickListener {
    public final int f8800a;
    public final j8 f8801b;

    public b8(j8 j8Var, int i10) {
        this.f8800a = i10;
        this.f8801b = j8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8800a) {
            case 0:
                this.f8801b.U();
                return;
            default:
                this.f8801b.X();
                return;
        }
    }
}
