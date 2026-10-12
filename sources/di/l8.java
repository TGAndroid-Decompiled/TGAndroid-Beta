package di;

import android.view.View;
public final class l8 implements View.OnClickListener {
    public final int f7363a;
    public final t8 f7364b;

    public l8(t8 t8Var, int i10) {
        this.f7363a = i10;
        this.f7364b = t8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7363a) {
            case 0:
                this.f7364b.V();
                return;
            default:
                this.f7364b.Y();
                return;
        }
    }
}
