package ei;

import android.view.View;
public final class b8 implements View.OnClickListener {
    public final int f8793a;
    public final j8 f8794b;

    public b8(j8 j8Var, int i10) {
        this.f8793a = i10;
        this.f8794b = j8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8793a) {
            case 0:
                this.f8794b.V();
                return;
            default:
                this.f8794b.Y();
                return;
        }
    }
}
