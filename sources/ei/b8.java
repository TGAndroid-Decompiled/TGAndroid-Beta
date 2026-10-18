package ei;

import android.view.View;
public final class b8 implements View.OnClickListener {
    public final int f8792a;
    public final j8 f8793b;

    public b8(j8 j8Var, int i10) {
        this.f8792a = i10;
        this.f8793b = j8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8792a) {
            case 0:
                this.f8793b.V();
                return;
            default:
                this.f8793b.Y();
                return;
        }
    }
}
