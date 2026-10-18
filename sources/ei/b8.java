package ei;

import android.view.View;
public final class b8 implements View.OnClickListener {
    public final int f8794a;
    public final j8 f8795b;

    public b8(j8 j8Var, int i10) {
        this.f8794a = i10;
        this.f8795b = j8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8794a) {
            case 0:
                this.f8795b.V();
                return;
            default:
                this.f8795b.Y();
                return;
        }
    }
}
