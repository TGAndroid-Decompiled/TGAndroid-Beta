package lh;

import android.view.View;

public final class b8 implements View.OnClickListener {

    public final int f15690a;

    public final j8 f15691b;

    public b8(j8 j8Var, int i10) {
        this.f15690a = i10;
        this.f15691b = j8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f15690a) {
            case 0:
                this.f15691b.U();
                break;
            default:
                this.f15691b.X();
                break;
        }
    }
}
